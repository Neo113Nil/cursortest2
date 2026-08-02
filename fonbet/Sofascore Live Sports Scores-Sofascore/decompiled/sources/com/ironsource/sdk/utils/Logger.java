package com.ironsource.sdk.utils;

import android.text.TextUtils;
import com.ironsource.C4197m8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Logger {
    private static boolean a;

    public static void enableLogging(int i) {
        a = C4197m8.d.MODE_0.b() != i;
    }

    public static void i(String str, String str2, Throwable th) {
        if (a) {
            TextUtils.isEmpty(str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    public static void i(String str, String str2) {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }
}
