package uc;

import io.reactivex.A;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class t<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<InterfaceC8487b> f100601a;

    /* renamed from: b, reason: collision with root package name */
    final A<? super T> f100602b;

    public t(AtomicReference<InterfaceC8487b> atomicReference, A<? super T> a11) {
        this.f100601a = atomicReference;
        this.f100602b = a11;
    }

    @Override // io.reactivex.A
    public final void onError(Throwable th2) {
        this.f100602b.onError(th2);
    }

    @Override // io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.d(this.f100601a, interfaceC8487b);
    }

    @Override // io.reactivex.A
    public final void onSuccess(T t2) {
        this.f100602b.onSuccess(t2);
    }
}
