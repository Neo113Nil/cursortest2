package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzglw implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzglw(zzinv zzinvVar, zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinxVar2;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzglt((Context) this.a.zzb(), (ExecutorService) this.b.zzb(), (zzggk) this.c.zzb());
    }
}
