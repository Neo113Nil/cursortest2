package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements Gg.b {
    private final Provider<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(Provider<ZendeskBlipsProvider> provider) {
        this.zendeskBlipsProvider = provider;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(Provider<ZendeskBlipsProvider> provider) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(provider);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        return (BlipsProvider) Gg.d.d(ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj));
    }

    @Override // javax.inject.Provider
    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}
