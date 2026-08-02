package zendesk.core;

import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements Gg.b {
    private final Provider<Retrofit> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(Provider<Retrofit> provider) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(provider);
    }

    public static PushRegistrationService providePushRegistrationService(Retrofit retrofit) {
        return (PushRegistrationService) Gg.d.d(ZendeskProvidersModule.providePushRegistrationService(retrofit));
    }

    @Override // javax.inject.Provider
    public PushRegistrationService get() {
        return providePushRegistrationService(this.retrofitProvider.get());
    }
}
