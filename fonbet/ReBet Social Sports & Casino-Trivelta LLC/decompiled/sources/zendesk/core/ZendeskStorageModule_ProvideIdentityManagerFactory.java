package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements Gg.b {
    private final Provider<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(Provider<IdentityStorage> provider) {
        this.identityStorageProvider = provider;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(Provider<IdentityStorage> provider) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(provider);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        return (IdentityManager) Gg.d.d(ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj));
    }

    @Override // javax.inject.Provider
    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}
