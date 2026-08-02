package wc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wc.B, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10473B<T> extends AbstractC10480a<T, T> {

    /* renamed from: wc.B$a */
    static final class a<T> extends AtomicLong implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103749a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6950c f103750b;

        /* renamed from: c, reason: collision with root package name */
        boolean f103751c;

        a(io.reactivex.j jVar) {
            this.f103749a = jVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103750b.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103750b, interfaceC6950c)) {
                this.f103750b = interfaceC6950c;
                this.f103749a.d(this);
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
            if (this.f103751c) {
                return;
            }
            this.f103751c = true;
            this.f103749a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103751c) {
                C3493a.f(th2);
            } else {
                this.f103751c = true;
                this.f103749a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103751c) {
                return;
            }
            if (get() == 0) {
                onError(new oc.b("could not emit value due to lack of requests"));
            } else {
                this.f103749a.onNext(t2);
                Gc.d.c(this, 1L);
            }
        }
    }

    public C10473B(C10499u c10499u) {
        super(c10499u);
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar));
    }
}
