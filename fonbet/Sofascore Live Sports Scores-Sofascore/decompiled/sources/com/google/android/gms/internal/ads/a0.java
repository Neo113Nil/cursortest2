package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a0 extends zzxc {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public a0(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        this.b.b(i, zzbeVar, j);
        if (Objects.equals(zzbeVar.a, this.c)) {
            zzbeVar.a = zzbe.m;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        this.b.d(i, zzbdVar, z);
        if (Objects.equals(zzbdVar.b, this.d) && z) {
            zzbdVar.b = e;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        Object f = this.b.f(i);
        return Objects.equals(f, this.d) ? e : f;
    }
}
