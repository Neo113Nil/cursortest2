package ru.ozon.app.android.fresh.navigation.di.components;

import EZ.h;
import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.fresh.navigation.FreshMapAppNameDelegate;
import ru.ozon.app.android.fresh.navigation.FreshTabMiniAppFragment;
import ru.ozon.app.android.fresh.navigation.FreshTabMiniAppFragment_MembersInjector;
import ru.ozon.app.android.fresh.navigation.FreshViewModel;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl_Factory;
import ru.ozon.app.android.fresh.navigation.di.components.FreshScreenComponent;
import ru.ozon.app.android.fresh.navigation.di.modules.MiniAppAnalyticsModule_Companion_ProvideMiniAppAnalyticsFactory;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshSingleMiniAppFragment;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshSingleMiniAppFragment_MembersInjector;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;

/* loaded from: classes12.dex */
public final class DaggerFreshScreenComponent {

    private static final class Factory implements FreshScreenComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshScreenComponent.Factory
        public FreshScreenComponent create(AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, LocationComponentApi locationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            analyticsComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            freshNavigationComponentApi.getClass();
            cartServiceApi.getClass();
            locationComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new FreshScreenComponentImpl(analyticsComponentApi, navigationComponentApi, composerComponentApi, accountComponentApi, networkComponentApi, freshNavigationComponentApi, cartServiceApi, locationComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FreshScreenComponentImpl implements FreshScreenComponent {
        private a<Sg.a> bindsAnalyticsScreenStorageProvider;
        private final FreshScreenComponentImpl freshScreenComponentImpl;
        private a<FreshViewModelImpl> freshViewModelImplProvider;
        private a<AnalyticsDataLayer> getAnalyticsDataLayerProvider;
        private a<Sg.a> getAnalyticsScreenStorageProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<FreshTabConfigRepository> getFreshTabConfigRepositoryProvider;
        private a<PluginsManager> getPluginsManagerProvider;
        private final LocationComponentApi locationComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private a<MiniAppAnalytics> provideMiniAppAnalyticsProvider;
        private a<FreshViewModel> provideViewModelProvider;

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

        /* synthetic */ FreshScreenComponentImpl(AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, LocationComponentApi locationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(analyticsComponentApi, navigationComponentApi, composerComponentApi, accountComponentApi, networkComponentApi, freshNavigationComponentApi, cartServiceApi, locationComponentApi, analyticsScreenStorageComponentApi);
        }

        private FreshMapAppNameDelegate freshMapAppNameDelegate() {
            OzonGeoProxyClient ozonGeoProxyClient = this.locationComponentApi.getOzonGeoProxyClient();
            j.c(ozonGeoProxyClient);
            AreaLocalStore areaLocalStore = this.locationComponentApi.getAreaLocalStore();
            j.c(areaLocalStore);
            return new FreshMapAppNameDelegate(ozonGeoProxyClient, areaLocalStore);
        }

        private void initialize(AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, LocationComponentApi locationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
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
            FreshViewModelImpl_Factory create = FreshViewModelImpl_Factory.create(this.getFreshTabConfigRepositoryProvider, this.getFeatureCheckerProvider, b12, this.bindsAnalyticsScreenStorageProvider);
            this.freshViewModelImplProvider = create;
            this.provideViewModelProvider = d.b(create);
        }

        private FreshSingleMiniAppFragment injectFreshSingleMiniAppFragment(FreshSingleMiniAppFragment freshSingleMiniAppFragment) {
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            FreshSingleMiniAppFragment_MembersInjector.injectHolder(freshSingleMiniAppFragment, navigatorHolder);
            FreshSingleMiniAppFragment_MembersInjector.injectViewModel(freshSingleMiniAppFragment, this.provideViewModelProvider.get());
            return freshSingleMiniAppFragment;
        }

        private FreshTabMiniAppFragment injectFreshTabMiniAppFragment(FreshTabMiniAppFragment freshTabMiniAppFragment) {
            FreshTabMiniAppFragment_MembersInjector.injectViewModel(freshTabMiniAppFragment, this.provideViewModelProvider.get());
            FreshTabMiniAppFragment_MembersInjector.injectFreshMapAppNameDelegate(freshTabMiniAppFragment, freshMapAppNameDelegate());
            return freshTabMiniAppFragment;
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshScreenComponent
        public void inject(FreshTabMiniAppFragment freshTabMiniAppFragment) {
            injectFreshTabMiniAppFragment(freshTabMiniAppFragment);
        }

        private FreshScreenComponentImpl(AnalyticsComponentApi analyticsComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, CartServiceApi cartServiceApi, LocationComponentApi locationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.freshScreenComponentImpl = this;
            this.locationComponentApi = locationComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(analyticsComponentApi, navigationComponentApi, composerComponentApi, accountComponentApi, networkComponentApi, freshNavigationComponentApi, cartServiceApi, locationComponentApi, analyticsScreenStorageComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.navigation.di.components.FreshScreenComponent
        public void inject(FreshSingleMiniAppFragment freshSingleMiniAppFragment) {
            injectFreshSingleMiniAppFragment(freshSingleMiniAppFragment);
        }
    }

    public static FreshScreenComponent.Factory factory() {
        return new Factory(0);
    }
}
