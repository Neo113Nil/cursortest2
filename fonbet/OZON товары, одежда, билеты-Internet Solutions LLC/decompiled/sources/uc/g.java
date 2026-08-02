package uc;

import io.reactivex.A;
import java.util.concurrent.CountDownLatch;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class g<T> extends CountDownLatch implements A<T>, io.reactivex.d, io.reactivex.m<T> {

    /* renamed from: a, reason: collision with root package name */
    T f100563a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f100564b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC8487b f100565c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f100566d;

    public g() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e11) {
                this.f100566d = true;
                InterfaceC8487b interfaceC8487b = this.f100565c;
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
                throw Gc.i.d(e11);
            }
        }
        Throwable th2 = this.f100564b;
        if (th2 == null) {
            return this.f100563a;
        }
        throw Gc.i.d(th2);
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.A
    public final void onError(Throwable th2) {
        this.f100564b = th2;
        countDown();
    }

    @Override // io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        this.f100565c = interfaceC8487b;
        if (this.f100566d) {
            interfaceC8487b.dispose();
        }
    }

    @Override // io.reactivex.A
    public final void onSuccess(T t2) {
        this.f100563a = t2;
        countDown();
    }
}
