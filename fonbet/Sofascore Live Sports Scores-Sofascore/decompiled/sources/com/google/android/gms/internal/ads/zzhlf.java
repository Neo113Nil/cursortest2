package com.google.android.gms.internal.ads;

import defpackage.j40;
import defpackage.yhk;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhlf implements zzhek {
    public final byte[] a;
    public final int b;
    public final zzhrh c;

    public zzhlf(byte[] bArr, zzich zzichVar, int i) {
        zzhrg b = zzhrg.b(bArr.length);
        zzhfr zzhfrVar = zzhfr.a;
        this.c = zzibu.b(zzhrf.c(b, new zzicj(zzich.a(bArr))));
        this.a = zzichVar.b();
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            yhk.s("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.b + length2;
        int i2 = i + 28;
        if (length < i2) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            defpackage.zzl.x("invalid salt size");
            return null;
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        zzhrh zzhrhVar = this.c;
        System.arraycopy(zzhrhVar.a(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(zzhrhVar.a(16, bArr5), 0, bArr6, 16, 16);
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        j40 j40Var = zzhka.a;
        zzicf.a(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i3 = i + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, i3);
        if (copyOfRange2.length != 12) {
            defpackage.zzl.x("iv is wrong size");
            return null;
        }
        if (length < i2) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, copyOfRange2, 0, 12);
        Cipher cipher = (Cipher) zzhka.a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i3, length - i3);
    }
}
