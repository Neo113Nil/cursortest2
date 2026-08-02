package ru.ozon.app.android.network.di;

import Jb.j;
import Jb.m;
import Ld0.c;
import Pc.a;
import We.B;
import We.C4871m;
import We.C4876s;
import We.E;
import We.InterfaceC4875q;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.Moshi;
import com.vk.knet.cornet.b;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.List;
import java.util.Set;
import nf.C8590c;
import qj.C9067a;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.abtool.AbTool;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.CustomConnectionPoolProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.FeatureServiceImpl;
import ru.ozon.app.android.network.abtool.FeatureUpdater;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;
import ru.ozon.app.android.network.abtool.di.AbToolModule_Companion_ProvideAbToolFactory;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.auth.di.OzonIdModule_ProvideOzonIdAppApiFactory;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.network.cookie.OzCookieJar;
import ru.ozon.app.android.network.cronet.CronetClient;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideCronetClientFactory;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideCronetHttpLoggerFactory;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideCronetSettingsFactory;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideEmptyCronetConfigFactory;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideSimpleCronetOkHttpClientFactory;
import ru.ozon.app.android.network.cronet.CronetClientModule_Companion_ProvideSimpleOkHttpClientFactory;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProviderImpl;
import ru.ozon.app.android.network.cronet.CronetPrefs;
import ru.ozon.app.android.network.cronet.CronetQuicChecker;
import ru.ozon.app.android.network.cronet.CronetSettings;
import ru.ozon.app.android.network.cronet.CronetSettingsProvider;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricListenersManager;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.debug.ExtraHeadersService;
import ru.ozon.app.android.network.di.NetworkComponent;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideAcceptEncodingInterceptorFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideDomainReachabilityInterceptorFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideHttpLoggingInterceptorFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideLeadingHostInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideMainInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideNetworkInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideOzonIdInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideOzonIdNetworkInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkInterceptorsModule_Companion_ProvideTrailingHostInterceptorsFactory;
import ru.ozon.app.android.network.di.module.NetworkModule;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideConnectionPoolFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideDispatcherFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideDomainsInteractorFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideGncOkHttpClientBuilderFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideMoshiConverterFactoryFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideMoshiFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideMoshiRetrofitFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideNetworkInfoProviderFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideOkHttpClientFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideOkHttpClientForSocketFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideRxJavaCallAdapterFactoryFactory;
import ru.ozon.app.android.network.di.module.NetworkModule_Companion_ProvideScalarsConverterFactoryFactory;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.history.NetworkHistoryInterceptor;
import ru.ozon.app.android.network.history.NetworkHistoryService;
import ru.ozon.app.android.network.homeprefetch.HomePrefetchInterceptor;
import ru.ozon.app.android.network.homeprefetch.HomeRequestPrefetchStatus;
import ru.ozon.app.android.network.homeprefetch.PrefetchHomePageFacade;
import ru.ozon.app.android.network.interceptors.AutoTestTraceIdInterceptor;
import ru.ozon.app.android.network.interceptors.CustomHeadersInterceptor;
import ru.ozon.app.android.network.interceptors.DomainCheckInterceptor;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.network.interceptors.GeoRequestsLogInterceptor;
import ru.ozon.app.android.network.interceptors.LongPollingTimeoutInterceptor;
import ru.ozon.app.android.network.interceptors.PageViewIdInterceptor;
import ru.ozon.app.android.network.interceptors.PreviousPageInterceptor;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;
import ru.ozon.app.android.network.logrequests.LogRequestsInterceptor;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.logs.LoggingModule;
import ru.ozon.app.android.network.logs.LoggingModule_ProvideAndroidLoggerFactory;
import ru.ozon.app.android.network.logs.LoggingModule_ProvideWebViewLoggerFactory;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.network.networkhandler.InternetConnectionHandler;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.network.serialize.MoshiJsonDeserializer;
import ru.ozon.app.android.network.serialize.MoshiJsonSerializer;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.websockets.AppVisibility;
import ru.ozon.app.android.network.websockets.AppVisibilityImpl;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactory;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactoryImpl;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sj.d;

/* loaded from: classes6.dex */
public final class DaggerNetworkComponent {

