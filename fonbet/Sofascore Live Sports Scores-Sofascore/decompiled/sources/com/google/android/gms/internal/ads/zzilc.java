package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.xqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzilc extends zzifm implements zzigx {
    private static final zzilc zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzilc zzilcVar = new zzilc();
        zzj = zzilcVar;
        zzifm.y(zzilc.class, zzilcVar);
    }

    private zzilc() {
    }

    public static zzilb D() {
        return (zzilb) zzj.v();
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", xqo.e, "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzilc();
        }
        if (ordinal == 4) {
            return new zzilb(zzj);
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
        synchronized (zzilc.class) {
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
