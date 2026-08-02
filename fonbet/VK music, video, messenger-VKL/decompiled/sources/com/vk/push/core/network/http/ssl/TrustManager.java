package com.vk.push.core.network.http.ssl;

import android.util.Base64;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import xsna.emb;
import xsna.xqm0;
import xsna.zcl;

/* compiled from: TrustManager.kt */
/* loaded from: classes5.dex */
public final class TrustManager implements X509TrustManager {
    public static final Companion Companion = new Companion(null);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public final Set<String> a;
    public final CrashReporterRepository b;
    public final Logger c;
    public final X509TrustManager d;

    /* compiled from: TrustManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static final /* synthetic */ String access$getRUSSIAN_ROOT_CA_PEM(Companion companion) {
            companion.getClass();
            return "-----BEGIN CERTIFICATE-----\nMIIFwjCCA6qgAwIBAgICEAAwDQYJKoZIhvcNAQELBQAwcDELMAkGA1UEBhMCUlUx\nPzA9BgNVBAoMNlRoZSBNaW5pc3RyeSBvZiBEaWdpdGFsIERldmVsb3BtZW50IGFu\nZCBDb21tdW5pY2F0aW9uczEgMB4GA1UEAwwXUnVzc2lhbiBUcnVzdGVkIFJvb3Qg\nQ0EwHhcNMjIwMzAxMjEwNDE1WhcNMzIwMjI3MjEwNDE1WjBwMQswCQYDVQQGEwJS\nVTE/MD0GA1UECgw2VGhlIE1pbmlzdHJ5IG9mIERpZ2l0YWwgRGV2ZWxvcG1lbnQg\nYW5kIENvbW11bmljYXRpb25zMSAwHgYDVQQDDBdSdXNzaWFuIFRydXN0ZWQgUm9v\ndCBDQTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAMfFOZ8pUAL3+r2n\nqqE0Zp52selXsKGFYoG0GM5bwz1bSFtCt+AZQMhkWQheI3poZAToYJu69pHLKS6Q\nXBiwBC1cvzYmUYKMYZC7jE5YhEU2bSL0mX7NaMxMDmH2/NwuOVRj8OImVa5s1F4U\nzn4Kv3PFlDBjjSjXKVY9kmjUBsXQrIHeaqmUIsPIlNWUnimXS0I0abExqkbdrXbX\nYwCOXhOO2pDUx3ckmJlCMUGacUTnylyQW2VsJIyIGA8V0xzdaeUXg0VZ6ZmNUr5Y\nBer/EAOLPb8NYpsAhJe2mXjMB/J9HNsoFMBFJ0lLOT/+dQvjbdRZoOT8eqJpWnVD\nU+QL/qEZnz57N88OWM3rabJkRNdU/Z7x5SFIM9FrqtN8xewsiBWBI0K6XFuOBOTD\n4V08o4TzJ8+Ccq5XlCUW2L48pZNCYuBDfBh7FxkB7qDgGDiaftEkZZfApRg2E+M9\nG8wkNKTPLDc4wH0FDTijhgxR3Y4PiS1HL2Zhw7bD3CbslmEGgfnnZojNkJtcLeBH\nBLa52/dSwNU4WWLubaYSiAmA9IUMX1/RpfpxOxd4Ykmhz97oFbUaDJFipIggx5sX\nePAlkTdWnv+RWBxlJwMQ25oEHmRguNYf4Zr/Rxr9cS93Y+mdXIZaBEE0KS2iLRqa\nOiWBki9IMQU4phqPOBAaG7A+eP8PAgMBAAGjZjBkMB0GA1UdDgQWBBTh0YHlzlpf\nBKrS6badZrHF+qwshzAfBgNVHSMEGDAWgBTh0YHlzlpfBKrS6badZrHF+qwshzAS\nBgNVHRMBAf8ECDAGAQH/AgEEMA4GA1UdDwEB/wQEAwIBhjANBgkqhkiG9w0BAQsF\nAAOCAgEAALIY1wkilt/urfEVM5vKzr6utOeDWCUczmWX/RX4ljpRdgF+5fAIS4vH\ntmXkqpSCOVeWUrJV9QvZn6L227ZwuE15cWi8DCDal3Ue90WgAJJZMfTshN4OI8cq\nW9E4EG9wglbEtMnObHlms8F3CHmrw3k6KmUkWGoa+/ENmcVl68u/cMRl1JbW2bM+\n/3A+SAg2c6iPDlehczKx2oa95QW0SkPPWGuNA/CE8CpyANIhu9XFrj3RQ3EqeRcS\nAQQod1RNuHpfETLU/A2gMmvn/w/sx7TB3W5BPs6rprOA37tutPq9u6FTZOcG1Oqj\nC/B7yTqgI7rbyvox7DEXoX7rIiEqyNNUguTk/u3SZ4VXE2kmxdmSh3TQvybfbnXV\n4JbCZVaqiZraqc7oZMnRoWrXRG3ztbnbes/9qhRGI7PqXqeKJBztxRTEVj8ONs1d\nWN5szTwaPIvhkhO3CO5ErU2rVdUr89wKpNXbBODFKRtgxUT70YpmJ46VVaqdAhOZ\nD9EUUn4YaeLaS8AjSF/h7UkjOibNc4qVDiPP+rkehFWM66PVnP1Msh93tc+taIfC\nEYVMxjh8zNbFuoc7fzvvrFILLe7ifvEIUqSVIC/AzplM/Jxw7buXFeGP1qVCBEHq\n391d/9RAfaZ12zkwFsl+IKwE/OZxW8AHa9i1p4GO0YSNuczzEm4=\n-----END CERTIFICATE-----";
        }

