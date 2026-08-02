package zendesk.core;

import android.content.Context;
import com.google.gson.Gson;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes5.dex */
class ZendeskNetworkModule {
    private static final String BASE_OK_HTTP = "BaseOkHttp";
    private static final String CORE_OK_HTTP = "CoreOkHttp";
    static final String CORE_RETROFIT = "CoreRetrofit";
    private static final String MEDIA_OK_HTTP = "MediaOkHttp";
    static final String PUSH_PROVIDER_RETROFIT = "PushProviderRetrofit";
    private static final String STANDARD_OK_HTTP = "StandardOkHttp";
    static final String STANDARD_RETROFIT = "Retrofit";

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(@Named("application_context") Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    public static CachingInterceptor provideCachingInterceptor(@Named("base_storage_disk_lru") BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    @Singleton
    @Named(CORE_RETROFIT)
    public static Retrofit provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, @Named("CoreOkHttp") OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
    }

    public static ZendeskPushInterceptor providePushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        return new ZendeskPushInterceptor(pushRegistrationProviderInternal, pushDeviceIdStorage, identityStorage);
    }

    @Singleton
    @Named(PUSH_PROVIDER_RETROFIT)
    public static Retrofit providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, @Named("CoreOkHttp") OkHttpClient okHttpClient, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient.newBuilder().addInterceptor(zendeskAuthHeaderInterceptor).build()).build();
    }

    @Singleton
    @Named(STANDARD_RETROFIT)
    public static Retrofit provideRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, @Named("StandardOkHttp") OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage, identityManager);
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    @Singleton
    @Named(BASE_OK_HTTP)
    public OkHttpClient provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        OkHttpClient.Builder addInterceptor = Tls12SocketFactory.enableTls12(new OkHttpClient.Builder()).addInterceptor(zendeskOauthIdHeaderInterceptor).addInterceptor(httpLoggingInterceptor).addInterceptor(userAgentAndClientHeadersInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).dispatcher(new Dispatcher(executorService)).build();
    }

    @Singleton
    @Named(CORE_OK_HTTP)
    public OkHttpClient provideCoreOkHttpClient(@Named("BaseOkHttp") OkHttpClient okHttpClient, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(acceptLanguageHeaderInterceptor).addInterceptor(acceptHeaderInterceptor).build();
    }

    @Singleton
    @Named(MEDIA_OK_HTTP)
    public OkHttpClient provideMediaOkHttpClient(@Named("BaseOkHttp") OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(cachingInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).build();
    }

    @Singleton
    @Named(STANDARD_OK_HTTP)
    public OkHttpClient provideOkHttpClient(@Named("BaseOkHttp") OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, ZendeskPushInterceptor zendeskPushInterceptor, Cache cache) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).addInterceptor(acceptHeaderInterceptor).addInterceptor(zendeskPushInterceptor).cache(cache).build();
    }

    @Singleton
    public RestServiceProvider provideRestServiceProvider(@Named("Retrofit") Retrofit retrofit, @Named("MediaOkHttp") OkHttpClient okHttpClient, @Named("StandardOkHttp") OkHttpClient okHttpClient2, @Named("CoreOkHttp") OkHttpClient okHttpClient3) {
        return new ZendeskRestServiceProvider(retrofit, okHttpClient, okHttpClient2, okHttpClient3);
    }

    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor(BuildConfig.VERSION_NAME, Constants.VARIANT);
    }
}
