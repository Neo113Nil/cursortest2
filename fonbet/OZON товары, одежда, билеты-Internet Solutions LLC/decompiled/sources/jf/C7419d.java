package jf;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;
import org.jetbrains.annotations.NotNull;

/* renamed from: jf.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7419d extends AbstractC7947c {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f69980a;

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManagerExtensions f69981b;

    public C7419d(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f69980a = trustManager;
        this.f69981b = x509TrustManagerExtensions;
    }

    @Override // lf.AbstractC7947c
    @NotNull
    public final List a(@NotNull String hostname, @NotNull List chain) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f69981b.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e11) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException.initCause(e11);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7419d) && ((C7419d) obj).f69980a == this.f69980a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f69980a);
    }
}
