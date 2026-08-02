package com.vk.id.tracking.tracer;

import Ea.b;
import Hg.c;
import android.content.Context;
import com.vk.id.tracking.core.AnalyticsTracking;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/vk/id/tracking/tracer/TrackingDeps;", "", "Landroid/content/Context;", "context", "", "clientId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "LHg/c;", "tracer", "LHg/c;", "Lcom/vk/id/tracking/tracer/TracerCrashReporter;", "crashReporterInternal", "Lcom/vk/id/tracking/tracer/TracerCrashReporter;", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "Lcom/vk/id/tracking/core/AnalyticsTracking;", "analyticsTracking", "Lcom/vk/id/tracking/core/AnalyticsTracking;", "getAnalyticsTracking", "()Lcom/vk/id/tracking/core/AnalyticsTracking;", "tracking-tracer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingDeps {

    @NotNull
    private final AnalyticsTracking analyticsTracking;

    @NotNull
    private final CrashReporter crashReporter;

    @NotNull
    private final TracerCrashReporter crashReporterInternal;

    @NotNull
    private final PerformanceTracker performanceTracker;
    private final c tracer;

    public TrackingDeps(@NotNull Context context, @NotNull String clientId) {
        c cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            b block = new b(0);
            Intrinsics.checkNotNullParameter(block, "block");
            c.a.C0221a c0221a = new c.a.C0221a();
            tracer$lambda$1(c0221a);
            cVar = new c(applicationContext, new c.a(c0221a));
        } catch (Throwable unused) {
            cVar = null;
        }
        this.tracer = cVar;
        if (cVar != null) {
            try {
                cVar.j(clientId);
                Unit unit = Unit.f71690a;
            } catch (Throwable unused2) {
                Unit unit2 = Unit.f71690a;
            }
        }
        TracerCrashReporter tracerCrashReporter = new TracerCrashReporter(this.tracer);
        this.crashReporterInternal = tracerCrashReporter;
        this.crashReporter = tracerCrashReporter;
        this.performanceTracker = new TracerPerformanceTracker(this.tracer);
        this.analyticsTracking = tracerCrashReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tracer$lambda$1(c.a.C0221a build) {
        Intrinsics.checkNotNullParameter(build, "$this$build");
        build.e(Executors.newCachedThreadPool(new Ea.c()));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread tracer$lambda$1$lambda$0(final Runnable runnable) {
        return new Thread() { // from class: com.vk.id.tracking.tracer.TrackingDeps$tracer$1$1$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        };
    }

    @NotNull
    public final AnalyticsTracking getAnalyticsTracking() {
        return this.analyticsTracking;
    }

    @NotNull
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @NotNull
    public final PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }
}
