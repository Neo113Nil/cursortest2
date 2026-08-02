package uc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;

/* loaded from: classes.dex */
public final class r<T> extends AtomicReference<InterfaceC8487b> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final qc.g<? super T> f100591a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super Throwable> f100592b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9019a f100593c;

    /* renamed from: d, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f100594d;

    public r(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a, qc.g<? super InterfaceC8487b> gVar3) {
        this.f100591a = gVar;
        this.f100592b = gVar2;
        this.f100593c = interfaceC9019a;
        this.f100594d = gVar3;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(rc.d.DISPOSED);
        try {
            this.f100593c.run();
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (isDisposed()) {
            C3493a.f(th2);
            return;
        }
        lazySet(rc.d.DISPOSED);
        try {
            this.f100592b.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(new C8691a(th2, th3));
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f100591a.accept(t2);
        } catch (Throwable th2) {
            C2645f.c(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.f(this, interfaceC8487b)) {
            try {
                this.f100594d.accept(this);
            } catch (Throwable th2) {
                C2645f.c(th2);
                interfaceC8487b.dispose();
                onError(th2);
            }
        }
    }
}
