package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezt implements zzinw {
    public final zzfce a;
    public final zziof b;

    public zzezt(zzfce zzfceVar, zzinv zzinvVar) {
        this.a = zzfceVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(this.a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Od)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
