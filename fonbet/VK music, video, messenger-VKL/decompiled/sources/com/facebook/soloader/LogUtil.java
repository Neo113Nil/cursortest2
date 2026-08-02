package com.facebook.soloader;

import android.util.Log;

/* loaded from: classes12.dex */
public class LogUtil {
    private LogUtil() {
    }

    public static void d(String str, String str2, Throwable th) {
        isLoggable(str, 3);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        isLoggable(str, 4);
    }

    private static boolean isLoggable(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static void v(String str, String str2, Throwable th) {
        isLoggable(str, 2);
    }

    public static void w(String str, String str2) {
    }

    public static void d(String str, String str2) {
        isLoggable(str, 3);
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void i(String str, String str2) {
        isLoggable(str, 4);
    }

    public static void v(String str, String str2) {
        isLoggable(str, 2);
    }

    public static void w(String str, String str2, Throwable th) {
    }
}
