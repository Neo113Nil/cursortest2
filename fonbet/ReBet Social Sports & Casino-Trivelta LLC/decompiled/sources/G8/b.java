package G8;

import K8.b;
import K8.k;
import L8.d;
import M8.e;
import android.net.Uri;
import com.giphy.sdk.analytics.models.Session;
import com.giphy.sdk.analytics.models.SessionsRequestData;
import com.giphy.sdk.analytics.network.response.PingbackResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3912a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3913b;

    /* renamed from: c, reason: collision with root package name */
    public final F8.a f3914c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3915d;

    public b(String apiKey, d networkSession, F8.a analyticsId) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(networkSession, "networkSession");
        Intrinsics.checkNotNullParameter(analyticsId, "analyticsId");
        this.f3912a = apiKey;
        this.f3913b = networkSession;
        this.f3914c = analyticsId;
        this.f3915d = "application/json";
    }

    @Override // G8.a
    public Future a(Session session, K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        K8.b bVar = K8.b.f6359a;
        Pair pair = TuplesKt.to(bVar.a(), this.f3912a);
        String c10 = bVar.c();
        E8.a aVar = E8.a.f3012a;
        HashMap hashMapOf = MapsKt.hashMapOf(pair, TuplesKt.to(c10, aVar.e().i().b()));
        Map mutableMap = MapsKt.toMutableMap(MapsKt.plus(MapsKt.hashMapOf(TuplesKt.to(bVar.b(), this.f3915d)), aVar.b()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Android Pingback ");
        J8.d dVar = J8.d.f5962a;
        sb2.append(dVar.e());
        sb2.append(" v");
        sb2.append(dVar.f());
        mutableMap.put(Constants.USER_AGENT_HEADER_KEY, sb2.toString());
        Uri d10 = bVar.d();
        Intrinsics.checkNotNullExpressionValue(d10, "Constants.PINGBACK_SERVER_URL");
        return b(d10, b.C0135b.f6371a.g(), k.b.POST, PingbackResponse.class, hashMapOf, mutableMap, new SessionsRequestData(session)).l(completionHandler);
    }

    public final e b(Uri serverUrl, String path, k.b method, Class responseClass, Map map, Map map2, SessionsRequestData requestBody) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseClass, "responseClass");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return this.f3913b.a(serverUrl, path, method, responseClass, map, map2, requestBody);
    }
}
