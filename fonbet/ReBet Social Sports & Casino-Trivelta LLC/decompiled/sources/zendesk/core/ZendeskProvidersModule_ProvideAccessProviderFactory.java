package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements Gg.b {
    private final Provider<AccessService> accessServiceProvider;
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(Provider<IdentityManager> provider, Provider<AccessService> provider2) {
        this.identityManagerProvider = provider;
        this.accessServiceProvider = provider2;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(Provider<IdentityManager> provider, Provider<AccessService> provider2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(provider, provider2);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        return (AccessProvider) Gg.d.d(ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2));
    }

    @Override // javax.inject.Provider
    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}
