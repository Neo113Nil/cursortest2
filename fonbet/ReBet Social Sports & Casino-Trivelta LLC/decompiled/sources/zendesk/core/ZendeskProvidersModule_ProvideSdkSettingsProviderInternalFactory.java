package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements Gg.b {
    private final Provider<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(Provider<ZendeskSettingsProvider> provider) {
        this.sdkSettingsProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(Provider<ZendeskSettingsProvider> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(provider);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        return (SdkSettingsProviderInternal) Gg.d.d(ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj));
    }

    @Override // javax.inject.Provider
    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}
