package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;

/* renamed from: zc.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11044i0<T, S> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<S> f108276a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9021c<S, io.reactivex.g<T>, S> f108277b;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super S> f108278c;

    /* renamed from: zc.i0$a */
    static final class a<T, S> implements io.reactivex.g<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108279a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9021c<S, ? super io.reactivex.g<T>, S> f108280b;

        /* renamed from: c, reason: collision with root package name */
        final qc.g<? super S> f108281c;

        /* renamed from: d, reason: collision with root package name */
        S f108282d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f108283e;

        /* renamed from: f, reason: collision with root package name */
        boolean f108284f;

        a(io.reactivex.w<? super T> wVar, InterfaceC9021c<S, ? super io.reactivex.g<T>, S> interfaceC9021c, qc.g<? super S> gVar, S s11) {
            this.f108279a = wVar;
            this.f108280b = interfaceC9021c;
            this.f108281c = gVar;
            this.f108282d = s11;
        }

        private void c(S s11) {
            try {
                this.f108281c.accept(s11);
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
        }

        public final void d() {
            S s11 = this.f108282d;
            if (this.f108283e) {
                this.f108282d = null;
                c(s11);
                return;
            }
            InterfaceC9021c<S, ? super io.reactivex.g<T>, S> interfaceC9021c = this.f108280b;
            while (!this.f108283e) {
                try {
                    s11 = interfaceC9021c.apply(s11, this);
                    if (this.f108284f) {
                        this.f108283e = true;
                        this.f108282d = null;
                        c(s11);
                        return;
                    }
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    this.f108282d = null;
                    this.f108283e = true;
                    if (this.f108284f) {
                        C3493a.f(th2);
                    } else {
                        this.f108284f = true;
                        this.f108279a.onError(th2);
                    }
                    c(s11);
                    return;
                }
            }
            this.f108282d = null;
            c(s11);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108283e = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108283e;
        }
    }

    public C11044i0(Callable<S> callable, InterfaceC9021c<S, io.reactivex.g<T>, S> interfaceC9021c, qc.g<? super S> gVar) {
        this.f108276a = callable;
        this.f108277b = interfaceC9021c;
        this.f108278c = gVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        try {
            a aVar = new a(wVar, this.f108277b, this.f108278c, this.f108276a.call());
            wVar.onSubscribe(aVar);
            aVar.d();
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
