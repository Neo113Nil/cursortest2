package zc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class P1<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.w<? super T> f107937a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<InterfaceC8487b> f107938b = new AtomicReference<>();

    public P1(io.reactivex.w<? super T> wVar) {
        this.f107937a = wVar;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this.f107938b);
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f107938b.get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        dispose();
        this.f107937a.onComplete();
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        dispose();
        this.f107937a.onError(th2);
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        this.f107937a.onNext(t2);
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.f(this.f107938b, interfaceC8487b)) {
            this.f107937a.onSubscribe(this);
        }
    }
}
