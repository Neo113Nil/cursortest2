package io.seon.androidsdk.service;

import android.security.keystore.KeyGenParameterSpec;
import b.C2287O;
import b.C2317n;
import e3.AbstractC4170a;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/* renamed from: io.seon.androidsdk.service.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4998p {
    public static b.F0 a(byte[] bArr) {
        C2287O c2287o = new C2287O(bArr);
        try {
            C2287O c2287o2 = new C2287O(((C2317n) c2287o.r()).f24131a);
            try {
                b.F0 f02 = (b.F0) c2287o2.r();
                c2287o2.close();
                c2287o.close();
                return f02;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                c2287o.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static AttestationGenerator$RootCertIssuer b(List list) {
        String str;
        X509Certificate x509Certificate = (X509Certificate) list.get(list.size() - 1);
        int size = list.size() - 1;
        while (size >= 0) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(size);
            x509Certificate2.checkValidity();
            x509Certificate2.verify(x509Certificate.getPublicKey());
            size--;
            x509Certificate = x509Certificate2;
        }
        byte[] a10 = AbstractC4170a.a("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAr7bHgiuxpwHsK7Qui8xUFmOr75gvMsd/dTEDDJdSSxtf6An7xyqpRR90PL2abxM1dEqlXnf2tqw1Ne4Xwl5jlRfdnJLmN0pTy/4lj4/7tv0Sk3iiKkypnEUtR6WfMgH0QZfKHM1+di+y9TFRtv6y//0rb+T+W8a9nsNL/ggjnar86461qO0rOs2cXjp3kOG1FEJ5MVmFmBGtnrKpa73XpXyTqRxB/M0n1n/W9nGqC4FSYa04T6N5RIZGBN2z2MT5IKGbFlbC8UrW0DxW7AYImQQcHtGl/m00QLVWutHQoVJYnFPlXTcHYvASLu+RhhsbDmxMgJJ0mcDpvsC4PjvB+TxywElgS70vE0XmLD+OJtvsBslHZvPBKCOdT0MS+tgSOIfga+z1Z1g7+DVagf7quvmag8jfPioyKvxnK/EgsTUVi2ghzq8wm27ud/mIM7AY2qEORR8Go3TVB4HzWQgpZrt3i5MIlCaY504LzSRiigHCzAPlHws+W0rB5N+er5/2pJKnfBSDiCiFAVtCLOZ7gLiMm0jhO2B6tUXHI/+MRPjy02i59lINMRRev56GKtcd9qO/0kUJWdZTdA2XoS82ixPvZtXQpUpuL12ab+9EaDK8Z4RHJYYfCT3Q5vNAXaiWQ+8PTWm2QgBR/bkwSWc+NpUFgNPN9PvQi8WEg5UmAGMCAwEAAQ==");
        byte[] a11 = AbstractC4170a.a("MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAEI9ojcU7fPlsFCjxy6IRqzgeOoK0b+YsV9FPQywiyw8EQRTkJ9u3qwfnI4DGoSLlBqClTXJfgfCcZvs60FikNMHnu4fkRzObfgDkU2KNXezT9/RQ+XvNslxPHrHCowhGr");
        byte[] a12 = AbstractC4170a.a("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE7l1ex+HA220Dpn7mthvsTWpdamguD/9/SQ59dx9EIm29sa/6FsvHrcV30lacqrewLVQBXT5DKyqO107sSHVBpA==");
        byte[] a13 = AbstractC4170a.a("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEgyDuy2d0i9oygI9czIibKoJiU0RDEvCfxItNTQAjbynZ6bC1ygeeiX/Ymn9XY3jYR5iu2IGjkr8ZtRJ3wrhZ5A==");
        byte[] encoded = ((X509Certificate) list.get(list.size() - 1)).getPublicKey().getEncoded();
        if (Arrays.equals(a10, encoded) || Arrays.equals(a11, encoded)) {
            return AttestationGenerator$RootCertIssuer.GOOGLE_HW;
        }
        if (Arrays.equals(a12, encoded)) {
            return AttestationGenerator$RootCertIssuer.AOSP_SW;
        }
        if (Arrays.equals(a13, encoded)) {
            return AttestationGenerator$RootCertIssuer.HUAWEI_HW;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pub key hash: ");
            try {
                byte[] b10 = AbstractC4170a.b(((X509Certificate) list.get(list.size() - 1)).getPublicKey().getEncoded());
                Charset charset = StandardCharsets.UTF_8;
                str = String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(new String(b10, charset).getBytes(charset))));
            } catch (Exception unused) {
                str = "";
            }
            sb2.append(str);
            V.j("unknown-key", new Exception(sb2.toString()));
        } catch (Exception unused2) {
        }
        return AttestationGenerator$RootCertIssuer.UNKNOWN;
    }

    public static M6 c() {
        AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer;
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            X509Certificate[] d10 = d();
            ArrayList arrayList2 = new ArrayList();
            try {
                attestationGenerator$RootCertIssuer = b(Arrays.asList(d10));
            } catch (Exception e10) {
                AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer2 = AttestationGenerator$RootCertIssuer.INVALID_CHAIN;
                arrayList2.add(String.format("CERT_ERR: %s - %s", e10.getClass(), e10.getMessage()));
                attestationGenerator$RootCertIssuer = attestationGenerator$RootCertIssuer2;
            }
            boolean z10 = false;
            M6 m62 = null;
            C2317n c2317n = null;
            for (int length = d10.length - 1; length >= 0; length--) {
                X509Certificate x509Certificate = d10[length];
                arrayList.add(x509Certificate.getSerialNumber().toString(16));
                if (!z10) {
                    byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
                    if (extensionValue != null) {
                        m62 = new M6(a(extensionValue), attestationGenerator$RootCertIssuer, c2317n);
                        m62.f53071k.addAll(arrayList2);
                        z10 = true;
                    } else {
                        byte[] extensionValue2 = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.30");
                        if (extensionValue2 != null) {
                            try {
                                C2287O c2287o = new C2287O(extensionValue2);
                                try {
                                    C2317n c2317n2 = (C2317n) c2287o.r();
                                    c2287o.close();
                                    c2317n = c2317n2;
                                } catch (Throwable th2) {
                                    try {
                                        c2287o.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (Exception unused) {
                                c2317n = null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (m62 == null) {
                return new M6("EXTENSION_NOT_FOUND");
            }
            m62.f53069i = arrayList;
            try {
                byte[] b10 = AbstractC4170a.b(d10[d10.length - 1].getPublicKey().getEncoded());
                Charset charset = StandardCharsets.UTF_8;
                str = String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(new String(b10, charset).getBytes(charset))));
            } catch (Exception unused2) {
                str = "";
            }
            m62.f53070j = str;
            return m62;
        } catch (Exception e11) {
            return new M6(String.format("ERR: %s - %s", e11.getClass(), e11.getMessage()));
        }
    }

    public static X509Certificate[] d() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        Date date = new Date();
        Date date2 = new Date(date.getTime() + 1000000);
        KeyGenParameterSpec.Builder attestationChallenge = new KeyGenParameterSpec.Builder("cert0", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(new Date(date.getTime() + 999000000)).setAttestationChallenge(UUID.randomUUID().toString().getBytes());
        attestationChallenge.setDigests("NONE", "SHA-256");
        keyPairGenerator.initialize(attestationChallenge.build());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                newSingleThreadExecutor.shutdownNow();
                Certificate[] certificateChain = keyStore.getCertificateChain("cert0");
                int length = certificateChain.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i10 = 0; i10 < length; i10++) {
                    x509CertificateArr[i10] = (X509Certificate) certificateChain[i10];
                }
                return x509CertificateArr;
            } catch (TimeoutException unused) {
                throw new TimeoutException("KEYGEN_TIMED_OUT");
            }
        } catch (Throwable th2) {
            newSingleThreadExecutor.shutdownNow();
            throw th2;
        }
    }
}
