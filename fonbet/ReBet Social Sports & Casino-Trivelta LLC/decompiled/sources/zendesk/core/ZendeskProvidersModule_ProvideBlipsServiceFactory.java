package zendesk.core;

import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements Gg.b {
    private final Provider<Retrofit> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(Provider<Retrofit> provider) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(provider);
    }

    public static BlipsService provideBlipsService(Retrofit retrofit) {
        return (BlipsService) Gg.d.d(ZendeskProvidersModule.provideBlipsService(retrofit));
    }

    @Override // javax.inject.Provider
    public BlipsService get() {
        return provideBlipsService(this.retrofitProvider.get());
    }
}
