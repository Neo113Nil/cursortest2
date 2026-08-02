package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsm extends zzifm implements zzigx {
    private static final zzhsm zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhsm zzhsmVar = new zzhsm();
        zzc = zzhsmVar;
        zzifm.y(zzhsm.class, zzhsmVar);
    }

    private zzhsm() {
    }

    public static zzhsm F(zziei zzieiVar, zziew zziewVar) {
        return (zzhsm) zzifm.r(zzc, zzieiVar, zziewVar);
    }

    public static zzhsl G() {
        return (zzhsl) zzc.v();
    }

    public final int D() {
        return this.zza;
    }

    public final int E() {
        return this.zzb;
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhsm();
        }
        if (ordinal == 4) {
            return new zzhsl(zzc);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzd;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhsm.class) {
            try {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
