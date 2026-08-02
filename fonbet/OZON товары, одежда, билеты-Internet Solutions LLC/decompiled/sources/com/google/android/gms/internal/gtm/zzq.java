package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzq extends zzuz<zzq, zzo> implements zzwl {
    private static final zzq zza;
    private int zze;
    private int zzf = 1;
    private int zzg;
    private int zzh;

    static {
        zzq zzqVar = new zzq();
        zza = zzqVar;
        zzuz.zzak(zzq.class, zzqVar);
    }

    private zzq() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", zzp.zza, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzq();
        }
        zzn zznVar = null;
        if (i12 == 4) {
            return new zzo(zznVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
