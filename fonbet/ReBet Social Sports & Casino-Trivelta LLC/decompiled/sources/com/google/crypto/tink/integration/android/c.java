package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import cb.p;
import com.google.crypto.tink.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes3.dex */
public final class c implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f37031c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final String f37032d = "c";

    /* renamed from: a, reason: collision with root package name */
    public final String f37033a;

    /* renamed from: b, reason: collision with root package name */
    public KeyStore f37034b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f37035a = null;

        /* renamed from: b, reason: collision with root package name */
        public KeyStore f37036b;

        public a() {
            this.f37036b = null;
            if (!c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f37036b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public c() {
        this(new a());
    }

    public static boolean d(String str) {
        c cVar = new c();
        synchronized (f37031c) {
            try {
                if (cVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(String str) {
        String b10 = cb.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static boolean g() {
        return true;
    }

    public static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    public static com.google.crypto.tink.a i(com.google.crypto.tink.a aVar) {
        byte[] c10 = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c10, aVar.b(aVar.a(c10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L17;
     */
    @Override // com.google.crypto.tink.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(String str) {
        String str2 = this.f37033a;
        boolean z10 = true;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.f37033a == null) {
        }
        z10 = false;
        return z10;
    }

    @Override // com.google.crypto.tink.r
    public synchronized com.google.crypto.tink.a b(String str) {
        try {
            String str2 = this.f37033a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f37033a, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i(new b(cb.r.b("android-keystore://", str), this.f37034b));
    }

    public synchronized boolean f(String str) {
        String b10;
        b10 = cb.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f37032d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f37034b = keyStore;
                keyStore.load(null);
                return this.f37034b.containsAlias(b10);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f37034b.containsAlias(b10);
    }

    public c(a aVar) {
        this.f37033a = aVar.f37035a;
        this.f37034b = aVar.f37036b;
    }
}
