package io.sentry.android.core;

import android.app.Application;
import android.os.Build;
import androidx.appcompat.widget.q4;
import com.sports.insider.MyApp;
import io.sentry.a3;
import io.sentry.a4;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.h2;
import io.sentry.i2;
import io.sentry.j2;
import io.sentry.k2;
import io.sentry.l5;
import io.sentry.p2;
import io.sentry.v2;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q {
    public static void a(SentryAndroidOptions sentryAndroidOptions, MyApp myApp, n0 n0Var, io.sentry.hints.j jVar, q4 q4Var, boolean z5) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof i2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(myApp, n0Var, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new o0(myApp, n0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new a1(sentryAndroidOptions, q4Var));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, n0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new j0(myApp, n0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            n0 n0Var2 = new n0();
            n0Var2.f15782a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(n0Var2);
        }
        io.sentry.android.core.performance.f b10 = io.sentry.android.core.performance.f.b();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(myApp, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new l1.a(myApp, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof a3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.t(sentryAndroidOptions, 0));
        }
        io.sentry.util.f fVar = new io.sentry.util.f(new l5(jVar, sentryAndroidOptions));
        boolean y5 = io.sentry.hints.j.y(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(fVar));
            if (y5 && io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && y5 && io.sentry.hints.j.y(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.e.f15712a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof v2) {
            sentryAndroidOptions.setSocketTagger(v.f15862b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new n());
            sentryAndroidOptions.addPerformanceCollector(new i(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.p frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                y4.a.C(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new g1(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof h2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.q(sentryAndroidOptions));
        }
        if (z5 && (sentryAndroidOptions.getReplayController().getF15935n() instanceof p2)) {
            sentryAndroidOptions.getReplayController().w(new io.sentry.android.replay.d(sentryAndroidOptions));
        }
        io.sentry.r a7 = io.sentry.android.core.performance.f.f15801n.a();
        try {
            b10.getClass();
            a7.close();
            sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(j2.f16538a);
                io.sentry.android.core.internal.util.p frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                y4.a.C(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new w(myApp, sentryAndroidOptions, n0Var, frameMetricsCollector2));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(k2.f16596d);
            io.sentry.android.core.internal.util.p frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
            y4.a.C(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
            sentryAndroidOptions.setContinuousProfiler(new h(n0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
        } finally {
        }
    }

    public static void b(MyApp myApp, SentryAndroidOptions sentryAndroidOptions, n0 n0Var, io.sentry.hints.j jVar, q4 q4Var, boolean z5, boolean z7, boolean z10, boolean z11) {
        io.sentry.util.f fVar = new io.sentry.util.f(new p(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new a4(new p(sentryAndroidOptions), 0), fVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.hints.j.A("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(myApp));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new a4(new p(sentryAndroidOptions), 1), fVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i5 >= 30 ? new AnrV2Integration(myApp) : new AnrIntegration(myApp));
        sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(myApp, n0Var, q4Var));
        sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(myApp));
        sentryAndroidOptions.addIntegration(new UserInteractionIntegration(myApp, jVar));
        if (z5) {
            sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration((Application) myApp, true, true));
        }
        if (z7) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(myApp));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(myApp));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(myApp, n0Var));
        if (z10) {
            ReplayIntegration replayIntegration = new ReplayIntegration(myApp);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z11) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(myApp);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
