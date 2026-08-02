package com.google.android.gms.internal.ads;

import defpackage.pmo;
import defpackage.yhk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhll implements zzhek {
    public final byte[] a;
    public final byte[] b;
    public final Provider c;

    public zzhll(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = bArr;
        this.b = bArr2;
        this.c = provider;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            yhk.s("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] d = pmo.d(pmo.c(this.a), pmo.c(bArr4));
        ByteBuffer order = ByteBuffer.allocate(d.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = zzhkn.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
