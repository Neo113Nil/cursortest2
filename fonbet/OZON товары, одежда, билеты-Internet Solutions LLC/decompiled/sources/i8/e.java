package i8;

import T7.C4033o;
import X7.a;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import j8.C7306a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class e implements S7.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a.EnumC0605a f66084c = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f66085a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f66086b;

    private e(byte[] bArr, C7306a c7306a) throws GeneralSecurityException {
        if (!f66084c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = U7.f.f27382b;
        v.a(bArr.length);
        this.f66085a = new SecretKeySpec(bArr, "AES");
        this.f66086b = c7306a.d();
    }

    public static e c(C4033o c4033o) throws GeneralSecurityException {
        if (c4033o.i().c() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + c4033o.i().c());
        }
        if (c4033o.i().e() == 16) {
            return new e(c4033o.h().d(S7.e.a()), c4033o.e());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + c4033o.i().e());
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a11 = H.a(12);
        AlgorithmParameterSpec a12 = U7.f.a(0, a11.length, a11);
        Cipher b11 = U7.f.b();
        b11.init(1, this.f66085a, a12);
        if (bArr2 != null && bArr2.length != 0) {
            b11.updateAAD(bArr2);
        }
        int outputSize = b11.getOutputSize(bArr.length);
        byte[] bArr3 = this.f66086b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(a11, 0, copyOf, bArr3.length, 12);
        if (b11.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f66086b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec a11 = U7.f.a(bArr3.length, 12, bArr);
        Cipher b11 = U7.f.b();
        b11.init(2, this.f66085a, a11);
        if (bArr2 != null && bArr2.length != 0) {
            b11.updateAAD(bArr2);
        }
        return b11.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
