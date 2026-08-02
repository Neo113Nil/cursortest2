package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyz implements zzinw {
    public final zzewf a;
    public final zziof b;

    public zzeyz(zzewf zzewfVar, zzinv zzinvVar) {
        this.a = zzewfVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(this.a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.de)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
