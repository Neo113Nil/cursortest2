package com.moloco.sdk.acm.services;

import android.app.Application;
import android.os.Build;
import com.ironsource.U3;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.pdk;
import defpackage.ph0;
import defpackage.xw3;
import defpackage.ypa;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public static final mqi a = ypa.b(new com.appsflyer.c(8));
    public static final String b;
    public static final ArrayList c;
    public static final boolean d;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L11;
     */
    static {
        String str;
        String str2 = "unknown";
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                str2 = Application.getProcessName();
            } catch (Throwable unused) {
            }
        }
        b = str2;
        c = new ArrayList();
        String str3 = null;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "debug.moloco.enable_logs");
            invoke.getClass();
            str = (String) invoke;
        } catch (Exception unused2) {
        }
        str3 = str;
        d = Boolean.parseBoolean(str3);
        d = Boolean.parseBoolean(str3);
    }

    public static String a(String str) {
        try {
            return U3.j.d + e() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void b(String str, String str2) {
        if (d) {
            d(f(str), a(str2));
        }
    }

    public static void c(String str, String str2, int i) {
        str.getClass();
        if (d) {
            d(f(str), a(str2));
        }
    }

    public static void d(String str, String str2) {
        ku3 ku3Var = (ku3) a.getValue();
        if (ku3Var != null) {
            xw3.L(ku3Var, null, null, new pdk(str, str2, null, 12), 3);
        }
    }

    public static String e() {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = (StackTraceElement) ph0.z(stackTrace);
                break;
            }
            stackTraceElement = stackTrace[i];
            if (!Intrinsics.c(stackTraceElement.getClassName(), c.class.getCanonicalName())) {
                break;
            }
            i++;
        }
        String className = stackTraceElement.getClassName();
        stackTraceElement.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElement.getMethodName();
        if (Intrinsics.c(methodName, "invokeSuspend")) {
            String className2 = stackTraceElement.getClassName();
            className2.getClass();
            methodName = StringsKt.f0(StringsKt.W(className2, "$1"), "$");
        }
        methodName.getClass();
        return methodName;
    }

    public static String f(String str) {
        return kotlin.text.c.v(str, "ACM", false) ? str : "ACM".concat(str);
    }

    public static void g(String str, String str2) {
        if (d) {
            d(f(str), a(str2));
        }
    }

    public static void h(String str, String str2, int i) {
        if (d) {
            d(f(str), a(str2));
        }
    }
}
