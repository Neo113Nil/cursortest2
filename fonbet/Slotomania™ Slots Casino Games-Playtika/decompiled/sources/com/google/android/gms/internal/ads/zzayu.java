package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzayu extends zzidr implements zzifd {
    private static final zzayu zze;
    private static volatile zzifk zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private zzicn zzd = zzicn.zza;

    static {
        zzayu zzayuVar = new zzayu();
        zze = zzayuVar;
        zzidr.zzbu(zzayu.class, zzayuVar);
    }

    private zzayu() {
    }

    public static zzayu zze() {
        return zze;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzicn zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzayu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayt(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzf;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzayu.class) {
            zzifkVar = zzf;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zze);
                zzf = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
