package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeoe implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzinx c;
    public final zziof d;
    public final zziof e;

    public zzeoe(zzinv zzinvVar, zziof zziofVar, zzinx zzinxVar, zziof zziofVar2, zziof zziofVar3) {
        this.a = zzinvVar;
        this.b = zziofVar;
        this.c = zzinxVar;
        this.d = zziofVar2;
        this.e = zziofVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzeod((Context) this.a.zzb(), (Executor) this.b.zzb(), (zzdoe) this.c.a, (zzflc) this.d.zzb(), (zzeaj) this.e.zzb());
    }
}
