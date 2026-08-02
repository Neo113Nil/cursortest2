package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqv extends zzifm implements zzigx {
    private static final zzfqv zzi;
    private static volatile zzihe zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzfqv zzfqvVar = new zzfqv();
        zzi = zzfqvVar;
        zzifm.y(zzfqv.class, zzfqvVar);
    }

    private zzfqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfqv();
        }
        if (ordinal == 4) {
            return new zzfqu(zzi);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzj;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfqv.class) {
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
    }
}
