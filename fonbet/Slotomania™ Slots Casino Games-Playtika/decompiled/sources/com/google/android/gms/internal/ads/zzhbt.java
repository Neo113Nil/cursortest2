package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public interface zzhbt extends ScheduledExecutorService, zzhbs {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzhbr schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzhbr schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzhbr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzhbr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
