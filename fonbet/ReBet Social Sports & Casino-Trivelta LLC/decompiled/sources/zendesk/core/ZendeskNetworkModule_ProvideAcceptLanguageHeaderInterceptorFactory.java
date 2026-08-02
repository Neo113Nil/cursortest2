package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory create(Provider<Context> provider) {
        return new ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(provider);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return (AcceptLanguageHeaderInterceptor) Gg.d.d(ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context));
    }

    @Override // javax.inject.Provider
    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor(this.contextProvider.get());
    }
}
