package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbeg extends zzifm implements zzigx {
    private static final zzbeg zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzify zzb = kqo.e;
    private zzbdy zzc;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzd = zzbegVar;
        zzifm.y(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbef D() {
        return (zzbef) zzd.v();
    }

    public final void E(zzbee zzbeeVar) {
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzbeeVar);
    }

    public final /* synthetic */ void F(zzbdy zzbdyVar) {
        zzbdyVar.getClass();
        this.zzc = zzbdyVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzbee.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzbeg();
        }
        if (ordinal == 4) {
            return new zzbef(zzd);
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
        synchronized (zzbeg.class) {
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
