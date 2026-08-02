package zendesk.core;

import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class AcceptHeaderInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(Constants.ACCEPT_HEADER, "application/json").build());
    }
}
