package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhou implements zzhnd {
    private static final zzhou zza = new zzhou();
    private static final zzhmx zzb = zzhmx.zzd(zzhor.zza, zzhlr.class, zzhds.class);

    zzhou() {
    }

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhds.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhds.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zzhlv zzhlvVar;
        zzhlv zzhlvVar2;
        zziam zzd;
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zze = ((zzhdn) zzhdoVar).zze(i);
            if (zze.zzb().equals(zzhde.zza)) {
                zzhds zzhdsVar = (zzhds) zzhncVar.zza(zze);
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
                zzhmsVar.zza(zzd, new zzhos(zzhdsVar, zze.zzc()));
            }
        }
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        if (zzhluVar == null || zzhluVar.zza()) {
            zzhlvVar = zzhly.zza;
            zzhlvVar2 = zzhlvVar;
        } else {
            zzhlw zzb2 = zzhme.zza().zzb();
            zzhlv zza3 = zzb2.zza(zzhdoVar, zzhluVar, "mac", "compute");
            zzhlvVar2 = zzb2.zza(zzhdoVar, zzhluVar, "mac", "verify");
            zzhlvVar = zza3;
        }
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        return new zzhot(new zzhos((zzhds) zzhncVar.zza(zzhdnVar.zzc()), zzhdnVar.zzc().zzc()), zzhmsVar.zzb(), zzhlvVar, zzhlvVar2, null);
    }
}
