package com.google.android.gms.internal.ads;

import defpackage.cqo;
import defpackage.kqo;
import defpackage.lqo;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhei extends zzifm implements zzigx {
    private static final zzhei zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzhef zzb;
    private zzihy zzc;
    private zzify zzd = kqo.e;
    private zzifx zze = cqo.e;

    static {
        zzhei zzheiVar = new zzhei();
        zzf = zzheiVar;
        zzifm.y(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzheh D() {
        return (zzheh) zzf.v();
    }

    public final /* synthetic */ void E(zzhef zzhefVar) {
        this.zzb = zzhefVar;
        this.zza |= 1;
    }

    public final void F(ArrayDeque arrayDeque) {
        zzifx zzifxVar = this.zze;
        if (!zzifxVar.zza()) {
            int size = zzifxVar.size();
            this.zze = zzifxVar.g(size + size);
        }
        zzidq.l(arrayDeque, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzihy.class, "zze"});
        }
        if (ordinal == 3) {
            return new zzhei();
        }
        if (ordinal == 4) {
            return new zzheh(zzf);
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
        synchronized (zzhei.class) {
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
