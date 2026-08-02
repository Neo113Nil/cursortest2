package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxe implements zzinw {
    public final zzfas a;
    public final zziof b;

    public zzcxe(zzfas zzfasVar, zzinv zzinvVar) {
        this.a = zzfasVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(this.a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ge)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
