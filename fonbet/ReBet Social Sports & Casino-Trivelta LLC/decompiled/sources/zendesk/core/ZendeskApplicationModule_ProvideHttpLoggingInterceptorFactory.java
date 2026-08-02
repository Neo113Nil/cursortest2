package zendesk.core;

import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return (HttpLoggingInterceptor) Gg.d.d(ZendeskApplicationModule.provideHttpLoggingInterceptor());
    }

    @Override // javax.inject.Provider
    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor();
    }
}
