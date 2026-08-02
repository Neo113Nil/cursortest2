package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import rc.C9243b;

/* loaded from: classes.dex */
public final class B<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.s<T> f107549a;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.r<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107550a;

        a(io.reactivex.w<? super T> wVar) {
            this.f107550a = wVar;
        }

        @Override // io.reactivex.r
        public final void a(qc.f fVar) {
            rc.d.e(this, new C9243b(fVar));
        }

        @Override // io.reactivex.r
        public final boolean b(Throwable th2) {
            if (isDisposed()) {
                return false;
            }
            try {
                this.f107550a.onError(th2);
                rc.d.a(this);
                return true;
            } catch (Throwable th3) {
                rc.d.a(this);
                throw th3;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.g
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f107550a.onComplete();
            } finally {
                rc.d.a(this);
            }
        }

        @Override // io.reactivex.g
        public final void onNext(T t2) {
            if (t2 != null) {
                if (isDisposed()) {
                    return;
                }
                this.f107550a.onNext(t2);
            } else {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (b(nullPointerException)) {
                    return;
                }
                C3493a.f(nullPointerException);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return T7.Z.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public B(io.reactivex.s<T> sVar) {
        this.f107549a = sVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        try {
            ((Ge.l) this.f107549a).a(aVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (aVar.b(th2)) {
                return;
            }
            C3493a.f(th2);
        }
    }
}
