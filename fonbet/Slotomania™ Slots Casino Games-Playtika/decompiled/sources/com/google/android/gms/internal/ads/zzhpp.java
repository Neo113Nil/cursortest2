package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpp implements zzhds {
    private zzhpp(zzhds zzhdsVar, zzhtb zzhtbVar, byte[] bArr) {
    }

    public static zzhds zza(zzhlr zzhlrVar) throws GeneralSecurityException {
        byte[] zzc;
        zzhne zzc2 = zzhlrVar.zzc(zzhda.zza());
        zzhds zzhdsVar = (zzhds) zzhlg.zza().zzc(zzc2.zzg(), zzhds.class).zza(zzc2.zzb());
        zzhtb zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzhmk.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            zzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else {
            zzc = zzhmk.zzb(zzhlrVar.zzb().intValue()).zzc();
        }
        return new zzhpp(zzhdsVar, zzd, zzc);
    }
}
