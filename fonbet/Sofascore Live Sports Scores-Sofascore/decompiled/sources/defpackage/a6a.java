package defpackage;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a6a implements ResponseHandler {
    public final ResponseHandler a;
    public final Timer b;
    public final xad c;

    public a6a(ResponseHandler responseHandler, Timer timer, xad xadVar) {
        this.a = responseHandler;
        this.b = timer;
        this.c = xadVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.j(this.b.a());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long a = yad.a(httpResponse);
        if (a != null) {
            this.c.i(a.longValue());
        }
        String b = yad.b(httpResponse);
        if (b != null) {
            this.c.h(b);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}
