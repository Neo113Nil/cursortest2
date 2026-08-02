package ru.ozon.app.android.analytics.di;

import Fb0.e;
import Jb.d;
import Jb.j;
import Pc.a;
import Qj0.I;
import We.InterfaceC4875q;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AppsFlyerLib;
import fi0.InterfaceC6571a;
import fi0.c;
import java.util.List;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.advertising.di.AdvertisingServiceComponentApi;
import ru.ozon.app.android.analytics.callback.VideoAnalyzerForceSendingPerfEventsCallback;
import ru.ozon.app.android.analytics.di.AnalyticsDependencyComponent;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule_Companion_ProvideAnalyticsComponentConfigFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule_Companion_ProvideAppsFlyerFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule_Companion_ProvideCurrentPageProviderFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule_Companion_ProvideOzonTrackerSettingsFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule_Companion_ProvidePerformanceTrackerInterceptorsFactory;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.store.AppStoreInfoProviderImpl;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;
import ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorage;
import ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorageImpl;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.UserStatusStorage;

/* loaded from: classes6.dex */
public final class DaggerAnalyticsDependencyComponent {

    private static final class AnalyticsDependencyComponentImpl implements AnalyticsDependencyComponent {
        private final AdvertisingServiceComponentApi advertisingServiceComponentApi;
        private final AnalyticsDependencyComponentImpl analyticsDependencyComponentImpl;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<AppStoreInfoProviderImpl> appStoreInfoProviderImplProvider;
        private final ApplicationComponent applicationComponent;
        private a<AppStoreInfoProvider> bindsAppStoreInfoProvider;
        private a<TrackerLoggerSettingsStorage> bindsTrackerLoggerSettingsStorageProvider;
        private final Limb2ComponentApi limb2ComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<AnalyticsComponentConfig> provideAnalyticsComponentConfigProvider;
        private a<AppsFlyerLib> provideAppsFlyerProvider;
        private a<c> provideCurrentPageProvider;
        private a<OzonTrackerSettings> provideOzonTrackerSettingsProvider;
        private a<List<I>> providePerformanceTrackerInterceptorsProvider;
        private final StorageComponentApi storageComponentApi;
        private a<TrackerLoggerSettingsStorageImpl> trackerLoggerSettingsStorageImplProvider;
        private a<VideoAnalyzerForceSendingPerfEventsCallback> videoAnalyzerForceSendingPerfEventsCallbackProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AnalyticsDependencyComponentImpl analyticsDependencyComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92158id;

