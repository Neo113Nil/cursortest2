package ru.ozon.app.android.fresh.navigation.di.components;

import EZ.h;
import GZ.g;
import HZ.e;
import Jb.d;
import Jb.j;
import Pc.a;
import java.util.Map;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment;
import ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment_MembersInjector;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl_Factory;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent;
import ru.ozon.app.android.fresh.navigation.di.modules.MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshNavigationFragment_MembersInjector;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController_Factory_Impl;
import ru.ozon.app.android.tabbar.ui.C9535BottomNavigationController_Factory;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes12.dex */
public final class DaggerFreshTabNavigationFragmentComponent {

    private static final class Factory implements FreshTabNavigationFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent.Factory
        public FreshTabNavigationFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, ComposerComponentApi composerComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, AnalyticsComponentApi analyticsComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            composerComponentApi.getClass();
            freshNavigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            cartServiceApi.getClass();
            networkComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new FreshTabNavigationFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, composerComponentApi, analyticsComponentApi, freshNavigationComponentApi, cartServiceApi, networkComponentApi, tabsUiControllerComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FreshTabNavigationFragmentComponentImpl implements FreshTabNavigationFragmentComponent {
        private a<Sg.a> bindsAnalyticsScreenStorageProvider;
        private C9535BottomNavigationController_Factory bottomNavigationControllerProvider;
        private a<BottomNavigationController.Factory> factoryProvider;
        private final FreshNavigationComponentApi freshNavigationComponentApi;
        private final FreshTabNavigationFragmentComponentImpl freshTabNavigationFragmentComponentImpl;
        private a<FreshViewModelImpl> freshViewModelImplProvider;
        private a<AnalyticsDataLayer> getAnalyticsDataLayerProvider;
        private a<Sg.a> getAnalyticsScreenStorageProvider;
        private a<AppType> getAppTypeProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<FreshTabConfigRepository> getFreshTabConfigRepositoryProvider;
        private a<PluginsManager> getPluginsManagerProvider;
        private a<TabBarAnalytics> getTabAnalyticsProvider;
        private a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> getTabControllersFactoryProvider;
        private a<TabbarDeeplinksResolver> getTabbarDeeplinksResolverProvider;
        private final NavigationComponentApi navigationComponentApi;
        private a<MiniAppAnalytics> provideMiniAppAnalyticsProvider;

        private static final class GetAnalyticsDataLayerProvider implements a<AnalyticsDataLayer> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetAnalyticsDataLayerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public AnalyticsDataLayer get() {
                AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
                j.c(analyticsDataLayer);
                return analyticsDataLayer;
            }
        }

        private static final class GetAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

