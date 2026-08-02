package ru.ozon.app.android.fresh.feature.entry.di;

import EZ.h;
import GZ.g;
import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.entry.data.OzonFreshTabConfigRepository;
import ru.ozon.app.android.fresh.feature.entry.di.OzonFreshFragmentComponent;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragmentViewModelImpl;
import ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragment_MembersInjector;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshDefaultTabs;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabIdMapper;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes12.dex */
public final class DaggerOzonFreshFragmentComponent {

    private static final class Factory implements OzonFreshFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.entry.di.OzonFreshFragmentComponent.Factory
        public OzonFreshFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            networkComponentApi.getClass();
            accountComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new OzonFreshFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, accountComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonFreshFragmentComponentImpl implements OzonFreshFragmentComponent {
        private final AccountComponentApi accountComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<BottomNavigationController.Factory> factoryProvider;
        private a<FreshDefaultTabs> freshDefaultTabsProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final OzonFreshFragmentComponentImpl ozonFreshFragmentComponentImpl;
        private a<OzonFreshFragmentViewModelImpl> ozonFreshFragmentViewModelImplProvider;
        private final TabsComponentApi tabsComponentApi;
        private final TabsUiControllerComponentApi tabsUiControllerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92673id;
            private final OzonFreshFragmentComponentImpl ozonFreshFragmentComponentImpl;

            SwitchingProvider(OzonFreshFragmentComponentImpl ozonFreshFragmentComponentImpl, int i11) {
                this.ozonFreshFragmentComponentImpl = ozonFreshFragmentComponentImpl;
                this.f92673id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92673id;
                if (i11 == 0) {
                    return (T) new BottomNavigationController.Factory() { // from class: ru.ozon.app.android.fresh.feature.entry.di.DaggerOzonFreshFragmentComponent.OzonFreshFragmentComponentImpl.SwitchingProvider.1
                        @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
                        public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
                            Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = SwitchingProvider.this.ozonFreshFragmentComponentImpl.tabsUiControllerComponentApi.getTabControllersFactory();
                            j.c(tabControllersFactory);
                            Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map = tabControllersFactory;
                            TabBarAnalytics tabAnalytics = SwitchingProvider.this.ozonFreshFragmentComponentImpl.tabsComponentApi.getTabAnalytics();
                            j.c(tabAnalytics);
                            TabbarDeeplinksResolver tabbarDeeplinksResolver = SwitchingProvider.this.ozonFreshFragmentComponentImpl.tabsComponentApi.getTabbarDeeplinksResolver();
                            j.c(tabbarDeeplinksResolver);
                            AppType appType = SwitchingProvider.this.ozonFreshFragmentComponentImpl.androidPlatformComponentDependencies.getAppType();
                            j.c(appType);
                            return new BottomNavigationController(componentCallbacksC5392m, map, tabAnalytics, tabbarDeeplinksResolver, appType);
                        }
                    };
                }
                if (i11 == 1) {
                    return (T) new OzonFreshFragmentViewModelImpl(this.ozonFreshFragmentComponentImpl.ozonFreshTabConfigRepository());
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f92673id);
                }
                FreshTabConfigMapper freshTabConfigMapper = this.ozonFreshFragmentComponentImpl.freshTabConfigMapper();
                FeatureChecker featureChecker = this.ozonFreshFragmentComponentImpl.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return (T) new FreshDefaultTabs(freshTabConfigMapper, featureChecker);
            }
        }

        /* synthetic */ OzonFreshFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, accountComponentApi, androidPlatformComponentDependencies);
        }

        private FreshTabBarApi freshTabBarApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return FreshNavigationModule_Companion_ProvideFreshTabBarApiFactory.provideFreshTabBarApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FreshTabConfigMapper freshTabConfigMapper() {
            return new FreshTabConfigMapper(new FreshTabIdMapper());
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.factoryProvider = m.a(new SwitchingProvider(this.ozonFreshFragmentComponentImpl, 0));
            this.freshDefaultTabsProvider = new SwitchingProvider(this.ozonFreshFragmentComponentImpl, 2);
            this.ozonFreshFragmentViewModelImplProvider = new SwitchingProvider(this.ozonFreshFragmentComponentImpl, 1);
        }

        private OzonFreshFragment injectOzonFreshFragment(OzonFreshFragment ozonFreshFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            OzonFreshFragment_MembersInjector.injectRouter(ozonFreshFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            OzonFreshFragment_MembersInjector.injectNavigatorHolder(ozonFreshFragment, navigatorHolder);
            OzonFreshFragment_MembersInjector.injectCacheHolderTabActivityDelegate(ozonFreshFragment, new CacheHolderTabActivityDelegate());
            OzonFreshFragment_MembersInjector.injectBottomNavigationControllerFactory(ozonFreshFragment, this.factoryProvider.get());
            OzonFreshFragment_MembersInjector.injectViewModelProvider(ozonFreshFragment, this.ozonFreshFragmentViewModelImplProvider);
            AuthEventsCollector authEventsCollector = this.accountComponentApi.getAuthEventsCollector();
            j.c(authEventsCollector);
            OzonFreshFragment_MembersInjector.injectAuthEventsCollector(ozonFreshFragment, authEventsCollector);
            return ozonFreshFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonFreshTabConfigRepository ozonFreshTabConfigRepository() {
            return new OzonFreshTabConfigRepository(freshTabBarApi(), freshTabConfigMapper(), d.a(this.freshDefaultTabsProvider));
        }

        @Override // ru.ozon.app.android.fresh.feature.entry.di.OzonFreshFragmentComponent
        public void inject(OzonFreshFragment ozonFreshFragment) {
            injectOzonFreshFragment(ozonFreshFragment);
        }

        private OzonFreshFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.ozonFreshFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.accountComponentApi = accountComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, accountComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static OzonFreshFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
