package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements Gg.b {
    private final Provider<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(Provider<SdkSettingsProviderInternal> provider, Provider<SettingsStorage> provider2) {
        this.sdkSettingsProvider = provider;
        this.settingsStorageProvider = provider2;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(Provider<SdkSettingsProviderInternal> provider, Provider<SettingsStorage> provider2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(provider, provider2);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        return (ZendeskSettingsInterceptor) Gg.d.d(ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2));
    }

    @Override // javax.inject.Provider
    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}
