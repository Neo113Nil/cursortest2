package ru.ozon.app.android.tabbar.di;

import GZ.k;
import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.data.TabBarConfigRepositoryImpl;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.TabConfigManagerImpl;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.data.api.TabConfigApi;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.data.local.TabConfigCacheImpl;
import ru.ozon.app.android.tabbar.data.local.TabConfigLocalDataSource;
import ru.ozon.app.android.tabbar.di.TabsComponent;
import ru.ozon.app.android.tabbar.di.module.TabModule_Companion_ProvideTabConfigApiFactory;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProviderImpl;
import ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalyticsImpl;
import ru.ozon.app.android.tabbar.ui.helper.TabbarDeeplinksResolverImpl;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes7.dex */
public final class DaggerTabsComponent {

    private static final class Factory implements TabsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponent.Factory
        public TabsComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorefrontCommonComponentApi storefrontCommonComponentApi, ComposerComponentApi composerComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            navigationComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            storefrontCommonComponentApi.getClass();
            composerComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            return new TabsComponentImpl(contextComponentDependencies, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, androidPlatformComponentDependencies, storefrontCommonComponentApi, composerComponentApi, coroutineDispatchersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TabsComponentImpl implements TabsComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<TabConfigCache> bindTabConfigCacheProvider;
        private a<TabConfigRepository> bindTabConfigRepositoryProvider;
        private final ComposerComponentApi composerComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<TabBarAnalytics> provideTabBarAnalyticsProvider;
        private a<TabConfigApi> provideTabConfigApiProvider;
        private final StorefrontCommonComponentApi storefrontCommonComponentApi;
        private a<TabBarAnalyticsImpl> tabBarAnalyticsImplProvider;
        private a<TabBarConfigRepositoryImpl> tabBarConfigRepositoryImplProvider;
        private a<TabConfigCacheImpl> tabConfigCacheImplProvider;
        private a<TabConfigManagerImpl> tabConfigManagerImplProvider;
        private a<TabConfigUpdateDelegate> tabConfigUpdateDelegateProvider;
        private final TabsComponentImpl tabsComponentImpl;
        private a<TravelTabConfigUpdateDelegate> travelTabConfigUpdateDelegateProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93606id;
            private final TabsComponentImpl tabsComponentImpl;

            SwitchingProvider(TabsComponentImpl tabsComponentImpl, int i11) {
                this.tabsComponentImpl = tabsComponentImpl;
                this.f93606id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f93606id) {
                    case 0:
                        return (T) new TabConfigCacheImpl(this.tabsComponentImpl.tabConfigLocalDataSource());
                    case 1:
                        TabConfigUpdateDelegate tabConfigUpdateDelegate = (TabConfigUpdateDelegate) this.tabsComponentImpl.tabConfigUpdateDelegateProvider.get();
                        TabConfigRepository tabConfigRepository = (TabConfigRepository) this.tabsComponentImpl.bindTabConfigRepositoryProvider.get();
                        TabConfigCache tabConfigCache = (TabConfigCache) this.tabsComponentImpl.bindTabConfigCacheProvider.get();
                        TabConfigProviderImpl tabConfigProviderImpl = this.tabsComponentImpl.tabConfigProviderImpl();
                        TeensModeService teensModeService = this.tabsComponentImpl.storefrontCommonComponentApi.getTeensModeService();
                        j.c(teensModeService);
                        return (T) new TabConfigManagerImpl(tabConfigUpdateDelegate, tabConfigRepository, tabConfigCache, tabConfigProviderImpl, teensModeService);
                    case 2:
                        return (T) new TabConfigUpdateDelegate();
                    case 3:
                        return (T) new TabBarConfigRepositoryImpl((TabConfigApi) this.tabsComponentImpl.provideTabConfigApiProvider.get());
                    case 4:
                        Retrofit retrofit = this.tabsComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) TabModule_Companion_ProvideTabConfigApiFactory.provideTabConfigApi(retrofit);
                    case 5:
                        AnalyticsDataLayer analyticsDataLayer = this.tabsComponentImpl.analyticsComponentApi.getAnalyticsDataLayer();
                        j.c(analyticsDataLayer);
                        PluginsManager pluginsManager = this.tabsComponentImpl.analyticsComponentApi.getPluginsManager();
                        j.c(pluginsManager);
                        Sg.a analyticsScreenStorage = this.tabsComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        return (T) new TabBarAnalyticsImpl(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
                    case 6:
                        return (T) new TravelTabConfigUpdateDelegate();
                    default:
                        throw new AssertionError(this.f93606id);
                }
            }
        }

        /* synthetic */ TabsComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorefrontCommonComponentApi storefrontCommonComponentApi, ComposerComponentApi composerComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, int i11) {
            this(contextComponentDependencies, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, androidPlatformComponentDependencies, storefrontCommonComponentApi, composerComponentApi, coroutineDispatchersComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorefrontCommonComponentApi storefrontCommonComponentApi, ComposerComponentApi composerComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.tabsComponentImpl, 0);
            this.tabConfigCacheImplProvider = switchingProvider;
            this.bindTabConfigCacheProvider = d.b(switchingProvider);
            this.tabConfigUpdateDelegateProvider = d.b(new SwitchingProvider(this.tabsComponentImpl, 2));
            this.provideTabConfigApiProvider = d.b(new SwitchingProvider(this.tabsComponentImpl, 4));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.tabsComponentImpl, 3);
            this.tabBarConfigRepositoryImplProvider = switchingProvider2;
            this.bindTabConfigRepositoryProvider = d.b(switchingProvider2);
            this.tabConfigManagerImplProvider = d.b(new SwitchingProvider(this.tabsComponentImpl, 1));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.tabsComponentImpl, 5);
            this.tabBarAnalyticsImplProvider = switchingProvider3;
            this.provideTabBarAnalyticsProvider = d.b(switchingProvider3);
            this.travelTabConfigUpdateDelegateProvider = d.b(new SwitchingProvider(this.tabsComponentImpl, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TabConfigLocalDataSource tabConfigLocalDataSource() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TabConfigLocalDataSource(context, jsonSerializer, jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TabConfigProviderImpl tabConfigProviderImpl() {
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            TeensModeService teensModeService = this.storefrontCommonComponentApi.getTeensModeService();
            j.c(teensModeService);
            return new TabConfigProviderImpl(appType, teensModeService);
        }

        private TabConfigViewModelImpl tabConfigViewModelImpl() {
            TeensModeService teensModeService = this.storefrontCommonComponentApi.getTeensModeService();
            j.c(teensModeService);
            TabConfigManagerImpl tabConfigManagerImpl = this.tabConfigManagerImplProvider.get();
            ComposerNavigator composerNavigator = this.composerComponentApi.getComposerNavigator();
            j.c(composerNavigator);
            TabConfigUpdateDelegate tabConfigUpdateDelegate = this.tabConfigUpdateDelegateProvider.get();
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new TabConfigViewModelImpl(teensModeService, tabConfigManagerImpl, composerNavigator, tabConfigUpdateDelegate, dispatcherProvider);
        }

        private TabbarDeeplinksResolverImpl tabbarDeeplinksResolverImpl() {
            TabConfigManagerImpl tabConfigManagerImpl = this.tabConfigManagerImplProvider.get();
            k routeFactory = this.navigationComponentApi.getRouteFactory();
            j.c(routeFactory);
            HZ.a deeplinkHandlersCache = this.navigationComponentApi.getDeeplinkHandlersCache();
            j.c(deeplinkHandlersCache);
            return new TabbarDeeplinksResolverImpl(tabConfigManagerImpl, routeFactory, deeplinkHandlersCache);
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabBarAnalytics getTabAnalytics() {
            return this.provideTabBarAnalyticsProvider.get();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigCache getTabConfigCache() {
            return this.bindTabConfigCacheProvider.get();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigManager getTabConfigManager() {
            return this.tabConfigManagerImplProvider.get();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigProvider getTabConfigProvider() {
            return tabConfigProviderImpl();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigRepository getTabConfigRepository() {
            return this.bindTabConfigRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigUpdateDelegate getTabConfigRequestDelegate() {
            return this.tabConfigUpdateDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabConfigViewModel getTabConfigViewModel() {
            return tabConfigViewModelImpl();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TabbarDeeplinksResolver getTabbarDeeplinksResolver() {
            return tabbarDeeplinksResolverImpl();
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsComponentApi
        public TravelTabConfigUpdateDelegate getTravelTabConfigUpdateDelegate() {
            return this.travelTabConfigUpdateDelegateProvider.get();
        }

        private TabsComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorefrontCommonComponentApi storefrontCommonComponentApi, ComposerComponentApi composerComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            this.tabsComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.storefrontCommonComponentApi = storefrontCommonComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.composerComponentApi = composerComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(contextComponentDependencies, networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, androidPlatformComponentDependencies, storefrontCommonComponentApi, composerComponentApi, coroutineDispatchersComponentApi);
        }
    }

    public static TabsComponent.Factory factory() {
        return new Factory(0);
    }
}
