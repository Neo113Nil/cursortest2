package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyy implements zzinw {
    public final zzevv a;
    public final zziof b;

    public zzeyy(zzevv zzevvVar, zzinv zzinvVar) {
        this.a = zzevvVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(this.a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.be)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
