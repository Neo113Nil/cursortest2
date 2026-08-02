package cc;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import cc.InterfaceC2910b;
import com.facebook.react.bridge.ReactApplicationContext;
import dc.C4051a;
import dc.C4053c;
import ec.C4200a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.NoSuchPaddingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends AbstractC2912d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f27723f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final InterfaceC2910b.c G(String str, String str2, String str3) {
        Certificate certificate = y().getCertificate(str);
        if (certificate != null) {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(certificate.getPublicKey().getEncoded()));
            Intrinsics.checkNotNull(generatePublic);
            return new InterfaceC2910b.c(m(generatePublic, str3), m(generatePublic, str2), this);
        }
        throw new GeneralSecurityException("Certificate is null for alias " + str);
    }

    @Override // cc.InterfaceC2910b
    public void b(ec.c handler, String alias, byte[] username, byte[] password, com.oblador.keychain.e level) {
        UserNotAuthenticatedException userNotAuthenticatedException;
        Key key;
        Key o10;
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(level, "level");
        C(level);
        String a10 = AbstractC2912d.f27706d.a(alias, t());
        try {
            try {
                o10 = o(a10, level, new AtomicInteger(1));
            } catch (UserNotAuthenticatedException e10) {
                userNotAuthenticatedException = e10;
                key = null;
            }
            try {
                handler.a(new InterfaceC2910b.C0446b(k(o10, username), k(o10, password), null, 4, null), null);
            } catch (UserNotAuthenticatedException e11) {
                userNotAuthenticatedException = e11;
                key = o10;
                z();
                userNotAuthenticatedException.getMessage();
                Intrinsics.checkNotNull(key);
                handler.c(new C4200a(a10, key, password, username, ec.b.f45905b));
            }
        } catch (Throwable th2) {
            handler.a(null, th2);
        }
    }

    @Override // cc.InterfaceC2910b
    public int d() {
        return 23;
    }

    @Override // cc.InterfaceC2910b
    public boolean e() {
        return true;
    }

    @Override // cc.InterfaceC2910b
    public String h() {
        return "KeystoreRSAECB";
    }

    @Override // cc.InterfaceC2910b
    public void i(ec.c handler, String alias, String username, String password, com.oblador.keychain.e level) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(level, "level");
        C(level);
        String a10 = AbstractC2912d.f27706d.a(alias, t());
        try {
            o(a10, level, new AtomicInteger(1));
            handler.e(G(a10, password, username), null);
        } catch (Exception e10) {
            if ((e10 instanceof NoSuchAlgorithmException) || (e10 instanceof InvalidKeySpecException) || (e10 instanceof NoSuchPaddingException) || (e10 instanceof InvalidKeyException)) {
                throw new C4051a("Could not encrypt data for service " + alias, e10);
            }
            if ((e10 instanceof KeyStoreException) || (e10 instanceof C4053c)) {
                throw new C4051a("Could not access Keystore for service " + alias, e10);
            }
            if (e10 instanceof IOException) {
                throw new C4051a("I/O error: " + e10.getMessage(), e10);
            }
            throw new C4051a("Unknown error: " + e10.getMessage(), e10);
        }
    }

    @Override // cc.AbstractC2912d
    public Key q(KeyGenParameterSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(u(), "AndroidKeyStore");
        keyPairGenerator.initialize(spec);
        PrivateKey privateKey = keyPairGenerator.generateKeyPair().getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
        return privateKey;
    }

    @Override // cc.AbstractC2912d
    public String u() {
        return "RSA";
    }

    @Override // cc.AbstractC2912d
    public String v() {
        return "RSA/ECB/PKCS1Padding";
    }

    @Override // cc.AbstractC2912d
    public KeyGenParameterSpec.Builder w(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(alias, 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setRandomizedEncryptionRequired(true).setUserAuthenticationRequired(true).setKeySize(2048);
        Intrinsics.checkNotNullExpressionValue(keySize, "setKeySize(...)");
        if (Build.VERSION.SDK_INT >= 30) {
            keySize.setUserAuthenticationParameters(5, 3);
            return keySize;
        }
        keySize.setUserAuthenticationValidityDurationSeconds(5);
        return keySize;
    }

    @Override // cc.AbstractC2912d
    public KeyInfo x(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KeySpec keySpec = KeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec(key, KeyInfo.class);
        Intrinsics.checkNotNullExpressionValue(keySpec, "getKeySpec(...)");
        return (KeyInfo) keySpec;
    }
}
