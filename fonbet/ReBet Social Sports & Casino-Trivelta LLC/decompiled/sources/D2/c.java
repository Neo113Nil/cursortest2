package D2;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyGenParameterSpec f2513b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2514a;

        /* renamed from: b, reason: collision with root package name */
        public KeyGenParameterSpec f2515b;

        /* renamed from: c, reason: collision with root package name */
        public b f2516c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2517d;

        /* renamed from: e, reason: collision with root package name */
        public int f2518e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2519f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f2520g;

        /* renamed from: D2.c$a$a, reason: collision with other inner class name */
        public static class C0049a {

            /* renamed from: D2.c$a$a$a, reason: collision with other inner class name */
            public static class C0050a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: D2.c$a$a$b */
            public static class b {
                public static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            public static c a(a aVar) {
                b bVar = aVar.f2516c;
                if (bVar == null && aVar.f2515b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f2514a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f2517d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f2518e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f2518e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f2519f && aVar.f2520g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0050a.a(keySize);
                    }
                    aVar.f2515b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f2515b;
                if (keyGenParameterSpec != null) {
                    return new c(e.c(keyGenParameterSpec), aVar.f2515b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
        }

        public a(Context context, String str) {
            this.f2520g = context.getApplicationContext();
            this.f2514a = str;
        }

        public c a() {
            return C0049a.a(this);
        }

        public a b(b bVar) {
            if (bVar.ordinal() == 0) {
                if (this.f2515b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f2516c = bVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + bVar);
        }
    }

    public enum b {
        AES256_GCM
    }

    public c(String str, Object obj) {
        this.f2512a = str;
        this.f2513b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f2512a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f2512a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f2512a + ", isKeyStoreBacked=" + b() + "}";
    }
}
