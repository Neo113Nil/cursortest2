package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;
import defpackage.xqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzikv extends zzifm implements zzigx {
    private static final zzikv zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zziei zzd;
    private zziei zze;

    static {
        zzikv zzikvVar = new zzikv();
        zzf = zzikvVar;
        zzifm.y(zzikv.class, zzikvVar);
    }

    private zzikv() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
    }

    public static zzikt D() {
        return (zzikt) zzf.v();
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void F(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    public final /* synthetic */ void G(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", xqo.b, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzikv();
        }
        if (ordinal == 4) {
            return new zzikt(zzf);
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
        synchronized (zzikv.class) {
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
