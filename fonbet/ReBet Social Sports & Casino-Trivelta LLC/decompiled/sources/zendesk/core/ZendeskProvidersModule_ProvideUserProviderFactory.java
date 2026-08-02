package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideUserProviderFactory implements Gg.b {
    private final Provider<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(Provider<UserService> provider) {
        this.userServiceProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(Provider<UserService> provider) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(provider);
    }

    public static UserProvider provideUserProvider(Object obj) {
        return (UserProvider) Gg.d.d(ZendeskProvidersModule.provideUserProvider((UserService) obj));
    }

    @Override // javax.inject.Provider
    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}
