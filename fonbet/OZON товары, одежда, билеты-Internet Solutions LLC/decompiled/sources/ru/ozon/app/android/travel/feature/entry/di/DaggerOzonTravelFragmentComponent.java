package ru.ozon.app.android.travel.feature.entry.di;

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
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelFallbackTabConfigProvider;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelFallbackTabConfigProviderImpl;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigMapper;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigRepositoryImpl;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabIdResolverImpl;
import ru.ozon.app.android.travel.feature.entry.di.OzonTravelFragmentComponent;
import ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment;
import ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl;
import ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment_MembersInjector;
import ru.ozon.app.android.travel.feature.entry.network.OzonTravelTabConfigApi;
import ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes3.dex */
public final class DaggerOzonTravelFragmentComponent {

    private static final class Factory implements OzonTravelFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.entry.di.OzonTravelFragmentComponent.Factory
        public OzonTravelFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, StorageComponentApi storageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            tabsComponentApi.getClass();
            tabsUiControllerComponentApi.getClass();
            networkComponentApi.getClass();
            travelUnpaidOrderStorageApi.getClass();
            storageComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new OzonTravelFragmentComponentImpl(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, travelUnpaidOrderStorageApi, storageComponentApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class OzonTravelFragmentComponentImpl implements OzonTravelFragmentComponent {
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private a<BottomNavigationController.Factory> factoryProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<OzonTravelFallbackTabConfigProviderImpl> ozonTravelFallbackTabConfigProviderImplProvider;
        private final OzonTravelFragmentComponentImpl ozonTravelFragmentComponentImpl;
        private a<OzonTravelFragmentViewModelImpl> ozonTravelFragmentViewModelImplProvider;
        private final TabsComponentApi tabsComponentApi;
        private final TabsUiControllerComponentApi tabsUiControllerComponentApi;
        private final TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93796id;
            private final OzonTravelFragmentComponentImpl ozonTravelFragmentComponentImpl;

            SwitchingProvider(OzonTravelFragmentComponentImpl ozonTravelFragmentComponentImpl, int i11) {
                this.ozonTravelFragmentComponentImpl = ozonTravelFragmentComponentImpl;
                this.f93796id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93796id;
                if (i11 == 0) {
                    return (T) new BottomNavigationController.Factory() { // from class: ru.ozon.app.android.travel.feature.entry.di.DaggerOzonTravelFragmentComponent.OzonTravelFragmentComponentImpl.SwitchingProvider.1
                        @Override // ru.ozon.app.android.tabbar.ui.BottomNavigationController.Factory
                        public BottomNavigationController create(ComponentCallbacksC5392m componentCallbacksC5392m) {
                            Map<TabControllerRegistryModel.Key, TabUiControllerFactory> tabControllersFactory = SwitchingProvider.this.ozonTravelFragmentComponentImpl.tabsUiControllerComponentApi.getTabControllersFactory();
                            j.c(tabControllersFactory);
                            Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map = tabControllersFactory;
                            TabBarAnalytics tabAnalytics = SwitchingProvider.this.ozonTravelFragmentComponentImpl.tabsComponentApi.getTabAnalytics();
                            j.c(tabAnalytics);
                            TabbarDeeplinksResolver tabbarDeeplinksResolver = SwitchingProvider.this.ozonTravelFragmentComponentImpl.tabsComponentApi.getTabbarDeeplinksResolver();
                            j.c(tabbarDeeplinksResolver);
                            AppType appType = SwitchingProvider.this.ozonTravelFragmentComponentImpl.androidPlatformComponentDependencies.getAppType();
                            j.c(appType);
                            return new BottomNavigationController(componentCallbacksC5392m, map, tabAnalytics, tabbarDeeplinksResolver, appType);
                        }
                    };
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return (T) new OzonTravelFallbackTabConfigProviderImpl();
                    }
                    throw new AssertionError(this.f93796id);
                }
                TravelUnpaidOrderCountStorage unpaidOrderCountStorage = this.ozonTravelFragmentComponentImpl.travelUnpaidOrderStorageApi.unpaidOrderCountStorage();
                j.c(unpaidOrderCountStorage);
                OzonTravelTabConfigRepositoryImpl ozonTravelTabConfigRepositoryImpl = this.ozonTravelFragmentComponentImpl.ozonTravelTabConfigRepositoryImpl();
                OzonTravelTabConfigMapper ozonTravelTabConfigMapper = this.ozonTravelFragmentComponentImpl.ozonTravelTabConfigMapper();
                TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate = this.ozonTravelFragmentComponentImpl.tabsComponentApi.getTravelTabConfigUpdateDelegate();
                j.c(travelTabConfigUpdateDelegate);
                CoroutineDispatcherProvider dispatcherProvider = this.ozonTravelFragmentComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                return (T) new OzonTravelFragmentViewModelImpl(unpaidOrderCountStorage, ozonTravelTabConfigRepositoryImpl, ozonTravelTabConfigMapper, travelTabConfigUpdateDelegate, dispatcherProvider, (OzonTravelFallbackTabConfigProvider) this.ozonTravelFragmentComponentImpl.ozonTravelFallbackTabConfigProviderImplProvider.get());
            }
        }

