package zendesk.core;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
class UserAgentAndClientHeadersInterceptor implements Interceptor {
    private final String userAgent;
    private final String version;
    private final String zendeskClient;

    public UserAgentAndClientHeadersInterceptor(String str, String str2) {
        Locale locale = Locale.US;
        this.userAgent = String.format(locale, Constants.USER_AGENT_HEADER_TEMPLATE, str, Integer.valueOf(Build.VERSION.SDK_INT), str2);
        this.zendeskClient = String.format(locale, Constants.X_ZENDESK_CLIENT_HEADER_VALUE_FORMAT, str2.toLowerCase());
        this.version = str;
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.removeHeader(Constants.USER_AGENT_HEADER_KEY);
        newBuilder.addHeader(Constants.USER_AGENT_HEADER_KEY, this.userAgent);
        newBuilder.removeHeader(Constants.X_ZENDESK_CLIENT_HEADER_NAME);
        newBuilder.addHeader(Constants.X_ZENDESK_CLIENT_HEADER_NAME, this.zendeskClient);
        newBuilder.removeHeader(Constants.X_ZENDESK_CLIENT_VERSION_HEADER_NAME);
        newBuilder.addHeader(Constants.X_ZENDESK_CLIENT_VERSION_HEADER_NAME, this.version);
        return chain.proceed(newBuilder.build());
    }
}
