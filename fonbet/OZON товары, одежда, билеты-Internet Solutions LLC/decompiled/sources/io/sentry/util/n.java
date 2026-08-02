package io.sentry.util;

import io.sentry.I2;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n {
    public static void a(@NotNull Class<?> cls, Object obj, @NotNull ILogger iLogger) {
        iLogger.c(I2.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
