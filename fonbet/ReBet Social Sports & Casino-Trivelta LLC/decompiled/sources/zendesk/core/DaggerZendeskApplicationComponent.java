package zendesk.core;

import Gg.g;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.gson.Gson;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
final class DaggerZendeskApplicationComponent {

    public static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            Gg.d.a(this.zendeskApplicationModule, ZendeskApplicationModule.class);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new ZendeskApplicationComponentImpl(this.zendeskApplicationModule, this.zendeskNetworkModule);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule) {
            this.zendeskApplicationModule = (ZendeskApplicationModule) Gg.d.b(zendeskApplicationModule);
            return this;
        }

        public Builder zendeskNetworkModule(ZendeskNetworkModule zendeskNetworkModule) {
            this.zendeskNetworkModule = (ZendeskNetworkModule) Gg.d.b(zendeskNetworkModule);
            return this;
        }

        @Deprecated
        public Builder zendeskProvidersModule(ZendeskProvidersModule zendeskProvidersModule) {
            Gg.d.b(zendeskProvidersModule);
            return this;
        }

        @Deprecated
        public Builder zendeskStorageModule(ZendeskStorageModule zendeskStorageModule) {
            Gg.d.b(zendeskStorageModule);
            return this;
        }

        private Builder() {
        }
    }

    public static final class ZendeskApplicationComponentImpl implements ZendeskApplicationComponent {
        private Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
        private Provider<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
        private Provider<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
        private Provider<AccessProvider> provideAccessProvider;
        private Provider<AccessService> provideAccessServiceProvider;
        private Provider<BaseStorage> provideAdditionalSdkBaseStorageProvider;
        private Provider<ApplicationConfiguration> provideApplicationConfigurationProvider;
        private Provider<Context> provideApplicationContextProvider;
        private Provider<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
        private Provider<AuthenticationProvider> provideAuthProvider;
        private Provider<Serializer> provideBase64SerializerProvider;
        private Provider<OkHttpClient> provideBaseOkHttpClientProvider;
        private Provider<BlipsService> provideBlipsServiceProvider;
        private Provider<Cache> provideCacheProvider;
        private Provider<CachingInterceptor> provideCachingInterceptorProvider;
        private Provider<OkHttpClient> provideCoreOkHttpClientProvider;
        private Provider<Retrofit> provideCoreRetrofitProvider;
        private Provider<CoreModule> provideCoreSdkModuleProvider;
        private Provider<CoreSettingsStorage> provideCoreSettingsStorageProvider;
        private Provider<DeviceInfo> provideDeviceInfoProvider;
        private Provider<ScheduledExecutorService> provideExecutorProvider;
        private Provider<ExecutorService> provideExecutorServiceProvider;
        private Provider<Gson> provideGsonProvider;
        private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
        private Provider<BaseStorage> provideIdentityBaseStorageProvider;
        private Provider<IdentityManager> provideIdentityManagerProvider;
        private Provider<IdentityStorage> provideIdentityStorageProvider;
        private Provider<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
        private Provider<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
        private Provider<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
        private Provider<MachineIdStorage> provideMachineIdStorageProvider;
        private Provider<OkHttpClient> provideMediaOkHttpClientProvider;
        private Provider<MemoryCache> provideMemoryCacheProvider;
        private Provider<OkHttpClient> provideOkHttpClientProvider;
        private Provider<ProviderStore> provideProviderStoreProvider;
        private Provider<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
        private Provider<ZendeskPushInterceptor> providePushInterceptorProvider;
        private Provider<Retrofit> providePushProviderRetrofitProvider;
        private Provider<PushRegistrationProvider> providePushRegistrationProvider;
        private Provider<PushRegistrationProviderInternal> providePushRegistrationProviderInternalProvider;
        private Provider<PushRegistrationService> providePushRegistrationServiceProvider;
        private Provider<RestServiceProvider> provideRestServiceProvider;
        private Provider<Retrofit> provideRetrofitProvider;
        private Provider<BaseStorage> provideSdkBaseStorageProvider;
        private Provider<SettingsProvider> provideSdkSettingsProvider;
        private Provider<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
        private Provider<SdkSettingsService> provideSdkSettingsServiceProvider;
        private Provider<Storage> provideSdkStorageProvider;
        private Provider<Serializer> provideSerializerProvider;
        private Provider<SessionStorage> provideSessionStorageProvider;
        private Provider<BaseStorage> provideSettingsBaseStorageProvider;
        private Provider<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
        private Provider<SettingsStorage> provideSettingsStorageProvider;
        private Provider<UserProvider> provideUserProvider;
        private Provider<UserService> provideUserServiceProvider;
        private Provider<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
        private Provider<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
        private Provider<ZendeskShadow> provideZendeskProvider;
        private Provider<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
        private Provider<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
        private Provider<BlipsCoreProvider> providerBlipsCoreProvider;
        private Provider<BlipsProvider> providerBlipsProvider;
        private Provider<ConnectivityManager> providerConnectivityManagerProvider;
        private Provider<NetworkInfoProvider> providerNetworkInfoProvider;
        private Provider<ZendeskBlipsProvider> providerZendeskBlipsProvider;
        private Provider<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
        private Provider<File> providesBelvedereDirProvider;
        private Provider<File> providesCacheDirProvider;
        private Provider<File> providesDataDirProvider;
        private Provider<BaseStorage> providesDiskLruStorageProvider;
        private Provider<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;
        private final ZendeskApplicationComponentImpl zendeskApplicationComponentImpl;

        private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
            this.provideApplicationContextProvider = Gg.a.e(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
            Provider<Gson> b10 = g.b(ZendeskApplicationModule_ProvideGsonFactory.create());
            this.provideGsonProvider = b10;
            Provider<Serializer> e10 = Gg.a.e(ZendeskStorageModule_ProvideSerializerFactory.create(b10));
            this.provideSerializerProvider = e10;
            Provider<BaseStorage> e11 = Gg.a.e(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, e10));
            this.provideSettingsBaseStorageProvider = e11;
            this.provideSettingsStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideSettingsStorageFactory.create(e11));
            Provider<BaseStorage> e12 = Gg.a.e(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideIdentityBaseStorageProvider = e12;
            this.provideIdentityStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideIdentityStorageFactory.create(e12));
            this.provideAdditionalSdkBaseStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            Provider<File> e13 = Gg.a.e(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
            this.providesCacheDirProvider = e13;
            this.providesDiskLruStorageProvider = Gg.a.e(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(e13, this.provideSerializerProvider));
            this.provideCacheProvider = Gg.a.e(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
            this.providesDataDirProvider = Gg.a.e(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
            Provider<File> e14 = Gg.a.e(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
            this.providesBelvedereDirProvider = e14;
            this.provideSessionStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, e14));
            this.provideSdkBaseStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            Provider<MemoryCache> e15 = Gg.a.e(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
            this.provideMemoryCacheProvider = e15;
            this.provideSdkStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, e15));
            this.provideLegacyIdentityBaseStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideLegacyPushBaseStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideIdentityManagerProvider = Gg.a.e(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
            Provider<PushDeviceIdStorage> e16 = Gg.a.e(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
            this.providePushDeviceIdStorageProvider = e16;
            this.provideLegacyIdentityStorageProvider = Gg.a.e(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, e16));
            this.provideApplicationConfigurationProvider = Gg.a.e(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
            this.provideHttpLoggingInterceptorProvider = g.b(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
            this.provideZendeskBasicHeadersInterceptorProvider = g.b(ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
            this.providesUserAgentHeaderInterceptorProvider = g.b(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
            Provider<ScheduledExecutorService> e17 = Gg.a.e(ZendeskApplicationModule_ProvideExecutorFactory.create());
            this.provideExecutorProvider = e17;
            Provider<ExecutorService> e18 = Gg.a.e(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(e17));
            this.provideExecutorServiceProvider = e18;
            this.provideBaseOkHttpClientProvider = Gg.a.e(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, e18));
            this.provideAcceptLanguageHeaderInterceptorProvider = g.b(ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory.create(this.provideApplicationContextProvider));
            Provider<AcceptHeaderInterceptor> b11 = g.b(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
            this.providesAcceptHeaderInterceptorProvider = b11;
            Provider<OkHttpClient> e19 = Gg.a.e(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, b11));
            this.provideCoreOkHttpClientProvider = e19;
            Provider<Retrofit> e20 = Gg.a.e(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, e19));
            this.provideCoreRetrofitProvider = e20;
            this.provideBlipsServiceProvider = Gg.a.e(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(e20));
            this.provideDeviceInfoProvider = Gg.a.e(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
            this.provideBase64SerializerProvider = g.b(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
            Provider<CoreSettingsStorage> e21 = Gg.a.e(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
            this.provideCoreSettingsStorageProvider = e21;
            Provider<ZendeskBlipsProvider> e22 = Gg.a.e(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, e21, this.provideExecutorServiceProvider));
            this.providerZendeskBlipsProvider = e22;
            this.providerBlipsCoreProvider = Gg.a.e(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(e22));
            Provider<ZendeskAuthHeaderInterceptor> b12 = g.b(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
            this.provideAuthHeaderInterceptorProvider = b12;
            Provider<Retrofit> e23 = Gg.a.e(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, b12));
            this.providePushProviderRetrofitProvider = e23;
            this.providePushRegistrationServiceProvider = g.b(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(e23));
            this.provideSdkSettingsServiceProvider = g.b(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
            this.actionHandlerRegistryProvider = Gg.a.e(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
            Provider<ZendeskLocaleConverter> e24 = Gg.a.e(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
            this.provideZendeskLocaleConverterProvider = e24;
            Provider<ZendeskSettingsProvider> e25 = Gg.a.e(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, e24, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
            this.provideZendeskSdkSettingsProvider = e25;
            Provider<SettingsProvider> e26 = Gg.a.e(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(e25));
            this.provideSdkSettingsProvider = e26;
            this.providePushRegistrationProvider = Gg.a.e(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, e26, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
            Provider<AccessService> b13 = g.b(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
            this.provideAccessServiceProvider = b13;
            Provider<AccessProvider> e27 = Gg.a.e(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, b13));
            this.provideAccessProvider = e27;
            this.provideAccessInterceptorProvider = g.b(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, e27, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
            this.provideZendeskUnauthorizedInterceptorProvider = g.b(ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory.create(this.provideSessionStorageProvider, this.provideIdentityManagerProvider));
            Provider<SdkSettingsProviderInternal> e28 = Gg.a.e(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
            this.provideSdkSettingsProviderInternalProvider = e28;
            this.provideSettingsInterceptorProvider = g.b(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(e28, this.provideSettingsStorageProvider));
            Provider<PushRegistrationProviderInternal> e29 = Gg.a.e(ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory.create(this.providePushRegistrationProvider));
            this.providePushRegistrationProviderInternalProvider = e29;
            Provider<ZendeskPushInterceptor> b14 = g.b(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(e29, this.providePushDeviceIdStorageProvider, this.provideIdentityStorageProvider));
            this.providePushInterceptorProvider = b14;
            Provider<OkHttpClient> e30 = Gg.a.e(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, b14, this.provideCacheProvider));
            this.provideOkHttpClientProvider = e30;
            this.provideRetrofitProvider = Gg.a.e(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, e30));
            Provider<CachingInterceptor> b15 = g.b(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
            this.provideCachingInterceptorProvider = b15;
            Provider<OkHttpClient> e31 = Gg.a.e(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, b15, this.provideZendeskUnauthorizedInterceptorProvider));
            this.provideMediaOkHttpClientProvider = e31;
            this.provideRestServiceProvider = Gg.a.e(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, e31, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
            this.providerBlipsProvider = Gg.a.e(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
            Provider<ConnectivityManager> e32 = Gg.a.e(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
            this.providerConnectivityManagerProvider = e32;
            this.providerNetworkInfoProvider = Gg.a.e(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(e32));
            this.provideAuthProvider = Gg.a.e(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
            Provider<MachineIdStorage> e33 = Gg.a.e(ZendeskStorageModule_ProvideMachineIdStorageFactory.create(this.provideApplicationContextProvider));
            this.provideMachineIdStorageProvider = e33;
            this.provideCoreSdkModuleProvider = g.b(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider, e33));
            Provider<UserService> b16 = g.b(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
            this.provideUserServiceProvider = b16;
            Provider<UserProvider> e34 = Gg.a.e(ZendeskProvidersModule_ProvideUserProviderFactory.create(b16));
            this.provideUserProvider = e34;
            Provider<ProviderStore> e35 = Gg.a.e(ZendeskProvidersModule_ProvideProviderStoreFactory.create(e34, this.providePushRegistrationProvider));
            this.provideProviderStoreProvider = e35;
            this.provideZendeskProvider = Gg.a.e(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, e35));
        }

        @Override // zendesk.core.ZendeskApplicationComponent
        public ZendeskShadow zendeskShadow() {
            return this.provideZendeskProvider.get();
        }

        private ZendeskApplicationComponentImpl(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
            this.zendeskApplicationComponentImpl = this;
            initialize(zendeskApplicationModule, zendeskNetworkModule);
        }
    }

    private DaggerZendeskApplicationComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
