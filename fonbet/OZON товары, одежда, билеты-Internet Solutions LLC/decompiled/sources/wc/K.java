package wc;

import Bl0.C2645f;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import oc.C8691a;

/* loaded from: classes.dex */
public final class K<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final qc.q<? super Throwable> f103839d;

    /* renamed from: e, reason: collision with root package name */
    final long f103840e;

    static final class a<T> extends AtomicInteger implements io.reactivex.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103841a;

        /* renamed from: b, reason: collision with root package name */
        final Fc.f f103842b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC6948a<? extends T> f103843c;

        /* renamed from: d, reason: collision with root package name */
        final qc.q<? super Throwable> f103844d;

        /* renamed from: e, reason: collision with root package name */
        long f103845e;

        /* renamed from: f, reason: collision with root package name */
        long f103846f;

        a(io.reactivex.j jVar, long j11, qc.q qVar, Fc.f fVar, InterfaceC6948a interfaceC6948a) {
            this.f103841a = jVar;
            this.f103842b = fVar;
            this.f103843c = interfaceC6948a;
            this.f103844d = qVar;
            this.f103845e = j11;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                int i11 = 1;
                do {
                    Fc.f fVar = this.f103842b;
                    if (fVar.b()) {
                        return;
                    }
                    long j11 = this.f103846f;
                    if (j11 != 0) {
                        this.f103846f = 0L;
                        fVar.f(j11);
                    }
                    this.f103843c.a(this);
                    i11 = addAndGet(-i11);
                } while (i11 != 0);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            this.f103842b.h(interfaceC6950c);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103841a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            long j11 = this.f103845e;
            if (j11 != Long.MAX_VALUE) {
                this.f103845e = j11 - 1;
            }
            io.reactivex.j jVar = this.f103841a;
            if (j11 == 0) {
                jVar.onError(th2);
                return;
            }
            try {
                this.f103844d.test(th2);
                a();
            } catch (Throwable th3) {
                C2645f.c(th3);
                jVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103846f++;
            this.f103841a.onNext(t2);
        }
    }

    public K(io.reactivex.h hVar, qc.q qVar) {
        super(hVar);
        this.f103839d = qVar;
        this.f103840e = 3L;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        Fc.f fVar = new Fc.f(false);
        jVar.d(fVar);
        new a(jVar, this.f103840e, this.f103839d, fVar, this.f103914c).a();
    }
}
