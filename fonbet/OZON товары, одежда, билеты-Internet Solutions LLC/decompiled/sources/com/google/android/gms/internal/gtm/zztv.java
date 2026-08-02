package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zztv extends zzuz<zztv, zztu> implements zzwl {
    private static final zztv zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zztv zztvVar = new zztv();
        zza = zztvVar;
        zzuz.zzak(zztv.class, zztvVar);
    }

    private zztv() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzwv(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zztv();
        }
        zztq zztqVar = null;
        if (i12 == 4) {
            return new zztu(zztqVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
