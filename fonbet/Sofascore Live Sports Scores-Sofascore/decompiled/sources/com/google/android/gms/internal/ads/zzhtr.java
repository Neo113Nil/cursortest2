package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtr extends zzifm implements zzigx {
    private static final zzhtr zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhtr zzhtrVar = new zzhtr();
        zzc = zzhtrVar;
        zzifm.y(zzhtr.class, zzhtrVar);
    }

    private zzhtr() {
    }

    public static zzhtq F() {
        return (zzhtq) zzc.v();
    }

    public static zzhtr G() {
        return zzc;
    }

    public final zzhtl D() {
        zzhtl a = zzhtl.a(this.zza);
        return a == null ? zzhtl.UNRECOGNIZED : a;
    }

    public final int E() {
        return this.zzb;
    }

    public final /* synthetic */ void H(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    public final /* synthetic */ void I(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhtr();
        }
        if (ordinal == 4) {
            return new zzhtq(zzc);
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
        synchronized (zzhtr.class) {
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
