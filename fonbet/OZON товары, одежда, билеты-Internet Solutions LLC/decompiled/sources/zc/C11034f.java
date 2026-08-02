package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* renamed from: zc.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11034f<T> extends AbstractC11019a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108224b;

    /* renamed from: zc.f$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f108225a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108226b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108227c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108228d;

        a(io.reactivex.w<? super Boolean> wVar, qc.q<? super T> qVar) {
            this.f108225a = wVar;
            this.f108226b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108227c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108227c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108228d) {
                return;
            }
            this.f108228d = true;
            Boolean bool = Boolean.TRUE;
            io.reactivex.w<? super Boolean> wVar = this.f108225a;
            wVar.onNext(bool);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108228d) {
                C3493a.f(th2);
            } else {
                this.f108228d = true;
                this.f108225a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108228d) {
                return;
            }
            try {
                if (this.f108226b.test(t2)) {
                    return;
                }
                this.f108228d = true;
                this.f108227c.dispose();
                Boolean bool = Boolean.FALSE;
                io.reactivex.w<? super Boolean> wVar = this.f108225a;
                wVar.onNext(bool);
                wVar.onComplete();
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108227c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108227c, interfaceC8487b)) {
                this.f108227c = interfaceC8487b;
                this.f108225a.onSubscribe(this);
            }
        }
    }

    public C11034f(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108224b = qVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super Boolean> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108224b));
    }
}
