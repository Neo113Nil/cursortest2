package zendesk.core;

import android.content.Context;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context) {
        this.context = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        return (!com.zendesk.util.d.c(request.header(Constants.ACCEPT_LANGUAGE)) || currentLocale == null) ? chain.proceed(request) : chain.proceed(request.newBuilder().addHeader(Constants.ACCEPT_LANGUAGE, com.zendesk.util.c.a(currentLocale)).build());
    }
}
