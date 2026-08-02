package i8;

import S0.C;
import T7.E;
import X7.a;
import com.google.crypto.tink.internal.M;
import d8.C6099a;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class f implements S7.d {

    /* renamed from: d, reason: collision with root package name */
    public static final a.EnumC0605a f66087d = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f66088e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f66089f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f66090g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final d8.c f66091a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f66092b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f66093c;

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

    private f(byte[] bArr, C7306a c7306a) throws GeneralSecurityException {
        if (!f66087d.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(K00.b.e(bArr.length, " bytes; key must have 32 or 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f66092b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f66091a = o.b(C6099a.e(d8.b.b(copyOfRange.length), C7307b.a(copyOfRange, S7.e.a())));
        this.f66093c = c7306a.d();
    }

    public static f c(Y7.a aVar) throws GeneralSecurityException {
        return new f(aVar.h().d(S7.e.a()), aVar.e());
    }

    private byte[] d(byte[]... bArr) throws GeneralSecurityException {
        byte[] d11;
        int length = bArr.length;
        d8.c cVar = this.f66091a;
        if (length == 0) {
            return cVar.a(16, f66089f);
        }
        byte[] a11 = cVar.a(16, f66088e);
        for (int i11 = 0; i11 < bArr.length - 1; i11++) {
            byte[] bArr2 = bArr[i11];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a11 = h.d(C.b(a11), cVar.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < a11.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - a11.length;
            d11 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i12 = 0; i12 < a11.length; i12++) {
                int i13 = length2 + i12;
                d11[i13] = (byte) (d11[i13] ^ a11[i12]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            d11 = h.d(copyOf, C.b(a11));
        }
        return cVar.a(16, d11);
    }

    private static void e(int i11) throws GeneralSecurityException {
        if (i11 > 126) {
            throw new GeneralSecurityException(E.a(i11, "Too many associated datas: ", " > 126"));
        }
    }

    @Override // S7.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        e(1);
        int length = bArr.length;
        byte[] bArr4 = this.f66093c;
        if (length < bArr4.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!M.b(bArr4, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f66090g.get();
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) copyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f66092b, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArr.length - length2;
        byte[] doFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            doFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = doFinal;
        if (MessageDigest.isEqual(copyOfRange, d(bArr6))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // S7.d
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        e(1);
        int length = bArr.length;
        byte[] bArr4 = this.f66093c;
        if (length > 2147483631 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = f66090g.get();
        byte[][] bArr5 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr5[1] = bArr;
        byte[] d11 = d(bArr5);
        byte[] bArr6 = (byte[]) d11.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f66092b, "AES"), new IvParameterSpec(bArr6));
        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + d11.length + bArr.length);
        System.arraycopy(d11, 0, copyOf, bArr4.length, d11.length);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr4.length + d11.length) == bArr.length) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
