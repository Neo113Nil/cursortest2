package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class U0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.d<? super Integer, ? super Throwable> f108013b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108014a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f108015b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108016c;

        /* renamed from: d, reason: collision with root package name */
        final qc.d<? super Integer, ? super Throwable> f108017d;

        /* renamed from: e, reason: collision with root package name */
        int f108018e;

        a(io.reactivex.w<? super T> wVar, qc.d<? super Integer, ? super Throwable> dVar, rc.h hVar, io.reactivex.u<? extends T> uVar) {
            this.f108014a = wVar;
            this.f108015b = hVar;
            this.f108016c = uVar;
            this.f108017d = dVar;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                int i11 = 1;
                while (!this.f108015b.isDisposed()) {
                    this.f108016c.subscribe(this);
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108014a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            io.reactivex.w<? super T> wVar = this.f108014a;
            try {
                qc.d<? super Integer, ? super Throwable> dVar = this.f108017d;
                int i11 = this.f108018e + 1;
                this.f108018e = i11;
                if (dVar.a(Integer.valueOf(i11), th2)) {
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
            this.f108014a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f108015b;
            hVar.getClass();
            rc.d.d(hVar, interfaceC8487b);
        }
    }

    public U0(io.reactivex.p<T> pVar, qc.d<? super Integer, ? super Throwable> dVar) {
        super(pVar);
        this.f108013b = dVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        rc.h hVar = new rc.h();
        wVar.onSubscribe(hVar);
        new a(wVar, this.f108013b, hVar, this.f108122a).a();
    }
}
