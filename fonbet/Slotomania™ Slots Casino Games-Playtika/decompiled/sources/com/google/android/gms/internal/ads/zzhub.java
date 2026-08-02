package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhub extends zzidr implements zzifd {
    private static final zzhub zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzicn zzb = zzicn.zza;

    static {
        zzhub zzhubVar = new zzhub();
        zzc = zzhubVar;
        zzidr.zzbu(zzhub.class, zzhubVar);
    }

    private zzhub() {
    }

    public static zzhub zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhub) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhua zzd() {
        return (zzhua) zzc.zzbn();
    }

    public static zzifk zze() {
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhub();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhua(bArr);
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
        synchronized (zzhub.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzg(zzicn zzicnVar) {
        zzicnVar.getClass();
        this.zzb = zzicnVar;
    }
}
