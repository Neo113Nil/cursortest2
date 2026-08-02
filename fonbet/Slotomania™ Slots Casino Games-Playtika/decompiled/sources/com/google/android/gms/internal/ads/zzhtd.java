package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@Deprecated
/* loaded from: classes8.dex */
public final class zzhtd extends zzidr implements zzifd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhtd zzd;
    private static volatile zzifk zze;
    private String zzb = "";
    private zzied zzc = zzbM();

    static {
        zzhtd zzhtdVar = new zzhtd();
        zzd = zzhtdVar;
        zzidr.zzbu(zzhtd.class, zzhtdVar);
    }

    private zzhtd() {
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhsk.class});
        }
        if (ordinal == 3) {
            return new zzhtd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtc(bArr);
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
        synchronized (zzhtd.class) {
            zzifkVar = zze;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzd);
                zze = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
