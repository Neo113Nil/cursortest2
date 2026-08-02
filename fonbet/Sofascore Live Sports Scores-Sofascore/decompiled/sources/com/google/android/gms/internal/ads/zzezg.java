package com.google.android.gms.internal.ads;

import defpackage.hsn;
import defpackage.qio;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezg implements zzinw {
    public final zziof a;

    public zzezg(zzinv zzinvVar) {
        this.a = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object obj;
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzexy zzexyVar = new zzexy(hsnVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g5)).booleanValue()) {
            zzfbu zzfbuVar = new zzfbu(zzexyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.h5)).intValue(), scheduledExecutorService);
            int i = zzgxw.c;
            obj = new qio(zzfbuVar);
        } else {
            int i2 = zzgxw.c;
            obj = t.j;
        }
        zzioe.a(obj);
        return obj;
    }
}
