package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return (AcceptHeaderInterceptor) Gg.d.d(ZendeskNetworkModule.providesAcceptHeaderInterceptor());
    }

    @Override // javax.inject.Provider
    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}
