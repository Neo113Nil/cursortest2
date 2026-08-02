package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzgh extends zzkc implements zzlk {
    private static final zzgh zza;
    private zzki zze = zzkc.zzbE();
    private zzki zzf = zzkc.zzbE();
    private zzkj zzg = zzkc.zzbG();
    private zzkj zzh = zzkc.zzbG();

    static {
        zzgh zzghVar = new zzgh();
        zza = zzghVar;
        zzkc.zzbM(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public static zzgg zzf() {
        return (zzgg) zza.zzbA();
    }

    public static zzgh zzh() {
        return zza;
    }

    static /* synthetic */ void zzo(zzgh zzghVar, Iterable iterable) {
        zzki zzkiVar = zzghVar.zze;
        if (!zzkiVar.zzc()) {
            zzghVar.zze = zzkc.zzbF(zzkiVar);
        }
        zzil.zzbw(iterable, zzghVar.zze);
    }

    static /* synthetic */ void zzq(zzgh zzghVar, Iterable iterable) {
        zzki zzkiVar = zzghVar.zzf;
        if (!zzkiVar.zzc()) {
            zzghVar.zzf = zzkc.zzbF(zzkiVar);
        }
        zzil.zzbw(iterable, zzghVar.zzf);
    }

    static /* synthetic */ void zzs(zzgh zzghVar, Iterable iterable) {
        zzghVar.zzy();
        zzil.zzbw(iterable, zzghVar.zzg);
    }

    static /* synthetic */ void zzu(zzgh zzghVar, int i11) {
        zzghVar.zzy();
        zzghVar.zzg.remove(i11);
    }

    static /* synthetic */ void zzv(zzgh zzghVar, Iterable iterable) {
        zzghVar.zzz();
        zzil.zzbw(iterable, zzghVar.zzh);
    }

    static /* synthetic */ void zzx(zzgh zzghVar, int i11) {
        zzghVar.zzz();
        zzghVar.zzh.remove(i11);
    }

    private final void zzy() {
        zzkj zzkjVar = this.zzg;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzg = zzkc.zzbH(zzkjVar);
    }

    private final void zzz() {
        zzkj zzkjVar = this.zzh;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzh = zzkc.zzbH(zzkjVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfq zze(int i11) {
        return (zzfq) this.zzg.get(i11);
    }

    public final zzgj zzi(int i11) {
        return (zzgj) this.zzh.get(i11);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfq.class, "zzh", zzgj.class});
        }
        if (i12 == 3) {
            return new zzgh();
        }
        zzfj zzfjVar = null;
        if (i12 == 4) {
            return new zzgg(zzfjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}
