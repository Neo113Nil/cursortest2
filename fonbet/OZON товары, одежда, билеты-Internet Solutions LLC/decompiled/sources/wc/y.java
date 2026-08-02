package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicLong;
import tc.InterfaceC9799a;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;

/* loaded from: classes.dex */
public final class y<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f104073d;

    /* renamed from: e, reason: collision with root package name */
    final int f104074e;

    static abstract class a<T> extends Fc.a<T> implements io.reactivex.j<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final x.c f104075a;

        /* renamed from: b, reason: collision with root package name */
        final int f104076b;

        /* renamed from: c, reason: collision with root package name */
        final int f104077c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f104078d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        InterfaceC6950c f104079e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC9808j<T> f104080f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f104081g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f104082h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f104083i;

        /* renamed from: j, reason: collision with root package name */
        int f104084j;

        /* renamed from: k, reason: collision with root package name */
        long f104085k;

        /* renamed from: l, reason: collision with root package name */
        boolean f104086l;

        a(int i11, x.c cVar) {
            this.f104075a = cVar;
            this.f104076b = i11;
            this.f104077c = i11 - (i11 >> 2);
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f104086l = true;
            return 2;
        }

        final boolean b(boolean z11, boolean z12, InterfaceC6949b<?> interfaceC6949b) {
            if (this.f104081g) {
                clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f104083i;
            if (th2 != null) {
                this.f104081g = true;
                clear();
                interfaceC6949b.onError(th2);
                this.f104075a.dispose();
                return true;
            }
            if (!z12) {
                return false;
            }
            this.f104081g = true;
            interfaceC6949b.onComplete();
            this.f104075a.dispose();
            return true;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f104081g) {
                return;
            }
            this.f104081g = true;
            this.f104079e.cancel();
            this.f104075a.dispose();
            if (getAndIncrement() == 0) {
                this.f104080f.clear();
            }
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f104080f.clear();
        }

        abstract void e();

        abstract void f();

        abstract void h();

        final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f104075a.a(this);
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f104080f.isEmpty();
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f104078d, j11);
                i();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f104082h) {
                return;
            }
            this.f104082h = true;
            i();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f104082h) {
                C3493a.f(th2);
                return;
            }
            this.f104083i = th2;
            this.f104082h = true;
            i();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f104082h) {
                return;
            }
            if (this.f104084j == 2) {
                i();
                return;
            }
            if (!this.f104080f.offer(t2)) {
                this.f104079e.cancel();
                this.f104083i = new oc.b("Queue is full?!");
                this.f104082h = true;
            }
            i();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f104086l) {
                f();
            } else if (this.f104084j == 1) {
                h();
            } else {
                e();
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T> extends a<T> {

        /* renamed from: m, reason: collision with root package name */
        final InterfaceC9799a<? super T> f104087m;

        /* renamed from: n, reason: collision with root package name */
        long f104088n;

        b(InterfaceC9799a interfaceC9799a, x.c cVar, int i11) {
            super(i11, cVar);
            this.f104087m = interfaceC9799a;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f104079e, interfaceC6950c)) {
                this.f104079e = interfaceC6950c;
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f104084j = 1;
                        this.f104080f = interfaceC9805g;
                        this.f104082h = true;
                        this.f104087m.d(this);
                        return;
                    }
                    if (a11 == 2) {
                        this.f104084j = 2;
                        this.f104080f = interfaceC9805g;
                        this.f104087m.d(this);
                        interfaceC6950c.n(this.f104076b);
                        return;
                    }
                }
                this.f104080f = new Cc.b(this.f104076b);
                this.f104087m.d(this);
                interfaceC6950c.n(this.f104076b);
            }
        }

        @Override // wc.y.a
        final void e() {
            InterfaceC9799a<? super T> interfaceC9799a = this.f104087m;
            InterfaceC9808j<T> interfaceC9808j = this.f104080f;
            long j11 = this.f104085k;
            long j12 = this.f104088n;
            int i11 = 1;
            while (true) {
                long j13 = this.f104078d.get();
                while (j11 != j13) {
                    boolean z11 = this.f104082h;
                    try {
                        T poll = interfaceC9808j.poll();
                        boolean z12 = poll == null;
                        if (b(z11, z12, interfaceC9799a)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        if (interfaceC9799a.g(poll)) {
                            j11++;
                        }
                        j12++;
                        if (j12 == this.f104077c) {
                            this.f104079e.n(j12);
                            j12 = 0;
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f104081g = true;
                        this.f104079e.cancel();
                        interfaceC9808j.clear();
                        interfaceC9799a.onError(th2);
                        this.f104075a.dispose();
                        return;
                    }
                }
                if (j11 == j13 && b(this.f104082h, interfaceC9808j.isEmpty(), interfaceC9799a)) {
                    return;
                }
                int i12 = get();
                if (i11 == i12) {
                    this.f104085k = j11;
                    this.f104088n = j12;
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    i11 = i12;
                }
            }
        }

        @Override // wc.y.a
        final void f() {
            int i11 = 1;
            while (!this.f104081g) {
                boolean z11 = this.f104082h;
                this.f104087m.onNext(null);
                if (z11) {
                    this.f104081g = true;
                    Throwable th2 = this.f104083i;
                    if (th2 != null) {
                        this.f104087m.onError(th2);
                    } else {
                        this.f104087m.onComplete();
                    }
                    this.f104075a.dispose();
                    return;
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // wc.y.a
        final void h() {
            InterfaceC9799a<? super T> interfaceC9799a = this.f104087m;
            InterfaceC9808j<T> interfaceC9808j = this.f104080f;
            long j11 = this.f104085k;
            int i11 = 1;
            while (true) {
                long j12 = this.f104078d.get();
                while (j11 != j12) {
                    try {
                        T poll = interfaceC9808j.poll();
                        if (this.f104081g) {
                            return;
                        }
                        if (poll == null) {
                            this.f104081g = true;
                            interfaceC9799a.onComplete();
                            this.f104075a.dispose();
                            return;
                        } else if (interfaceC9799a.g(poll)) {
                            j11++;
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f104081g = true;
                        this.f104079e.cancel();
                        interfaceC9799a.onError(th2);
                        this.f104075a.dispose();
                        return;
                    }
                }
                if (this.f104081g) {
                    return;
                }
                if (interfaceC9808j.isEmpty()) {
                    this.f104081g = true;
                    interfaceC9799a.onComplete();
                    this.f104075a.dispose();
                    return;
                } else {
                    int i12 = get();
                    if (i11 == i12) {
                        this.f104085k = j11;
                        i11 = addAndGet(-i11);
                        if (i11 == 0) {
                            return;
                        }
                    } else {
                        i11 = i12;
                    }
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f104080f.poll();
            if (poll != null && this.f104084j != 1) {
                long j11 = this.f104088n + 1;
                if (j11 == this.f104077c) {
                    this.f104088n = 0L;
                    this.f104079e.n(j11);
                    return poll;
                }
                this.f104088n = j11;
            }
            return poll;
        }
    }

    static final class c<T> extends a<T> {

        /* renamed from: m, reason: collision with root package name */
        final io.reactivex.j f104089m;

        c(io.reactivex.j jVar, x.c cVar, int i11) {
            super(i11, cVar);
            this.f104089m = jVar;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f104079e, interfaceC6950c)) {
                this.f104079e = interfaceC6950c;
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f104084j = 1;
                        this.f104080f = interfaceC9805g;
                        this.f104082h = true;
                        this.f104089m.d(this);
                        return;
                    }
                    if (a11 == 2) {
                        this.f104084j = 2;
                        this.f104080f = interfaceC9805g;
                        this.f104089m.d(this);
                        interfaceC6950c.n(this.f104076b);
                        return;
                    }
                }
                this.f104080f = new Cc.b(this.f104076b);
                this.f104089m.d(this);
                interfaceC6950c.n(this.f104076b);
            }
        }

        @Override // wc.y.a
        final void e() {
            io.reactivex.j jVar = this.f104089m;
            InterfaceC9808j<T> interfaceC9808j = this.f104080f;
            long j11 = this.f104085k;
            int i11 = 1;
            while (true) {
                long j12 = this.f104078d.get();
                while (j11 != j12) {
                    boolean z11 = this.f104082h;
                    try {
                        T poll = interfaceC9808j.poll();
                        boolean z12 = poll == null;
                        if (b(z11, z12, jVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        jVar.onNext(poll);
                        j11++;
                        if (j11 == this.f104077c) {
                            if (j12 != Long.MAX_VALUE) {
                                j12 = this.f104078d.addAndGet(-j11);
                            }
                            this.f104079e.n(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f104081g = true;
                        this.f104079e.cancel();
                        interfaceC9808j.clear();
                        jVar.onError(th2);
                        this.f104075a.dispose();
                        return;
                    }
                }
                if (j11 == j12 && b(this.f104082h, interfaceC9808j.isEmpty(), jVar)) {
                    return;
                }
                int i12 = get();
                if (i11 == i12) {
                    this.f104085k = j11;
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    i11 = i12;
                }
            }
        }

        @Override // wc.y.a
        final void f() {
            int i11 = 1;
            while (!this.f104081g) {
                boolean z11 = this.f104082h;
                this.f104089m.onNext(null);
                if (z11) {
                    this.f104081g = true;
                    Throwable th2 = this.f104083i;
                    if (th2 != null) {
                        this.f104089m.onError(th2);
                    } else {
                        this.f104089m.onComplete();
                    }
                    this.f104075a.dispose();
                    return;
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // wc.y.a
        final void h() {
            io.reactivex.j jVar = this.f104089m;
            InterfaceC9808j<T> interfaceC9808j = this.f104080f;
            long j11 = this.f104085k;
            int i11 = 1;
            while (true) {
                long j12 = this.f104078d.get();
                while (j11 != j12) {
                    try {
                        T poll = interfaceC9808j.poll();
                        if (this.f104081g) {
                            return;
                        }
                        if (poll == null) {
                            this.f104081g = true;
                            jVar.onComplete();
                            this.f104075a.dispose();
                            return;
                        }
                        jVar.onNext(poll);
                        j11++;
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f104081g = true;
                        this.f104079e.cancel();
                        jVar.onError(th2);
                        this.f104075a.dispose();
                        return;
                    }
                }
                if (this.f104081g) {
                    return;
                }
                if (interfaceC9808j.isEmpty()) {
                    this.f104081g = true;
                    jVar.onComplete();
                    this.f104075a.dispose();
                    return;
                } else {
                    int i12 = get();
                    if (i11 == i12) {
                        this.f104085k = j11;
                        i11 = addAndGet(-i11);
                        if (i11 == 0) {
                            return;
                        }
                    } else {
                        i11 = i12;
                    }
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f104080f.poll();
            if (poll != null && this.f104084j != 1) {
                long j11 = this.f104085k + 1;
                if (j11 == this.f104077c) {
                    this.f104085k = 0L;
                    this.f104079e.n(j11);
                    return poll;
                }
                this.f104085k = j11;
            }
            return poll;
        }
    }

    public y(io.reactivex.h hVar, io.reactivex.x xVar, int i11) {
        super(hVar);
        this.f104073d = xVar;
        this.f104074e = i11;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        x.c b11 = this.f104073d.b();
        boolean z11 = jVar instanceof InterfaceC9799a;
        int i11 = this.f104074e;
        io.reactivex.h<T> hVar = this.f103914c;
        if (z11) {
            hVar.i(new b((InterfaceC9799a) jVar, b11, i11));
        } else {
            hVar.i(new c(jVar, b11, i11));
        }
    }
}
