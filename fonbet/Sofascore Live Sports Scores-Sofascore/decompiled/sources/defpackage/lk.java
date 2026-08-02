package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lk {
    public final tnf a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final xm2 e;
    public final qp0 f;
    public final ProxySelector g;
    public final jl9 h;
    public final List i;
    public final List j;

    public lk(String str, int i, tnf tnfVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, xm2 xm2Var, qp0 qp0Var, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        tnfVar.getClass();
        socketFactory.getClass();
        qp0Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = tnfVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = xm2Var;
        this.f = qp0Var;
        this.g = proxySelector;
        il9 il9Var = new il9(0);
        il9Var.i(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http");
        il9Var.f(str);
        if (1 > i || i >= 65536) {
            ogj.h(ljg.j(i, "unexpected port: "));
            throw null;
        }
        il9Var.b = i;
        this.h = il9Var.c();
        this.i = yol.j(list);
        this.j = yol.j(list2);
    }

    public final boolean a(lk lkVar) {
        return Intrinsics.c(this.a, lkVar.a) && Intrinsics.c(this.f, lkVar.f) && Intrinsics.c(this.i, lkVar.i) && Intrinsics.c(this.j, lkVar.j) && Intrinsics.c(this.g, lkVar.g) && Intrinsics.c(this.c, lkVar.c) && Intrinsics.c(this.d, lkVar.d) && Intrinsics.c(this.e, lkVar.e) && this.h.e == lkVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        return this.h.equals(lkVar.h) && a(lkVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + dmi.d(dmi.d((this.f.hashCode() + ((this.a.hashCode() + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        jl9 jl9Var = this.h;
        sb.append(jl9Var.d);
        sb.append(':');
        sb.append(jl9Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
