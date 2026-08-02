package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyx implements zzinw {
    public final zzevl a;
    public final zziof b;

    public zzeyx(zzevl zzevlVar, zzinv zzinvVar) {
        this.a = zzevlVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzevl zzevlVar = this.a;
        zzflw a = zzevlVar.a.a();
        return new zzfbu(new zzevj(hsnVar, a), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ce)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
