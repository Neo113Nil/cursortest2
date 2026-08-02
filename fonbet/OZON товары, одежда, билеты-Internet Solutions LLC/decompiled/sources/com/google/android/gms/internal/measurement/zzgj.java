package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgj extends zzkc implements zzlk {
    private static final zzgj zza;
    private int zze;
    private int zzf;
    private zzki zzg = zzkc.zzbE();

    static {
        zzgj zzgjVar = new zzgj();
        zza = zzgjVar;
        zzkc.zzbM(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public static zzgi zzd() {
        return (zzgi) zza.zzbA();
    }

    static /* synthetic */ void zzg(zzgj zzgjVar, int i11) {
        zzgjVar.zze |= 1;
        zzgjVar.zzf = i11;
    }

    static /* synthetic */ void zzh(zzgj zzgjVar, Iterable iterable) {
        zzki zzkiVar = zzgjVar.zzg;
        if (!zzkiVar.zzc()) {
            zzgjVar.zzg = zzkc.zzbF(zzkiVar);
        }
        zzil.zzbw(iterable, zzgjVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i11) {
        return this.zzg.zza(i11);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzgj();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzgi(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
