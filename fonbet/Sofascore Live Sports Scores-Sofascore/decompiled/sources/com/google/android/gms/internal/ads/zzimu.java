package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzimu extends zzifm implements zzigx {
    private static final zzimu zzj;
    private static volatile zzihe zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private zzify zzd;
    private zzify zze;
    private zzify zzf;
    private int zzg;
    private zzimd zzh;
    private String zzi;

    static {
        zzimu zzimuVar = new zzimu();
        zzj = zzimuVar;
        zzifm.y(zzimu.class, zzimuVar);
    }

    private zzimu() {
        kqo kqoVar = kqo.e;
        this.zzd = kqoVar;
        this.zze = kqoVar;
        this.zzf = kqoVar;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zzimh.class, "zze", zzimo.class, "zzg", "zzb", "zzf", zzinb.class, "zzi", "zzh"});
        }
        if (ordinal == 3) {
            return new zzimu();
        }
        if (ordinal == 4) {
            return new zzimt(zzj);
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
        synchronized (zzimu.class) {
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
