package gh;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public h9.c f10149b;

    /* renamed from: e, reason: collision with root package name */
    public androidx.credentials.playservices.controllers.CreateRestoreCredential.a f10152e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10153f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10154g;

    /* renamed from: h, reason: collision with root package name */
    public final o f10155h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10156i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final o f10157k;

    /* renamed from: l, reason: collision with root package name */
    public final o f10158l;

    /* renamed from: m, reason: collision with root package name */
    public final o f10159m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f10160n;

    /* renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f10161o;

    /* renamed from: p, reason: collision with root package name */
    public X509TrustManager f10162p;
    public final List q;

    /* renamed from: r, reason: collision with root package name */
    public List f10163r;

    /* renamed from: s, reason: collision with root package name */
    public HostnameVerifier f10164s;

    /* renamed from: t, reason: collision with root package name */
    public final h f10165t;

    /* renamed from: u, reason: collision with root package name */
    public y4.a f10166u;

    /* renamed from: v, reason: collision with root package name */
    public int f10167v;

    /* renamed from: w, reason: collision with root package name */
    public int f10168w;

    /* renamed from: x, reason: collision with root package name */
    public final int f10169x;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.x f10148a = new com.google.firebase.messaging.x(10);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10150c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10151d = new ArrayList();

    public f0() {
        TimeZone timeZone = hh.g.f10825a;
        q qVar = r.f10296a;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        this.f10152e = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(19, qVar);
        this.f10153f = true;
        this.f10154g = true;
        o oVar = b.f10116a;
        this.f10155h = oVar;
        this.f10156i = true;
        this.j = true;
        this.f10157k = o.f10271c;
        this.f10158l = o.f10272d;
        this.f10159m = oVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
        this.f10160n = socketFactory;
        this.q = g0.C;
        this.f10163r = g0.B;
        this.f10164s = uh.c.f24333a;
        this.f10165t = h.f10194c;
        this.f10167v = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f10168w = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f10169x = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }

    public final void a(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        if (Intrinsics.areEqual(sslSocketFactory, this.f10161o)) {
            Intrinsics.areEqual(trustManager, this.f10162p);
        }
        this.f10161o = sslSocketFactory;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        qh.e eVar = qh.e.f22190a;
        this.f10166u = qh.e.f22190a.c(trustManager);
        this.f10162p = trustManager;
    }
}
