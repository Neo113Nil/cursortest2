package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzej extends zzkc implements zzlk {
    private static final zzej zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzkj zzh = zzkc.zzbG();
    private boolean zzi;
    private zzeq zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzej zzejVar = new zzej();
        zza = zzejVar;
        zzkc.zzbM(zzej.class, zzejVar);
    }

    private zzej() {
    }

    public static zzei zzc() {
        return (zzei) zza.zzbA();
    }

    static /* synthetic */ void zzi(zzej zzejVar, String str) {
        zzejVar.zze |= 2;
        zzejVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzej zzejVar, int i11, zzel zzelVar) {
        zzelVar.getClass();
        zzkj zzkjVar = zzejVar.zzh;
        if (!zzkjVar.zzc()) {
            zzejVar.zzh = zzkc.zzbH(zzkjVar);
        }
        zzejVar.zzh.set(i11, zzelVar);
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzel zze(int i11) {
        return (zzel) this.zzh.get(i11);
    }

    public final zzeq zzf() {
        zzeq zzeqVar = this.zzj;
        return zzeqVar == null ? zzeq.zzb() : zzeqVar;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzh;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzel.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i12 == 3) {
            return new zzej();
        }
        zzef zzefVar = null;
        if (i12 == 4) {
            return new zzei(zzefVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzm() {
        return this.zzl;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zze & 64) != 0;
    }
}
