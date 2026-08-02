package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdtd implements zzinw {
    public final zzdwg a;
    public final zziof b;

    public zzdtd(zzdwg zzdwgVar, zzinv zzinvVar) {
        this.a = zzdwgVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzdlo(new zzdwf(this.a.a.a()), (Executor) this.b.zzb());
    }
}
