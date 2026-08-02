package io.sentry.util;

import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.W2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m {
    public static boolean a(W2 w22, @NotNull String str) {
        return b(str, w22 != null ? w22.getLogger() : null);
    }

    public static boolean b(@NotNull String str, ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public static Class c(@NotNull String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(I2.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(I2.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e11);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(I2.ERROR, "Failed to initialize ".concat(str), th2);
            return null;
        }
    }
}
