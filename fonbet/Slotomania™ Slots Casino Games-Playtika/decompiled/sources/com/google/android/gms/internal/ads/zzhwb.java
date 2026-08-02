package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhwb implements zzhnd {
    private static final zzhwb zza = new zzhwb();
    private static final zzhmx zzb = zzhmx.zzd(zzhvy.zza, zzhlr.class, zzhdw.class);

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhdw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhdw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zziam zzd;
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zze = ((zzhdn) zzhdoVar).zze(i);
            if (zze.zzb().equals(zzhde.zza)) {
                zzhdw zzhdwVar = (zzhdw) zzhncVar.zza(zze);
                zzhdc zza2 = zze.zza();
                if (zza2 instanceof zzhxd) {
                    zzd = ((zzhxd) zza2).zze();
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
                zzhmsVar.zza(zzd, new zzhvz(zzhdwVar, zze.zzc()));
            }
        }
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        return new zzhwa(zzhmsVar.zzb(), (zzhluVar == null || zzhluVar.zza()) ? zzhly.zza : zzhme.zza().zzb().zza(zzhdoVar, zzhluVar, "public_key_verify", "verify"));
    }
}
