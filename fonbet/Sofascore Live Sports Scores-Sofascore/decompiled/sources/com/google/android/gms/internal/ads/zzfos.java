package com.google.android.gms.internal.ads;

import defpackage.bmo;
import defpackage.hsn;
import defpackage.p2o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfos implements zzinw {
    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new p2o(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        return unconfigurableExecutorService instanceof zzhdi ? (zzhdi) unconfigurableExecutorService : unconfigurableExecutorService instanceof ScheduledExecutorService ? new bmo((ScheduledExecutorService) unconfigurableExecutorService) : new hsn(unconfigurableExecutorService);
    }
}
