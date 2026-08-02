package com.mbridge.msdk.tracker.network;

import com.ironsource.U3;
import defpackage.mz1;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c0 {
    public static String a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.c0";

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder r = mz1.r(substring.substring(substring.lastIndexOf(36) + 1), ".");
                r.append(stackTrace[i].getMethodName());
                str2 = r.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(U3.j.d);
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return mz1.o(sb, ": ", str);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void d(String str, Object... objArr) {
    }

    public static void a(Throwable th, String str, Object... objArr) {
        a(str, objArr);
    }
}
