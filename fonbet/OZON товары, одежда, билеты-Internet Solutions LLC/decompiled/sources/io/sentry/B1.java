package io.sentry;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B1 {
    @NotNull
    public static X a(@NotNull io.sentry.util.m mVar, @NotNull J0 j02) {
        Class c11;
        if (io.sentry.util.r.c() && io.sentry.util.m.b("io.sentry.opentelemetry.OtelContextScopesStorage", j02) && (c11 = io.sentry.util.m.c("io.sentry.opentelemetry.OtelContextScopesStorage", j02)) != null) {
            try {
                Object newInstance = c11.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance != null && (newInstance instanceof X)) {
                    return (X) newInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C7177o();
    }
}
