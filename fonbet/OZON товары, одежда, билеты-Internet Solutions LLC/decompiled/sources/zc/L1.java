package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* loaded from: classes.dex */
public final class L1<T, U, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9021c<? super T, ? super U, ? extends R> f107835b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.u<? extends U> f107836c;

    static final class a<T, U, R> extends AtomicReference<U> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f107837a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<? super T, ? super U, ? extends R> f107838b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107839c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107840d = new AtomicReference<>();

        a(Ic.e eVar, InterfaceC9021c interfaceC9021c) {
            this.f107837a = eVar;
            this.f107838b = interfaceC9021c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f107839c);
            rc.d.a(this.f107840d);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107839c.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this.f107840d);
            this.f107837a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f107840d);
            this.f107837a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Ic.e eVar = this.f107837a;
            U u11 = get();
            if (u11 != null) {
                try {
                    R apply = this.f107838b.apply(t2, u11);
                    C9656b.c(apply, "The combiner returned a null value");
                    eVar.onNext(apply);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    dispose();
                    eVar.onError(th2);
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107839c, interfaceC8487b);
        }
    }

    final class b implements io.reactivex.w<U> {

        /* renamed from: a, reason: collision with root package name */
        private final a<T, U, R> f107841a;

        b(a aVar) {
            this.f107841a = aVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            a<T, U, R> aVar = this.f107841a;
            rc.d.a(aVar.f107839c);
            aVar.f107837a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(U u11) {
            this.f107841a.lazySet(u11);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107841a.f107840d, interfaceC8487b);
        }
    }

    public L1(io.reactivex.p pVar, InterfaceC9021c interfaceC9021c, io.reactivex.u uVar) {
        super(pVar);
        this.f107835b = interfaceC9021c;
        this.f107836c = uVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        Ic.e eVar = new Ic.e(wVar);
        a aVar = new a(eVar, this.f107835b);
        eVar.onSubscribe(aVar);
        this.f107836c.subscribe(new b(aVar));
        this.f108122a.subscribe(aVar);
    }
}
