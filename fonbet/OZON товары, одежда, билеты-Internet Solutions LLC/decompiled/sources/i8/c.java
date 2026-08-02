package i8;

import T7.C4028j;
import X7.a;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import d8.C6099a;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class c implements S7.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a.EnumC0605a f66064e = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f66065f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f66066a;

    /* renamed from: b, reason: collision with root package name */
    private final d8.c f66067b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f66068c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66069d;

    final class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        protected final Cipher initialValue() {
            try {
                return k.f66115b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private c(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f66064e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i11 != 12 && i11 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f66069d = i11;
        v.a(bArr.length);
        this.f66068c = new SecretKeySpec(bArr, "AES");
        this.f66067b = o.b(C6099a.e(d8.b.b(bArr.length), C7307b.a(bArr, S7.e.a())));
        this.f66066a = bArr2;
    }

    public static c c(C4028j c4028j) throws GeneralSecurityException {
        if (!f66064e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (c4028j.i().e() == 16) {
            return new c(c4028j.i().c(), c4028j.h().d(S7.e.a()), c4028j.e().d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c4028j.i().e());
    }

    private byte[] d(int i11, byte[] bArr, int i12, int i13) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i13 + 16];
        bArr2[15] = (byte) i11;
        System.arraycopy(bArr, i12, bArr2, 16, i13);
        return this.f66067b.a(16, bArr2);
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f66066a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i11 = this.f66069d;
        if (length > (length2 - i11) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i11 + bArr.length + 16);
        byte[] a11 = H.a(i11);
        System.arraycopy(a11, 0, copyOf, bArr3.length, i11);
        byte[] d11 = d(0, a11, 0, a11.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] d12 = d(1, bArr2, 0, bArr2.length);
        Cipher cipher = f66065f.get();
        cipher.init(1, this.f66068c, new IvParameterSpec(d11));
        cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + i11);
        byte[] d13 = d(2, copyOf, bArr3.length + i11, bArr.length);
        int length3 = bArr3.length + bArr.length + i11;
        for (int i12 = 0; i12 < 16; i12++) {
            copyOf[length3 + i12] = (byte) ((d12[i12] ^ d11[i12]) ^ d13[i12]);
        }
        return copyOf;
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f66066a;
        int length2 = length - bArr3.length;
        int i11 = this.f66069d;
        int i12 = (length2 - i11) - 16;
        if (i12 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] d11 = d(0, bArr, bArr3.length, i11);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] d12 = d(1, bArr2, 0, bArr2.length);
        byte[] d13 = d(2, bArr, bArr3.length + i11, i12);
        int length3 = bArr.length - 16;
        byte b11 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b11 = (byte) (b11 | (((bArr[length3 + i13] ^ d12[i13]) ^ d11[i13]) ^ d13[i13]));
        }
        if (b11 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = f66065f.get();
        cipher.init(1, this.f66068c, new IvParameterSpec(d11));
        return cipher.doFinal(bArr, bArr3.length + i11, i12);
    }
}
