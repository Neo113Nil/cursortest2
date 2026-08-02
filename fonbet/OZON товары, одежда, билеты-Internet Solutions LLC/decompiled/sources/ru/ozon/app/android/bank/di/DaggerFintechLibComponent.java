package ru.ozon.app.android.bank.di;

import GZ.g;
import GZ.k;
import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import T80.b;
import We.InterfaceC4875q;
import android.app.Application;
import android.content.Context;
import b40.InterfaceC5539a;
import b90.C5594a;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import i30.C7004a;
import qj.C9067a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.bank.di.FintechLibComponent;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.bank.externals.OzonTrackerPluginInterctorExternal;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;

/* loaded from: classes6.dex */
public final class DaggerFintechLibComponent {

    private static final class Builder implements FintechLibComponent.Builder {
        private AccountComponentApi accountComponentApi;
        private ActionComponentApi actionComponentApi;
        private AnalyticsComponentApi analyticsComponentApi;
        private AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private AndroidPlatformComponentApi androidPlatformComponentApi;
        private ContextComponentDependencies contextComponentDependencies;
        private FintechComponentDependencies fintechComponentDependencies;
        private Limb2ComponentApi limb2ComponentApi;
        private LocationComponentApi locationComponentApi;
        private NavigationComponentApi navigationComponentApi;
        private NetworkComponentApi networkComponentApi;
        private NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private OzonMapComponentApi ozonMapComponentApi;
        private StorageComponentApi storageComponentApi;

