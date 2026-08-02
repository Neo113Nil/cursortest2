package ug;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class b {
    @NotNull
    public static final X509TrustManager a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNullExpressionValue(trustManagers, "getInstance(KeyManagerFa… }\n        .trustManagers");
        Object C11 = C7705l.C(trustManagers);
        Intrinsics.g(C11, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        X509TrustManager x509TrustManager = (X509TrustManager) C11;
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(R.raw.rootca_ssl_rsa2022);
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(openRawResource);
            Vd0.b.a(openRawResource, null);
            Intrinsics.g(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String resourceEntryName = resources.getResourceEntryName(R.raw.rootca_ssl_rsa2022);
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) generateCertificate);
            Intrinsics.checkNotNullExpressionValue(keyStore, "getInstance(KeyStore.get…certName, cert)\n        }");
            TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            trustManagerFactory2.init(keyStore);
            TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers2, "getInstance(KeyManagerFa… }\n        .trustManagers");
            Object C12 = C7705l.C(trustManagers2);
            Intrinsics.g(C12, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return new C10057a(new X509TrustManager[]{x509TrustManager, (X509TrustManager) C12});
        } finally {
        }
    }
}
