package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgq extends zzkc implements zzlk {
    private static final zzgq zza;
    private int zze;
    private String zzf = "";
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgq zzgqVar = new zzgq();
        zza = zzgqVar;
        zzkc.zzbM(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        }
        if (i12 == 3) {
            return new zzgq();
        }
        zzgm zzgmVar = null;
        if (i12 == 4) {
            return new zzgp(zzgmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
