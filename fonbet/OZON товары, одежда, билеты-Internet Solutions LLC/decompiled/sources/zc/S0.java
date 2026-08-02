package zc;

import Bl0.C2645f;
import Nc.C3669c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class S0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super io.reactivex.p<Object>, ? extends io.reactivex.u<?>> f107965b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107966a;

        /* renamed from: d, reason: collision with root package name */
        final Nc.e<Object> f107969d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.u<T> f107972g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f107973h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f107967b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final Gc.c f107968c = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C2334a f107970e = new C2334a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107971f = new AtomicReference<>();

        /* renamed from: zc.S0$a$a, reason: collision with other inner class name */
        final class C2334a extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object> {
            C2334a() {
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                a aVar = a.this;
                rc.d.a(aVar.f107971f);
                Bl0.B.b(aVar.f107966a, aVar, aVar.f107968c);
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                a aVar = a.this;
                rc.d.a(aVar.f107971f);
                Bl0.B.c(aVar.f107966a, th2, aVar, aVar.f107968c);
            }

            @Override // io.reactivex.w
            public final void onNext(Object obj) {
                a.this.a();
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super T> wVar, Nc.e<Object> eVar, io.reactivex.u<T> uVar) {
            this.f107966a = wVar;
            this.f107969d = eVar;
            this.f107972g = uVar;
        }

        final void a() {
            if (this.f107967b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f107973h) {
                        this.f107973h = true;
                        this.f107972g.subscribe(this);
                    }
                    if (this.f107967b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f107971f);
            rc.d.a(this.f107970e);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107971f.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.d(this.f107971f, null);
            this.f107973h = false;
            this.f107969d.onNext(0);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f107970e);
            Bl0.B.c(this.f107966a, th2, this, this.f107968c);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Bl0.B.d(this.f107966a, t2, this, this.f107968c);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107971f, interfaceC8487b);
        }
    }

    public S0(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f107965b = oVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Nc.e<T> c11 = C3669c.d().c();
        try {
            io.reactivex.u<?> apply = this.f107965b.apply(c11);
            C9656b.c(apply, "The handler returned a null ObservableSource");
            io.reactivex.u<?> uVar = apply;
            a aVar = new a(wVar, c11, this.f108122a);
            wVar.onSubscribe(aVar);
            uVar.subscribe(aVar.f107970e);
            aVar.a();
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
