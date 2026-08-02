package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsg extends zzifm implements zzigx {
    private static final zzhsg zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsi zzb;
    private int zzc;

    static {
        zzhsg zzhsgVar = new zzhsg();
        zzd = zzhsgVar;
        zzifm.y(zzhsg.class, zzhsgVar);
    }

    private zzhsg() {
    }

    public static zzhsg F(zziei zzieiVar, zziew zziewVar) {
        return (zzhsg) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhsf G() {
        return (zzhsf) zzd.v();
    }

    public final zzhsi D() {
        zzhsi zzhsiVar = this.zzb;
        return zzhsiVar == null ? zzhsi.F() : zzhsiVar;
    }

    public final int E() {
        return this.zzc;
    }

    public final /* synthetic */ void H(zzhsi zzhsiVar) {
        this.zzb = zzhsiVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsg();
        }
        if (ordinal == 4) {
            return new zzhsf(zzd);
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
        synchronized (zzhsg.class) {
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
