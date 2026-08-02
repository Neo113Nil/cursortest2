package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxr extends zzifm implements zzigx {
    private static final zzaxr zzh;
    private static volatile zzihe zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzh = zzaxrVar;
        zzifm.y(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzaxr();
        }
        if (ordinal == 4) {
            return new zzaxq(zzh);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzi;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaxr.class) {
            try {
                zziheVar = zzi;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzh);
                    zzi = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
