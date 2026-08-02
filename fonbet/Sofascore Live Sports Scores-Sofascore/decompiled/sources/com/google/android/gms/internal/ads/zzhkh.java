package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhkh implements zzhek {
    public static final byte[] c = zzibr.a("7a806c");
    public static final byte[] d = zzibr.a("46bb91c3c5");
    public static final byte[] e = zzibr.a("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] f = zzibr.a("bae8e37fc83441b16034566b");
    public static final byte[] g = zzibr.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final SecretKeySpec a;
    public final byte[] b;

    public zzhkh(byte[] bArr, byte[] bArr2) {
        this.b = bArr2;
        zzicf.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(d);
            byte[] bArr2 = g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
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
        try {
            Cipher cipher = (Cipher) zzhlt.a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.a, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }
}
