package zendesk.core;

import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements Gg.b {
    private final Provider<Retrofit> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(Provider<Retrofit> provider) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(provider);
    }

    public static AccessService provideAccessService(Retrofit retrofit) {
        return (AccessService) Gg.d.d(ZendeskProvidersModule.provideAccessService(retrofit));
    }

    @Override // javax.inject.Provider
    public AccessService get() {
        return provideAccessService(this.retrofitProvider.get());
    }
}
