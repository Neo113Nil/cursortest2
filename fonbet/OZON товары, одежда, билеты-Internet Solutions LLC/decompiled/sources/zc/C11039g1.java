package zc;

import Kc.C3493a;
import java.util.NoSuchElementException;
import nc.InterfaceC8487b;

/* renamed from: zc.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11039g1<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108250a;

    /* renamed from: b, reason: collision with root package name */
    final T f108251b;

    /* renamed from: zc.g1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f108252a;

        /* renamed from: b, reason: collision with root package name */
        final T f108253b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108254c;

        /* renamed from: d, reason: collision with root package name */
        T f108255d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108256e;

        a(io.reactivex.A<? super T> a11, T t2) {
            this.f108252a = a11;
            this.f108253b = t2;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108254c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108254c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108256e) {
                return;
            }
            this.f108256e = true;
            T t2 = this.f108255d;
            this.f108255d = null;
            if (t2 == null) {
                t2 = this.f108253b;
            }
            io.reactivex.A<? super T> a11 = this.f108252a;
            if (t2 != null) {
                a11.onSuccess(t2);
            } else {
                a11.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108256e) {
                C3493a.f(th2);
            } else {
                this.f108256e = true;
                this.f108252a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108256e) {
                return;
            }
            if (this.f108255d == null) {
                this.f108255d = t2;
                return;
            }
            this.f108256e = true;
            this.f108254c.dispose();
            this.f108252a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108254c, interfaceC8487b)) {
                this.f108254c = interfaceC8487b;
                this.f108252a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11039g1(io.reactivex.p pVar, Object obj) {
        this.f108250a = pVar;
        this.f108251b = obj;
    }

    @Override // io.reactivex.y
    public final void i(io.reactivex.A<? super T> a11) {
        this.f108250a.subscribe(new a(a11, this.f108251b));
    }
}
