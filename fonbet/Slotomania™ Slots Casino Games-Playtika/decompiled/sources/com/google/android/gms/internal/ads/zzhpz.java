package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhpz extends zzidr implements zzifd {
    private static final zzhpz zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzicn zzc = zzicn.zza;
    private zzhqd zzd;

    static {
        zzhpz zzhpzVar = new zzhpz();
        zze = zzhpzVar;
        zzidr.zzbu(zzhpz.class, zzhpzVar);
    }

    private zzhpz() {
    }

    public static zzhpz zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhpz) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzhpy zze() {
        return (zzhpy) zze.zzbn();
    }

    public static zzifk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzhqd zzc() {
        zzhqd zzhqdVar = this.zzd;
        return zzhqdVar == null ? zzhqd.zzc() : zzhqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhpz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpy(bArr);
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
        synchronized (zzhpz.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzc = zzicnVar;
    }

    final /* synthetic */ void zzi(zzhqd zzhqdVar) {
        zzhqdVar.getClass();
        this.zzd = zzhqdVar;
        this.zza |= 1;
    }
}
