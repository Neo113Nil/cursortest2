package zendesk.core;

import javax.inject.Provider;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideUserServiceFactory implements Gg.b {
    private final Provider<Retrofit> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(Provider<Retrofit> provider) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(provider);
    }

    public static UserService provideUserService(Retrofit retrofit) {
        return (UserService) Gg.d.d(ZendeskProvidersModule.provideUserService(retrofit));
    }

    @Override // javax.inject.Provider
    public UserService get() {
        return provideUserService(this.retrofitProvider.get());
    }
}
