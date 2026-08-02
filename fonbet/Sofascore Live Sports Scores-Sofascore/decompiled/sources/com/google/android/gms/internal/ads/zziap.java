package com.google.android.gms.internal.ads;

import defpackage.j40;
import defpackage.yhk;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziap implements zzhek {
    public final SecretKeySpec a;
    public final byte[] b;

    public zziap(byte[] bArr, zzich zzichVar) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        j40 j40Var = zzhka.a;
        zzicf.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = zzichVar.b();
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
        if (length < length2 + 28) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        j40 j40Var = zzhka.a;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
        Cipher cipher = (Cipher) zzhka.a.get();
        cipher.init(2, this.a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
