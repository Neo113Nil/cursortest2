package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.wpo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbec extends zzifm implements zzigx {
    private static final zzbec zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzben zzb;
    private zzifu zzc = wpo.e;

    static {
        zzbec zzbecVar = new zzbec();
        zzd = zzbecVar;
        zzifm.y(zzbec.class, zzbecVar);
    }

    private zzbec() {
    }

    public static zzbec F(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zzd, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzbec) B;
    }

    public final zzben D() {
        zzben zzbenVar = this.zzb;
        return zzbenVar == null ? zzben.H() : zzbenVar;
    }

    public final List E() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbec();
        }
        if (ordinal == 4) {
            return new zzbeb(zzd);
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
        synchronized (zzbec.class) {
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
