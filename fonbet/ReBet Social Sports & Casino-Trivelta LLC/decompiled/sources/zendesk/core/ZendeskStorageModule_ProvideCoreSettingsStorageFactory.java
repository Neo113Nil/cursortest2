package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements Gg.b {
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(Provider<SettingsStorage> provider) {
        this.settingsStorageProvider = provider;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(Provider<SettingsStorage> provider) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(provider);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        return (CoreSettingsStorage) Gg.d.d(ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj));
    }

    @Override // javax.inject.Provider
    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}
