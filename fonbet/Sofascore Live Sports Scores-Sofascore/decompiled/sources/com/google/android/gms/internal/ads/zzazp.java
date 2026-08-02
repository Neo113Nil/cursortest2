package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazp extends zzifm implements zzigx {
    private static final zzazp zze;
    private static volatile zzihe zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private zziei zzd = zziei.b;

    static {
        zzazp zzazpVar = new zzazp();
        zze = zzazpVar;
        zzifm.y(zzazp.class, zzazpVar);
    }

    private zzazp() {
    }

    public static zzazp H() {
        return zze;
    }

    public final boolean D() {
        return (this.zza & 1) != 0;
    }

    public final long E() {
        return this.zzb;
    }

    public final String F() {
        return this.zzc;
    }

    public final zziei G() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzazp();
        }
        if (ordinal == 4) {
            return new zzazo(zze);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzf;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzazp.class) {
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
    }
}
