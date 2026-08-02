package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezo implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzezo(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzfbb zzfbbVar = new zzfbb(hsnVar);
        zzexw zzexwVar = (zzexw) this.a.zzb();
        List list = (List) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        if (list.contains("24")) {
            return new zzfbu(zzexwVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Rd)).intValue(), scheduledExecutorService);
        }
        return new zzfbu(zzfbbVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Rd)).intValue(), scheduledExecutorService);
    }
}
