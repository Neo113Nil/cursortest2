package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.lqo;
import defpackage.obo;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgca extends zzifm implements zzigx {
    private static final zzgca zzb;
    private static volatile zzihe zzc;
    private zzigq zza = zzigq.b;

    static {
        zzgca zzgcaVar = new zzgca();
        zzb = zzgcaVar;
        zzifm.y(zzgca.class, zzgcaVar);
    }

    private zzgca() {
    }

    public static zzgca F(InputStream inputStream) {
        zzgca zzgcaVar = zzb;
        zziem e = zziem.e(inputStream);
        zziew zziewVar = zziew.b;
        int i = dpo.a;
        zzifm q = zzifm.q(zzgcaVar, e, zziew.c);
        zzifm.C(q);
        return (zzgca) q;
    }

    public static zzgca G() {
        return zzb;
    }

    public final int D() {
        return this.zza.size();
    }

    public final Map E() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final zzigq H() {
        zzigq zzigqVar = this.zza;
        if (zzigqVar.a) {
            return zzigqVar;
        }
        zzigq g = zzigqVar.g();
        this.zza = g;
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", obo.a});
        }
        if (ordinal == 3) {
            return new zzgca();
        }
        if (ordinal == 4) {
            return new zzgby(zzb);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzc;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzgca.class) {
            try {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
