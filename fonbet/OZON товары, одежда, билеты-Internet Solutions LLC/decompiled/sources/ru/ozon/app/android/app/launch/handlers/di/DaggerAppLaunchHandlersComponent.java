package ru.ozon.app.android.app.launch.handlers.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Jb.k;
import Ld0.c;
import Pc.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.locale.app.data.LocaleFetchAction;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponent;
import ru.ozon.app.android.app.launch.handlers.di.module.AppLaunchHandlersModule_Companion_ProvideAppLaunchArgumentsInterceptorFactory;
import ru.ozon.app.android.app.launch.handlers.fetch.AbToolFetchAction;
import ru.ozon.app.android.app.launch.handlers.fetch.FetchActions;
import ru.ozon.app.android.app.launch.handlers.fetch.FirebaseAnalyticsFetchAction;
import ru.ozon.app.android.app.launch.handlers.fetch.UserFetchAction;
import ru.ozon.app.android.app.launch.handlers.interceptors.AbVariantArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;
import ru.ozon.app.android.app.launch.handlers.interceptors.AutoTestUserArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.ComposerFrequencyLoadCheckerResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.IndefiniteFlashBarArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.IndefiniteNotificationArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.InternalHeadersTokenArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.Limb2ArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.LocaleArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.RailwayMockArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.StaticTimersArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.VersionAppLaunchArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cdn.host.manager.CdnChooserSdkManager;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.debugmenu.data.AbVariantService;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.homeprefetch.PrefetchHomePageFacade;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigService;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;

/* loaded from: classes6.dex */
public final class DaggerAppLaunchHandlersComponent {

    private static final class AppLaunchHandlersComponentImpl implements AppLaunchHandlersComponent {
        private a<AbVariantArgumentResolver> abVariantArgumentResolverProvider;
        private final AccountComponentApi accountComponentApi;
        private final AppLaunchHandlersComponentImpl appLaunchHandlersComponentImpl;
        private final AppLocaleComponentApi appLocaleComponentApi;
        private a<AutoTestUserArgumentResolver> autoTestUserArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> binIndefiniteNotificationArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindAbVariantArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindAutoTestUserArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindComposerDebugMenuArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindComposerFrequencyLoadCheckerResolverProvider;
        private a<AppLaunchArgumentResolver> bindIndefiniteFlashBarArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindInternalHeadersTokenArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindLocaleArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindRailwayMockArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindStaticTimersArgumentResolverProvider;
        private a<AppLaunchArgumentResolver> bindVersionAppLaunchArgumentResolverProvider;
        private final CartServiceApi cartServiceApi;
        private final CdnHostManagerComponentApi cdnHostManagerComponentApi;
        private final ComposerComponentApi composerComponentApi;
        private a<ComposerFrequencyLoadCheckerResolver> composerFrequencyLoadCheckerResolverProvider;
        private a<FetchActions> fetchActionsProvider;
        private final FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi;
        private a<AppLocaleRepository> getAppLocaleRepositoryProvider;
        private a<FeatureService> getFeatureServiceProvider;
        private a<IndefiniteFlashBarArgumentResolver> indefiniteFlashBarArgumentResolverProvider;
        private a<IndefiniteNotificationArgumentResolver> indefiniteNotificationArgumentResolverProvider;
        private a<InternalHeadersTokenArgumentResolver> internalHeadersTokenArgumentResolverProvider;
        private a<Limb2ArgumentResolver> limb2ArgumentResolverProvider;
        private final Limb2ComponentApi limb2ComponentApi;
        private a<LocaleArgumentResolver> localeArgumentResolverProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<AppLaunchArgumentsInterceptor> provideAppLaunchArgumentsInterceptorProvider;
        private a<RailwayMockArgumentResolver> railwayMockArgumentResolverProvider;
        private a<StaticTimersArgumentResolver> staticTimersArgumentResolverProvider;
        private final StorageComponentApi storageComponentApi;
        private final TabsComponentApi tabsComponentApi;
        private final ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi;
        private a<VersionAppLaunchArgumentResolver> versionAppLaunchArgumentResolverProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AppLaunchHandlersComponentImpl appLaunchHandlersComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92163id;

