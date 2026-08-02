package zendesk.core;

import com.google.gson.Gson;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements Gg.b {
    private final Provider<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(Provider<ApplicationConfiguration> provider, Provider<Gson> provider2, Provider<OkHttpClient> provider3, Provider<ZendeskAuthHeaderInterceptor> provider4) {
        this.configurationProvider = provider;
        this.gsonProvider = provider2;
        this.okHttpClientProvider = provider3;
        this.authHeaderInterceptorProvider = provider4;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(Provider<ApplicationConfiguration> provider, Provider<Gson> provider2, Provider<OkHttpClient> provider3, Provider<ZendeskAuthHeaderInterceptor> provider4) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(provider, provider2, provider3, provider4);
    }

    public static Retrofit providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient, Object obj) {
        return (Retrofit) Gg.d.d(ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, gson, okHttpClient, (ZendeskAuthHeaderInterceptor) obj));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return providePushProviderRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}
