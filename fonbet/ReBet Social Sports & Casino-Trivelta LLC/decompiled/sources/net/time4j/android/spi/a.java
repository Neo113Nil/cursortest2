package net.time4j.android.spi;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import li.AbstractC5469c;
import qi.InterfaceC6184e;

/* loaded from: classes5.dex */
public class a implements InterfaceC6184e {
    private static final Object[] EMPTY_ARGS;
    private static final Class[] EMPTY_PARAMS;

    /* renamed from: a, reason: collision with root package name */
    public static final Method f57722a;

    static {
        Class[] clsArr = new Class[0];
        EMPTY_PARAMS = clsArr;
        Object[] objArr = new Object[0];
        EMPTY_ARGS = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f57722a = method;
    }

    @Override // qi.InterfaceC6184e
    public String a() {
        return "Dalvik";
    }

    @Override // qi.InterfaceC6184e
    public long getNanos() {
        Method method = f57722a;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, EMPTY_ARGS)).longValue();
            } catch (IllegalAccessException e10) {
                e10.printStackTrace(System.err);
            } catch (InvocationTargetException e11) {
                e11.printStackTrace(System.err);
            }
        }
        return AbstractC5469c.i(SystemClock.elapsedRealtime(), 1000000L);
    }
}
