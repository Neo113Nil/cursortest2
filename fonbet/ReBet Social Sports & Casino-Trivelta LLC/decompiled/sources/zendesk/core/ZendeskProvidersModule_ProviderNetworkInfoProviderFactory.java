package zendesk.core;

import android.net.ConnectivityManager;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements Gg.b {
    private final Provider<ConnectivityManager> connectivityManagerProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(Provider<ConnectivityManager> provider) {
        this.connectivityManagerProvider = provider;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(Provider<ConnectivityManager> provider) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(provider);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        return (NetworkInfoProvider) Gg.d.d(ZendeskProvidersModule.providerNetworkInfoProvider(connectivityManager));
    }

    @Override // javax.inject.Provider
    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider(this.connectivityManagerProvider.get());
    }
}
