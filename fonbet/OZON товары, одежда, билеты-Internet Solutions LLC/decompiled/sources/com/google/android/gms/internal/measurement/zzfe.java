package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzfe extends zzkc implements zzlk {
    private static final zzfe zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private zzkj zzi = zzkc.zzbG();
    private zzkj zzj = zzkc.zzbG();
    private zzkj zzk = zzkc.zzbG();
    private String zzl = "";
    private zzkj zzn = zzkc.zzbG();
    private zzkj zzo = zzkc.zzbG();
    private String zzp = "";

    static {
        zzfe zzfeVar = new zzfe();
        zza = zzfeVar;
        zzkc.zzbM(zzfe.class, zzfeVar);
    }

    private zzfe() {
    }

    public static zzfd zze() {
        return (zzfd) zza.zzbA();
    }

    public static zzfe zzg() {
        return zza;
    }

    static /* synthetic */ void zzo(zzfe zzfeVar, int i11, zzfc zzfcVar) {
        zzfcVar.getClass();
        zzkj zzkjVar = zzfeVar.zzj;
        if (!zzkjVar.zzc()) {
            zzfeVar.zzj = zzkc.zzbH(zzkjVar);
        }
        zzfeVar.zzj.set(i11, zzfcVar);
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzfc zzd(int i11) {
        return (zzfc) this.zzj.get(i11);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final String zzi() {
        return this.zzp;
    }

    public final List zzj() {
        return this.zzk;
    }

    public final List zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    protected final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzkc.zzbL(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzfi.class, "zzj", zzfc.class, "zzk", zzeh.class, "zzl", "zzm", "zzn", zzgs.class, "zzo", zzfa.class, "zzp"});
        }
        if (i12 == 3) {
            return new zzfe();
        }
        zzey zzeyVar = null;
        if (i12 == 4) {
            return new zzfd(zzeyVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzi;
    }

    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }
}
