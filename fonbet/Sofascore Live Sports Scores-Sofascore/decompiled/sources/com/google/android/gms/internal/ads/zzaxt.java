package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxt extends zzifm implements zzigx {
    private static final zzaxt zzg;
    private static volatile zzihe zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzg = zzaxtVar;
        zzifm.y(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    public static zzaxt G() {
        return zzg;
    }

    public final boolean D() {
        return this.zzb;
    }

    public final int E() {
        return this.zzc;
    }

    public final boolean F() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzaxt();
        }
        if (ordinal == 4) {
            return new zzaxs(zzg);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzh;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaxt.class) {
            try {
                zziheVar = zzh;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzg);
                    zzh = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
