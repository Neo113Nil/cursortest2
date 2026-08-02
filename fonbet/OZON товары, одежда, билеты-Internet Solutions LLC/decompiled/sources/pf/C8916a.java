package pf;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002if.j;
import qf.C9052c;

/* renamed from: pf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8916a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X509KeyManager f80488a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final X509TrustManager f80489b;

    /* renamed from: pf.a$a, reason: collision with other inner class name */
    public static final class C1360a {

        /* renamed from: a, reason: collision with root package name */
        private C8917b f80490a;

        /* renamed from: b, reason: collision with root package name */
        private X509Certificate[] f80491b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f80492c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f80493d = new ArrayList();

        @NotNull
        public final void a() {
            j jVar;
            j.f66400c.getClass();
            jVar = j.f66398a;
            X509TrustManager o11 = jVar.o();
            ArrayList arrayList = this.f80492c;
            X509Certificate[] acceptedIssuers = o11.getAcceptedIssuers();
            Collections.addAll(arrayList, (X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }

        @NotNull
        public final void b(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            this.f80492c.add(certificate);
        }

        @NotNull
        public final C8916a c() {
            List B11 = Ye.b.B(this.f80493d);
            C8917b c8917b = this.f80490a;
            X509Certificate[] x509CertificateArr = this.f80491b;
            if (x509CertificateArr == null) {
                x509CertificateArr = new X509Certificate[0];
            }
            return new C8916a(C9052c.a(c8917b, (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)), C9052c.b(this.f80492c, B11));
        }

        @NotNull
        public final void d(@NotNull C8917b heldCertificate, @NotNull X509Certificate... intermediates) {
            Intrinsics.checkNotNullParameter(heldCertificate, "heldCertificate");
            Intrinsics.checkNotNullParameter(intermediates, "intermediates");
            this.f80490a = heldCertificate;
            this.f80491b = (X509Certificate[]) Arrays.copyOf(intermediates, intermediates.length);
        }
    }

    public C8916a(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager) {
        this.f80488a = x509KeyManager;
        this.f80489b = x509TrustManager;
    }

    @NotNull
    public final SSLSocketFactory a() {
        j jVar;
        j.f66400c.getClass();
        jVar = j.f66398a;
        SSLContext m11 = jVar.m();
        m11.init(new KeyManager[]{this.f80488a}, new TrustManager[]{this.f80489b}, new SecureRandom());
        SSLSocketFactory socketFactory = m11.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslContext().socketFactory");
        return socketFactory;
    }

    @NotNull
    public final X509TrustManager b() {
        return this.f80489b;
    }
}
