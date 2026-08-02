package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class E0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends io.reactivex.u<? extends T>> f107618b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f107619c;

    static final class a<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107620a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Throwable, ? extends io.reactivex.u<? extends T>> f107621b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f107622c;

        /* renamed from: d, reason: collision with root package name */
        final rc.h f107623d = new rc.h();

        /* renamed from: e, reason: collision with root package name */
        boolean f107624e;

        /* renamed from: f, reason: collision with root package name */
        boolean f107625f;

        a(io.reactivex.w<? super T> wVar, qc.o<? super Throwable, ? extends io.reactivex.u<? extends T>> oVar, boolean z11) {
            this.f107620a = wVar;
            this.f107621b = oVar;
            this.f107622c = z11;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107625f) {
                return;
            }
            this.f107625f = true;
            this.f107624e = true;
            this.f107620a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            boolean z11 = this.f107624e;
            io.reactivex.w<? super T> wVar = this.f107620a;
            if (z11) {
                if (this.f107625f) {
                    C3493a.f(th2);
                    return;
                } else {
                    wVar.onError(th2);
                    return;
                }
            }
            this.f107624e = true;
            if (this.f107622c && !(th2 instanceof Exception)) {
                wVar.onError(th2);
                return;
            }
            try {
                io.reactivex.u<? extends T> apply = this.f107621b.apply(th2);
                if (apply != null) {
                    apply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                wVar.onError(nullPointerException);
            } catch (Throwable th3) {
                C2645f.c(th3);
                wVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107625f) {
                return;
            }
            this.f107620a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f107623d;
            hVar.getClass();
            rc.d.d(hVar, interfaceC8487b);
        }
    }

    public E0(io.reactivex.p pVar, qc.o oVar, boolean z11) {
        super(pVar);
        this.f107618b = oVar;
        this.f107619c = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar, this.f107618b, this.f107619c);
        wVar.onSubscribe(aVar.f107623d);
        this.f108122a.subscribe(aVar);
    }
}
