package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.hsn;
import defpackage.yvn;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevo implements zzfdi {
    public final ddb a;
    public final hsn b;
    public final ScheduledExecutorService c;

    public zzevo(ddb ddbVar, hsn hsnVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = ddbVar;
        this.b = hsnVar;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        yvn yvnVar = yvn.i;
        ddb ddbVar = this.a;
        hsn hsnVar = this.b;
        ddb h = zzhcy.h(ddbVar, yvnVar, hsnVar);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.he)).intValue() > 0) {
            h = zzhcy.g(h, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(r1)).intValue(), TimeUnit.MILLISECONDS, this.c);
        }
        return zzhcy.f(h, Throwable.class, yvn.h, hsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 6;
    }
}
