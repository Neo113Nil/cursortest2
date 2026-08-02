package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtj extends zzifm implements zzigx {
    private static final zzhtj zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.b;

    static {
        zzhtj zzhtjVar = new zzhtj();
        zzc = zzhtjVar;
        zzifm.y(zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
    }

    public static zzhtj F(zziei zzieiVar, zziew zziewVar) {
        return (zzhtj) zzifm.r(zzc, zzieiVar, zziewVar);
    }

    public static zzhti G() {
        return (zzhti) zzc.v();
    }

    public static zzhtj H() {
        return zzc;
    }

    public static zzihe I() {
        return zzc.j();
    }

    public final int D() {
        return this.zza;
    }

    public final zziei E() {
        return this.zzb;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
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
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhtj();
        }
        if (ordinal == 4) {
            return new zzhti(zzc);
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
        synchronized (zzhtj.class) {
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
