package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory implements Gg.b {
    private final Provider<PushRegistrationProvider> pushRegistrationProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(Provider<PushRegistrationProvider> provider) {
        this.pushRegistrationProvider = provider;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory create(Provider<PushRegistrationProvider> provider) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(provider);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (PushRegistrationProviderInternal) Gg.d.d(ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider));
    }

    @Override // javax.inject.Provider
    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal(this.pushRegistrationProvider.get());
    }
}
