package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzayr extends zzidr implements zzifd {
    private static final zzayr zzh;
    private static volatile zzifk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        zzayr zzayrVar = new zzayr();
        zzh = zzayrVar;
        zzidr.zzbu(zzayr.class, zzayrVar);
    }

    private zzayr() {
    }

    public static zzayq zza() {
        return (zzayq) zzh.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzayr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayq(bArr);
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
        synchronized (zzayr.class) {
            zzifkVar = zzi;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzh);
                zzi = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
