package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.biometric.BiometricPrompt;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import p0.C6030a;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {
        @NonNull
        public static KeyGenParameterSpec a(@NonNull KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static KeyGenParameterSpec.Builder b(@NonNull String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        public static void c(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void e(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    public static class b {
        @NonNull
        public static BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        @NonNull
        public static BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @NonNull
        public static BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher d(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Mac e(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        public static Signature f(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    public static class c {
        @NonNull
        public static BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    public static BiometricPrompt.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b10 = a.b("androidxBiometric", 3);
            a.d(b10);
            a.e(b10);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(b10));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new BiometricPrompt.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    public static BiometricPrompt.c b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential b10;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d10 = b.d(cryptoObject);
        if (d10 != null) {
            return new BiometricPrompt.c(d10);
        }
        Signature f10 = b.f(cryptoObject);
        if (f10 != null) {
            return new BiometricPrompt.c(f10);
        }
        Mac e10 = b.e(cryptoObject);
        if (e10 != null) {
            return new BiometricPrompt.c(e10);
        }
        if (Build.VERSION.SDK_INT < 30 || (b10 = c.b(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.c(b10);
    }

    public static BiometricPrompt.c c(C6030a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher a10 = eVar.a();
        if (a10 != null) {
            return new BiometricPrompt.c(a10);
        }
        Signature c10 = eVar.c();
        if (c10 != null) {
            return new BiometricPrompt.c(c10);
        }
        Mac b10 = eVar.b();
        if (b10 != null) {
            return new BiometricPrompt.c(b10);
        }
        return null;
    }

    public static BiometricPrompt.CryptoObject d(BiometricPrompt.c cVar) {
        IdentityCredential b10;
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return b.b(a10);
        }
        Signature d10 = cVar.d();
        if (d10 != null) {
            return b.a(d10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return b.c(c10);
        }
        if (Build.VERSION.SDK_INT < 30 || (b10 = cVar.b()) == null) {
            return null;
        }
        return c.a(b10);
    }

    public static C6030a.e e(BiometricPrompt.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return new C6030a.e(a10);
        }
        Signature d10 = cVar.d();
        if (d10 != null) {
            return new C6030a.e(d10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return new C6030a.e(c10);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
