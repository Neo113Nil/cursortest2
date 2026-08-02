package zc;

import Cc.C2738a;
import io.reactivex.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class K1<T> extends AbstractC11019a<T, io.reactivex.p<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f107784b;

    /* renamed from: c, reason: collision with root package name */
    final long f107785c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f107786d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.x f107787e;

    /* renamed from: f, reason: collision with root package name */
    final long f107788f;

    /* renamed from: g, reason: collision with root package name */
    final int f107789g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f107790h;

    static final class a<T> extends uc.s<T, Object, io.reactivex.p<T>> implements InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final long f107791g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f107792h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.x f107793i;

        /* renamed from: j, reason: collision with root package name */
        final int f107794j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f107795k;

        /* renamed from: l, reason: collision with root package name */
        final long f107796l;

        /* renamed from: m, reason: collision with root package name */
        final x.c f107797m;

        /* renamed from: n, reason: collision with root package name */
        long f107798n;

        /* renamed from: o, reason: collision with root package name */
        long f107799o;

        /* renamed from: p, reason: collision with root package name */
        InterfaceC8487b f107800p;

        /* renamed from: q, reason: collision with root package name */
        Nc.f<T> f107801q;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f107802r;

        /* renamed from: s, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107803s;

        /* renamed from: zc.K1$a$a, reason: collision with other inner class name */
        static final class RunnableC2333a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final long f107804a;

            /* renamed from: b, reason: collision with root package name */
            final a<?> f107805b;

            RunnableC2333a(long j11, a<?> aVar) {
                this.f107804a = j11;
                this.f107805b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a<?> aVar = this.f107805b;
                if (((uc.s) aVar).f100598d) {
                    aVar.f107802r = true;
                    aVar.l();
                } else {
                    ((C2738a) ((uc.s) aVar).f100597c).offer(this);
                }
                if (aVar.d()) {
                    aVar.m();
                }
            }
        }

        a(Ic.e eVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, int i11, long j12, boolean z11) {
            super(eVar, new C2738a());
            this.f107803s = new AtomicReference<>();
            this.f107791g = j11;
            this.f107792h = timeUnit;
            this.f107793i = xVar;
            this.f107794j = i11;
            this.f107796l = j12;
            this.f107795k = z11;
            if (z11) {
                this.f107797m = xVar.b();
            } else {
                this.f107797m = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f100598d = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        final void l() {
            rc.d.a(this.f107803s);
            x.c cVar = this.f107797m;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [Nc.f<T>] */
        final void m() {
            C2738a c2738a = this.f100597c;
            Ic.e eVar = this.f100596b;
            Nc.f<T> fVar = this.f107801q;
            int i11 = 1;
            while (!this.f107802r) {
                boolean z11 = this.f100599e;
                Object poll = c2738a.poll();
                boolean z12 = poll == null;
                boolean z13 = poll instanceof RunnableC2333a;
                if (z11 && (z12 || z13)) {
                    this.f107801q = null;
                    c2738a.clear();
                    l();
                    Throwable th2 = this.f100600f;
                    if (th2 != null) {
                        fVar.onError(th2);
                        return;
                    } else {
                        fVar.onComplete();
                        return;
                    }
                }
                if (z12) {
                    i11 = i(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else if (z13) {
                    RunnableC2333a runnableC2333a = (RunnableC2333a) poll;
                    if (this.f107795k || this.f107799o == runnableC2333a.f107804a) {
                        fVar.onComplete();
                        this.f107798n = 0L;
                        fVar = (Nc.f<T>) Nc.f.e(this.f107794j);
                        this.f107801q = fVar;
                        eVar.onNext(fVar);
                    }
                } else {
                    fVar.onNext(poll);
                    long j11 = this.f107798n + 1;
                    if (j11 >= this.f107796l) {
                        this.f107799o++;
                        this.f107798n = 0L;
                        fVar.onComplete();
                        fVar = (Nc.f<T>) Nc.f.e(this.f107794j);
                        this.f107801q = fVar;
                        this.f100596b.onNext(fVar);
                        if (this.f107795k) {
                            InterfaceC8487b interfaceC8487b = this.f107803s.get();
                            interfaceC8487b.dispose();
                            x.c cVar = this.f107797m;
                            RunnableC2333a runnableC2333a2 = new RunnableC2333a(this.f107799o, this);
                            long j12 = this.f107791g;
                            InterfaceC8487b c11 = cVar.c(runnableC2333a2, j12, j12, this.f107792h);
                            AtomicReference<InterfaceC8487b> atomicReference = this.f107803s;
                            while (true) {
                                if (!atomicReference.compareAndSet(interfaceC8487b, c11)) {
                                    if (atomicReference.get() != interfaceC8487b) {
                                        c11.dispose();
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        this.f107798n = j11;
                    }
                }
            }
            this.f107800p.dispose();
            c2738a.clear();
            l();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f100599e = true;
            if (d()) {
                m();
            }
            this.f100596b.onComplete();
            l();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f100600f = th2;
            this.f100599e = true;
            if (d()) {
                m();
            }
            this.f100596b.onError(th2);
            l();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107802r) {
                return;
            }
            if (f()) {
                Nc.f<T> fVar = this.f107801q;
                fVar.onNext(t2);
                long j11 = this.f107798n + 1;
                if (j11 >= this.f107796l) {
                    this.f107799o++;
                    this.f107798n = 0L;
                    fVar.onComplete();
                    Nc.f<T> e11 = Nc.f.e(this.f107794j);
                    this.f107801q = e11;
                    this.f100596b.onNext(e11);
                    if (this.f107795k) {
                        this.f107803s.get().dispose();
                        x.c cVar = this.f107797m;
                        RunnableC2333a runnableC2333a = new RunnableC2333a(this.f107799o, this);
                        long j12 = this.f107791g;
                        rc.d.d(this.f107803s, cVar.c(runnableC2333a, j12, j12, this.f107792h));
                    }
                } else {
                    this.f107798n = j11;
                }
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f100597c.offer(t2);
                if (!d()) {
                    return;
                }
            }
            m();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            InterfaceC8487b f7;
            if (rc.d.g(this.f107800p, interfaceC8487b)) {
                this.f107800p = interfaceC8487b;
                Ic.e eVar = this.f100596b;
                eVar.onSubscribe(this);
                if (this.f100598d) {
                    return;
                }
                Nc.f<T> e11 = Nc.f.e(this.f107794j);
                this.f107801q = e11;
                eVar.onNext(e11);
                RunnableC2333a runnableC2333a = new RunnableC2333a(this.f107799o, this);
                if (this.f107795k) {
                    x.c cVar = this.f107797m;
                    long j11 = this.f107791g;
                    f7 = cVar.c(runnableC2333a, j11, j11, this.f107792h);
                } else {
                    io.reactivex.x xVar = this.f107793i;
                    long j12 = this.f107791g;
                    f7 = xVar.f(runnableC2333a, j12, j12, this.f107792h);
                }
                rc.d.d(this.f107803s, f7);
            }
        }
    }

    static final class b<T> extends uc.s<T, Object, io.reactivex.p<T>> implements InterfaceC8487b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        static final Object f107806o = new Object();

        /* renamed from: g, reason: collision with root package name */
        final long f107807g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f107808h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.x f107809i;

        /* renamed from: j, reason: collision with root package name */
        final int f107810j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC8487b f107811k;

        /* renamed from: l, reason: collision with root package name */
        Nc.f<T> f107812l;

        /* renamed from: m, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107813m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f107814n;

        b(Ic.e eVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, int i11) {
            super(eVar, new C2738a());
            this.f107813m = new AtomicReference<>();
            this.f107807g = j11;
            this.f107808h = timeUnit;
            this.f107809i = xVar;
            this.f107810j = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f100598d = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            r8.f107812l = null;
            r0.clear();
            rc.d.a(r8.f107813m);
            r0 = r8.f100600f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [Nc.f<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void j() {
            C2738a c2738a = this.f100597c;
            Ic.e eVar = this.f100596b;
            Nc.f<T> fVar = this.f107812l;
            int i11 = 1;
            while (true) {
                boolean z11 = this.f107814n;
                boolean z12 = this.f100599e;
                Object poll = c2738a.poll();
                Object obj = f107806o;
                if (!z12 || (poll != null && poll != obj)) {
                    if (poll == null) {
                        i11 = i(-i11);
                        if (i11 == 0) {
                            return;
                        }
                    } else if (poll == obj) {
                        fVar.onComplete();
                        if (z11) {
                            this.f107811k.dispose();
                        } else {
                            fVar = (Nc.f<T>) Nc.f.e(this.f107810j);
                            this.f107812l = fVar;
                            eVar.onNext(fVar);
                        }
                    } else {
                        fVar.onNext(poll);
                    }
                }
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f100599e = true;
            if (d()) {
                j();
            }
            rc.d.a(this.f107813m);
            this.f100596b.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f100600f = th2;
            this.f100599e = true;
            if (d()) {
                j();
            }
            rc.d.a(this.f107813m);
            this.f100596b.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107814n) {
                return;
            }
            if (f()) {
                this.f107812l.onNext(t2);
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f100597c.offer(t2);
                if (!d()) {
                    return;
                }
            }
            j();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107811k, interfaceC8487b)) {
                this.f107811k = interfaceC8487b;
                this.f107812l = Nc.f.e(this.f107810j);
                Ic.e eVar = this.f100596b;
                eVar.onSubscribe(this);
                eVar.onNext(this.f107812l);
                if (!this.f100598d) {
                    io.reactivex.x xVar = this.f107809i;
                    long j11 = this.f107807g;
                    rc.d.d(this.f107813m, xVar.f(this, j11, j11, this.f107808h));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.f100598d) {
                this.f107814n = true;
                rc.d.a(this.f107813m);
            }
            this.f100597c.offer(f107806o);
            if (d()) {
                j();
            }
        }
    }

    static final class c<T> extends uc.s<T, Object, io.reactivex.p<T>> implements InterfaceC8487b, Runnable {

        /* renamed from: g, reason: collision with root package name */
        final long f107815g;

        /* renamed from: h, reason: collision with root package name */
        final long f107816h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f107817i;

        /* renamed from: j, reason: collision with root package name */
        final x.c f107818j;

        /* renamed from: k, reason: collision with root package name */
        final int f107819k;

        /* renamed from: l, reason: collision with root package name */
        final LinkedList f107820l;

        /* renamed from: m, reason: collision with root package name */
        InterfaceC8487b f107821m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f107822n;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Nc.f<T> f107823a;

            a(Nc.f<T> fVar) {
                this.f107823a = fVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.j(this.f107823a);
            }
        }

        static final class b<T> {

            /* renamed from: a, reason: collision with root package name */
            final Nc.f<T> f107825a;

            /* renamed from: b, reason: collision with root package name */
            final boolean f107826b;

            b(Nc.f<T> fVar, boolean z11) {
                this.f107825a = fVar;
                this.f107826b = z11;
            }
        }

        c(Ic.e eVar, long j11, long j12, TimeUnit timeUnit, x.c cVar, int i11) {
            super(eVar, new C2738a());
            this.f107815g = j11;
            this.f107816h = j12;
            this.f107817i = timeUnit;
            this.f107818j = cVar;
            this.f107819k = i11;
            this.f107820l = new LinkedList();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f100598d = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        final void j(Nc.f<T> fVar) {
            this.f100597c.offer(new b(fVar, false));
            if (d()) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void k() {
            C2738a c2738a = this.f100597c;
            Ic.e eVar = this.f100596b;
            LinkedList linkedList = this.f107820l;
            int i11 = 1;
            while (!this.f107822n) {
                boolean z11 = this.f100599e;
                Object poll = c2738a.poll();
                boolean z12 = poll == null;
                boolean z13 = poll instanceof b;
                if (z11 && (z12 || z13)) {
                    c2738a.clear();
                    Throwable th2 = this.f100600f;
                    if (th2 != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ((Nc.f) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            ((Nc.f) it2.next()).onComplete();
                        }
                    }
                    this.f107818j.dispose();
                    linkedList.clear();
                    return;
                }
                if (z12) {
                    i11 = i(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else if (z13) {
                    b bVar = (b) poll;
                    if (!bVar.f107826b) {
                        linkedList.remove(bVar.f107825a);
                        bVar.f107825a.onComplete();
                        if (linkedList.isEmpty() && this.f100598d) {
                            this.f107822n = true;
                        }
                    } else if (!this.f100598d) {
                        Nc.f e11 = Nc.f.e(this.f107819k);
                        linkedList.add(e11);
                        eVar.onNext(e11);
                        this.f107818j.b(new a(e11), this.f107815g, this.f107817i);
                    }
                } else {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        ((Nc.f) it3.next()).onNext(poll);
                    }
                }
            }
            this.f107821m.dispose();
            this.f107818j.dispose();
            c2738a.clear();
            linkedList.clear();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f100599e = true;
            if (d()) {
                k();
            }
            this.f100596b.onComplete();
            this.f107818j.dispose();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f100600f = th2;
            this.f100599e = true;
            if (d()) {
                k();
            }
            this.f100596b.onError(th2);
            this.f107818j.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (f()) {
                Iterator it = this.f107820l.iterator();
                while (it.hasNext()) {
                    ((Nc.f) it.next()).onNext(t2);
                }
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f100597c.offer(t2);
                if (!d()) {
                    return;
                }
            }
            k();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107821m, interfaceC8487b)) {
                this.f107821m = interfaceC8487b;
                this.f100596b.onSubscribe(this);
                if (this.f100598d) {
                    return;
                }
                Nc.f e11 = Nc.f.e(this.f107819k);
                this.f107820l.add(e11);
                this.f100596b.onNext(e11);
                this.f107818j.b(new a(e11), this.f107815g, this.f107817i);
                x.c cVar = this.f107818j;
                long j11 = this.f107816h;
                cVar.c(this, j11, j11, this.f107817i);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = new b(Nc.f.e(this.f107819k), true);
            if (!this.f100598d) {
                this.f100597c.offer(bVar);
            }
            if (d()) {
                k();
            }
        }
    }

    public K1(io.reactivex.p pVar, long j11, long j12, TimeUnit timeUnit, io.reactivex.x xVar, long j13, int i11, boolean z11) {
        super(pVar);
        this.f107784b = j11;
        this.f107785c = j12;
        this.f107786d = timeUnit;
        this.f107787e = xVar;
        this.f107788f = j13;
        this.f107789g = i11;
        this.f107790h = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.p<T>> wVar) {
        Ic.e eVar = new Ic.e(wVar);
        long j11 = this.f107784b;
        long j12 = this.f107785c;
        io.reactivex.u<T> uVar = this.f108122a;
        if (j11 != j12) {
            uVar.subscribe(new c(eVar, j11, j12, this.f107786d, this.f107787e.b(), this.f107789g));
        } else {
            long j13 = this.f107788f;
            if (j13 != Long.MAX_VALUE) {
                uVar.subscribe(new a(eVar, j11, this.f107786d, this.f107787e, this.f107789g, j13, this.f107790h));
            } else {
                uVar.subscribe(new b(eVar, j11, this.f107786d, this.f107787e, this.f107789g));
            }
        }
    }
}
