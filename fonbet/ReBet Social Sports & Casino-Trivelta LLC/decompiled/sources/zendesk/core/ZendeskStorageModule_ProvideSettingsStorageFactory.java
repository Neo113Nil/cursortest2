package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements Gg.b {
    private final Provider<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(Provider<BaseStorage> provider) {
        this.baseStorageProvider = provider;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(provider);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return (SettingsStorage) Gg.d.d(ZendeskStorageModule.provideSettingsStorage(baseStorage));
    }

    @Override // javax.inject.Provider
    public SettingsStorage get() {
        return provideSettingsStorage(this.baseStorageProvider.get());
    }
}
