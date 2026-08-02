package i8;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class m {
    public static byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) throws GeneralSecurityException {
        Mac a11 = k.f66116c.a(str);
        if (i11 > a11.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            a11.init(new SecretKeySpec(new byte[a11.getMacLength()], str));
        } else {
            a11.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i11];
        a11.init(new SecretKeySpec(a11.doFinal(bArr), str));
        byte[] bArr5 = new byte[0];
        int i12 = 1;
        int i13 = 0;
        while (true) {
            a11.update(bArr5);
            a11.update(bArr3);
            a11.update((byte) i12);
            bArr5 = a11.doFinal();
            if (bArr5.length + i13 >= i11) {
                System.arraycopy(bArr5, 0, bArr4, i13, i11 - i13);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i13, bArr5.length);
            i13 += bArr5.length;
            i12++;
        }
    }
}
