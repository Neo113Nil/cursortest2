package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class V0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super Throwable> f108021b;

    /* renamed from: c, reason: collision with root package name */
    final long f108022c;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108023a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f108024b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108025c;

        /* renamed from: d, reason: collision with root package name */
        final qc.q<? super Throwable> f108026d;

        /* renamed from: e, reason: collision with root package name */
        long f108027e;

        a(io.reactivex.w<? super T> wVar, long j11, qc.q<? super Throwable> qVar, rc.h hVar, io.reactivex.u<? extends T> uVar) {
            this.f108023a = wVar;
            this.f108024b = hVar;
            this.f108025c = uVar;
            this.f108026d = qVar;
            this.f108027e = j11;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                int i11 = 1;
                while (!this.f108024b.isDisposed()) {
                    this.f108025c.subscribe(this);
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108023a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            long j11 = this.f108027e;
            if (j11 != Long.MAX_VALUE) {
                this.f108027e = j11 - 1;
            }
            io.reactivex.w<? super T> wVar = this.f108023a;
            if (j11 == 0) {
                wVar.onError(th2);
                return;
            }
            try {
                if (this.f108026d.test(th2)) {
                    a();
                } else {
                    wVar.onError(th2);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                wVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108023a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f108024b;
            hVar.getClass();
            rc.d.d(hVar, interfaceC8487b);
        }
    }

    public V0(io.reactivex.p<T> pVar, long j11, qc.q<? super Throwable> qVar) {
        super(pVar);
        this.f108021b = qVar;
        this.f108022c = j11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        rc.h hVar = new rc.h();
        wVar.onSubscribe(hVar);
        new a(wVar, this.f108022c, this.f108021b, hVar, this.f108122a).a();
    }
}
