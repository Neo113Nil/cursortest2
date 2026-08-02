package gc;

import com.google.android.gms.internal.measurement.y3;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {
    public static final c a(a aVar) {
        aVar.getClass();
        return (c) y3.m(c.class, null, 6);
    }

    public static final Certificate b(a aVar, Certificate certificate) {
        aVar.getClass();
        try {
            X509Certificate x509Certificate = certificate instanceof X509Certificate ? (X509Certificate) certificate : null;
            if (x509Certificate != null) {
                x509Certificate.checkValidity();
                if (x509Certificate.getBasicConstraints() >= 0) {
                    return certificate;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final X509TrustManager c(a aVar, String str, String str2) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(str);
            KeyStore keyStore = KeyStore.getInstance(str2);
            keyStore.load(null, null);
            trustManagerFactory.init(keyStore);
            TrustManager trustManager = trustManagerFactory.getTrustManagers()[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
            return null;
        } catch (Exception e7) {
            zc.d.b(4, str2, e7);
            return null;
        }
    }
}
