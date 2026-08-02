package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaxe extends zzidr implements zzifd {
    private static final zzaxe zzg;
    private static volatile zzifk zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzg = zzaxeVar;
        zzidr.zzbu(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxe zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzaxe();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxd(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzh;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzaxe.class) {
            zzifkVar = zzh;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzg);
                zzh = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
