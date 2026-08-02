package le;

import de.AbstractC4064a;
import kotlin.jvm.internal.Intrinsics;
import og.i;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import sd.d;

/* renamed from: le.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5461a implements Interceptor {
    public final boolean a(Request request) {
        return AbstractC4064a.a(request, be.b.class) != null;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String d10 = d.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getServiceUrl(...)");
        HttpUrl parse = companion.parse(d10);
        String valueOf = String.valueOf(parse != null ? parse.host() : null);
        if (!a(request) && i.e(valueOf) && !Intrinsics.areEqual(request.url().host(), valueOf)) {
            request = request.newBuilder().url(request.url().newBuilder().host(valueOf).build()).build();
        }
        return chain.proceed(request);
    }
}
