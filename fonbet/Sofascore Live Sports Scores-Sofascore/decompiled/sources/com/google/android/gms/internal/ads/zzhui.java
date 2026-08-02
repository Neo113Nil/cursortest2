package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhui extends zzifm implements zzigx {
    private static final zzhui zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhuk zzc;

    static {
        zzhui zzhuiVar = new zzhui();
        zzd = zzhuiVar;
        zzifm.y(zzhui.class, zzhuiVar);
    }

    private zzhui() {
    }

    public static zzhui F(zziei zzieiVar, zziew zziewVar) {
        return (zzhui) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhuh G() {
        return (zzhuh) zzd.v();
    }

    public static zzihe H() {
        return zzd.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhuk E() {
        zzhuk zzhukVar = this.zzc;
        return zzhukVar == null ? zzhuk.G() : zzhukVar;
    }

    public final /* synthetic */ void I(zzhuk zzhukVar) {
        this.zzc = zzhukVar;
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
            return new zzhui();
        }
        if (ordinal == 4) {
            return new zzhuh(zzd);
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
        synchronized (zzhui.class) {
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
