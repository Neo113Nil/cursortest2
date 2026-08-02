package uc;

import io.reactivex.w;
import java.util.concurrent.CountDownLatch;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public abstract class d<T> extends CountDownLatch implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    T f100559a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f100560b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC8487b f100561c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f100562d;

    public final T a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e11) {
                dispose();
                throw Gc.i.d(e11);
            }
        }
        Throwable th2 = this.f100560b;
        if (th2 == null) {
            return this.f100559a;
        }
        throw Gc.i.d(th2);
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        this.f100562d = true;
        InterfaceC8487b interfaceC8487b = this.f100561c;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f100562d;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        this.f100561c = interfaceC8487b;
        if (this.f100562d) {
            interfaceC8487b.dispose();
        }
    }
}
