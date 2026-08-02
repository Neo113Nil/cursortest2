package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzmp implements zzbg {
    private zzmp(zzbg zzbgVar, byte[] bArr) {
    }

    public static zzbg zza(zzof zzofVar) {
        byte[] zzb;
        zzqb zza = zzofVar.zza(zzbf.zza());
        zzbg zzbgVar = (zzbg) zznq.zza().zza(zza.zzf(), zzbg.class).zzb(zza.zzd());
        zzxz zzb2 = zza.zzb();
        int i10 = zzmo.zza[zzb2.ordinal()];
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
        return new zzmp(zzbgVar, zzb);
    }
}
