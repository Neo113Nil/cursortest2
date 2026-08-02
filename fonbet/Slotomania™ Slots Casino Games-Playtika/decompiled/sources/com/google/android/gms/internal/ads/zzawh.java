package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzawh extends zzidr implements zzifd {
    private static final zzawh zzj;
    private static volatile zzifk zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzawy zzg;
    private zzaxe zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzawh zzawhVar = new zzawh();
        zzj = zzawhVar;
        zzidr.zzbu(zzawh.class, zzawhVar);
    }

    private zzawh() {
    }

    public static zzawg zze() {
        return (zzawg) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzawy zzc() {
        zzawy zzawyVar = this.zzg;
        return zzawyVar == null ? zzawy.zzd() : zzawyVar;
    }

    public final zzaxe zzd() {
        zzaxe zzaxeVar = this.zzh;
        return zzaxeVar == null ? zzaxe.zza() : zzaxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzawk.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzawh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawg(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzk;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzawh.class) {
            zzifkVar = zzk;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzj);
                zzk = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }
}
