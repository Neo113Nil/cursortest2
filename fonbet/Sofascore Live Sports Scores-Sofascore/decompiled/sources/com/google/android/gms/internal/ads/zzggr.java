package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggr extends zzifm implements zzigx {
    private static final zzggr zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzggt zzb;
    private zziei zzc;
    private zziei zzd;
    private int zze;

    static {
        zzggr zzggrVar = new zzggr();
        zzf = zzggrVar;
        zzifm.y(zzggr.class, zzggrVar);
    }

    private zzggr() {
        mpo mpoVar = zziei.b;
        this.zzc = mpoVar;
        this.zzd = mpoVar;
    }

    public static zzggq G() {
        return (zzggq) zzf.v();
    }

    public final zzggt D() {
        zzggt zzggtVar = this.zzb;
        return zzggtVar == null ? zzggt.J() : zzggtVar;
    }

    public final zziei E() {
        return this.zzc;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final /* synthetic */ void H(zzggt zzggtVar) {
        this.zzb = zzggtVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    public final int K() {
        int a = zzghi.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final /* synthetic */ void L(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", lkn.t});
        }
        if (ordinal == 3) {
            return new zzggr();
        }
        if (ordinal == 4) {
            return new zzggq(zzf);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzg;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzggr.class) {
            try {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
