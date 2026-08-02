package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezd implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zziof d;

    public zzezd(zzexi zzexiVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzexiVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzexg zzb = ((zzexi) this.a).zzb();
        zzexw zzexwVar = (zzexw) this.b.zzb();
        List list = (List) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        if (list.contains("13")) {
            return new zzfbu(zzexwVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Yd)).intValue(), scheduledExecutorService);
        }
        return new zzfbu(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Yd)).intValue(), scheduledExecutorService);
    }
}
