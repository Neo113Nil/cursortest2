package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.wt3;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaue {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = zzaue.class.getName();

    public static void a(String str, Object... objArr) {
        if (a) {
            b(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                wt3.A(substring2, ".", new StringBuilder(substring2.length() + 1 + String.valueOf(methodName).length()), methodName);
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        Thread.currentThread().getId();
    }
}
