package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzy extends zzuz<zzy, zzx> implements zzwl {
    private static final zzy zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzuz.zzak(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzy();
        }
        zzn zznVar = null;
        if (i12 == 4) {
            return new zzx(zznVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int zzc() {
        return this.zzg;
    }
}
