package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggj implements zzinw {
    public final zzioi a;
    public final zzioi b;
    public final zzinx c;
    public final zzinv d;

    public zzggj(zzioi zzioiVar, zzioi zzioiVar2, zzinx zzinxVar, zzinv zzinvVar) {
        this.a = zzioiVar;
        this.b = zzioiVar2;
        this.c = zzinxVar;
        this.d = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzggi(zzinv.b(this.a), zzinv.b(this.b), (ExecutorService) this.c.a, zzinv.b(this.d));
    }
}
