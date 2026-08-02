package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsk extends zzifm implements zzigx {
    private static final zzhsk zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.b;

    static {
        zzhsk zzhskVar = new zzhsk();
        zzc = zzhskVar;
        zzifm.y(zzhsk.class, zzhskVar);
    }

    private zzhsk() {
    }

    public static zzhsk F(zziei zzieiVar, zziew zziewVar) {
        return (zzhsk) zzifm.r(zzc, zzieiVar, zziewVar);
    }

    public static zzhsj G() {
        return (zzhsj) zzc.v();
    }

    public static zzihe H() {
        return zzc.j();
    }

    public final int D() {
        return this.zza;
    }

    public final zziei E() {
        return this.zzb;
    }

    public final /* synthetic */ void I(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhsk();
        }
        if (ordinal == 4) {
            return new zzhsj(zzc);
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
        synchronized (zzhsk.class) {
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
