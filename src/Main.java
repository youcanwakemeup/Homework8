import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] threeNums = new int[] {1, 2, 3};
        double [] threeFractionalNums = {1.57, 7.654, 9.986};
        int [] randomNums = new int[] {1, 2, 3 , 4, 5, 6, 7};
    }
    public static void task2 () {
        System.out.println("Задача 2"); // массивы взяты с первого задания
        int [] threeNums = new int[] {1, 2, 3};
        double [] threeFractionalNums = {1.57, 7.654, 9.986};
        int [] randomNums = new int[] {1, 2, 3 , 4};
        for (int i = 0; i < threeNums.length; i++) {
            if (i == threeNums.length - 1) {
                System.out.println(threeNums[i]);
            }
            else {
                System.out.print(threeNums[i] + ", ");
            }
        }
        for (int i = 0; i < threeFractionalNums.length; i++) {
            if (i == threeFractionalNums.length - 1) {
                System.out.println(threeFractionalNums[i]);
            }
            else {
                System.out.print(threeFractionalNums[i] + ", ");
            }
        }
        for (int i = 0; i < randomNums.length; i++) {
            if (i == randomNums.length - 1) {
                System.out.println(randomNums[i]);
            }
            else {
                System.out.print(randomNums[i] + ", ");
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] threeNums = new int[] {1, 2, 3};
        double [] threeFractionalNums = {1.57, 7.654, 9.986};
        int [] randomNums = new int[] {1, 2, 3 , 4};
        for (int i = threeNums.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(threeNums[i]);
            }
            else {
                System.out.print(threeNums[i] + ", ");
            }
        }
        for (int i = threeFractionalNums.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(threeFractionalNums[i]);
            }
            else {
                System.out.print(threeFractionalNums[i] + ", ");
            }
        }
        for (int i = randomNums.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(randomNums[i]);
            }
            else {
                System.out.print(randomNums[i] + ", ");
            }
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] threeNums = new int[] {1, 2, 3};
        for (int i = 0; i < threeNums.length; i++) {
            if (threeNums[i] % 2 == 1) {
                threeNums[i]++;
            }
        }
        System.out.println(Arrays.toString(threeNums));
    }
}