package ru.ozon.app.android.analytics.performance.di.module;

import Eg0.b;
import Fg0.a;
import Gg0.c;
import Gg0.f;
import Sc.o;
import Tc.d;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.flags.BxPerformanceTrackingEnabledFlag;
import ru.ozon.app.android.analytics.flags.RumImageErrorsFlag;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.performance.WidgetsNamesProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.flags.PikazonImageFailuresLoggingEnabledFlag;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/analytics/performance/di/module/ImagesAnalyticsModule;", "", "<init>", "()V", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "performanceAvailabilityChecker", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTracker", "LGg0/c;", "mediaNamesHolder", "LFg0/a;", "ozonTrackerErrorsLogger", "LSg/a;", "applicationAnalyticsScreenStorage", "Lqj/a;", "networkInfoProvider", "LGg0/f;", "providePlaceholderTimeHandler", "(Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LGg0/c;LFg0/a;LSg/a;Lqj/a;)LGg0/f;", "provideWidgetsNamesHolder", "()LGg0/c;", "Lei0/b;", "ozonTracker", "provideOzonTrackerErrorsLogger", "(Lei0/b;)LFg0/a;", "Lru/ozon/app/android/analytics/performance/WidgetsNamesProvider;", "widgetsNamesProvider", "LEg0/b;", "provideOzonLoggerErrorsLogger", "(Lru/ozon/app/android/analytics/performance/WidgetsNamesProvider;)LEg0/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "providePikazonPerformanceAvailabilityChecker", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;LSg/a;)Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImagesAnalyticsModule {

    @NotNull
    public static final ImagesAnalyticsModule INSTANCE = new ImagesAnalyticsModule();

    private ImagesAnalyticsModule() {
    }

    @NotNull
    public final b provideOzonLoggerErrorsLogger(@NotNull WidgetsNamesProvider widgetsNamesProvider) {
        Intrinsics.checkNotNullParameter(widgetsNamesProvider, "widgetsNamesProvider");
        return new b(C7714v.a0(widgetsNamesProvider));
    }

    @NotNull
    public final a provideOzonTrackerErrorsLogger(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        return new a(ozonTracker);
    }

    @NotNull
    public final PikazonPerformanceAvailabilityChecker providePikazonPerformanceAvailabilityChecker(@NotNull final PerformanceTrackerDelegate performanceTracker, @NotNull final FeatureChecker featureChecker, @NotNull final Sg.a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        return new PikazonPerformanceAvailabilityChecker() { // from class: ru.ozon.app.android.analytics.performance.di.module.ImagesAnalyticsModule$providePikazonPerformanceAvailabilityChecker$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PikazonErrorsLogger.AnalyticsPlatform.values().length];
                    try {
                        iArr[PikazonErrorsLogger.AnalyticsPlatform.OZON_LOGGER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PikazonErrorsLogger.AnalyticsPlatform.OZON_TRACKER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
            public boolean isImageErrorsAnalyticsEnabled(PikazonErrorsLogger.AnalyticsPlatform analyticsPlatform) {
                Intrinsics.checkNotNullParameter(analyticsPlatform, "analyticsPlatform");
                int i11 = WhenMappings.$EnumSwitchMapping$0[analyticsPlatform.ordinal()];
                if (i11 == 1) {
                    return featureChecker.isEnabled(PikazonImageFailuresLoggingEnabledFlag.INSTANCE);
                }
                if (i11 != 2) {
                    throw new o();
                }
                FeatureChecker featureChecker2 = featureChecker;
                return featureChecker2.isEnabled(BxPerformanceTrackingEnabledFlag.INSTANCE) && featureChecker2.isEnabled(RumImageErrorsFlag.INSTANCE);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
            public boolean isImagePlaceholderAnalyticsEnabled() {
                PerformanceTrackerDelegate performanceTrackerDelegate = PerformanceTrackerDelegate.this;
                Rg.a a11 = applicationAnalyticsScreenStorage.a();
                String f7 = a11 != null ? a11.f() : null;
                if (f7 == null) {
                    f7 = "";
                }
                ObjectTypes objectTypes = ObjectTypes.IMAGE;
                d builder = new d();
                builder.put("placeholderRate", Boolean.TRUE);
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                return performanceTrackerDelegate.isSupported(f7, objectTypes, builder.u());
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
            public boolean isLoadCancellingAnalyticsEnabled() {
                return isImagePlaceholderAnalyticsEnabled();
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
            public boolean isPerformanceAnalyticsEnabled() {
                boolean isSupported;
                PerformanceTrackerDelegate performanceTrackerDelegate = PerformanceTrackerDelegate.this;
                Rg.a a11 = applicationAnalyticsScreenStorage.a();
                String f7 = a11 != null ? a11.f() : null;
                if (f7 == null) {
                    f7 = "";
                }
                isSupported = performanceTrackerDelegate.isSupported(f7, ObjectTypes.IMAGE, U.c());
                return isSupported;
            }
        };
    }

    @NotNull
    public final f providePlaceholderTimeHandler(@NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, @NotNull PerformanceTrackerDelegate performanceTracker, @NotNull c mediaNamesHolder, @NotNull a ozonTrackerErrorsLogger, @NotNull Sg.a applicationAnalyticsScreenStorage, @NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(mediaNamesHolder, "mediaNamesHolder");
        Intrinsics.checkNotNullParameter(ozonTrackerErrorsLogger, "ozonTrackerErrorsLogger");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        return new f(performanceAvailabilityChecker, performanceTracker, mediaNamesHolder, ozonTrackerErrorsLogger, applicationAnalyticsScreenStorage, networkInfoProvider);
    }

    @NotNull
    public final c provideWidgetsNamesHolder() {
        return new c();
    }
}
