package com.nimbusds.jose.util;

import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.UUID;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes8.dex */
public class X509CertUtils {
    public static final String PEM_BEGIN_MARKER = "-----BEGIN CERTIFICATE-----";
    public static final String PEM_END_MARKER = "-----END CERTIFICATE-----";
    private static Provider jcaProvider;

    public static Provider getProvider() {
        return jcaProvider;
    }

    public static void setProvider(Provider provider) {
        jcaProvider = provider;
    }

    public static X509Certificate parse(byte[] bArr) {
        try {
            return parseWithException(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate parseWithException(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = jcaProvider;
        if (provider != null) {
            certificateFactory = CertificateFactory.getInstance("X.509", provider);
        } else {
            certificateFactory = CertificateFactory.getInstance("X.509");
        }
        Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        if (!(generateCertificate instanceof X509Certificate)) {
            throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
        }
        return (X509Certificate) generateCertificate;
    }

    public static X509Certificate parse(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf(PEM_BEGIN_MARKER)) < 0 || (indexOf2 = (substring = str.substring(indexOf + 27)).indexOf(PEM_END_MARKER)) < 0) {
            return null;
        }
        return parse(new Base64(substring.substring(0, indexOf2).replaceAll("\\s", "")).decode());
    }

    public static X509Certificate parseWithException(String str) throws CertificateException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int indexOf = str.indexOf(PEM_BEGIN_MARKER);
        if (indexOf < 0) {
            throw new CertificateException("PEM begin marker not found");
        }
        String substring = str.substring(indexOf + 27);
        int indexOf2 = substring.indexOf(PEM_END_MARKER);
        if (indexOf2 < 0) {
            throw new CertificateException("PEM end marker not found");
        }
        return parseWithException(new Base64(substring.substring(0, indexOf2).replaceAll("\\s", "")).decode());
    }

    public static String toPEMString(X509Certificate x509Certificate) {
        return toPEMString(x509Certificate, true);
    }

    public static String toPEMString(X509Certificate x509Certificate, boolean z) {
        StringBuilder sb = new StringBuilder(PEM_BEGIN_MARKER);
        if (z) {
            sb.append('\n');
        }
        try {
            sb.append(Base64.encode(x509Certificate.getEncoded()));
            if (z) {
                sb.append('\n');
            }
            sb.append(PEM_END_MARKER);
            return sb.toString();
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    public static Base64URL computeSHA256Thumbprint(X509Certificate x509Certificate) {
        try {
            return Base64URL.encode(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            return null;
        }
    }

    public static UUID store(KeyStore keyStore, PrivateKey privateKey, char[] cArr, X509Certificate x509Certificate) throws KeyStoreException {
        UUID randomUUID = UUID.randomUUID();
        keyStore.setKeyEntry(randomUUID.toString(), privateKey, cArr, new Certificate[]{x509Certificate});
        return randomUUID;
    }
}
