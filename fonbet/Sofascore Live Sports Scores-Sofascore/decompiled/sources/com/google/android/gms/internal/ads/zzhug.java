package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhug extends zzifm implements zzigx {
    private static final zzhug zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzify zzb = kqo.e;

    static {
        zzhug zzhugVar = new zzhug();
        zzc = zzhugVar;
        zzifm.y(zzhug.class, zzhugVar);
    }

    private zzhug() {
    }

    public static zzhud D() {
        return (zzhud) zzc.v();
    }

    public final /* synthetic */ void E(int i) {
        this.zza = i;
    }

    public final void F(zzhuf zzhufVar) {
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzhufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhuf.class});
        }
        if (ordinal == 3) {
            return new zzhug();
        }
        if (ordinal == 4) {
            return new zzhud(zzc);
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
        synchronized (zzhug.class) {
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
