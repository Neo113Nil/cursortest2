package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.Iterator;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class O1<T, U, V> extends io.reactivex.p<V> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p<? extends T> f107908a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<U> f107909b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9021c<? super T, ? super U, ? extends V> f107910c;

    static final class a<T, U, V> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super V> f107911a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<U> f107912b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC9021c<? super T, ? super U, ? extends V> f107913c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f107914d;

        /* renamed from: e, reason: collision with root package name */
        boolean f107915e;

        a(io.reactivex.w<? super V> wVar, Iterator<U> it, InterfaceC9021c<? super T, ? super U, ? extends V> interfaceC9021c) {
            this.f107911a = wVar;
            this.f107912b = it;
            this.f107913c = interfaceC9021c;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107914d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107914d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107915e) {
                return;
            }
            this.f107915e = true;
            this.f107911a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107915e) {
                C3493a.f(th2);
            } else {
                this.f107915e = true;
                this.f107911a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            io.reactivex.w<? super V> wVar = this.f107911a;
            Iterator<U> it = this.f107912b;
            if (this.f107915e) {
                return;
            }
            try {
                U next = it.next();
                C9656b.c(next, "The iterator returned a null value");
                try {
                    V apply = this.f107913c.apply(t2, next);
                    C9656b.c(apply, "The zipper function returned a null value");
                    wVar.onNext(apply);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f107915e = true;
                        this.f107914d.dispose();
                        wVar.onComplete();
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f107915e = true;
                        this.f107914d.dispose();
                        wVar.onError(th2);
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    this.f107915e = true;
                    this.f107914d.dispose();
                    wVar.onError(th3);
                }
            } catch (Throwable th4) {
                C2645f.c(th4);
                this.f107915e = true;
                this.f107914d.dispose();
                wVar.onError(th4);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107914d, interfaceC8487b)) {
                this.f107914d = interfaceC8487b;
                this.f107911a.onSubscribe(this);
            }
        }
    }

    public O1(io.reactivex.p<? extends T> pVar, Iterable<U> iterable, InterfaceC9021c<? super T, ? super U, ? extends V> interfaceC9021c) {
        this.f107908a = pVar;
        this.f107909b = iterable;
        this.f107910c = interfaceC9021c;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super V> wVar) {
        try {
            Iterator<U> it = this.f107909b.iterator();
            C9656b.c(it, "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    rc.e.b(wVar);
                } else {
                    this.f107908a.subscribe(new a(wVar, it, this.f107910c));
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                rc.e.d(th2, wVar);
            }
        } catch (Throwable th3) {
            C2645f.c(th3);
            rc.e.d(th3, wVar);
        }
    }
}
