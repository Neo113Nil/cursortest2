package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzhur extends zzifm implements zzigx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhur zzd;
    private static volatile zzihe zze;
    private String zzb = "";
    private zzify zzc = kqo.e;

    static {
        zzhur zzhurVar = new zzhur();
        zzd = zzhurVar;
        zzifm.y(zzhur.class, zzhurVar);
    }

    private zzhur() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhty.class});
        }
        if (ordinal == 3) {
            return new zzhur();
        }
        if (ordinal == 4) {
            return new zzhuq(zzd);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zze;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzhur.class) {
            try {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
