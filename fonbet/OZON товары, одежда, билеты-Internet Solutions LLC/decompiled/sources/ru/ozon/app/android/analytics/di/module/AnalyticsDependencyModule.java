package ru.ozon.app.android.analytics.di.module;

import Fb0.e;
import Jl.C3398a;
import Qj0.I;
import Sg.a;
import We.InterfaceC4875q;
import Xj0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import fi0.InterfaceC6571a;
import fi0.b;
import fi0.c;
import fi0.h;
import fi0.i;
import fi0.m;
import fi0.n;
import fi0.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import pi0.f;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.analytics.callback.VideoAnalyzerForceSendingPerfEventsCallback;
import ru.ozon.app.android.analytics.di.AnalyticsComponentConfig;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.flags.ClearEventUnderDateFlag;
import ru.ozon.app.android.analytics.flags.LogProcessCreationTimeFeatureFlag;
import ru.ozon.app.android.analytics.flags.PerformanceTrackingEnabledFlag;
import ru.ozon.app.android.analytics.flags.TrackStartupStepsTimeFeatureFlag;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerDelayedSendingAnalyticsFlag;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerDelayedSendingPerfAnalyticsFlag;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerForceSendingAnalyticsOnMinimizeFlag;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerForceSendingPerfAnalyticsOnMinimizeFlag;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerPerformanceEventUnderDateInMinutesFlag;
import ru.ozon.app.android.analytics.flags.TrackerConnectionTypeLoggerEnabledFlag;
import ru.ozon.app.android.analytics.flags.TrackerEnabledFlag;
import ru.ozon.app.android.analytics.flags.tracker.TrackerProductSendingPeriod;
import ru.ozon.app.android.analytics.performance.BxPerformanceTrackerInterceptor;
import ru.ozon.app.android.analytics.performance.MessengerPerformanceTrackerInterceptor;
import ru.ozon.app.android.analytics.performance.TravelPerformanceTrackerInterceptor;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;
import ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorage;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.utils.ContextUtilsKt;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.tracker.sendEvent.Namespace;
import ru.ozon.tracker.sendEvent.Page;
import ve.EnumC10311b;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/analytics/di/module/AnalyticsDependencyModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AnalyticsDependencyModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\t*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u009d\u0001\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\b\u0001\u0010$\u001a\u00060\"j\u0002`#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\b\u0001\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u0002022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0007¢\u0006\u0004\b5\u00106J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020 2\f\b\u0001\u0010$\u001a\u00060\"j\u0002`#H\u0007¢\u0006\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/analytics/di/module/AnalyticsDependencyModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/tracker/sendEvent/Namespace;", "getNamespace", "(Landroid/content/Context;)Lru/ozon/tracker/sendEvent/Namespace;", "Lfi0/x$a;", "Lfi0/b;", "appUsageTimeConfig", "applyAppUsageTimeConfigIfExists", "(Lfi0/x$a;Lfi0/b;)Lfi0/x$a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "storeInfoProvider", "LWe/q;", "cookieJar", "Lfi0/a;", "advertisingService", "LFb0/e;", "appDomain", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "debugHeaderService", "Lru/ozon/app/android/debugmenu/storage/TrackerLoggerSettingsStorage;", "trackerLoggerSettingsStorage", "Lfi0/c;", "currentPageProvider", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "Lru/ozon/app/android/analytics/callback/VideoAnalyzerForceSendingPerfEventsCallback;", "videoAnalyzerForceSendingPerfEventsCallback", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "", "metricsDomainName", "LLd0/c;", "ozonLimbDiStore", "Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "provideOzonTrackerSettings", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureService;Lcom/appsflyer/AppsFlyerLib;Lru/ozon/android/hardwareinfo/DeviceType;Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;LWe/q;Lfi0/a;LFb0/e;Lru/ozon/app/android/network/debug/DebugHeaderService;Lru/ozon/app/android/debugmenu/storage/TrackerLoggerSettingsStorage;Lfi0/c;LSg/a;Lru/ozon/app/android/analytics/callback/VideoAnalyzerForceSendingPerfEventsCallback;Lru/ozon/app/android/network/version/AppVersionService;Ljava/lang/String;LLd0/c;)Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "", "isShakerEnabled", "Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "provideAnalyticsComponentConfig", "(Lru/ozon/app/android/network/abtool/FeatureService;Z)Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "provideAppsFlyer", "()Lcom/appsflyer/AppsFlyerLib;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "LQj0/I;", "providePerformanceTrackerInterceptors", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)Ljava/util/List;", "provideCurrentPageProvider", "(LSg/a;)Lfi0/c;", "", "BATCH_SIZE", "I", "TRACKER_TESTING_TOOL_NAME", "Ljava/lang/String;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final x.a applyAppUsageTimeConfigIfExists(x.a aVar, b bVar) {
            if (bVar != null) {
                aVar.e(bVar);
            }
            return aVar;
        }

        private final Namespace getNamespace(Context context) {
            return ContextUtilsKt.isOzonTravelApplication(context) ? Namespace.TRAVEL_APP : ContextUtilsKt.isOzonSelectApplication(context) ? Namespace.SELECT : ContextUtilsKt.isOzonFreshApplication(context) ? Namespace.FRESH : Namespace.f97866BX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Page provideOzonTrackerSettings$lambda$0(a aVar) {
            Rg.a a11 = aVar.a();
            if (a11 != null) {
                return AnalyticsExtensionsKt.toPage(a11);
            }
            return null;
        }

        @SuppressLint({"InlinedApi"})
        @NotNull
        public final AnalyticsComponentConfig provideAnalyticsComponentConfig(@NotNull FeatureService featureService, boolean isShakerEnabled) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            return new AnalyticsComponentConfig(isShakerEnabled, featureService.getBooleanKey(PerformanceTrackingEnabledFlag.INSTANCE), featureService.getBooleanKey(TrackStartupStepsTimeFeatureFlag.INSTANCE), featureService.getBooleanKey(LogProcessCreationTimeFeatureFlag.INSTANCE));
        }

        @NotNull
        public final AppsFlyerLib provideAppsFlyer() {
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.setHost("", "appsflyersdk.com");
            Intrinsics.checkNotNullExpressionValue(appsFlyerLib, "also(...)");
            return appsFlyerLib;
        }

        @NotNull
        public final c provideCurrentPageProvider(@NotNull final a applicationAnalyticsScreenStorage) {
            Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
            return new c() { // from class: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideCurrentPageProvider$1
                @Override // fi0.c
                public Page getCurrentPage() {
                    Rg.a a11 = a.this.a();
                    if (a11 != null) {
                        return AnalyticsExtensionsKt.toPage(a11);
                    }
                    return null;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$5] */
        @NotNull
        public final OzonTrackerSettings provideOzonTrackerSettings(@NotNull Context context, @NotNull final FeatureService featureService, @NotNull AppsFlyerLib appsFlyerLib, @NotNull DeviceType deviceType, @NotNull AppStoreInfoProvider storeInfoProvider, @NotNull InterfaceC4875q cookieJar, InterfaceC6571a advertisingService, @NotNull e appDomain, @NotNull DebugHeaderService debugHeaderService, @NotNull TrackerLoggerSettingsStorage trackerLoggerSettingsStorage, @NotNull c currentPageProvider, @NotNull a applicationAnalyticsScreenStorage, @NotNull VideoAnalyzerForceSendingPerfEventsCallback videoAnalyzerForceSendingPerfEventsCallback, @NotNull AppVersionService appVersionService, @NotNull String metricsDomainName, @NotNull Ld0.c ozonLimbDiStore) {
            boolean z11;
            long g10;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(storeInfoProvider, "storeInfoProvider");
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            Intrinsics.checkNotNullParameter(appDomain, "appDomain");
            Intrinsics.checkNotNullParameter(debugHeaderService, "debugHeaderService");
            Intrinsics.checkNotNullParameter(trackerLoggerSettingsStorage, "trackerLoggerSettingsStorage");
            Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
            Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
            Intrinsics.checkNotNullParameter(videoAnalyzerForceSendingPerfEventsCallback, "videoAnalyzerForceSendingPerfEventsCallback");
            Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
            Intrinsics.checkNotNullParameter(metricsDomainName, "metricsDomainName");
            Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            boolean z12 = buildUtils.isDebug() || buildUtils.isQaFlavor();
            int intKey = featureService.getIntKey(ClearEventUnderDateFlag.INSTANCE);
            Object applicationContext = context.getApplicationContext();
            a.InterfaceC0629a interfaceC0629a = applicationContext instanceof a.InterfaceC0629a ? (a.InterfaceC0629a) applicationContext : null;
            M m11 = new M();
            a.InterfaceC0629a interfaceC0629a2 = interfaceC0629a;
            C10727i.d(g.f71771a, new AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1(m11, null));
            Boolean f7 = ((f) m11.f71787a).f();
            boolean booleanValue = f7 != null ? f7.booleanValue() : trackerLoggerSettingsStorage.isEventsLoggerEnabled();
            Boolean f11 = ((f) m11.f71787a).f();
            boolean z13 = z12 && (f11 != null ? f11.booleanValue() : trackerLoggerSettingsStorage.isPerformanceLoggerEnabled());
            boolean z14 = z12 && booleanValue;
            Boolean f12 = ((f) m11.f71787a).f();
            boolean booleanValue2 = f12 != null ? f12.booleanValue() : featureService.getBooleanKey(TrackerConnectionTypeLoggerEnabledFlag.INSTANCE);
            b c1028b = Intrinsics.d(((f) m11.f71787a).g(), Boolean.FALSE) ? b.a.f63487a : new b.C1028b(new C3398a(applicationAnalyticsScreenStorage));
            Boolean d11 = ((f) m11.f71787a).d();
            boolean booleanValue3 = d11 != null ? d11.booleanValue() : featureService.getBooleanKey(TrackerBackgroundModeFlags$TrackerForceSendingAnalyticsOnMinimizeFlag.INSTANCE);
            Boolean b11 = ((f) m11.f71787a).b();
            boolean booleanValue4 = b11 != null ? b11.booleanValue() : featureService.getBooleanKey(TrackerBackgroundModeFlags$TrackerDelayedSendingAnalyticsFlag.INSTANCE);
            boolean z15 = booleanValue3;
            Boolean c11 = ((f) m11.f71787a).c();
            boolean booleanValue5 = c11 != null ? c11.booleanValue() : featureService.getBooleanKey(TrackerBackgroundModeFlags$TrackerDelayedSendingPerfAnalyticsFlag.INSTANCE);
            Boolean e11 = ((f) m11.f71787a).e();
            boolean booleanValue6 = e11 != null ? e11.booleanValue() : featureService.getBooleanKey(TrackerBackgroundModeFlags$TrackerForceSendingPerfAnalyticsOnMinimizeFlag.INSTANCE);
            kotlin.time.b i11 = ((f) m11.f71787a).i();
            if (i11 != null) {
                g10 = i11.getF71985a();
                z11 = booleanValue4;
            } else {
                b.Companion companion = kotlin.time.b.INSTANCE;
                z11 = booleanValue4;
                g10 = kotlin.time.c.g(featureService.getIntKey(TrackerProductSendingPeriod.INSTANCE), EnumC10311b.MILLISECONDS);
            }
            Boolean j11 = ((f) m11.f71787a).j();
            boolean booleanKey = featureService.getBooleanKey(TrackerEnabledFlag.INSTANCE);
            Namespace namespace = getNamespace(context);
            String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
            if (appsFlyerUID == null) {
                appsFlyerUID = "";
            }
            fi0.b bVar = c1028b;
            long j12 = intKey;
            TimeUnit timeUnit = TimeUnit.HOURS;
            x.a aVar = new x.a(namespace, appsFlyerUID, new i(j12), cookieJar);
            String c12 = Hg0.a.c("debug.ozon.testingToolName", null);
            if (c12 == null || c12.length() == 0) {
                c12 = null;
            }
            aVar.v(c12);
            Integer a11 = ((f) m11.f71787a).a();
            aVar.g(a11 != null ? a11.intValue() : 20);
            aVar.c(appDomain);
            aVar.l(metricsDomainName);
            aVar.d(appVersionService.getAppName());
            aVar.s(new n(featureService.getBooleanKey(PerformanceTrackingEnabledFlag.INSTANCE), 4));
            DeviceType deviceType2 = DeviceType.TABLET;
            if (deviceType != deviceType2) {
                deviceType2 = DeviceType.MOBILE;
            }
            aVar.j(deviceType2);
            aVar.t(storeInfoProvider.retrieveStoreName());
            aVar.b(advertisingService);
            ArrayList arrayList = new ArrayList();
            String internalHeadersToken = debugHeaderService.getInternalHeadersToken();
            if (internalHeadersToken != null) {
                arrayList.add(new h(internalHeadersToken));
            }
            Unit unit = Unit.f71690a;
            aVar.m(arrayList);
            aVar.n(booleanValue2);
            aVar.o(z14);
            aVar.p(z13);
            x.a applyAppUsageTimeConfigIfExists = applyAppUsageTimeConfigIfExists(aVar, bVar);
            applyAppUsageTimeConfigIfExists.i(currentPageProvider);
            applyAppUsageTimeConfigIfExists.w(new AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$4(z11, booleanValue5, z15, booleanValue6));
            Long h11 = ((f) m11.f71787a).h();
            long longValue = h11 != null ? h11.longValue() : featureService.getIntKey(TrackerBackgroundModeFlags$TrackerPerformanceEventUnderDateInMinutesFlag.INSTANCE);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            applyAppUsageTimeConfigIfExists.r(new m(longValue));
            applyAppUsageTimeConfigIfExists.a(videoAnalyzerForceSendingPerfEventsCallback);
            applyAppUsageTimeConfigIfExists.f(interfaceC0629a2 != null ? interfaceC0629a2.a() : null);
            applyAppUsageTimeConfigIfExists.q(new Kj0.a() { // from class: ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$5
            });
            applyAppUsageTimeConfigIfExists.k(ozonLimbDiStore);
            applyAppUsageTimeConfigIfExists.u(g10);
            return new OzonTrackerSettings(j11, booleanKey, applyAppUsageTimeConfigIfExists.h());
        }

        @NotNull
        public final List<I> providePerformanceTrackerInterceptors(@NotNull FeatureChecker featureChecker) {
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            LinkedList linkedList = new LinkedList();
            linkedList.add(new MessengerPerformanceTrackerInterceptor());
            linkedList.add(new TravelPerformanceTrackerInterceptor());
            linkedList.add(new BxPerformanceTrackerInterceptor(featureChecker));
            return linkedList;
        }

        private Companion() {
        }
    }
}
