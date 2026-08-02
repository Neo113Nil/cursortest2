package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzilt extends zzifm implements zzigx {
    private static final zzilt zzh;
    private static volatile zzihe zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzifu zzd = wpo.e;
    private zzify zzf = kqo.e;
    private zziei zzg = zziei.b;

    static {
        zzilt zziltVar = new zzilt();
        zzh = zziltVar;
        zzifm.y(zzilt.class, zziltVar);
    }

    private zzilt() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzilr.class, "zzg"});
        }
        if (ordinal == 3) {
            return new zzilt();
        }
        if (ordinal == 4) {
            return new zzils(zzh);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzi;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzilt.class) {
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
    }
}
