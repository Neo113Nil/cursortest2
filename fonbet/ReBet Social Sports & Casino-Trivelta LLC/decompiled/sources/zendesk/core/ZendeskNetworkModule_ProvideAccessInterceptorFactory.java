package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements Gg.b {
    private final Provider<AccessProvider> accessProvider;
    private final Provider<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(Provider<IdentityManager> provider, Provider<AccessProvider> provider2, Provider<Storage> provider3, Provider<CoreSettingsStorage> provider4) {
        this.identityManagerProvider = provider;
        this.accessProvider = provider2;
        this.storageProvider = provider3;
        this.coreSettingsStorageProvider = provider4;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(Provider<IdentityManager> provider, Provider<AccessProvider> provider2, Provider<Storage> provider3, Provider<CoreSettingsStorage> provider4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(provider, provider2, provider3, provider4);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ZendeskAccessInterceptor) Gg.d.d(ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4));
    }

    @Override // javax.inject.Provider
    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
