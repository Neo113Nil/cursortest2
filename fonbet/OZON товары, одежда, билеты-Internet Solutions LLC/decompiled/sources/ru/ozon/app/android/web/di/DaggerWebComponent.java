package ru.ozon.app.android.web.di;

import GZ.g;
import GZ.k;
import Jb.d;
import Jb.j;
import Pc.a;
import We.E;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import io.reactivex.x;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.app.android.web.WebFragmentViewModelImpl;
import ru.ozon.app.android.web.WebFragment_MembersInjector;
import ru.ozon.app.android.web.di.WebComponent;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.app.android.web.webview.WebViewRouterImpl;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestApi;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestRepository;
import ru.ozon.app.android.web.webview.cache.service.LocalCacheHelper;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptorImpl;
import ru.ozon.app.android.web.webview.cache.service.ResourcesDiffer;
import ru.ozon.app.android.web.webview.cache.service.ResourcesLoader;
import ru.ozon.app.android.web.webview.client.AddBarsOffsetQueryInterceptor;
import ru.ozon.app.android.web.webview.client.OzonWebViewClient;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandlerImpl;
import ru.ozon.app.android.web.webview.di.WebViewModule_Companion_ProvideLoadWebViewSchedulerFactory;
import ru.ozon.app.android.web.webview.di.WebViewModule_Companion_ProvideResourceApiFactory;

/* loaded from: classes7.dex */
public final class DaggerWebComponent {

