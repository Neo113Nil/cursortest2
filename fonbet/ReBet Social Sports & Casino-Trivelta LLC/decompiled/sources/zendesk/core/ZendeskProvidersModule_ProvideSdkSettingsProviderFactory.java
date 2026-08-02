package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements Gg.b {
    private final Provider<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(Provider<ZendeskSettingsProvider> provider) {
        this.sdkSettingsProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(Provider<ZendeskSettingsProvider> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(provider);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        return (SettingsProvider) Gg.d.d(ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj));
    }

    @Override // javax.inject.Provider
    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}
