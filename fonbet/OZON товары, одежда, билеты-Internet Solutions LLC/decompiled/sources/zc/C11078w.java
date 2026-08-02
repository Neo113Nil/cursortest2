package zc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11078w<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.f f108710b;

    /* renamed from: zc.w$a */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108711a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.f f108712b;

        /* renamed from: c, reason: collision with root package name */
        boolean f108713c;

        a(io.reactivex.w<? super T> wVar, io.reactivex.f fVar) {
            this.f108711a = wVar;
            this.f108712b = fVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108713c) {
                this.f108711a.onComplete();
                return;
            }
            this.f108713c = true;
            rc.d.d(this, null);
            io.reactivex.f fVar = this.f108712b;
            this.f108712b = null;
            fVar.a(this);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108711a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108711a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (!rc.d.f(this, interfaceC8487b) || this.f108713c) {
                return;
            }
            this.f108711a.onSubscribe(this);
        }
    }

    public C11078w(io.reactivex.p<T> pVar, io.reactivex.f fVar) {
        super(pVar);
        this.f108710b = fVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108710b));
    }
}
