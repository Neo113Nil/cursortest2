package com.my.tracker.obfuscated;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class x2 {
    private static volatile boolean a = false;

    public static void a(String str) {
    }

    public static void b(String str) {
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void a(String str, Throwable th) {
    }

    public static boolean a() {
        return a;
    }

    public static void b(String str, Throwable th) {
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    public static void c(String str) {
    }
}
