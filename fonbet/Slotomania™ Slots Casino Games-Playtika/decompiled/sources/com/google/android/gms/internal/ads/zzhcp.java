package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhcp extends zzidr implements zzifd {
    private static final zzhcp zzd;
    private static volatile zzifk zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhcp zzhcpVar = new zzhcp();
        zzd = zzhcpVar;
        zzidr.zzbu(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
    }

    public static zzhco zza() {
        return (zzhco) zzd.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzhcm.zza});
        }
        if (ordinal == 3) {
            return new zzhcp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhco(bArr);
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
        synchronized (zzhcp.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
