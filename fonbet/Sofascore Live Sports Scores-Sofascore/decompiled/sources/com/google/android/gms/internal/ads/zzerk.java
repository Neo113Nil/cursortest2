package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzerk implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzinx c;

    public zzerk(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinxVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzerj((Context) this.a.zzb(), (Executor) this.b.zzb(), (zzdwp) this.c.a);
    }
}
