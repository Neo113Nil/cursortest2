package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbda extends zzbdt {
    public final zzbch h;

    public zzbda(zzbcg zzbcgVar, zzaya zzayaVar, int i, zzbch zzbchVar) {
        super(zzbcgVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzayaVar, i, 85);
        this.h = zzbchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        Method method = this.e;
        zzbch zzbchVar = this.h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbchVar.c), Long.valueOf(zzbchVar.d), Long.valueOf(zzbchVar.e), Long.valueOf(zzbchVar.f));
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            long j = jArr[0];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).n0(j);
            long j2 = jArr[1];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).o0(j2);
        }
    }
}
