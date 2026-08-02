package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqt extends zzifm implements zzigx {
    private static final zzfqt zzc;
    private static volatile zzihe zzd;
    private int zza;
    private long zzb;

    static {
        zzfqt zzfqtVar = new zzfqt();
        zzc = zzfqtVar;
        zzifm.y(zzfqt.class, zzfqtVar);
    }

    private zzfqt() {
    }

    public static zzfqs D() {
        return (zzfqs) zzc.v();
    }

    public final /* synthetic */ void E(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void F(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfqt();
        }
        if (ordinal == 4) {
            return new zzfqs(zzc);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzd;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfqt.class) {
            try {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
