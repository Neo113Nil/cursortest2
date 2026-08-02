package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements Gg.b {
    private final Provider<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(Provider<BaseStorage> provider) {
        this.mediaCacheProvider = provider;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(Provider<BaseStorage> provider) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(provider);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return (CachingInterceptor) Gg.d.d(ZendeskNetworkModule.provideCachingInterceptor(baseStorage));
    }

    @Override // javax.inject.Provider
    public CachingInterceptor get() {
        return provideCachingInterceptor(this.mediaCacheProvider.get());
    }
}
