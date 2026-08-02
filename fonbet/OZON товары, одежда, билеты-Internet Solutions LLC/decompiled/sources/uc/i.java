package uc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes.dex */
public final class i extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b, qc.g<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    final qc.g<? super Throwable> f100569a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f100570b;

    public i(Kr.g gVar) {
        this.f100569a = this;
        this.f100570b = gVar;
    }

    @Override // qc.g
    public final void accept(Throwable th2) throws Exception {
        C3493a.f(new oc.c(th2));
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        try {
            this.f100570b.run();
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
        lazySet(rc.d.DISPOSED);
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        try {
            this.f100569a.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(th3);
        }
        lazySet(rc.d.DISPOSED);
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }

    public i(qc.g<? super Throwable> gVar, InterfaceC9019a interfaceC9019a) {
        this.f100569a = gVar;
        this.f100570b = interfaceC9019a;
    }
}
