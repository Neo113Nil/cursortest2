package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private boolean f60050b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f60049a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f60051c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f60052d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f60049a) {
            try {
                if (this.f60051c.isEmpty()) {
                    this.f60050b = false;
                    return;
                }
                E e11 = (E) this.f60051c.remove();
                e(e11.f60026b, e11.f60025a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(final Runnable runnable, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.D
                @Override // java.lang.Runnable
                public final void run() {
                    AtomicReference atomicReference;
                    AtomicReference atomicReference2;
                    AtomicReference atomicReference3;
                    n nVar = n.this;
                    atomicReference = nVar.f60052d;
                    Preconditions.checkState(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                    try {
                        runnable.run();
                        atomicReference3 = nVar.f60052d;
                        atomicReference3.set(null);
                        nVar.d();
                    } catch (Throwable th2) {
                        try {
                            atomicReference2 = nVar.f60052d;
                            atomicReference2.set(null);
                            nVar.d();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    @KeepForSdk
    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        synchronized (this.f60049a) {
            try {
                if (this.f60050b) {
                    this.f60051c.add(new E(runnable, executor));
                } else {
                    this.f60050b = true;
                    e(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
