package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhtc extends zzifm implements zzigx {
    private static final zzhtc zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private zzhsy zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzhtc zzhtcVar = new zzhtc();
        zzf = zzhtcVar;
        zzifm.y(zzhtc.class, zzhtcVar);
    }

    private zzhtc() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
    }

    public static zzhtc H(zziei zzieiVar, zziew zziewVar) {
        return (zzhtc) zzifm.r(zzf, zzieiVar, zziewVar);
    }

    public static zzhtb I() {
        return (zzhtb) zzf.v();
    }

    public static zzhtc J() {
        return zzf;
    }

    public static zzihe K() {
        return zzf.j();
    }

    public final int D() {
        return this.zzb;
    }

    public final zzhsy E() {
        zzhsy zzhsyVar = this.zzc;
        return zzhsyVar == null ? zzhsy.F() : zzhsyVar;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final zziei G() {
        return this.zze;
    }

    public final /* synthetic */ void L(zzhsy zzhsyVar) {
        this.zzc = zzhsyVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    public final /* synthetic */ void N(mpo mpoVar) {
        mpoVar.getClass();
        this.zze = mpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhtc();
        }
        if (ordinal == 4) {
            return new zzhtb(zzf);
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
        synchronized (zzhtc.class) {
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
