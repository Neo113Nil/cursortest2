package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhro extends zzifm implements zzigx {
    private static final zzhro zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zziei zzc = zziei.b;
    private zzhrs zzd;

    static {
        zzhro zzhroVar = new zzhro();
        zze = zzhroVar;
        zzifm.y(zzhro.class, zzhroVar);
    }

    private zzhro() {
    }

    public static zzhro G(zziei zzieiVar, zziew zziewVar) {
        return (zzhro) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhrn H() {
        return (zzhrn) zze.v();
    }

    public static zzihe I() {
        return zze.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zziei E() {
        return this.zzc;
    }

    public final zzhrs F() {
        zzhrs zzhrsVar = this.zzd;
        return zzhrsVar == null ? zzhrs.F() : zzhrsVar;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void K(zzhrs zzhrsVar) {
        this.zzd = zzhrsVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhro();
        }
        if (ordinal == 4) {
            return new zzhrn(zze);
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
        synchronized (zzhro.class) {
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
