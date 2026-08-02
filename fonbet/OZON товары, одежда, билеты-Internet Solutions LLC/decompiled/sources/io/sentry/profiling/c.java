package io.sentry.profiling;

import io.sentry.F0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.K;
import io.sentry.K0;
import io.sentry.K1;
import io.sentry.T;
import io.sentry.Z;
import java.util.Iterator;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {
    @NotNull
    public static K a(ILogger iLogger, String str, int i11, Z z11) {
        try {
            Iterator it = ServiceLoader.load(a.class).iterator();
            a aVar = (a) (it.hasNext() ? it.next() : null);
            if (aVar != null) {
                iLogger.c(I2.DEBUG, "Loaded continuous profiler from provider: %s", aVar.getClass().getName());
                return aVar.a();
            }
            iLogger.c(I2.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return F0.f();
        } catch (Throwable th2) {
            iLogger.a(I2.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return F0.f();
        }
    }

    @NotNull
    public static T b() {
        ILogger logger = K1.e().getOptions().getLogger();
        try {
            Iterator it = ServiceLoader.load(b.class).iterator();
            b bVar = (b) (it.hasNext() ? it.next() : null);
            if (bVar != null) {
                logger.c(I2.DEBUG, "Loaded profile converter from provider: %s", bVar.getClass().getName());
                return bVar.a();
            }
            logger.c(I2.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            return K0.a();
        } catch (Throwable th2) {
            logger.a(I2.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            return K0.a();
        }
    }
}