    private static final class Factory implements NetworkComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponent.Factory
        public NetworkComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentDependencies networkComponentDependencies, NetworkUserDependencies networkUserDependencies) {
            contextComponentDependencies.getClass();
            networkComponentDependencies.getClass();
            networkUserDependencies.getClass();
            return new NetworkComponentImpl(new LoggingModule(), contextComponentDependencies, networkComponentDependencies, networkUserDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class NetworkComponentImpl implements NetworkComponent {
        private a<AppVisibilityImpl> appVisibilityImplProvider;
        private a<AutoTestTraceIdInterceptor> autoTestTraceIdInterceptorProvider;
        private a<InterfaceC4875q> bindCookieJarProvider;
        private a<FeatureChecker> bindFeatureCheckerProvider;
        private a<FeatureService> bindFeatureServiceProvider;
        private a<FeatureUpdater> bindFeatureUpdaterProvider;
        private a<B> bindGeoRequestsLogInterceptorProvider;
        private a<OzonWebSocketFactory> bindOzonWebSocketFactoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<CronetMetricListenersManager> cronetMetricListenersManagerProvider;
        private a<CronetOkHttpClientProviderImpl> cronetOkHttpClientProviderImplProvider;
        private a<CronetPrefs> cronetPrefsProvider;
        private a<CronetQuicChecker> cronetQuicCheckerProvider;
        private a<CustomHeadersInterceptor> customHeadersInterceptorProvider;
        private a<DomainCheckInterceptor> domainCheckInterceptorProvider;
        private a<DynamicUrlInterceptor> dynamicUrlInterceptorProvider;
        private a<FeatureServiceImpl> featureServiceImplProvider;
        private a<GeoRequestsLogInterceptor> geoRequestsLogInterceptorProvider;
        private a<AutoTestTraceIdInterceptorDependencies> getAutoTestTraceIdInterceptorDependenciesProvider;
        private a<NetworkComponentConfig> getNetworkComponentConfigProvider;
        private a<NetworkHeadersDependencies> getNetworkHeadersDependenciesProvider;
        private a<NetworkHistoryService> getNetworkHistoryServiceProvider;
        private a<HomePrefetchInterceptor> homePrefetchInterceptorProvider;
        private a<InternetConnectionHandler> internetConnectionHandlerProvider;
        private a<LogRequestsInterceptor> logRequestsInterceptorProvider;
        private final LoggingModule loggingModule;
        private a<MoshiJsonDeserializer> moshiJsonDeserializerProvider;
        private a<MoshiJsonSerializer> moshiJsonSerializerProvider;
        private final NetworkComponentDependencies networkComponentDependencies;
        private final NetworkComponentImpl networkComponentImpl;
        private a<NetworkHeadersProvider> networkHeadersProvider;
        private a<NetworkHistoryInterceptor> networkHistoryInterceptorProvider;
        private final NetworkUserDependencies networkUserDependencies;
        private a<OzCookieJar> ozCookieJarProvider;
        private a<OzonWebSocketFactoryImpl> ozonWebSocketFactoryImplProvider;
        private a<PageViewIdInterceptor> pageViewIdInterceptorProvider;
        private a<PrefetchHomePageFacade> prefetchHomePageFacadeProvider;
        private a<PreviousPageInterceptor> previousPageInterceptorProvider;
        private a<AbTool> provideAbToolProvider;
        private a<B> provideAcceptEncodingInterceptorProvider;
        private a<d> provideAndroidLoggerProvider;
        private a<C4871m> provideConnectionPoolProvider;
        private a<CronetClient> provideCronetClientProvider;
        private a<b> provideCronetHttpLoggerProvider;
        private a<CronetSettings> provideCronetSettingsProvider;
        private a<C4876s> provideDispatcherProvider;
        private a<B> provideDomainReachabilityInterceptorProvider;
        private a<DomainsInteractor> provideDomainsInteractorProvider;
        private a<CronetConfig> provideEmptyCronetConfigProvider;
        private a<GncOkHttpClientBuilder> provideGncOkHttpClientBuilderProvider;
        private a<C8590c> provideHttpLoggingInterceptorProvider;
        private a<ConnectionHandler> provideInternetConnectionUtilsProvider;
        private a<JsonParser> provideJsonDeserializerProvider;
        private a<JsonSerializer> provideJsonSerializerProvider;
        private a<List<B>> provideLeadingHostInterceptorsProvider;
        private a<List<B>> provideMainInterceptorsProvider;
        private a<MoshiConverterFactory> provideMoshiConverterFactoryProvider;
        private a<Moshi> provideMoshiProvider;
        private a<Retrofit> provideMoshiRetrofitProvider;
        private a<C9067a> provideNetworkInfoProvider;
        private a<List<B>> provideNetworkInterceptorsProvider;
        private a<E> provideOkHttpClientForSocketProvider;
        private a<E> provideOkHttpClientProvider;
        private a<Ob0.a> provideOzonIdAppApiProvider;
        private a<List<B>> provideOzonIdInterceptorsProvider;
        private a<List<B>> provideOzonIdNetworkInterceptorsProvider;
        private a<CallAdapter.Factory> provideRxJavaCallAdapterFactoryProvider;
        private a<ScalarsConverterFactory> provideScalarsConverterFactoryProvider;
        private a<E> provideSimpleCronetOkHttpClientProvider;
        private a<E> provideSimpleOkHttpClientProvider;
        private a<List<B>> provideTrailingHostInterceptorsProvider;
        private a<WebViewErrorLogger> provideWebViewLoggerProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92938id;
            private final NetworkComponentImpl networkComponentImpl;

            SwitchingProvider(NetworkComponentImpl networkComponentImpl, int i11) {
                this.networkComponentImpl = networkComponentImpl;
                this.f92938id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92938id) {
                    case 0:
                        Set<Object> moshiAdapters = this.networkComponentImpl.networkComponentDependencies.getMoshiAdapters();
                        j.c(moshiAdapters);
                        return (T) NetworkModule_Companion_ProvideMoshiFactory.provideMoshi(moshiAdapters);
                    case 1:
                        return (T) NetworkModule_Companion_ProvideMoshiRetrofitFactory.provideMoshiRetrofit((NetworkComponentConfig) this.networkComponentImpl.getNetworkComponentConfigProvider.get(), (E) this.networkComponentImpl.provideOkHttpClientProvider.get(), (CallAdapter.Factory) this.networkComponentImpl.provideRxJavaCallAdapterFactoryProvider.get(), (ScalarsConverterFactory) this.networkComponentImpl.provideScalarsConverterFactoryProvider.get(), (MoshiConverterFactory) this.networkComponentImpl.provideMoshiConverterFactoryProvider.get());
                    case 2:
                        T t2 = (T) this.networkComponentImpl.networkComponentDependencies.getNetworkComponentConfig();
                        j.c(t2);
                        return t2;
                    case 3:
                        return (T) NetworkModule_Companion_ProvideOkHttpClientFactory.provideOkHttpClient((FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get(), this.networkComponentImpl.okHttpClientParams());
                    case 4:
                        return (T) new FeatureServiceImpl((AbTool) this.networkComponentImpl.provideAbToolProvider.get());
                    case 5:
                        c ozonLimbDiStore = this.networkComponentImpl.networkComponentDependencies.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) AbToolModule_Companion_ProvideAbToolFactory.provideAbTool(ozonLimbDiStore);
                    case 6:
                        Set<CookieListener> cookieListeners = this.networkComponentImpl.networkComponentDependencies.getCookieListeners();
                        j.c(cookieListeners);
                        return (T) new OzCookieJar(cookieListeners, (Ob0.a) this.networkComponentImpl.provideOzonIdAppApiProvider.get());
                    case 7:
                        c ozonLimbDiStore2 = this.networkComponentImpl.networkComponentDependencies.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore2);
                        return (T) OzonIdModule_ProvideOzonIdAppApiFactory.provideOzonIdAppApi(ozonLimbDiStore2);
                    case 8:
                        return (T) NetworkModule_Companion_ProvideConnectionPoolFactory.provideConnectionPool(new CustomConnectionPoolProvider());
                    case 9:
                        return (T) NetworkInterceptorsModule_Companion_ProvideMainInterceptorsFactory.provideMainInterceptors((List) this.networkComponentImpl.provideLeadingHostInterceptorsProvider.get(), (List) this.networkComponentImpl.provideOzonIdInterceptorsProvider.get(), (List) this.networkComponentImpl.provideTrailingHostInterceptorsProvider.get());
                    case 10:
                        return (T) NetworkInterceptorsModule_Companion_ProvideLeadingHostInterceptorsFactory.provideLeadingHostInterceptors(this.networkComponentImpl.longPollingTimeoutInterceptor(), (DomainCheckInterceptor) this.networkComponentImpl.domainCheckInterceptorProvider.get());
                    case 11:
                        return (T) new DomainCheckInterceptor(Jb.d.a(this.networkComponentImpl.getNetworkComponentConfigProvider), Jb.d.a(this.networkComponentImpl.provideDomainsInteractorProvider));
                    case 12:
                        Context context = this.networkComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) NetworkModule_Companion_ProvideDomainsInteractorFactory.provideDomainsInteractor(context);
                    case 13:
                        return (T) NetworkInterceptorsModule_Companion_ProvideOzonIdInterceptorsFactory.provideOzonIdInterceptors((Ob0.a) this.networkComponentImpl.provideOzonIdAppApiProvider.get());
                    case 14:
                        return (T) NetworkInterceptorsModule_Companion_ProvideTrailingHostInterceptorsFactory.provideTrailingHostInterceptors((AutoTestTraceIdInterceptor) this.networkComponentImpl.autoTestTraceIdInterceptorProvider.get(), (NetworkHistoryInterceptor) this.networkComponentImpl.networkHistoryInterceptorProvider.get(), (CustomHeadersInterceptor) this.networkComponentImpl.customHeadersInterceptorProvider.get(), (PreviousPageInterceptor) this.networkComponentImpl.previousPageInterceptorProvider.get(), (PageViewIdInterceptor) this.networkComponentImpl.pageViewIdInterceptorProvider.get(), (DynamicUrlInterceptor) this.networkComponentImpl.dynamicUrlInterceptorProvider.get(), (C8590c) this.networkComponentImpl.provideHttpLoggingInterceptorProvider.get(), (B) this.networkComponentImpl.provideAcceptEncodingInterceptorProvider.get(), (B) this.networkComponentImpl.bindGeoRequestsLogInterceptorProvider.get());
                    case 15:
                        return (T) new AutoTestTraceIdInterceptor(Jb.d.a(this.networkComponentImpl.getAutoTestTraceIdInterceptorDependenciesProvider));
                    case 16:
                        T t11 = (T) this.networkComponentImpl.networkComponentDependencies.getAutoTestTraceIdInterceptorDependencies();
                        j.c(t11);
                        return t11;
                    case 17:
                        return (T) new NetworkHistoryInterceptor(Jb.d.a(this.networkComponentImpl.getNetworkHistoryServiceProvider));
                    case 18:
                        T t12 = (T) this.networkComponentImpl.networkComponentDependencies.getNetworkHistoryService();
                        j.c(t12);
                        return t12;
                    case 19:
                        return (T) new CustomHeadersInterceptor(Jb.d.a(this.networkComponentImpl.networkHeadersProvider));
                    case 20:
                        AppVersionService appVersionService = this.networkComponentImpl.networkComponentDependencies.getAppVersionService();
                        j.c(appVersionService);
                        DebugHeaderService debugHeaderService = this.networkComponentImpl.networkComponentDependencies.getDebugHeaderService();
                        j.c(debugHeaderService);
                        ExtraHeadersService extraHeadersService = this.networkComponentImpl.networkComponentDependencies.getExtraHeadersService();
                        j.c(extraHeadersService);
                        return (T) new NetworkHeadersProvider(appVersionService, debugHeaderService, extraHeadersService, (NetworkHeadersDependencies) this.networkComponentImpl.getNetworkHeadersDependenciesProvider.get(), (NetworkComponentConfig) this.networkComponentImpl.getNetworkComponentConfigProvider.get());
                    case 21:
                        T t13 = (T) this.networkComponentImpl.networkComponentDependencies.getNetworkHeadersDependencies();
                        j.c(t13);
                        return t13;
                    case 22:
                        return (T) new PreviousPageInterceptor(Jb.d.a(this.networkComponentImpl.getNetworkHeadersDependenciesProvider));
                    case 23:
                        return (T) new PageViewIdInterceptor(Jb.d.a(this.networkComponentImpl.getNetworkHeadersDependenciesProvider));
                    case 24:
                        return (T) new DynamicUrlInterceptor(Jb.d.a(this.networkComponentImpl.getNetworkComponentConfigProvider));
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        return (T) NetworkInterceptorsModule_Companion_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor();
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        return (T) NetworkInterceptorsModule_Companion_ProvideAcceptEncodingInterceptorFactory.provideAcceptEncodingInterceptor();
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        return (T) new GeoRequestsLogInterceptor();
                    case 28:
                        return (T) NetworkInterceptorsModule_Companion_ProvideNetworkInterceptorsFactory.provideNetworkInterceptors((B) this.networkComponentImpl.logRequestsInterceptorProvider.get(), (List) this.networkComponentImpl.provideOzonIdNetworkInterceptorsProvider.get(), (B) this.networkComponentImpl.provideDomainReachabilityInterceptorProvider.get());
                    case 29:
                        LogRequestsService logRequestsService = this.networkComponentImpl.networkComponentDependencies.getLogRequestsService();
                        j.c(logRequestsService);
                        return (T) new LogRequestsInterceptor(logRequestsService);
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        return (T) NetworkInterceptorsModule_Companion_ProvideOzonIdNetworkInterceptorsFactory.provideOzonIdNetworkInterceptors((Ob0.a) this.networkComponentImpl.provideOzonIdAppApiProvider.get());
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        c ozonLimbDiStore3 = this.networkComponentImpl.networkComponentDependencies.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore3);
                        return (T) NetworkInterceptorsModule_Companion_ProvideDomainReachabilityInterceptorFactory.provideDomainReachabilityInterceptor(ozonLimbDiStore3);
                    case 32:
                        return (T) NetworkModule_Companion_ProvideDispatcherFactory.provideDispatcher();
                    case 33:
                        c ozonLimbDiStore4 = this.networkComponentImpl.networkComponentDependencies.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore4);
                        return (T) NetworkModule_Companion_ProvideGncOkHttpClientBuilderFactory.provideGncOkHttpClientBuilder(ozonLimbDiStore4, (C4871m) this.networkComponentImpl.provideConnectionPoolProvider.get(), (List) this.networkComponentImpl.provideMainInterceptorsProvider.get(), (List) this.networkComponentImpl.provideNetworkInterceptorsProvider.get(), (C4876s) this.networkComponentImpl.provideDispatcherProvider.get(), (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get());
                    case 34:
                        return (T) NetworkModule_Companion_ProvideRxJavaCallAdapterFactoryFactory.provideRxJavaCallAdapterFactory();
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        return (T) NetworkModule_Companion_ProvideScalarsConverterFactoryFactory.provideScalarsConverterFactory();
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        return (T) NetworkModule_Companion_ProvideMoshiConverterFactoryFactory.provideMoshiConverterFactory((Moshi) this.networkComponentImpl.provideMoshiProvider.get());
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        return (T) new MoshiJsonSerializer((Moshi) this.networkComponentImpl.provideMoshiProvider.get());
                    case 38:
                        return (T) new MoshiJsonDeserializer((Moshi) this.networkComponentImpl.provideMoshiProvider.get());
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        return (T) new OzonWebSocketFactoryImpl((E) this.networkComponentImpl.provideOkHttpClientForSocketProvider.get(), (AppVisibility) this.networkComponentImpl.appVisibilityImplProvider.get());
                    case 40:
                        return (T) NetworkModule_Companion_ProvideOkHttpClientForSocketFactory.provideOkHttpClientForSocket((FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get(), this.networkComponentImpl.okHttpClientParams());
                    case 41:
                        return (T) new AppVisibilityImpl();
                    case 42:
                        Context context2 = this.networkComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new InternetConnectionHandler(context2);
                    case 43:
                        return (T) new HomePrefetchInterceptor((PrefetchHomePageFacade) this.networkComponentImpl.prefetchHomePageFacadeProvider.get());
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        return (T) new PrefetchHomePageFacade((FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get(), this.networkComponentImpl.homeRequestPrefetchStatus());
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        return (T) LoggingModule_ProvideWebViewLoggerFactory.provideWebViewLogger(this.networkComponentImpl.loggingModule, (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get(), (FeatureChecker) this.networkComponentImpl.bindFeatureCheckerProvider.get(), (d) this.networkComponentImpl.provideAndroidLoggerProvider.get());
                    case 46:
                        return (T) LoggingModule_ProvideAndroidLoggerFactory.provideAndroidLogger(this.networkComponentImpl.loggingModule);
                    case 47:
                        return (T) new CronetOkHttpClientProviderImpl((CronetPrefs) this.networkComponentImpl.cronetPrefsProvider.get(), (CronetMetricListenersManager) this.networkComponentImpl.cronetMetricListenersManagerProvider.get(), Jb.d.a(this.networkComponentImpl.provideCronetClientProvider), (CronetQuicChecker) this.networkComponentImpl.cronetQuicCheckerProvider.get(), (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get());
                    case 48:
                        Context context3 = this.networkComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) new CronetPrefs(context3, (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get());
                    case 49:
                        return (T) new CronetMetricListenersManager();
                    case 50:
                        Context context4 = this.networkComponentImpl.contextComponentDependencies.getContext();
                        j.c(context4);
                        CronetMetricListenersManager cronetMetricListenersManager = (CronetMetricListenersManager) this.networkComponentImpl.cronetMetricListenersManagerProvider.get();
                        AppVersionService appVersionService2 = this.networkComponentImpl.networkComponentDependencies.getAppVersionService();
                        j.c(appVersionService2);
                        return (T) CronetClientModule_Companion_ProvideCronetClientFactory.provideCronetClient(context4, cronetMetricListenersManager, appVersionService2, (NetworkComponentConfig) this.networkComponentImpl.getNetworkComponentConfigProvider.get(), (CronetSettings) this.networkComponentImpl.provideCronetSettingsProvider.get(), Jb.d.a(this.networkComponentImpl.provideCronetHttpLoggerProvider), (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get());
                    case 51:
                        return (T) CronetClientModule_Companion_ProvideCronetSettingsFactory.provideCronetSettings(this.networkComponentImpl.cronetSettingsProvider());
                    case 52:
                        return (T) CronetClientModule_Companion_ProvideCronetHttpLoggerFactory.provideCronetHttpLogger();
                    case 53:
                        FeatureService featureService = (FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get();
                        CronetPrefs cronetPrefs = (CronetPrefs) this.networkComponentImpl.cronetPrefsProvider.get();
                        C9067a c9067a = (C9067a) this.networkComponentImpl.provideNetworkInfoProvider.get();
                        String apiUrl = this.networkComponentImpl.networkComponentDependencies.apiUrl();
                        j.c(apiUrl);
                        return (T) new CronetQuicChecker(featureService, cronetPrefs, c9067a, apiUrl, Jb.d.a(this.networkComponentImpl.provideSimpleOkHttpClientProvider), Jb.d.a(this.networkComponentImpl.provideSimpleCronetOkHttpClientProvider));
                    case 54:
                        Context context5 = this.networkComponentImpl.contextComponentDependencies.getContext();
                        j.c(context5);
                        return (T) NetworkModule_Companion_ProvideNetworkInfoProviderFactory.provideNetworkInfoProvider(context5);
                    case 55:
                        return (T) CronetClientModule_Companion_ProvideSimpleOkHttpClientFactory.provideSimpleOkHttpClient((FeatureService) this.networkComponentImpl.bindFeatureServiceProvider.get());
                    case 56:
                        return (T) CronetClientModule_Companion_ProvideSimpleCronetOkHttpClientFactory.provideSimpleCronetOkHttpClient((E) this.networkComponentImpl.provideSimpleOkHttpClientProvider.get(), (CronetOkHttpClientProvider) this.networkComponentImpl.cronetOkHttpClientProviderImplProvider.get(), (CronetConfig) this.networkComponentImpl.provideEmptyCronetConfigProvider.get());
                    case 57:
                        return (T) CronetClientModule_Companion_ProvideEmptyCronetConfigFactory.provideEmptyCronetConfig();
                    default:
                        throw new AssertionError(this.f92938id);
                }
            }
        }

        /* synthetic */ NetworkComponentImpl(LoggingModule loggingModule, ContextComponentDependencies contextComponentDependencies, NetworkComponentDependencies networkComponentDependencies, NetworkUserDependencies networkUserDependencies, int i11) {
            this(loggingModule, contextComponentDependencies, networkComponentDependencies, networkUserDependencies);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CronetSettingsProvider cronetSettingsProvider() {
            return new CronetSettingsProvider(this.bindFeatureServiceProvider.get(), this.provideMoshiProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HomeRequestPrefetchStatus homeRequestPrefetchStatus() {
            return new HomeRequestPrefetchStatus(this.bindFeatureServiceProvider.get());
        }

        private void initialize(LoggingModule loggingModule, ContextComponentDependencies contextComponentDependencies, NetworkComponentDependencies networkComponentDependencies, NetworkUserDependencies networkUserDependencies) {
            this.provideMoshiProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 0));
            this.getNetworkComponentConfigProvider = new SwitchingProvider(this.networkComponentImpl, 2);
            this.provideAbToolProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 5));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.networkComponentImpl, 4);
            this.featureServiceImplProvider = switchingProvider;
            this.bindFeatureServiceProvider = Jb.d.b(switchingProvider);
            this.provideOzonIdAppApiProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 7));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.networkComponentImpl, 6);
            this.ozCookieJarProvider = switchingProvider2;
            this.bindCookieJarProvider = Jb.d.b(switchingProvider2);
            this.provideConnectionPoolProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 8));
            this.provideDomainsInteractorProvider = m.a(new SwitchingProvider(this.networkComponentImpl, 12));
            this.domainCheckInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 11));
            this.provideLeadingHostInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 10));
            this.provideOzonIdInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 13));
            this.getAutoTestTraceIdInterceptorDependenciesProvider = new SwitchingProvider(this.networkComponentImpl, 16);
            this.autoTestTraceIdInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 15));
            this.getNetworkHistoryServiceProvider = new SwitchingProvider(this.networkComponentImpl, 18);
            this.networkHistoryInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 17));
            this.getNetworkHeadersDependenciesProvider = new SwitchingProvider(this.networkComponentImpl, 21);
            this.networkHeadersProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 20));
            this.customHeadersInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 19));
            this.previousPageInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 22));
            this.pageViewIdInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 23));
            this.dynamicUrlInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 24));
            this.provideHttpLoggingInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 25));
            this.provideAcceptEncodingInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 26));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.networkComponentImpl, 27);
            this.geoRequestsLogInterceptorProvider = switchingProvider3;
            this.bindGeoRequestsLogInterceptorProvider = Jb.d.b(switchingProvider3);
            this.provideTrailingHostInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 14));
            this.provideMainInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 9));
            this.logRequestsInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 29));
            this.provideOzonIdNetworkInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 30));
            this.provideDomainReachabilityInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 31));
            this.provideNetworkInterceptorsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 28));
            this.provideDispatcherProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 32));
            this.provideGncOkHttpClientBuilderProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 33));
            this.provideOkHttpClientProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 3));
            this.provideRxJavaCallAdapterFactoryProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 34));
            this.provideScalarsConverterFactoryProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 35));
            this.provideMoshiConverterFactoryProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 36));
            this.provideMoshiRetrofitProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 1));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.networkComponentImpl, 37);
            this.moshiJsonSerializerProvider = switchingProvider4;
            this.provideJsonSerializerProvider = Jb.d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.networkComponentImpl, 38);
            this.moshiJsonDeserializerProvider = switchingProvider5;
            this.provideJsonDeserializerProvider = Jb.d.b(switchingProvider5);
            this.bindFeatureCheckerProvider = Jb.d.b(this.featureServiceImplProvider);
            this.bindFeatureUpdaterProvider = Jb.d.b(this.featureServiceImplProvider);
            this.provideOkHttpClientForSocketProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 40));
            this.appVisibilityImplProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 41));
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.networkComponentImpl, 39);
            this.ozonWebSocketFactoryImplProvider = switchingProvider6;
            this.bindOzonWebSocketFactoryProvider = Jb.d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.networkComponentImpl, 42);
            this.internetConnectionHandlerProvider = switchingProvider7;
            this.provideInternetConnectionUtilsProvider = Jb.d.b(switchingProvider7);
            this.prefetchHomePageFacadeProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 44));
            this.homePrefetchInterceptorProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 43));
            this.provideAndroidLoggerProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 46));
            this.provideWebViewLoggerProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 45));
            this.cronetPrefsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 48));
            this.cronetMetricListenersManagerProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 49));
            this.provideCronetSettingsProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 51));
            this.provideCronetHttpLoggerProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 52));
            this.provideCronetClientProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 50));
            this.provideNetworkInfoProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 54));
            this.provideSimpleOkHttpClientProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 55));
            this.cronetOkHttpClientProviderImplProvider = new Jb.c();
            this.provideEmptyCronetConfigProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 57));
            this.provideSimpleCronetOkHttpClientProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 56));
            this.cronetQuicCheckerProvider = Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 53));
            Jb.c.a(this.cronetOkHttpClientProviderImplProvider, Jb.d.b(new SwitchingProvider(this.networkComponentImpl, 47)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LongPollingTimeoutInterceptor longPollingTimeoutInterceptor() {
            return new LongPollingTimeoutInterceptor(Jb.d.a(this.bindFeatureServiceProvider));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NetworkModule.Companion.OkHttpClientParams okHttpClientParams() {
            return new NetworkModule.Companion.OkHttpClientParams(this.bindCookieJarProvider.get(), this.provideConnectionPoolProvider.get(), this.provideMainInterceptorsProvider.get(), this.provideNetworkInterceptorsProvider.get(), this.provideDispatcherProvider.get(), this.bindFeatureServiceProvider.get(), this.provideGncOkHttpClientBuilderProvider.get());
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public B getAcceptEncodingInterceptor() {
            return this.provideAcceptEncodingInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public AppVersionService getAppVersionService() {
            AppVersionService appVersionService = this.networkComponentDependencies.getAppVersionService();
            j.c(appVersionService);
            return appVersionService;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public AppVisibility getAppVisibility() {
            return this.appVisibilityImplProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public AuthNetworkService getAuthNetworkService() {
            AuthNetworkService authNetworkService = this.networkComponentDependencies.getAuthNetworkService();
            j.c(authNetworkService);
            return authNetworkService;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public C4871m getConnectionPool() {
            return this.provideConnectionPoolProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public InterfaceC4875q getCookieJar() {
            return this.bindCookieJarProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public CronetOkHttpClientProvider getCronetOkHttpClientProvider() {
            return this.cronetOkHttpClientProviderImplProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public DebugHeaderService getDebugHeaderService() {
            DebugHeaderService debugHeaderService = this.networkComponentDependencies.getDebugHeaderService();
            j.c(debugHeaderService);
            return debugHeaderService;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public C4876s getDispatcher() {
            return this.provideDispatcherProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public DynamicUrlInterceptor getDynamicUrlInterceptor() {
            return this.dynamicUrlInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public FeatureChecker getFeatureChecker() {
            return this.bindFeatureCheckerProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public FeatureService getFeatureService() {
            return this.bindFeatureServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public FeatureUpdater getFeatureUpdater() {
            return this.bindFeatureUpdaterProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public B getGeoRequestsLogInterceptor() {
            return this.bindGeoRequestsLogInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public GncOkHttpClientBuilder getGncOkHttpClientBuilder() {
            return this.provideGncOkHttpClientBuilderProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public C8590c getHttpLoggingInterceptorWithLimits() {
            return this.provideHttpLoggingInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public List<B> getInterceptors() {
            return this.provideMainInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public ConnectionHandler getInternetConnectionUtils() {
            return this.provideInternetConnectionUtilsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public JsonParser getJsonDeserializer() {
            return this.provideJsonDeserializerProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public JsonSerializer getJsonSerializer() {
            return this.provideJsonSerializerProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkPluginProvidersComponentApi
        public List<B> getLeadingHostInterceptors() {
            return this.provideLeadingHostInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public B getLogRequestsInterceptor() {
            return this.logRequestsInterceptorProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public LogRequestsService getLogRequestsService() {
            LogRequestsService logRequestsService = this.networkComponentDependencies.getLogRequestsService();
            j.c(logRequestsService);
            return logRequestsService;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public Moshi getMoshi() {
            return this.provideMoshiProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkPluginProvidersComponentApi
        public NetworkAtMostQaUserPredicate getNetworkAtMostQaUserPredicate() {
            NetworkAtMostQaUserPredicate atMostQaUserPredicate = this.networkUserDependencies.atMostQaUserPredicate();
            j.c(atMostQaUserPredicate);
            return atMostQaUserPredicate;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public NetworkComponentConfig getNetworkComponentConfig() {
            return this.getNetworkComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public NetworkHeadersProvider getNetworkHeadersProvider() {
            return this.networkHeadersProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public C9067a getNetworkInfoProvider() {
            return this.provideNetworkInfoProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public E getOkHttpClient() {
            return this.provideOkHttpClientProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkOzonIdComponentApi, ru.ozon.app.android.limb.OzonIdStorageDependencies
        public Ob0.a getOzonIdAppApi() {
            return this.provideOzonIdAppApiProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkOzonIdComponentApi
        public List<B> getOzonIdInterceptors() {
            return this.provideOzonIdInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkOzonIdComponentApi
        public List<B> getOzonIdNetworkInterceptors() {
            return this.provideOzonIdNetworkInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public OzonWebSocketFactory getOzonWebSocketFactory() {
            return this.bindOzonWebSocketFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public Retrofit getRetrofit() {
            return this.provideMoshiRetrofitProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkPluginProvidersComponentApi
        public List<B> getTrailingHostInterceptors() {
            return this.provideTrailingHostInterceptorsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public CookieManager getWebViewCookieManager() {
            return this.networkComponentDependencies.getWebViewCookieManager();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public WebViewErrorLogger getWebViewErrorLogger() {
            return this.provideWebViewLoggerProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public PrefetchHomePageFacade homePrefetchFacade() {
            return this.prefetchHomePageFacadeProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentApi
        public HomePrefetchInterceptor homePrefetchInterceptor() {
            return this.homePrefetchInterceptorProvider.get();
        }

        private NetworkComponentImpl(LoggingModule loggingModule, ContextComponentDependencies contextComponentDependencies, NetworkComponentDependencies networkComponentDependencies, NetworkUserDependencies networkUserDependencies) {
            this.networkComponentImpl = this;
            this.networkComponentDependencies = networkComponentDependencies;
            this.contextComponentDependencies = contextComponentDependencies;
            this.loggingModule = loggingModule;
            this.networkUserDependencies = networkUserDependencies;
            initialize(loggingModule, contextComponentDependencies, networkComponentDependencies, networkUserDependencies);
        }
    }

    public static NetworkComponent.Factory factory() {
        return new Factory(0);
    }
}
