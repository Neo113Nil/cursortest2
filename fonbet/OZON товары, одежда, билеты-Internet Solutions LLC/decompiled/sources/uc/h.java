package uc;

import io.reactivex.w;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class h<T> extends AtomicReference<InterfaceC8487b> implements w<T>, InterfaceC8487b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f100567b = new Object();

    /* renamed from: a, reason: collision with root package name */
    final LinkedBlockingQueue f100568a;

    public h(LinkedBlockingQueue linkedBlockingQueue) {
        this.f100568a = linkedBlockingQueue;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        if (rc.d.a(this)) {
            this.f100568a.offer(f100567b);
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        this.f100568a.offer(Gc.k.COMPLETE);
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        this.f100568a.offer(Gc.k.f(th2));
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        this.f100568a.offer(t2);
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }
}
