package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements Gg.b {
    private final Provider<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(Provider<BaseStorage> provider) {
        this.baseStorageProvider = provider;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(provider);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return (IdentityStorage) Gg.d.d(ZendeskStorageModule.provideIdentityStorage(baseStorage));
    }

    @Override // javax.inject.Provider
    public IdentityStorage get() {
        return provideIdentityStorage(this.baseStorageProvider.get());
    }
}
