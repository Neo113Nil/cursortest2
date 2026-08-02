package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x3g implements X509TrustManager {
    public final /* synthetic */ int a;

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = this.a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = this.a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        switch (this.a) {
            case 0:
                return new X509Certificate[0];
            default:
                return null;
        }
    }

    private final void a(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void b(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void c(X509Certificate[] x509CertificateArr, String str) {
    }

    private final void d(X509Certificate[] x509CertificateArr, String str) {
    }
}
