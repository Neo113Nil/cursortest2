package ru.ozon.app.android.composer.di.modules;

import Fr.e;
import Fr.f;
import Fr.g;
import Hh.C3140a;
import Ih.b;
import Jh.c;
import Jh.d;
import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.flags.ComposerNewPerformanceMetricsEnabled;
import ru.ozon.app.android.composer.flags.FpsHitchHzLimitFlag;
import ru.ozon.app.android.composer.tracker.BxPerformanceTraceHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/composer/di/modules/RetainComposerPerformanceAnalyticsModule;", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RetainComposerPerformanceAnalyticsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/di/modules/RetainComposerPerformanceAnalyticsModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "debugToolsStorage", "LHh/a;", "provideFpsTracker", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/storage/debug/DebugToolsStorage;)LHh/a;", "Lru/ozon/app/android/composer/tracker/BxPerformanceTraceHandler;", "performanceTraceHandler", "LRZ/a;", "composerAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LIh/b;", "providePagePerformanceTracker", "(Lru/ozon/app/android/composer/tracker/BxPerformanceTraceHandler;LRZ/a;LSg/a;Lru/ozon/app/android/network/abtool/FeatureChecker;)LIh/b;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void provideFpsTracker$lambda$1$lambda$0(C3140a c3140a, FeatureService featureService) {
            c3140a.s(featureService.getIntKey(FpsHitchHzLimitFlag.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean providePagePerformanceTracker$lambda$2(FeatureChecker featureChecker) {
            return featureChecker.isEnabled(ComposerNewPerformanceMetricsEnabled.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean providePagePerformanceTracker$lambda$3() {
            return true;
        }

        @NotNull
        public final C3140a provideFpsTracker(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull a analyticsScreenStorage, @NotNull FeatureService featureService, @NotNull DebugToolsStorage debugToolsStorage) {
            Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(debugToolsStorage, "debugToolsStorage");
            boolean isDebugEnabled = debugToolsStorage.isDebugEnabled();
            C3140a.C0222a c0222a = new C3140a.C0222a(performanceTrackerDelegate, analyticsScreenStorage);
            c0222a.b(isDebugEnabled);
            C3140a a11 = c0222a.a();
            if (isDebugEnabled) {
                a11.r();
            }
            a11.s(featureService.getIntKey(FpsHitchHzLimitFlag.INSTANCE));
            featureService.addOnChangeFeatureListener(new e(0, a11, featureService));
            return a11;
        }

        @NotNull
        public final b providePagePerformanceTracker(@NotNull BxPerformanceTraceHandler performanceTraceHandler, @NotNull RZ.a composerAnalytics, @NotNull a analyticsScreenStorage, @NotNull FeatureChecker featureChecker) {
            Intrinsics.checkNotNullParameter(performanceTraceHandler, "performanceTraceHandler");
            Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            SZ.a analyticsEventExecutor = composerAnalytics.a();
            b.a.C0250a c0250a = new b.a.C0250a();
            c0250a.f(new f(featureChecker));
            c0250a.e(new g());
            b.a configuration = new b.a(c0250a);
            Intrinsics.checkNotNullParameter(performanceTraceHandler, "performanceTraceHandler");
            Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Jh.f(performanceTraceHandler, composerAnalytics, analyticsScreenStorage, analyticsEventExecutor, new d(), new Jh.a(new Ay.b(configuration)), configuration, new c(configuration.d()));
        }

        private Companion() {
        }
    }
}
