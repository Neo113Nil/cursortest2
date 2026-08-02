package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C4742e2;
import io.sentry.C4747f2;
import io.sentry.C4766j1;
import io.sentry.C4784n;
import io.sentry.C4786n1;
import io.sentry.C4789o;
import io.sentry.C4796p1;
import io.sentry.EnumC4788n3;
import io.sentry.EnumC4877z3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4727b2;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4764j;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4795p0;
import io.sentry.P1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.util.p;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class M {
    public static File e(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    public static String f(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    public static void g(SentryAndroidOptions sentryAndroidOptions, Context context, C4683i0 c4683i0, io.sentry.util.s sVar, C4682i c4682i, boolean z10) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.r)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.d(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.O0) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.g(context, sentryAndroidOptions, c4683i0, io.sentry.android.core.internal.util.h.b()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.t(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C4784n(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C4711u0(context, c4683i0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new R0(sentryAndroidOptions, c4682i));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c4683i0, z10));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C4679g0(context, sentryAndroidOptions, c4683i0));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.t) {
            sentryAndroidOptions.setTransportGate(new U(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        sentryAndroidOptions.setAppStartExtender(v10.j());
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof C4796p1) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.r(sentryAndroidOptions));
        }
        io.sentry.util.p f10 = sVar.f("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean d10 = sVar.d("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(f10));
            if (d10 && sVar.d("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && d10 && sVar.d("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.k.e());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof C4766j1) {
            sentryAndroidOptions.setSocketTagger(P.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new F());
            sentryAndroidOptions.addPerformanceCollector(new C4720z(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new r1(sentryAndroidOptions, (io.sentry.android.core.internal.util.E) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof io.sentry.N0) {
            sentryAndroidOptions.setCompositePerformanceCollector(new C4789o(sentryAndroidOptions));
        }
        if (z10 && (sentryAndroidOptions.getReplayController().getReplayBreadcrumbConverter() instanceof io.sentry.W0)) {
            sentryAndroidOptions.getReplayController().z0(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        InterfaceC4765j0 d11 = io.sentry.android.core.performance.m.f51231A.d();
        try {
            InterfaceC4795p0 k10 = v10.k();
            io.sentry.Q h10 = v10.h();
            v10.H(null);
            v10.F(null);
            if (d11 != null) {
                d11.close();
            }
            k(sentryAndroidOptions, context, c4683i0, k10, h10, sentryAndroidOptions.getCompositePerformanceCollector());
        } finally {
        }
    }

    public static void h(Context context, final SentryAndroidOptions sentryAndroidOptions, C4683i0 c4683i0, io.sentry.util.s sVar, C4682i c4682i, boolean z10, boolean z11, boolean z12, boolean z13) {
        io.sentry.util.p pVar = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.J
            @Override // io.sentry.util.p.a
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(io.sentry.android.core.cache.d.H(SentryAndroidOptions.this));
                return valueOf;
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C4742e2(new InterfaceC4727b2() { // from class: io.sentry.android.core.K
            @Override // io.sentry.InterfaceC4727b2
            public final String a() {
                String cacheDirPath;
                cacheDirPath = SentryAndroidOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        }), pVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(sVar.g("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        if (c4683i0.d() >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.k());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C4747f2(new InterfaceC4727b2() { // from class: io.sentry.android.core.L
            @Override // io.sentry.InterfaceC4727b2
            public final String a() {
                String outboxPath;
                outboxPath = SentryAndroidOptions.this.getOutboxPath();
                return outboxPath;
            }
        }), pVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(X.a(context, c4683i0));
        sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c4683i0, c4682i));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, sVar));
            sentryAndroidOptions.addIntegration(new FeedbackShakeIntegration(application));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c4683i0));
        if (z12) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.m.b());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z13) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().x(new SentryAndroidOptions.a());
    }

    public static void i(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, C4683i0 c4683i0) {
        io.sentry.util.w.c(context, "The context is required.");
        Context g10 = AbstractC4704q0.g(context);
        io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.w.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new B());
        sentryAndroidOptions.setDefaultScopeType(P1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(EnumC4877z3.OFF);
        sentryAndroidOptions.setDateProvider(new b1());
        sentryAndroidOptions.getLogs().d(new E());
        sentryAndroidOptions.getMetrics().d(new H());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.E(g10, iLogger, c4683i0));
        M0.a(g10, sentryAndroidOptions, c4683i0);
        sentryAndroidOptions.setCacheDirPath(e(g10).getAbsolutePath());
        io.sentry.android.core.anr.f.e();
        j(sentryAndroidOptions, g10, c4683i0);
        AppState.w0().A0(sentryAndroidOptions);
        sentryAndroidOptions.activate();
    }

    public static void j(SentryAndroidOptions sentryAndroidOptions, Context context, C4683i0 c4683i0) {
        PackageInfo p10 = AbstractC4704q0.p(context, c4683i0);
        if (p10 != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(f(p10, AbstractC4704q0.q(p10, c4683i0)));
            }
            String str = p10.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(D0.a(context));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().b(EnumC4788n3.ERROR, "Could not generate distinct Id.", e10);
            }
        }
    }

    public static void k(final SentryAndroidOptions sentryAndroidOptions, Context context, C4683i0 c4683i0, InterfaceC4795p0 interfaceC4795p0, io.sentry.Q q10, InterfaceC4764j interfaceC4764j) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(io.sentry.P0.g());
            if (q10 != null) {
                q10.a(true);
            }
            if (interfaceC4795p0 != null) {
                sentryAndroidOptions.setTransactionProfiler(interfaceC4795p0);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new T(context, sentryAndroidOptions, c4683i0, (io.sentry.android.core.internal.util.E) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(C4786n1.c());
        if (interfaceC4795p0 != null) {
            interfaceC4795p0.close();
        }
        if (q10 == null) {
            sentryAndroidOptions.setContinuousProfiler(new C4718y(c4683i0, (io.sentry.android.core.internal.util.E) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new p.a() { // from class: io.sentry.android.core.I
                @Override // io.sentry.util.p.a
                public final Object a() {
                    InterfaceC4760i0 executorService;
                    executorService = SentryAndroidOptions.this.getExecutorService();
                    return executorService;
                }
            }));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(q10);
        io.sentry.protocol.u d10 = q10.d();
        if (!q10.isRunning() || d10.equals(io.sentry.protocol.u.f52477c)) {
            return;
        }
        interfaceC4764j.f(d10.toString());
    }
}
