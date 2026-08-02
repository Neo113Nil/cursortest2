package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhej extends zzifm implements zzigx {
    private static final zzhej zzb;
    private static volatile zzihe zzc;
    private zzify zza = kqo.e;

    static {
        zzhej zzhejVar = new zzhej();
        zzb = zzhejVar;
        zzifm.y(zzhej.class, zzhejVar);
    }

    private zzhej() {
    }

    public static zzheg E() {
        return (zzheg) zzb.v();
    }

    public final int D() {
        return this.zza.size();
    }

    public final void F(zzhei zzheiVar) {
        zzify zzifyVar = this.zza;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zza = zzifyVar.g(size + size);
        }
        this.zza.add(zzheiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhei.class});
        }
        if (ordinal == 3) {
            return new zzhej();
        }
        if (ordinal == 4) {
            return new zzheg(zzb);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzc;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhej.class) {
            try {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
