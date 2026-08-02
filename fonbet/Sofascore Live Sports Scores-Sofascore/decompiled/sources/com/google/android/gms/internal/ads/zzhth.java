package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhth extends zzifm implements zzigx {
    private static final zzhth zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zziei zzc = zziei.b;
    private zzhtj zzd;

    static {
        zzhth zzhthVar = new zzhth();
        zze = zzhthVar;
        zzifm.y(zzhth.class, zzhthVar);
    }

    private zzhth() {
    }

    public static zzhth G(zziei zzieiVar, zziew zziewVar) {
        return (zzhth) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhtg H() {
        return (zzhtg) zze.v();
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

    public final zzhtj F() {
        zzhtj zzhtjVar = this.zzd;
        return zzhtjVar == null ? zzhtj.H() : zzhtjVar;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void K(zzhtj zzhtjVar) {
        this.zzd = zzhtjVar;
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
            return new zzhth();
        }
        if (ordinal == 4) {
            return new zzhtg(zze);
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
        synchronized (zzhth.class) {
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
