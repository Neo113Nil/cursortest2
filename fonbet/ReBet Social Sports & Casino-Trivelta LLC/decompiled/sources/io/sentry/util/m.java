package io.sentry.util;

import io.sentry.C4796p1;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4725b0;
import io.sentry.J0;
import io.sentry.P0;
import io.sentry.Q;
import io.sentry.V0;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class m {
    public static String a(F3 f32) {
        String profilingTracesDirPath = f32.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            f32.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static InterfaceC4725b0 b(F3 f32) {
        if (!e(f32)) {
            return f32.getProfilerConverter();
        }
        InterfaceC4725b0 b10 = io.sentry.profiling.c.b();
        if (b10 instanceof V0) {
            f32.getLogger().c(EnumC4788n3.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            f32.setProfilerConverter(b10);
            f32.getLogger().c(EnumC4788n3.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        return f32.getProfilerConverter();
    }

    public static Q c(F3 f32) {
        if (!f(f32)) {
            return f32.getContinuousProfiler();
        }
        try {
            Q a10 = io.sentry.profiling.c.a(f32.getLogger(), a(f32), f32.getProfilingTracesHz(), f32.getExecutorService());
            if (a10 instanceof P0) {
                f32.getLogger().c(EnumC4788n3.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                f32.setContinuousProfiler(a10);
                f32.getLogger().c(EnumC4788n3.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e10) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Failed to create default profiling traces directory", e10);
        }
        return f32.getContinuousProfiler();
    }

    public static boolean d(F3 f32, F3 f33, boolean z10) {
        if (y.c() && (f33.getVersionDetector() instanceof C4796p1)) {
            f33.setVersionDetector(new J0(f33));
        }
        if (!f33.getVersionDetector().a()) {
            return !z10 || f32 == null || f33.isForceInit() || f32.getInitPriority().ordinal() <= f33.getInitPriority().ordinal();
        }
        f33.getLogger().c(EnumC4788n3.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (y.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }

    public static boolean e(F3 f32) {
        return y.c() && f32.isContinuousProfilingEnabled() && (f32.getProfilerConverter() instanceof V0);
    }

    public static boolean f(F3 f32) {
        return y.c() && f32.isContinuousProfilingEnabled() && (f32.getContinuousProfiler() instanceof P0);
    }
}
