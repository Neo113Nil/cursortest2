package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class IAlog {
    public static int a = 4;
    public static final com.fyber.inneractive.sdk.logger.a b = new com.fyber.inneractive.sdk.logger.a();
    public static final x0 c = new x0();

    public static String a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + U3.j.d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static void b(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void f(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static String a(Class cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + U3.j.d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
