package uc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.w;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class l<T> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final w<? super T> f100575a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f100576b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9019a f100577c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC8487b f100578d;

    public l(w<? super T> wVar, qc.g<? super InterfaceC8487b> gVar, InterfaceC9019a interfaceC9019a) {
        this.f100575a = wVar;
        this.f100576b = gVar;
        this.f100577c = interfaceC9019a;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        InterfaceC8487b interfaceC8487b = this.f100578d;
        rc.d dVar = rc.d.DISPOSED;
        if (interfaceC8487b != dVar) {
            this.f100578d = dVar;
            try {
                this.f100577c.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
            interfaceC8487b.dispose();
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f100578d.isDisposed();
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        InterfaceC8487b interfaceC8487b = this.f100578d;
        rc.d dVar = rc.d.DISPOSED;
        if (interfaceC8487b != dVar) {
            this.f100578d = dVar;
            this.f100575a.onComplete();
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        InterfaceC8487b interfaceC8487b = this.f100578d;
        rc.d dVar = rc.d.DISPOSED;
        if (interfaceC8487b == dVar) {
            C3493a.f(th2);
        } else {
            this.f100578d = dVar;
            this.f100575a.onError(th2);
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        this.f100575a.onNext(t2);
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        w<? super T> wVar = this.f100575a;
        try {
            this.f100576b.accept(interfaceC8487b);
            if (rc.d.g(this.f100578d, interfaceC8487b)) {
                this.f100578d = interfaceC8487b;
                wVar.onSubscribe(this);
            }
        } catch (Throwable th2) {
            C2645f.c(th2);
            interfaceC8487b.dispose();
            this.f100578d = rc.d.DISPOSED;
            rc.e.d(th2, wVar);
        }
    }
}
