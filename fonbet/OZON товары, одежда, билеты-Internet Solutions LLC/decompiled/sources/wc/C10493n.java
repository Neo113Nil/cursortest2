package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import tc.InterfaceC9799a;
import tc.InterfaceC9805g;

/* renamed from: wc.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10493n<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final DM.j f103993d;

    /* renamed from: wc.n$a */
    static final class a<T> extends Fc.a<T> implements InterfaceC9799a<T> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC9799a<? super T> f103994a;

        /* renamed from: b, reason: collision with root package name */
        final DM.j f103995b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f103996c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC9805g<T> f103997d;

        /* renamed from: e, reason: collision with root package name */
        boolean f103998e;

        a(InterfaceC9799a interfaceC9799a, DM.j jVar) {
            this.f103994a = interfaceC9799a;
            this.f103995b = jVar;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            InterfaceC9805g<T> interfaceC9805g = this.f103997d;
            if (interfaceC9805g == null || (i11 & 4) != 0) {
                return 0;
            }
            int a11 = interfaceC9805g.a(i11);
            if (a11 != 0) {
                this.f103998e = a11 == 1;
            }
            return a11;
        }

        final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f103995b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103996c.cancel();
            b();
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f103997d.clear();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103996c, interfaceC6950c)) {
                this.f103996c = interfaceC6950c;
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    this.f103997d = (InterfaceC9805g) interfaceC6950c;
                }
                this.f103994a.d(this);
            }
        }

        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            return this.f103994a.g(t2);
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f103997d.isEmpty();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f103996c.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103994a.onComplete();
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103994a.onError(th2);
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103994a.onNext(t2);
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f103997d.poll();
            if (poll == null && this.f103998e) {
                b();
            }
            return poll;
        }
    }

    /* renamed from: wc.n$b */
    static final class b<T> extends Fc.a<T> implements io.reactivex.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103999a;

        /* renamed from: b, reason: collision with root package name */
        final DM.j f104000b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6950c f104001c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC9805g<T> f104002d;

        /* renamed from: e, reason: collision with root package name */
        boolean f104003e;

        b(io.reactivex.j jVar, DM.j jVar2) {
            this.f103999a = jVar;
            this.f104000b = jVar2;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            InterfaceC9805g<T> interfaceC9805g = this.f104002d;
            if (interfaceC9805g == null || (i11 & 4) != 0) {
                return 0;
            }
            int a11 = interfaceC9805g.a(i11);
            if (a11 != 0) {
                this.f104003e = a11 == 1;
            }
            return a11;
        }

        final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f104000b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f104001c.cancel();
            b();
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f104002d.clear();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f104001c, interfaceC6950c)) {
                this.f104001c = interfaceC6950c;
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    this.f104002d = (InterfaceC9805g) interfaceC6950c;
                }
                this.f103999a.d(this);
            }
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f104002d.isEmpty();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f104001c.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103999a.onComplete();
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103999a.onError(th2);
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103999a.onNext(t2);
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f104002d.poll();
            if (poll == null && this.f104003e) {
                b();
            }
            return poll;
        }
    }

    public C10493n(C10495p c10495p, DM.j jVar) {
        super(c10495p);
        this.f103993d = jVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        boolean z11 = jVar instanceof InterfaceC9799a;
        DM.j jVar2 = this.f103993d;
        io.reactivex.h<T> hVar = this.f103914c;
        if (z11) {
            hVar.i(new a((InterfaceC9799a) jVar, jVar2));
        } else {
            hVar.i(new b(jVar, jVar2));
        }
    }
}
