package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* renamed from: zc.a1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11021a1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9021c<T, T, T> f108135b;

    /* renamed from: zc.a1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108136a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<T, T, T> f108137b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108138c;

        /* renamed from: d, reason: collision with root package name */
        T f108139d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108140e;

        a(io.reactivex.w<? super T> wVar, InterfaceC9021c<T, T, T> interfaceC9021c) {
            this.f108136a = wVar;
            this.f108137b = interfaceC9021c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108138c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108138c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108140e) {
                return;
            }
            this.f108140e = true;
            this.f108136a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108140e) {
                C3493a.f(th2);
            } else {
                this.f108140e = true;
                this.f108136a.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108140e) {
                return;
            }
            T t11 = this.f108139d;
            io.reactivex.w<? super T> wVar = this.f108136a;
            if (t11 == null) {
                this.f108139d = t2;
                wVar.onNext(t2);
                return;
            }
            try {
                T apply = this.f108137b.apply(t11, t2);
                C9656b.c(apply, "The value returned by the accumulator is null");
                this.f108139d = apply;
                wVar.onNext(apply);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108138c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108138c, interfaceC8487b)) {
                this.f108138c = interfaceC8487b;
                this.f108136a.onSubscribe(this);
            }
        }
    }

    public C11021a1(io.reactivex.p pVar, InterfaceC9021c interfaceC9021c) {
        super(pVar);
        this.f108135b = interfaceC9021c;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108135b));
    }
}
