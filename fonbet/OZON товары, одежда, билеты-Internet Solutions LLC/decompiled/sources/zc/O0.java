package zc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import qc.InterfaceC9021c;
import sc.C9656b;
import zc.N0;

/* loaded from: classes9.dex */
public final class O0<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107905a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<R> f107906b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9021c<R, ? super T, R> f107907c;

    public O0(io.reactivex.p pVar, Callable callable, InterfaceC9021c interfaceC9021c) {
        this.f107905a = pVar;
        this.f107906b = callable;
        this.f107907c = interfaceC9021c;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        try {
            R call = this.f107906b.call();
            C9656b.c(call, "The seedSupplier returned a null value");
            this.f107905a.subscribe(new N0.a(a11, this.f107907c, call));
        } catch (Throwable th2) {
            C2645f.c(th2);
            a11.onSubscribe(rc.e.INSTANCE);
            a11.onError(th2);
        }
    }
}
