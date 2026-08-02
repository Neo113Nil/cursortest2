package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzyo extends zzuz<zzyo, zzyn> implements zzwl {
    private static final zzyo zza;
    private int zze;
    private byte zzh = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzyo zzyoVar = new zzyo();
        zza = zzyoVar;
        zzuz.zzak(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i12 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzyo();
        }
        zzyj zzyjVar = null;
        if (i12 == 4) {
            return new zzyn(zzyjVar);
        }
        if (i12 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
