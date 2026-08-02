package ru.ozon.app.android.composer.di.modules;

import RZ.a;
import Sg.c;
import WZ.l;
import ei0.InterfaceC6369b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.TrackerAnalyticsWrapper;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.composer.di.modules.RetainComposerAnalyticsModule;
import ru.ozon.app.android.composer.flags.SendErrorsFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/composer/di/modules/RetainComposerAnalyticsModule;", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RetainComposerAnalyticsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\f\b\u0001\u0010\u000b\u001a\u00060\bj\u0002`\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00060\bj\u0002`\tH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/di/modules/RetainComposerAnalyticsModule$Companion;", "", "<init>", "()V", "Lei0/b;", "tracker", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "analyticsEventExecutor", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "applicationAnalyticsScreenStorage", "LVZ/a;", "analyticsScreenFactory", "LZZ/a;", "analyticsScreenToTrackerPageConverter", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "supportedTypes", "", "isPageViewTrackingEnabled", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LRZ/a;", "provideAnalytics", "(Lei0/b;Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;LSg/a;LSg/a;LVZ/a;LZZ/a;Ljava/util/Set;ZLru/ozon/app/android/network/abtool/FeatureService;)LRZ/a;", "composerAnalytics", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "provideRetainTokenizedAnalytics", "(LRZ/a;)LWZ/l;", "provideRetainAnalyticsScreenStorage", "()LSg/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void provideAnalytics$lambda$0(a aVar, FeatureService featureService) {
            aVar.h(featureService.getBooleanKey(SendErrorsFlag.INSTANCE));
        }

        @NotNull
        public final a provideAnalytics(@NotNull InterfaceC6369b tracker, @NotNull AnalyticsEventExecutor analyticsEventExecutor, @NotNull Sg.a analyticsScreenStorage, @NotNull Sg.a applicationAnalyticsScreenStorage, @NotNull VZ.a analyticsScreenFactory, @NotNull ZZ.a analyticsScreenToTrackerPageConverter, @NotNull Set<YZ.a> supportedTypes, boolean isPageViewTrackingEnabled, @NotNull final FeatureService featureService) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
            Intrinsics.checkNotNullParameter(analyticsScreenFactory, "analyticsScreenFactory");
            Intrinsics.checkNotNullParameter(analyticsScreenToTrackerPageConverter, "analyticsScreenToTrackerPageConverter");
            Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            a.C0494a c0494a = new a.C0494a(new TrackerAnalyticsWrapper(tracker, analyticsScreenToTrackerPageConverter));
            c0494a.b(analyticsEventExecutor.getExecutor());
            c0494a.d(new a.b(analyticsScreenStorage, applicationAnalyticsScreenStorage, analyticsScreenFactory));
            c0494a.e(supportedTypes);
            c0494a.c(e0.h("searchSuggestions"));
            final a a11 = c0494a.a();
            a11.e().c(isPageViewTrackingEnabled);
            featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: Fr.d
                @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
                public final void onChangeFeature() {
                    RetainComposerAnalyticsModule.Companion.provideAnalytics$lambda$0(RZ.a.this, featureService);
                }
            });
            return a11;
        }

        @NotNull
        public final Sg.a provideRetainAnalyticsScreenStorage() {
            int i11 = Sg.a.f26232a;
            return new c();
        }

        @NotNull
        public final l provideRetainTokenizedAnalytics(@NotNull a composerAnalytics) {
            Intrinsics.checkNotNullParameter(composerAnalytics, "composerAnalytics");
            return composerAnalytics.f();
        }

        private Companion() {
        }
    }
}
