package gh;

import androidx.appcompat.widget.c1;
import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o f10107a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f10108b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f10109c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f10110d;

    /* renamed from: e, reason: collision with root package name */
    public final h f10111e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10112f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f10113g;

    /* renamed from: h, reason: collision with root package name */
    public final y f10114h;

    /* renamed from: i, reason: collision with root package name */
    public final List f10115i;
    public final List j;

    public a(String host, int i5, o dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, o proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f10107a = dns;
        this.f10108b = socketFactory;
        this.f10109c = sSLSocketFactory;
        this.f10110d = hostnameVerifier;
        this.f10111e = hVar;
        this.f10112f = proxyAuthenticator;
        this.f10113g = proxySelector;
        x xVar = new x();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            xVar.f10321a = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            xVar.f10321a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String b10 = hh.d.b(vh.a.d(host, 0, 0, 7));
        if (b10 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        xVar.f10324d = b10;
        if (1 > i5 || i5 >= 65536) {
            throw new IllegalArgumentException(c1.i(i5, "unexpected port: ").toString());
        }
        xVar.f10325e = i5;
        this.f10114h = xVar.a();
        this.f10115i = hh.g.j(protocols);
        this.j = hh.g.j(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f10107a, that.f10107a) && Intrinsics.areEqual(this.f10112f, that.f10112f) && Intrinsics.areEqual(this.f10115i, that.f10115i) && Intrinsics.areEqual(this.j, that.j) && Intrinsics.areEqual(this.f10113g, that.f10113g) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f10109c, that.f10109c) && Intrinsics.areEqual(this.f10110d, that.f10110d) && Intrinsics.areEqual(this.f10111e, that.f10111e) && this.f10114h.f10333e == that.f10114h.f10333e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f10114h, aVar.f10114h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f10111e) + ((Objects.hashCode(this.f10110d) + ((Objects.hashCode(this.f10109c) + ((this.f10113g.hashCode() + ((this.j.hashCode() + ((this.f10115i.hashCode() + ((this.f10112f.hashCode() + ((this.f10107a.hashCode() + r4.k.j(527, 31, this.f10114h.f10337i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        y yVar = this.f10114h;
        sb2.append(yVar.f10332d);
        sb2.append(':');
        sb2.append(yVar.f10333e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f10113g);
        sb2.append('}');
        return sb2.toString();
    }
}
