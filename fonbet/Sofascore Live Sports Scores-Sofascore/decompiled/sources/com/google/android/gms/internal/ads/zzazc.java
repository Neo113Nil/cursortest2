package com.google.android.gms.internal.ads;

import defpackage.cqo;
import defpackage.kqo;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazc extends zzifm implements zzigx {
    private static final zzazc zzn;
    private static volatile zzihe zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzaze zzl;
    private zzifu zze = wpo.e;
    private zzify zzh = kqo.e;
    private zzifx zzm = cqo.e;

    static {
        zzazc zzazcVar = new zzazc();
        zzn = zzazcVar;
        zzifm.y(zzazc.class, zzazcVar);
    }

    private zzazc() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzazi.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzazc();
        }
        if (ordinal == 4) {
            return new zzazb(zzn);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzo;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzazc.class) {
            try {
                zziheVar = zzo;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzn);
                    zzo = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
