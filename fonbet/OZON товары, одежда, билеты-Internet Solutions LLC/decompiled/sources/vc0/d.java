package vc0;

import Sc.InterfaceC4008j;
import Sc.k;
import Vb0.b;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.C9862b;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f102830a = k.b(new b(0));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f102831b = k.b(new a(0));

    static final class a extends AbstractC7737t implements Function0<KeyPairGenerator> {
        @Override // kotlin.jvm.functions.Function0
        public final KeyPairGenerator invoke() {
            try {
                return KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            } catch (Exception e11) {
                d.i("Key generator creation error", e11);
                return null;
            }
        }
    }

    static final class b extends AbstractC7737t implements Function0<KeyStore> {
        @Override // kotlin.jvm.functions.Function0
        public final KeyStore invoke() {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            } catch (Exception e11) {
                d.i("Key store creation error", e11);
                return null;
            }
        }
    }

    private final PublicKey d() {
        KeyGenParameterSpec.Builder isStrongBoxBacked;
        KeyGenParameterSpec.Builder isStrongBoxBacked2;
        KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder("OZON_PAY_KEY", 12).setAlgorithmParameterSpec(new ECGenParameterSpec("prime256v1")).setUserAuthenticationRequired(true).setDigests("SHA-256");
        Intrinsics.checkNotNullExpressionValue(digests, "setDigests(...)");
        if (Build.VERSION.SDK_INT < 28) {
            KeyGenParameterSpec build = digests.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return e(build);
        }
        isStrongBoxBacked = digests.setIsStrongBoxBacked(true);
        KeyGenParameterSpec build2 = isStrongBoxBacked.build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        PublicKey e11 = e(build2);
        if (e11 != null) {
            return e11;
        }
        isStrongBoxBacked2 = digests.setIsStrongBoxBacked(false);
        KeyGenParameterSpec build3 = isStrongBoxBacked2.build();
        Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
        return e(build3);
    }

    private final PublicKey e(KeyGenParameterSpec keyGenParameterSpec) {
        InterfaceC4008j interfaceC4008j = this.f102831b;
        try {
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) interfaceC4008j.getValue();
            if (keyPairGenerator == null) {
                throw new IllegalStateException("Key generator is not initialized");
            }
            keyPairGenerator.initialize(keyGenParameterSpec);
            KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) interfaceC4008j.getValue();
            if (keyPairGenerator2 != null) {
                return keyPairGenerator2.generateKeyPair().getPublic();
            }
            throw new IllegalStateException("Key generator is not initialized");
        } catch (Exception e11) {
            i("Generate public key error. Strong box backed: " + (Build.VERSION.SDK_INT >= 28 ? keyGenParameterSpec.isStrongBoxBacked() : false), e11);
            return null;
        }
    }

    private final KeyStore g() {
        KeyStore keyStore = (KeyStore) this.f102830a.getValue();
        if (keyStore != null) {
            return keyStore;
        }
        throw new IllegalStateException("Key store is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(String str, Exception exc) {
        b.a.c(Vb0.b.f28514a, new KeyStoreException(str, exc));
    }

    public final void b() {
        if (g().containsAlias("OZON_PAY_KEY")) {
            try {
                g().deleteEntry("OZON_PAY_KEY");
            } catch (Exception e11) {
                b.a.c(Vb0.b.f28514a, e11);
            }
        }
    }

    public final Signature c() {
        Signature signature;
        try {
            Key key = g().getKey("OZON_PAY_KEY", null);
            PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
            if (privateKey != null && (signature = Signature.getInstance("SHA256withECDSA")) != null) {
                signature.initSign(privateKey);
                return signature;
            }
        } catch (Exception e11) {
            i("Signature creation error", e11);
        }
        return null;
    }

    public final String f() {
        PublicKey d11;
        byte[] encoded;
        if (g().containsAlias("OZON_PAY_KEY")) {
            try {
                Certificate certificate = g().getCertificate("OZON_PAY_KEY");
                d11 = certificate != null ? certificate.getPublicKey() : null;
            } catch (Exception e11) {
                i("Get public key error", e11);
                b();
                d11 = d();
            }
        } else {
            d11 = d();
        }
        if (d11 == null || (encoded = d11.getEncoded()) == null) {
            return null;
        }
        return C9862b.a(0, encoded);
    }

    public final boolean h() {
        return (((KeyStore) this.f102830a.getValue()) == null || ((KeyPairGenerator) this.f102831b.getValue()) == null) ? false : true;
    }
}
