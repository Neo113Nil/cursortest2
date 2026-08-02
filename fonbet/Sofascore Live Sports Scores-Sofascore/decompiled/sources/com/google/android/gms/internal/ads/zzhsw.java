package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsw extends zzifm implements zzigx {
    private static final zzhsw zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsy zzb;
    private int zzc;

    static {
        zzhsw zzhswVar = new zzhsw();
        zzd = zzhswVar;
        zzifm.y(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    public static zzhsw E(zziei zzieiVar, zziew zziewVar) {
        return (zzhsw) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhsv F() {
        return (zzhsv) zzd.v();
    }

    public final zzhsy D() {
        zzhsy zzhsyVar = this.zzb;
        return zzhsyVar == null ? zzhsy.F() : zzhsyVar;
    }

    public final /* synthetic */ void G(zzhsy zzhsyVar) {
        this.zzb = zzhsyVar;
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
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsw();
        }
        if (ordinal == 4) {
            return new zzhsv(zzd);
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
        synchronized (zzhsw.class) {
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
