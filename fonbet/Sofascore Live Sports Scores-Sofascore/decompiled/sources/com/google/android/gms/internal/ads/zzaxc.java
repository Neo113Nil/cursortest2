package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxc extends zzifm implements zzigx {
    private static final zzaxc zzj;
    private static volatile zzihe zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzaxt zzg;
    private zzaxz zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzaxc zzaxcVar = new zzaxc();
        zzj = zzaxcVar;
        zzifm.y(zzaxc.class, zzaxcVar);
    }

    private zzaxc() {
    }

    public static zzaxb H() {
        return (zzaxb) zzj.v();
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return this.zze;
    }

    public final zzaxt F() {
        zzaxt zzaxtVar = this.zzg;
        return zzaxtVar == null ? zzaxt.G() : zzaxtVar;
    }

    public final void G() {
        if (this.zzh == null) {
            int i = zzaxz.a;
        }
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void J(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", lkn.b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzaxc();
        }
        if (ordinal == 4) {
            return new zzaxb(zzj);
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
        synchronized (zzaxc.class) {
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
