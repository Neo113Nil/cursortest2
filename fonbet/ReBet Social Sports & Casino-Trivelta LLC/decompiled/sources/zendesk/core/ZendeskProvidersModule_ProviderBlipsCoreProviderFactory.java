package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements Gg.b {
    private final Provider<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(Provider<ZendeskBlipsProvider> provider) {
        this.zendeskBlipsProvider = provider;
    }

    public static ZendeskProvidersModule_ProviderBlipsCoreProviderFactory create(Provider<ZendeskBlipsProvider> provider) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(provider);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(Object obj) {
        return (BlipsCoreProvider) Gg.d.d(ZendeskProvidersModule.providerBlipsCoreProvider((ZendeskBlipsProvider) obj));
    }

    @Override // javax.inject.Provider
    public BlipsCoreProvider get() {
        return providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
    }
}
