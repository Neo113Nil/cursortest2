package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class jod implements yg2 {
    public static final List G = yol.k(new qff[]{qff.HTTP_2, qff.HTTP_1_1});
    public static final List H = yol.k(new gk3[]{gk3.g, gk3.h});
    public final int A;
    public final int B;
    public final long C;
    public final cqa D;
    public final cui E;
    public final t9d F;
    public final w45 a;
    public final List b;
    public final List c;
    public final yhk d;
    public final boolean e;
    public final boolean f;
    public final qp0 g;
    public final boolean h;
    public final boolean i;
    public final ss3 j;
    public final ie2 k;
    public final tnf l;
    public final ProxySelector m;
    public final a99 n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final xm2 u;
    public final ok3 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jod(iod iodVar) {
        SSLSocketFactory sSLSocketFactory;
        X509TrustManager x509TrustManager;
        ok3 ok3Var;
        List list;
        this.a = iodVar.a;
        this.b = yol.j(iodVar.c);
        this.c = yol.j(iodVar.d);
        this.d = iodVar.e;
        this.e = iodVar.f;
        this.f = iodVar.g;
        this.g = iodVar.h;
        this.h = iodVar.i;
        this.i = iodVar.j;
        this.j = iodVar.k;
        this.k = iodVar.l;
        this.l = iodVar.m;
        ProxySelector proxySelector = iodVar.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = nid.a;
        }
        this.m = proxySelector;
        this.n = iodVar.o;
        this.o = iodVar.p;
        List list2 = iodVar.s;
        this.r = list2;
        this.s = iodVar.t;
        this.t = iodVar.u;
        this.w = iodVar.x;
        this.x = iodVar.y;
        this.y = iodVar.z;
        this.z = iodVar.A;
        this.A = iodVar.B;
        this.B = iodVar.C;
        this.C = iodVar.D;
        cqa cqaVar = iodVar.E;
        this.D = cqaVar == null ? new cqa(15) : cqaVar;
        cui cuiVar = iodVar.F;
        this.E = cuiVar == null ? cui.l : cuiVar;
        t9d t9dVar = iodVar.b;
        if (t9dVar == null) {
            t9dVar = new t9d(5L, TimeUnit.MINUTES);
            iodVar.b = t9dVar;
        }
        this.F = t9dVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((gk3) it.next()).a) {
                    sSLSocketFactory = iodVar.q;
                    if (sSLSocketFactory == null) {
                        gie gieVar = gie.a;
                        gie.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                                this.q = x509TrustManager2;
                                gie gieVar2 = gie.a;
                                gieVar2.getClass();
                                try {
                                    SSLContext k = gieVar2.k();
                                    k.init(null, new TrustManager[]{x509TrustManager2}, null);
                                    SSLSocketFactory socketFactory = k.getSocketFactory();
                                    socketFactory.getClass();
                                    this.p = socketFactory;
                                    ok3 c = gie.a.c(x509TrustManager2);
                                    this.v = c;
                                    xm2 xm2Var = iodVar.v;
                                    xm2Var.getClass();
                                    this.u = Intrinsics.c(xm2Var.b, c) ? xm2Var : new xm2(xm2Var.a, c);
                                    x509TrustManager = x509TrustManager2;
                                    sSLSocketFactory = socketFactory;
                                    ok3Var = c;
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        arrays.getClass();
                        hc5.f("Unexpected default trust managers: ".concat(arrays));
                        throw null;
                    }
                    this.p = sSLSocketFactory;
                    ok3Var = iodVar.w;
                    ok3Var.getClass();
                    this.v = ok3Var;
                    x509TrustManager = iodVar.r;
                    x509TrustManager.getClass();
                    this.q = x509TrustManager;
                    xm2 xm2Var2 = iodVar.v;
                    xm2Var2.getClass();
                    this.u = Intrinsics.c(xm2Var2.b, ok3Var) ? xm2Var2 : new xm2(xm2Var2.a, ok3Var);
                    List list3 = this.c;
                    list = this.b;
                    list.getClass();
                    if (!list.contains(null)) {
                        i3c.i(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        i3c.i(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.r;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((gk3) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    a70.r("sslSocketFactory == null");
                                    throw null;
                                }
                                if (ok3Var == null) {
                                    a70.r("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                a70.r("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        a70.r("Check failed.");
                        throw null;
                    }
                    if (ok3Var != null) {
                        a70.r("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        a70.r("Check failed.");
                        throw null;
                    }
                    if (Intrinsics.c(this.u, xm2.c)) {
                        Unit unit = Unit.a;
                        return;
                    } else {
                        a70.r("Check failed.");
                        throw null;
                    }
                }
            }
        }
        this.p = null;
        this.v = null;
        this.q = null;
        this.u = xm2.c;
        sSLSocketFactory = null;
        ok3Var = null;
        x509TrustManager = null;
        List list32 = this.c;
        list = this.b;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    public final iod a() {
        iod iodVar = new iod();
        iodVar.a = this.a;
        iodVar.b = this.F;
        o13.v(this.b, iodVar.c);
        o13.v(this.c, iodVar.d);
        iodVar.e = this.d;
        iodVar.f = this.e;
        iodVar.g = this.f;
        iodVar.h = this.g;
        iodVar.i = this.h;
        iodVar.j = this.i;
        iodVar.k = this.j;
        iodVar.l = this.k;
        iodVar.m = this.l;
        iodVar.n = this.m;
        iodVar.o = this.n;
        iodVar.p = this.o;
        iodVar.q = this.p;
        iodVar.r = this.q;
        iodVar.s = this.r;
        iodVar.t = this.s;
        iodVar.u = this.t;
        iodVar.v = this.u;
        iodVar.w = this.v;
        iodVar.x = this.w;
        iodVar.y = this.x;
        iodVar.z = this.y;
        iodVar.A = this.z;
        iodVar.B = this.A;
        iodVar.C = this.B;
        iodVar.D = this.C;
        iodVar.E = this.D;
        iodVar.F = this.E;
        return iodVar;
    }

    public final pof b(qzf qzfVar) {
        qzfVar.getClass();
        return new pof(this, qzfVar);
    }

    public jod() {
        this(new iod());
    }
}
