package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements Gg.b {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        return (UserAgentAndClientHeadersInterceptor) Gg.d.d(zendeskNetworkModule.providesUserAgentHeaderInterceptor());
    }

    @Override // javax.inject.Provider
    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}
