package i8;

import X7.a;
import com.google.crypto.tink.internal.H;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7020b {

    /* renamed from: d, reason: collision with root package name */
    public static final a.EnumC0605a f66059d = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f66060e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f66061a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66062b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66063c;

    /* renamed from: i8.b$a */
    final class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        protected final Cipher initialValue() {
            try {
                return k.f66115b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public C7020b(int i11, byte[] bArr) throws GeneralSecurityException {
        if (!f66059d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        v.a(bArr.length);
        this.f66061a = new SecretKeySpec(bArr, "AES");
        int blockSize = f66060e.get().getBlockSize();
        this.f66063c = blockSize;
        if (i11 < 12 || i11 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f66062b = i11;
    }

    private void b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, byte[] bArr3, boolean z11) throws GeneralSecurityException {
        Cipher cipher = f66060e.get();
        byte[] bArr4 = new byte[this.f66063c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f66062b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f66061a;
        if (z11) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i11, i12, bArr2, i13) != i12) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i11 = this.f66062b;
        if (length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        int length2 = bArr.length;
        int i12 = this.f66062b;
        byte[] bArr3 = new byte[length2 - i12];
        b(bArr, i12, bArr.length - i12, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i11 = this.f66062b;
        if (length > Integer.MAX_VALUE - i11) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i11));
        }
        byte[] bArr2 = new byte[bArr.length + i11];
        byte[] a11 = H.a(i11);
        System.arraycopy(a11, 0, bArr2, 0, i11);
        b(bArr, 0, bArr.length, bArr2, this.f66062b, a11, true);
        return bArr2;
    }
}
