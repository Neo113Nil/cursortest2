package uc;

import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;

/* loaded from: classes9.dex */
public final class p<T> extends AtomicReference<InterfaceC8487b> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final q<T> f100586a;

    /* renamed from: b, reason: collision with root package name */
    final int f100587b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC9808j<T> f100588c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f100589d;

    /* renamed from: e, reason: collision with root package name */
    int f100590e;

    public p(q<T> qVar, int i11) {
        this.f100586a = qVar;
        this.f100587b = i11;
    }

    public final boolean a() {
        return this.f100589d;
    }

    public final InterfaceC9808j<T> b() {
        return this.f100588c;
    }

    public final void d() {
        this.f100589d = true;
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
        this.f100586a.d(this);
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        this.f100586a.b(this, th2);
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        int i11 = this.f100590e;
        q<T> qVar = this.f100586a;
        if (i11 == 0) {
            qVar.e(this, t2);
        } else {
            qVar.a();
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.f(this, interfaceC8487b)) {
            if (interfaceC8487b instanceof InterfaceC9803e) {
                InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                int a11 = interfaceC9803e.a(3);
                if (a11 == 1) {
                    this.f100590e = a11;
                    this.f100588c = interfaceC9803e;
                    this.f100589d = true;
                    this.f100586a.d(this);
                    return;
                }
                if (a11 == 2) {
                    this.f100590e = a11;
                    this.f100588c = interfaceC9803e;
                    return;
                }
            }
            int i11 = -this.f100587b;
            this.f100588c = i11 < 0 ? new Cc.c<>(-i11) : new Cc.b<>(i11);
        }
    }
}
