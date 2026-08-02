package wc;

import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wc.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10474C<T> extends AbstractC10480a<T, T> {

    /* renamed from: wc.C$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103752a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6950c f103753b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f103754c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f103755d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f103756e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f103757f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f103758g = new AtomicReference<>();

        a(io.reactivex.j jVar) {
            this.f103752a = jVar;
        }

        final boolean a(boolean z11, boolean z12, io.reactivex.j jVar, AtomicReference atomicReference) {
            if (this.f103756e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f103755d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                jVar.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            jVar.onComplete();
            return true;
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.j jVar = this.f103752a;
            AtomicLong atomicLong = this.f103757f;
            AtomicReference<T> atomicReference = this.f103758g;
            int i11 = 1;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == atomicLong.get()) {
                        break;
                    }
                    boolean z11 = this.f103754c;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z12 = andSet == null;
                    if (a(z11, z12, jVar, atomicReference)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    jVar.onNext(andSet);
                    j11++;
                }
                if (j11 == atomicLong.get()) {
                    if (a(this.f103754c, atomicReference.get() == null, jVar, atomicReference)) {
                        return;
                    }
                }
                if (j11 != 0) {
                    Gc.d.c(atomicLong, j11);
                }
                i11 = addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f103756e) {
                return;
            }
            this.f103756e = true;
            this.f103753b.cancel();
            if (getAndIncrement() == 0) {
                this.f103758g.lazySet(null);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103753b, interfaceC6950c)) {
                this.f103753b = interfaceC6950c;
                this.f103752a.d(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f103757f, j11);
                b();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103754c = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103755d = th2;
            this.f103754c = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103758g.lazySet(t2);
            b();
        }
    }

    public C10474C(io.reactivex.h<T> hVar) {
        super(hVar);
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar));
    }
}
