package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public abstract class Y1 {
    public static InterfaceC4745f0 a(io.sentry.util.s sVar, ILogger iLogger) {
        InterfaceC4745f0 b10 = b(sVar, iLogger);
        b10.a();
        return b10;
    }

    public static InterfaceC4745f0 b(io.sentry.util.s sVar, ILogger iLogger) {
        Class g10;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (g10 = sVar.g("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object newInstance = g10.getDeclaredConstructor(null).newInstance(null);
                if (newInstance instanceof InterfaceC4745f0) {
                    return (InterfaceC4745f0) newInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C4794p();
    }
}
