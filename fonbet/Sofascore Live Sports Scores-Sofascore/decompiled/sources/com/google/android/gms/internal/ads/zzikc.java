package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzikc extends zzifm implements zzigx {
    private static final zzikc zze;
    private static volatile zzihe zzf;
    private int zza;
    private zziei zzb;
    private zziei zzc;
    private byte zzd = 2;

    static {
        zzikc zzikcVar = new zzikc();
        zze = zzikcVar;
        zzifm.y(zzikc.class, zzikcVar);
    }

    private zzikc() {
        mpo mpoVar = zziei.b;
        this.zzb = mpoVar;
        this.zzc = mpoVar;
    }

    public static zzikb D() {
        return (zzikb) zze.v();
    }

    public final /* synthetic */ void E(mpo mpoVar) {
        mpoVar.getClass();
        this.zza |= 1;
        this.zzb = mpoVar;
    }

    public final /* synthetic */ void F(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        switch (zziflVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = zzifmVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new lqo(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new zzikc();
            case 4:
                return new zzikb(zze);
            case 5:
                return zze;
            case 6:
                zzihe zziheVar2 = zzf;
                if (zziheVar2 != null) {
                    return zziheVar2;
                }
                synchronized (zzikc.class) {
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
            default:
                throw null;
        }
    }
}
