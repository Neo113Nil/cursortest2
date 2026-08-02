package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651z9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f14989a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14990b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0073cb f14991c;

    public C0651z9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC0073cb a(String str) {
        StringBuilder c2 = v.f.c(str, "-");
        c2.append(ThreadFactoryC0655zd.f14994a.incrementAndGet());
        HandlerThreadC0073cb handlerThreadC0073cb = new HandlerThreadC0073cb(c2.toString());
        handlerThreadC0073cb.start();
        return handlerThreadC0073cb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f14990b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j) {
        this.f14990b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f14990b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f14989a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z5;
        HandlerThreadC0073cb handlerThreadC0073cb = this.f14991c;
        synchronized (handlerThreadC0073cb) {
            z5 = handlerThreadC0073cb.f13510a;
        }
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f14990b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f14990b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0073cb handlerThreadC0073cb = this.f14991c;
        synchronized (handlerThreadC0073cb) {
            handlerThreadC0073cb.f13510a = false;
            handlerThreadC0073cb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f14990b.post(futureTask);
        return futureTask;
    }

    public C0651z9(HandlerThreadC0073cb handlerThreadC0073cb) {
        this(handlerThreadC0073cb, handlerThreadC0073cb.getLooper(), new Handler(handlerThreadC0073cb.getLooper()));
    }

    public C0651z9(@NonNull HandlerThreadC0073cb handlerThreadC0073cb, @NonNull Looper looper, @NonNull Handler handler) {
        this.f14991c = handlerThreadC0073cb;
        this.f14989a = looper;
        this.f14990b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        this.f14990b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
