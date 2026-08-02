package zendesk.core;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements Gg.b {
    private final Provider<OkHttpClient> coreOkHttpClientProvider;
    private final Provider<OkHttpClient> mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final Provider<Retrofit> retrofitProvider;
    private final Provider<OkHttpClient> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<Retrofit> provider, Provider<OkHttpClient> provider2, Provider<OkHttpClient> provider3, Provider<OkHttpClient> provider4) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = provider;
        this.mediaOkHttpClientProvider = provider2;
        this.standardOkHttpClientProvider = provider3;
        this.coreOkHttpClientProvider = provider4;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, Provider<Retrofit> provider, Provider<OkHttpClient> provider2, Provider<OkHttpClient> provider3, Provider<OkHttpClient> provider4) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, provider, provider2, provider3, provider4);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, Retrofit retrofit, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return (RestServiceProvider) Gg.d.d(zendeskNetworkModule.provideRestServiceProvider(retrofit, okHttpClient, okHttpClient2, okHttpClient3));
    }

    @Override // javax.inject.Provider
    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, this.retrofitProvider.get(), this.mediaOkHttpClientProvider.get(), this.standardOkHttpClientProvider.get(), this.coreOkHttpClientProvider.get());
    }
}
