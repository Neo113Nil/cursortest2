package uc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.A;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes.dex */
public final class j<T> extends AtomicReference<InterfaceC8487b> implements A<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final qc.g<? super T> f100571a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super Throwable> f100572b;

    public j(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2) {
        this.f100571a = gVar;
        this.f100572b = gVar2;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.A
    public final void onError(Throwable th2) {
        lazySet(rc.d.DISPOSED);
        try {
            this.f100572b.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(new C8691a(th2, th3));
        }
    }

    @Override // io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }

    @Override // io.reactivex.A
    public final void onSuccess(T t2) {
        lazySet(rc.d.DISPOSED);
        try {
            this.f100571a.accept(t2);
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
    }
}
