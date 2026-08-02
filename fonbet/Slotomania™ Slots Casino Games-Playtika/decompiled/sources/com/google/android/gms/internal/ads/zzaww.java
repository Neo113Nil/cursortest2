package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaww extends zzidr implements zzifd {
    private static final zzaww zzh;
    private static volatile zzifk zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaww zzawwVar = new zzaww();
        zzh = zzawwVar;
        zzidr.zzbu(zzaww.class, zzawwVar);
    }

    private zzaww() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzaww();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawv(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzi;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzaww.class) {
            zzifkVar = zzi;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzh);
                zzi = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
