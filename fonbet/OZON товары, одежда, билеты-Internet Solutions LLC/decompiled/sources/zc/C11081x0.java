package zc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import oc.C8691a;
import sc.C9656b;

/* renamed from: zc.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11081x0<T, R> extends AbstractC11019a<T, io.reactivex.u<? extends R>> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108730b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends io.reactivex.u<? extends R>> f108731c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<? extends io.reactivex.u<? extends R>> f108732d;

    /* renamed from: zc.x0$a */
    static final class a<T, R> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.u<? extends R>> f108733a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108734b;

        /* renamed from: c, reason: collision with root package name */
        final qc.o<? super Throwable, ? extends io.reactivex.u<? extends R>> f108735c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<? extends io.reactivex.u<? extends R>> f108736d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f108737e;

        a(io.reactivex.w<? super io.reactivex.u<? extends R>> wVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar, qc.o<? super Throwable, ? extends io.reactivex.u<? extends R>> oVar2, Callable<? extends io.reactivex.u<? extends R>> callable) {
            this.f108733a = wVar;
            this.f108734b = oVar;
            this.f108735c = oVar2;
            this.f108736d = callable;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108737e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108737e.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            io.reactivex.w<? super io.reactivex.u<? extends R>> wVar = this.f108733a;
            try {
                io.reactivex.u<? extends R> call = this.f108736d.call();
                C9656b.c(call, "The onComplete ObservableSource returned is null");
                wVar.onNext(call);
                wVar.onComplete();
            } catch (Throwable th2) {
                C2645f.c(th2);
                wVar.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            io.reactivex.w<? super io.reactivex.u<? extends R>> wVar = this.f108733a;
            try {
                io.reactivex.u<? extends R> apply = this.f108735c.apply(th2);
                C9656b.c(apply, "The onError ObservableSource returned is null");
                wVar.onNext(apply);
                wVar.onComplete();
            } catch (Throwable th3) {
                C2645f.c(th3);
                wVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            io.reactivex.w<? super io.reactivex.u<? extends R>> wVar = this.f108733a;
            try {
                io.reactivex.u<? extends R> apply = this.f108734b.apply(t2);
                C9656b.c(apply, "The onNext ObservableSource returned is null");
                wVar.onNext(apply);
            } catch (Throwable th2) {
                C2645f.c(th2);
                wVar.onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108737e, interfaceC8487b)) {
                this.f108737e = interfaceC8487b;
                this.f108733a.onSubscribe(this);
            }
        }
    }

    public C11081x0(io.reactivex.p pVar, qc.o oVar, qc.o oVar2, Callable callable) {
        super(pVar);
        this.f108730b = oVar;
        this.f108731c = oVar2;
        this.f108732d = callable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.u<? extends R>> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108730b, this.f108731c, this.f108732d));
    }
}
