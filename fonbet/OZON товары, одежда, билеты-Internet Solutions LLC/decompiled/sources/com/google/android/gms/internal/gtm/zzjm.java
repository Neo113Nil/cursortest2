package com.google.android.gms.internal.gtm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
final class zzjm {
    private static final ScheduledExecutorService zza;

    static {
        zzfz.zza();
        zza = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new zzjl()));
    }
}
