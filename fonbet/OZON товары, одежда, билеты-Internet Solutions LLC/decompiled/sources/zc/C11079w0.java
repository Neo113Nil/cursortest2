package zc;

import sc.C9656b;
import uc.AbstractC10017a;

/* renamed from: zc.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11079w0<T, U> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends U> f108714b;

    /* renamed from: zc.w0$a */
    static final class a<T, U> extends AbstractC10017a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final qc.o<? super T, ? extends U> f108715f;

        a(io.reactivex.w<? super U> wVar, qc.o<? super T, ? extends U> oVar) {
            super(wVar);
            this.f108715f = oVar;
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f100557d) {
                return;
            }
            int i11 = this.f100558e;
            io.reactivex.w<? super R> wVar = this.f100554a;
            if (i11 != 0) {
                wVar.onNext(null);
                return;
            }
            try {
                U apply = this.f108715f.apply(t2);
                C9656b.c(apply, "The mapper function returned a null value.");
                wVar.onNext(apply);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final U poll() throws Exception {
            T poll = this.f100556c.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f108715f.apply(poll);
            C9656b.c(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public C11079w0(io.reactivex.u<T> uVar, qc.o<? super T, ? extends U> oVar) {
        super(uVar);
        this.f108714b = oVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super U> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108714b));
    }
}
