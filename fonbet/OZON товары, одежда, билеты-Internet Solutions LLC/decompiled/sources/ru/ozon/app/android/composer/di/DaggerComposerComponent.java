package ru.ozon.app.android.composer.di;

import E10.c;
import Jb.j;
import Jb.m;
import L00.d;
import L00.f;
import O00.b;
import Pc.a;
import Qj0.InterfaceC3896p;
import WZ.l;
import We.B;
import We.C4862d;
import We.C4876s;
import We.E;
import We.InterfaceC4875q;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.List;
import java.util.Set;
import jk0.g;
import n20.i;
import qj.C9067a;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.di.PerformanceAnalyticsApi;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorageImpl;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.modules.ComposerModule_Companion_ProvideComposerFrequencyLoadCheckerFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProvideComposerAsyncWidgetsRepositoryFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProvideComposerBaseUrlFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProvideComposerNetworkFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProvideCronetMetricListenerFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProvideOkHttpClientFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProviderComposerCallFactoryFactory;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule_Companion_ProviderCronetConfigFactory;
import ru.ozon.app.android.composer.di.modules.OkHttpClientProvider;
import ru.ozon.app.android.composer.di.modules.TokenizedAnalyticsModule_ProvideAnalyticsScreenFactoryFactory;
import ru.ozon.app.android.composer.di.modules.TokenizedAnalyticsModule_ProvideAnalyticsScreenToTrackerPageConverterFactory;
import ru.ozon.app.android.composer.di.modules.TokenizedAnalyticsModule_ProvideTokenizedAnalyticsFactory;
import ru.ozon.app.android.composer.di.modules.WidgetLifecycleModule_ProvideLifecycleAdapterDelegateFactoryFactory;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import ru.ozon.app.android.composer.domain.api.ComposerJsonSerializer;
import ru.ozon.app.android.composer.domain.cache.CachePreferences;
import ru.ozon.app.android.composer.domain.cache.CachePreferencesImpl;
import ru.ozon.app.android.composer.domain.cache.ComposerCache;
import ru.ozon.app.android.composer.domain.cache.ComposerCacheImpl;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorageImpl;
import ru.ozon.app.android.composer.domain.cache.FileHelper;
import ru.ozon.app.android.composer.domain.cache.FileHelperImpl;
import ru.ozon.app.android.composer.navigator.OzonComposerNavigator;
import ru.ozon.app.android.composer.network.ComposerFirstLoadInterceptor;
import ru.ozon.app.android.composer.network.ComposerHttpInterceptor;
import ru.ozon.app.android.composer.network.ComposerReferrerInterceptor;
import ru.ozon.app.android.composer.network.TestCookieInterceptor;
import ru.ozon.app.android.composer.network.cache.CacheHandlersHolder;
import ru.ozon.app.android.composer.network.cache.CachedUrls;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.cache.ComposerCacheServiceImpl;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.cache.interceptor.NotifyCacheHitInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.OnSaveToCacheInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.SubstituteCacheControlMaxAgeInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.readFromCache.AdaptRequestUrlAppInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.saveToCache.AdaptRequestUrlNetworkInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CacheErrorInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy;
import ru.ozon.app.android.composer.network.cart.CartNetworkDependencies;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetEventListenerFactory;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.composer.network.geo.GeoNetworkDependencies;
import ru.ozon.app.android.composer.network.join.JoinRequestsAppInterceptor;
import ru.ozon.app.android.composer.network.join.JoinRequestsStrategy;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchServiceImpl;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolderImpl;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolderImpl;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.composer.network.redirect.AppsFlyerRedirectNetworkInterceptor;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;
import ru.ozon.app.android.composer.network.redirect.RedirectAppInterceptor;
import ru.ozon.app.android.composer.network.redirect.RedirectNetworkInterceptor;
import ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerHeaderInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerReviewHeaderInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.composer.network.security.search.SourceInterceptor;
import ru.ozon.app.android.composer.network.tiles.TilesNetworkDependencies;
import ru.ozon.app.android.composer.tracker.ComposerNetworkMetricsProvider;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchManagerImpl;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PageTypePrefetchDepthRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PageTypePrefetchDepthRepositoryImpl;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PerformancePrefetchDepthRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PerformancePrefetchDepthRepositoryImpl;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PrefetchCategoryRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PrefetchCategoryRepositoryImpl;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractorImpl;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetEventListenerFactory;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.homeprefetch.HomePrefetchInterceptor;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.test.TestUserComponentApi;
import ru.ozon.app.android.storage.user.test.TestUserStorage;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes6.dex */
public final class DaggerComposerComponent {

