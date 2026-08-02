package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzikw extends zzidr implements zzifd {
    private static final zzikw zzd;
    private static volatile zzifk zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        zzikw zzikwVar = new zzikw();
        zzd = zzikwVar;
        zzidr.zzbu(zzikw.class, zzikwVar);
    }

    private zzikw() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzilj.zza});
        }
        if (ordinal == 3) {
            return new zzikw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzikv(bArr);
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
        synchronized (zzikw.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
