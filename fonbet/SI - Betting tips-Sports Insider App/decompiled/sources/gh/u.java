package gh;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f10315a;

    /* renamed from: b, reason: collision with root package name */
    public final j f10316b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10317c;

    /* renamed from: d, reason: collision with root package name */
    public final gf.t f10318d;

    public u(t0 tlsVersion, j cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f10315a = tlsVersion;
        this.f10316b = cipherSuite;
        this.f10317c = localCertificates;
        this.f10318d = gf.k.b(new t(0, peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f10318d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.f10315a == this.f10315a && Intrinsics.areEqual(uVar.f10316b, this.f10316b) && Intrinsics.areEqual(uVar.a(), a()) && Intrinsics.areEqual(uVar.f10317c, this.f10317c);
    }

    public final int hashCode() {
        return this.f10317c.hashCode() + ((a().hashCode() + ((this.f10316b.hashCode() + ((this.f10315a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a7 = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(a7, 10));
        for (Certificate certificate : a7) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f10315a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f10316b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f10317c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
