package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxi extends zzbf {
    public final zzak b;

    public zzxi(zzak zzakVar) {
        this.b = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        Object obj = zzbe.m;
        zzbeVar.a(this.b, false, true, null, C.TIME_UNSET);
        zzbeVar.i = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? a0.e : null;
        zzc zzcVar = zzc.b;
        zzbdVar.a(num, obj, 0, C.TIME_UNSET, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        return obj == a0.e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        return a0.e;
    }
}
