package ru.ozon.app.android.fakeOzon.di;

import EZ.h;
import GZ.g;
import Jb.j;
import Pc.a;
import java.util.Map;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fakeOzon.di.FakeMainTabNavigationFragmentComponent;
import ru.ozon.app.android.fakeOzon.tab.FakeMainTabConfigMapper;
import ru.ozon.app.android.fakeOzon.tab.FakeMainTabConfigMapper_Factory;
import ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel;
import ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel_Factory;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment_MembersInjector;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController_Factory_Impl;
import ru.ozon.app.android.tabbar.ui.C9535BottomNavigationController_Factory;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes12.dex */
public final class DaggerFakeMainTabNavigationFragmentComponent {

    private static final class Factory implements FakeMainTabNavigationFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fakeOzon.di.FakeMainTabNavigationFragmentComponent.Factory
        public FakeMainTabNavigationFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            cartServiceApi.getClass();
            networkComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new FakeMainTabNavigationFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FakeMainTabNavigationFragmentComponentImpl implements FakeMainTabNavigationFragmentComponent {
        private C9535BottomNavigationController_Factory bottomNavigationControllerProvider;
        private a<BottomNavigationController.Factory> factoryProvider;
        private a<FakeMainTabConfigMapper> fakeMainTabConfigMapperProvider;
        private final FakeMainTabNavigationFragmentComponentImpl fakeMainTabNavigationFragmentComponentImpl;
        private a<FakeMainViewModel> fakeMainViewModelProvider;
        private a<AppType> getAppTypeProvider;
        private a<TabBarAnalytics> getTabAnalyticsProvider;
        private a<TabConfigManager> getTabConfigManagerProvider;
        private a<TabConfigProvider> getTabConfigProvider;
        private a<TabConfigRepository> getTabConfigRepositoryProvider;
        private a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> getTabControllersFactoryProvider;
        private a<TabbarDeeplinksResolver> getTabbarDeeplinksResolverProvider;
        private final NavigationComponentApi navigationComponentApi;

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

        private static final class GetTabConfigManagerProvider implements a<TabConfigManager> {
            private final TabsComponentApi tabsComponentApi;

            GetTabConfigManagerProvider(TabsComponentApi tabsComponentApi) {
                this.tabsComponentApi = tabsComponentApi;
            }

            @Override // Pc.a
            public TabConfigManager get() {
                TabConfigManager tabConfigManager = this.tabsComponentApi.getTabConfigManager();
                j.c(tabConfigManager);
                return tabConfigManager;
            }
        }

        private static final class GetTabConfigProviderProvider implements a<TabConfigProvider> {
            private final TabsComponentApi tabsComponentApi;

            GetTabConfigProviderProvider(TabsComponentApi tabsComponentApi) {
                this.tabsComponentApi = tabsComponentApi;
            }

            @Override // Pc.a
            public TabConfigProvider get() {
                TabConfigProvider tabConfigProvider = this.tabsComponentApi.getTabConfigProvider();
                j.c(tabConfigProvider);
                return tabConfigProvider;
            }
        }

        private static final class GetTabConfigRepositoryProvider implements a<TabConfigRepository> {
            private final TabsComponentApi tabsComponentApi;

            GetTabConfigRepositoryProvider(TabsComponentApi tabsComponentApi) {
                this.tabsComponentApi = tabsComponentApi;
            }

            @Override // Pc.a
            public TabConfigRepository get() {
                TabConfigRepository tabConfigRepository = this.tabsComponentApi.getTabConfigRepository();
                j.c(tabConfigRepository);
                return tabConfigRepository;
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

        /* synthetic */ FakeMainTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.getTabControllersFactoryProvider = new GetTabControllersFactoryProvider(tabsUiControllerComponentApi);
            this.getTabAnalyticsProvider = new GetTabAnalyticsProvider(tabsComponentApi);
            this.getTabbarDeeplinksResolverProvider = new GetTabbarDeeplinksResolverProvider(tabsComponentApi);
            GetAppTypeProvider getAppTypeProvider = new GetAppTypeProvider(androidPlatformComponentDependencies);
            this.getAppTypeProvider = getAppTypeProvider;
            C9535BottomNavigationController_Factory create = C9535BottomNavigationController_Factory.create(this.getTabControllersFactoryProvider, this.getTabAnalyticsProvider, this.getTabbarDeeplinksResolverProvider, getAppTypeProvider);
            this.bottomNavigationControllerProvider = create;
            this.factoryProvider = BottomNavigationController_Factory_Impl.create(create);
            GetTabConfigProviderProvider getTabConfigProviderProvider = new GetTabConfigProviderProvider(tabsComponentApi);
            this.getTabConfigProvider = getTabConfigProviderProvider;
            this.fakeMainTabConfigMapperProvider = FakeMainTabConfigMapper_Factory.create(getTabConfigProviderProvider);
            this.getTabConfigRepositoryProvider = new GetTabConfigRepositoryProvider(tabsComponentApi);
            GetTabConfigManagerProvider getTabConfigManagerProvider = new GetTabConfigManagerProvider(tabsComponentApi);
            this.getTabConfigManagerProvider = getTabConfigManagerProvider;
            this.fakeMainViewModelProvider = FakeMainViewModel_Factory.create(this.fakeMainTabConfigMapperProvider, this.getTabConfigRepositoryProvider, getTabConfigManagerProvider);
        }

        private FakeOzonTabNavigationFragment injectFakeOzonTabNavigationFragment(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FakeOzonTabNavigationFragment_MembersInjector.injectRouter(fakeOzonTabNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            FakeOzonTabNavigationFragment_MembersInjector.injectNavigatorHolder(fakeOzonTabNavigationFragment, navigatorHolder);
            FakeOzonTabNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(fakeOzonTabNavigationFragment, new CacheHolderTabActivityDelegate());
            FakeOzonTabNavigationFragment_MembersInjector.injectBottomNavigationControllerFactory(fakeOzonTabNavigationFragment, this.factoryProvider.get());
            FakeOzonTabNavigationFragment_MembersInjector.injectViewModelProvider(fakeOzonTabNavigationFragment, this.fakeMainViewModelProvider);
            return fakeOzonTabNavigationFragment;
        }

        @Override // ru.ozon.app.android.fakeOzon.di.FakeMainTabNavigationFragmentComponent
        public void inject(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment) {
            injectFakeOzonTabNavigationFragment(fakeOzonTabNavigationFragment);
        }

        private FakeMainTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.fakeMainTabNavigationFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static FakeMainTabNavigationFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
