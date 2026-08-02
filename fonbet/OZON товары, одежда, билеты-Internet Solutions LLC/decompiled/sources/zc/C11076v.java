package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;

/* renamed from: zc.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11076v<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108687b;

    /* renamed from: c, reason: collision with root package name */
    final Gc.h f108688c;

    /* renamed from: d, reason: collision with root package name */
    final int f108689d;

    /* renamed from: e, reason: collision with root package name */
    final int f108690e;

    /* renamed from: zc.v$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b, uc.q<R> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108691a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108692b;

        /* renamed from: c, reason: collision with root package name */
        final int f108693c;

        /* renamed from: d, reason: collision with root package name */
        final int f108694d;

        /* renamed from: e, reason: collision with root package name */
        final Gc.h f108695e;

        /* renamed from: f, reason: collision with root package name */
        final Gc.c f108696f = new Gc.c();

        /* renamed from: g, reason: collision with root package name */
        final ArrayDeque<uc.p<R>> f108697g = new ArrayDeque<>();

        /* renamed from: h, reason: collision with root package name */
        InterfaceC9808j<T> f108698h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC8487b f108699i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f108700j;

        /* renamed from: k, reason: collision with root package name */
        int f108701k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f108702l;

        /* renamed from: m, reason: collision with root package name */
        uc.p<R> f108703m;

        /* renamed from: n, reason: collision with root package name */
        int f108704n;

        a(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar, int i11, int i12, Gc.h hVar) {
            this.f108691a = wVar;
            this.f108692b = oVar;
            this.f108693c = i11;
            this.f108694d = i12;
            this.f108695e = hVar;
        }

        @Override // uc.q
        public final void a() {
            R poll;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC9808j<T> interfaceC9808j = this.f108698h;
            ArrayDeque<uc.p<R>> arrayDeque = this.f108697g;
            io.reactivex.w<? super R> wVar = this.f108691a;
            Gc.h hVar = this.f108695e;
            int i11 = 1;
            while (true) {
                int i12 = this.f108704n;
                while (i12 != this.f108693c) {
                    if (this.f108702l) {
                        interfaceC9808j.clear();
                        f();
                        return;
                    }
                    if (hVar == Gc.h.IMMEDIATE && this.f108696f.get() != null) {
                        interfaceC9808j.clear();
                        f();
                        Gc.c cVar = this.f108696f;
                        cVar.getClass();
                        wVar.onError(Gc.i.b(cVar));
                        return;
                    }
                    try {
                        T poll2 = interfaceC9808j.poll();
                        if (poll2 == null) {
                            break;
                        }
                        io.reactivex.u<? extends R> apply = this.f108692b.apply(poll2);
                        C9656b.c(apply, "The mapper returned a null ObservableSource");
                        io.reactivex.u<? extends R> uVar = apply;
                        uc.p<R> pVar = new uc.p<>(this, this.f108694d);
                        arrayDeque.offer(pVar);
                        uVar.subscribe(pVar);
                        i12++;
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f108699i.dispose();
                        interfaceC9808j.clear();
                        f();
                        Gc.c cVar2 = this.f108696f;
                        cVar2.getClass();
                        Gc.i.a(cVar2, th2);
                        Gc.c cVar3 = this.f108696f;
                        cVar3.getClass();
                        wVar.onError(Gc.i.b(cVar3));
                        return;
                    }
                }
                this.f108704n = i12;
                if (this.f108702l) {
                    interfaceC9808j.clear();
                    f();
                    return;
                }
                if (hVar == Gc.h.IMMEDIATE && this.f108696f.get() != null) {
                    interfaceC9808j.clear();
                    f();
                    Gc.c cVar4 = this.f108696f;
                    cVar4.getClass();
                    wVar.onError(Gc.i.b(cVar4));
                    return;
                }
                uc.p<R> pVar2 = this.f108703m;
                if (pVar2 == null) {
                    if (hVar == Gc.h.BOUNDARY && this.f108696f.get() != null) {
                        interfaceC9808j.clear();
                        f();
                        Gc.c cVar5 = this.f108696f;
                        cVar5.getClass();
                        wVar.onError(Gc.i.b(cVar5));
                        return;
                    }
                    boolean z12 = this.f108700j;
                    uc.p<R> poll3 = arrayDeque.poll();
                    boolean z13 = poll3 == null;
                    if (z12 && z13) {
                        if (this.f108696f.get() == null) {
                            wVar.onComplete();
                            return;
                        }
                        interfaceC9808j.clear();
                        f();
                        Gc.c cVar6 = this.f108696f;
                        cVar6.getClass();
                        wVar.onError(Gc.i.b(cVar6));
                        return;
                    }
                    if (!z13) {
                        this.f108703m = poll3;
                    }
                    pVar2 = poll3;
                }
                if (pVar2 != null) {
                    InterfaceC9808j<R> b11 = pVar2.b();
                    while (!this.f108702l) {
                        boolean a11 = pVar2.a();
                        if (hVar == Gc.h.IMMEDIATE && this.f108696f.get() != null) {
                            interfaceC9808j.clear();
                            f();
                            Gc.c cVar7 = this.f108696f;
                            cVar7.getClass();
                            wVar.onError(Gc.i.b(cVar7));
                            return;
                        }
                        try {
                            poll = b11.poll();
                            z11 = poll == null;
                        } catch (Throwable th3) {
                            C2645f.c(th3);
                            Gc.c cVar8 = this.f108696f;
                            cVar8.getClass();
                            Gc.i.a(cVar8, th3);
                            this.f108703m = null;
                            this.f108704n--;
                        }
                        if (a11 && z11) {
                            this.f108703m = null;
                            this.f108704n--;
                        } else if (!z11) {
                            wVar.onNext(poll);
                        }
                    }
                    interfaceC9808j.clear();
                    f();
                    return;
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // uc.q
        public final void b(uc.p<R> pVar, Throwable th2) {
            Gc.c cVar = this.f108696f;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (this.f108695e == Gc.h.IMMEDIATE) {
                this.f108699i.dispose();
            }
            pVar.d();
            a();
        }

        @Override // uc.q
        public final void d(uc.p<R> pVar) {
            pVar.d();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108702l) {
                return;
            }
            this.f108702l = true;
            this.f108699i.dispose();
            if (getAndIncrement() == 0) {
                do {
                    this.f108698h.clear();
                    f();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // uc.q
        public final void e(uc.p<R> pVar, R r11) {
            pVar.b().offer(r11);
            a();
        }

        final void f() {
            uc.p<R> pVar = this.f108703m;
            if (pVar != null) {
                rc.d.a(pVar);
            }
            while (true) {
                uc.p<R> poll = this.f108697g.poll();
                if (poll == null) {
                    return;
                } else {
                    rc.d.a(poll);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108702l;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108700j = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108696f;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f108700j = true;
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108701k == 0) {
                this.f108698h.offer(t2);
            }
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108699i, interfaceC8487b)) {
                this.f108699i = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(3);
                    if (a11 == 1) {
                        this.f108701k = a11;
                        this.f108698h = interfaceC9803e;
                        this.f108700j = true;
                        this.f108691a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (a11 == 2) {
                        this.f108701k = a11;
                        this.f108698h = interfaceC9803e;
                        this.f108691a.onSubscribe(this);
                        return;
                    }
                }
                this.f108698h = new Cc.c(this.f108694d);
                this.f108691a.onSubscribe(this);
            }
        }
    }

    public C11076v(io.reactivex.p pVar, qc.o oVar, Gc.h hVar, int i11, int i12) {
        super(pVar);
        this.f108687b = oVar;
        this.f108688c = hVar;
        this.f108689d = i11;
        this.f108690e = i12;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108687b, this.f108689d, this.f108690e, this.f108688c));
    }
}
