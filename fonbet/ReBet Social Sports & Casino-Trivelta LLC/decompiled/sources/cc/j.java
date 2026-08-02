package cc;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import cc.AbstractC2912d;
import cc.InterfaceC2910b;
import cc.j;
import com.facebook.react.bridge.ReactApplicationContext;
import ec.C4200a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class j extends AbstractC2912d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f27718g = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27719f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27720a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final AbstractC2912d.InterfaceC0447d f27721b = new AbstractC2912d.InterfaceC0447d() { // from class: cc.k
            @Override // cc.AbstractC2912d.InterfaceC0447d
            public final void a(Cipher cipher, Key key, OutputStream outputStream) {
                j.b.d(cipher, key, outputStream);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractC2912d.b f27722c = new AbstractC2912d.b() { // from class: cc.l
            @Override // cc.AbstractC2912d.b
            public final void a(Cipher cipher, Key key, InputStream inputStream) {
                j.b.c(cipher, key, inputStream);
            }
        };

        public static final void c(Cipher cipher, Key key, InputStream input) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = new byte[12];
            if (input.read(bArr, 0, 12) != 12) {
                throw new IOException("Input stream has insufficient data.");
            }
            cipher.init(2, key, new GCMParameterSpec(128, bArr));
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
            return f27722c;
        }

        public final AbstractC2912d.InterfaceC0447d f() {
            return f27721b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ReactApplicationContext reactContext, boolean z10) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f27719f = z10;
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
        return this.f27719f;
    }

    @Override // cc.AbstractC2912d, cc.InterfaceC2910b
    public com.oblador.keychain.e g() {
        return com.oblador.keychain.e.f39125c;
    }

    @Override // cc.InterfaceC2910b
    public String h() {
        boolean z10 = this.f27719f;
        if (z10) {
            return "KeystoreAESGCM";
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return "KeystoreAESGCM_NoAuth";
    }

    @Override // cc.InterfaceC2910b
    public void i(ec.c handler, String alias, String username, String password, com.oblador.keychain.e level) {
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
                handler.e(new InterfaceC2910b.c(m(o10, username), m(o10, password), this), null);
            } catch (UserNotAuthenticatedException e11) {
                userNotAuthenticatedException = e11;
                key = o10;
                z();
                userNotAuthenticatedException.getMessage();
                Intrinsics.checkNotNull(key);
                Charset charset = Charsets.UTF_8;
                byte[] bytes = password.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                byte[] bytes2 = username.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                handler.c(new C4200a(a10, key, bytes, bytes2, ec.b.f45904a));
            }
        } catch (Throwable th2) {
            handler.e(null, th2);
        }
    }

    @Override // cc.AbstractC2912d
    public String k(Key key, byte[] bytes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return l(key, bytes, b.f27720a.e());
    }

    @Override // cc.AbstractC2912d
    public byte[] m(Key key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return n(key, value, b.f27720a.f());
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
    public String u() {
        return "AES";
    }

    @Override // cc.AbstractC2912d
    public String v() {
        return "AES/GCM/NoPadding";
    }

    @Override // cc.AbstractC2912d
    public KeyGenParameterSpec.Builder w(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(alias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).setKeySize(256);
        Intrinsics.checkNotNullExpressionValue(keySize, "setKeySize(...)");
        if (this.f27719f) {
            keySize.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                keySize.setUserAuthenticationParameters(5, 3);
                return keySize;
            }
            keySize.setUserAuthenticationValidityDurationSeconds(5);
        }
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
