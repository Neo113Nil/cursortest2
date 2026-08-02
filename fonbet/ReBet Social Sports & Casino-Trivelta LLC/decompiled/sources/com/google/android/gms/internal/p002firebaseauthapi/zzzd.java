package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzzd {
    private ECPrivateKey zza;

    public zzzd(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, zzzh zzzhVar) {
        byte[] zza = zzyz.zza(bArr, zzzf.zza(this.zza, zzzf.zza(this.zza.getParams(), zzzhVar, bArr)));
        Mac zza2 = zzzj.zzb.zza(str);
        if (i10 > zza2.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], str));
        } else {
            zza2.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i10];
        zza2.init(new SecretKeySpec(zza2.doFinal(zza), str));
        byte[] bArr5 = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            zza2.update(bArr5);
            zza2.update(bArr3);
            zza2.update((byte) i11);
            bArr5 = zza2.doFinal();
            if (bArr5.length + i12 >= i10) {
                System.arraycopy(bArr5, 0, bArr4, i12, i10 - i12);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i12, bArr5.length);
            i12 += bArr5.length;
            i11++;
        }
    }
}
