package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory implements Gg.b {
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<SessionStorage> sessionStorageProvider;

    public ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(Provider<SessionStorage> provider, Provider<IdentityManager> provider2) {
        this.sessionStorageProvider = provider;
        this.identityManagerProvider = provider2;
    }

    public static ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory create(Provider<SessionStorage> provider, Provider<IdentityManager> provider2) {
        return new ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(provider, provider2);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, Object obj) {
        return (ZendeskUnauthorizedInterceptor) Gg.d.d(ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage, (IdentityManager) obj));
    }

    @Override // javax.inject.Provider
    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor(this.sessionStorageProvider.get(), this.identityManagerProvider.get());
    }
}
