package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
public final class zzfq extends zzkc implements zzlk {
    private static final zzfq zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfq zzfqVar = new zzfq();
        zza = zzfqVar;
        zzkc.zzbM(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zzc() {
        return (zzfp) zza.zzbA();
    }

    static /* synthetic */ void zze(zzfq zzfqVar, int i11) {
        zzfqVar.zze |= 1;
        zzfqVar.zzf = i11;
    }

    static /* synthetic */ void zzf(zzfq zzfqVar, long j11) {
        zzfqVar.zze |= 2;
        zzfqVar.zzg = j11;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzfq();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzfp(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
