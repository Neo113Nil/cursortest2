package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazg extends zzifm implements zzigx {
    private static final zzazg zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zziei zzb;
    private zziei zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzazg zzazgVar = new zzazg();
        zzf = zzazgVar;
        zzifm.y(zzazg.class, zzazgVar);
    }

    private zzazg() {
        mpo mpoVar = zziei.b;
        this.zzb = mpoVar;
        this.zzc = mpoVar;
        this.zzd = mpoVar;
        this.zze = mpoVar;
    }

    public static zzazg H(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zzf, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzazg) B;
    }

    public static zzazf I() {
        return (zzazf) zzf.v();
    }

    public final zziei D() {
        return this.zzb;
    }

    public final zziei E() {
        return this.zzc;
    }

    public final zziei F() {
        return this.zzd;
    }

    public final zziei G() {
        return this.zze;
    }

    public final /* synthetic */ void J(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzb = zzieiVar;
    }

    public final /* synthetic */ void K(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void L(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    public final /* synthetic */ void M(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 8;
        this.zze = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzazg();
        }
        if (ordinal == 4) {
            return new zzazf(zzf);
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
        synchronized (zzazg.class) {
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
