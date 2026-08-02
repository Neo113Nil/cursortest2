package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zziiv extends zzidr implements zzifd {
    private static final zziiv zze;
    private static volatile zzifk zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zziiv zziivVar = new zziiv();
        zze = zziivVar;
        zzidr.zzbu(zziiv.class, zziivVar);
    }

    private zziiv() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzidx zzidxVar = zziit.zza;
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzidxVar, "zzc", "zzd", zzidxVar});
        }
        if (ordinal == 3) {
            return new zziiv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziiu(bArr);
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
        synchronized (zziiv.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
