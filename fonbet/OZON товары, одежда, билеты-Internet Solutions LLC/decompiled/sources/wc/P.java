package wc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.NoSuchElementException;
import nc.InterfaceC8487b;
import tc.InterfaceC9800b;

/* loaded from: classes9.dex */
public final class P<T> extends io.reactivex.y<T> implements InterfaceC9800b<T> {

    /* renamed from: a, reason: collision with root package name */
    final K f103863a;

    static final class a<T> implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f103864a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6950c f103865b;

        /* renamed from: c, reason: collision with root package name */
        boolean f103866c;

        /* renamed from: d, reason: collision with root package name */
        T f103867d;

        a(io.reactivex.A a11) {
            this.f103864a = a11;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103865b, interfaceC6950c)) {
                this.f103865b = interfaceC6950c;
                this.f103864a.onSubscribe(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f103865b.cancel();
            this.f103865b = Fc.g.CANCELLED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f103865b == Fc.g.CANCELLED;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103866c) {
                return;
            }
            this.f103866c = true;
            this.f103865b = Fc.g.CANCELLED;
            T t2 = this.f103867d;
            this.f103867d = null;
            if (t2 == null) {
                t2 = null;
            }
            io.reactivex.A<? super T> a11 = this.f103864a;
            if (t2 != null) {
                a11.onSuccess(t2);
            } else {
                a11.onError(new NoSuchElementException());
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103866c) {
                C3493a.f(th2);
                return;
            }
            this.f103866c = true;
            this.f103865b = Fc.g.CANCELLED;
            this.f103864a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103866c) {
                return;
            }
            if (this.f103867d == null) {
                this.f103867d = t2;
                return;
            }
            this.f103866c = true;
            this.f103865b.cancel();
            this.f103865b = Fc.g.CANCELLED;
            this.f103864a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public P(K k11) {
        this.f103863a = k11;
    }

    @Override // tc.InterfaceC9800b
    public final O a() {
        return new O(this.f103863a);
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f103863a.i(new a(a11));
    }
}
