package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.Collection;
import java.util.concurrent.Callable;
import sc.C9656b;
import uc.AbstractC10017a;

/* loaded from: classes.dex */
public final class J<T, K> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, K> f107746b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f107747c;

    static final class a<T, K> extends AbstractC10017a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<? super K> f107748f;

        /* renamed from: g, reason: collision with root package name */
        final qc.o<? super T, K> f107749g;

        a(io.reactivex.w<? super T> wVar, qc.o<? super T, K> oVar, Collection<? super K> collection) {
            super(wVar);
            this.f107749g = oVar;
            this.f107748f = collection;
        }

        @Override // uc.AbstractC10017a, tc.InterfaceC9808j
        public final void clear() {
            this.f107748f.clear();
            super.clear();
        }

        @Override // uc.AbstractC10017a, io.reactivex.w
        public final void onComplete() {
            if (this.f100557d) {
                return;
            }
            this.f100557d = true;
            this.f107748f.clear();
            this.f100554a.onComplete();
        }

        @Override // uc.AbstractC10017a, io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f100557d) {
                C3493a.f(th2);
                return;
            }
            this.f100557d = true;
            this.f107748f.clear();
            this.f100554a.onError(th2);
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
                K apply = this.f107749g.apply(t2);
                C9656b.c(apply, "The keySelector returned a null key");
                if (this.f107748f.add(apply)) {
                    wVar.onNext(t2);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll;
            K apply;
            do {
                poll = this.f100556c.poll();
                if (poll == null) {
                    break;
                }
                apply = this.f107749g.apply(poll);
                C9656b.c(apply, "The keySelector returned a null key");
            } while (!this.f107748f.add(apply));
            return poll;
        }
    }

    public J(io.reactivex.p pVar, qc.o oVar, Callable callable) {
        super(pVar);
        this.f107746b = oVar;
        this.f107747c = callable;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        try {
            Collection<? super K> call = this.f107747c.call();
            C9656b.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f108122a.subscribe(new a(wVar, this.f107746b, call));
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
