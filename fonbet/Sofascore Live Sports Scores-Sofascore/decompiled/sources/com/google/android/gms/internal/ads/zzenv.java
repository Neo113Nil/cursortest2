package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenv implements zzinw {
    public final zzinv a;
    public final zzinx b;
    public final zziof c;

    public zzenv(zzinv zzinvVar, zzinx zzinxVar, zziof zziofVar) {
        this.a = zzinvVar;
        this.b = zzinxVar;
        this.c = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzenu((Context) this.a.zzb(), (zzcxi) this.b.a, (Executor) this.c.zzb());
    }
}
