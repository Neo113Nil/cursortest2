package zc;

import Bl0.C2645f;
import Nc.C3669c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class W0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super io.reactivex.p<Throwable>, ? extends io.reactivex.u<?>> f108055b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108056a;

        /* renamed from: d, reason: collision with root package name */
        final Nc.e<Throwable> f108059d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.u<T> f108062g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108063h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f108057b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final Gc.c f108058c = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C2335a f108060e = new C2335a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108061f = new AtomicReference<>();

        /* renamed from: zc.W0$a$a, reason: collision with other inner class name */
        final class C2335a extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object> {
            C2335a() {
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                a aVar = a.this;
                rc.d.a(aVar.f108061f);
                Bl0.B.b(aVar.f108056a, aVar, aVar.f108058c);
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                a aVar = a.this;
                rc.d.a(aVar.f108061f);
                Bl0.B.c(aVar.f108056a, th2, aVar, aVar.f108058c);
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

        a(io.reactivex.w<? super T> wVar, Nc.e<Throwable> eVar, io.reactivex.u<T> uVar) {
            this.f108056a = wVar;
            this.f108059d = eVar;
            this.f108062g = uVar;
        }

        final void a() {
            if (this.f108057b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f108063h) {
                        this.f108063h = true;
                        this.f108062g.subscribe(this);
                    }
                    if (this.f108057b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108061f);
            rc.d.a(this.f108060e);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f108061f.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this.f108060e);
            Bl0.B.b(this.f108056a, this, this.f108058c);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.d(this.f108061f, null);
            this.f108063h = false;
            this.f108059d.onNext(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Bl0.B.d(this.f108056a, t2, this, this.f108058c);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this.f108061f, interfaceC8487b);
        }
    }

    public W0(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f108055b = oVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Nc.e<T> c11 = C3669c.d().c();
        try {
            io.reactivex.u<?> apply = this.f108055b.apply(c11);
            C9656b.c(apply, "The handler returned a null ObservableSource");
            io.reactivex.u<?> uVar = apply;
            a aVar = new a(wVar, c11, this.f108122a);
            wVar.onSubscribe(aVar);
            uVar.subscribe(aVar.f108060e);
            aVar.a();
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
