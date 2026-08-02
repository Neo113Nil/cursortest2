package com.mbridge.msdk.tracker.network;

import android.util.Log;
import com.ironsource.X3;
import java.util.Locale;
import xsna.ho8;
import xsna.i5s;

/* compiled from: VolleyLog.java */
/* loaded from: classes14.dex */
public class c0 {
    public static String a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(a, a(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, a(str, objArr));
    }

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
                StringBuilder b2 = ho8.b(substring.substring(substring.lastIndexOf(36) + 1), ".");
                b2.append(stackTrace[i].getMethodName());
                str2 = b2.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return i5s.a(sb, ": ", str);
    }

    public static void d(String str, Object... objArr) {
    }
}
