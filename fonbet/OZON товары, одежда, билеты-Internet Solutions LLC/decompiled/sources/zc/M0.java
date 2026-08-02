package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class M0<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107848a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9021c<T, T, T> f107849b;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f107850a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<T, T, T> f107851b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107852c;

        /* renamed from: d, reason: collision with root package name */
        T f107853d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f107854e;

        a(io.reactivex.m<? super T> mVar, InterfaceC9021c<T, T, T> interfaceC9021c) {
            this.f107850a = mVar;
            this.f107851b = interfaceC9021c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107854e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107854e.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107852c) {
                return;
            }
            this.f107852c = true;
            T t2 = this.f107853d;
            this.f107853d = null;
            io.reactivex.m<? super T> mVar = this.f107850a;
            if (t2 != null) {
                mVar.onSuccess(t2);
            } else {
                mVar.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107852c) {
                C3493a.f(th2);
                return;
            }
            this.f107852c = true;
            this.f107853d = null;
            this.f107850a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107852c) {
                return;
            }
            T t11 = this.f107853d;
            if (t11 == null) {
                this.f107853d = t2;
                return;
            }
            try {
                T apply = this.f107851b.apply(t11, t2);
                C9656b.c(apply, "The reducer returned a null value");
                this.f107853d = apply;
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f107854e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107854e, interfaceC8487b)) {
                this.f107854e = interfaceC8487b;
                this.f107850a.onSubscribe(this);
            }
        }
    }

    public M0(io.reactivex.p pVar, InterfaceC9021c interfaceC9021c) {
        this.f107848a = pVar;
        this.f107849b = interfaceC9021c;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f107848a.subscribe(new a(mVar, this.f107849b));
    }
}