            GetAnalyticsScreenStorageProvider(AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
                this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return analyticsScreenStorage;
            }
        }

        private static final class GetAppTypeProvider implements a<AppType> {
            private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;

            GetAppTypeProvider(AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
                this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            }

            @Override // Pc.a
            public AppType get() {
                AppType appType = this.androidPlatformComponentDependencies.getAppType();
                j.c(appType);
                return appType;
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

        private static final class GetFreshTabConfigRepositoryProvider implements a<FreshTabConfigRepository> {
            private final FreshNavigationComponentApi freshNavigationComponentApi;

            GetFreshTabConfigRepositoryProvider(FreshNavigationComponentApi freshNavigationComponentApi) {
                this.freshNavigationComponentApi = freshNavigationComponentApi;
            }

            @Override // Pc.a
            public FreshTabConfigRepository get() {
                FreshTabConfigRepository freshTabConfigRepository = this.freshNavigationComponentApi.getFreshTabConfigRepository();
                j.c(freshTabConfigRepository);
                return freshTabConfigRepository;
            }
        }

        private static final class GetPluginsManagerProvider implements a<PluginsManager> {
            private final AnalyticsComponentApi analyticsComponentApi;

            GetPluginsManagerProvider(AnalyticsComponentApi analyticsComponentApi) {
                this.analyticsComponentApi = analyticsComponentApi;
            }

            @Override // Pc.a
            public PluginsManager get() {
                PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
                j.c(pluginsManager);
                return pluginsManager;
            }
        }

        private static final class GetTabAnalyticsProvider implements a<TabBarAnalytics> {
            private final TabsComponentApi tabsComponentApi;

            GetTabAnalyticsProvider(TabsComponentApi tabsComponentApi) {
                this.tabsComponentApi = tabsComponentApi;
            }

            @Override // Pc.a
            public TabBarAnalytics get() {
                TabBarAnalytics tabAnalytics = this.tabsComponentApi.getTabAnalytics();
                j.c(tabAnalytics);
                return tabAnalytics;
            }
        }

        private static final class GetTabControllersFactoryProvider implements a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> {
            private final TabsUiControllerComponentApi tabsUiControllerComponentApi;

            GetTabControllersFactoryProvider(TabsUiControllerComponentApi tabsUiControllerComponentApi) {
                this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            }

            @Override // Pc.a
            public Map<TabControllerRegistryModel.Key, TabUiControllerFactory> get() {
                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = this.tabsUiControllerComponentApi.getTabControllersFactory();
                j.c(tabControllersFactory);
                return tabControllersFactory;
            }
        }

        private static final class GetTabbarDeeplinksResolverProvider implements a<TabbarDeeplinksResolver> {
            private final TabsComponentApi tabsComponentApi;

            GetTabbarDeeplinksResolverProvider(TabsComponentApi tabsComponentApi) {
                this.tabsComponentApi = tabsComponentApi;
            }

            @Override // Pc.a
            public TabbarDeeplinksResolver get() {
                TabbarDeeplinksResolver tabbarDeeplinksResolver = this.tabsComponentApi.getTabbarDeeplinksResolver();
                j.c(tabbarDeeplinksResolver);
                return tabbarDeeplinksResolver;
            }
        }

        /* synthetic */ FreshTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, ComposerComponentApi composerComponentApi, AnalyticsComponentApi analyticsComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, composerComponentApi, analyticsComponentApi, freshNavigationComponentApi, cartServiceApi, networkComponentApi, tabsUiControllerComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies);
        }

        private FreshNavigationHelper freshNavigationHelper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            e deeplinkPageResolver = this.navigationComponentApi.getDeeplinkPageResolver();
            j.c(deeplinkPageResolver);
            FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler = this.freshNavigationComponentApi.getFreshPdpInBottomSheetHandler();
            j.c(freshPdpInBottomSheetHandler);
            return new FreshNavigationHelper(ozonRouter, deeplinkPageResolver, freshPdpInBottomSheetHandler);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, ComposerComponentApi composerComponentApi, AnalyticsComponentApi analyticsComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.getFreshTabConfigRepositoryProvider = new GetFreshTabConfigRepositoryProvider(freshNavigationComponentApi);
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getPluginsManagerProvider = new GetPluginsManagerProvider(analyticsComponentApi);
            this.getAnalyticsDataLayerProvider = new GetAnalyticsDataLayerProvider(analyticsComponentApi);
            GetAnalyticsScreenStorageProvider getAnalyticsScreenStorageProvider = new GetAnalyticsScreenStorageProvider(analyticsScreenStorageComponentApi);
            this.getAnalyticsScreenStorageProvider = getAnalyticsScreenStorageProvider;
            a<Sg.a> b11 = d.b(getAnalyticsScreenStorageProvider);
            this.bindsAnalyticsScreenStorageProvider = b11;
            a<MiniAppAnalytics> b12 = d.b(MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory.create(this.getPluginsManagerProvider, this.getAnalyticsDataLayerProvider, b11));
            this.provideMiniAppAnalyticsProvider = b12;
            this.freshViewModelImplProvider = FreshViewModelImpl_Factory.create(this.getFreshTabConfigRepositoryProvider, this.getFeatureCheckerProvider, b12, this.bindsAnalyticsScreenStorageProvider);
            this.getTabControllersFactoryProvider = new GetTabControllersFactoryProvider(tabsUiControllerComponentApi);
            this.getTabAnalyticsProvider = new GetTabAnalyticsProvider(tabsComponentApi);
            this.getTabbarDeeplinksResolverProvider = new GetTabbarDeeplinksResolverProvider(tabsComponentApi);
            GetAppTypeProvider getAppTypeProvider = new GetAppTypeProvider(androidPlatformComponentDependencies);
            this.getAppTypeProvider = getAppTypeProvider;
            C9535BottomNavigationController_Factory create = C9535BottomNavigationController_Factory.create(this.getTabControllersFactoryProvider, this.getTabAnalyticsProvider, this.getTabbarDeeplinksResolverProvider, getAppTypeProvider);
            this.bottomNavigationControllerProvider = create;
            this.factoryProvider = BottomNavigationController_Factory_Impl.create(create);
        }

        private FreshNavigationFragment injectFreshNavigationFragment(FreshNavigationFragment freshNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FreshNavigationFragment_MembersInjector.injectOzonRouter(freshNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            FreshNavigationFragment_MembersInjector.injectHolder(freshNavigationFragment, navigatorHolder);
            FreshNavigationFragment_MembersInjector.injectPViewModel(freshNavigationFragment, this.freshViewModelImplProvider);
            FreshNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(freshNavigationFragment, new CacheHolderTabActivityDelegate());
            FreshNavigationFragment_MembersInjector.injectFreshNavigationHelper(freshNavigationFragment, freshNavigationHelper());
            FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler = this.freshNavigationComponentApi.getFreshPdpInBottomSheetHandler();
            j.c(freshPdpInBottomSheetHandler);
            FreshNavigationFragment_MembersInjector.injectPdpInBottomSheetHandler(freshNavigationFragment, freshPdpInBottomSheetHandler);
            return freshNavigationFragment;
        }

        private FreshTabNavigationFragment injectFreshTabNavigationFragment(FreshTabNavigationFragment freshTabNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FreshTabNavigationFragment_MembersInjector.injectOzonRouter(freshTabNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            FreshTabNavigationFragment_MembersInjector.injectHolder(freshTabNavigationFragment, navigatorHolder);
            FreshTabNavigationFragment_MembersInjector.injectPViewModel(freshTabNavigationFragment, this.freshViewModelImplProvider);
            FreshTabNavigationFragment_MembersInjector.injectFreshNavigationHelper(freshTabNavigationFragment, freshNavigationHelper());
            FreshTabNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(freshTabNavigationFragment, new CacheHolderTabActivityDelegate());
            FreshTabNavigationFragment_MembersInjector.injectBottomNavigationControllerFactory(freshTabNavigationFragment, this.factoryProvider.get());
            FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler = this.freshNavigationComponentApi.getFreshPdpInBottomSheetHandler();
            j.c(freshPdpInBottomSheetHandler);
            FreshTabNavigationFragment_MembersInjector.injectPdpInBottomSheetHandler(freshTabNavigationFragment, freshPdpInBottomSheetHandler);
            return freshTabNavigationFragment;
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent
        public void inject(FreshTabNavigationFragment freshTabNavigationFragment) {
            injectFreshTabNavigationFragment(freshTabNavigationFragment);
        }

        private FreshTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, ComposerComponentApi composerComponentApi, AnalyticsComponentApi analyticsComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.freshTabNavigationFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.freshNavigationComponentApi = freshNavigationComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, composerComponentApi, analyticsComponentApi, freshNavigationComponentApi, cartServiceApi, networkComponentApi, tabsUiControllerComponentApi, analyticsScreenStorageComponentApi, androidPlatformComponentDependencies);
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshTabNavigationFragmentComponent
        public void inject(FreshNavigationFragment freshNavigationFragment) {
            injectFreshNavigationFragment(freshNavigationFragment);
        }
    }

    public static FreshTabNavigationFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
