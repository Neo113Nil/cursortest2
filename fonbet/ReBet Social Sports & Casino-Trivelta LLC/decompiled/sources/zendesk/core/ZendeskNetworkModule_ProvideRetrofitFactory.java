package zendesk.core;

import com.google.gson.Gson;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideRetrofitFactory implements Gg.b {
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideRetrofitFactory(Provider<ApplicationConfiguration> provider, Provider<Gson> provider2, Provider<OkHttpClient> provider3) {
        this.configurationProvider = provider;
        this.gsonProvider = provider2;
        this.okHttpClientProvider = provider3;
    }

    public static ZendeskNetworkModule_ProvideRetrofitFactory create(Provider<ApplicationConfiguration> provider, Provider<Gson> provider2, Provider<OkHttpClient> provider3) {
        return new ZendeskNetworkModule_ProvideRetrofitFactory(provider, provider2, provider3);
    }

    public static Retrofit provideRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient) {
        return (Retrofit) Gg.d.d(ZendeskNetworkModule.provideRetrofit(applicationConfiguration, gson, okHttpClient));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get());
    }
}
