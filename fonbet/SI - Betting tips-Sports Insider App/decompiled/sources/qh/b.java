package qh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements uh.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22185a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22186b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f22185a = trustManager;
        this.f22186b = findByIssuerAndSignatureMethod;
    }

    @Override // uh.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object invoke = this.f22186b.invoke(this.f22185a, cert);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f22185a, bVar.f22185a) && Intrinsics.areEqual(this.f22186b, bVar.f22186b);
    }

    public final int hashCode() {
        return this.f22186b.hashCode() + (this.f22185a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f22185a + ", findByIssuerAndSignatureMethod=" + this.f22186b + ')';
    }
}
