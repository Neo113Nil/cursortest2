package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class epf implements p7a {
    public final pof a;
    public final ArrayList b;
    public final int c;
    public final ge6 d;
    public final qzf e;
    public final int f;
    public final int g;
    public final int h;
    public final qp0 i;
    public final ie2 j;
    public final xm2 k;
    public final t9d l;
    public final ss3 m;
    public final tnf n;
    public final HostnameVerifier o;
    public final qp0 p;
    public final ProxySelector q;
    public final boolean r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final ok3 v;
    public int w;

    public epf(pof pofVar, ArrayList arrayList, int i, ge6 ge6Var, qzf qzfVar, int i2, int i3, int i4, qp0 qp0Var, ie2 ie2Var, xm2 xm2Var, t9d t9dVar, ss3 ss3Var, tnf tnfVar, HostnameVerifier hostnameVerifier, qp0 qp0Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, ok3 ok3Var) {
        qzfVar.getClass();
        qp0Var.getClass();
        xm2Var.getClass();
        t9dVar.getClass();
        ss3Var.getClass();
        tnfVar.getClass();
        hostnameVerifier.getClass();
        qp0Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = pofVar;
        this.b = arrayList;
        this.c = i;
        this.d = ge6Var;
        this.e = qzfVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = qp0Var;
        this.j = ie2Var;
        this.k = xm2Var;
        this.l = t9dVar;
        this.m = ss3Var;
        this.n = tnfVar;
        this.o = hostnameVerifier;
        this.p = qp0Var2;
        this.q = proxySelector;
        this.r = z;
        this.s = socketFactory;
        this.t = sSLSocketFactory;
        this.u = x509TrustManager;
        this.v = ok3Var;
    }

    public static epf a(epf epfVar, int i, ge6 ge6Var, qzf qzfVar, int i2) {
        int i3 = (i2 & 1) != 0 ? epfVar.c : i;
        ge6 ge6Var2 = (i2 & 2) != 0 ? epfVar.d : ge6Var;
        qzf qzfVar2 = (i2 & 4) != 0 ? epfVar.e : qzfVar;
        int i4 = epfVar.f;
        int i5 = epfVar.g;
        int i6 = epfVar.h;
        qp0 qp0Var = epfVar.i;
        ie2 ie2Var = epfVar.j;
        xm2 xm2Var = epfVar.k;
        t9d t9dVar = epfVar.l;
        ss3 ss3Var = epfVar.m;
        tnf tnfVar = epfVar.n;
        HostnameVerifier hostnameVerifier = epfVar.o;
        qp0 qp0Var2 = epfVar.p;
        ProxySelector proxySelector = epfVar.q;
        boolean z = epfVar.r;
        SocketFactory socketFactory = epfVar.s;
        SSLSocketFactory sSLSocketFactory = epfVar.t;
        X509TrustManager x509TrustManager = epfVar.u;
        ok3 ok3Var = epfVar.v;
        qzfVar2.getClass();
        qp0Var.getClass();
        xm2Var.getClass();
        t9dVar.getClass();
        ss3Var.getClass();
        tnfVar.getClass();
        hostnameVerifier.getClass();
        qp0Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new epf(epfVar.a, epfVar.b, i3, ge6Var2, qzfVar2, i4, i5, i6, qp0Var, ie2Var, xm2Var, t9dVar, ss3Var, tnfVar, hostnameVerifier, qp0Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, ok3Var);
    }

    public final d2g b(qzf qzfVar) {
        qzfVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            a70.r("Check failed.");
            return null;
        }
        this.w++;
        ge6 ge6Var = this.d;
        if (ge6Var != null) {
            ipf d = ((je6) ge6Var.d).d();
            jl9 jl9Var = qzfVar.a;
            d.getClass();
            jl9Var.getClass();
            jl9 jl9Var2 = d.j.h;
            if (jl9Var.e != jl9Var2.e || !Intrinsics.c(jl9Var.d, jl9Var2.d)) {
                vp2.b(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.w != 1) {
                vp2.b(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        epf a = a(this, i2, null, qzfVar, 2097146);
        q7a q7aVar = (q7a) arrayList.get(i);
        d2g intercept = q7aVar.intercept(a);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + q7aVar + " returned null");
        }
        if (ge6Var == null || i2 >= arrayList.size() || a.w == 1) {
            return intercept;
        }
        vp2.b(q7aVar, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
