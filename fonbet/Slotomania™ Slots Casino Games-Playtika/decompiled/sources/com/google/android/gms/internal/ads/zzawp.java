package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzawp extends zzidr implements zzifd {
    private static final zzawp zzo;
    private static volatile zzifk zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zzied zzm = zzbM();

    static {
        zzawp zzawpVar = new zzawp();
        zzo = zzawpVar;
        zzidr.zzbu(zzawp.class, zzawpVar);
    }

    private zzawp() {
    }

    public static zzawl zza() {
        return (zzawl) zzo.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzawn.class, "zzn", zzawo.zza});
        }
        if (ordinal == 3) {
            return new zzawp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawl(bArr);
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzp;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzawp.class) {
            zzifkVar = zzp;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzo);
                zzp = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }
}
