package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import java.io.ByteArrayInputStream;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhuc extends zzifm implements zzigx {
    private static final zzhuc zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzify zzb = kqo.e;

    static {
        zzhuc zzhucVar = new zzhuc();
        zzc = zzhucVar;
        zzifm.y(zzhuc.class, zzhucVar);
    }

    private zzhuc() {
    }

    public static zzhuc H(byte[] bArr, zziew zziewVar) {
        zzifm B = zzifm.B(zzc, bArr, bArr.length, zziewVar);
        zzifm.C(B);
        return (zzhuc) B;
    }

    public static zzhuc I(ByteArrayInputStream byteArrayInputStream, zziew zziewVar) {
        zzifm q = zzifm.q(zzc, zziem.e(byteArrayInputStream), zziewVar);
        zzifm.C(q);
        return (zzhuc) q;
    }

    public static zzhtz J() {
        return (zzhtz) zzc.v();
    }

    public final int D() {
        return this.zza;
    }

    public final List E() {
        return this.zzb;
    }

    public final int F() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhub G(int i) {
        return (zzhub) this.zzb.get(i);
    }

    public final /* synthetic */ void K(int i) {
        this.zza = i;
    }

    public final void L(zzhub zzhubVar) {
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzhubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhub.class});
        }
        if (ordinal == 3) {
            return new zzhuc();
        }
        if (ordinal == 4) {
            return new zzhtz(zzc);
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
        synchronized (zzhuc.class) {
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
