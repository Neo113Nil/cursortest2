package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzihr extends zzidr implements zzifd {
    private static final zzihr zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzicn zzd = zzicn.zza;

    static {
        zzihr zzihrVar = new zzihr();
        zze = zzihrVar;
        zzidr.zzbu(zzihr.class, zzihrVar);
    }

    private zzihr() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzihq.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzihr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihp(bArr);
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
        synchronized (zzihr.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
