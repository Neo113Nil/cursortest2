package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.messaging.C5939u;
import io.sentry.C7127b1;
import io.sentry.C7169m;
import io.sentry.C7173n;
import io.sentry.C7192q;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.F0;
import io.sentry.F1;
import io.sentry.G1;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7146g0;
import io.sentry.InterfaceC7157j;
import io.sentry.L0;
import io.sentry.V0;
import io.sentry.Z0;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7118t {
    static void a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull I i11, @NotNull io.sentry.util.m mVar, @NotNull C7102c c7102c, boolean z11) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.h)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.c(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof E0) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.a(context, sentryAndroidOptions, i11, io.sentry.android.core.internal.util.b.a()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.l(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C7169m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new O(context, i11, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new f0(sentryAndroidOptions, c7102c));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, i11, z11));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new G(context, i11, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.j) {
            sentryAndroidOptions.setTransportGate(new C7123y(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof C7127b1) {
            sentryAndroidOptions.setVersionDetector(new C7192q(sentryAndroidOptions));
        }
        io.sentry.util.l lVar = new io.sentry.util.l(new C5939u(mVar, sentryAndroidOptions));
        boolean a11 = io.sentry.util.m.a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(lVar));
            if (a11 && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && a11 && io.sentry.util.m.a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.d.d());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof V0) {
            sentryAndroidOptions.setSocketTagger(C7120v.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C7116q());
            sentryAndroidOptions.addPerformanceCollector(new C7110k(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.v frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new o0(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof D0) {
            sentryAndroidOptions.setCompositePerformanceCollector(new C7173n(sentryAndroidOptions));
        }
        if (z11 && (sentryAndroidOptions.getReplayController().getF67431n() instanceof L0)) {
            sentryAndroidOptions.getReplayController().c(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        InterfaceC7097a0 a12 = io.sentry.android.core.performance.j.f67322r.a();
        try {
            InterfaceC7146g0 f7 = m11.f();
            io.sentry.K e11 = m11.e();
            m11.s(null);
            m11.r(null);
            a12.close();
            InterfaceC7157j compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(F0.f());
                if (e11 != null) {
                    ((C7109j) e11).a(true);
                }
                if (f7 != null) {
                    sentryAndroidOptions.setTransactionProfiler(f7);
                    return;
                }
                io.sentry.android.core.internal.util.v frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new C7122x(context, sentryAndroidOptions, i11, frameMetricsCollector2));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(Z0.d());
            if (f7 != null) {
                f7.close();
            }
            if (e11 == null) {
                io.sentry.android.core.internal.util.v frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.p.b(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setContinuousProfiler(new C7109j(i11, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new Hn.d(sentryAndroidOptions, 1)));
                return;
            }
            sentryAndroidOptions.setContinuousProfiler(e11);
            C7109j c7109j = (C7109j) e11;
            io.sentry.protocol.t h11 = c7109j.h();
            if (!c7109j.j() || h11.equals(io.sentry.protocol.t.f68325b)) {
                return;
            }
            compositePerformanceCollector.f(h11.toString());
        } finally {
        }
    }

    static void b(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull I i11, @NotNull io.sentry.util.m mVar, @NotNull C7102c c7102c, boolean z11, boolean z12, boolean z13, boolean z14) {
        io.sentry.util.l lVar = new io.sentry.util.l(new Hn.e(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new F1(new androidx.work.impl.w(sentryAndroidOptions)), lVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.util.m.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new G1(new androidx.work.impl.w(sentryAndroidOptions)), lVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i12 >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, i11, c7102c));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, mVar));
            if (z11) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(I2.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z12) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, i11));
        if (z13) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.c.a());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z14) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
