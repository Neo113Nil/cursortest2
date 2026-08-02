package zc;

import Kc.C3493a;
import nc.InterfaceC8487b;

/* renamed from: zc.f1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11036f1<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108236a;

    /* renamed from: zc.f1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f108237a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108238b;

        /* renamed from: c, reason: collision with root package name */
        T f108239c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108240d;

        a(io.reactivex.m<? super T> mVar) {
            this.f108237a = mVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108238b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108238b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108240d) {
                return;
            }
            this.f108240d = true;
            T t2 = this.f108239c;
            this.f108239c = null;
            io.reactivex.m<? super T> mVar = this.f108237a;
            if (t2 == null) {
                mVar.onComplete();
            } else {
                mVar.onSuccess(t2);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108240d) {
                C3493a.f(th2);
            } else {
                this.f108240d = true;
                this.f108237a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108240d) {
                return;
            }
            if (this.f108239c == null) {
                this.f108239c = t2;
                return;
            }
            this.f108240d = true;
            this.f108238b.dispose();
            this.f108237a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108238b, interfaceC8487b)) {
                this.f108238b = interfaceC8487b;
                this.f108237a.onSubscribe(this);
            }
        }
    }

    public C11036f1(io.reactivex.p pVar) {
        this.f108236a = pVar;
    }

    @Override // io.reactivex.k
    public final void d(io.reactivex.m<? super T> mVar) {
        this.f108236a.subscribe(new a(mVar));
    }
}