        /* synthetic */ OzonTravelFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, StorageComponentApi storageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, travelUnpaidOrderStorageApi, storageComponentApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, StorageComponentApi storageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.factoryProvider = m.a(new SwitchingProvider(this.ozonTravelFragmentComponentImpl, 0));
            this.ozonTravelFallbackTabConfigProviderImplProvider = new SwitchingProvider(this.ozonTravelFragmentComponentImpl, 2);
            this.ozonTravelFragmentViewModelImplProvider = new SwitchingProvider(this.ozonTravelFragmentComponentImpl, 1);
        }

        private OzonTravelFragment injectOzonTravelFragment(OzonTravelFragment ozonTravelFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            OzonTravelFragment_MembersInjector.injectRouter(ozonTravelFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            OzonTravelFragment_MembersInjector.injectNavigatorHolder(ozonTravelFragment, navigatorHolder);
            OzonTravelFragment_MembersInjector.injectCacheHolderTabActivityDelegate(ozonTravelFragment, new CacheHolderTabActivityDelegate());
            OzonTravelFragment_MembersInjector.injectBottomNavigationControllerFactory(ozonTravelFragment, this.factoryProvider.get());
            OzonTravelFragment_MembersInjector.injectViewModelProvider(ozonTravelFragment, this.ozonTravelFragmentViewModelImplProvider);
            return ozonTravelFragment;
        }

        private OzonTravelTabConfigApi ozonTravelTabConfigApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return OzonTravelTabConfigModule_Companion_ProvideTabConfigApiFactory.provideTabConfigApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonTravelTabConfigMapper ozonTravelTabConfigMapper() {
            return new OzonTravelTabConfigMapper(new OzonTravelTabIdResolverImpl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonTravelTabConfigRepositoryImpl ozonTravelTabConfigRepositoryImpl() {
            return new OzonTravelTabConfigRepositoryImpl(ozonTravelTabConfigApi(), d.a(this.ozonTravelFallbackTabConfigProviderImplProvider));
        }

        @Override // ru.ozon.app.android.travel.feature.entry.di.OzonTravelFragmentComponent
        public void inject(OzonTravelFragment ozonTravelFragment) {
            injectOzonTravelFragment(ozonTravelFragment);
        }

        private OzonTravelFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, TabsComponentApi tabsComponentApi, TabsUiControllerComponentApi tabsUiControllerComponentApi, NetworkComponentApi networkComponentApi, TravelUnpaidOrderStorageApi travelUnpaidOrderStorageApi, StorageComponentApi storageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.ozonTravelFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.tabsUiControllerComponentApi = tabsUiControllerComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.travelUnpaidOrderStorageApi = travelUnpaidOrderStorageApi;
            this.networkComponentApi = networkComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, tabsComponentApi, tabsUiControllerComponentApi, networkComponentApi, travelUnpaidOrderStorageApi, storageComponentApi, coroutineDispatchersComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static OzonTravelFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
