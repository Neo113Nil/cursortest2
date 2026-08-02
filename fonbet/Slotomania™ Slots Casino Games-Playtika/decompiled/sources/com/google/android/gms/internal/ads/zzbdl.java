package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbdl extends zzidr implements zzifd {
    private static final zzbdl zzd;
    private static volatile zzifk zze;
    private int zza;
    private zzbdn zzb;
    private zzicn zzc = zzicn.zza;

    static {
        zzbdl zzbdlVar = new zzbdl();
        zzd = zzbdlVar;
        zzidr.zzbu(zzbdl.class, zzbdlVar);
    }

    private zzbdl() {
    }

    public static zzbdl zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbdn zzb() {
        zzbdn zzbdnVar = this.zzb;
        return zzbdnVar == null ? zzbdn.zzd() : zzbdnVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzicn zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbdl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbdk(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zze;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzbdl.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
