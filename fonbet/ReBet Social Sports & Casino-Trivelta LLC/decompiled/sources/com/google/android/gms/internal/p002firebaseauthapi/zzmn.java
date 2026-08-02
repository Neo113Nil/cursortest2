package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzmn implements zzbd {
    private final zzbd zza;
    private final byte[] zzb;

    private zzmn(zzbd zzbdVar, byte[] bArr) {
        this.zza = zzbdVar;
        this.zzb = bArr;
    }

    public static zzbd zza(zzof zzofVar) {
        byte[] zzb;
        zzqb zza = zzofVar.zza(zzbf.zza());
        zzbd zzbdVar = (zzbd) zznq.zza().zza(zza.zzf(), zzbd.class).zzb(zza.zzd());
        zzxz zzb2 = zza.zzb();
        int i10 = zzmm.zza[zzb2.ordinal()];
        if (i10 == 1) {
            zzb = zzpe.zza.zzb();
        } else if (i10 == 2 || i10 == 3) {
            zzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzb2));
            }
            zzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzmn(zzbdVar, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqn.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
