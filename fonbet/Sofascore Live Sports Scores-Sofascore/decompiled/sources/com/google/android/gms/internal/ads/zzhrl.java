package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.j40;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrl implements zzhrh {
    public static final j40 d = new j40(15);
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public zzhrl(byte[] bArr) {
        zzicf.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, secretKeySpec);
        byte[] a = zzhqq.a(cipher.doFinal(new byte[16]));
        this.b = a;
        this.c = zzhqq.a(a);
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] a(int i, byte[] bArr) {
        byte[] b;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, this.a);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            b = zziat.b(bArr, i4, this.b);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                a70.p("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            if (copyOf.length != 16) {
                a70.p("The lengths of x and y should match.");
                return null;
            }
            b = zziat.b(copyOf, 0, this.c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * 16;
            for (int i7 = 0; i7 < 16; i7++) {
                bArr3[i7] = (byte) (bArr2[i7] ^ bArr[i7 + i6]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                a70.r("Cipher didn't write full block");
                return null;
            }
        }
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr2[i8] ^ b[i8]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        a70.r("Cipher didn't write full block");
        return null;
    }
}
