package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
public final class zzfo extends zzkc implements zzlk {
    private static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzkc.zzbM(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfn zzb() {
        return (zzfn) zza.zzbA();
    }

    static /* synthetic */ void zzf(zzfo zzfoVar, int i11) {
        zzfoVar.zze |= 1;
        zzfoVar.zzf = i11;
    }

    static /* synthetic */ void zzg(zzfo zzfoVar, zzgh zzghVar) {
        zzghVar.getClass();
        zzfoVar.zzg = zzghVar;
        zzfoVar.zze |= 2;
    }

    static /* synthetic */ void zzh(zzfo zzfoVar, zzgh zzghVar) {
        zzfoVar.zzh = zzghVar;
        zzfoVar.zze |= 4;
    }

    static /* synthetic */ void zzi(zzfo zzfoVar, boolean z11) {
        zzfoVar.zze |= 8;
        zzfoVar.zzi = z11;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgh zzd() {
        zzgh zzghVar = this.zzg;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final zzgh zze() {
        zzgh zzghVar = this.zzh;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzfo();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzfn(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
