package gh;

import io.sentry.y3;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g0 implements d {
    public static final List B;
    public static final List C;
    public final h9.c A;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.x f10170a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10171b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10172c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.credentials.playservices.controllers.CreateRestoreCredential.a f10173d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10174e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10175f;

    /* renamed from: g, reason: collision with root package name */
    public final o f10176g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10177h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10178i;
    public final o j;

    /* renamed from: k, reason: collision with root package name */
    public final o f10179k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f10180l;

    /* renamed from: m, reason: collision with root package name */
    public final o f10181m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f10182n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f10183o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f10184p;
    public final List q;

    /* renamed from: r, reason: collision with root package name */
    public final List f10185r;

    /* renamed from: s, reason: collision with root package name */
    public final HostnameVerifier f10186s;

    /* renamed from: t, reason: collision with root package name */
    public final h f10187t;

    /* renamed from: u, reason: collision with root package name */
    public final y4.a f10188u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10189v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10190w;

    /* renamed from: x, reason: collision with root package name */
    public final int f10191x;

    /* renamed from: y, reason: collision with root package name */
    public final i2.d f10192y;

    /* renamed from: z, reason: collision with root package name */
    public final jh.e f10193z;

    static {
        h0[] elements = {h0.f10201f, h0.f10199d};
        TimeZone timeZone = hh.g.f10825a;
        Intrinsics.checkNotNullParameter(elements, "elements");
        B = hh.g.k(elements);
        l[] elements2 = {l.f10234e, l.f10235f};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        C = hh.g.k(elements2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(f0 builder) {
        List list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        androidx.credentials.playservices.controllers.CreateRestoreCredential.a originalEventListenerFactory = builder.f10152e;
        Intrinsics.checkNotNullParameter(originalEventListenerFactory, "originalEventListenerFactory");
        Intrinsics.checkNotNullExpressionValue(y3.f17255a, "getInstance(...)");
        io.sentry.okhttp.e eventListener = new io.sentry.okhttp.e(new androidx.fragment.app.r(4, originalEventListenerFactory));
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        TimeZone timeZone = hh.g.f10825a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        builder.f10152e = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(19, eventListener);
        this.f10170a = builder.f10148a;
        this.f10171b = hh.g.j(builder.f10150c);
        this.f10172c = hh.g.j(builder.f10151d);
        this.f10173d = builder.f10152e;
        this.f10174e = builder.f10153f;
        this.f10175f = builder.f10154g;
        this.f10176g = builder.f10155h;
        this.f10177h = builder.f10156i;
        this.f10178i = builder.j;
        this.j = builder.f10157k;
        this.f10179k = builder.f10158l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f10180l = proxySelector == null ? sh.a.f23722a : proxySelector;
        this.f10181m = builder.f10159m;
        this.f10182n = builder.f10160n;
        List list2 = builder.q;
        this.q = list2;
        this.f10185r = builder.f10163r;
        this.f10186s = builder.f10164s;
        this.f10189v = builder.f10167v;
        this.f10190w = builder.f10168w;
        this.f10191x = builder.f10169x;
        this.f10192y = new i2.d((byte) 0, 14);
        this.f10193z = jh.e.f18552l;
        h9.c cVar = builder.f10149b;
        if (cVar == null) {
            cVar = new h9.c(29);
            builder.f10149b = cVar;
        }
        this.A = cVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f10236a) {
                    SSLSocketFactory sSLSocketFactory = builder.f10161o;
                    if (sSLSocketFactory == null) {
                        qh.e eVar = qh.e.f22190a;
                        qh.e.f22190a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        Intrinsics.checkNotNull(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                                X509TrustManager trustManager2 = (X509TrustManager) trustManager;
                                this.f10184p = trustManager2;
                                qh.e eVar2 = qh.e.f22190a;
                                eVar2.getClass();
                                Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                                try {
                                    SSLContext l6 = eVar2.l();
                                    l6.init(null, new TrustManager[]{trustManager2}, null);
                                    SSLSocketFactory socketFactory = l6.getSocketFactory();
                                    Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
                                    this.f10183o = socketFactory;
                                    Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                                    y4.a certificateChainCleaner = qh.e.f22190a.c(trustManager2);
                                    this.f10188u = certificateChainCleaner;
                                    h hVar = builder.f10165t;
                                    hVar.getClass();
                                    Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                                    this.f10187t = Intrinsics.areEqual(hVar.f10196b, certificateChainCleaner) ? hVar : new h(hVar.f10195a, certificateChainCleaner);
                                } catch (GeneralSecurityException e7) {
                                    throw new AssertionError("No System TLS: " + e7, e7);
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
                        String arrays = Arrays.toString(trustManagers);
                        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                        sb2.append(arrays);
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                    this.f10183o = sSLSocketFactory;
                    y4.a certificateChainCleaner2 = builder.f10166u;
                    Intrinsics.checkNotNull(certificateChainCleaner2);
                    this.f10188u = certificateChainCleaner2;
                    X509TrustManager x509TrustManager = builder.f10162p;
                    Intrinsics.checkNotNull(x509TrustManager);
                    this.f10184p = x509TrustManager;
                    h hVar2 = builder.f10165t;
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                    this.f10187t = Intrinsics.areEqual(hVar2.f10196b, certificateChainCleaner2) ? hVar2 : new h(hVar2.f10195a, certificateChainCleaner2);
                    X509TrustManager x509TrustManager2 = this.f10184p;
                    y4.a aVar = this.f10188u;
                    SSLSocketFactory sSLSocketFactory2 = this.f10183o;
                    List list3 = this.f10172c;
                    list = this.f10171b;
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    Intrinsics.checkNotNull(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()).f10236a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (aVar == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager2 == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (aVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.areEqual(this.f10187t, h.f10194c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Unit unit = Unit.f19194a;
                    return;
                }
            }
        }
        this.f10183o = null;
        this.f10188u = null;
        this.f10184p = null;
        this.f10187t = h.f10194c;
        X509TrustManager x509TrustManager22 = this.f10184p;
        y4.a aVar2 = this.f10188u;
        SSLSocketFactory sSLSocketFactory22 = this.f10183o;
        List list32 = this.f10172c;
        list = this.f10171b;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
