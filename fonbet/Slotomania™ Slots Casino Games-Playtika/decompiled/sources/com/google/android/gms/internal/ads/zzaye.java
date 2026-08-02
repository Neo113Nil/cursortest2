package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaye extends zzidr implements zzifd {
    private static final zzaye zzj;
    private static volatile zzifk zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzaye zzayeVar = new zzaye();
        zzj = zzayeVar;
        zzidr.zzbu(zzaye.class, zzayeVar);
    }

    private zzaye() {
    }

    public static zzayd zza() {
        return (zzayd) zzj.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzaye();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayd(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzk;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzaye.class) {
            zzifkVar = zzk;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzj);
                zzk = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
