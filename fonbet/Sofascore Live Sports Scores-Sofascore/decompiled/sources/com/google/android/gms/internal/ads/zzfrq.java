package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfrq extends zzifm implements zzigx {
    private static final zzfrq zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzify zzb = kqo.e;
    private zziiy zzc;

    static {
        zzfrq zzfrqVar = new zzfrq();
        zzd = zzfrqVar;
        zzifm.y(zzfrq.class, zzfrqVar);
    }

    private zzfrq() {
    }

    public static zzfrn E() {
        return (zzfrn) zzd.v();
    }

    public final int D() {
        return this.zzb.size();
    }

    public final void F(zzfrp zzfrpVar) {
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzfrpVar);
    }

    public final void G() {
        this.zzb = kqo.e;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfrp.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzfrq();
        }
        if (ordinal == 4) {
            return new zzfrn(zzd);
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
        synchronized (zzfrq.class) {
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
