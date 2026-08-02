package com.google.android.gms.internal.ads;

import defpackage.cpn;
import defpackage.ddb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbu implements zzfdi {
    public final zzfdi a;
    public final long b;
    public final ScheduledExecutorService c;

    public zzfbu(zzfdi zzfdiVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzfdiVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        ddb zza = this.a.zza();
        TimeUnit timeUnit = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.j3)).booleanValue() ? TimeUnit.MICROSECONDS : TimeUnit.MILLISECONDS;
        long j = this.b;
        if (j > 0) {
            zza = zzhcy.g(zza, j, timeUnit, this.c);
        }
        return zzhcy.f(zza, Throwable.class, new cpn(this, 8), zzcgj.h);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return this.a.zzb();
    }
}
