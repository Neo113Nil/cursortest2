package zendesk.core;

import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements Gg.b {
    private final Provider<Retrofit> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(Provider<Retrofit> provider) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(provider);
    }

    public static SdkSettingsService provideSdkSettingsService(Retrofit retrofit) {
        return (SdkSettingsService) Gg.d.d(ZendeskProvidersModule.provideSdkSettingsService(retrofit));
    }

    @Override // javax.inject.Provider
    public SdkSettingsService get() {
        return provideSdkSettingsService(this.retrofitProvider.get());
    }
}
