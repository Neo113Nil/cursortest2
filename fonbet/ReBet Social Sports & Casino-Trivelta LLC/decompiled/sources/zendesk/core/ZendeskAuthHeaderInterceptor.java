package zendesk.core;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskAuthHeaderInterceptor implements Interceptor {
    private IdentityManager identityManager;

    public ZendeskAuthHeaderInterceptor(IdentityManager identityManager) {
        this.identityManager = identityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        Identity identity = this.identityManager.getIdentity();
        String storedAccessTokenAsBearerToken = this.identityManager.getStoredAccessTokenAsBearerToken();
        if (UrlHelper.isGuideRequest(chain.request().url().getUrl()) && !UrlHelper.isVoteRequest(chain.request().url().getUrl()) && (identity instanceof AnonymousIdentity)) {
            return chain.proceed(newBuilder.build());
        }
        if (storedAccessTokenAsBearerToken != null) {
            newBuilder.addHeader(Constants.AUTHORIZATION_HEADER, storedAccessTokenAsBearerToken);
        }
        return chain.proceed(newBuilder.build());
    }
}
