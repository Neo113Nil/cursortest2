package i8;

import X7.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class p implements d8.c {

    /* renamed from: e, reason: collision with root package name */
    public static final a.EnumC0605a f66123e = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f66124a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66125b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f66126c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66127d;

    final class a extends ThreadLocal<Mac> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected final Mac initialValue() {
            p pVar = p.this;
            try {
                Mac a11 = k.f66116c.a(pVar.f66125b);
                a11.init(pVar.f66126c);
                return a11;
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public p(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        a aVar = new a();
        this.f66124a = aVar;
        if (!f66123e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f66125b = str;
        this.f66126c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f66127d = 20;
                break;
            case "HMACSHA224":
                this.f66127d = 28;
                break;
            case "HMACSHA256":
                this.f66127d = 32;
                break;
            case "HMACSHA384":
                this.f66127d = 48;
                break;
            case "HMACSHA512":
                this.f66127d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        aVar.get();
    }

    @Override // d8.c
    public final byte[] a(int i11, byte[] bArr) throws GeneralSecurityException {
        if (i11 > this.f66127d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal<Mac> threadLocal = this.f66124a;
        threadLocal.get().update(bArr);
        return Arrays.copyOf(threadLocal.get().doFinal(), i11);
    }
}
