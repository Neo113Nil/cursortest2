package zc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11057m1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f108412b;

    /* renamed from: zc.m1$a */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108413a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108414b = new AtomicReference<>();

        a(io.reactivex.w<? super T> wVar) {
            this.f108413a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108414b);
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108413a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108413a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108413a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108414b, interfaceC8487b);
        }
    }

    /* renamed from: zc.m1$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a<T> f108415a;

        b(a<T> aVar) {
            this.f108415a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C11057m1.this.f108122a.subscribe(this.f108415a);
        }
    }

    public C11057m1(io.reactivex.p pVar, io.reactivex.x xVar) {
        super(pVar);
        this.f108412b = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        rc.d.f(aVar, this.f108412b.d(new b(aVar)));
    }
}
