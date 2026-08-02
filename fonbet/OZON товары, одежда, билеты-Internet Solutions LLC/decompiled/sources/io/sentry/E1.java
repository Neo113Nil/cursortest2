package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface E1 {
    static boolean a(String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(I2.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    D1 b(@NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions);
}
