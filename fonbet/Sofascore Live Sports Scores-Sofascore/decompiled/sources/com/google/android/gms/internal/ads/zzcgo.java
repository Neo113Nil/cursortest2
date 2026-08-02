package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import defpackage.ddb;
import defpackage.wko;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzcgo implements ddb {
    public final zzhdr a = zzhdr.r();

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.a instanceof wko;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final boolean zzc(@Nullable Object obj) {
        boolean d = this.a.d(obj);
        if (!d) {
            com.google.android.gms.ads.internal.zzt.zzh().e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return d;
    }

    public final boolean zzd(Throwable th) {
        boolean e = this.a.e(th);
        if (!e) {
            com.google.android.gms.ads.internal.zzt.zzh().e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return e;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.a.get(j, timeUnit);
    }
}
