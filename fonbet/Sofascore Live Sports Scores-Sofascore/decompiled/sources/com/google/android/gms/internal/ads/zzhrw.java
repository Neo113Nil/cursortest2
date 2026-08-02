package com.google.android.gms.internal.ads;

import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrw extends zzifm implements zzigx {
    private static final zzhrw zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsa zzb;
    private zzhtp zzc;

    static {
        zzhrw zzhrwVar = new zzhrw();
        zzd = zzhrwVar;
        zzifm.y(zzhrw.class, zzhrwVar);
    }

    private zzhrw() {
    }

    public static zzhrw F(zziei zzieiVar, zziew zziewVar) {
        return (zzhrw) zzifm.r(zzd, zzieiVar, zziewVar);
    }

    public static zzhrv G() {
        return (zzhrv) zzd.v();
    }

    public final zzhsa D() {
        zzhsa zzhsaVar = this.zzb;
        return zzhsaVar == null ? zzhsa.G() : zzhsaVar;
    }

    public final zzhtp E() {
        zzhtp zzhtpVar = this.zzc;
        return zzhtpVar == null ? zzhtp.I() : zzhtpVar;
    }

    public final /* synthetic */ void H(zzhsa zzhsaVar) {
        this.zzb = zzhsaVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(zzhtp zzhtpVar) {
        this.zzc = zzhtpVar;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrw();
        }
        if (ordinal == 4) {
            return new zzhrv(zzd);
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
        synchronized (zzhrw.class) {
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
