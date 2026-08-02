package ru.ozon.app.android.analytics.di;

import Jb.d;
import Jb.j;
import Pc.a;
import Qj0.I;
import Qj0.InterfaceC3896p;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.google.common.collect.A;
import ei0.InterfaceC6369b;
import fi0.e;
import fi0.w;
import java.util.List;
import java.util.Set;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;
import ru.ozon.app.android.analytics.AnalyticsCache;
import ru.ozon.app.android.analytics.AnalyticsCacheImpl;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponent;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_BindPerformanceTrackerDelegateFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_ProvideAnalyticsDataLayerFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_ProvideAnalyticsEventExecutorFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_ProvideFontScaleProviderFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_ProvideInterceptedPerformanceTrackerFactory;
import ru.ozon.app.android.analytics.di.module.AnalyticsModule_Companion_ProvideOpenGlVersionProviderFactory;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.analytics.plugins.OzonTrackerPlugin;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.plugins.PluginsManagerImpl;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorageImpl;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerPlugin;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;
import ru.ozon.app.android.analytics.plugins.di.AnalyticsPluginModule;
import ru.ozon.app.android.analytics.plugins.di.AnalyticsPluginModule_ProvideAppsFlyerPluginFactory;
import ru.ozon.app.android.analytics.plugins.di.AnalyticsPluginModule_ProvidePluginsFactory;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalyticsImpl;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;
import ru.ozon.app.android.analytics.startup.OpenGlVersionProvider;
import ru.ozon.app.android.analytics.startup.SystemLocaleProvider;
import ru.ozon.app.android.analytics.startup.SystemLocaleProviderImpl;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;
import ru.ozon.app.android.analytics.tracker.di.TrackerModule;
import ru.ozon.app.android.analytics.tracker.di.TrackerModule_ProvideCustomPropertyTrackerFactory;
import ru.ozon.app.android.analytics.tracker.di.TrackerModule_ProvideDeviceHardwareInfoProviderFactory;
import ru.ozon.app.android.analytics.tracker.di.TrackerModule_ProvideOzonTrackerFactory;
import ru.ozon.app.android.analytics.tracker.di.TrackerModule_ProvideTrackerDynamicSettingsFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerAnalyticsComponent {

    private static final class AnalyticsComponentImpl implements AnalyticsComponent {
        private a<AnalyticsCacheImpl> analyticsCacheImplProvider;
        private final AnalyticsComponentDependencies analyticsComponentDependencies;
        private final AnalyticsComponentImpl analyticsComponentImpl;
        private final AnalyticsPluginModule analyticsPluginModule;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<AppLaunchAnalyticsImpl> appLaunchAnalyticsImplProvider;
        private a<AppsFlyerConversionStorageImpl> appsFlyerConversionStorageImplProvider;
        private a<AnalyticsCache> bindAnalyticsCacheProvider;
        private a<AppLaunchAnalytics> bindAppLaunchAnalyticsProvider;
        private a<AppsFlyerConversionStorage> bindAppsFlyerConversionStorageProvider;
        private a<PerformanceTrackerDelegate> bindPerformanceTrackerDelegateProvider;
        private a<SystemLocaleProvider> bindSystemLocaleProvider;
        private a<PluginsManager> bindsPluginsManagerProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<PluginsManagerImpl> pluginsManagerImplProvider;
        private a<AnalyticsDataLayer> provideAnalyticsDataLayerProvider;
        private a<AnalyticsEventExecutor> provideAnalyticsEventExecutorProvider;
        private a<e> provideCustomPropertyTrackerProvider;
        private a<DeviceHardwareInfoProvider> provideDeviceHardwareInfoProvider;
        private a<FontScaleProvider> provideFontScaleProvider;
        private a<InterfaceC3896p> provideInterceptedPerformanceTrackerProvider;
        private a<OpenGlVersionProvider> provideOpenGlVersionProvider;
        private a<InterfaceC6369b> provideOzonTrackerProvider;
        private a<Set<AnalyticsPlugin>> providePluginsProvider;
        private a<w> provideTrackerDynamicSettingsProvider;
        private a<SystemLocaleProviderImpl> systemLocaleProviderImplProvider;
        private final TrackerModule trackerModule;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AnalyticsComponentImpl analyticsComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92157id;

            SwitchingProvider(AnalyticsComponentImpl analyticsComponentImpl, int i11) {
                this.analyticsComponentImpl = analyticsComponentImpl;
                this.f92157id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92157id) {
                    case 0:
                        return (T) AnalyticsModule_Companion_ProvideAnalyticsDataLayerFactory.provideAnalyticsDataLayer();
                    case 1:
                        return (T) new AnalyticsCacheImpl();
                    case 2:
                        AnalyticsEventExecutor analyticsEventExecutor = (AnalyticsEventExecutor) this.analyticsComponentImpl.provideAnalyticsEventExecutorProvider.get();
                        AnalyticsComponentConfig analyticsComponentConfig = this.analyticsComponentImpl.analyticsComponentDependencies.getAnalyticsComponentConfig();
                        j.c(analyticsComponentConfig);
                        return (T) new PluginsManagerImpl(analyticsEventExecutor, analyticsComponentConfig, (AnalyticsCache) this.analyticsComponentImpl.bindAnalyticsCacheProvider.get(), this.analyticsComponentImpl.setOfAnalyticsPlugin());
                    case 3:
                        return (T) AnalyticsModule_Companion_ProvideAnalyticsEventExecutorFactory.provideAnalyticsEventExecutor();
                    case 4:
                        return (T) AnalyticsPluginModule_ProvidePluginsFactory.providePlugins(this.analyticsComponentImpl.analyticsPluginModule, this.analyticsComponentImpl.appsFlyerPlugin(), this.analyticsComponentImpl.ozonTrackerPlugin());
                    case 5:
                        TrackerModule trackerModule = this.analyticsComponentImpl.trackerModule;
                        Context context = this.analyticsComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        OzonTrackerSettings ozonTrackerSettings = this.analyticsComponentImpl.analyticsComponentDependencies.getOzonTrackerSettings();
                        j.c(ozonTrackerSettings);
                        return (T) TrackerModule_ProvideOzonTrackerFactory.provideOzonTracker(trackerModule, context, ozonTrackerSettings);
                    case 6:
                        TrackerModule trackerModule2 = this.analyticsComponentImpl.trackerModule;
                        OzonTrackerSettings ozonTrackerSettings2 = this.analyticsComponentImpl.analyticsComponentDependencies.getOzonTrackerSettings();
                        j.c(ozonTrackerSettings2);
                        return (T) TrackerModule_ProvideTrackerDynamicSettingsFactory.provideTrackerDynamicSettings(trackerModule2, ozonTrackerSettings2);
                    case 7:
                        return (T) TrackerModule_ProvideCustomPropertyTrackerFactory.provideCustomPropertyTracker(this.analyticsComponentImpl.trackerModule, (InterfaceC6369b) this.analyticsComponentImpl.provideOzonTrackerProvider.get());
                    case 8:
                        return (T) TrackerModule_ProvideDeviceHardwareInfoProviderFactory.provideDeviceHardwareInfoProvider(this.analyticsComponentImpl.trackerModule, (InterfaceC6369b) this.analyticsComponentImpl.provideOzonTrackerProvider.get());
                    case 9:
                        AnalyticsDataLayer analyticsDataLayer = (AnalyticsDataLayer) this.analyticsComponentImpl.provideAnalyticsDataLayerProvider.get();
                        PluginsManager pluginsManager = (PluginsManager) this.analyticsComponentImpl.bindsPluginsManagerProvider.get();
                        Sg.a analyticsScreenStorage = this.analyticsComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        return (T) new AppLaunchAnalyticsImpl(analyticsDataLayer, pluginsManager, analyticsScreenStorage, (FontScaleProvider) this.analyticsComponentImpl.provideFontScaleProvider.get(), (OpenGlVersionProvider) this.analyticsComponentImpl.provideOpenGlVersionProvider.get(), (SystemLocaleProvider) this.analyticsComponentImpl.bindSystemLocaleProvider.get());
                    case 10:
                        Context context2 = this.analyticsComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) AnalyticsModule_Companion_ProvideFontScaleProviderFactory.provideFontScaleProvider(context2);
                    case 11:
                        Context context3 = this.analyticsComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) AnalyticsModule_Companion_ProvideOpenGlVersionProviderFactory.provideOpenGlVersionProvider(context3);
                    case 12:
                        return (T) new SystemLocaleProviderImpl();
                    case 13:
                        Context context4 = this.analyticsComponentImpl.contextComponentDependencies.getContext();
                        j.c(context4);
                        AppsFlyerLib appsFlyerLib = this.analyticsComponentImpl.analyticsComponentDependencies.getAppsFlyerLib();
                        j.c(appsFlyerLib);
                        return (T) new AppsFlyerConversionStorageImpl(context4, appsFlyerLib);
                    case 14:
                        return (T) AnalyticsModule_Companion_BindPerformanceTrackerDelegateFactory.bindPerformanceTrackerDelegate((InterfaceC3896p) this.analyticsComponentImpl.provideInterceptedPerformanceTrackerProvider.get());
                    case 15:
                        InterfaceC6369b interfaceC6369b = (InterfaceC6369b) this.analyticsComponentImpl.provideOzonTrackerProvider.get();
                        List<I> performanceTrackerInterceptors = this.analyticsComponentImpl.analyticsComponentDependencies.getPerformanceTrackerInterceptors();
                        j.c(performanceTrackerInterceptors);
                        return (T) AnalyticsModule_Companion_ProvideInterceptedPerformanceTrackerFactory.provideInterceptedPerformanceTracker(interfaceC6369b, performanceTrackerInterceptors);
                    default:
                        throw new AssertionError(this.f92157id);
                }
            }
        }

        /* synthetic */ AnalyticsComponentImpl(AnalyticsPluginModule analyticsPluginModule, TrackerModule trackerModule, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentDependencies analyticsComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(analyticsPluginModule, trackerModule, contextComponentDependencies, analyticsComponentDependencies, firebaseAnalyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AppsFlyerPlugin appsFlyerPlugin() {
            AnalyticsPluginModule analyticsPluginModule = this.analyticsPluginModule;
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            AppsFlyerLib appsFlyerLib = this.analyticsComponentDependencies.getAppsFlyerLib();
            j.c(appsFlyerLib);
            return AnalyticsPluginModule_ProvideAppsFlyerPluginFactory.provideAppsFlyerPlugin(analyticsPluginModule, context, appsFlyerLib);
        }

        private void initialize(AnalyticsPluginModule analyticsPluginModule, TrackerModule trackerModule, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentDependencies analyticsComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.provideAnalyticsDataLayerProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.analyticsComponentImpl, 1);
            this.analyticsCacheImplProvider = switchingProvider;
            this.bindAnalyticsCacheProvider = d.b(switchingProvider);
            this.provideAnalyticsEventExecutorProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 3));
            this.provideOzonTrackerProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 5));
            this.providePluginsProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 4));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.analyticsComponentImpl, 2);
            this.pluginsManagerImplProvider = switchingProvider2;
            this.bindsPluginsManagerProvider = d.b(switchingProvider2);
            this.provideTrackerDynamicSettingsProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 6));
            this.provideCustomPropertyTrackerProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 7));
            this.provideDeviceHardwareInfoProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 8));
            this.provideFontScaleProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 10));
            this.provideOpenGlVersionProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 11));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.analyticsComponentImpl, 12);
            this.systemLocaleProviderImplProvider = switchingProvider3;
            this.bindSystemLocaleProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.analyticsComponentImpl, 9);
            this.appLaunchAnalyticsImplProvider = switchingProvider4;
            this.bindAppLaunchAnalyticsProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.analyticsComponentImpl, 13);
            this.appsFlyerConversionStorageImplProvider = switchingProvider5;
            this.bindAppsFlyerConversionStorageProvider = d.b(switchingProvider5);
            this.provideInterceptedPerformanceTrackerProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 15));
            this.bindPerformanceTrackerDelegateProvider = d.b(new SwitchingProvider(this.analyticsComponentImpl, 14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonTrackerPlugin ozonTrackerPlugin() {
            InterfaceC6369b interfaceC6369b = this.provideOzonTrackerProvider.get();
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new OzonTrackerPlugin(interfaceC6369b, applicationAnalyticsScreenStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<AnalyticsPlugin> setOfAnalyticsPlugin() {
            return A.u(this.providePluginsProvider.get());
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AnalyticsCache getAnalyticsCache() {
            return this.bindAnalyticsCacheProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AnalyticsDataLayer getAnalyticsDataLayer() {
            return this.provideAnalyticsDataLayerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AnalyticsEventExecutor getAnalyticsEventExecutor() {
            return this.provideAnalyticsEventExecutorProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AppLaunchAnalytics getAppLaunchAnalytics() {
            return this.bindAppLaunchAnalyticsProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AppStoreInfoProvider getAppStoreInfoProvider() {
            AppStoreInfoProvider appStoreInfoProvider = this.analyticsComponentDependencies.getAppStoreInfoProvider();
            j.c(appStoreInfoProvider);
            return appStoreInfoProvider;
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public AppsFlyerConversionStorage getAppsFlyerConversionStorage() {
            return this.bindAppsFlyerConversionStorageProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public e getCustomPropertyTracker() {
            return this.provideCustomPropertyTrackerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public DeviceHardwareInfoProvider getDeviceHardwareInfoProvider() {
            return this.provideDeviceHardwareInfoProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public FontScaleProvider getFontScaleProvider() {
            return this.provideFontScaleProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.PerformanceAnalyticsApi
        public InterfaceC3896p getInterceptedPerformanceTracker() {
            return this.provideInterceptedPerformanceTrackerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public InterfaceC6369b getOzonTracker() {
            return this.provideOzonTrackerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public PerformanceTrackerDelegate getPerformanceTrackerDelegate() {
            return this.bindPerformanceTrackerDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public PluginsManager getPluginsManager() {
            return this.bindsPluginsManagerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponentApi
        public w getTrackerDynamicSettings() {
            return this.provideTrackerDynamicSettingsProvider.get();
        }

        private AnalyticsComponentImpl(AnalyticsPluginModule analyticsPluginModule, TrackerModule trackerModule, ContextComponentDependencies contextComponentDependencies, AnalyticsComponentDependencies analyticsComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.analyticsComponentImpl = this;
            this.analyticsComponentDependencies = analyticsComponentDependencies;
            this.analyticsPluginModule = analyticsPluginModule;
            this.contextComponentDependencies = contextComponentDependencies;
            this.trackerModule = trackerModule;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(analyticsPluginModule, trackerModule, contextComponentDependencies, analyticsComponentDependencies, firebaseAnalyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements AnalyticsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.di.AnalyticsComponent.Factory
        public AnalyticsComponent create(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentDependencies analyticsComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            analyticsComponentDependencies.getClass();
            firebaseAnalyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new AnalyticsComponentImpl(new AnalyticsPluginModule(), new TrackerModule(), contextComponentDependencies, analyticsComponentDependencies, firebaseAnalyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AnalyticsComponent.Factory factory() {
        return new Factory(0);
    }
}
