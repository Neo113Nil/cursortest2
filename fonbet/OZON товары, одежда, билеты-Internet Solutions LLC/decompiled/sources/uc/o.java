package uc;

import Kc.C3493a;
import io.reactivex.w;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class o<T> extends CountDownLatch implements w<T>, Future<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    T f100583a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f100584b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<InterfaceC8487b> f100585c;

    public o() {
        super(1);
        this.f100585c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        rc.d dVar;
        while (true) {
            AtomicReference<InterfaceC8487b> atomicReference = this.f100585c;
            InterfaceC8487b interfaceC8487b = atomicReference.get();
            if (interfaceC8487b == this || interfaceC8487b == (dVar = rc.d.DISPOSED)) {
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC8487b, dVar)) {
                if (atomicReference.get() != interfaceC8487b) {
                    break;
                }
            }
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f100584b;
        if (th2 == null) {
            return this.f100583a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return rc.d.b(this.f100585c.get());
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f100583a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference<InterfaceC8487b> atomicReference = this.f100585c;
            InterfaceC8487b interfaceC8487b = atomicReference.get();
            if (interfaceC8487b == this || interfaceC8487b == rc.d.DISPOSED) {
                return;
            }
            while (!atomicReference.compareAndSet(interfaceC8487b, this)) {
                if (atomicReference.get() != interfaceC8487b) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f100584b != null) {
            C3493a.f(th2);
            return;
        }
        this.f100584b = th2;
        while (true) {
            AtomicReference<InterfaceC8487b> atomicReference = this.f100585c;
            InterfaceC8487b interfaceC8487b = atomicReference.get();
            if (interfaceC8487b == this || interfaceC8487b == rc.d.DISPOSED) {
                break;
            }
            while (!atomicReference.compareAndSet(interfaceC8487b, this)) {
                if (atomicReference.get() != interfaceC8487b) {
                    break;
                }
            }
            countDown();
            return;
        }
        C3493a.f(th2);
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (this.f100583a == null) {
            this.f100583a = t2;
        } else {
            this.f100585c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this.f100585c, interfaceC8487b);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j11, timeUnit)) {
            throw new TimeoutException(Gc.i.c(j11, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th2 = this.f100584b;
            if (th2 == null) {
                return this.f100583a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
