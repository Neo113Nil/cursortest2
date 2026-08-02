package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhry extends zzifm implements zzigx {
    private static final zzhry zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhsc zzc;
    private zziei zzd = zziei.b;

    static {
        zzhry zzhryVar = new zzhry();
        zze = zzhryVar;
        zzifm.y(zzhry.class, zzhryVar);
    }

    private zzhry() {
    }

    public static zzhrx G() {
        return (zzhrx) zze.v();
    }

    public static zzhry H() {
        return zze;
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhsc E() {
        zzhsc zzhscVar = this.zzc;
        return zzhscVar == null ? zzhsc.F() : zzhscVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final /* synthetic */ void I(zzhsc zzhscVar) {
        this.zzc = zzhscVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
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
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhry();
        }
        if (ordinal == 4) {
            return new zzhrx(zze);
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
        synchronized (zzhry.class) {
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
