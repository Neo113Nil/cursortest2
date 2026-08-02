package Bc;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.surt.guardian.utils.Logger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0019a f863b = new C0019a(null);

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f864c;

    /* renamed from: a, reason: collision with root package name */
    public final KeyStore f865a;

    /* renamed from: Bc.a$a, reason: collision with other inner class name */
    public static final class C0019a {
        public C0019a() {
        }

        public final a a() {
            a aVar;
            a aVar2 = a.f864c;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.f864c;
                if (aVar == null) {
                    aVar = new a();
                    a.f864c = aVar;
                }
            }
            return aVar;
        }

        public /* synthetic */ C0019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "apply(...)");
        this.f865a = keyStore;
    }

    public static KeyPair a(String str) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(false);
        Intrinsics.checkNotNullExpressionValue(userAuthenticationRequired, "setUserAuthenticationRequired(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                userAuthenticationRequired.setIsStrongBoxBacked(true);
                Logger.f41582a.d("KeystoreManager", "StrongBox backing enabled");
            } catch (Exception e10) {
                Logger.f41582a.f("KeystoreManager", "StrongBox not available, using TEE: " + e10.getMessage());
            }
        }
        try {
            byte[] bytes = "surt_guardian_attestation".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            userAuthenticationRequired.setAttestationChallenge(bytes);
            Logger.f41582a.d("KeystoreManager", "Key attestation enabled");
        } catch (Exception e11) {
            Logger.f41582a.f("KeystoreManager", "Key attestation not available: " + e11.getMessage());
        }
        keyPairGenerator.initialize(userAuthenticationRequired.build());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        Logger.f41582a.d("KeystoreManager", "Key pair generated successfully for alias: " + str);
        Intrinsics.checkNotNull(generateKeyPair);
        return generateKeyPair;
    }

    public static /* synthetic */ KeyPair e(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "surt_guardian_signing_key";
        }
        return aVar.d(str);
    }

    public final KeyPair d(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        try {
            if (this.f865a.containsAlias(alias)) {
                KeyStore.Entry entry = this.f865a.getEntry(alias, null);
                KeyStore.PrivateKeyEntry privateKeyEntry = entry instanceof KeyStore.PrivateKeyEntry ? (KeyStore.PrivateKeyEntry) entry : null;
                if (privateKeyEntry != null) {
                    Logger.f41582a.a("KeystoreManager", "Using existing key pair for alias: " + alias);
                    return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
                }
            }
            Logger.f41582a.d("KeystoreManager", "Generating new key pair for alias: " + alias);
            return a(alias);
        } catch (Exception e10) {
            Logger.f41582a.b("KeystoreManager", "Error getting/creating key pair", e10);
            throw new SecurityException("Failed to initialize cryptographic keys", e10);
        }
    }
}
