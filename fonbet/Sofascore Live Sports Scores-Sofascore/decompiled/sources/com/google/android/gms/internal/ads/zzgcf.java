package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.f8h;
import defpackage.ps4;
import defpackage.s9a;
import defpackage.te6;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgcf implements zzinw {
    public final zzcoi a;

    public zzgcf(zzcoi zzcoiVar) {
        this.a = zzcoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context context = this.a.a.b;
        zzioe.a(context);
        ExecutorService executorService = zzcgj.g;
        zzioe.a(executorService);
        return f8h.k(zzgcd.a, null, null, s9a.c(new te6(executorService)), new ps4(context, 14), 6);
    }
}
