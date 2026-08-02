package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeh {
    public static final Object a = new Object();

    public static void a(String str) {
        synchronized (a) {
            g(str, null);
        }
    }

    public static void b(String str) {
        synchronized (a) {
            g(str, null);
        }
    }

    public static void c(String str) {
        synchronized (a) {
            g(str, null);
        }
    }

    public static void d(String str, Throwable th) {
        synchronized (a) {
            g(str, th);
        }
    }

    public static void e(String str) {
        synchronized (a) {
            g(str, null);
        }
    }

    public static void f(String str, Throwable th) {
        synchronized (a) {
            g(str, th);
        }
    }

    public static void g(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return;
        }
        String replace2 = replace.replace("\n", "\n  ");
        int length = str.length();
        new StringBuilder(String.valueOf(replace2).length() + length + 3 + 1);
    }
}
