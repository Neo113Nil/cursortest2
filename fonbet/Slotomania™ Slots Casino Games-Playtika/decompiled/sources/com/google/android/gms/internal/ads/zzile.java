package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzile extends zzidr implements zzifd {
    private static final zzile zzl;
    private static volatile zzifk zzm;
    private int zza;
    private long zzd;
    private zzilg zzi;
    private zzili zzj;
    private zziaq zzk;
    private zzicn zzb = zzicn.zza;
    private zzidz zzc = zzbC();
    private zzidz zze = zzbC();
    private zzied zzf = zzidr.zzbM();
    private String zzg = "";
    private zzied zzh = zzbM();

    static {
        zzile zzileVar = new zzile();
        zzl = zzileVar;
        zzidr.zzbu(zzile.class, zzileVar);
    }

    private zzile() {
    }

    public static zzile zzc(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzile) zzidr.zzbV(zzl, bArr, zzidbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzikt.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new zzile();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzild(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzm;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzile.class) {
            zzifkVar = zzm;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzl);
                zzm = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
