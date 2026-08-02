package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class N0<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107880a;

    /* renamed from: b, reason: collision with root package name */
    final R f107881b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9021c<R, ? super T, R> f107882c;

    static final class a<T, R> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super R> f107883a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<R, ? super T, R> f107884b;

        /* renamed from: c, reason: collision with root package name */
        R f107885c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f107886d;

        a(io.reactivex.A<? super R> a11, InterfaceC9021c<R, ? super T, R> interfaceC9021c, R r11) {
            this.f107883a = a11;
            this.f107885c = r11;
            this.f107884b = interfaceC9021c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107886d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107886d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            R r11 = this.f107885c;
            if (r11 != null) {
                this.f107885c = null;
                this.f107883a.onSuccess(r11);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107885c == null) {
                C3493a.f(th2);
            } else {
                this.f107885c = null;
                this.f107883a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            R r11 = this.f107885c;
            if (r11 != null) {
                try {
                    R apply = this.f107884b.apply(r11, t2);
                    C9656b.c(apply, "The reducer returned a null value");
                    this.f107885c = apply;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    this.f107886d.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107886d, interfaceC8487b)) {
                this.f107886d = interfaceC8487b;
                this.f107883a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N0(io.reactivex.p pVar, Object obj, InterfaceC9021c interfaceC9021c) {
        this.f107880a = pVar;
        this.f107881b = obj;
        this.f107882c = interfaceC9021c;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        this.f107880a.subscribe(new a(a11, this.f107882c, this.f107881b));
    }
}
