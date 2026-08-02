package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ahn;
import defpackage.ddb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffk implements zzfdi {
    public final ScheduledExecutorService a;

    public zzffk(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return zzhcy.i(zzhcy.g(zzhcy.a(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m5)).longValue(), TimeUnit.MILLISECONDS, this.a), ahn.o, zzcgj.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 49;
    }
}
