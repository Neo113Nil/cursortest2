package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhrb extends zzidr implements zzifd {
    private static final zzhrb zzc;
    private static volatile zzifk zzd;
    private int zza;
    private int zzb;

    static {
        zzhrb zzhrbVar = new zzhrb();
        zzc = zzhrbVar;
        zzidr.zzbu(zzhrb.class, zzhrbVar);
    }

    private zzhrb() {
    }

    public static zzhrb zzc(zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        return (zzhrb) zzidr.zzbT(zzc, zzicnVar, zzidbVar);
    }

    public static zzhra zzd() {
        return (zzhra) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhrb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhra(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzd;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhrb.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
