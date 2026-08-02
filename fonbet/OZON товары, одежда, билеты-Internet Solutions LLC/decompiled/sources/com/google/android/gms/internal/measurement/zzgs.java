package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgs extends zzkc implements zzlk {
    private static final zzgs zza;
    private int zze;
    private zzkj zzf = zzkc.zzbG();
    private zzgo zzg;

    static {
        zzgs zzgsVar = new zzgs();
        zza = zzgsVar;
        zzkc.zzbM(zzgs.class, zzgsVar);
    }

    private zzgs() {
    }

    public final zzgo zza() {
        zzgo zzgoVar = this.zzg;
        return zzgoVar == null ? zzgo.zzc() : zzgoVar;
    }

    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgx.class, "zzg"});
        }
        if (i12 == 3) {
            return new zzgs();
        }
        zzgm zzgmVar = null;
        if (i12 == 4) {
            return new zzgr(zzgmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
