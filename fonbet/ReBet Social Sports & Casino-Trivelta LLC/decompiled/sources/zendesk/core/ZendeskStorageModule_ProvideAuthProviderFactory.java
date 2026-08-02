package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideAuthProviderFactory implements Gg.b {
    private final Provider<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(Provider<IdentityManager> provider) {
        this.identityManagerProvider = provider;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(Provider<IdentityManager> provider) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(provider);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        return (AuthenticationProvider) Gg.d.d(ZendeskStorageModule.provideAuthProvider((IdentityManager) obj));
    }

    @Override // javax.inject.Provider
    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}
