package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.mpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzikg extends zzifm implements zzigx {
    private static final zzikg zzh;
    private static volatile zzihe zzi;
    private int zza;
    private zzikf zzb;
    private zziei zzd;
    private zziei zze;
    private int zzf;
    private byte zzg = 2;
    private zzify zzc = kqo.e;

    static {
        zzikg zzikgVar = new zzikg();
        zzh = zzikgVar;
        zzifm.y(zzikg.class, zzikgVar);
    }

    private zzikg() {
        mpo mpoVar = zziei.b;
        this.zzd = mpoVar;
        this.zze = mpoVar;
    }

    public static zzikd D() {
        return (zzikd) zzh.v();
    }

    public final void E(zzikc zzikcVar) {
        zzify zzifyVar = this.zzc;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzc = zzifyVar.g(size + size);
        }
        this.zzc.add(zzikcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        switch (zziflVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = zzifmVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new lqo(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzikc.class, "zzd", "zze", "zzf"});
            case 3:
                return new zzikg();
            case 4:
                return new zzikd(zzh);
            case 5:
                return zzh;
            case 6:
                zzihe zziheVar2 = zzi;
                if (zziheVar2 != null) {
                    return zziheVar2;
                }
                synchronized (zzikg.class) {
                    try {
                        zziheVar = zzi;
                        if (zziheVar == null) {
                            zziheVar = new zzifh(zzh);
                            zzi = zziheVar;
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
