package ru.ozon.app.android.travel.feature.general.common.tab.di;

import EZ.h;
import GZ.g;
import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelDefaultTabProvider;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigApi;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigProviderImpl;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigRepositoryImpl;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.travel.feature.general.common.tab.di.TravelTabNavigationFragmentComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabNavigationFragment_MembersInjector;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl;
import ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes3.dex */
public final class DaggerTravelTabNavigationFragmentComponent {

    private static final class Factory implements TravelTabNavigationFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.tab.di.TravelTabNavigationFragmentComponent.Factory
        public TravelTabNavigationFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            travelUnpaidOrderStorageApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new TravelTabNavigationFragmentComponentImpl(contextComponentDependencies, networkComponentApi, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, travelUnpaidOrderStorageApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class TravelTabNavigationFragmentComponentImpl implements TravelTabNavigationFragmentComponent {
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private a<BottomNavigationController.Factory> factoryProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<TravelTabConfigApi> provideTabConfigApiProvider;
        private final TabsComponentApi tabsComponentApi;
        private final TabsUiControllerComponentApi tabsUiControllerComponentApi;
        private a<TravelDefaultTabProvider> travelDefaultTabProvider;
        private final TravelTabNavigationFragmentComponentImpl travelTabNavigationFragmentComponentImpl;
        private a<TravelTabViewModelImpl> travelTabViewModelImplProvider;
        private final TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93863id;
            private final TravelTabNavigationFragmentComponentImpl travelTabNavigationFragmentComponentImpl;

            SwitchingProvider(TravelTabNavigationFragmentComponentImpl travelTabNavigationFragmentComponentImpl, int i11) {
                this.travelTabNavigationFragmentComponentImpl = travelTabNavigationFragmentComponentImpl;
                this.f93863id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93863id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        Retrofit retrofit = this.travelTabNavigationFragmentComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) TravelTabModule_Companion_ProvideTabConfigApiFactory.provideTabConfigApi(retrofit);
                    }
                    if (i11 == 2) {
                        return (T) new TravelDefaultTabProvider();
                    }
                    if (i11 == 3) {
                        return (T) new BottomNavigationController.Factory() { // from class: ru.ozon.app.android.travel.feature.general.common.tab.di.DaggerTravelTabNavigationFragmentComponent.TravelTabNavigationFragmentComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
                            public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = SwitchingProvider.this.travelTabNavigationFragmentComponentImpl.tabsUiControllerComponentApi.getTabControllersFactory();
                                j.c(tabControllersFactory);
                                Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map = tabControllersFactory;
                                TabBarAnalytics tabAnalytics = SwitchingProvider.this.travelTabNavigationFragmentComponentImpl.tabsComponentApi.getTabAnalytics();
                                j.c(tabAnalytics);
                                TabbarDeeplinksResolver tabbarDeeplinksResolver = SwitchingProvider.this.travelTabNavigationFragmentComponentImpl.tabsComponentApi.getTabbarDeeplinksResolver();
                                j.c(tabbarDeeplinksResolver);
                                AppType appType = SwitchingProvider.this.travelTabNavigationFragmentComponentImpl.androidPlatformComponentDependencies.getAppType();
                                j.c(appType);
                                return new BottomNavigationController(componentCallbacksC5392m, map, tabAnalytics, tabbarDeeplinksResolver, appType);
                            }
                        };
                    }
                    throw new AssertionError(this.f93863id);
                }
                TravelUnpaidOrderCountStorage unpaidOrderCountStorage = this.travelTabNavigationFragmentComponentImpl.travelUnpaidOrderStorageApi.unpaidOrderCountStorage();
                j.c(unpaidOrderCountStorage);
                TravelTabConfigRepositoryImpl travelTabConfigRepositoryImpl = this.travelTabNavigationFragmentComponentImpl.travelTabConfigRepositoryImpl();
                TravelTabConfigMapper travelTabConfigMapper = this.travelTabNavigationFragmentComponentImpl.travelTabConfigMapper();
                TabConfigCache tabConfigCache = this.travelTabNavigationFragmentComponentImpl.tabsComponentApi.getTabConfigCache();
                j.c(tabConfigCache);
                TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate = this.travelTabNavigationFragmentComponentImpl.tabsComponentApi.getTravelTabConfigUpdateDelegate();
                j.c(travelTabConfigUpdateDelegate);
                CoroutineDispatcherProvider dispatcherProvider = this.travelTabNavigationFragmentComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                return (T) new TravelTabViewModelImpl(unpaidOrderCountStorage, travelTabConfigRepositoryImpl, travelTabConfigMapper, tabConfigCache, travelTabConfigUpdateDelegate, dispatcherProvider);
            }
        }

        /* synthetic */ TravelTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, networkComponentApi, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, travelUnpaidOrderStorageApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.provideTabConfigApiProvider = d.b(new SwitchingProvider(this.travelTabNavigationFragmentComponentImpl, 1));
            this.travelDefaultTabProvider = new SwitchingProvider(this.travelTabNavigationFragmentComponentImpl, 2);
            this.travelTabViewModelImplProvider = new SwitchingProvider(this.travelTabNavigationFragmentComponentImpl, 0);
            this.factoryProvider = m.a(new SwitchingProvider(this.travelTabNavigationFragmentComponentImpl, 3));
        }

        private TravelTabNavigationFragment injectTravelTabNavigationFragment(TravelTabNavigationFragment travelTabNavigationFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            TravelTabNavigationFragment_MembersInjector.injectOzonRouter(travelTabNavigationFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            TravelTabNavigationFragment_MembersInjector.injectHolder(travelTabNavigationFragment, navigatorHolder);
            TravelTabNavigationFragment_MembersInjector.injectCacheHolderTabActivityDelegate(travelTabNavigationFragment, new CacheHolderTabActivityDelegate());
            TravelTabNavigationFragment_MembersInjector.injectPViewModel(travelTabNavigationFragment, this.travelTabViewModelImplProvider);
            TravelTabNavigationFragment_MembersInjector.injectBottomNavigationControllerFactory(travelTabNavigationFragment, this.factoryProvider.get());
            return travelTabNavigationFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TravelTabConfigMapper travelTabConfigMapper() {
            return new TravelTabConfigMapper(new TravelTabConfigProviderImpl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TravelTabConfigRepositoryImpl travelTabConfigRepositoryImpl() {
            return new TravelTabConfigRepositoryImpl(this.provideTabConfigApiProvider.get(), d.a(this.travelDefaultTabProvider));
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.tab.di.TravelTabNavigationFragmentComponent
        public void inject(TravelTabNavigationFragment travelTabNavigationFragment) {
            injectTravelTabNavigationFragment(travelTabNavigationFragment);
        }

        private TravelTabNavigationFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.travelTabNavigationFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.travelUnpaidOrderStorageApi = travelUnpaidOrderStorageApi;
            this.networkComponentApi = networkComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            initialize(contextComponentDependencies, networkComponentApi, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, travelUnpaidOrderStorageApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static TravelTabNavigationFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
