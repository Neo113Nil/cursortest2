package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhsa extends zzidr implements zzifd {
    private static final zzhsa zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzhsc zzb;
    private int zzc;
    private int zzd;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zze = zzhsaVar;
        zzidr.zzbu(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhsa zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhsa) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhrz zze() {
        return (zzhrz) zze.zzbn();
    }

    public static zzhsa zzg() {
        return zze;
    }

    public final zzhsc zza() {
        zzhsc zzhscVar = this.zzb;
        return zzhscVar == null ? zzhsc.zzd() : zzhscVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhsa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrz(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzf;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhsa.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzhsc zzhscVar) {
        zzhscVar.getClass();
        this.zzb = zzhscVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