            SwitchingProvider(AnalyticsDependencyComponentImpl analyticsDependencyComponentImpl, int i11) {
                this.analyticsDependencyComponentImpl = analyticsDependencyComponentImpl;
                this.f92158id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92158id) {
                    case 0:
                        FeatureService featureService = this.analyticsDependencyComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) AnalyticsDependencyModule_Companion_ProvideAnalyticsComponentConfigFactory.provideAnalyticsComponentConfig(featureService, this.analyticsDependencyComponentImpl.applicationComponent.getShaker());
                    case 1:
                        Context context = this.analyticsDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context);
                        FeatureService featureService2 = this.analyticsDependencyComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        AppsFlyerLib appsFlyerLib = (AppsFlyerLib) this.analyticsDependencyComponentImpl.provideAppsFlyerProvider.get();
                        DeviceType deviceType = this.analyticsDependencyComponentImpl.applicationComponent.getDeviceType();
                        j.c(deviceType);
                        AppStoreInfoProvider appStoreInfoProvider = (AppStoreInfoProvider) this.analyticsDependencyComponentImpl.bindsAppStoreInfoProvider.get();
                        InterfaceC4875q cookieJar = this.analyticsDependencyComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        InterfaceC6571a advertisingService = this.analyticsDependencyComponentImpl.advertisingServiceComponentApi.getAdvertisingService();
                        e appDomain = this.analyticsDependencyComponentImpl.applicationComponent.getAppDomain();
                        j.c(appDomain);
                        DebugHeaderService debugHeaderService = this.analyticsDependencyComponentImpl.networkComponentApi.getDebugHeaderService();
                        j.c(debugHeaderService);
                        TrackerLoggerSettingsStorage trackerLoggerSettingsStorage = (TrackerLoggerSettingsStorage) this.analyticsDependencyComponentImpl.bindsTrackerLoggerSettingsStorageProvider.get();
                        c cVar = (c) this.analyticsDependencyComponentImpl.provideCurrentPageProvider.get();
                        Sg.a applicationAnalyticsScreenStorage = this.analyticsDependencyComponentImpl.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                        j.c(applicationAnalyticsScreenStorage);
                        VideoAnalyzerForceSendingPerfEventsCallback videoAnalyzerForceSendingPerfEventsCallback = (VideoAnalyzerForceSendingPerfEventsCallback) this.analyticsDependencyComponentImpl.videoAnalyzerForceSendingPerfEventsCallbackProvider.get();
                        AppVersionService appVersionService = this.analyticsDependencyComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        String metricsDomainName = this.analyticsDependencyComponentImpl.applicationComponent.getMetricsDomainName();
                        j.c(metricsDomainName);
                        Ld0.c ozonLimbDiStore = this.analyticsDependencyComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) AnalyticsDependencyModule_Companion_ProvideOzonTrackerSettingsFactory.provideOzonTrackerSettings(context, featureService2, appsFlyerLib, deviceType, appStoreInfoProvider, cookieJar, advertisingService, appDomain, debugHeaderService, trackerLoggerSettingsStorage, cVar, applicationAnalyticsScreenStorage, videoAnalyzerForceSendingPerfEventsCallback, appVersionService, metricsDomainName, ozonLimbDiStore);
                    case 2:
                        return (T) AnalyticsDependencyModule_Companion_ProvideAppsFlyerFactory.provideAppsFlyer();
                    case 3:
                        Context context2 = this.analyticsDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context2);
                        return (T) new AppStoreInfoProviderImpl(context2);
                    case 4:
                        SharedPreferences sharedPreferences = this.analyticsDependencyComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        return (T) new TrackerLoggerSettingsStorageImpl(sharedPreferences);
                    case 5:
                        Sg.a applicationAnalyticsScreenStorage2 = this.analyticsDependencyComponentImpl.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                        j.c(applicationAnalyticsScreenStorage2);
                        return (T) AnalyticsDependencyModule_Companion_ProvideCurrentPageProviderFactory.provideCurrentPageProvider(applicationAnalyticsScreenStorage2);
                    case 6:
                        UserStatusStorage userStatusStorage = this.analyticsDependencyComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        return (T) new VideoAnalyzerForceSendingPerfEventsCallback(userStatusStorage);
                    case 7:
                        FeatureChecker featureChecker = this.analyticsDependencyComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) AnalyticsDependencyModule_Companion_ProvidePerformanceTrackerInterceptorsFactory.providePerformanceTrackerInterceptors(featureChecker);
                    default:
                        throw new AssertionError(this.f92158id);
                }
            }
        }

        /* synthetic */ AnalyticsDependencyComponentImpl(ApplicationComponent applicationComponent, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, AdvertisingServiceComponentApi advertisingServiceComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(applicationComponent, networkComponentApi, storageComponentApi, limb2ComponentApi, advertisingServiceComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ApplicationComponent applicationComponent, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, AdvertisingServiceComponentApi advertisingServiceComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.provideAnalyticsComponentConfigProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 0));
            this.provideAppsFlyerProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 2));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.analyticsDependencyComponentImpl, 3);
            this.appStoreInfoProviderImplProvider = switchingProvider;
            this.bindsAppStoreInfoProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.analyticsDependencyComponentImpl, 4);
            this.trackerLoggerSettingsStorageImplProvider = switchingProvider2;
            this.bindsTrackerLoggerSettingsStorageProvider = d.b(switchingProvider2);
            this.provideCurrentPageProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 5));
            this.videoAnalyzerForceSendingPerfEventsCallbackProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 6));
            this.provideOzonTrackerSettingsProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 1));
            this.providePerformanceTrackerInterceptorsProvider = d.b(new SwitchingProvider(this.analyticsDependencyComponentImpl, 7));
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentDependencies
        public AnalyticsComponentConfig getAnalyticsComponentConfig() {
            return this.provideAnalyticsComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentDependencies
        public AppStoreInfoProvider getAppStoreInfoProvider() {
            return this.bindsAppStoreInfoProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentDependencies
        public AppsFlyerLib getAppsFlyerLib() {
            return this.provideAppsFlyerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentDependencies
        public OzonTrackerSettings getOzonTrackerSettings() {
            return this.provideOzonTrackerSettingsProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentDependencies
        public List<I> getPerformanceTrackerInterceptors() {
            return this.providePerformanceTrackerInterceptorsProvider.get();
        }

        private AnalyticsDependencyComponentImpl(ApplicationComponent applicationComponent, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, AdvertisingServiceComponentApi advertisingServiceComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.analyticsDependencyComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.applicationComponent = applicationComponent;
            this.advertisingServiceComponentApi = advertisingServiceComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(applicationComponent, networkComponentApi, storageComponentApi, limb2ComponentApi, advertisingServiceComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements AnalyticsDependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsDependencyComponent.Factory
        public AnalyticsDependencyComponent create(ApplicationComponent applicationComponent, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AdvertisingServiceComponentApi advertisingServiceComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            applicationComponent.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            advertisingServiceComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            limb2ComponentApi.getClass();
            return new AnalyticsDependencyComponentImpl(applicationComponent, networkComponentApi, storageComponentApi, limb2ComponentApi, advertisingServiceComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AnalyticsDependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