    private static final class Factory implements WebComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.web.di.WebComponent.Factory
        public WebComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, WhitelistComponentApi whitelistComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            whitelistComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new WebComponentImpl(contextComponentDependencies, navigationComponentApi, networkComponentApi, whitelistComponentApi, storageComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class WebComponentImpl implements WebComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private a<WebViewRouter> bindWebRouterProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<x> provideLoadWebViewSchedulerProvider;
        private a<WebViewResourcesManager> provideResourceManagerProvider;
        private final StorageComponentApi storageComponentApi;
        private final WebComponentImpl webComponentImpl;
        private a<WebFragmentViewModelImpl> webFragmentViewModelImplProvider;
        private a<WebViewResourcesManagerImpl> webViewResourcesManagerImplProvider;
        private a<WebViewRouterImpl> webViewRouterImplProvider;
        private final WhitelistComponentApi whitelistComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94593id;
            private final WebComponentImpl webComponentImpl;

            SwitchingProvider(WebComponentImpl webComponentImpl, int i11) {
                this.webComponentImpl = webComponentImpl;
                this.f94593id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94593id;
                if (i11 == 0) {
                    CacheManifestRepository cacheManifestRepository = this.webComponentImpl.cacheManifestRepository();
                    SharedPreferences sharedPreferences = this.webComponentImpl.storageComponentApi.getSharedPreferences();
                    j.c(sharedPreferences);
                    return (T) new WebViewResourcesManagerImpl(cacheManifestRepository, sharedPreferences, this.webComponentImpl.resourcesDiffer(), this.webComponentImpl.localCacheHelper(), this.webComponentImpl.localStateActualizer());
                }
                if (i11 == 1) {
                    return (T) WebViewModule_Companion_ProvideLoadWebViewSchedulerFactory.provideLoadWebViewScheduler();
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return (T) new WebFragmentViewModelImpl();
                    }
                    throw new AssertionError(this.f94593id);
                }
                g ozonRouter = this.webComponentImpl.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                HZ.a deeplinkHandlersCache = this.webComponentImpl.navigationComponentApi.getDeeplinkHandlersCache();
                j.c(deeplinkHandlersCache);
                k routeFactory = this.webComponentImpl.navigationComponentApi.getRouteFactory();
                j.c(routeFactory);
                NetworkComponentConfig networkComponentConfig = this.webComponentImpl.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                FeatureService featureService = this.webComponentImpl.networkComponentApi.getFeatureService();
                j.c(featureService);
                return (T) new WebViewRouterImpl(ozonRouter, deeplinkHandlersCache, routeFactory, networkComponentConfig, featureService);
            }
        }

        /* synthetic */ WebComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(contextComponentDependencies, navigationComponentApi, networkComponentApi, whitelistComponentApi, storageComponentApi, analyticsComponentApi);
        }

        private WebFragmentUiDelegate.Ai ai() {
            WebViewRouter webViewRouter = this.bindWebRouterProvider.get();
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new WebFragmentUiDelegate.Ai(webViewRouter, moshi, jsonDeserializer);
        }

        private CacheManifestApi cacheManifestApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return WebViewModule_Companion_ProvideResourceApiFactory.provideResourceApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CacheManifestRepository cacheManifestRepository() {
            return new CacheManifestRepository(cacheManifestApi());
        }

        private AddBarsOffsetQueryInterceptor.Default default_() {
            return new AddBarsOffsetQueryInterceptor.Default(new CheckAiConversation.Default());
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.provideLoadWebViewSchedulerProvider = d.b(new SwitchingProvider(this.webComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.webComponentImpl, 0);
            this.webViewResourcesManagerImplProvider = switchingProvider;
            this.provideResourceManagerProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.webComponentImpl, 2);
            this.webViewRouterImplProvider = switchingProvider2;
            this.bindWebRouterProvider = d.b(switchingProvider2);
            this.webFragmentViewModelImplProvider = new SwitchingProvider(this.webComponentImpl, 3);
        }

        private WebFragment injectWebFragment(WebFragment webFragment) {
            WebFragment_MembersInjector.injectWebViewRouter(webFragment, this.bindWebRouterProvider.get());
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            WebFragment_MembersInjector.injectFeatureChecker(webFragment, featureChecker);
            WebFragment_MembersInjector.injectWebViewCacheManager(webFragment, this.provideResourceManagerProvider.get());
            WebFragment_MembersInjector.injectAiWebFragmentUiDelegate(webFragment, ai());
            WebFragment_MembersInjector.injectWebFragmentViewModelProvider(webFragment, this.webFragmentViewModelImplProvider);
            return webFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocalCacheHelper localCacheHelper() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new LocalCacheHelper(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocalStateActualizer localStateActualizer() {
            return new LocalStateActualizer(resourcesLoader(), localCacheHelper(), this.provideLoadWebViewSchedulerProvider);
        }

        private OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor() {
            DomainsInteractor domainsInteractor = this.whitelistComponentApi.getDomainsInteractor();
            j.c(domainsInteractor);
            NetworkHeadersProvider networkHeadersProvider = this.networkComponentApi.getNetworkHeadersProvider();
            j.c(networkHeadersProvider);
            return new OzonWebViewUrlInterceptor(domainsInteractor, networkHeadersProvider, default_());
        }

        private ResourcesCacheInterceptorImpl resourcesCacheInterceptorImpl() {
            return new ResourcesCacheInterceptorImpl(localCacheHelper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ResourcesDiffer resourcesDiffer() {
            return new ResourcesDiffer(localCacheHelper());
        }

        private ResourcesLoader resourcesLoader() {
            LocalCacheHelper localCacheHelper = localCacheHelper();
            E okHttpClient = this.networkComponentApi.getOkHttpClient();
            j.c(okHttpClient);
            return new ResourcesLoader(localCacheHelper, okHttpClient);
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public AddBarsOffsetQueryInterceptor getAddBarsOffsetQueryInterceptor() {
            return default_();
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public CheckAiConversation getCheckAiConversation() {
            return new CheckAiConversation.Default();
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public OzonWebViewClient getOzonWebViewClient() {
            ResourcesCacheInterceptorImpl resourcesCacheInterceptorImpl = resourcesCacheInterceptorImpl();
            PerformanceTrackerDelegate performanceTrackerDelegate = this.analyticsComponentApi.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            WebViewRendererProcessCrashHandlerImpl webViewRendererProcessCrashHandlerImpl = new WebViewRendererProcessCrashHandlerImpl();
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor = ozonWebViewUrlInterceptor();
            WebViewErrorLogger webViewErrorLogger = this.networkComponentApi.getWebViewErrorLogger();
            j.c(webViewErrorLogger);
            return new OzonWebViewClient(resourcesCacheInterceptorImpl, performanceTrackerDelegate, webViewRendererProcessCrashHandlerImpl, featureChecker, ozonWebViewUrlInterceptor, webViewErrorLogger);
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public ResourcesCacheInterceptor getResourcesCacheInterceptor() {
            return resourcesCacheInterceptorImpl();
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public WebViewRendererProcessCrashHandler getWebViewRendererProcessCrashHandler() {
            return new WebViewRendererProcessCrashHandlerImpl();
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public WebViewResourcesManager getWebViewResourcesManager() {
            return this.provideResourceManagerProvider.get();
        }

        @Override // ru.ozon.app.android.web.di.WebComponentApi
        public WebViewRouter getWebViewRouter() {
            return this.bindWebRouterProvider.get();
        }

        @Override // ru.ozon.app.android.web.di.WebComponent
        public void inject(WebFragment webFragment) {
            injectWebFragment(webFragment);
        }

        private WebComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.webComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.navigationComponentApi = navigationComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.whitelistComponentApi = whitelistComponentApi;
            initialize(contextComponentDependencies, navigationComponentApi, networkComponentApi, whitelistComponentApi, storageComponentApi, analyticsComponentApi);
        }
    }

    public static WebComponent.Factory factory() {
        return new Factory(0);
    }
}
