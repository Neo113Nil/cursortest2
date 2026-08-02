package uc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class n<T> extends AtomicReference<InterfaceC8487b> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final qc.q<? super T> f100579a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super Throwable> f100580b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9019a f100581c;

    /* renamed from: d, reason: collision with root package name */
    boolean f100582d;

    public n(qc.q<? super T> qVar, qc.g<? super Throwable> gVar, InterfaceC9019a interfaceC9019a) {
        this.f100579a = qVar;
        this.f100580b = gVar;
        this.f100581c = interfaceC9019a;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return rc.d.b(get());
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        if (this.f100582d) {
            return;
        }
        this.f100582d = true;
        try {
            this.f100581c.run();
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f100582d) {
            C3493a.f(th2);
            return;
        }
        this.f100582d = true;
        try {
            this.f100580b.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(new C8691a(th2, th3));
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (this.f100582d) {
            return;
        }
        try {
            if (this.f100579a.test(t2)) {
                return;
            }
            rc.d.a(this);
            onComplete();
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.d.a(this);
            onError(th2);
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }
}
