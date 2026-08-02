package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhsy extends zzifm implements zzigx {
    private static final zzhsy zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzd = zzhsyVar;
        zzifm.y(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static zzhsx E() {
        return (zzhsx) zzd.v();
    }

    public static zzhsy F() {
        return zzd;
    }

    public final zzhtl D() {
        zzhtl a = zzhtl.a(this.zza);
        return a == null ? zzhtl.UNRECOGNIZED : a;
    }

    public final /* synthetic */ void G(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    public final int H() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int I() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void J(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    public final void K(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsy();
        }
        if (ordinal == 4) {
            return new zzhsx(zzd);
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
        synchronized (zzhsy.class) {
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
