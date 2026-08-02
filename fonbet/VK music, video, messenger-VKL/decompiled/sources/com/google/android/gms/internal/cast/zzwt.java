package com.google.android.gms.internal.cast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzwt {
    public static zzwo zza(ExecutorService executorService) {
        return executorService instanceof zzwo ? (zzwo) executorService : executorService instanceof ScheduledExecutorService ? new zzws((ScheduledExecutorService) executorService) : new zzwp(executorService);
    }
}
