package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhru extends zzifm implements zzigx {
    private static final zzhru zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhry zzc;
    private zzhtn zzd;

    static {
        zzhru zzhruVar = new zzhru();
        zze = zzhruVar;
        zzifm.y(zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static zzhru G(zziei zzieiVar, zziew zziewVar) {
        return (zzhru) zzifm.r(zze, zzieiVar, zziewVar);
    }

    public static zzhrt H() {
        return (zzhrt) zze.v();
    }

    public static zzihe I() {
        return zze.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhry E() {
        zzhry zzhryVar = this.zzc;
        return zzhryVar == null ? zzhry.H() : zzhryVar;
    }

    public final zzhtn F() {
        zzhtn zzhtnVar = this.zzd;
        return zzhtnVar == null ? zzhtn.I() : zzhtnVar;
    }

    public final /* synthetic */ void J(zzhry zzhryVar) {
        this.zzc = zzhryVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void K(zzhtn zzhtnVar) {
        this.zzd = zzhtnVar;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhru();
        }
        if (ordinal == 4) {
            return new zzhrt(zze);
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
        synchronized (zzhru.class) {
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
