package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.ahn;
import defpackage.ddb;
import defpackage.lrn;
import defpackage.xlo;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffx implements zzfdi {
    public final zzcfv a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final zzhdi d;
    public final int e;

    public zzffx(zzcfv zzcfvVar, boolean z, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, int i) {
        this.a = zzcfvVar;
        this.b = z;
        this.d = zzhdiVar;
        this.c = scheduledExecutorService;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d8)).booleanValue() && this.b) {
            return zzhcy.a(new zzffy(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f8)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(String.valueOf(this.e))) {
            return zzhcy.a(new zzffy(null));
        }
        xlo xloVar = xlo.b;
        ahn ahnVar = ahn.p;
        zzhdi zzhdiVar = this.d;
        return zzhcy.e(zzhcy.g(zzhcy.i(xloVar, ahnVar, zzhdiVar), ((Long) zzblw.b.c()).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new lrn(this, 6), zzhdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 50;
    }
}
