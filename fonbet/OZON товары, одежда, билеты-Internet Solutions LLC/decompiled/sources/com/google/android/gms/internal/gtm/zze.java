package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zze extends zzuz<zze, zzd> implements zzwl {
    public static final zzux<zzak, zze> zza;
    private static final zze zze;
    private int zzf;
    private zzm zzg;
    private zzg zzh;
    private byte zzi = 2;

    static {
        zze zzeVar = new zze();
        zze = zzeVar;
        zzuz.zzak(zze.class, zzeVar);
        zza = zzuz.zzaa(zzak.zzi(), zzeVar, zzeVar, null, 47497405, zzye.zzk, zze.class);
    }

    private zze() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zze, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zze();
        }
        zzc zzcVar = null;
        if (i12 == 4) {
            return new zzd(zzcVar);
        }
        if (i12 == 5) {
            return zze;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