    private static final class ComposerComponentImpl implements ComposerComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<AppsFlyerRedirectNetworkInterceptor> appsFlyerRedirectNetworkInterceptorProvider;
        private a<CachePreferences> bindCachePreferencesProvider;
        private a<ComposerCache> bindComposerCacheProvider;
        private a<ComposerCacheService> bindComposerCacheServiceProvider;
        private a<ComposerConfiguratorStorage> bindComposerConfiguratorStorageProvider;
        private a<ComposerNavigator> bindComposerNavigatorProvider;
        private a<ComposerPrefetchService> bindComposerPrefetchServiceProvider;
        private a<ComposerPrefetchedUrlsHolder> bindComposerPrefetchedUrlsHolderProvider;
        private a<ComposerResponseStorage> bindComposerResponseStorageProvider;
        private a<FileHelper> bindFileStorageProvider;
        private a<PageTypePrefetchDepthRepository> bindPageTypePrefetchDepthRepositoryProvider;
        private a<PerformancePrefetchDepthRepository> bindPerformancePrefetchDepthRepositoryProvider;
        private a<PrefetchCategoryRepository> bindPrefetchCategoryRepositoryProvider;
        private a<c> bindPrefetchManagerProvider;
        private a<CronetEventListenerFactory> bindProvider;
        private a<UrlPrefetchedEventHolder> bindUrlPrefetchEventHolderProvider;
        private final CacheComponentApi cacheComponentApi;
        private a<CacheErrorInterceptor> cacheErrorInterceptorProvider;
        private final CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi;
        private a<CacheHandlersHolder> cacheHandlersHolderProvider;
        private a<CachePreferencesImpl> cachePreferencesImplProvider;
        private final CartNetworkDependencies cartNetworkDependencies;
        private a<ComposerCacheImpl> composerCacheImplProvider;
        private a<ComposerCacheServiceImpl> composerCacheServiceImplProvider;
        private final ComposerComponentImpl composerComponentImpl;
        private a<ComposerConfiguratorStorageImpl> composerConfiguratorStorageImplProvider;
        private a<ComposerCronetEventListenerFactory> composerCronetEventListenerFactoryProvider;
        private a<ComposerPrefetchServiceImpl> composerPrefetchServiceImplProvider;
        private a<ComposerPrefetchedUrlsHolderImpl> composerPrefetchedUrlsHolderImplProvider;
        private a<ComposerResponseStorageImpl> composerResponseStorageImplProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private a<JoinRequestsStrategy.Enabled> enabledProvider;
        private final EventStorageComponentApi eventStorageComponentApi;
        private a<CheckCacheStrategy.Enabled.Factory> factoryProvider;
        private a<FileHelperImpl> fileHelperImplProvider;
        private final GeoNetworkDependencies geoNetworkDependencies;
        private a<ComposerCacheCleaner> getCacheCleanerProvider;
        private a<C4862d> getCacheProvider;
        private a<C4876s> getDispatcherProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<PerformanceTrackerDelegate> getPerformanceTrackerDelegateProvider;
        private a<JoinRequestsAppInterceptor> joinRequestsAppInterceptorProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private final NotificationStatusComponentApi notificationStatusComponentApi;
        private a<NotifyCacheHitInterceptor> notifyCacheHitInterceptorProvider;
        private a<OzonComposerNavigator> ozonComposerNavigatorProvider;
        private final OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi;
        private a<PageTypePrefetchDepthRepositoryImpl> pageTypePrefetchDepthRepositoryImplProvider;
        private final PerformanceAnalyticsApi performanceAnalyticsApi;
        private a<PerformancePrefetchDepthRepositoryImpl> performancePrefetchDepthRepositoryImplProvider;
        private a<PrefetchCategoryRepositoryImpl> prefetchCategoryRepositoryImplProvider;
        private a<PrefetchManagerImpl> prefetchManagerImplProvider;
        private a<VZ.a> provideAnalyticsScreenFactoryProvider;
        private a<ZZ.a> provideAnalyticsScreenToTrackerPageConverterProvider;
        private a<b> provideComposerAsyncWidgetsRepositoryProvider;
        private a<f> provideComposerBaseUrlProvider;
        private a<D00.a> provideComposerFrequencyLoadCheckerProvider;
        private a<K00.a> provideComposerNetworkProvider;
        private a<ComposerCronetMetricsListener> provideCronetMetricListenerProvider;
        private a<g<k<l20.c>>> provideLifecycleAdapterDelegateFactoryProvider;
        private a<E> provideOkHttpClientProvider;
        private a<d> providerComposerCallFactoryProvider;
        private a<CronetConfig> providerCronetConfigProvider;
        private a<RedirectAppInterceptor> redirectAppInterceptorProvider;
        private a<RedirectNetworkInterceptor> redirectNetworkInterceptorProvider;
        private a<ReferrerHeaderInterceptor> referrerHeaderInterceptorProvider;
        private a<ReferrerReviewHeaderInterceptor> referrerReviewHeaderInterceptorProvider;
        private a<ReferrerValueController> referrerValueControllerProvider;
        private a<RestrictRedirectsNetworkInterceptor> restrictRedirectsNetworkInterceptorProvider;
        private final RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi;
        private a<SourceInterceptor> sourceInterceptorProvider;
        private final StartupTimeTrackerComponentApi startupTimeTrackerComponentApi;
        private final StorageComponentApi storageComponentApi;
        private a<SubstituteCacheControlMaxAgeInterceptor> substituteCacheControlMaxAgeInterceptorProvider;
        private final TestUserComponentApi testUserComponentApi;
        private final TilesNetworkDependencies tilesNetworkDependencies;
        private a<UrlPrefetchedEventHolderImpl> urlPrefetchedEventHolderImplProvider;
        private final WidgetRegistrationComponentApi widgetRegistrationComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ComposerComponentImpl composerComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92475id;

