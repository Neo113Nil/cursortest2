package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzgvg {
    public static final Object a;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0084, IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0084, IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0084, TryCatch #2 {IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0084, blocks: (B:18:0x0053, B:24:0x0074, B:24:0x0074, B:24:0x0074, B:28:0x0063, B:28:0x0063, B:28:0x0063, B:30:0x0081, B:30:0x0081, B:30:0x0081, B:31:0x0083, B:31:0x0083, B:31:0x0083), top: B:17:0x0053 }] */
    static {
        boolean equals;
        Object obj;
        boolean equals2;
        Error error;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            if (equals) {
                throw th;
            }
            obj = null;
        }
        a = obj;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } finally {
                if (equals2) {
                }
            }
        }
        if (obj == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } finally {
                if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
                    Error error2 = th;
                }
                if (method != null) {
                }
            }
            if (method != null) {
                return;
            }
            method.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