            SwitchingProvider(AppLaunchHandlersComponentImpl appLaunchHandlersComponentImpl, int i11) {
                this.appLaunchHandlersComponentImpl = appLaunchHandlersComponentImpl;
                this.f92163id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92163id) {
                    case 0:
                        return (T) new FetchActions(this.appLaunchHandlersComponentImpl.firebaseAnalyticsFetchAction(), this.appLaunchHandlersComponentImpl.userFetchAction(), this.appLaunchHandlersComponentImpl.abToolFetchAction(), this.appLaunchHandlersComponentImpl.localeFetchAction());
                    case 1:
                        T t2 = (T) this.appLaunchHandlersComponentImpl.networkComponentApi.getFeatureService();
                        j.c(t2);
                        return t2;
                    case 2:
                        T t11 = (T) this.appLaunchHandlersComponentImpl.appLocaleComponentApi.getAppLocaleRepository();
                        j.c(t11);
                        return t11;
                    case 3:
                        g ozonRouter = this.appLaunchHandlersComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) AppLaunchHandlersModule_Companion_ProvideAppLaunchArgumentsInterceptorFactory.provideAppLaunchArgumentsInterceptor(ozonRouter, this.appLaunchHandlersComponentImpl.setOfAppLaunchArgumentResolver());
                    case 4:
                        UserStatusStorage userStatusStorage = this.appLaunchHandlersComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        return (T) new AutoTestUserArgumentResolver(userStatusStorage);
                    case 5:
                        AppVersionStorage appVersionStorage = this.appLaunchHandlersComponentImpl.storageComponentApi.getAppVersionStorage();
                        j.c(appVersionStorage);
                        return (T) new VersionAppLaunchArgumentResolver(appVersionStorage);
                    case 6:
                        return (T) new AbVariantArgumentResolver(this.appLaunchHandlersComponentImpl.abVariantService());
                    case 7:
                        return (T) new IndefiniteFlashBarArgumentResolver();
                    case 8:
                        return (T) new IndefiniteNotificationArgumentResolver();
                    case 9:
                        RailwayMockStorage railwayMockStorage = this.appLaunchHandlersComponentImpl.storageComponentApi.getRailwayMockStorage();
                        j.c(railwayMockStorage);
                        return (T) new RailwayMockArgumentResolver(railwayMockStorage);
                    case 10:
                        c ozonLimbDiStore = this.appLaunchHandlersComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) new Limb2ArgumentResolver(ozonLimbDiStore);
                    case 11:
                        c ozonLimbDiStore2 = this.appLaunchHandlersComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore2);
                        return (T) new ComposerFrequencyLoadCheckerResolver(ozonLimbDiStore2);
                    case 12:
                        DebugToolsService debugToolService = this.appLaunchHandlersComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService);
                        return (T) new InternalHeadersTokenArgumentResolver(debugToolService);
                    case 13:
                        StartupArgsService startupArgsService = this.appLaunchHandlersComponentImpl.storageComponentApi.getStartupArgsService();
                        j.c(startupArgsService);
                        return (T) new StaticTimersArgumentResolver(startupArgsService);
                    case 14:
                        return (T) new LocaleArgumentResolver((AppLocaleRepository) this.appLaunchHandlersComponentImpl.getAppLocaleRepositoryProvider.get());
                    default:
                        throw new AssertionError(this.f92163id);
                }
            }
        }

        /* synthetic */ AppLaunchHandlersComponentImpl(ComposerComponentApi composerComponentApi, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, TabsComponentApi tabsComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AppLocaleComponentApi appLocaleComponentApi, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(composerComponentApi, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, tabsComponentApi, cdnHostManagerComponentApi, cartServiceApi, networkComponentApi, accountComponentApi, thirdPartyLibrariesConfigComponentApi, firebaseAnalyticsComponentApi, appLocaleComponentApi, limb2ComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbToolFetchAction abToolFetchAction() {
            return new AbToolFetchAction(this.getFeatureServiceProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbVariantService abVariantService() {
            DebugToolsService debugToolService = this.storageComponentApi.getDebugToolService();
            j.c(debugToolService);
            return new AbVariantService(debugToolService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FirebaseAnalyticsFetchAction firebaseAnalyticsFetchAction() {
            FirebaseAnalytics firebaseAnalytics = this.firebaseAnalyticsComponentApi.getFirebaseAnalytics();
            j.c(firebaseAnalytics);
            ThirdPartyLibrariesConfigService thirdPartyLibrariesConfigService = this.thirdPartyLibrariesConfigComponentApi.getThirdPartyLibrariesConfigService();
            j.c(thirdPartyLibrariesConfigService);
            return new FirebaseAnalyticsFetchAction(firebaseAnalytics, thirdPartyLibrariesConfigService);
        }

        private void initialize(ComposerComponentApi composerComponentApi, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, TabsComponentApi tabsComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AppLocaleComponentApi appLocaleComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.getFeatureServiceProvider = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 1);
            this.getAppLocaleRepositoryProvider = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 2);
            this.fetchActionsProvider = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 0);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 4);
            this.autoTestUserArgumentResolverProvider = switchingProvider;
            this.bindAutoTestUserArgumentResolverProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 5);
            this.versionAppLaunchArgumentResolverProvider = switchingProvider2;
            this.bindVersionAppLaunchArgumentResolverProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 6);
            this.abVariantArgumentResolverProvider = switchingProvider3;
            this.bindAbVariantArgumentResolverProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 7);
            this.indefiniteFlashBarArgumentResolverProvider = switchingProvider4;
            this.bindIndefiniteFlashBarArgumentResolverProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 8);
            this.indefiniteNotificationArgumentResolverProvider = switchingProvider5;
            this.binIndefiniteNotificationArgumentResolverProvider = d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 9);
            this.railwayMockArgumentResolverProvider = switchingProvider6;
            this.bindRailwayMockArgumentResolverProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 10);
            this.limb2ArgumentResolverProvider = switchingProvider7;
            this.bindComposerDebugMenuArgumentResolverProvider = d.b(switchingProvider7);
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 11);
            this.composerFrequencyLoadCheckerResolverProvider = switchingProvider8;
            this.bindComposerFrequencyLoadCheckerResolverProvider = d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 12);
            this.internalHeadersTokenArgumentResolverProvider = switchingProvider9;
            this.bindInternalHeadersTokenArgumentResolverProvider = d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 13);
            this.staticTimersArgumentResolverProvider = switchingProvider10;
            this.bindStaticTimersArgumentResolverProvider = d.b(switchingProvider10);
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.appLaunchHandlersComponentImpl, 14);
            this.localeArgumentResolverProvider = switchingProvider11;
            this.bindLocaleArgumentResolverProvider = d.b(switchingProvider11);
            this.provideAppLaunchArgumentsInterceptorProvider = d.b(new SwitchingProvider(this.appLaunchHandlersComponentImpl, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocaleFetchAction localeFetchAction() {
            return new LocaleFetchAction(d.a(this.getFeatureServiceProvider), d.a(this.getAppLocaleRepositoryProvider));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<AppLaunchArgumentResolver> setOfAppLaunchArgumentResolver() {
            k d11 = k.d(11);
            d11.a(this.bindAutoTestUserArgumentResolverProvider.get());
            d11.a(this.bindVersionAppLaunchArgumentResolverProvider.get());
            d11.a(this.bindAbVariantArgumentResolverProvider.get());
            d11.a(this.bindIndefiniteFlashBarArgumentResolverProvider.get());
            d11.a(this.binIndefiniteNotificationArgumentResolverProvider.get());
            d11.a(this.bindRailwayMockArgumentResolverProvider.get());
            d11.a(this.bindComposerDebugMenuArgumentResolverProvider.get());
            d11.a(this.bindComposerFrequencyLoadCheckerResolverProvider.get());
            d11.a(this.bindInternalHeadersTokenArgumentResolverProvider.get());
            d11.a(this.bindStaticTimersArgumentResolverProvider.get());
            d11.a(this.bindLocaleArgumentResolverProvider.get());
            return d11.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UserFetchAction userFetchAction() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return new UserFetchAction(userManager);
        }

        @Override // ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi
        public AppLaunchArgumentsInterceptor getAppLaunchArgumentsInterceptor() {
            return this.provideAppLaunchArgumentsInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi
        public AppLaunchListener getAppLaunchListener() {
            TabConfigUpdateDelegate tabConfigRequestDelegate = this.tabsComponentApi.getTabConfigRequestDelegate();
            j.c(tabConfigRequestDelegate);
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            CartPrefetchController cartPrefetchController = this.cartServiceApi.getCartPrefetchController();
            j.c(cartPrefetchController);
            L00.d composerCallFactory = this.composerComponentApi.getComposerCallFactory();
            j.c(composerCallFactory);
            PrefetchHomePageFacade homePrefetchFacade = this.networkComponentApi.homePrefetchFacade();
            j.c(homePrefetchFacade);
            a<FetchActions> aVar = this.fetchActionsProvider;
            CdnChooserSdkManager cdnChooserSdkManager = this.cdnHostManagerComponentApi.getCdnChooserSdkManager();
            j.c(cdnChooserSdkManager);
            YY.a cdnChooserHostApi = this.cdnHostManagerComponentApi.getCdnChooserHostApi();
            j.c(cdnChooserHostApi);
            return new AppLaunchListener(tabConfigRequestDelegate, cartService, cartPrefetchController, composerCallFactory, homePrefetchFacade, aVar, cdnChooserSdkManager, cdnChooserHostApi);
        }

        private AppLaunchHandlersComponentImpl(ComposerComponentApi composerComponentApi, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, TabsComponentApi tabsComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AppLocaleComponentApi appLocaleComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.appLaunchHandlersComponentImpl = this;
            this.tabsComponentApi = tabsComponentApi;
            this.cartServiceApi = cartServiceApi;
            this.composerComponentApi = composerComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.firebaseAnalyticsComponentApi = firebaseAnalyticsComponentApi;
            this.thirdPartyLibrariesConfigComponentApi = thirdPartyLibrariesConfigComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.appLocaleComponentApi = appLocaleComponentApi;
            this.cdnHostManagerComponentApi = cdnHostManagerComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(composerComponentApi, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, tabsComponentApi, cdnHostManagerComponentApi, cartServiceApi, networkComponentApi, accountComponentApi, thirdPartyLibrariesConfigComponentApi, firebaseAnalyticsComponentApi, appLocaleComponentApi, limb2ComponentApi);
        }
    }

    private static final class Factory implements AppLaunchHandlersComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponent.Factory
        public AppLaunchHandlersComponent create(ComposerComponentApi composerComponentApi, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, TabsComponentApi tabsComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, AppLocaleComponentApi appLocaleComponentApi, Limb2ComponentApi limb2ComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent) {
            composerComponentApi.getClass();
            navigationComponentApi.getClass();
            storageComponentApi.getClass();
            tabsComponentApi.getClass();
            cdnHostManagerComponentApi.getClass();
            cartServiceApi.getClass();
            networkComponentApi.getClass();
            accountComponentApi.getClass();
            thirdPartyLibrariesConfigComponentApi.getClass();
            firebaseAnalyticsComponentApi.getClass();
            appLocaleComponentApi.getClass();
            limb2ComponentApi.getClass();
            composerDebugMenuHostApiComponent.getClass();
            return new AppLaunchHandlersComponentImpl(composerComponentApi, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, tabsComponentApi, cdnHostManagerComponentApi, cartServiceApi, networkComponentApi, accountComponentApi, thirdPartyLibrariesConfigComponentApi, firebaseAnalyticsComponentApi, appLocaleComponentApi, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AppLaunchHandlersComponent.Factory factory() {
        return new Factory(0);
    }
}
