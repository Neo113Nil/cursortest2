package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements Gg.b {
    private final Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoreSettingsStorage> coreSettingsStorageProvider;
    private final Provider<SdkSettingsService> sdkSettingsServiceProvider;
    private final Provider<Serializer> serializerProvider;
    private final Provider<SettingsStorage> settingsStorageProvider;
    private final Provider<ZendeskLocaleConverter> zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(Provider<SdkSettingsService> provider, Provider<SettingsStorage> provider2, Provider<CoreSettingsStorage> provider3, Provider<ActionHandlerRegistry> provider4, Provider<Serializer> provider5, Provider<ZendeskLocaleConverter> provider6, Provider<ApplicationConfiguration> provider7, Provider<Context> provider8) {
        this.sdkSettingsServiceProvider = provider;
        this.settingsStorageProvider = provider2;
        this.coreSettingsStorageProvider = provider3;
        this.actionHandlerRegistryProvider = provider4;
        this.serializerProvider = provider5;
        this.zendeskLocaleConverterProvider = provider6;
        this.configurationProvider = provider7;
        this.contextProvider = provider8;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(Provider<SdkSettingsService> provider, Provider<SettingsStorage> provider2, Provider<CoreSettingsStorage> provider3, Provider<ActionHandlerRegistry> provider4, Provider<Serializer> provider5, Provider<ZendeskLocaleConverter> provider6, Provider<ApplicationConfiguration> provider7, Provider<Context> provider8) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return (ZendeskSettingsProvider) Gg.d.d(ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context));
    }

    @Override // javax.inject.Provider
    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), this.zendeskLocaleConverterProvider.get(), this.configurationProvider.get(), this.contextProvider.get());
    }
}
