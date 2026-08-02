package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4492p8;

/* loaded from: classes13.dex */
public class Logger {
    private static boolean a;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
        if (a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i) {
        a = C4492p8.d.MODE_0.b() != i;
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void i(String str, String str2, Throwable th) {
        if (a) {
            TextUtils.isEmpty(str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
        if (a) {
            Log.e(str, str2, th);
        }
    }
}
