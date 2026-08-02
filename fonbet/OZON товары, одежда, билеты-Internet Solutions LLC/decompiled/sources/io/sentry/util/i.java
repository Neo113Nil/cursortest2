package io.sentry.util;

import io.sentry.A0;
import io.sentry.C7127b1;
import io.sentry.F0;
import io.sentry.I2;
import io.sentry.K;
import io.sentry.K0;
import io.sentry.T;
import io.sentry.W2;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i {
    private static String a(@NotNull W2 w22) {
        String profilingTracesDirPath = w22.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            w22.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static void b(@NotNull W2 w22) {
        if (r.f68593a || !w22.isContinuousProfilingEnabled() || !(w22.getProfilerConverter() instanceof K0)) {
            w22.getProfilerConverter();
            return;
        }
        T b11 = io.sentry.profiling.c.b();
        if (b11 instanceof K0) {
            w22.getLogger().c(I2.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            w22.setProfilerConverter(b11);
            w22.getLogger().c(I2.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        w22.getProfilerConverter();
    }

    public static void c(@NotNull W2 w22) {
        if (r.f68593a || !w22.isContinuousProfilingEnabled() || !(w22.getContinuousProfiler() instanceof F0)) {
            w22.getContinuousProfiler();
            return;
        }
        try {
            K a11 = io.sentry.profiling.c.a(w22.getLogger(), a(w22), w22.getProfilingTracesHz(), w22.getExecutorService());
            if (a11 instanceof F0) {
                w22.getLogger().c(I2.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                w22.setContinuousProfiler(a11);
                w22.getLogger().c(I2.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e11) {
            w22.getLogger().a(I2.ERROR, "Failed to create default profiling traces directory", e11);
        }
        w22.getContinuousProfiler();
    }

    public static boolean d(W2 w22, @NotNull W2 w23, boolean z11) {
        boolean z12 = r.f68593a;
        if (!z12 && (w23.getVersionDetector() instanceof C7127b1)) {
            w23.setVersionDetector(new A0(w23));
        }
        if (!w23.getVersionDetector().a()) {
            return !z11 || w22 == null || w23.isForceInit() || w22.getInitPriority().ordinal() <= w23.getInitPriority().ordinal();
        }
        w23.getLogger().c(I2.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(B0.A0.b("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z12 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }
}
