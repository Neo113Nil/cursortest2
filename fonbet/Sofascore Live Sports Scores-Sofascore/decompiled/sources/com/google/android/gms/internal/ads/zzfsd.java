package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfsd extends zzifm implements zzigx {
    private static final zzfsd zzc;
    private static volatile zzihe zzd;
    private zzify zza = kqo.e;
    private long zzb;

    static {
        zzfsd zzfsdVar = new zzfsd();
        zzc = zzfsdVar;
        zzifm.y(zzfsd.class, zzfsdVar);
    }

    private zzfsd() {
    }

    public static zzfsc D() {
        return (zzfsc) zzc.v();
    }

    public final void E(zzfqt zzfqtVar) {
        zzify zzifyVar = this.zza;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zza = zzifyVar.g(size + size);
        }
        this.zza.add(zzfqtVar);
    }

    public final /* synthetic */ void F(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfqt.class, "zzb"});
        }
        if (ordinal == 3) {
            return new zzfsd();
        }
        if (ordinal == 4) {
            return new zzfsc(zzc);
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
        synchronized (zzfsd.class) {
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
