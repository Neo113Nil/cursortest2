package zendesk.core;

import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements Gg.b {
    private final Provider<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final Provider<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<OkHttpClient> provider, Provider<AcceptLanguageHeaderInterceptor> provider2, Provider<AcceptHeaderInterceptor> provider3) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = provider;
        this.acceptLanguageHeaderInterceptorProvider = provider2;
        this.acceptHeaderInterceptorProvider = provider3;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Provider<OkHttpClient> provider, Provider<AcceptLanguageHeaderInterceptor> provider2, Provider<AcceptHeaderInterceptor> provider3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, provider, provider2, provider3);
    }

    public static OkHttpClient provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2) {
        return (OkHttpClient) Gg.d.d(zendeskNetworkModule.provideCoreOkHttpClient(okHttpClient, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideCoreOkHttpClient(this.module, this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}
