package c;

import android.os.Build;
import com.surt.guardian.GuardianSDK;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import zendesk.core.Constants;

/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440f implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String header = request.header(Constants.AUTHORIZATION_HEADER);
        Request.Builder header2 = request.newBuilder().removeHeader(Constants.AUTHORIZATION_HEADER).header("X-SDK-Version", GuardianSDK.VERSION).header("X-Platform", "Android");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Request.Builder header3 = header2.header("X-OS-Version", RELEASE).header(Constants.USER_AGENT_HEADER_KEY, "SurtGuardianSDK/0.4.2 Android/" + RELEASE);
        if (header != null && !StringsKt.isBlank(header)) {
            header3.header(Constants.AUTHORIZATION_HEADER, header);
        }
        return chain.proceed(header3.build());
    }
}
