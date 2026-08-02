package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezi implements zzinw {
    public final zzfac a;
    public final zziof b;

    public zzezi(zzfac zzfacVar, zzinv zzinvVar) {
        this.a = zzfacVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzfab(a, hsnVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Vd)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
