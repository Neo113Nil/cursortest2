package com.asterinet.react.tcpsocket;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
final class SSLCertificateHelper {
    SSLCertificateHelper() {
    }

    static SSLSocketFactory createBlindSocketFactory() throws GeneralSecurityException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{new BlindTrustManager()}, null);
        return sSLContext.getSocketFactory();
    }

    static SSLServerSocketFactory createServerSocketFactory(Context context, String str) throws GeneralSecurityException, IOException {
        char[] charArray = "".toCharArray();
        InputStream rawResourceStream = getRawResourceStream(context, str);
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(rawResourceStream, charArray);
        rawResourceStream.close();
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("X509");
        keyManagerFactory.init(keyStore, charArray);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(keyManagerFactory.getKeyManagers(), new TrustManager[]{new BlindTrustManager()}, null);
        return sSLContext.getServerSocketFactory();
    }

    static SSLSocketFactory createCustomTrustedSocketFactory(Context context, String str) throws IOException, GeneralSecurityException {
        InputStream rawResourceStream = getRawResourceStream(context, str);
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(rawResourceStream);
        rawResourceStream.close();
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setCertificateEntry("ca", generateCertificate);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    private static InputStream getRawResourceStream(Context context, String str) throws IOException {
        int resourceId = getResourceId(context, str);
        if (resourceId == 0) {
            return URI.create(str).toURL().openStream();
        }
        return context.getResources().openRawResource(resourceId);
    }

    private static int getResourceId(Context context, String str) {
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            return context.getResources().getIdentifier(replace, "raw", context.getPackageName());
        }
    }

    private static class BlindTrustManager implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        private BlindTrustManager() {
        }
    }
}
