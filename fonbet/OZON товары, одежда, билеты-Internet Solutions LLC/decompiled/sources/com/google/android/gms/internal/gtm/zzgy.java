package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class zzgy extends ThreadPoolExecutor {
    private final Context zza;

    public zzgy(Context context, int i11, int i12, long j11, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0L, timeUnit, blockingQueue, threadFactory);
        this.zza = context;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th2) {
        if (th2 != null) {
            zzgt.zzb("Uncaught exception: ", th2, this.zza);
        }
    }
}
