package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrq extends zzifm implements zzigx {
    private static final zzhrq zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhrs zzc;

    static {
        zzhrq zzhrqVar = new zzhrq();
        zzd = zzhrqVar;
        zzifm.y(zzhrq.class, zzhrqVar);
    }

    private zzhrq() {
    }

    public static zzhrq F(zziei zzieiVar, zziew zziewVar) {
        return (zzhrq) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhrp G() {
        return (zzhrp) zzd.v();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhrs E() {
        zzhrs zzhrsVar = this.zzc;
        return zzhrsVar == null ? zzhrs.F() : zzhrsVar;
    }

    public final /* synthetic */ void H(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void I(zzhrs zzhrsVar) {
        this.zzc = zzhrsVar;
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
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrq();
        }
        if (ordinal == 4) {
            return new zzhrp(zzd);
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
        synchronized (zzhrq.class) {
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
