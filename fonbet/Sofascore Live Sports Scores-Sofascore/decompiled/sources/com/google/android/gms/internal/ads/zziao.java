package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.j40;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziao implements zzhek {
    public static final j40 e = new j40(17);
    public final byte[] a;
    public final zzhrh b;
    public final SecretKeySpec c;
    public final int d;

    public zziao(byte[] bArr, int i, byte[] bArr2) {
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            a70.p("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        int length = bArr.length;
        zzicf.a(length);
        this.c = new SecretKeySpec(bArr, "AES");
        zzhrg b = zzhrg.b(length);
        zzhfr zzhfrVar = zzhfr.a;
        this.b = zzibu.b(zzhrf.c(b, new zzicj(zzich.a(bArr))));
        this.a = bArr2;
    }

    public static zziao a(zzhgo zzhgoVar) {
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use AES-EAX in FIPS-mode.");
            return null;
        }
        zzhgu zzhguVar = zzhgoVar.a;
        zzicj zzicjVar = zzhgoVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        return new zziao(zzicjVar.a.b(), zzhgoVar.a.b, zzhgoVar.c.b());
    }

    public final byte[] b(int i, int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.a(16, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.d;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] b = b(0, length2, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] b2 = b(1, 0, bArr2.length, bArr2);
        byte[] b3 = b(2, length2 + i, i2, bArr);
        int i3 = length - 16;
        byte b4 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b4 = (byte) (b4 | (((bArr[i3 + i4] ^ b2[i4]) ^ b[i4]) ^ b3[i4]));
        }
        if (b4 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(b));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }
}
