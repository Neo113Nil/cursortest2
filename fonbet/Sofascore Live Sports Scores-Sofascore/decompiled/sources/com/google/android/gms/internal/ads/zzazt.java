package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazt extends zzifm implements zzigx {
    private static final zzazt zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzify zzb = kqo.e;
    private zziei zzc = zziei.b;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzazt zzaztVar = new zzazt();
        zzf = zzaztVar;
        zzifm.y(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    public static zzazs D() {
        return (zzazs) zzf.v();
    }

    public final void E(zziei zzieiVar) {
        zzieiVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzieiVar);
    }

    public final /* synthetic */ void F(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzc = zzieiVar;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void H(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", lkn.o, "zze", lkn.m});
        }
        if (ordinal == 3) {
            return new zzazt();
        }
        if (ordinal == 4) {
            return new zzazs(zzf);
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
        synchronized (zzazt.class) {
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
