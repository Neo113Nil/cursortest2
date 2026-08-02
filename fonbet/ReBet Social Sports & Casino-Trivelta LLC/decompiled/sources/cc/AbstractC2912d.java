package cc;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Log;
import cc.AbstractC2912d;
import dc.C4051a;
import dc.C4053c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: cc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2912d implements InterfaceC2910b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27706d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f27707e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27709b;

    /* renamed from: c, reason: collision with root package name */
    public transient KeyStore f27710c;

    /* renamed from: cc.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, String fallback) {
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            return (str == null || str.length() == 0) ? fallback : str;
        }

        public final Charset b() {
            return AbstractC2912d.f27707e;
        }

        public a() {
        }
    }

    /* renamed from: cc.d$b */
    public interface b {
        void a(Cipher cipher, Key key, InputStream inputStream);
    }

    /* renamed from: cc.d$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27711a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final InterfaceC0447d f27712b = new InterfaceC0447d() { // from class: cc.e
            @Override // cc.AbstractC2912d.InterfaceC0447d
            public final void a(Cipher cipher, Key key, OutputStream outputStream) {
                AbstractC2912d.c.d(cipher, key, outputStream);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final b f27713c = new b() { // from class: cc.f
            @Override // cc.AbstractC2912d.b
            public final void a(Cipher cipher, Key key, InputStream inputStream) {
                AbstractC2912d.c.c(cipher, key, inputStream);
            }
        };

        public static final void c(Cipher cipher, Key key, InputStream inputStream) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(inputStream, "<unused var>");
            cipher.init(2, key);
        }

        public static final void d(Cipher cipher, Key key, OutputStream outputStream) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(outputStream, "<unused var>");
            cipher.init(1, key);
        }

        public final b e() {
            return f27713c;
        }

        public final InterfaceC0447d f() {
            return f27712b;
        }
    }

    /* renamed from: cc.d$d, reason: collision with other inner class name */
    public interface InterfaceC0447d {
        void a(Cipher cipher, Key key, OutputStream outputStream);
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f27707e = forName;
    }

    public AbstractC2912d(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f27708a = applicationContext;
        this.f27709b = AbstractC2912d.class.getSimpleName();
    }

    public final com.oblador.keychain.e A(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return x(key).isInsideSecureHardware() ? com.oblador.keychain.e.f39125c : com.oblador.keychain.e.f39124b;
    }

    public final boolean B(Key key, String expectedAlgorithm) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expectedAlgorithm, "expectedAlgorithm");
        if (!StringsKt.equals(key.getAlgorithm(), expectedAlgorithm, true)) {
            return false;
        }
        try {
            KeyInfo x10 = x(key);
            String[] blockModes = x10.getBlockModes();
            Intrinsics.checkNotNullExpressionValue(blockModes, "getBlockModes(...)");
            if (x10.isUserAuthenticationRequired() != e()) {
                return false;
            }
            String str = (String) StringsKt.split$default((CharSequence) v(), new String[]{"/"}, false, 0, 6, (Object) null).get(1);
            for (String str2 : blockModes) {
                if (StringsKt.equals(str2, str, true)) {
                    return true;
                }
            }
            return false;
        } catch (GeneralSecurityException e10) {
            Log.w(this.f27709b, "Failed to check cipher configuration: " + e10.getMessage());
            return false;
        }
    }

    public final void C(com.oblador.keychain.e level) {
        Intrinsics.checkNotNullParameter(level, "level");
        if (g().c(level)) {
            return;
        }
        throw new C4051a("Insufficient security level (wants " + level + "; got " + g() + ")");
    }

    public final Key D(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec build = w(alias).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return q(build);
    }

    public final Key E(String alias) {
        KeyGenParameterSpec.Builder isStrongBoxBacked;
        Intrinsics.checkNotNullParameter(alias, "alias");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            isStrongBoxBacked = w(alias).setIsStrongBoxBacked(true);
            KeyGenParameterSpec build = isStrongBoxBacked.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return q(build);
        }
        throw new C4053c("Strong box security keystore is not supported for old API" + i10 + ".");
    }

    public final boolean F(com.oblador.keychain.e level, Key key) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(key, "key");
        return A(key).c(level);
    }

    @Override // cc.InterfaceC2910b
    public Set a() {
        KeyStore y10 = y();
        try {
            return new HashSet(Collections.list(y10.aliases()));
        } catch (KeyStoreException e10) {
            throw new C4053c("Error accessing aliases in keystore " + y10, e10);
        }
    }

    @Override // cc.InterfaceC2910b
    public int c() {
        return ((e() ? 1 : 0) * 1000) + d();
    }

    @Override // cc.InterfaceC2910b
    public void f(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        String a10 = f27706d.a(alias, t());
        KeyStore y10 = y();
        try {
            if (y10.containsAlias(a10)) {
                y10.deleteEntry(a10);
            }
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // cc.InterfaceC2910b
    public com.oblador.keychain.e g() {
        return com.oblador.keychain.e.f39125c;
    }

    public String k(Key key, byte[] bytes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return l(key, bytes, c.f27711a.e());
    }

    public String l(Key key, byte[] bytes, b bVar) {
        Throwable cause;
        String message;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Cipher s10 = s();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bVar != null) {
                    try {
                        bVar.a(s10, key, byteArrayInputStream);
                    } finally {
                    }
                }
                try {
                    byteArrayOutputStream.write(s10.doFinal(ByteStreamsKt.readBytes(byteArrayInputStream)));
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    String str = new String(byteArray, f27707e);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    return str;
                } catch (Exception e10) {
                    if (e10 instanceof UserNotAuthenticatedException) {
                        throw e10;
                    }
                    if (AbstractC2911c.a(e10.getCause()) && (cause = e10.getCause()) != null && (message = cause.getMessage()) != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "Key user not authenticated", false, 2, (Object) null)) {
                        throw new UserNotAuthenticatedException();
                    }
                    if (e10 instanceof AEADBadTagException) {
                        throw new C4051a("Decryption failed: Authentication tag verification failed. This usually indicates that the encrypted data was modified, corrupted, or is being decrypted with the wrong key.", e10);
                    }
                    throw e10;
                }
            } finally {
            }
        } catch (Throwable th2) {
            Log.w(this.f27709b, th2.getMessage(), th2);
            throw th2;
        }
    }

    public byte[] m(Key key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return n(key, value, c.f27711a.f());
    }

    public final byte[] n(Key key, String value, InterfaceC0447d interfaceC0447d) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Cipher s10 = s();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (interfaceC0447d != null) {
                try {
                    interfaceC0447d.a(s10, key, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                } finally {
                }
            }
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, s10);
            try {
                byte[] bytes = value.getBytes(f27707e);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                cipherOutputStream.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cipherOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            Log.e(this.f27709b, th2.getMessage(), th2);
            throw th2;
        }
    }

    public final Key o(String safeAlias, com.oblador.keychain.e level, AtomicInteger retries) {
        Key key;
        Intrinsics.checkNotNullParameter(safeAlias, "safeAlias");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(retries, "retries");
        do {
            KeyStore y10 = y();
            if (y10.containsAlias(safeAlias)) {
                key = null;
                Key key2 = y10.getKey(safeAlias, null);
                if (key2 != null && !B(key2, u())) {
                    Log.w(this.f27709b, "Incompatible key found for alias: " + safeAlias + ". Expected cipher: " + v() + ". This can happen if you try to overwrite credentials that were previously saved with a different encryption algorithm.");
                    y10.deleteEntry(safeAlias);
                    r(safeAlias, level);
                }
            } else {
                r(safeAlias, level);
            }
            key = p(y10, safeAlias, retries);
        } while (key == null);
        return key;
    }

    public final Key p(KeyStore keyStore, String safeAlias, AtomicInteger retry) {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(safeAlias, "safeAlias");
        Intrinsics.checkNotNullParameter(retry, "retry");
        try {
            Key key = keyStore.getKey(safeAlias, null);
            if (key != null) {
                return key;
            }
            throw new C4053c("Empty key extracted!");
        } catch (UnrecoverableKeyException e10) {
            if (retry.getAndDecrement() <= 0) {
                throw e10;
            }
            keyStore.deleteEntry(safeAlias);
            return null;
        }
    }

    public abstract Key q(KeyGenParameterSpec keyGenParameterSpec);

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(String alias, com.oblador.keychain.e requiredLevel) {
        Key E10;
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(requiredLevel, "requiredLevel");
        boolean g10 = com.oblador.keychain.b.f39119a.g(this.f27708a);
        try {
            if (g10) {
                try {
                    E10 = E(alias);
                } catch (GeneralSecurityException e10) {
                    Log.w(this.f27709b, "StrongBox security storage is not available.", e10);
                } catch (ProviderException e11) {
                    Log.w(this.f27709b, "StrongBox security storage is not available.", e11);
                }
                if (E10 != null || !g10) {
                    E10 = D(alias);
                }
                Intrinsics.checkNotNull(E10);
                if (F(requiredLevel, E10)) {
                    throw new C4051a("Cannot generate keys with required security guarantees");
                }
                return;
            }
            E10 = D(alias);
            Intrinsics.checkNotNull(E10);
            if (F(requiredLevel, E10)) {
            }
        } catch (GeneralSecurityException e12) {
            Log.e(this.f27709b, "Regular security storage is not available.", e12);
            throw e12;
        }
        E10 = null;
        if (E10 != null) {
        }
    }

    public final Cipher s() {
        return C2909a.f27699a.b(v());
    }

    public String t() {
        return h();
    }

    public abstract String u();

    public abstract String v();

    public abstract KeyGenParameterSpec.Builder w(String str);

    public abstract KeyInfo x(Key key);

    public final KeyStore y() {
        if (this.f27710c == null) {
            synchronized (this) {
                try {
                    if (this.f27710c == null) {
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            this.f27710c = keyStore;
                        } catch (Throwable th2) {
                            throw new C4053c("Could not access Keystore", th2);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        KeyStore keyStore2 = this.f27710c;
        Intrinsics.checkNotNull(keyStore2);
        return keyStore2;
    }

    public final String z() {
        return this.f27709b;
    }
}
