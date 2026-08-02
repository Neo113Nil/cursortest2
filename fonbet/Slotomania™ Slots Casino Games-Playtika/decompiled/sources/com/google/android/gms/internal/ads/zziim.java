package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziim extends zzidr implements zzifd {
    private static final zziim zze;
    private static volatile zzifk zzf;
    private int zza;
    private zzicn zzb;
    private zzicn zzc;
    private zzicn zzd;

    static {
        zziim zziimVar = new zziim();
        zze = zziimVar;
        zzidr.zzbu(zziim.class, zziimVar);
    }

    private zziim() {
        zzicn zzicnVar = zzicn.zza;
        this.zzb = zzicnVar;
        this.zzc = zzicnVar;
        this.zzd = zzicnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zziim();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziil(bArr);
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
        synchronized (zziim.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
