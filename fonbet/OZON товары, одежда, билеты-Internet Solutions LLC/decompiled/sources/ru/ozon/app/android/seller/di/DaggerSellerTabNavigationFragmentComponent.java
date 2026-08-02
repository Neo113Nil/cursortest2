package ru.ozon.app.android.seller.di;

import EZ.h;
import GZ.g;
import GZ.k;
import Jb.j;
import Jb.m;
import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.seller.di.SellerTabNavigationFragmentComponent;
import ru.ozon.app.android.seller.presentation.SellerScreenStateCorrector;
import ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment;
import ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment_MembersInjector;
import ru.ozon.app.android.seller.presentation.SellerViewModelImpl;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.miniapp.seller.SellerTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.seller.SellerTabIdMapper;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes2.dex */
public final class DaggerSellerTabNavigationFragmentComponent {

    private static final class Factory implements SellerTabNavigationFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.seller.di.SellerTabNavigationFragmentComponent.Factory
        public SellerTabNavigationFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            cartServiceApi.getClass();
            networkComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new SellerTabNavigationFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class SellerTabNavigationFragmentComponentImpl implements SellerTabNavigationFragmentComponent {
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<BottomNavigationController.Factory> factoryProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final SellerTabNavigationFragmentComponentImpl sellerTabNavigationFragmentComponentImpl;
        private a<SellerViewModelImpl> sellerViewModelImplProvider;
        private final TabsComponentApi tabsComponentApi;
        private final TabsUiControllerComponentApi tabsUiControllerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93459id;
            private final SellerTabNavigationFragmentComponentImpl sellerTabNavigationFragmentComponentImpl;

            SwitchingProvider(SellerTabNavigationFragmentComponentImpl sellerTabNavigationFragmentComponentImpl, int i11) {
                this.sellerTabNavigationFragmentComponentImpl = sellerTabNavigationFragmentComponentImpl;
                this.f93459id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93459id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new BottomNavigationController.Factory() { // from class: ru.ozon.app.android.seller.di.DaggerSellerTabNavigationFragmentComponent.SellerTabNavigationFragmentComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
                            public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = SwitchingProvider.this.sellerTabNavigationFragmentComponentImpl.tabsUiControllerComponentApi.getTabControllersFactory();
                                j.c(tabControllersFactory);
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map = tabControllersFactory;
                                TabBarAnalytics tabAnalytics = SwitchingProvider.this.sellerTabNavigationFragmentComponentImpl.tabsComponentApi.getTabAnalytics();
                                j.c(tabAnalytics);
                                TabbarDeeplinksResolver tabbarDeeplinksResolver = SwitchingProvider.this.sellerTabNavigationFragmentComponentImpl.tabsComponentApi.getTabbarDeeplinksResolver();
                                j.c(tabbarDeeplinksResolver);
                                AppType appType = SwitchingProvider.this.sellerTabNavigationFragmentComponentImpl.androidPlatformComponentDependencies.getAppType();
                                j.c(appType);
                                return new BottomNavigationController(componentCallbacksC5392m, map, tabAnalytics, tabbarDeeplinksResolver, appType);
                            }
                        };
                    }
                    throw new AssertionError(this.f93459id);
                }
                SellerTabConfigMapper sellerTabConfigMapper = this.sellerTabNavigationFragmentComponentImpl.sellerTabConfigMapper();
                TabConfigRepository tabConfigRepository = this.sellerTabNavigationFragmentComponentImpl.tabsComponentApi.getTabConfigRepository();
                j.c(tabConfigRepository);
                return (T) new SellerViewModelImpl(sellerTabConfigMapper, tabConfigRepository);
            }
        }

        /* synthetic */ SellerTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.sellerViewModelImplProvider = new SwitchingProvider(this.sellerTabNavigationFragmentComponentImpl, 0);
            this.factoryProvider = m.a(new SwitchingProvider(this.sellerTabNavigationFragmentComponentImpl, 1));
        }

        private SellerTabNavigationFragment injectSellerTabNavigationFragment(SellerTabNavigationFragment sellerTabNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            SellerTabNavigationFragment_MembersInjector.injectOzonRouter(sellerTabNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            SellerTabNavigationFragment_MembersInjector.injectHolder(sellerTabNavigationFragment, navigatorHolder);
            SellerTabNavigationFragment_MembersInjector.injectStateCorrector(sellerTabNavigationFragment, sellerScreenStateCorrector());
            SellerTabNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(sellerTabNavigationFragment, new CacheHolderTabActivityDelegate());
            SellerTabNavigationFragment_MembersInjector.injectPSellerViewModel(sellerTabNavigationFragment, this.sellerViewModelImplProvider);
            SellerTabNavigationFragment_MembersInjector.injectBottomNavigationControllerFactory(sellerTabNavigationFragment, this.factoryProvider.get());
            return sellerTabNavigationFragment;
        }

        private SellerScreenStateCorrector sellerScreenStateCorrector() {
            k routeFactory = this.navigationComponentApi.getRouteFactory();
            j.c(routeFactory);
            HZ.a deeplinkHandlersCache = this.navigationComponentApi.getDeeplinkHandlersCache();
            j.c(deeplinkHandlersCache);
            return new SellerScreenStateCorrector(routeFactory, deeplinkHandlersCache);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SellerTabConfigMapper sellerTabConfigMapper() {
            return new SellerTabConfigMapper(new SellerTabIdMapper());
        }

        @Override // ru.ozon.app.android.seller.di.SellerTabNavigationFragmentComponent
        public void inject(SellerTabNavigationFragment sellerTabNavigationFragment) {
            injectSellerTabNavigationFragment(sellerTabNavigationFragment);
        }

        private SellerTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, CartServiceApi cartServiceApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.sellerTabNavigationFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, cartServiceApi, networkComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static SellerTabNavigationFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
