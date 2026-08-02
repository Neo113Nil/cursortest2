package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements Gg.b {
    private final Provider<PushRegistrationProvider> pushRegistrationProvider;
    private final Provider<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(Provider<UserProvider> provider, Provider<PushRegistrationProvider> provider2) {
        this.userProvider = provider;
        this.pushRegistrationProvider = provider2;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(Provider<UserProvider> provider, Provider<PushRegistrationProvider> provider2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(provider, provider2);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return (ProviderStore) Gg.d.d(ZendeskProvidersModule.provideProviderStore(userProvider, pushRegistrationProvider));
    }

    @Override // javax.inject.Provider
    public ProviderStore get() {
        return provideProviderStore(this.userProvider.get(), this.pushRegistrationProvider.get());
    }
}
