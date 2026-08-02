package xc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;

/* renamed from: xc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10699b<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final qc.g<? super T> f105266a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super Throwable> f105267b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9019a f105268c;

    public C10699b(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a) {
        this.f105266a = gVar;
        this.f105267b = gVar2;
        this.f105268c = interfaceC9019a;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return rc.d.b(get());
    }

    @Override // io.reactivex.m
    public final void onComplete() {
        lazySet(rc.d.DISPOSED);
        try {
            this.f105268c.run();
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
    }

    @Override // io.reactivex.m
    public final void onError(Throwable th2) {
        lazySet(rc.d.DISPOSED);
        try {
            this.f105267b.accept(th2);
        } catch (Throwable th3) {
            C2645f.c(th3);
            C3493a.f(new C8691a(th2, th3));
        }
    }

    @Override // io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }

    @Override // io.reactivex.m, io.reactivex.A
    public final void onSuccess(T t2) {
        lazySet(rc.d.DISPOSED);
        try {
            this.f105266a.accept(t2);
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
        }
    }
}
