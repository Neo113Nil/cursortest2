package zendesk.core;

import ld.AbstractC5459a;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskUnauthorizedInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskUnauthorizedInterceptor";
    private final IdentityManager identityManager;
    private final SessionStorage sessionStorage;

    public ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        this.sessionStorage = sessionStorage;
        this.identityManager = identityManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful() && 401 == proceed.code()) {
            if (UrlHelper.isGuideRequest(chain.request().url().getUrl()) && (this.identityManager.getIdentity() instanceof AnonymousIdentity)) {
                AbstractC5459a.b(LOG_TAG, "Unauthorized guide request", new Object[0]);
                return proceed;
            }
            onHttpUnauthorized();
        }
        return proceed;
    }

    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}