        public Companion() {
        }
    }

    public TrustManager(Set<String> set, CrashReporterRepository crashReporterRepository, Logger logger) {
        this.a = set;
        this.b = crashReporterRepository;
        Logger createLogger = logger.createLogger("TrustManager");
        this.c = createLogger;
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        try {
            for (X509Certificate x509Certificate : c().getAcceptedIssuers()) {
                keyStore.setCertificateEntry(x509Certificate.getSubjectDN().toString(), x509Certificate);
            }
            keyStore.setCertificateEntry("russian-root-ca", (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(Companion.access$getRUSSIAN_ROOT_CA_PEM(Companion).getBytes(emb.b))));
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            this.d = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        } catch (KeyStoreException e2) {
            createLogger.error("Failed to add platform trusted certificates", e2);
            throw new IOException("Failed to add platform trusted certificates", e2);
        } catch (CertificateException e3) {
            createLogger.error("Failed to add platform trusted certificates", e3);
            throw new IOException("Failed to add platform trusted certificates", e3);
        }
    }

    public static String b(X509Certificate x509Certificate) {
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        if (encoded != null) {
            return xqm0.g(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(encoded), 0));
        }
        throw new CertificateException("Failed to encode public key for certificate: " + x509Certificate.getSubjectDN());
    }

    public final void a(X509Certificate[] x509CertificateArr) throws CertificateException {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            if (this.a.contains(b(x509Certificate))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failed.\nCertificate chain pins: ");
        for (X509Certificate x509Certificate2 : x509CertificateArr) {
            sb.append(X3.j.d + b(x509Certificate2) + " (" + x509Certificate2.getSubjectDN() + ")] ");
        }
        this.c.error(sb.toString(), null);
        throw new CertificateException("Certificate pinning failed. None of the provided certificates match expected pins.");
    }

    public final X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 0) {
                javax.net.ssl.TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalArgumentException("No X509TrustManager found in system trust managers");
        } catch (Exception e2) {
            this.c.error("Failed to create system trust manager", e2);
            throw new IOException("Failed to create system trust manager", e2);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.d.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            a(x509CertificateArr);
        } catch (CertificateException e2) {
            if (e.compareAndSet(false, true)) {
                this.b.nonFatalReport(e2, IssueKey.SSL_PINNING_FAILED);
            }
            try {
                this.d.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException e3) {
                this.c.error("System CA verification failed", e3);
                throw e3;
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.d.getAcceptedIssuers();
    }
}
