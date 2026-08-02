package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11023b0<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends Iterable<? extends R>> f108148b;

    /* renamed from: zc.b0$a */
    static final class a<T, R> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108149a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends Iterable<? extends R>> f108150b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108151c;

        a(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f108149a = wVar;
            this.f108150b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108151c.dispose();
            this.f108151c = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108151c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            InterfaceC8487b interfaceC8487b = this.f108151c;
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar) {
                return;
            }
            this.f108151c = dVar;
            this.f108149a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            InterfaceC8487b interfaceC8487b = this.f108151c;
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar) {
                C3493a.f(th2);
            } else {
                this.f108151c = dVar;
                this.f108149a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108151c == rc.d.DISPOSED) {
                return;
            }
            try {
                for (R r11 : this.f108150b.apply(t2)) {
                    try {
                        try {
                            C9656b.c(r11, "The iterator returned a null value");
                            this.f108149a.onNext(r11);
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            this.f108151c.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        C2645f.c(th3);
                        this.f108151c.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C2645f.c(th4);
                this.f108151c.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108151c, interfaceC8487b)) {
                this.f108151c = interfaceC8487b;
                this.f108149a.onSubscribe(this);
            }
        }
    }

    public C11023b0(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f108148b = oVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108148b));
    }
}
