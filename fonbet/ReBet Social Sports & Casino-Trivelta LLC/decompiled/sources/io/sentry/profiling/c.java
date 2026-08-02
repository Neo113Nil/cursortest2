package io.sentry.profiling;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4725b0;
import io.sentry.InterfaceC4760i0;
import io.sentry.P0;
import io.sentry.Q;
import io.sentry.V0;
import io.sentry.X1;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public abstract class c {
    public static Q a(ILogger iLogger, String str, int i10, InterfaceC4760i0 interfaceC4760i0) {
        try {
            android.support.v4.media.session.b.a(c(a.class));
            iLogger.c(EnumC4788n3.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return P0.g();
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return P0.g();
        }
    }

    public static InterfaceC4725b0 b() {
        ILogger logger = X1.D().p().i().getLogger();
        try {
            android.support.v4.media.session.b.a(c(b.class));
            logger.c(EnumC4788n3.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            return V0.b();
        } catch (Throwable th2) {
            logger.b(EnumC4788n3.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            return V0.b();
        }
    }

    public static Object c(Class cls) {
        Iterator it = ServiceLoader.load(cls).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
