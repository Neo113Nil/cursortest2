package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzihn extends zzidr implements zzifd {
    private static final zzihn zzb;
    private static volatile zzifk zzc;
    private zzied zza = zzbM();

    static {
        zzihn zzihnVar = new zzihn();
        zzb = zzihnVar;
        zzidr.zzbu(zzihn.class, zzihnVar);
    }

    private zzihn() {
    }

    public static zzihm zzc() {
        return (zzihm) zzb.zzbn();
    }

    final /* synthetic */ void zzd(zzihl zzihlVar) {
        zzihlVar.getClass();
        zzied zziedVar = this.zza;
        if (!zziedVar.zza()) {
            this.zza = zzidr.zzbN(zziedVar);
        }
        this.zza.add(zzihlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzihl.class});
        }
        if (ordinal == 3) {
            return new zzihn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihm(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzc;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzihn.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }
}
