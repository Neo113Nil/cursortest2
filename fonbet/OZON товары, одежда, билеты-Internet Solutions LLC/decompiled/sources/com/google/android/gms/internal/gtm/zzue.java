package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzue extends zzuz<zzue, zzud> implements zzwl {
    private static final zzue zza;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzue zzueVar = new zzue();
        zza = zzueVar;
        zzuz.zzak(zzue.class, zzueVar);
    }

    private zzue() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i12 == 2) {
            return new zzwv(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzue();
        }
        zztq zztqVar = null;
        if (i12 == 4) {
            return new zzud(zztqVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
