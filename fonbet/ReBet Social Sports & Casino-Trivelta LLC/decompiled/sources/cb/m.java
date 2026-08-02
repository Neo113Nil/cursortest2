package cb;

import Xa.b;
import bb.InterfaceC2415a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class m implements InterfaceC2415a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0280b f27685b = b.EnumC0280b.f13669a;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f27686a;
    private byte[] subKey1;
    private byte[] subKey2;

    public m(byte[] bArr) {
        r.a(bArr.length);
        this.f27686a = new SecretKeySpec(bArr, "AES");
        b();
    }

    public static Cipher c() {
        if (f27685b.a()) {
            return (Cipher) i.f27674b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // bb.InterfaceC2415a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c10 = c();
        c10.init(1, this.f27686a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d10 = max * 16 == bArr.length ? f.d(bArr, (max - 1) * 16, this.subKey1, 0, 16) : f.e(Za.a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.subKey2);
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < max - 1; i11++) {
            bArr2 = c10.doFinal(f.d(bArr2, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(c10.doFinal(f.e(d10, bArr2)), i10);
    }

    public final void b() {
        Cipher c10 = c();
        c10.init(1, this.f27686a);
        byte[] b10 = Za.a.b(c10.doFinal(new byte[16]));
        this.subKey1 = b10;
        this.subKey2 = Za.a.b(b10);
    }
}
