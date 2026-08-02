package cb;

import Xa.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2907a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0280b f27644d = b.EnumC0280b.f13670b;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f27645e = new C0444a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f27646a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27647b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27648c;

    /* renamed from: cb.a$a, reason: collision with other inner class name */
    public class C0444a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f27674b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C2907a(byte[] bArr, int i10) {
        if (!f27644d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f27646a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f27645e.get()).getBlockSize();
        this.f27648c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f27647b = i10;
    }

    @Override // cb.l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f27647b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f27647b;
        byte[] bArr3 = new byte[length2 - i11];
        b(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = (Cipher) f27645e.get();
        byte[] bArr4 = new byte[this.f27648c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f27647b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f27646a, ivParameterSpec);
        } else {
            cipher.init(2, this.f27646a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // cb.l
    public byte[] encrypt(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f27647b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f27647b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] c10 = p.c(i10);
        System.arraycopy(c10, 0, bArr2, 0, this.f27647b);
        b(bArr, 0, bArr.length, bArr2, this.f27647b, c10, true);
        return bArr2;
    }
}
