package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.lkn;
import defpackage.lqo;
import defpackage.mpo;
import defpackage.wpo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggt extends zzifm implements zzigx {
    private static final zzggt zzf;
    private static volatile zzihe zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zzifu zze = wpo.e;

    static {
        zzggt zzggtVar = new zzggt();
        zzf = zzggtVar;
        zzifm.y(zzggt.class, zzggtVar);
    }

    private zzggt() {
    }

    public static zzggt H(mpo mpoVar) {
        zzggt zzggtVar = zzf;
        zziew zziewVar = zziew.b;
        int i = dpo.a;
        zzifm r = zzifm.r(zzggtVar, mpoVar, zziew.c);
        zzifm.C(r);
        return (zzggt) r;
    }

    public static zzggs I() {
        return (zzggs) zzf.v();
    }

    public static zzggt J() {
        return zzf;
    }

    public final zzber D() {
        return this.zzb == 1 ? (zzber) this.zzc : zzber.L();
    }

    public final zzbep E() {
        return this.zzb == 2 ? (zzbep) this.zzc : zzbep.G();
    }

    public final zzbei F() {
        zzbei a = zzbei.a(this.zzd);
        return a == null ? zzbei.UNSUPPORTED : a;
    }

    public final List G() {
        return this.zze;
    }

    public final /* synthetic */ void K(zzber zzberVar) {
        zzberVar.getClass();
        this.zzc = zzberVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void L(zzbep zzbepVar) {
        zzbepVar.getClass();
        this.zzc = zzbepVar;
        this.zzb = 2;
    }

    public final void M(zzbei zzbeiVar) {
        this.zzd = zzbeiVar.a;
        this.zza |= 1;
    }

    public final void N(zzifu zzifuVar) {
        zzifu zzifuVar2 = this.zze;
        if (!zzifuVar2.zza()) {
            int size = zzifuVar2.size();
            this.zze = zzifuVar2.g(size + size);
        }
        zzidq.l(zzifuVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzber.class, zzbep.class, "zzd", lkn.p, "zze"});
        }
        if (ordinal == 3) {
            return new zzggt();
        }
        if (ordinal == 4) {
            return new zzggs(zzf);
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
        synchronized (zzggt.class) {
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
