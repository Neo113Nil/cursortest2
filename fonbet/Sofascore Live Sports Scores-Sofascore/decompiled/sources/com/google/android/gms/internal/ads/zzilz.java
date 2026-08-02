package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.xqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzilz extends zzifm implements zzigx {
    private static final zzilz zzp;
    private static volatile zzihe zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzify zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private zzify zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        zzilz zzilzVar = new zzilz();
        zzp = zzilzVar;
        zzifm.y(zzilz.class, zzilzVar);
    }

    private zzilz() {
        kqo kqoVar = kqo.e;
        this.zze = kqoVar;
        this.zzf = "";
        this.zzg = "";
        this.zzj = kqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", xqo.j, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzilx.class, "zzc", "zzk", xqo.i, "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new zzilz();
        }
        if (ordinal == 4) {
            return new zzilu(zzp);
        }
        if (ordinal == 5) {
            return zzp;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzu;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzilz.class) {
            try {
                zziheVar = zzu;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzp);
                    zzu = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
