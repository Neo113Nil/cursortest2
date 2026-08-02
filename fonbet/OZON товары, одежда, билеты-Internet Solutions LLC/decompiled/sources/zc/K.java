package zc;

import uc.AbstractC10017a;

/* loaded from: classes.dex */
public final class K<T, K> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, K> f107772b;

    /* renamed from: c, reason: collision with root package name */
    final qc.d<? super K, ? super K> f107773c;

    static final class a<T, K> extends AbstractC10017a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.o<? super T, K> f107774f;

        /* renamed from: g, reason: collision with root package name */
        final qc.d<? super K, ? super K> f107775g;

        /* renamed from: h, reason: collision with root package name */
        K f107776h;

        /* renamed from: i, reason: collision with root package name */
        boolean f107777i;

        a(io.reactivex.w<? super T> wVar, qc.o<? super T, K> oVar, qc.d<? super K, ? super K> dVar) {
            super(wVar);
            this.f107774f = oVar;
            this.f107775g = dVar;
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f100557d) {
                return;
            }
            int i11 = this.f100558e;
            io.reactivex.w<? super R> wVar = this.f100554a;
            if (i11 != 0) {
                wVar.onNext(t2);
                return;
            }
            try {
                K apply = this.f107774f.apply(t2);
                if (this.f107777i) {
                    boolean a11 = this.f107775g.a(this.f107776h, apply);
                    this.f107776h = apply;
                    if (a11) {
                        return;
                    }
                } else {
                    this.f107777i = true;
                    this.f107776h = apply;
                }
                wVar.onNext(t2);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            while (true) {
                T poll = this.f100556c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f107774f.apply(poll);
                if (!this.f107777i) {
                    this.f107777i = true;
                    this.f107776h = apply;
                    return poll;
                }
                if (!this.f107775g.a(this.f107776h, apply)) {
                    this.f107776h = apply;
                    return poll;
                }
                this.f107776h = apply;
            }
        }
    }

    public K(io.reactivex.p pVar, qc.o oVar, qc.d dVar) {
        super(pVar);
        this.f107772b = oVar;
        this.f107773c = dVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107772b, this.f107773c));
    }
}
