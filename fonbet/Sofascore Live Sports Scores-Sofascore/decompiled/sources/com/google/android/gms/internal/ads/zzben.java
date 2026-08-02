package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzben extends zzifm implements zzigx {
    private static final zzben zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzbep zzb;
    private zziei zzc = zziei.b;

    static {
        zzben zzbenVar = new zzben();
        zzd = zzbenVar;
        zzifm.y(zzben.class, zzbenVar);
    }

    private zzben() {
    }

    public static zzben H() {
        return zzd;
    }

    public final boolean D() {
        return (this.zza & 1) != 0;
    }

    public final zzbep E() {
        zzbep zzbepVar = this.zzb;
        return zzbepVar == null ? zzbep.G() : zzbepVar;
    }

    public final boolean F() {
        return (this.zza & 2) != 0;
    }

    public final zziei G() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzben();
        }
        if (ordinal == 4) {
            return new zzbem(zzd);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zze;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzben.class) {
            try {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
