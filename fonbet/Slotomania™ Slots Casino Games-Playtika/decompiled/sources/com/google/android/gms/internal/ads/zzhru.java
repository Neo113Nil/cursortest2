package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhru extends zzidr implements zzifd {
    private static final zzhru zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzicn zzb = zzicn.zza;

    static {
        zzhru zzhruVar = new zzhru();
        zzc = zzhruVar;
        zzidr.zzbu(zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static zzhru zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhru) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhrt zzd() {
        return (zzhrt) zzc.zzbn();
    }

    public static zzhru zze() {
        return zzc;
    }

    public static zzifk zzg() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzicn zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrt(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzd;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhru.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzh(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }
}
