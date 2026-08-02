package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvb extends zzifm implements zzigx {
    private static final zzhvb zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzhvd zzb;
    private int zzc;
    private zziei zzd = zziei.b;

    static {
        zzhvb zzhvbVar = new zzhvb();
        zze = zzhvbVar;
        zzifm.y(zzhvb.class, zzhvbVar);
    }

    private zzhvb() {
    }

    public static zzhvb G(zziei zzieiVar, zziew zziewVar) {
        return (zzhvb) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhva H() {
        return (zzhva) zze.v();
    }

    public final zzhvd D() {
        zzhvd zzhvdVar = this.zzb;
        return zzhvdVar == null ? zzhvd.H() : zzhvdVar;
    }

    public final int E() {
        return this.zzc;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final /* synthetic */ void I(zzhvd zzhvdVar) {
        this.zzb = zzhvdVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void K(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhvb();
        }
        if (ordinal == 4) {
            return new zzhva(zze);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzf;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhvb.class) {
            try {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
