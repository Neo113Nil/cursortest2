package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhoc implements zzhnd {
    private static final zzhoc zza = new zzhoc();

    private zzhoc() {
    }

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhoa.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhoa.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zziam zzd;
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        zzhdl zzc = zzhdnVar.zzc();
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zze = zzhdnVar.zze(i);
            if (zze.zzb().equals(zzhde.zza)) {
                zzhoa zzhoaVar = (zzhoa) zzhncVar.zza(zze);
                zzhdc zza2 = zze.zza();
                if (zza2 instanceof zzhop) {
                    zzd = ((zzhop) zza2).zze();
                } else {
                    if (!(zza2 instanceof zzhlr)) {
                        String name = zza2.getClass().getName();
                        String valueOf = String.valueOf(zza2.zza());
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59 + String.valueOf(valueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzd = ((zzhlr) zza2).zzd();
                }
                zzhmsVar.zza(zzd, zzhoaVar);
            }
        }
        return new zzhob(zzhmsVar.zzb(), (zzhoa) zzhncVar.zza(zzc), null);
    }
}
