package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wc.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10472A<T> extends AbstractC10480a<T, T> implements qc.g<T> {

    /* renamed from: d, reason: collision with root package name */
    final C10472A f103744d;

    /* renamed from: wc.A$a */
    static final class a<T> extends AtomicLong implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103745a;

        /* renamed from: b, reason: collision with root package name */
        final C10472A f103746b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f103747c;

        /* renamed from: d, reason: collision with root package name */
        boolean f103748d;

        a(io.reactivex.j jVar, C10472A c10472a) {
            this.f103745a = jVar;
            this.f103746b = c10472a;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103747c.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103747c, interfaceC6950c)) {
                this.f103747c = interfaceC6950c;
                this.f103745a.d(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this, j11);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103748d) {
                return;
            }
            this.f103748d = true;
            this.f103745a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103748d) {
                C3493a.f(th2);
            } else {
                this.f103748d = true;
                this.f103745a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103748d) {
                return;
            }
            if (get() != 0) {
                this.f103745a.onNext(t2);
                Gc.d.c(this, 1L);
                return;
            }
            try {
                this.f103746b.getClass();
            } catch (Throwable th2) {
                C2645f.c(th2);
                cancel();
                onError(th2);
            }
        }
    }

    public C10472A(C10499u c10499u) {
        super(c10499u);
        this.f103744d = this;
    }

    @Override // qc.g
    public final void accept(T t2) {
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f103744d));
    }
}
