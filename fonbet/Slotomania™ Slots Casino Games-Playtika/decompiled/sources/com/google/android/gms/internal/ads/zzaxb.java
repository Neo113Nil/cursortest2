package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaxb extends zzidr implements zzifd {
    private static final zzaxb zzi;
    private static volatile zzifk zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzi = zzaxbVar;
        zzidr.zzbu(zzaxb.class, zzaxbVar);
    }

    private zzaxb() {
    }

    public static zzaxa zza() {
        return (zzaxa) zzi.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxc.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxa(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzj;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzaxb.class) {
            zzifkVar = zzj;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzi);
                zzj = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }
}
