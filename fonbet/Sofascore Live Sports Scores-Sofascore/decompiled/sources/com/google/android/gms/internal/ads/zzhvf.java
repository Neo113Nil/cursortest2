package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvf extends zzifm implements zzigx {
    private static final zzhvf zzj;
    private static volatile zzihe zzk;
    private int zza;
    private int zzb;
    private zzhvh zzc;
    private zziei zzd;
    private zziei zze;
    private zziei zzf;
    private zziei zzg;
    private zziei zzh;
    private zziei zzi;

    static {
        zzhvf zzhvfVar = new zzhvf();
        zzj = zzhvfVar;
        zzifm.y(zzhvf.class, zzhvfVar);
    }

    private zzhvf() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
        this.zzf = mpoVar;
        this.zzg = mpoVar;
        this.zzh = mpoVar;
        this.zzi = mpoVar;
    }

    public static zzhvf L(zziei zzieiVar, zziew zziewVar) {
        return (zzhvf) zzifm.r(zzj, zzieiVar, zziewVar);
    }

    public static zzhve M() {
        return (zzhve) zzj.v();
    }

    public static zzihe N() {
        return zzj.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhvh E() {
        zzhvh zzhvhVar = this.zzc;
        return zzhvhVar == null ? zzhvh.J() : zzhvhVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final zziei G() {
        return this.zze;
    }

    public final zziei H() {
        return this.zzf;
    }

    public final zziei I() {
        return this.zzg;
    }

    public final zziei J() {
        return this.zzh;
    }

    public final zziei K() {
        return this.zzi;
    }

    public final /* synthetic */ void O() {
        this.zzb = 0;
    }

    public final /* synthetic */ void P(zzhvh zzhvhVar) {
        this.zzc = zzhvhVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void Q(mpo mpoVar) {
        mpoVar.getClass();
        this.zzd = mpoVar;
    }

    public final /* synthetic */ void R(mpo mpoVar) {
        mpoVar.getClass();
        this.zze = mpoVar;
    }

    public final /* synthetic */ void S(mpo mpoVar) {
        mpoVar.getClass();
        this.zzf = mpoVar;
    }

    public final /* synthetic */ void U(mpo mpoVar) {
        mpoVar.getClass();
        this.zzg = mpoVar;
    }

    public final /* synthetic */ void V(mpo mpoVar) {
        mpoVar.getClass();
        this.zzh = mpoVar;
    }

    public final /* synthetic */ void W(mpo mpoVar) {
        mpoVar.getClass();
        this.zzi = mpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzhvf();
        }
        if (ordinal == 4) {
            return new zzhve(zzj);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzk;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhvf.class) {
            try {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
