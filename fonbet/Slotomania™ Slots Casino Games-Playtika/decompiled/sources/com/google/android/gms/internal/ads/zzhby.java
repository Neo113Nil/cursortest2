package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhby extends zzhbu implements zzhbt {
    final ScheduledExecutorService zza;

    zzhby(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd */
    public final zzhbr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhch zze = zzhch.zze(runnable, null);
        return new zzhbw(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze */
    public final zzhbr schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzhch zzhchVar = new zzhch(callable);
        return new zzhbw(zzhchVar, this.zza.schedule(zzhchVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf */
    public final zzhbr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleAtFixedRate(zzhbxVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg */
    public final zzhbr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleWithFixedDelay(zzhbxVar, j, j2, timeUnit));
    }
}
