package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(Provider<Context> provider) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(provider);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) Gg.d.d(ZendeskProvidersModule.providerConnectivityManager(context));
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return providerConnectivityManager(this.contextProvider.get());
    }
}
