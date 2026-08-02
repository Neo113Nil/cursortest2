package zc;

import uc.AbstractC10017a;

/* loaded from: classes.dex */
public final class V<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108019b;

    static final class a<T> extends AbstractC10017a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.q<? super T> f108020f;

        a(io.reactivex.w<? super T> wVar, qc.q<? super T> qVar) {
            super(wVar);
            this.f108020f = qVar;
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            int i11 = this.f100558e;
            io.reactivex.w<? super R> wVar = this.f100554a;
            if (i11 != 0) {
                wVar.onNext(null);
                return;
            }
            try {
                if (this.f108020f.test(t2)) {
                    wVar.onNext(t2);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.f100556c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f108020f.test(poll));
            return poll;
        }
    }

    public V(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108019b = qVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108019b));
    }
}
