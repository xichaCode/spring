package com.project;

/**
 * @program: spring
 * @description: 日志案例
 * @author: He.Jian-hj
 * @create: 2021-06-16 00:33
 **/

public class DemoLog {
    public static void showLog(int level,String mesg){
        if(level == 1){
            System.out.println(mesg);
        }
    }

    public static void main(String[] args){
        String msg = "hello";
        String msgDesc = "the";
        String messResult = "word";
        showLog(1,msg+msgDesc+messResult);
    }
}
