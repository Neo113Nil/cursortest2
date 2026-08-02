package zc;

import uc.AbstractC10017a;

/* loaded from: classes9.dex */
public final class L<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super T> f107827b;

    static final class a<T> extends AbstractC10017a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.g<? super T> f107828f;

        a(io.reactivex.w<? super T> wVar, qc.g<? super T> gVar) {
            super(wVar);
            this.f107828f = gVar;
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f100554a.onNext(t2);
            if (this.f100558e == 0) {
                try {
                    this.f107828f.accept(t2);
                } catch (Throwable th2) {
                    b(th2);
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f100556c.poll();
            if (poll != null) {
                this.f107828f.accept(poll);
            }
            return poll;
        }
    }

    public L(io.reactivex.p pVar, qc.g gVar) {
        super(pVar);
        this.f107827b = gVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107827b));
    }
}
