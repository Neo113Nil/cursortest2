package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziaq extends zzidr implements zzifd {
    private static final zziaq zzf;
    private static volatile zzifk zzg;
    private int zza;
    private zzicn zzb = zzicn.zza;
    private String zzc = "";
    private zzied zzd = zzbM();
    private boolean zze;

    static {
        zziaq zziaqVar = new zziaq();
        zzf = zziaqVar;
        zzidr.zzbu(zziaq.class, zziaqVar);
    }

    private zziaq() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (ordinal == 3) {
            return new zziaq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziap(bArr);
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
        synchronized (zziaq.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
