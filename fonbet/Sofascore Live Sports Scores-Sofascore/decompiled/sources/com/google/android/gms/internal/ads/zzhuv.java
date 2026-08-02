package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuv extends zzifm implements zzigx {
    private static final zzhuv zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhuv zzhuvVar = new zzhuv();
        zzb = zzhuvVar;
        zzifm.y(zzhuv.class, zzhuvVar);
    }

    private zzhuv() {
    }

    public static zzhuu E() {
        return (zzhuu) zzb.v();
    }

    public static zzhuv F() {
        return zzb;
    }

    public final zzhtl D() {
        zzhtl a = zzhtl.a(this.zza);
        return a == null ? zzhtl.UNRECOGNIZED : a;
    }

    public final /* synthetic */ void G(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhuv();
        }
        if (ordinal == 4) {
            return new zzhuu(zzb);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzc;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhuv.class) {
            try {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
