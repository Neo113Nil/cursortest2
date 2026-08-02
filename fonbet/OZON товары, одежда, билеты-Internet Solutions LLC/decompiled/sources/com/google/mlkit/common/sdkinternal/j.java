package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    protected final n f60039a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f60040b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f60041c;

    public j() {
        this.f60040b = new AtomicInteger(0);
        this.f60041c = new AtomicBoolean(false);
        this.f60039a = new n();
    }

    @NonNull
    @KeepForSdk
    public final <T> Task<T> a(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f60040b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f60039a.a(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.y
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                j.this.f(cancellationToken, cancellationTokenSource, callable2, taskCompletionSource2);
            }
        }, new Executor() { // from class: com.google.mlkit.common.sdkinternal.x
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e11) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e11);
                    }
                    throw e11;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public abstract void b() throws R8.a;

    @KeepForSdk
    public final void c() {
        this.f60040b.incrementAndGet();
    }

    @KeepForSdk
    protected abstract void d();

    @KeepForSdk
    public final void e(@NonNull Executor executor) {
        Preconditions.checkState(this.f60040b.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f60039a.a(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.lang.Runnable
            public final void run() {
                j.this.g(taskCompletionSource);
            }
        }, executor);
        taskCompletionSource.getTask();
    }

    final /* synthetic */ void f(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        if (cancellationToken.isCancellationRequested()) {
            cancellationTokenSource.cancel();
            return;
        }
        AtomicBoolean atomicBoolean = this.f60041c;
        try {
            try {
                if (!atomicBoolean.get()) {
                    b();
                    atomicBoolean.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (RuntimeException e11) {
                throw new R8.a("Internal error has occurred when executing ML Kit tasks", e11);
            }
        } catch (Exception e12) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e12);
            }
        }
    }

    final /* synthetic */ void g(TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.f60040b.decrementAndGet();
        Preconditions.checkState(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f60041c.set(false);
        }
        zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    @KeepForSdk
    protected j(@NonNull n nVar) {
        this.f60040b = new AtomicInteger(0);
        this.f60041c = new AtomicBoolean(false);
        this.f60039a = nVar;
    }
}
