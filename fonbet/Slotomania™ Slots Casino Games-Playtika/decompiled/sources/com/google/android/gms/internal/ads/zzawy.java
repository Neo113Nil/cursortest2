package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzawy extends zzidr implements zzifd {
    private static final zzawy zzg;
    private static volatile zzifk zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzawy zzawyVar = new zzawy();
        zzg = zzawyVar;
        zzidr.zzbu(zzawy.class, zzawyVar);
    }

    private zzawy() {
    }

    public static zzawy zzd() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzawy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawx(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzh;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzawy.class) {
            zzifkVar = zzh;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzg);
                zzh = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
