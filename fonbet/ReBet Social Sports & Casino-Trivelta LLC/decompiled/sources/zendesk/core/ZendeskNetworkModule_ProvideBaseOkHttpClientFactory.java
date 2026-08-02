package zendesk.core;

import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements Gg.b {
    private final Provider<ExecutorService> executorServiceProvider;
    private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final Provider<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final Provider<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, Provider<HttpLoggingInterceptor> provider, Provider<ZendeskOauthIdHeaderInterceptor> provider2, Provider<UserAgentAndClientHeadersInterceptor> provider3, Provider<ExecutorService> provider4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = provider;
        this.oauthIdHeaderInterceptorProvider = provider2;
        this.userAgentAndClientHeadersInterceptorProvider = provider3;
        this.executorServiceProvider = provider4;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, Provider<HttpLoggingInterceptor> provider, Provider<ZendeskOauthIdHeaderInterceptor> provider2, Provider<UserAgentAndClientHeadersInterceptor> provider3, Provider<ExecutorService> provider4) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, provider, provider2, provider3, provider4);
    }

    public static OkHttpClient provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        return (OkHttpClient) Gg.d.d(zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideBaseOkHttpClient(this.module, this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), this.executorServiceProvider.get());
    }
}
