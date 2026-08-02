package ru.ozon.app.android.debugmenu.ozondebugmenu.di;

import E10.c;
import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import android.app.Application;
import android.content.SharedPreferences;
import ru.ozon.app.android.account.locale.app.data.LocalizationDebugPreferences;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi;
import ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter;
import ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouterImpl;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelperImpl;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponent;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.AnalyticsGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.CheckoutGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.ComposerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.DebugFeaturesGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.DeeplinkGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.EnvironmentGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.FontScaleDebugMenuProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.HttpHeadersGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.HttpLoggingGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.InformationGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.LocalizationGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.MapsGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.PlayerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.SentryGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.TrackerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.di.NetworkUserDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

/* loaded from: classes6.dex */
public final class DaggerOzonDebugMenuComponent {

    private static final class Factory implements OzonDebugMenuComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponent.Factory
        public OzonDebugMenuComponent create(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, PushComponentApi pushComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NetworkUserDependencies networkUserDependencies, VideoComponentApi videoComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi, AppLocaleComponentApi appLocaleComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            contextComponentDependencies.getClass();
            androidPlatformComponentApi.getClass();
            composerPerformanceComponentApi.getClass();
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            pushComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            networkUserDependencies.getClass();
            videoComponentApi.getClass();
            inAppUpdateComponentApi.getClass();
            checkoutPaymentComponentApi.getClass();
            locationComponentApi.getClass();
            appLocaleComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new OzonDebugMenuComponentImpl(contextComponentDependencies, androidPlatformComponentApi, composerPerformanceComponentApi, storageComponentApi, navigationComponentApi, pushComponentApi, networkComponentApi, networkOzonIdComponentApi, networkUserDependencies, videoComponentApi, inAppUpdateComponentApi, checkoutPaymentComponentApi, locationComponentApi, appLocaleComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonDebugMenuComponentImpl implements OzonDebugMenuComponent {
        private a<AbToggleRouterImpl> abToggleRouterImplProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private a<AnalyticsGroupProvider> analyticsGroupProvider;
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final AppLocaleComponentApi appLocaleComponentApi;
        private a<CheckoutGroupProvider> checkoutGroupProvider;
        private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
        private a<ComposerGroupProvider> composerGroupProvider;
        private final ComposerPerformanceComponentApi composerPerformanceComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<DebugFeaturesGroupProvider> debugFeaturesGroupProvider;
        private a<DeeplinkGroupProvider> deeplinkGroupProvider;
        private a<EnvironmentGroupProvider> environmentGroupProvider;
        private a<FontScaleDebugMenuProvider> fontScaleDebugMenuProvider;
        private a<AndroidPlatformComponentConfig> getAndroidPlatformComponentConfigProvider;
        private a<EnvironmentService> getEnvironmentServiceProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<g> getOzonRouterProvider;
        private a<HttpHeadersGroupProvider> httpHeadersGroupProvider;
        private a<HttpLoggingGroupProvider> httpLoggingGroupProvider;
        private final InAppUpdateComponentApi inAppUpdateComponentApi;
        private a<InformationGroupProvider> informationGroupProvider;
        private a<LocalizationGroupProvider> localizationGroupProvider;
        private final LocationComponentApi locationComponentApi;
        private a<MapsGroupProvider> mapsGroupProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private final NetworkUserDependencies networkUserDependencies;
        private final OzonDebugMenuComponentImpl ozonDebugMenuComponentImpl;
        private a<OzonDebugMenuEvents> ozonDebugMenuEventsProvider;
        private a<OzonDebugMenuHelperImpl> ozonDebugMenuHelperImplProvider;
        private a<PlayerGroupProvider> playerGroupProvider;
        private final PushComponentApi pushComponentApi;
        private a<SentryGroupProvider> sentryGroupProvider;
        private final StorageComponentApi storageComponentApi;
        private a<TrackerGroupProvider> trackerGroupProvider;
        private final VideoComponentApi videoComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92498id;
            private final OzonDebugMenuComponentImpl ozonDebugMenuComponentImpl;

            SwitchingProvider(OzonDebugMenuComponentImpl ozonDebugMenuComponentImpl, int i11) {
                this.ozonDebugMenuComponentImpl = ozonDebugMenuComponentImpl;
                this.f92498id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92498id) {
                    case 0:
                        Application application = this.ozonDebugMenuComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application);
                        NetworkAtMostQaUserPredicate atMostQaUserPredicate = this.ozonDebugMenuComponentImpl.networkUserDependencies.atMostQaUserPredicate();
                        j.c(atMostQaUserPredicate);
                        return (T) new OzonDebugMenuHelperImpl(application, atMostQaUserPredicate, d.a(this.ozonDebugMenuComponentImpl.abToggleRouterImplProvider), d.a(this.ozonDebugMenuComponentImpl.deeplinkGroupProvider), d.a(this.ozonDebugMenuComponentImpl.getEnvironmentServiceProvider), d.a(this.ozonDebugMenuComponentImpl.environmentGroupProvider), d.a(this.ozonDebugMenuComponentImpl.composerGroupProvider), d.a(this.ozonDebugMenuComponentImpl.trackerGroupProvider), d.a(this.ozonDebugMenuComponentImpl.httpLoggingGroupProvider), d.a(this.ozonDebugMenuComponentImpl.analyticsGroupProvider), d.a(this.ozonDebugMenuComponentImpl.informationGroupProvider), d.a(this.ozonDebugMenuComponentImpl.httpHeadersGroupProvider), d.a(this.ozonDebugMenuComponentImpl.debugFeaturesGroupProvider), d.a(this.ozonDebugMenuComponentImpl.playerGroupProvider), d.a(this.ozonDebugMenuComponentImpl.mapsGroupProvider), d.a(this.ozonDebugMenuComponentImpl.sentryGroupProvider), d.a(this.ozonDebugMenuComponentImpl.getOzonRouterProvider), d.a(this.ozonDebugMenuComponentImpl.getAndroidPlatformComponentConfigProvider), d.a(this.ozonDebugMenuComponentImpl.getFeatureCheckerProvider), d.a(this.ozonDebugMenuComponentImpl.ozonDebugMenuEventsProvider), d.a(this.ozonDebugMenuComponentImpl.checkoutGroupProvider), d.a(this.ozonDebugMenuComponentImpl.localizationGroupProvider), d.a(this.ozonDebugMenuComponentImpl.fontScaleDebugMenuProvider));
                    case 1:
                        return (T) new AbToggleRouterImpl();
                    case 2:
                        return (T) new DeeplinkGroupProvider((g) this.ozonDebugMenuComponentImpl.getOzonRouterProvider.get());
                    case 3:
                        T t2 = (T) this.ozonDebugMenuComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(t2);
                        return t2;
                    case 4:
                        T t11 = (T) this.ozonDebugMenuComponentImpl.storageComponentApi.getEnvironmentService();
                        j.c(t11);
                        return t11;
                    case 5:
                        DebugToolsService debugToolService = this.ozonDebugMenuComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService);
                        return (T) new EnvironmentGroupProvider(debugToolService, (EnvironmentService) this.ozonDebugMenuComponentImpl.getEnvironmentServiceProvider.get());
                    case 6:
                        return (T) new ComposerGroupProvider((g) this.ozonDebugMenuComponentImpl.getOzonRouterProvider.get());
                    case 7:
                        SharedPreferences sharedPreferences = this.ozonDebugMenuComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        return (T) new TrackerGroupProvider(sharedPreferences);
                    case 8:
                        HttpLoggingLevelStorage httpLoggingLevelStorage = this.ozonDebugMenuComponentImpl.storageComponentApi.getHttpLoggingLevelStorage();
                        j.c(httpLoggingLevelStorage);
                        return (T) new HttpLoggingGroupProvider(httpLoggingLevelStorage);
                    case 9:
                        return (T) new AnalyticsGroupProvider((g) this.ozonDebugMenuComponentImpl.getOzonRouterProvider.get());
                    case 10:
                        ApplicationInfoDataSource applicationInfoStorage = this.ozonDebugMenuComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage);
                        AuthTokenDataSource authTokenDataSource = this.ozonDebugMenuComponentImpl.storageComponentApi.getAuthTokenDataSource();
                        j.c(authTokenDataSource);
                        OzonIdCookieEvents ozonIdCookieEvents = this.ozonDebugMenuComponentImpl.storageComponentApi.getOzonIdCookieEvents();
                        j.c(ozonIdCookieEvents);
                        OzonPushManager ozonPushManager = this.ozonDebugMenuComponentImpl.pushComponentApi.getOzonPushManager();
                        j.c(ozonPushManager);
                        c prefetchManager = this.ozonDebugMenuComponentImpl.composerPerformanceComponentApi.getPrefetchManager();
                        j.c(prefetchManager);
                        OzonDebugMenuEvents ozonDebugMenuEvents = (OzonDebugMenuEvents) this.ozonDebugMenuComponentImpl.ozonDebugMenuEventsProvider.get();
                        Ob0.a ozonIdAppApi = this.ozonDebugMenuComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(ozonIdAppApi);
                        return (T) new InformationGroupProvider(applicationInfoStorage, authTokenDataSource, ozonIdCookieEvents, ozonPushManager, prefetchManager, ozonDebugMenuEvents, ozonIdAppApi);
                    case 11:
                        Ob0.a ozonIdAppApi2 = this.ozonDebugMenuComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(ozonIdAppApi2);
                        return (T) new OzonDebugMenuEvents(ozonIdAppApi2);
                    case 12:
                        DebugToolsService debugToolService2 = this.ozonDebugMenuComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService2);
                        return (T) new HttpHeadersGroupProvider(debugToolService2, (g) this.ozonDebugMenuComponentImpl.getOzonRouterProvider.get());
                    case 13:
                        AppVersionStorage appVersionStorage = this.ozonDebugMenuComponentImpl.storageComponentApi.getAppVersionStorage();
                        j.c(appVersionStorage);
                        AndroidPlatformComponentConfig androidPlatformComponentConfig = (AndroidPlatformComponentConfig) this.ozonDebugMenuComponentImpl.getAndroidPlatformComponentConfigProvider.get();
                        DebugToolsService debugToolService3 = this.ozonDebugMenuComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService3);
                        FeatureService featureService = this.ozonDebugMenuComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        InAppUpdateIntervalStorage intervalStorage = this.ozonDebugMenuComponentImpl.inAppUpdateComponentApi.getIntervalStorage();
                        j.c(intervalStorage);
                        g gVar = (g) this.ozonDebugMenuComponentImpl.getOzonRouterProvider.get();
                        SharedPreferences sharedPreferences2 = this.ozonDebugMenuComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences2);
                        return (T) new DebugFeaturesGroupProvider(appVersionStorage, androidPlatformComponentConfig, debugToolService3, featureService, intervalStorage, gVar, sharedPreferences2, (AbToggleRouter) this.ozonDebugMenuComponentImpl.abToggleRouterImplProvider.get());
                    case 14:
                        T t12 = (T) this.ozonDebugMenuComponentImpl.androidPlatformComponentApi.getAndroidPlatformComponentConfig();
                        j.c(t12);
                        return t12;
                    case 15:
                        PlayerPreferences playerPreferences = this.ozonDebugMenuComponentImpl.videoComponentApi.getPlayerPreferences();
                        j.c(playerPreferences);
                        return (T) new PlayerGroupProvider(playerPreferences);
                    case 16:
                        MapPreferences mapPreferences = this.ozonDebugMenuComponentImpl.locationComponentApi.getMapPreferences();
                        j.c(mapPreferences);
                        return (T) new MapsGroupProvider(mapPreferences);
                    case 17:
                        Application application2 = this.ozonDebugMenuComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application2);
                        return (T) new SentryGroupProvider(application2);
                    case 18:
                        T t13 = (T) this.ozonDebugMenuComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(t13);
                        return t13;
                    case 19:
                        SberPayPreferences sberPayPreferences = this.ozonDebugMenuComponentImpl.checkoutPaymentComponentApi.getSberPayPreferences();
                        j.c(sberPayPreferences);
                        return (T) new CheckoutGroupProvider(sberPayPreferences);
                    case 20:
                        LocalizationDebugPreferences localizationDebugPreferences = this.ozonDebugMenuComponentImpl.appLocaleComponentApi.getLocalizationDebugPreferences();
                        j.c(localizationDebugPreferences);
                        return (T) new LocalizationGroupProvider(localizationDebugPreferences);
                    case 21:
                        FontScaleProvider fontScaleProvider = this.ozonDebugMenuComponentImpl.analyticsComponentApi.getFontScaleProvider();
                        j.c(fontScaleProvider);
                        return (T) new FontScaleDebugMenuProvider(fontScaleProvider);
                    default:
                        throw new AssertionError(this.f92498id);
                }
            }
        }

        /* synthetic */ OzonDebugMenuComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, PushComponentApi pushComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NetworkUserDependencies networkUserDependencies, VideoComponentApi videoComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi, AppLocaleComponentApi appLocaleComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(contextComponentDependencies, androidPlatformComponentApi, composerPerformanceComponentApi, storageComponentApi, navigationComponentApi, pushComponentApi, networkComponentApi, networkOzonIdComponentApi, networkUserDependencies, videoComponentApi, inAppUpdateComponentApi, checkoutPaymentComponentApi, locationComponentApi, appLocaleComponentApi, analyticsComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, PushComponentApi pushComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NetworkUserDependencies networkUserDependencies, VideoComponentApi videoComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi, AppLocaleComponentApi appLocaleComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.abToggleRouterImplProvider = new SwitchingProvider(this.ozonDebugMenuComponentImpl, 1);
            this.getOzonRouterProvider = new SwitchingProvider(this.ozonDebugMenuComponentImpl, 3);
            this.deeplinkGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 2));
            this.getEnvironmentServiceProvider = new SwitchingProvider(this.ozonDebugMenuComponentImpl, 4);
            this.environmentGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 5));
            this.composerGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 6));
            this.trackerGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 7));
            this.httpLoggingGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 8));
            this.analyticsGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 9));
            this.ozonDebugMenuEventsProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 11));
            this.informationGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 10));
            this.httpHeadersGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 12));
            this.getAndroidPlatformComponentConfigProvider = new SwitchingProvider(this.ozonDebugMenuComponentImpl, 14);
            this.debugFeaturesGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 13));
            this.playerGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 15));
            this.mapsGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 16));
            this.sentryGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 17));
            this.getFeatureCheckerProvider = new SwitchingProvider(this.ozonDebugMenuComponentImpl, 18);
            this.checkoutGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 19));
            this.localizationGroupProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 20));
            this.fontScaleDebugMenuProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 21));
            this.ozonDebugMenuHelperImplProvider = d.b(new SwitchingProvider(this.ozonDebugMenuComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi
        public OzonDebugMenuHelper getOzonDebugMenuHelper() {
            return this.ozonDebugMenuHelperImplProvider.get();
        }

        private OzonDebugMenuComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, PushComponentApi pushComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NetworkUserDependencies networkUserDependencies, VideoComponentApi videoComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi, AppLocaleComponentApi appLocaleComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.ozonDebugMenuComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkUserDependencies = networkUserDependencies;
            this.navigationComponentApi = navigationComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.pushComponentApi = pushComponentApi;
            this.composerPerformanceComponentApi = composerPerformanceComponentApi;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.inAppUpdateComponentApi = inAppUpdateComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.locationComponentApi = locationComponentApi;
            this.checkoutPaymentComponentApi = checkoutPaymentComponentApi;
            this.appLocaleComponentApi = appLocaleComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            initialize(contextComponentDependencies, androidPlatformComponentApi, composerPerformanceComponentApi, storageComponentApi, navigationComponentApi, pushComponentApi, networkComponentApi, networkOzonIdComponentApi, networkUserDependencies, videoComponentApi, inAppUpdateComponentApi, checkoutPaymentComponentApi, locationComponentApi, appLocaleComponentApi, analyticsComponentApi);
        }
    }

    public static OzonDebugMenuComponent.Factory factory() {
        return new Factory(0);
    }
}
