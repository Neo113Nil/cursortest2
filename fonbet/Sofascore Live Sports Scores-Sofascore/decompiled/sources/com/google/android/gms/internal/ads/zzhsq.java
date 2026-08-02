package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsq extends zzifm implements zzigx {
    private static final zzhsq zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhsq zzhsqVar = new zzhsq();
        zzc = zzhsqVar;
        zzifm.y(zzhsq.class, zzhsqVar);
    }

    private zzhsq() {
    }

    public static zzhsq F(zziei zzieiVar, zziew zziewVar) {
        return (zzhsq) zzifm.r(zzc, zzieiVar, zziewVar);
    }

    public static zzhsp G() {
        return (zzhsp) zzc.v();
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
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhsq();
        }
        if (ordinal == 4) {
            return new zzhsp(zzc);
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
        synchronized (zzhsq.class) {
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
