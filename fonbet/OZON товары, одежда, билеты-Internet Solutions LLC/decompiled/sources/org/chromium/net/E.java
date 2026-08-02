package org.chromium.net;

import Ve.C4598rp;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import internal.J.N;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private static CertificateFactory f78603a;

    /* renamed from: b, reason: collision with root package name */
    private static X509TrustManagerExtensions f78604b;

    /* renamed from: c, reason: collision with root package name */
    private static a f78605c;

    /* renamed from: d, reason: collision with root package name */
    private static X509TrustManagerExtensions f78606d;

    /* renamed from: e, reason: collision with root package name */
    private static KeyStore f78607e;

    /* renamed from: f, reason: collision with root package name */
    private static KeyStore f78608f;

    /* renamed from: g, reason: collision with root package name */
    private static File f78609g;

    /* renamed from: h, reason: collision with root package name */
    private static HashSet f78610h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f78611i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f78612j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f78613k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static final class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                    N.MJdorYDE();
                    return;
                } else {
                    if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                        return;
                    }
                    N.MJdorYDE();
                    return;
                }
            }
            try {
                E.a();
            } catch (KeyStoreException e11) {
                org.chromium.base.j.b("X509Util", "Unable to reload the default TrustManager", e11);
            } catch (NoSuchAlgorithmException e12) {
                org.chromium.base.j.b("X509Util", "Unable to reload the default TrustManager", e12);
            } catch (CertificateException e13) {
                org.chromium.base.j.b("X509Util", "Unable to reload the default TrustManager", e13);
            }
        }
    }

    static void a() {
        synchronized (f78612j) {
            f78604b = null;
            f78610h = null;
            f();
        }
        N.M6C2IQIc();
    }

    public static void b(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        Object obj = f78612j;
        synchronized (obj) {
            f();
        }
        X509Certificate x509Certificate = (X509Certificate) f78603a.generateCertificate(new ByteArrayInputStream(bArr));
        synchronized (obj) {
            g();
            KeyStore keyStore = f78607e;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(keyStore.size()), x509Certificate);
            g();
            f78606d = e(f78607e);
        }
    }

    private static List<X509Certificate> c(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2, byte[] bArr, byte[] bArr2) throws CertificateException {
        try {
            return (Build.VERSION.SDK_INT < 36 || (bArr == null && bArr2 == null)) ? x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2) : x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, bArr, bArr2, str, str2);
        } catch (RuntimeException e11) {
            org.chromium.base.j.b("X509Util", "checkServerTrusted() unexpectedly threw: %s", e11);
            throw new CertificateException(e11);
        }
    }

    public static void d() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        synchronized (f78612j) {
            g();
            try {
                f78607e.load(null);
                g();
                f78606d = e(f78607e);
            } catch (IOException unused) {
            }
        }
    }

    private static X509TrustManagerExtensions e(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e11) {
                        org.chromium.base.j.a("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + String.valueOf(e11));
                    }
                }
            }
            org.chromium.base.j.a("X509Util", "Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e12) {
            org.chromium.base.j.b("X509Util", "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e12);
            throw new KeyStoreException(e12);
        }
    }

    private static void f() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (f78603a == null) {
            f78603a = CertificateFactory.getInstance("X.509");
        }
        if (f78604b == null) {
            f78604b = e(null);
        }
        if (!f78611i) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                f78608f = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                f78609g = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            f78611i = true;
        }
        if (f78610h == null) {
            f78610h = new HashSet();
        }
        if (f78605c == null) {
            f78605c = new a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
            intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
            intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            org.chromium.base.e.d(org.chromium.base.e.b(), f78605c, intentFilter);
        }
    }

    private static void g() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (f78607e == null) {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            f78607e = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
        }
        if (f78606d == null) {
            f78606d = e(f78607e);
        }
    }

    public static byte[][] h() {
        ArrayList arrayList = new ArrayList();
        Object obj = f78612j;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    f();
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                return new byte[0][];
            }
        }
        KeyStore keyStore = f78608f;
        if (keyStore == null) {
            return new byte[0][];
        }
        try {
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith("user:")) {
                    try {
                        Certificate certificate = f78608f.getCertificate(nextElement);
                        if (certificate instanceof X509Certificate) {
                            arrayList.add(((X509Certificate) certificate).getEncoded());
                        } else {
                            Log.w(org.chromium.base.j.c("X509Util"), "alias: " + nextElement + " is not a X509 Cert, skipping");
                        }
                    } catch (KeyStoreException e11) {
                        Log.e(org.chromium.base.j.c("X509Util"), String.format(Locale.US, "Error reading cert with alias %s, error: %s", nextElement), e11);
                    } catch (CertificateEncodingException e12) {
                        Log.e(org.chromium.base.j.c("X509Util"), String.format(Locale.US, "Error encoding cert with alias %s, error: %s", nextElement), e12);
                    }
                }
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (KeyStoreException e13) {
            org.chromium.base.j.b("X509Util", "Error reading cert aliases: %s", e13);
            return new byte[0][];
        }
    }

    private static boolean i(X509Certificate x509Certificate) throws NoSuchAlgorithmException, KeyStoreException {
        if (f78608f != null) {
            Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
            if (f78610h.contains(pair)) {
                return true;
            }
            byte[] digest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
            char[] cArr = new char[8];
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = i11 * 2;
                char[] cArr2 = f78613k;
                byte b11 = digest[3 - i11];
                cArr[i12] = cArr2[(b11 >> 4) & 15];
                cArr[i12 + 1] = cArr2[b11 & 15];
            }
            String str = new String(cArr);
            int i13 = 0;
            while (true) {
                String c11 = C4598rp.c(i13, str, ".");
                if (!new File(f78609g, c11).exists()) {
                    break;
                }
                Certificate certificate = f78608f.getCertificate("system:" + c11);
                if (certificate != null) {
                    if (certificate instanceof X509Certificate) {
                        X509Certificate x509Certificate2 = (X509Certificate) certificate;
                        if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                            f78610h.add(pair);
                            return true;
                        }
                    } else {
                        org.chromium.base.j.a("X509Util", "Anchor " + c11 + " not an X509Certificate: " + certificate.getClass().getName());
                    }
                }
                i13++;
            }
        }
        return false;
    }

    static boolean j(X509Certificate x509Certificate) throws CertificateException {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00da A[Catch: all -> 0x0093, TryCatch #2 {, blocks: (B:53:0x0088, B:55:0x008c, B:56:0x0091, B:60:0x009a, B:61:0x00d4, B:63:0x00da, B:64:0x00e9, B:65:0x00ee, B:70:0x00a1, B:79:0x00a5, B:74:0x00ad, B:75:0x00d1), top: B:52:0x0088, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ad A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #2 {, blocks: (B:53:0x0088, B:55:0x008c, B:56:0x0091, B:60:0x009a, B:61:0x00d4, B:63:0x00da, B:64:0x00e9, B:65:0x00ee, B:70:0x00a1, B:79:0x00a5, B:74:0x00ad, B:75:0x00d1), top: B:52:0x0088, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AndroidCertVerifyResult k(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) throws KeyStoreException, NoSuchAlgorithmException {
        List<X509Certificate> c11;
        List<X509Certificate> list;
        if (bArr != null && bArr.length != 0) {
            if (bArr[0] != null) {
                try {
                    Object obj = f78612j;
                    synchronized (obj) {
                        f();
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        byte[] bArr4 = bArr[0];
                        synchronized (obj) {
                            f();
                        }
                        arrayList.add((X509Certificate) f78603a.generateCertificate(new ByteArrayInputStream(bArr4)));
                        for (int i11 = 1; i11 < bArr.length; i11++) {
                            try {
                                byte[] bArr5 = bArr[i11];
                                synchronized (f78612j) {
                                    f();
                                }
                                arrayList.add((X509Certificate) f78603a.generateCertificate(new ByteArrayInputStream(bArr5)));
                            } catch (CertificateException unused) {
                                Log.w(org.chromium.base.j.c("X509Util"), T7.E.a(i11, "intermediate ", " failed parsing"));
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!j(x509CertificateArr[0])) {
                                return new AndroidCertVerifyResult(-6);
                            }
                            synchronized (f78612j) {
                                X509TrustManagerExtensions x509TrustManagerExtensions = f78604b;
                                if (x509TrustManagerExtensions == null) {
                                    return new AndroidCertVerifyResult(-1);
                                }
                                try {
                                    list = c(x509TrustManagerExtensions, x509CertificateArr, str, str2, bArr2, bArr3);
                                } catch (CertificateException e11) {
                                    X509TrustManagerExtensions x509TrustManagerExtensions2 = f78606d;
                                    if (x509TrustManagerExtensions2 != null) {
                                        try {
                                            c11 = c(x509TrustManagerExtensions2, x509CertificateArr, str, str2, bArr2, bArr3);
                                        } catch (CertificateException unused2) {
                                            c11 = null;
                                            if (c11 != null) {
                                                list = c11;
                                                return new AndroidCertVerifyResult(list.size() > 0 ? i(list.get(list.size() - 1)) : false, list);
                                            }
                                            Log.i(org.chromium.base.j.c("X509Util"), "Failed to validate the certificate chain, error: " + e11.getMessage());
                                            return new AndroidCertVerifyResult(-2);
                                        }
                                        if (c11 != null) {
                                        }
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                }
                                return new AndroidCertVerifyResult(list.size() > 0 ? i(list.get(list.size() - 1)) : false, list);
                            }
                        } catch (CertificateExpiredException unused3) {
                            return new AndroidCertVerifyResult(-3);
                        } catch (CertificateNotYetValidException unused4) {
                            return new AndroidCertVerifyResult(-4);
                        } catch (CertificateException unused5) {
                            return new AndroidCertVerifyResult(-1);
                        }
                    } catch (CertificateException unused6) {
                        return new AndroidCertVerifyResult(-5);
                    }
                } catch (CertificateException unused7) {
                    return new AndroidCertVerifyResult(-1);
                }
            }
        }
        throw new IllegalArgumentException(Nk.a.b("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=", Arrays.deepToString(bArr)));
    }
}
