package zendesk.core;

import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements Gg.b {
    private final Provider<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final Provider<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final Provider<CachingInterceptor> cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final Provider<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<OkHttpClient> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskAuthHeaderInterceptor> provider3, Provider<ZendeskSettingsInterceptor> provider4, Provider<CachingInterceptor> provider5, Provider<ZendeskUnauthorizedInterceptor> provider6) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = provider;
        this.accessInterceptorProvider = provider2;
        this.authHeaderInterceptorProvider = provider3;
        this.settingsInterceptorProvider = provider4;
        this.cachingInterceptorProvider = provider5;
        this.unauthorizedInterceptorProvider = provider6;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Provider<OkHttpClient> provider, Provider<ZendeskAccessInterceptor> provider2, Provider<ZendeskAuthHeaderInterceptor> provider3, Provider<ZendeskSettingsInterceptor> provider4, Provider<CachingInterceptor> provider5, Provider<ZendeskUnauthorizedInterceptor> provider6) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OkHttpClient provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (OkHttpClient) Gg.d.d(zendeskNetworkModule.provideMediaOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideMediaOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}
