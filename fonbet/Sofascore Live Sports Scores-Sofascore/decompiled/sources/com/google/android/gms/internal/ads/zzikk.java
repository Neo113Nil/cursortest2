package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzikk extends zzifm implements zzigx {
    private static final zzikk zzi;
    private static volatile zzihe zzj;
    private int zza;
    private zzikj zzb;
    private zziei zzd;
    private zziei zze;
    private int zzf;
    private zziei zzg;
    private byte zzh = 2;
    private zzify zzc = kqo.e;

    static {
        zzikk zzikkVar = new zzikk();
        zzi = zzikkVar;
        zzifm.y(zzikk.class, zzikkVar);
    }

    private zzikk() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
        this.zzg = mpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        switch (zziflVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = zzifmVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new lqo(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzikc.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzikk();
            case 4:
                return new zzikh(zzi);
            case 5:
                return zzi;
            case 6:
                zzihe zziheVar2 = zzj;
                if (zziheVar2 != null) {
                    return zziheVar2;
                }
                synchronized (zzikk.class) {
                    try {
                        zziheVar = zzj;
                        if (zziheVar == null) {
                            zziheVar = new zzifh(zzi);
                            zzj = zziheVar;
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
