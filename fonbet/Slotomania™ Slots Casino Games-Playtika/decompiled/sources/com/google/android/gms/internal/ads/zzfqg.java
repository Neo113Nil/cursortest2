package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfqg extends zzidr implements zzifd {
    private static final zzfqg zzi;
    private static volatile zzifk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfqg zzfqgVar = new zzfqg();
        zzi = zzfqgVar;
        zzidr.zzbu(zzfqg.class, zzfqgVar);
    }

    private zzfqg() {
    }

    public static zzfqf zza() {
        return (zzfqf) zzi.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfqg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqf(bArr);
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
        synchronized (zzfqg.class) {
            zzifkVar = zzj;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzi);
                zzj = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}
