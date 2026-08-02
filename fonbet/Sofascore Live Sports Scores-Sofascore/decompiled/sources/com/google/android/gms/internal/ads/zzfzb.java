package com.google.android.gms.internal.ads;

import defpackage.lkn;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfzb extends zzifm implements zzigx {
    private static final zzfzb zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzifu zzb = wpo.e;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfzb zzfzbVar = new zzfzb();
        zzf = zzfzbVar;
        zzifm.y(zzfzb.class, zzfzbVar);
    }

    private zzfzb() {
    }

    public static zzfza D() {
        return (zzfza) zzf.v();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void F(int i) {
        zzifu zzifuVar = this.zzb;
        if (!zzifuVar.zza()) {
            int size = zzifuVar.size();
            this.zzb = zzifuVar.g(size + size);
        }
        this.zzb.h(2);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", lkn.q, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfzb();
        }
        if (ordinal == 4) {
            return new zzfza(zzf);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzg;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfzb.class) {
            try {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
