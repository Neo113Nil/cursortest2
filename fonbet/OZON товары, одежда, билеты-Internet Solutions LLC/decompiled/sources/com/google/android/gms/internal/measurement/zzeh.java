package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzeh extends zzkc implements zzlk {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkj zzg = zzkc.zzbG();
    private zzkj zzh = zzkc.zzbG();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzkc.zzbM(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    static /* synthetic */ void zzi(zzeh zzehVar, int i11, zzes zzesVar) {
        zzesVar.getClass();
        zzkj zzkjVar = zzehVar.zzg;
        if (!zzkjVar.zzc()) {
            zzehVar.zzg = zzkc.zzbH(zzkjVar);
        }
        zzehVar.zzg.set(i11, zzesVar);
    }

    static /* synthetic */ void zzj(zzeh zzehVar, int i11, zzej zzejVar) {
        zzejVar.getClass();
        zzkj zzkjVar = zzehVar.zzh;
        if (!zzkjVar.zzc()) {
            zzehVar.zzh = zzkc.zzbH(zzkjVar);
        }
        zzehVar.zzh.set(i11, zzejVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i11) {
        return (zzej) this.zzh.get(i11);
    }

    public final zzes zzf(int i11) {
        return (zzes) this.zzg.get(i11);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
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
            return zzkc.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzeh();
        }
        zzef zzefVar = null;
        if (i12 == 4) {
            return new zzeg(zzefVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }
}
