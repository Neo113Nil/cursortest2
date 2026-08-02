package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbdj extends zzidr implements zzifd {
    private static final zzbdj zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzbdp zzb;
    private zzicn zzc;
    private zzicn zzd;

    static {
        zzbdj zzbdjVar = new zzbdj();
        zze = zzbdjVar;
        zzidr.zzbu(zzbdj.class, zzbdjVar);
    }

    private zzbdj() {
        zzicn zzicnVar = zzicn.zza;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    public static zzbdj zzd(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzbdj) zzidr.zzbT(zze, zzicnVar, zzidbVar);
    }

    public static zzbdj zze(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzbdj) zzidr.zzbV(zze, bArr, zzidbVar);
    }

    public final zzbdp zza() {
        zzbdp zzbdpVar = this.zzb;
        return zzbdpVar == null ? zzbdp.zzj() : zzbdpVar;
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzicn zzc() {
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
            return zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbdj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbdi(bArr);
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
        synchronized (zzbdj.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