        /* synthetic */ Builder(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder accountComponentApi(AccountComponentApi accountComponentApi) {
            accountComponentApi.getClass();
            this.accountComponentApi = accountComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder actionComponentApi(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            this.actionComponentApi = actionComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder analyticsComponentApi(AnalyticsComponentApi analyticsComponentApi) {
            analyticsComponentApi.getClass();
            this.analyticsComponentApi = analyticsComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder analyticsScreenStorageComponentApi(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            analyticsScreenStorageComponentApi.getClass();
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder androidPlatformComponentApi(AndroidPlatformComponentApi androidPlatformComponentApi) {
            androidPlatformComponentApi.getClass();
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public FintechLibComponent build() {
            j.a(NavigationComponentApi.class, this.navigationComponentApi);
            j.a(ContextComponentDependencies.class, this.contextComponentDependencies);
            j.a(StorageComponentApi.class, this.storageComponentApi);
            j.a(AndroidPlatformComponentApi.class, this.androidPlatformComponentApi);
            j.a(NetworkComponentApi.class, this.networkComponentApi);
            j.a(NetworkOzonIdComponentApi.class, this.networkOzonIdComponentApi);
            j.a(AnalyticsComponentApi.class, this.analyticsComponentApi);
            j.a(AnalyticsScreenStorageComponentApi.class, this.analyticsScreenStorageComponentApi);
            j.a(OzonMapComponentApi.class, this.ozonMapComponentApi);
            j.a(AccountComponentApi.class, this.accountComponentApi);
            j.a(LocationComponentApi.class, this.locationComponentApi);
            j.a(ActionComponentApi.class, this.actionComponentApi);
            j.a(FintechComponentDependencies.class, this.fintechComponentDependencies);
            j.a(Limb2ComponentApi.class, this.limb2ComponentApi);
            return new FintechLibComponentImpl(new FintechFinanceModule(), new FintechRkoModule(), new FintechPayModule(), new FintechEsiaModule(), this.contextComponentDependencies, this.navigationComponentApi, this.networkComponentApi, this.networkOzonIdComponentApi, this.storageComponentApi, this.locationComponentApi, this.androidPlatformComponentApi, this.analyticsComponentApi, this.analyticsScreenStorageComponentApi, this.ozonMapComponentApi, this.accountComponentApi, this.actionComponentApi, this.fintechComponentDependencies, this.limb2ComponentApi, 0);
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder contextComponentDependencies(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            this.contextComponentDependencies = contextComponentDependencies;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder fintechComponentDependencies(FintechComponentDependencies fintechComponentDependencies) {
            fintechComponentDependencies.getClass();
            this.fintechComponentDependencies = fintechComponentDependencies;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder limb2ComponentApi(Limb2ComponentApi limb2ComponentApi) {
            limb2ComponentApi.getClass();
            this.limb2ComponentApi = limb2ComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder locationComponentApi(LocationComponentApi locationComponentApi) {
            locationComponentApi.getClass();
            this.locationComponentApi = locationComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder navigationComponentApi(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            this.navigationComponentApi = navigationComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder networkComponentApi(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            this.networkComponentApi = networkComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder networkOzonIdComponentApi(NetworkOzonIdComponentApi networkOzonIdComponentApi) {
            networkOzonIdComponentApi.getClass();
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder ozonMapComponentApi(OzonMapComponentApi ozonMapComponentApi) {
            ozonMapComponentApi.getClass();
            this.ozonMapComponentApi = ozonMapComponentApi;
            return this;
        }

        @Override // ru.ozon.app.android.bank.di.FintechLibComponent.Builder
        public Builder storageComponentApi(StorageComponentApi storageComponentApi) {
            storageComponentApi.getClass();
            this.storageComponentApi = storageComponentApi;
            return this;
        }

        private Builder() {
        }
    }

    private static final class FintechLibComponentImpl implements FintechLibComponent {
        private final FintechComponentDependencies fintechComponentDependencies;
        private final FintechLibComponentImpl fintechLibComponentImpl;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private a<AndroidPlatformComponentConfig> getAndroidPlatformComponentConfigProvider;
        private a<AppVersionService> getAppVersionServiceProvider;
        private a<AppVersionStorage> getAppVersionStorageProvider;
        private a<Sg.a> getApplicationAnalyticsScreenStorageProvider;
        private a<Application> getApplicationProvider;
        private a<AreaLocalStore> getAreaLocalStoreProvider;
        private a<Context> getContextProvider;
        private a<InterfaceC4875q> getCookieJarProvider;
        private a<DebugHeaderService> getDebugHeaderServiceProvider;
        private a<DebugToolsService> getDebugToolServiceProvider;
        private a<HZ.a> getDeeplinkHandlersCacheProvider;
        private a<EnvironmentService> getEnvironmentServiceProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<FintechUrls> getFintechUrlsProvider;
        private a<Moshi> getMoshiProvider;
        private a<C9067a> getNetworkInfoProvider;
        private a<c> getOzonLimbDiStoreProvider;
        private a<g> getOzonRouterProvider;
        private a<InterfaceC6369b> getOzonTrackerProvider;
        private a<k> getRouteFactoryProvider;
        private a<UserManager> getUserManagerProvider;
        private a<C10219a> provideAntiFraudConfigProvider;
        private a<BankTabBadgeManager> provideBankTabBadgeManagerProvider;
        private a<InterfaceC5539a> provideEsiaProvider;
        private a<ExternalFintechAuth> provideExternalFintechAuthProvider;
        private a<b> provideExternalFintechNavigationProvider;
        private a<ExternalFintechSettings> provideExternalFintechSettingsProvider;
        private a<ExternalFintechSettings> provideExternalFintechSettingsProvider2;
        private a<ExternalFintechSettings> provideExternalFintechSettingsProvider3;
        private a<ExternalNetworkSettings> provideExternalNetworkSettingsProvider;
        private a<ExternalNetworkSettings> provideExternalNetworkSettingsProvider2;
        private a<ExternalNetworkSettings> provideExternalNetworkSettingsProvider3;
        private a<C5594a> provideExternalOkHttpSettingsProvider;
        private a<C5594a> provideExternalOkHttpSettingsProvider2;
        private a<C5594a> provideExternalOkHttpSettingsProvider3;
        private a<FintechCookieJar> provideFintechCookieJarProvider;
        private a<FintechCoreLib> provideFintechCoreLibProvider;
        private a<FintechCoreLib> provideFintechCoreLibProvider2;
        private a<FintechCoreLib> provideFintechCoreLibProvider3;
        private a<O30.b> provideFintechLibTypeProvider;
        private a<O30.b> provideFintechLibTypeProvider2;
        private a<O30.b> provideFintechLibTypeProvider3;
        private a<C7004a> provideGraylogConfigProvider;
        private a<C7004a> provideGraylogConfigProvider2;
        private a<C7004a> provideGraylogConfigProvider3;
        private a<OzonTrackerPluginInterctorExternal> provideOzonTrackerPluginInterctorExternalProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        private static final class GetAndroidPlatformComponentConfigProvider implements a<AndroidPlatformComponentConfig> {
            private final AndroidPlatformComponentApi androidPlatformComponentApi;

            GetAndroidPlatformComponentConfigProvider(AndroidPlatformComponentApi androidPlatformComponentApi) {
                this.androidPlatformComponentApi = androidPlatformComponentApi;
            }

            @Override // Pc.a
            public AndroidPlatformComponentConfig get() {
                AndroidPlatformComponentConfig androidPlatformComponentConfig = this.androidPlatformComponentApi.getAndroidPlatformComponentConfig();
                j.c(androidPlatformComponentConfig);
                return androidPlatformComponentConfig;
            }
        }

        private static final class GetAppVersionServiceProvider implements a<AppVersionService> {
            private final NetworkComponentApi networkComponentApi;

            GetAppVersionServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public AppVersionService get() {
                AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
                j.c(appVersionService);
                return appVersionService;
            }
        }

        private static final class GetAppVersionStorageProvider implements a<AppVersionStorage> {
            private final StorageComponentApi storageComponentApi;

            GetAppVersionStorageProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public AppVersionStorage get() {
                AppVersionStorage appVersionStorage = this.storageComponentApi.getAppVersionStorage();
                j.c(appVersionStorage);
                return appVersionStorage;
            }
        }

        private static final class GetApplicationAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

            GetApplicationAnalyticsScreenStorageProvider(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
                this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                j.c(applicationAnalyticsScreenStorage);
                return applicationAnalyticsScreenStorage;
            }
        }

        private static final class GetApplicationProvider implements a<Application> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetApplicationProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Application get() {
                Application application = this.contextComponentDependencies.getApplication();
                j.c(application);
                return application;
            }
        }

        private static final class GetAreaLocalStoreProvider implements a<AreaLocalStore> {
            private final LocationComponentApi locationComponentApi;

            GetAreaLocalStoreProvider(LocationComponentApi locationComponentApi) {
                this.locationComponentApi = locationComponentApi;
            }

            @Override // Pc.a
            public AreaLocalStore get() {
                AreaLocalStore areaLocalStore = this.locationComponentApi.getAreaLocalStore();
                j.c(areaLocalStore);
                return areaLocalStore;
            }
        }

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        private static final class GetCookieJarProvider implements a<InterfaceC4875q> {
            private final NetworkComponentApi networkComponentApi;

            GetCookieJarProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public InterfaceC4875q get() {
                InterfaceC4875q cookieJar = this.networkComponentApi.getCookieJar();
                j.c(cookieJar);
                return cookieJar;
            }
        }

        private static final class GetDebugHeaderServiceProvider implements a<DebugHeaderService> {
            private final NetworkComponentApi networkComponentApi;

            GetDebugHeaderServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public DebugHeaderService get() {
                DebugHeaderService debugHeaderService = this.networkComponentApi.getDebugHeaderService();
                j.c(debugHeaderService);
                return debugHeaderService;
            }
        }

        private static final class GetDebugToolServiceProvider implements a<DebugToolsService> {
            private final StorageComponentApi storageComponentApi;

            GetDebugToolServiceProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public DebugToolsService get() {
                DebugToolsService debugToolService = this.storageComponentApi.getDebugToolService();
                j.c(debugToolService);
                return debugToolService;
            }
        }

        private static final class GetDeeplinkHandlersCacheProvider implements a<HZ.a> {
            private final NavigationComponentApi navigationComponentApi;

            GetDeeplinkHandlersCacheProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public HZ.a get() {
                HZ.a deeplinkHandlersCache = this.navigationComponentApi.getDeeplinkHandlersCache();
                j.c(deeplinkHandlersCache);
                return deeplinkHandlersCache;
            }
        }

        private static final class GetEnvironmentServiceProvider implements a<EnvironmentService> {
            private final StorageComponentApi storageComponentApi;

            GetEnvironmentServiceProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public EnvironmentService get() {
                EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
                j.c(environmentService);
                return environmentService;
            }
        }

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
            }
        }

        private static final class GetFintechUrlsProvider implements a<FintechUrls> {
            private final FintechComponentDependencies fintechComponentDependencies;

            GetFintechUrlsProvider(FintechComponentDependencies fintechComponentDependencies) {
                this.fintechComponentDependencies = fintechComponentDependencies;
            }

            @Override // Pc.a
            public FintechUrls get() {
                FintechUrls fintechUrls = this.fintechComponentDependencies.getFintechUrls();
                j.c(fintechUrls);
                return fintechUrls;
            }
        }

        private static final class GetMoshiProvider implements a<Moshi> {
            private final NetworkComponentApi networkComponentApi;

            GetMoshiProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Moshi get() {
                Moshi moshi = this.networkComponentApi.getMoshi();
                j.c(moshi);
                return moshi;
            }
        }

        private static final class GetNetworkInfoProviderProvider implements a<C9067a> {
            private final NetworkComponentApi networkComponentApi;

            GetNetworkInfoProviderProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public C9067a get() {
                C9067a networkInfoProvider = this.networkComponentApi.getNetworkInfoProvider();
                j.c(networkInfoProvider);
                return networkInfoProvider;
            }
        }

        private static final class GetOzonLimbDiStoreProvider implements a<c> {
            private final Limb2ComponentApi limb2ComponentApi;

            GetOzonLimbDiStoreProvider(Limb2ComponentApi limb2ComponentApi) {
                this.limb2ComponentApi = limb2ComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public c get() {
                c ozonLimbDiStore = this.limb2ComponentApi.getOzonLimbDiStore();
                j.c(ozonLimbDiStore);
                return ozonLimbDiStore;
            }
        }

        private static final class GetOzonRouterProvider implements a<g> {
            private final NavigationComponentApi navigationComponentApi;

            GetOzonRouterProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public g get() {
                g ozonRouter = this.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                return ozonRouter;
            }
        }

        private static final class GetOzonTrackerProvider implements a<InterfaceC6369b> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetOzonTrackerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public InterfaceC6369b get() {
                InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
                j.c(ozonTracker);
                return ozonTracker;
            }
        }

        private static final class GetRouteFactoryProvider implements a<k> {
            private final NavigationComponentApi navigationComponentApi;

            GetRouteFactoryProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public k get() {
                k routeFactory = this.navigationComponentApi.getRouteFactory();
                j.c(routeFactory);
                return routeFactory;
            }
        }

        private static final class GetUserManagerProvider implements a<UserManager> {
            private final AccountComponentApi accountComponentApi;

            GetUserManagerProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public UserManager get() {
                UserManager userManager = this.accountComponentApi.getUserManager();
                j.c(userManager);
                return userManager;
            }
        }

        /* synthetic */ FintechLibComponentImpl(FintechFinanceModule fintechFinanceModule, FintechRkoModule fintechRkoModule, FintechPayModule fintechPayModule, FintechEsiaModule fintechEsiaModule, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, OzonMapComponentApi ozonMapComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, FintechComponentDependencies fintechComponentDependencies, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(fintechFinanceModule, fintechRkoModule, fintechPayModule, fintechEsiaModule, contextComponentDependencies, navigationComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, locationComponentApi, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, ozonMapComponentApi, accountComponentApi, actionComponentApi, fintechComponentDependencies, limb2ComponentApi);
        }

        private void initialize(FintechFinanceModule fintechFinanceModule, FintechRkoModule fintechRkoModule, FintechPayModule fintechPayModule, FintechEsiaModule fintechEsiaModule, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, OzonMapComponentApi ozonMapComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, FintechComponentDependencies fintechComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            this.getApplicationProvider = new GetApplicationProvider(contextComponentDependencies);
            this.getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.getRouteFactoryProvider = new GetRouteFactoryProvider(navigationComponentApi);
            GetDeeplinkHandlersCacheProvider getDeeplinkHandlersCacheProvider = new GetDeeplinkHandlersCacheProvider(navigationComponentApi);
            this.getDeeplinkHandlersCacheProvider = getDeeplinkHandlersCacheProvider;
            this.provideExternalFintechNavigationProvider = d.b(FintechFinanceModule_ProvideExternalFintechNavigationFactory.create(fintechFinanceModule, this.getOzonRouterProvider, this.getRouteFactoryProvider, getDeeplinkHandlersCacheProvider));
            GetUserManagerProvider getUserManagerProvider = new GetUserManagerProvider(accountComponentApi);
            this.getUserManagerProvider = getUserManagerProvider;
            this.provideExternalFintechAuthProvider = d.b(FintechFinanceModule_ProvideExternalFintechAuthFactory.create(fintechFinanceModule, getUserManagerProvider));
            this.getAndroidPlatformComponentConfigProvider = new GetAndroidPlatformComponentConfigProvider(androidPlatformComponentApi);
            this.getAppVersionStorageProvider = new GetAppVersionStorageProvider(storageComponentApi);
            this.getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getEnvironmentServiceProvider = new GetEnvironmentServiceProvider(storageComponentApi);
            this.getAreaLocalStoreProvider = new GetAreaLocalStoreProvider(locationComponentApi);
            GetFintechUrlsProvider getFintechUrlsProvider = new GetFintechUrlsProvider(fintechComponentDependencies);
            this.getFintechUrlsProvider = getFintechUrlsProvider;
            this.provideExternalFintechSettingsProvider = d.b(FintechRkoModule_ProvideExternalFintechSettingsFactory.create(fintechRkoModule, this.getAndroidPlatformComponentConfigProvider, this.getAppVersionStorageProvider, this.getContextProvider, this.getEnvironmentServiceProvider, this.getAreaLocalStoreProvider, getFintechUrlsProvider));
            GetCookieJarProvider getCookieJarProvider = new GetCookieJarProvider(networkComponentApi);
            this.getCookieJarProvider = getCookieJarProvider;
            a<FintechCookieJar> b11 = d.b(FintechFinanceModule_ProvideFintechCookieJarFactory.create(fintechFinanceModule, getCookieJarProvider, this.getFintechUrlsProvider));
            this.provideFintechCookieJarProvider = b11;
            this.provideExternalOkHttpSettingsProvider = d.b(FintechRkoModule_ProvideExternalOkHttpSettingsFactory.create(fintechRkoModule, b11, this.provideExternalFintechSettingsProvider, this.getAndroidPlatformComponentConfigProvider));
            this.getDebugToolServiceProvider = new GetDebugToolServiceProvider(storageComponentApi);
            GetDebugHeaderServiceProvider getDebugHeaderServiceProvider = new GetDebugHeaderServiceProvider(networkComponentApi);
            this.getDebugHeaderServiceProvider = getDebugHeaderServiceProvider;
            this.provideExternalNetworkSettingsProvider = d.b(FintechRkoModule_ProvideExternalNetworkSettingsFactory.create(fintechRkoModule, this.provideExternalOkHttpSettingsProvider, this.getDebugToolServiceProvider, getDebugHeaderServiceProvider, this.getAndroidPlatformComponentConfigProvider));
            this.provideGraylogConfigProvider = d.b(FintechRkoModule_ProvideGraylogConfigFactory.create(fintechRkoModule, this.getEnvironmentServiceProvider, this.provideExternalFintechSettingsProvider));
            this.getOzonTrackerProvider = new GetOzonTrackerProvider(analyticsComponentApi);
            this.getNetworkInfoProvider = new GetNetworkInfoProviderProvider(networkComponentApi);
            GetApplicationAnalyticsScreenStorageProvider getApplicationAnalyticsScreenStorageProvider = new GetApplicationAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getApplicationAnalyticsScreenStorageProvider = getApplicationAnalyticsScreenStorageProvider;
            this.provideOzonTrackerPluginInterctorExternalProvider = d.b(FintechFinanceModule_ProvideOzonTrackerPluginInterctorExternalFactory.create(fintechFinanceModule, this.getOzonTrackerProvider, this.getNetworkInfoProvider, getApplicationAnalyticsScreenStorageProvider));
            GetAppVersionServiceProvider getAppVersionServiceProvider = new GetAppVersionServiceProvider(networkComponentApi);
            this.getAppVersionServiceProvider = getAppVersionServiceProvider;
            a<ExternalFintechSettings> b12 = d.b(FintechFinanceModule_ProvideExternalFintechSettingsFactory.create(fintechFinanceModule, this.getAndroidPlatformComponentConfigProvider, this.getAppVersionStorageProvider, this.getContextProvider, this.getEnvironmentServiceProvider, this.getAreaLocalStoreProvider, getAppVersionServiceProvider, this.getFintechUrlsProvider));
            this.provideExternalFintechSettingsProvider2 = b12;
            this.provideAntiFraudConfigProvider = d.b(FintechFinanceModule_ProvideAntiFraudConfigFactory.create(fintechFinanceModule, b12));
            this.provideFintechLibTypeProvider = d.b(FintechRkoModule_ProvideFintechLibTypeFactory.create(fintechRkoModule));
            this.provideEsiaProvider = FintechEsiaModule_ProvideEsiaFactory.create(fintechEsiaModule, this.getAppVersionServiceProvider, this.getEnvironmentServiceProvider, this.getFintechUrlsProvider);
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            GetOzonLimbDiStoreProvider getOzonLimbDiStoreProvider = new GetOzonLimbDiStoreProvider(limb2ComponentApi);
            this.getOzonLimbDiStoreProvider = getOzonLimbDiStoreProvider;
            this.provideFintechCoreLibProvider = d.b(FintechRkoModule_ProvideFintechCoreLibFactory.create(fintechRkoModule, this.getApplicationProvider, this.provideExternalFintechNavigationProvider, this.provideExternalFintechAuthProvider, this.provideExternalFintechSettingsProvider, this.provideExternalNetworkSettingsProvider, this.provideGraylogConfigProvider, this.provideOzonTrackerPluginInterctorExternalProvider, this.provideAntiFraudConfigProvider, this.getEnvironmentServiceProvider, this.provideFintechLibTypeProvider, this.getUserManagerProvider, this.provideEsiaProvider, this.getFeatureCheckerProvider, getOzonLimbDiStoreProvider));
            a<ExternalFintechSettings> b13 = d.b(FintechPayModule_ProvideExternalFintechSettingsFactory.create(fintechPayModule, this.getAndroidPlatformComponentConfigProvider, this.getAppVersionStorageProvider, this.getContextProvider, this.getEnvironmentServiceProvider, this.getAreaLocalStoreProvider, this.getFintechUrlsProvider));
            this.provideExternalFintechSettingsProvider3 = b13;
            a<C5594a> b14 = d.b(FintechPayModule_ProvideExternalOkHttpSettingsFactory.create(fintechPayModule, this.provideFintechCookieJarProvider, b13, this.getAndroidPlatformComponentConfigProvider));
            this.provideExternalOkHttpSettingsProvider2 = b14;
            this.provideExternalNetworkSettingsProvider2 = d.b(FintechPayModule_ProvideExternalNetworkSettingsFactory.create(fintechPayModule, b14, this.getDebugToolServiceProvider, this.getDebugHeaderServiceProvider, this.getAndroidPlatformComponentConfigProvider));
            this.provideGraylogConfigProvider2 = d.b(FintechPayModule_ProvideGraylogConfigFactory.create(fintechPayModule, this.getEnvironmentServiceProvider, this.provideExternalFintechSettingsProvider3));
            a<O30.b> b15 = d.b(FintechPayModule_ProvideFintechLibTypeFactory.create(fintechPayModule));
            this.provideFintechLibTypeProvider2 = b15;
            this.provideFintechCoreLibProvider2 = d.b(FintechPayModule_ProvideFintechCoreLibFactory.create(fintechPayModule, this.getApplicationProvider, this.provideExternalFintechNavigationProvider, this.provideExternalFintechAuthProvider, this.provideExternalFintechSettingsProvider3, this.provideExternalNetworkSettingsProvider2, this.provideGraylogConfigProvider2, this.provideOzonTrackerPluginInterctorExternalProvider, this.provideAntiFraudConfigProvider, this.getEnvironmentServiceProvider, b15, this.getUserManagerProvider, this.provideEsiaProvider, this.getFeatureCheckerProvider, this.getOzonLimbDiStoreProvider));
            a<C5594a> b16 = d.b(FintechFinanceModule_ProvideExternalOkHttpSettingsFactory.create(fintechFinanceModule, this.provideFintechCookieJarProvider, this.provideExternalFintechSettingsProvider2, this.getAndroidPlatformComponentConfigProvider));
            this.provideExternalOkHttpSettingsProvider3 = b16;
            this.provideExternalNetworkSettingsProvider3 = d.b(FintechFinanceModule_ProvideExternalNetworkSettingsFactory.create(fintechFinanceModule, b16, this.getDebugToolServiceProvider, this.getDebugHeaderServiceProvider, this.getAndroidPlatformComponentConfigProvider));
            this.provideGraylogConfigProvider3 = d.b(FintechFinanceModule_ProvideGraylogConfigFactory.create(fintechFinanceModule, this.getEnvironmentServiceProvider, this.provideExternalFintechSettingsProvider2, this.getAppVersionServiceProvider));
            a<O30.b> b17 = d.b(FintechFinanceModule_ProvideFintechLibTypeFactory.create(fintechFinanceModule));
            this.provideFintechLibTypeProvider3 = b17;
            this.provideFintechCoreLibProvider3 = d.b(FintechFinanceModule_ProvideFintechCoreLibFactory.create(fintechFinanceModule, this.getApplicationProvider, this.provideExternalFintechNavigationProvider, this.provideExternalFintechAuthProvider, this.provideExternalFintechSettingsProvider2, this.provideExternalNetworkSettingsProvider3, this.provideGraylogConfigProvider3, this.provideOzonTrackerPluginInterctorExternalProvider, this.provideAntiFraudConfigProvider, this.getEnvironmentServiceProvider, b17, this.getUserManagerProvider, this.provideEsiaProvider, this.getFeatureCheckerProvider, this.getOzonLimbDiStoreProvider));
            this.getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            GetMoshiProvider getMoshiProvider = new GetMoshiProvider(networkComponentApi);
            this.getMoshiProvider = getMoshiProvider;
            this.provideBankTabBadgeManagerProvider = d.b(FintechFinanceModule_ProvideBankTabBadgeManagerFactory.create(fintechFinanceModule, this.getActionRepositoryProvider, this.getUserManagerProvider, this.getContextProvider, getMoshiProvider));
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public BankTabBadgeManager getBankTabBadgeManager() {
            return this.provideBankTabBadgeManagerProvider.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public ExternalFintechSettings getExternalFintechSettings() {
            return this.provideExternalFintechSettingsProvider2.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public FintechCoreLib getFintechCoreLibBank() {
            return this.provideFintechCoreLibProvider3.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public FintechCoreLib getFintechCoreLibPay() {
            return this.provideFintechCoreLibProvider2.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public FintechCoreLib getFintechCoreLibRko() {
            return this.provideFintechCoreLibProvider.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public ExternalFintechSettings getPayExternalFintechSettings() {
            return this.provideExternalFintechSettingsProvider3.get();
        }

        @Override // ru.ozon.app.android.bank.domain.FintechLibApi
        public ExternalFintechSettings getRkoExternalFintechSettings() {
            return this.provideExternalFintechSettingsProvider.get();
        }

        private FintechLibComponentImpl(FintechFinanceModule fintechFinanceModule, FintechRkoModule fintechRkoModule, FintechPayModule fintechPayModule, FintechEsiaModule fintechEsiaModule, ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, StorageComponentApi storageComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, OzonMapComponentApi ozonMapComponentApi, AccountComponentApi accountComponentApi, ActionComponentApi actionComponentApi, FintechComponentDependencies fintechComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            this.fintechLibComponentImpl = this;
            this.fintechComponentDependencies = fintechComponentDependencies;
            initialize(fintechFinanceModule, fintechRkoModule, fintechPayModule, fintechEsiaModule, contextComponentDependencies, navigationComponentApi, networkComponentApi, networkOzonIdComponentApi, storageComponentApi, locationComponentApi, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, ozonMapComponentApi, accountComponentApi, actionComponentApi, fintechComponentDependencies, limb2ComponentApi);
        }
    }

    public static FintechLibComponent.Builder builder() {
        return new Builder(0);
    }
}
