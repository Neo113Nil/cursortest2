package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaxn extends zzidr implements zzifd {
    private static final zzaxn zzf;
    private static volatile zzifk zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        zzaxn zzaxnVar = new zzaxn();
        zzf = zzaxnVar;
        zzidr.zzbu(zzaxn.class, zzaxnVar);
    }

    private zzaxn() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzidx zzidxVar = zzayp.zza;
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", zzidxVar, "zzc", zzidxVar, "zzd", zzidxVar, "zze", zzidxVar});
        }
        if (ordinal == 3) {
            return new zzaxn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxm(bArr);
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
        synchronized (zzaxn.class) {
            zzifkVar = zzg;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzf);
                zzg = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
