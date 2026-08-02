package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxw implements zzinw {
    public final zzcxb a;
    public final zziof b;

    public zzcxw(zzcxb zzcxbVar, zzinv zzinvVar) {
        this.a = zzcxbVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzcxv(this.a.a.d, (Executor) this.b.zzb());
    }
}
