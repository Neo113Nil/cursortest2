package e8;

import Gl.C3124a;
import S0.C;
import S7.e;
import X7.a;
import d8.C6099a;
import d8.c;
import i8.h;
import i8.k;
import i8.v;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6318a implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final a.EnumC0605a f62031d = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f62032e = new C0973a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f62033a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f62034b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f62035c;

    /* renamed from: e8.a$a, reason: collision with other inner class name */
    final class C0973a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        protected final Cipher initialValue() {
            try {
                return k.f66115b.a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private C6318a(byte[] bArr) throws GeneralSecurityException {
        v.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f62033a = secretKeySpec;
        if (!f62031d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = f62032e.get();
        cipher.init(1, secretKeySpec);
        byte[] b11 = C.b(cipher.doFinal(new byte[16]));
        this.f62034b = b11;
        this.f62035c = C.b(b11);
    }

    public static C6318a b(C6099a c6099a) throws GeneralSecurityException {
        return new C6318a(c6099a.f().d(e.a()));
    }

    @Override // d8.c
    public final byte[] a(int i11, byte[] bArr) throws GeneralSecurityException {
        byte[] d11;
        if (i11 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!f62031d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = f62032e.get();
        cipher.init(1, this.f62033a);
        int length = bArr.length;
        int a11 = length == 0 ? 1 : C3124a.a(length, 1, 16, 1);
        if (a11 * 16 == bArr.length) {
            d11 = h.c(bArr, (a11 - 1) * 16, this.f62034b, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (a11 - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            d11 = h.d(copyOf, this.f62035c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i12 = 0; i12 < a11 - 1; i12++) {
            int i13 = i12 * 16;
            for (int i14 = 0; i14 < 16; i14++) {
                bArr3[i14] = (byte) (bArr2[i14] ^ bArr[i14 + i13]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i15 = 0; i15 < 16; i15++) {
            bArr3[i15] = (byte) (bArr2[i15] ^ d11[i15]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i11 ? bArr2 : Arrays.copyOf(bArr2, i11);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
