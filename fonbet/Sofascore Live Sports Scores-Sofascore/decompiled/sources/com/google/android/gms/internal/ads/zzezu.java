package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezu implements zzinw {
    public final zzfcu a;
    public final zziof b;

    public zzezu(zzfcu zzfcuVar, zzinv zzinvVar) {
        this.a = zzfcuVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfcu zzfcuVar = this.a;
        zzcer zzcerVar = (zzcer) zzfcuVar.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzfcs(zzcerVar, hsnVar, ((zzcok) zzfcuVar.b).a()), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Nd)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
