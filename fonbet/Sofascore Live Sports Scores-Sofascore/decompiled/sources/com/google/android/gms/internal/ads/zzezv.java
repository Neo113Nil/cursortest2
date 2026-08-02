package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezv implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zziof d;

    public zzezv(zzfcy zzfcyVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzfcyVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcw zzb = ((zzfcy) this.a).zzb();
        zzexw zzexwVar = (zzexw) this.b.zzb();
        List list = (List) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        if (list.contains("35")) {
            return new zzfbu(zzexwVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Md)).intValue(), scheduledExecutorService);
        }
        return new zzfbu(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Md)).intValue(), scheduledExecutorService);
    }
}
