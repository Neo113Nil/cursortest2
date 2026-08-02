package gc;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f9928a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f9929b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManager f9930c;

    public b(X509TrustManager x509TrustManager, X509TrustManager x509TrustManager2, X509TrustManager customTrustManager) {
        Intrinsics.checkNotNullParameter(customTrustManager, "customTrustManager");
        this.f9928a = x509TrustManager;
        this.f9929b = x509TrustManager2;
        this.f9930c = customTrustManager;
    }

    public static void a(String str, String str2, X509Certificate[] x509CertificateArr, Exception exc) {
        String str3;
        Exception exc2;
        String str4;
        StringBuilder sb2;
        String str5;
        X509Certificate[] x509CertificateArr2 = x509CertificateArr;
        try {
            sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder("SSL Validation failed for ");
            str3 = str;
            try {
                sb3.append(str3);
                sb3.append("\n\n");
                sb2.append(sb3.toString());
            } catch (Exception unused) {
                exc2 = exc;
                str4 = str3;
                zc.d.b(4, str2, new CertificateException(str4, exc2));
            }
        } catch (Exception unused2) {
            str3 = str;
        }
        if (x509CertificateArr2 != null && x509CertificateArr2.length != 0) {
            int length = x509CertificateArr2.length;
            int i5 = 0;
            int i10 = 0;
            while (i5 < length) {
                X509Certificate x509Certificate = x509CertificateArr2[i5];
                int i11 = i10 + 1;
                String name = x509Certificate.getSubjectX500Principal().getName();
                String name2 = x509Certificate.getIssuerX500Principal().getName();
                Date notBefore = x509Certificate.getNotBefore();
                Date notAfter = x509Certificate.getNotAfter();
                try {
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded());
                    Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                    str5 = p.u(digest, StringUtils.PROCESS_POSTFIX_DELIMITER, new f1.a(19), 30);
                } catch (CertificateEncodingException e7) {
                    str5 = "SHA-256 error: " + e7.getMessage();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append('[');
                sb4.append(i10);
                sb4.append(']');
                sb2.append(sb4.toString());
                sb2.append('\n');
                sb2.append("  Subject: " + name);
                sb2.append('\n');
                sb2.append("  Issuer: " + name2);
                sb2.append('\n');
                sb2.append("  Valid: " + notBefore + " .. " + notAfter);
                sb2.append('\n');
                StringBuilder sb5 = new StringBuilder();
                sb5.append("  SHA-256: ");
                sb5.append(str5);
                sb2.append(sb5.toString());
                sb2.append('\n');
                sb2.append('\n');
                i5++;
                x509CertificateArr2 = x509CertificateArr;
                i10 = i11;
            }
            str4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
            exc2 = exc;
            zc.d.b(4, str2, new CertificateException(str4, exc2));
        }
        sb2.append("No certificates in chain");
        str4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
        exc2 = exc;
        zc.d.b(4, str2, new CertificateException(str4, exc2));
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.f9930c;
        X509TrustManager x509TrustManager2 = this.f9929b;
        X509TrustManager x509TrustManager3 = this.f9928a;
        if (x509TrustManager3 == null && x509TrustManager2 == null) {
            try {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e7) {
                a("client", "checkClientTrusted", x509CertificateArr, e7);
                return;
            }
        }
        if (x509TrustManager3 != null && x509TrustManager2 == null) {
            try {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e9) {
                try {
                    x509TrustManager3.checkClientTrusted(x509CertificateArr, str);
                    return;
                } catch (Exception unused) {
                    a("client", "checkClientTrusted", x509CertificateArr, e9);
                    return;
                }
            }
        }
        if (x509TrustManager3 == null && x509TrustManager2 != null) {
            try {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e10) {
                try {
                    x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
                    return;
                } catch (Exception unused2) {
                    a("client", "checkClientTrusted", x509CertificateArr, e10);
                    return;
                }
            }
        }
        try {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        } catch (Exception e11) {
            try {
                try {
                    Intrinsics.checkNotNull(x509TrustManager3);
                    x509TrustManager3.checkClientTrusted(x509CertificateArr, str);
                } catch (Exception unused3) {
                    a("client", "checkClientTrusted", x509CertificateArr, e11);
                }
            } catch (Exception unused4) {
                Intrinsics.checkNotNull(x509TrustManager2);
                x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.f9930c;
        X509TrustManager x509TrustManager2 = this.f9929b;
        X509TrustManager x509TrustManager3 = this.f9928a;
        if (x509TrustManager3 == null && x509TrustManager2 == null) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e7) {
                a("server", "checkServerTrusted", x509CertificateArr, e7);
                return;
            }
        }
        if (x509TrustManager3 != null && x509TrustManager2 == null) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e9) {
                try {
                    x509TrustManager3.checkServerTrusted(x509CertificateArr, str);
                    return;
                } catch (Exception unused) {
                    a("server", "checkServerTrusted", x509CertificateArr, e9);
                    return;
                }
            }
        }
        if (x509TrustManager3 == null && x509TrustManager2 != null) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (Exception e10) {
                try {
                    x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    return;
                } catch (Exception unused2) {
                    a("server", "checkServerTrusted", x509CertificateArr, e10);
                    return;
                }
            }
        }
        try {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        } catch (Exception e11) {
            try {
                try {
                    Intrinsics.checkNotNull(x509TrustManager3);
                    x509TrustManager3.checkServerTrusted(x509CertificateArr, str);
                } catch (Exception unused3) {
                    a("server", "checkServerTrusted", x509CertificateArr, e11);
                }
            } catch (Exception unused4) {
                Intrinsics.checkNotNull(x509TrustManager2);
                x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509TrustManager x509TrustManager = this.f9930c;
        X509TrustManager x509TrustManager2 = this.f9929b;
        X509TrustManager x509TrustManager3 = this.f9928a;
        if (x509TrustManager3 == null && x509TrustManager2 == null) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
            return acceptedIssuers;
        }
        if (x509TrustManager3 != null && x509TrustManager2 != null) {
            X509Certificate[] acceptedIssuers2 = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers2, "getAcceptedIssuers(...)");
            X509Certificate[] acceptedIssuers3 = x509TrustManager3.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers3, "getAcceptedIssuers(...)");
            Object[] m6 = o.m(acceptedIssuers2, acceptedIssuers3);
            X509Certificate[] acceptedIssuers4 = x509TrustManager2.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers4, "getAcceptedIssuers(...)");
            return (X509Certificate[]) o.m(m6, acceptedIssuers4);
        }
        if (x509TrustManager3 != null) {
            X509Certificate[] acceptedIssuers5 = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers5, "getAcceptedIssuers(...)");
            X509Certificate[] acceptedIssuers6 = x509TrustManager3.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers6, "getAcceptedIssuers(...)");
            return (X509Certificate[]) o.m(acceptedIssuers5, acceptedIssuers6);
        }
        if (x509TrustManager2 == null) {
            X509Certificate[] acceptedIssuers7 = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNull(acceptedIssuers7);
            return acceptedIssuers7;
        }
        X509Certificate[] acceptedIssuers8 = x509TrustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers8, "getAcceptedIssuers(...)");
        X509Certificate[] acceptedIssuers9 = x509TrustManager2.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers9, "getAcceptedIssuers(...)");
        return (X509Certificate[]) o.m(acceptedIssuers8, acceptedIssuers9);
    }
}
