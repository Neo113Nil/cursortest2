package cc;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Log;
import cc.AbstractC2912d;
import cc.InterfaceC2910b;
import cc.g;
import com.facebook.react.bridge.ReactApplicationContext;
import dc.C4051a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends AbstractC2912d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f27714f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27715a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final AbstractC2912d.InterfaceC0447d f27716b = new AbstractC2912d.InterfaceC0447d() { // from class: cc.h
            @Override // cc.AbstractC2912d.InterfaceC0447d
            public final void a(Cipher cipher, Key key, OutputStream outputStream) {
                g.b.d(cipher, key, outputStream);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractC2912d.b f27717c = new AbstractC2912d.b() { // from class: cc.i
            @Override // cc.AbstractC2912d.b
            public final void a(Cipher cipher, Key key, InputStream inputStream) {
                g.b.c(cipher, key, inputStream);
            }
        };

        public static final void c(Cipher cipher, Key key, InputStream input) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = new byte[16];
            if (input.read(bArr, 0, 16) != 16) {
                throw new IOException("Input stream has insufficient data.");
            }
            cipher.init(2, key, new IvParameterSpec(bArr));
        }

        public static final void d(Cipher cipher, Key key, OutputStream output) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            cipher.init(1, key);
            byte[] iv = cipher.getIV();
            output.write(iv, 0, iv.length);
        }

        public final AbstractC2912d.b e() {
            return f27717c;
        }

        public final AbstractC2912d.InterfaceC0447d f() {
            return f27716b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // cc.InterfaceC2910b
    public void b(ec.c handler, String alias, byte[] username, byte[] password, com.oblador.keychain.e level) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(level, "level");
        C(level);
        try {
            Key o10 = o(AbstractC2912d.f27706d.a(alias, t()), level, new AtomicInteger(1));
            handler.a(new InterfaceC2910b.C0446b(k(o10, username), k(o10, password), A(o10)), null);
        } catch (GeneralSecurityException e10) {
            throw new C4051a("Could not decrypt data with alias: " + alias, e10);
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
        return false;
    }

    @Override // cc.AbstractC2912d, cc.InterfaceC2910b
    public com.oblador.keychain.e g() {
        return com.oblador.keychain.e.f39125c;
    }

    @Override // cc.InterfaceC2910b
    public String h() {
        return "KeystoreAESCBC";
    }

    @Override // cc.InterfaceC2910b
    public void i(ec.c handler, String alias, String username, String password, com.oblador.keychain.e level) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(level, "level");
        C(level);
        try {
            Key o10 = o(AbstractC2912d.f27706d.a(alias, t()), level, new AtomicInteger(1));
            handler.e(new InterfaceC2910b.c(m(o10, username), m(o10, password), this), null);
        } catch (GeneralSecurityException e10) {
            throw new C4051a("Could not encrypt data with alias: " + alias, e10);
        } catch (Throwable th2) {
            throw new C4051a("Unknown error with alias: " + alias + ", error: " + th2.getMessage(), th2);
        }
    }

    @Override // cc.AbstractC2912d
    public String k(Key key, byte[] bytes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return l(key, bytes, b.f27715a.e());
    }

    @Override // cc.AbstractC2912d
    public String l(Key key, byte[] bytes, AbstractC2912d.b bVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Cipher s10 = s();
        try {
            byte[] bArr = new byte[16];
            if (16 >= bytes.length) {
                throw new IOException("Insufficient length of input data for IV extracting.");
            }
            System.arraycopy(bytes, 0, bArr, 0, 16);
            s10.init(2, key, new IvParameterSpec(bArr));
            byte[] doFinal = s10.doFinal(bytes, 16, bytes.length - 16);
            Intrinsics.checkNotNull(doFinal);
            return new String(doFinal, AbstractC2912d.f27706d.b());
        } catch (Throwable th2) {
            Log.w(z(), th2.getMessage(), th2);
            throw th2;
        }
    }

    @Override // cc.AbstractC2912d
    public byte[] m(Key key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return n(key, value, b.f27715a.f());
    }

    @Override // cc.AbstractC2912d
    public Key q(KeyGenParameterSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        KeyGenerator keyGenerator = KeyGenerator.getInstance(u(), "AndroidKeyStore");
        keyGenerator.init(spec);
        SecretKey generateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(generateKey, "generateKey(...)");
        return generateKey;
    }

    @Override // cc.AbstractC2912d
    public String t() {
        return "RN_KEYCHAIN_DEFAULT_ALIAS";
    }

    @Override // cc.AbstractC2912d
    public String u() {
        return "AES";
    }

    @Override // cc.AbstractC2912d
    public String v() {
        return "AES/CBC/PKCS7Padding";
    }

    @Override // cc.AbstractC2912d
    public KeyGenParameterSpec.Builder w(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(alias, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(true).setKeySize(256);
        Intrinsics.checkNotNullExpressionValue(keySize, "setKeySize(...)");
        return keySize;
    }

    @Override // cc.AbstractC2912d
    public KeyInfo x(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        KeySpec keySpec = SecretKeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore").getKeySpec((SecretKey) key, KeyInfo.class);
        Intrinsics.checkNotNullExpressionValue(keySpec, "getKeySpec(...)");
        return (KeyInfo) keySpec;
    }
}
