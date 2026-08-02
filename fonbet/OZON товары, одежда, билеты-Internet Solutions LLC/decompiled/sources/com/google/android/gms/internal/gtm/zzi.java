package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzi extends zzuz<zzi, zzh> implements zzwl {
    private static final zzi zza;
    private int zze;
    private zzak zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzi zziVar = new zzi();
        zza = zziVar;
        zzuz.zzak(zzi.class, zziVar);
    }

    private zzi() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzi();
        }
        zzc zzcVar = null;
        if (i12 == 4) {
            return new zzh(zzcVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
