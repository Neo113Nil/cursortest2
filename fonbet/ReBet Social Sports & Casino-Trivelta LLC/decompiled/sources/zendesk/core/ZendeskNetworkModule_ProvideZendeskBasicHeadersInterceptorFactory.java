package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory implements Gg.b {
    private final Provider<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<ApplicationConfiguration> provider) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = provider;
    }

    public static ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule, Provider<ApplicationConfiguration> provider) {
        return new ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(zendeskNetworkModule, provider);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        return (ZendeskOauthIdHeaderInterceptor) Gg.d.d(zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration));
    }

    @Override // javax.inject.Provider
    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, this.configurationProvider.get());
    }
}
