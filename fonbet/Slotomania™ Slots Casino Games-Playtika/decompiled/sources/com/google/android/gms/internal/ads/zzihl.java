package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzihl extends zzidr implements zzifd {
    private static final zzihl zzd;
    private static volatile zzifk zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzihl zzihlVar = new zzihl();
        zzd = zzihlVar;
        zzidr.zzbu(zzihl.class, zzihlVar);
    }

    private zzihl() {
    }

    public static zzihk zzc() {
        return (zzihk) zzd.zzbn();
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzihl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihk(bArr);
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
        synchronized (zzihl.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzc = j;
    }
}
