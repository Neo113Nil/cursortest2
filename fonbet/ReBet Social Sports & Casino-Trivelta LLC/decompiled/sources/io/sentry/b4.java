package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public abstract class b4 {
    public static InterfaceC4785n0 a(io.sentry.util.s sVar, ILogger iLogger) {
        Class g10;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (g10 = sVar.g("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object newInstance = g10.getDeclaredConstructor(null).newInstance(null);
                if (newInstance instanceof InterfaceC4785n0) {
                    return (InterfaceC4785n0) newInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C4807q();
    }
}
