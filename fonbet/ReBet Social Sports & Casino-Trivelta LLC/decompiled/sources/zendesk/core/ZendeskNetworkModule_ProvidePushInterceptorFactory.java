package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements Gg.b {
    private final Provider<IdentityStorage> identityStorageProvider;
    private final Provider<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final Provider<PushRegistrationProviderInternal> pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(Provider<PushRegistrationProviderInternal> provider, Provider<PushDeviceIdStorage> provider2, Provider<IdentityStorage> provider3) {
        this.pushProvider = provider;
        this.pushDeviceIdStorageProvider = provider2;
        this.identityStorageProvider = provider3;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(Provider<PushRegistrationProviderInternal> provider, Provider<PushDeviceIdStorage> provider2, Provider<IdentityStorage> provider3) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(provider, provider2, provider3);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2, Object obj3) {
        return (ZendeskPushInterceptor) Gg.d.d(ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2, (IdentityStorage) obj3));
    }

    @Override // javax.inject.Provider
    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get(), this.identityStorageProvider.get());
    }
}
