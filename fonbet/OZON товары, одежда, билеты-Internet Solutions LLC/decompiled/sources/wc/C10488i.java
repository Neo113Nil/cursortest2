package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import tc.InterfaceC9808j;

/* renamed from: wc.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10488i<T, R> extends AbstractC10480a<T, R> {

    /* renamed from: d, reason: collision with root package name */
    final xc.q f103937d;

    /* renamed from: e, reason: collision with root package name */
    final int f103938e;

    /* renamed from: f, reason: collision with root package name */
    final int f103939f;

    /* renamed from: g, reason: collision with root package name */
    final Gc.h f103940g;

    /* renamed from: wc.i$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC6950c, Ec.d<R> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103941a;

        /* renamed from: b, reason: collision with root package name */
        final xc.q f103942b;

        /* renamed from: c, reason: collision with root package name */
        final int f103943c;

        /* renamed from: d, reason: collision with root package name */
        final int f103944d;

        /* renamed from: e, reason: collision with root package name */
        final Gc.h f103945e;

        /* renamed from: f, reason: collision with root package name */
        final Gc.c f103946f = new Gc.c();

        /* renamed from: g, reason: collision with root package name */
        final AtomicLong f103947g = new AtomicLong();

        /* renamed from: h, reason: collision with root package name */
        final Cc.c<Ec.c<R>> f103948h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC6950c f103949i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f103950j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f103951k;

        /* renamed from: l, reason: collision with root package name */
        volatile Ec.c<R> f103952l;

        a(io.reactivex.j jVar, xc.q qVar, int i11, int i12, Gc.h hVar) {
            this.f103941a = jVar;
            this.f103942b = qVar;
            this.f103943c = i11;
            this.f103944d = i12;
            this.f103945e = hVar;
            this.f103948h = new Cc.c<>(Math.min(i12, i11));
        }

        @Override // Ec.d
        public final void a() {
            Ec.c<R> cVar;
            long j11;
            long j12;
            boolean z11;
            InterfaceC9808j<R> b11;
            if (getAndIncrement() != 0) {
                return;
            }
            Ec.c<R> cVar2 = this.f103952l;
            io.reactivex.j jVar = this.f103941a;
            Gc.h hVar = this.f103945e;
            int i11 = 1;
            while (true) {
                long j13 = this.f103947g.get();
                if (cVar2 != null) {
                    cVar = cVar2;
                } else {
                    if (hVar != Gc.h.END && this.f103946f.get() != null) {
                        h();
                        Gc.c cVar3 = this.f103946f;
                        cVar3.getClass();
                        jVar.onError(Gc.i.b(cVar3));
                        return;
                    }
                    boolean z12 = this.f103951k;
                    cVar = this.f103948h.poll();
                    if (z12 && cVar == null) {
                        Gc.c cVar4 = this.f103946f;
                        cVar4.getClass();
                        Throwable b12 = Gc.i.b(cVar4);
                        if (b12 != null) {
                            jVar.onError(b12);
                            return;
                        } else {
                            jVar.onComplete();
                            return;
                        }
                    }
                    if (cVar != null) {
                        this.f103952l = cVar;
                    }
                }
                if (cVar == null || (b11 = cVar.b()) == null) {
                    j11 = 0;
                    j12 = 0;
                    z11 = false;
                } else {
                    j12 = 0;
                    while (true) {
                        if (j12 == j13) {
                            j11 = 0;
                            break;
                        }
                        if (this.f103950j) {
                            h();
                            return;
                        }
                        if (hVar == Gc.h.IMMEDIATE && this.f103946f.get() != null) {
                            this.f103952l = null;
                            Fc.g.a(cVar);
                            h();
                            Gc.c cVar5 = this.f103946f;
                            cVar5.getClass();
                            jVar.onError(Gc.i.b(cVar5));
                            return;
                        }
                        boolean a11 = cVar.a();
                        j11 = 0;
                        try {
                            R poll = b11.poll();
                            boolean z13 = poll == null;
                            if (a11 && z13) {
                                this.f103952l = null;
                                this.f103949i.n(1L);
                                cVar = null;
                                z11 = true;
                                break;
                            }
                            if (z13) {
                                break;
                            }
                            jVar.onNext(poll);
                            j12++;
                            cVar.e();
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            this.f103952l = null;
                            Fc.g.a(cVar);
                            h();
                            jVar.onError(th2);
                            return;
                        }
                    }
                    z11 = false;
                    if (j12 == j13) {
                        if (this.f103950j) {
                            h();
                            return;
                        }
                        if (hVar == Gc.h.IMMEDIATE && this.f103946f.get() != null) {
                            this.f103952l = null;
                            cVar.getClass();
                            Fc.g.a(cVar);
                            h();
                            Gc.c cVar6 = this.f103946f;
                            cVar6.getClass();
                            jVar.onError(Gc.i.b(cVar6));
                            return;
                        }
                        boolean a12 = cVar.a();
                        boolean isEmpty = b11.isEmpty();
                        if (a12 && isEmpty) {
                            this.f103952l = null;
                            this.f103949i.n(1L);
                            cVar = null;
                            z11 = true;
                        }
                    }
                }
                if (j12 != j11 && j13 != Long.MAX_VALUE) {
                    this.f103947g.addAndGet(-j12);
                }
                if (!z11 && (i11 = addAndGet(-i11)) == 0) {
                    return;
                } else {
                    cVar2 = cVar;
                }
            }
        }

        @Override // Ec.d
        public final void b(Ec.c<R> cVar) {
            cVar.f();
            a();
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f103950j) {
                return;
            }
            this.f103950j = true;
            this.f103949i.cancel();
            if (getAndIncrement() == 0) {
                do {
                    h();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103949i, interfaceC6950c)) {
                this.f103949i = interfaceC6950c;
                this.f103941a.d(this);
                int i11 = this.f103943c;
                interfaceC6950c.n(i11 == Integer.MAX_VALUE ? Long.MAX_VALUE : i11);
            }
        }

        @Override // Ec.d
        public final void e(Ec.c<R> cVar, Throwable th2) {
            Gc.c cVar2 = this.f103946f;
            cVar2.getClass();
            if (!Gc.i.a(cVar2, th2)) {
                C3493a.f(th2);
                return;
            }
            cVar.f();
            if (this.f103945e != Gc.h.END) {
                this.f103949i.cancel();
            }
            a();
        }

        @Override // Ec.d
        public final void f(Ec.c<R> cVar, R r11) {
            if (cVar.b().offer(r11)) {
                a();
            } else {
                Fc.g.a(cVar);
                e(cVar, new oc.b());
            }
        }

        final void h() {
            Ec.c<R> cVar = this.f103952l;
            this.f103952l = null;
            if (cVar != null) {
                Fc.g.a(cVar);
            }
            while (true) {
                Ec.c<R> poll = this.f103948h.poll();
                if (poll == null) {
                    return;
                } else {
                    Fc.g.a(poll);
                }
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f103947g, j11);
                a();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103951k = true;
            a();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f103946f;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f103951k = true;
                a();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            try {
                InterfaceC6948a<Object> apply = this.f103942b.apply(t2);
                Ec.c<R> cVar = new Ec.c<>(this, this.f103944d);
                if (this.f103950j) {
                    return;
                }
                this.f103948h.offer(cVar);
                apply.a(cVar);
                if (this.f103950j) {
                    Fc.g.a(cVar);
                    if (getAndIncrement() == 0) {
                        do {
                            h();
                        } while (decrementAndGet() != 0);
                    }
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f103949i.cancel();
                onError(th2);
            }
        }
    }

    public C10488i(io.reactivex.h hVar, xc.q qVar, int i11, int i12, Gc.h hVar2) {
        super(hVar);
        this.f103937d = qVar;
        this.f103938e = i11;
        this.f103939f = i12;
        this.f103940g = hVar2;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(jVar, this.f103937d, this.f103938e, this.f103939f, this.f103940g));
    }
}
