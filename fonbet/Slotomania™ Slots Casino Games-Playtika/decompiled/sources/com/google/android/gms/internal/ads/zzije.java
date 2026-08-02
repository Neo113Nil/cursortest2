package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzije extends zzidr implements zzifd {
    private static final zzije zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzije zzijeVar = new zzije();
        zzf = zzijeVar;
        zzidr.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzijd.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzije();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijc(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzg;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzije.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
