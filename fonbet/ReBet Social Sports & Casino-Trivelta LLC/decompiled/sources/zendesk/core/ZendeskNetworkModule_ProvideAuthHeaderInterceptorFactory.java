package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements Gg.b {
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(Provider<IdentityManager> provider) {
        this.identityManagerProvider = provider;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(Provider<IdentityManager> provider) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(provider);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        return (ZendeskAuthHeaderInterceptor) Gg.d.d(ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj));
    }

    @Override // javax.inject.Provider
    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}
