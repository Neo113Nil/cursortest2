package ru.ozon.app.android.di;

import EZ.h;
import GZ.g;
import Jb.j;
import Jb.m;
import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.TabNavigationFragmentComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabNavigationFragment;
import ru.ozon.app.android.tabbar.ui.TabNavigationFragment_MembersInjector;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class DaggerTabNavigationFragmentComponent {

    private static final class Factory implements TabNavigationFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.di.TabNavigationFragmentComponent.Factory
        public TabNavigationFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new TabNavigationFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class TabNavigationFragmentComponentImpl implements TabNavigationFragmentComponent {
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<BottomNavigationController.Factory> factoryProvider;
        private a<TabConfigViewModel> getTabConfigViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final TabNavigationFragmentComponentImpl tabNavigationFragmentComponentImpl;
        private final TabsComponentApi tabsComponentApi;
        private final TabsUiControllerComponentApi tabsUiControllerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92518id;
            private final TabNavigationFragmentComponentImpl tabNavigationFragmentComponentImpl;

            SwitchingProvider(TabNavigationFragmentComponentImpl tabNavigationFragmentComponentImpl, int i11) {
                this.tabNavigationFragmentComponentImpl = tabNavigationFragmentComponentImpl;
                this.f92518id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92518id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new BottomNavigationController.Factory() { // from class: ru.ozon.app.android.di.DaggerTabNavigationFragmentComponent.TabNavigationFragmentComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
                            public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = SwitchingProvider.this.tabNavigationFragmentComponentImpl.tabsUiControllerComponentApi.getTabControllersFactory();
                                j.c(tabControllersFactory);
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map = tabControllersFactory;
                                TabBarAnalytics tabAnalytics = SwitchingProvider.this.tabNavigationFragmentComponentImpl.tabsComponentApi.getTabAnalytics();
                                j.c(tabAnalytics);
                                TabbarDeeplinksResolver tabbarDeeplinksResolver = SwitchingProvider.this.tabNavigationFragmentComponentImpl.tabsComponentApi.getTabbarDeeplinksResolver();
                                j.c(tabbarDeeplinksResolver);
                                AppType appType = SwitchingProvider.this.tabNavigationFragmentComponentImpl.androidPlatformComponentDependencies.getAppType();
                                j.c(appType);
                                return new BottomNavigationController(componentCallbacksC5392m, map, tabAnalytics, tabbarDeeplinksResolver, appType);
                            }
                        };
                    }
                    throw new AssertionError(this.f92518id);
                }
                T t2 = (T) this.tabNavigationFragmentComponentImpl.tabsComponentApi.getTabConfigViewModel();
                j.c(t2);
                return t2;
            }
        }

        /* synthetic */ TabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.getTabConfigViewModelProvider = new SwitchingProvider(this.tabNavigationFragmentComponentImpl, 0);
            this.factoryProvider = m.a(new SwitchingProvider(this.tabNavigationFragmentComponentImpl, 1));
        }

        private TabNavigationFragment injectTabNavigationFragment(TabNavigationFragment tabNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            TabNavigationFragment_MembersInjector.injectRouter(tabNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            TabNavigationFragment_MembersInjector.injectNavigatorHolder(tabNavigationFragment, navigatorHolder);
            TabNavigationFragment_MembersInjector.injectTabConfigViewModel(tabNavigationFragment, this.getTabConfigViewModelProvider);
            TabNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(tabNavigationFragment, new CacheHolderTabActivityDelegate());
            TabNavigationFragment_MembersInjector.injectBottomNavigationControllerFactory(tabNavigationFragment, this.factoryProvider.get());
            TabBarAnalytics tabAnalytics = this.tabsComponentApi.getTabAnalytics();
            j.c(tabAnalytics);
            TabNavigationFragment_MembersInjector.injectTabBarAnalytics(tabNavigationFragment, tabAnalytics);
            return tabNavigationFragment;
        }

        @Override // ru.ozon.app.android.di.TabNavigationFragmentComponent
        public void inject(TabNavigationFragment tabNavigationFragment) {
            injectTabNavigationFragment(tabNavigationFragment);
        }

        private TabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.tabNavigationFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static TabNavigationFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
