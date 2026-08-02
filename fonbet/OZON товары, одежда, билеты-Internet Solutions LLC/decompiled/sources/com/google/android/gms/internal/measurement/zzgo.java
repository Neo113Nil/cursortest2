package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgo extends zzkc implements zzlk {
    private static final zzgo zza;
    private zzkj zze = zzkc.zzbG();

    static {
        zzgo zzgoVar = new zzgo();
        zza = zzgoVar;
        zzkc.zzbM(zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public static zzgo zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgq.class});
        }
        if (i12 == 3) {
            return new zzgo();
        }
        zzgm zzgmVar = null;
        if (i12 == 4) {
            return new zzgn(zzgmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
