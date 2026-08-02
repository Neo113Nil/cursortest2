package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziiq extends zzidr implements zzifd {
    private static final zziiq zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private zzicn zzc;
    private zzicn zzd;

    static {
        zziiq zziiqVar = new zziiq();
        zze = zziiqVar;
        zzidr.zzbu(zziiq.class, zziiqVar);
    }

    private zziiq() {
        zzicn zzicnVar = zzicn.zza;
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
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zziiq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziip(bArr);
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
        synchronized (zziiq.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
