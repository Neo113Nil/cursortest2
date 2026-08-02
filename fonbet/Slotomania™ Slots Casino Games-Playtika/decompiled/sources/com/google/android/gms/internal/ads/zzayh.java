package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzayh extends zzidr implements zzifd {
    private static final zzayh zzm;
    private static volatile zzifk zzn;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzayj zzl;
    private zzidz zze = zzbC();
    private zzied zzh = zzbM();

    static {
        zzayh zzayhVar = new zzayh();
        zzm = zzayhVar;
        zzidr.zzbu(zzayh.class, zzayhVar);
    }

    private zzayh() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzm, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzayn.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (ordinal == 3) {
            return new zzayh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayg(bArr);
        }
        if (ordinal == 5) {
            return zzm;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzn;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzayh.class) {
            zzifkVar = zzn;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzm);
                zzn = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
