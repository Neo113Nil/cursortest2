package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSdkStorageFactory implements Gg.b {
    private final Provider<MemoryCache> memoryCacheProvider;
    private final Provider<BaseStorage> sdkBaseStorageProvider;
    private final Provider<SessionStorage> sessionStorageProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(Provider<SettingsStorage> provider, Provider<SessionStorage> provider2, Provider<BaseStorage> provider3, Provider<MemoryCache> provider4) {
        this.settingsStorageProvider = provider;
        this.sessionStorageProvider = provider2;
        this.sdkBaseStorageProvider = provider3;
        this.memoryCacheProvider = provider4;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(Provider<SettingsStorage> provider, Provider<SessionStorage> provider2, Provider<BaseStorage> provider3, Provider<MemoryCache> provider4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(provider, provider2, provider3, provider4);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return (Storage) Gg.d.d(ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache));
    }

    @Override // javax.inject.Provider
    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), this.sessionStorageProvider.get(), this.sdkBaseStorageProvider.get(), this.memoryCacheProvider.get());
    }
}