            SwitchingProvider(ComposerComponentImpl composerComponentImpl, int i11) {
                this.composerComponentImpl = composerComponentImpl;
                this.f92475id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92475id) {
                    case 0:
                        FeatureService featureService = this.composerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        PrefetchCategoryRepository prefetchCategoryRepository = (PrefetchCategoryRepository) this.composerComponentImpl.bindPrefetchCategoryRepositoryProvider.get();
                        PageTypePrefetchDepthRepository pageTypePrefetchDepthRepository = (PageTypePrefetchDepthRepository) this.composerComponentImpl.bindPageTypePrefetchDepthRepositoryProvider.get();
                        PerformancePrefetchDepthRepository performancePrefetchDepthRepository = (PerformancePrefetchDepthRepository) this.composerComponentImpl.bindPerformancePrefetchDepthRepositoryProvider.get();
                        CoroutineDispatcherProvider dispatcherProvider = this.composerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        Context context = this.composerComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) new PrefetchManagerImpl(featureService, prefetchCategoryRepository, pageTypePrefetchDepthRepository, performancePrefetchDepthRepository, dispatcherProvider, context);
                    case 1:
                        DeviceHardwareInfoProvider deviceHardwareInfoProvider = this.composerComponentImpl.analyticsComponentApi.getDeviceHardwareInfoProvider();
                        j.c(deviceHardwareInfoProvider);
                        return (T) new PrefetchCategoryRepositoryImpl(deviceHardwareInfoProvider);
                    case 2:
                        FeatureService featureService2 = this.composerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        Moshi moshi = this.composerComponentImpl.networkComponentApi.getMoshi();
                        j.c(moshi);
                        return (T) new PageTypePrefetchDepthRepositoryImpl(featureService2, moshi);
                    case 3:
                        FeatureService featureService3 = this.composerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService3);
                        return (T) new PerformancePrefetchDepthRepositoryImpl(featureService3);
                    case 4:
                        return (T) new RestrictRedirectsNetworkInterceptor();
                    case 5:
                        return (T) new CacheErrorInterceptor((CheckCacheStrategy.Enabled.Factory) this.composerComponentImpl.factoryProvider.get());
                    case 6:
                        return (T) new CheckCacheStrategy.Enabled.Factory() { // from class: ru.ozon.app.android.composer.di.DaggerComposerComponent.ComposerComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy.Enabled.Factory
                            public CheckCacheStrategy.Enabled create(long j11, boolean z11, Boolean bool) {
                                return new CheckCacheStrategy.Enabled(j11, z11, bool, Jb.d.a(SwitchingProvider.this.composerComponentImpl.getCacheProvider), Jb.d.a(SwitchingProvider.this.composerComponentImpl.getCacheCleanerProvider));
                            }
                        };
                    case 7:
                        T t2 = (T) this.composerComponentImpl.cacheComponentApi.getCache();
                        j.c(t2);
                        return t2;
                    case 8:
                        T t11 = (T) this.composerComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(t11);
                        return t11;
                    case 9:
                        return (T) new UrlPrefetchedEventHolderImpl();
                    case 10:
                        d dVar = (d) this.composerComponentImpl.providerComposerCallFactoryProvider.get();
                        CacheHandlersHolder cacheHandlersHolder = (CacheHandlersHolder) this.composerComponentImpl.cacheHandlersHolderProvider.get();
                        ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder = this.composerComponentImpl.runningPrefetchedRequestUrlsComponentApi.getRunningPrefetchedRequestUrlsHolder();
                        j.c(runningPrefetchedRequestUrlsHolder);
                        return (T) new ComposerPrefetchServiceImpl(dVar, cacheHandlersHolder, runningPrefetchedRequestUrlsHolder, (UrlPrefetchedEventHolder) this.composerComponentImpl.bindUrlPrefetchEventHolderProvider.get());
                    case 11:
                        return (T) ComposerNetworkModule_Companion_ProviderComposerCallFactoryFactory.providerComposerCallFactory((K00.a) this.composerComponentImpl.provideComposerNetworkProvider.get());
                    case 12:
                        E e11 = (E) this.composerComponentImpl.provideOkHttpClientProvider.get();
                        E okHttpClient = this.composerComponentImpl.networkComponentApi.getOkHttpClient();
                        j.c(okHttpClient);
                        Application application = this.composerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application);
                        AppVersionStorage appVersionStorage = this.composerComponentImpl.storageComponentApi.getAppVersionStorage();
                        j.c(appVersionStorage);
                        NetworkComponentConfig networkComponentConfig = this.composerComponentImpl.networkComponentApi.getNetworkComponentConfig();
                        j.c(networkComponentConfig);
                        FeatureService featureService4 = this.composerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService4);
                        ComposerJsonSerializer composerJsonSerializer = this.composerComponentImpl.composerJsonSerializer();
                        ComposerJsonDeserializer composerJsonDeserializer = this.composerComponentImpl.composerJsonDeserializer();
                        ComposerNetworkMetricsProvider composerNetworkMetricsProvider = this.composerComponentImpl.composerNetworkMetricsProvider();
                        ComposerRedirectListener composerRedirectListener = this.composerComponentImpl.composerRedirectListener();
                        ComposerCache composerCache = (ComposerCache) this.composerComponentImpl.bindComposerCacheProvider.get();
                        GncOkHttpClientBuilder gncOkHttpClientBuilder = this.composerComponentImpl.networkComponentApi.getGncOkHttpClientBuilder();
                        j.c(gncOkHttpClientBuilder);
                        return (T) ComposerNetworkModule_Companion_ProvideComposerNetworkFactory.provideComposerNetwork(e11, okHttpClient, application, appVersionStorage, networkComponentConfig, featureService4, composerJsonSerializer, composerJsonDeserializer, composerNetworkMetricsProvider, composerRedirectListener, composerCache, gncOkHttpClientBuilder);
                    case 13:
                        FeatureChecker featureChecker = (FeatureChecker) this.composerComponentImpl.getFeatureCheckerProvider.get();
                        OkHttpClientProvider okHttpClientProvider = this.composerComponentImpl.okHttpClientProvider();
                        CronetOkHttpClientProvider cronetOkHttpClientProvider = this.composerComponentImpl.networkComponentApi.getCronetOkHttpClientProvider();
                        j.c(cronetOkHttpClientProvider);
                        InterfaceC4875q cookieJar = this.composerComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        CronetEventListenerFactory cronetEventListenerFactory = (CronetEventListenerFactory) this.composerComponentImpl.bindProvider.get();
                        CronetConfig cronetConfig = (CronetConfig) this.composerComponentImpl.providerCronetConfigProvider.get();
                        C4862d c4862d = (C4862d) this.composerComponentImpl.getCacheProvider.get();
                        B acceptEncodingInterceptor = this.composerComponentImpl.networkComponentApi.getAcceptEncodingInterceptor();
                        j.c(acceptEncodingInterceptor);
                        ComposerCronetMetricsListener composerCronetMetricsListener = (ComposerCronetMetricsListener) this.composerComponentImpl.provideCronetMetricListenerProvider.get();
                        InterfaceC6369b ozonTracker = this.composerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        return (T) ComposerNetworkModule_Companion_ProvideOkHttpClientFactory.provideOkHttpClient(featureChecker, okHttpClientProvider, cronetOkHttpClientProvider, cookieJar, cronetEventListenerFactory, cronetConfig, c4862d, acceptEncodingInterceptor, composerCronetMetricsListener, ozonTracker);
                    case 14:
                        T t12 = (T) this.composerComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(t12);
                        return t12;
                    case 15:
                        return (T) new JoinRequestsAppInterceptor(this.composerComponentImpl.enabledProvider, this.composerComponentImpl.getFeatureCheckerProvider);
                    case 16:
                        return (T) new JoinRequestsStrategy.Enabled(Jb.d.a(this.composerComponentImpl.getDispatcherProvider), Jb.d.a(this.composerComponentImpl.bindComposerPrefetchServiceProvider), Jb.d.a(this.composerComponentImpl.getPerformanceTrackerDelegateProvider));
                    case 17:
                        T t13 = (T) this.composerComponentImpl.networkComponentApi.getDispatcher();
                        j.c(t13);
                        return t13;
                    case 18:
                        T t14 = (T) this.composerComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                        j.c(t14);
                        return t14;
                    case 19:
                        return (T) new ReferrerHeaderInterceptor((ReferrerValueController) this.composerComponentImpl.referrerValueControllerProvider.get());
                    case 20:
                        return (T) new ReferrerValueController();
                    case 21:
                        return (T) new ReferrerReviewHeaderInterceptor();
                    case 22:
                        return (T) new RedirectAppInterceptor((ComposerPrefetchedUrlsHolder) this.composerComponentImpl.bindComposerPrefetchedUrlsHolderProvider.get());
                    case 23:
                        ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder2 = this.composerComponentImpl.runningPrefetchedRequestUrlsComponentApi.getRunningPrefetchedRequestUrlsHolder();
                        j.c(runningPrefetchedRequestUrlsHolder2);
                        return (T) new ComposerPrefetchedUrlsHolderImpl(runningPrefetchedRequestUrlsHolder2);
                    case 24:
                        ComposerPrefetchedUrlsHolder composerPrefetchedUrlsHolder = (ComposerPrefetchedUrlsHolder) this.composerComponentImpl.bindComposerPrefetchedUrlsHolderProvider.get();
                        PerformanceTrackerDelegate performanceTrackerDelegate = (PerformanceTrackerDelegate) this.composerComponentImpl.getPerformanceTrackerDelegateProvider.get();
                        InterfaceC4875q cookieJar2 = this.composerComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar2);
                        return (T) new RedirectNetworkInterceptor(composerPrefetchedUrlsHolder, performanceTrackerDelegate, cookieJar2, (ComposerCacheService) this.composerComponentImpl.bindComposerCacheServiceProvider.get(), (FeatureChecker) this.composerComponentImpl.getFeatureCheckerProvider.get());
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        CacheHandlersHolder cacheHandlersHolder2 = (CacheHandlersHolder) this.composerComponentImpl.cacheHandlersHolderProvider.get();
                        FeatureChecker featureChecker2 = (FeatureChecker) this.composerComponentImpl.getFeatureCheckerProvider.get();
                        ComposerCacheCleaner composerCacheCleaner = (ComposerCacheCleaner) this.composerComponentImpl.getCacheCleanerProvider.get();
                        CachedUrls cachedUrls = this.composerComponentImpl.cacheComponentApi.getCachedUrls();
                        j.c(cachedUrls);
                        return (T) new ComposerCacheServiceImpl(cacheHandlersHolder2, featureChecker2, composerCacheCleaner, cachedUrls);
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        Set<ComposerCacheHandler> cacheHandlers = this.composerComponentImpl.cacheHandlerRegistrationComponentApi.getCacheHandlers();
                        j.c(cacheHandlers);
                        return (T) new CacheHandlersHolder(cacheHandlers);
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        AppsFlyerResolver appsFlyerResolver = this.composerComponentImpl.appsFlyerResolver();
                        AppLaunchAnalytics appLaunchAnalytics = this.composerComponentImpl.analyticsComponentApi.getAppLaunchAnalytics();
                        j.c(appLaunchAnalytics);
                        return (T) new AppsFlyerRedirectNetworkInterceptor(appsFlyerResolver, appLaunchAnalytics);
                    case 28:
                        return (T) new NotifyCacheHitInterceptor((ComposerCacheService) this.composerComponentImpl.bindComposerCacheServiceProvider.get(), (ComposerPrefetchedUrlsHolder) this.composerComponentImpl.bindComposerPrefetchedUrlsHolderProvider.get());
                    case 29:
                        return (T) new SubstituteCacheControlMaxAgeInterceptor((ComposerCacheService) this.composerComponentImpl.bindComposerCacheServiceProvider.get());
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        return (T) new SourceInterceptor();
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        PrefetchEventInterceptor prefetchEventInterceptor = this.composerComponentImpl.prefetchEventInterceptor();
                        Context context2 = this.composerComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new ComposerCronetEventListenerFactory(prefetchEventInterceptor, context2);
                    case 32:
                        return (T) ComposerNetworkModule_Companion_ProviderCronetConfigFactory.providerCronetConfig();
                    case 33:
                        C9067a networkInfoProvider = this.composerComponentImpl.networkComponentApi.getNetworkInfoProvider();
                        j.c(networkInfoProvider);
                        InterfaceC6369b ozonTracker2 = this.composerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker2);
                        return (T) ComposerNetworkModule_Companion_ProvideCronetMetricListenerFactory.provideCronetMetricListener(networkInfoProvider, ozonTracker2, (PerformanceTrackerDelegate) this.composerComponentImpl.getPerformanceTrackerDelegateProvider.get(), this.composerComponentImpl.prefetchEventInterceptor(), (CronetConfig) this.composerComponentImpl.providerCronetConfigProvider.get());
                    case 34:
                        return (T) new ComposerCacheImpl((ComposerResponseStorage) this.composerComponentImpl.bindComposerResponseStorageProvider.get());
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        return (T) new ComposerResponseStorageImpl((CachePreferences) this.composerComponentImpl.bindCachePreferencesProvider.get(), (FileHelper) this.composerComponentImpl.bindFileStorageProvider.get());
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        Context context3 = this.composerComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) new CachePreferencesImpl(context3);
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        Context context4 = this.composerComponentImpl.contextComponentDependencies.getContext();
                        j.c(context4);
                        return (T) new FileHelperImpl(context4);
                    case 38:
                        return (T) ComposerModule_Companion_ProvideComposerFrequencyLoadCheckerFactory.provideComposerFrequencyLoadChecker();
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        return (T) TokenizedAnalyticsModule_ProvideAnalyticsScreenFactoryFactory.provideAnalyticsScreenFactory();
                    case 40:
                        return (T) TokenizedAnalyticsModule_ProvideAnalyticsScreenToTrackerPageConverterFactory.provideAnalyticsScreenToTrackerPageConverter();
                    case 41:
                        GZ.g ozonRouter = this.composerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) new OzonComposerNavigator(ozonRouter);
                    case 42:
                        return (T) new ComposerConfiguratorStorageImpl();
                    case 43:
                        return (T) WidgetLifecycleModule_ProvideLifecycleAdapterDelegateFactoryFactory.provideLifecycleAdapterDelegateFactory();
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        return (T) ComposerNetworkModule_Companion_ProvideComposerAsyncWidgetsRepositoryFactory.provideComposerAsyncWidgetsRepository((K00.a) this.composerComponentImpl.provideComposerNetworkProvider.get());
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        return (T) ComposerNetworkModule_Companion_ProvideComposerBaseUrlFactory.provideComposerBaseUrl((K00.a) this.composerComponentImpl.provideComposerNetworkProvider.get());
                    default:
                        throw new AssertionError(this.f92475id);
                }
            }
        }

        /* synthetic */ ComposerComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WidgetRegistrationComponentApi widgetRegistrationComponentApi, CacheComponentApi cacheComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi, TestUserComponentApi testUserComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, EventStorageComponentApi eventStorageComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, PerformanceAnalyticsApi performanceAnalyticsApi, CartNetworkDependencies cartNetworkDependencies, GeoNetworkDependencies geoNetworkDependencies, NotificationStatusComponentApi notificationStatusComponentApi, TilesNetworkDependencies tilesNetworkDependencies, int i11) {
            this(contextComponentDependencies, navigationComponentApi, storageComponentApi, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, widgetRegistrationComponentApi, cacheComponentApi, cacheHandlerRegistrationComponentApi, runningPrefetchedRequestUrlsComponentApi, ozonTrackerSupportedPayloadTypesComponentApi, testUserComponentApi, coroutineDispatchersComponentApi, eventStorageComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, performanceAnalyticsApi, cartNetworkDependencies, geoNetworkDependencies, notificationStatusComponentApi, tilesNetworkDependencies);
        }

        private AdaptRequestUrlAppInterceptor adaptRequestUrlAppInterceptor() {
            return new AdaptRequestUrlAppInterceptor(this.bindComposerCacheServiceProvider.get());
        }

        private AdaptRequestUrlNetworkInterceptor adaptRequestUrlNetworkInterceptor() {
            return new AdaptRequestUrlNetworkInterceptor(this.bindComposerCacheServiceProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AppsFlyerResolver appsFlyerResolver() {
            AppsFlyerConversionStorage appsFlyerConversionStorage = this.analyticsComponentApi.getAppsFlyerConversionStorage();
            j.c(appsFlyerConversionStorage);
            return new AppsFlyerResolver(appsFlyerConversionStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerJsonDeserializer composerJsonDeserializer() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new ComposerJsonDeserializer(moshi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerJsonSerializer composerJsonSerializer() {
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            return new ComposerJsonSerializer(jsonSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerNetworkMetricsProvider composerNetworkMetricsProvider() {
            return new ComposerNetworkMetricsProvider(this.getPerformanceTrackerDelegateProvider.get(), this.getFeatureCheckerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerRedirectListener composerRedirectListener() {
            C9067a networkInfoProvider = this.networkComponentApi.getNetworkInfoProvider();
            j.c(networkInfoProvider);
            return new ComposerRedirectListener(networkInfoProvider, this.getPerformanceTrackerDelegateProvider.get());
        }

        private ComposerReferrerInterceptor composerReferrerInterceptor() {
            AppLaunchAnalytics appLaunchAnalytics = this.analyticsComponentApi.getAppLaunchAnalytics();
            j.c(appLaunchAnalytics);
            return new ComposerReferrerInterceptor(appLaunchAnalytics);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WidgetRegistrationComponentApi widgetRegistrationComponentApi, CacheComponentApi cacheComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi, TestUserComponentApi testUserComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, EventStorageComponentApi eventStorageComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, PerformanceAnalyticsApi performanceAnalyticsApi, CartNetworkDependencies cartNetworkDependencies, GeoNetworkDependencies geoNetworkDependencies, NotificationStatusComponentApi notificationStatusComponentApi, TilesNetworkDependencies tilesNetworkDependencies) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.composerComponentImpl, 1);
            this.prefetchCategoryRepositoryImplProvider = switchingProvider;
            this.bindPrefetchCategoryRepositoryProvider = Jb.d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.composerComponentImpl, 2);
            this.pageTypePrefetchDepthRepositoryImplProvider = switchingProvider2;
            this.bindPageTypePrefetchDepthRepositoryProvider = Jb.d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.composerComponentImpl, 3);
            this.performancePrefetchDepthRepositoryImplProvider = switchingProvider3;
            this.bindPerformancePrefetchDepthRepositoryProvider = Jb.d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.composerComponentImpl, 0);
            this.prefetchManagerImplProvider = switchingProvider4;
            this.bindPrefetchManagerProvider = Jb.d.b(switchingProvider4);
            this.restrictRedirectsNetworkInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 4));
            this.getCacheProvider = new SwitchingProvider(this.composerComponentImpl, 7);
            this.getCacheCleanerProvider = new SwitchingProvider(this.composerComponentImpl, 8);
            this.factoryProvider = m.a(new SwitchingProvider(this.composerComponentImpl, 6));
            this.cacheErrorInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 5));
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.composerComponentImpl, 9);
            this.urlPrefetchedEventHolderImplProvider = switchingProvider5;
            this.bindUrlPrefetchEventHolderProvider = Jb.d.b(switchingProvider5);
            this.getFeatureCheckerProvider = new SwitchingProvider(this.composerComponentImpl, 14);
            this.getDispatcherProvider = new SwitchingProvider(this.composerComponentImpl, 17);
            this.bindComposerPrefetchServiceProvider = new Jb.c();
            this.getPerformanceTrackerDelegateProvider = new SwitchingProvider(this.composerComponentImpl, 18);
            this.enabledProvider = new SwitchingProvider(this.composerComponentImpl, 16);
            this.joinRequestsAppInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 15));
            this.referrerValueControllerProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 20));
            this.referrerHeaderInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 19));
            this.referrerReviewHeaderInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 21));
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.composerComponentImpl, 23);
            this.composerPrefetchedUrlsHolderImplProvider = switchingProvider6;
            this.bindComposerPrefetchedUrlsHolderProvider = Jb.d.b(switchingProvider6);
            this.redirectAppInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 22));
            this.cacheHandlersHolderProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 26));
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.composerComponentImpl, 25);
            this.composerCacheServiceImplProvider = switchingProvider7;
            this.bindComposerCacheServiceProvider = Jb.d.b(switchingProvider7);
            this.redirectNetworkInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 24));
            this.appsFlyerRedirectNetworkInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 27));
            this.notifyCacheHitInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 28));
            this.substituteCacheControlMaxAgeInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 29));
            this.sourceInterceptorProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 30));
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.composerComponentImpl, 31);
            this.composerCronetEventListenerFactoryProvider = switchingProvider8;
            this.bindProvider = Jb.d.b(switchingProvider8);
            this.providerCronetConfigProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 32));
            this.provideCronetMetricListenerProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 33));
            this.provideOkHttpClientProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 13));
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.composerComponentImpl, 36);
            this.cachePreferencesImplProvider = switchingProvider9;
            this.bindCachePreferencesProvider = Jb.d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.composerComponentImpl, 37);
            this.fileHelperImplProvider = switchingProvider10;
            this.bindFileStorageProvider = Jb.d.b(switchingProvider10);
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.composerComponentImpl, 35);
            this.composerResponseStorageImplProvider = switchingProvider11;
            this.bindComposerResponseStorageProvider = Jb.d.b(switchingProvider11);
            SwitchingProvider switchingProvider12 = new SwitchingProvider(this.composerComponentImpl, 34);
            this.composerCacheImplProvider = switchingProvider12;
            this.bindComposerCacheProvider = Jb.d.b(switchingProvider12);
            this.provideComposerNetworkProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 12));
            this.providerComposerCallFactoryProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 11));
            SwitchingProvider switchingProvider13 = new SwitchingProvider(this.composerComponentImpl, 10);
            this.composerPrefetchServiceImplProvider = switchingProvider13;
            Jb.c.a(this.bindComposerPrefetchServiceProvider, Jb.d.b(switchingProvider13));
            this.provideComposerFrequencyLoadCheckerProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 38));
            this.provideAnalyticsScreenFactoryProvider = m.a(new SwitchingProvider(this.composerComponentImpl, 39));
            this.provideAnalyticsScreenToTrackerPageConverterProvider = m.a(new SwitchingProvider(this.composerComponentImpl, 40));
            SwitchingProvider switchingProvider14 = new SwitchingProvider(this.composerComponentImpl, 41);
            this.ozonComposerNavigatorProvider = switchingProvider14;
            this.bindComposerNavigatorProvider = Jb.d.b(switchingProvider14);
            SwitchingProvider switchingProvider15 = new SwitchingProvider(this.composerComponentImpl, 42);
            this.composerConfiguratorStorageImplProvider = switchingProvider15;
            this.bindComposerConfiguratorStorageProvider = Jb.d.b(switchingProvider15);
            this.provideLifecycleAdapterDelegateFactoryProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 43));
            this.provideComposerAsyncWidgetsRepositoryProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 44));
            this.provideComposerBaseUrlProvider = Jb.d.b(new SwitchingProvider(this.composerComponentImpl, 45));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OkHttpClientProvider okHttpClientProvider() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            E okHttpClient = this.networkComponentApi.getOkHttpClient();
            j.c(okHttpClient);
            C4862d c4862d = this.getCacheProvider.get();
            JoinRequestsAppInterceptor joinRequestsAppInterceptor = this.joinRequestsAppInterceptorProvider.get();
            HomePrefetchInterceptor homePrefetchInterceptor = this.networkComponentApi.homePrefetchInterceptor();
            j.c(homePrefetchInterceptor);
            ComposerFirstLoadInterceptor composerFirstLoadInterceptor = new ComposerFirstLoadInterceptor();
            ComposerReferrerInterceptor composerReferrerInterceptor = composerReferrerInterceptor();
            ReferrerHeaderInterceptor referrerHeaderInterceptor = this.referrerHeaderInterceptorProvider.get();
            ReferrerReviewHeaderInterceptor referrerReviewHeaderInterceptor = this.referrerReviewHeaderInterceptorProvider.get();
            ComposerHttpInterceptor composerHttpInterceptor = new ComposerHttpInterceptor();
            RedirectAppInterceptor redirectAppInterceptor = this.redirectAppInterceptorProvider.get();
            RedirectNetworkInterceptor redirectNetworkInterceptor = this.redirectNetworkInterceptorProvider.get();
            AppsFlyerRedirectNetworkInterceptor appsFlyerRedirectNetworkInterceptor = this.appsFlyerRedirectNetworkInterceptorProvider.get();
            NotifyCacheHitInterceptor notifyCacheHitInterceptor = this.notifyCacheHitInterceptorProvider.get();
            PrefetchEventInterceptor prefetchEventInterceptor = prefetchEventInterceptor();
            AdaptRequestUrlAppInterceptor adaptRequestUrlAppInterceptor = adaptRequestUrlAppInterceptor();
            OnSaveToCacheInterceptor onSaveToCacheInterceptor = onSaveToCacheInterceptor();
            AdaptRequestUrlNetworkInterceptor adaptRequestUrlNetworkInterceptor = adaptRequestUrlNetworkInterceptor();
            SubstituteCacheControlMaxAgeInterceptor substituteCacheControlMaxAgeInterceptor = this.substituteCacheControlMaxAgeInterceptorProvider.get();
            RestrictRedirectsNetworkInterceptor restrictRedirectsNetworkInterceptor = this.restrictRedirectsNetworkInterceptorProvider.get();
            CacheErrorInterceptor cacheErrorInterceptor = this.cacheErrorInterceptorProvider.get();
            SourceInterceptor sourceInterceptor = this.sourceInterceptorProvider.get();
            TestCookieInterceptor testCookieInterceptor = new TestCookieInterceptor();
            B acceptEncodingInterceptor = this.networkComponentApi.getAcceptEncodingInterceptor();
            j.c(acceptEncodingInterceptor);
            B logRequestsInterceptor = this.networkComponentApi.getLogRequestsInterceptor();
            j.c(logRequestsInterceptor);
            B cartPaginationNoStoreCacheInterceptor = this.cartNetworkDependencies.cartPaginationNoStoreCacheInterceptor();
            j.c(cartPaginationNoStoreCacheInterceptor);
            B mapTraceInterceptor = this.geoNetworkDependencies.mapTraceInterceptor();
            j.c(mapTraceInterceptor);
            B geoRequestsLogInterceptor = this.networkComponentApi.getGeoRequestsLogInterceptor();
            j.c(geoRequestsLogInterceptor);
            List<B> ozonIdNetworkInterceptors = this.networkOzonIdComponentApi.getOzonIdNetworkInterceptors();
            j.c(ozonIdNetworkInterceptors);
            List<B> list = ozonIdNetworkInterceptors;
            B notificationStatusInterceptor = this.notificationStatusComponentApi.getNotificationStatusInterceptor();
            GncOkHttpClientBuilder gncOkHttpClientBuilder = this.networkComponentApi.getGncOkHttpClientBuilder();
            j.c(gncOkHttpClientBuilder);
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            B interceptor = this.tilesNetworkDependencies.getInterceptor();
            j.c(interceptor);
            return new OkHttpClientProvider(context, okHttpClient, c4862d, joinRequestsAppInterceptor, homePrefetchInterceptor, composerFirstLoadInterceptor, composerReferrerInterceptor, referrerHeaderInterceptor, referrerReviewHeaderInterceptor, composerHttpInterceptor, redirectAppInterceptor, redirectNetworkInterceptor, appsFlyerRedirectNetworkInterceptor, notifyCacheHitInterceptor, prefetchEventInterceptor, adaptRequestUrlAppInterceptor, onSaveToCacheInterceptor, adaptRequestUrlNetworkInterceptor, substituteCacheControlMaxAgeInterceptor, restrictRedirectsNetworkInterceptor, cacheErrorInterceptor, sourceInterceptor, testCookieInterceptor, acceptEncodingInterceptor, logRequestsInterceptor, cartPaginationNoStoreCacheInterceptor, mapTraceInterceptor, geoRequestsLogInterceptor, list, notificationStatusInterceptor, gncOkHttpClientBuilder, featureChecker, interceptor);
        }

        private OnSaveToCacheInterceptor onSaveToCacheInterceptor() {
            return new OnSaveToCacheInterceptor(this.bindComposerCacheServiceProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PrefetchEventInterceptor prefetchEventInterceptor() {
            return new PrefetchEventInterceptor(this.getFeatureCheckerProvider);
        }

        private WidgetsDebugToolsInteractorImpl widgetsDebugToolsInteractorImpl() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return new WidgetsDebugToolsInteractorImpl(sharedPreferences);
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public CachePreferences geCachePreferences() {
            return this.bindCachePreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi
        public AnalyticsDataLayer getAnalyticsDataLayer() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            return analyticsDataLayer;
        }

        @Override // ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi
        public AnalyticsEventExecutor getAnalyticsEventExecutor() {
            AnalyticsEventExecutor analyticsEventExecutor = this.analyticsComponentApi.getAnalyticsEventExecutor();
            j.c(analyticsEventExecutor);
            return analyticsEventExecutor;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public VZ.a getAnalyticsScreenFactory() {
            return this.provideAnalyticsScreenFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi
        public Sg.a getAnalyticsScreenStorage() {
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return analyticsScreenStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public ZZ.a getAnalyticsScreenToTrackerPageConverter() {
            return this.provideAnalyticsScreenToTrackerPageConverterProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public Application getApplication() {
            Application application = this.contextComponentDependencies.getApplication();
            j.c(application);
            return application;
        }

        @Override // ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi
        public Sg.a getApplicationAnalyticsScreenStorage() {
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return applicationAnalyticsScreenStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public WidgetLayoutTimeMetricsStorage getAsyncWidgetLayoutMetricsStorage() {
            WidgetLayoutTimeMetricsStorage widgetLayoutMetricsStorage = this.storageComponentApi.getWidgetLayoutMetricsStorage();
            j.c(widgetLayoutMetricsStorage);
            return widgetLayoutMetricsStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public CacheErrorInterceptor getCacheErrorInterceptor() {
            return this.cacheErrorInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public b getComposerAsyncWidgetsDecoder() {
            return this.provideComposerAsyncWidgetsRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public f getComposerBaseUrl() {
            return this.provideComposerBaseUrlProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerCacheService getComposerCacheService() {
            return this.bindComposerCacheServiceProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public d getComposerCallFactory() {
            return this.providerComposerCallFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerConfiguratorStorage getComposerConfiguratorStorage() {
            return this.bindComposerConfiguratorStorageProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerNavigator getComposerNavigator() {
            return this.bindComposerNavigatorProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public K00.a getComposerNetwork() {
            return this.provideComposerNetworkProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public ComposerPageLoadingListener getComposerPageLoadingListener() {
            ComposerPageLoadingListener composerPageLoadingListener = this.startupTimeTrackerComponentApi.getComposerPageLoadingListener();
            j.c(composerPageLoadingListener);
            return composerPageLoadingListener;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerPrefetchService getComposerPrefetchService() {
            return this.bindComposerPrefetchServiceProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerResponseStorage getComposerResponseStorage() {
            return this.bindComposerResponseStorageProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ComposerRunningPrefetchedRequestUrlsHolder getComposerRunningPrefetchedRequestUrlsHolder() {
            ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder = this.runningPrefetchedRequestUrlsComponentApi.getRunningPrefetchedRequestUrlsHolder();
            j.c(runningPrefetchedRequestUrlsHolder);
            return runningPrefetchedRequestUrlsHolder;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public Context getContext() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return context;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public DebugToolsStorage getDebugToolsStorage() {
            DebugToolsStorage debugToolsStorage = this.storageComponentApi.getDebugToolsStorage();
            j.c(debugToolsStorage);
            return debugToolsStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public FeatureChecker getFeatureChecker() {
            return this.getFeatureCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public FeatureService getFeatureService() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return featureService;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public InterfaceC3896p getInterceptedPerformanceTracker() {
            InterfaceC3896p interceptedPerformanceTracker = this.performanceAnalyticsApi.getInterceptedPerformanceTracker();
            j.c(interceptedPerformanceTracker);
            return interceptedPerformanceTracker;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public InterfaceC6369b getOzonTracker() {
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            return ozonTracker;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public Set<YZ.a> getOzonTrackerSupportedPayloadTypes() {
            Set<YZ.a> ozonTrackerSupportedPayloadTypes = this.ozonTrackerSupportedPayloadTypesComponentApi.getOzonTrackerSupportedPayloadTypes();
            j.c(ozonTrackerSupportedPayloadTypes);
            return ozonTrackerSupportedPayloadTypes;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public PerformanceTrackerDelegate getPerformanceTrackerDelegate() {
            return this.getPerformanceTrackerDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public PluginsManager getPluginsManager() {
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            return pluginsManager;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi
        public c getPrefetchManager() {
            return this.bindPrefetchManagerProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public ReferrerValueController getReferrerValueController() {
            return this.referrerValueControllerProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public RestrictRedirectsNetworkInterceptor getRestrictRedirectsNetworkInterceptor() {
            return this.restrictRedirectsNetworkInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public Set<i> getSdkWidgets() {
            Set<i> sdkWidgets = this.widgetRegistrationComponentApi.getSdkWidgets();
            j.c(sdkWidgets);
            return sdkWidgets;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public TestUserStorage getTestUserStorage() {
            TestUserStorage testUserStorage = this.testUserComponentApi.getTestUserStorage();
            j.c(testUserStorage);
            return testUserStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public l getTokenizedAnalytics() {
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            AnalyticsEventExecutor analyticsEventExecutor = this.analyticsComponentApi.getAnalyticsEventExecutor();
            j.c(analyticsEventExecutor);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            VZ.a aVar = this.provideAnalyticsScreenFactoryProvider.get();
            ZZ.a aVar2 = this.provideAnalyticsScreenToTrackerPageConverterProvider.get();
            Set<YZ.a> ozonTrackerSupportedPayloadTypes = this.ozonTrackerSupportedPayloadTypesComponentApi.getOzonTrackerSupportedPayloadTypes();
            j.c(ozonTrackerSupportedPayloadTypes);
            return TokenizedAnalyticsModule_ProvideTokenizedAnalyticsFactory.provideTokenizedAnalytics(ozonTracker, analyticsEventExecutor, analyticsScreenStorage, applicationAnalyticsScreenStorage, aVar, aVar2, ozonTrackerSupportedPayloadTypes);
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponentApi
        public UrlPrefetchedEventHolder getUrlPrefetchedEventHolder() {
            return this.bindUrlPrefetchEventHolderProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public ViewEventStorage getViewEventStorage() {
            ViewEventStorage viewEventStorage = this.eventStorageComponentApi.getViewEventStorage();
            j.c(viewEventStorage);
            return viewEventStorage;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent
        public Set<Widget2> getWidgets() {
            Set<Widget2> widgets = this.widgetRegistrationComponentApi.getWidgets();
            j.c(widgets);
            return widgets;
        }

        @Override // ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi
        public WidgetsDebugToolsInteractor getWidgetsDebugToolsInteractor() {
            return widgetsDebugToolsInteractorImpl();
        }

        private ComposerComponentImpl(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WidgetRegistrationComponentApi widgetRegistrationComponentApi, CacheComponentApi cacheComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi, TestUserComponentApi testUserComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, EventStorageComponentApi eventStorageComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, PerformanceAnalyticsApi performanceAnalyticsApi, CartNetworkDependencies cartNetworkDependencies, GeoNetworkDependencies geoNetworkDependencies, NotificationStatusComponentApi notificationStatusComponentApi, TilesNetworkDependencies tilesNetworkDependencies) {
            this.composerComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.storageComponentApi = storageComponentApi;
            this.cacheComponentApi = cacheComponentApi;
            this.runningPrefetchedRequestUrlsComponentApi = runningPrefetchedRequestUrlsComponentApi;
            this.cacheHandlerRegistrationComponentApi = cacheHandlerRegistrationComponentApi;
            this.cartNetworkDependencies = cartNetworkDependencies;
            this.geoNetworkDependencies = geoNetworkDependencies;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            this.notificationStatusComponentApi = notificationStatusComponentApi;
            this.tilesNetworkDependencies = tilesNetworkDependencies;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.ozonTrackerSupportedPayloadTypesComponentApi = ozonTrackerSupportedPayloadTypesComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.widgetRegistrationComponentApi = widgetRegistrationComponentApi;
            this.startupTimeTrackerComponentApi = startupTimeTrackerComponentApi;
            this.testUserComponentApi = testUserComponentApi;
            this.eventStorageComponentApi = eventStorageComponentApi;
            this.performanceAnalyticsApi = performanceAnalyticsApi;
            initialize(contextComponentDependencies, navigationComponentApi, storageComponentApi, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, widgetRegistrationComponentApi, cacheComponentApi, cacheHandlerRegistrationComponentApi, runningPrefetchedRequestUrlsComponentApi, ozonTrackerSupportedPayloadTypesComponentApi, testUserComponentApi, coroutineDispatchersComponentApi, eventStorageComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, performanceAnalyticsApi, cartNetworkDependencies, geoNetworkDependencies, notificationStatusComponentApi, tilesNetworkDependencies);
        }
    }

    private static final class Factory implements ComposerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.di.ComposerComponent.Factory
        public ComposerComponent create(ContextComponentDependencies contextComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WidgetRegistrationComponentApi widgetRegistrationComponentApi, CacheComponentApi cacheComponentApi, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi, TestUserComponentApi testUserComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, EventStorageComponentApi eventStorageComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, PerformanceAnalyticsApi performanceAnalyticsApi, CartNetworkDependencies cartNetworkDependencies, GeoNetworkDependencies geoNetworkDependencies, NotificationStatusComponentApi notificationStatusComponentApi, TilesNetworkDependencies tilesNetworkDependencies) {
            contextComponentDependencies.getClass();
            navigationComponentApi.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            widgetRegistrationComponentApi.getClass();
            cacheComponentApi.getClass();
            cacheHandlerRegistrationComponentApi.getClass();
            runningPrefetchedRequestUrlsComponentApi.getClass();
            ozonTrackerSupportedPayloadTypesComponentApi.getClass();
            testUserComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            eventStorageComponentApi.getClass();
            startupTimeTrackerComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            performanceAnalyticsApi.getClass();
            cartNetworkDependencies.getClass();
            geoNetworkDependencies.getClass();
            notificationStatusComponentApi.getClass();
            tilesNetworkDependencies.getClass();
            return new ComposerComponentImpl(contextComponentDependencies, navigationComponentApi, storageComponentApi, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, widgetRegistrationComponentApi, cacheComponentApi, cacheHandlerRegistrationComponentApi, runningPrefetchedRequestUrlsComponentApi, ozonTrackerSupportedPayloadTypesComponentApi, testUserComponentApi, coroutineDispatchersComponentApi, eventStorageComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, performanceAnalyticsApi, cartNetworkDependencies, geoNetworkDependencies, notificationStatusComponentApi, tilesNetworkDependencies, 0);
        }

        private Factory() {
        }
    }

    public static ComposerComponent.Factory factory() {
        return new Factory(0);
    }
}
