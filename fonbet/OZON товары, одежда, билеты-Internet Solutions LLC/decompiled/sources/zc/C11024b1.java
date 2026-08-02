package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* renamed from: zc.b1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11024b1<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9021c<R, ? super T, R> f108152b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<R> f108153c;

    /* renamed from: zc.b1$a */
    static final class a<T, R> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108154a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<R, ? super T, R> f108155b;

        /* renamed from: c, reason: collision with root package name */
        R f108156c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f108157d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108158e;

        a(io.reactivex.w<? super R> wVar, InterfaceC9021c<R, ? super T, R> interfaceC9021c, R r11) {
            this.f108154a = wVar;
            this.f108155b = interfaceC9021c;
            this.f108156c = r11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108157d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108157d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108158e) {
                return;
            }
            this.f108158e = true;
            this.f108154a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108158e) {
                C3493a.f(th2);
            } else {
                this.f108158e = true;
                this.f108154a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108158e) {
                return;
            }
            try {
                R apply = this.f108155b.apply(this.f108156c, t2);
                C9656b.c(apply, "The accumulator returned a null value");
                this.f108156c = apply;
                this.f108154a.onNext(apply);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108157d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108157d, interfaceC8487b)) {
                this.f108157d = interfaceC8487b;
                io.reactivex.w<? super R> wVar = this.f108154a;
                wVar.onSubscribe(this);
                wVar.onNext(this.f108156c);
            }
        }
    }

    public C11024b1(io.reactivex.p pVar, Callable callable, InterfaceC9021c interfaceC9021c) {
        super(pVar);
        this.f108152b = interfaceC9021c;
        this.f108153c = callable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        try {
            R call = this.f108153c.call();
            C9656b.c(call, "The seed supplied is null");
            this.f108122a.subscribe(new a(wVar, this.f108152b, call));
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
