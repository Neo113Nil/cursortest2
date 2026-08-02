package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import qc.InterfaceC9021c;
import sc.C9656b;

/* renamed from: zc.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11050k0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC11019a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends TRight> f108337b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> f108338c;

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> f108339d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC9021c<? super TLeft, ? super io.reactivex.p<TRight>, ? extends R> f108340e;

    /* renamed from: zc.k0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC8487b, b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108341a;

        /* renamed from: g, reason: collision with root package name */
        final qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> f108347g;

        /* renamed from: h, reason: collision with root package name */
        final qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> f108348h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC9021c<? super TLeft, ? super io.reactivex.p<TRight>, ? extends R> f108349i;

        /* renamed from: k, reason: collision with root package name */
        int f108351k;

        /* renamed from: l, reason: collision with root package name */
        int f108352l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f108353m;

        /* renamed from: c, reason: collision with root package name */
        final C8486a f108343c = new C8486a();

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<Object> f108342b = new Cc.c<>(io.reactivex.p.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final LinkedHashMap f108344d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final LinkedHashMap f108345e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f108346f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f108350j = new AtomicInteger(2);

        a(io.reactivex.w<? super R> wVar, qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> oVar, qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> oVar2, InterfaceC9021c<? super TLeft, ? super io.reactivex.p<TRight>, ? extends R> interfaceC9021c) {
            this.f108341a = wVar;
            this.f108347g = oVar;
            this.f108348h = oVar2;
            this.f108349i = interfaceC9021c;
        }

        @Override // zc.C11050k0.b
        public final void a(Throwable th2) {
            if (!Gc.i.a(this.f108346f, th2)) {
                C3493a.f(th2);
            } else {
                this.f108350j.decrementAndGet();
                g();
            }
        }

        @Override // zc.C11050k0.b
        public final void b(Throwable th2) {
            if (Gc.i.a(this.f108346f, th2)) {
                g();
            } else {
                C3493a.f(th2);
            }
        }

        @Override // zc.C11050k0.b
        public final void d(boolean z11, c cVar) {
            synchronized (this) {
                this.f108342b.b(z11 ? 3 : 4, cVar);
            }
            g();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108353m) {
                return;
            }
            this.f108353m = true;
            this.f108343c.dispose();
            if (getAndIncrement() == 0) {
                this.f108342b.clear();
            }
        }

        @Override // zc.C11050k0.b
        public final void e(d dVar) {
            this.f108343c.b(dVar);
            this.f108350j.decrementAndGet();
            g();
        }

        @Override // zc.C11050k0.b
        public final void f(Object obj, boolean z11) {
            synchronized (this) {
                this.f108342b.b(z11 ? 1 : 2, obj);
            }
            g();
        }

        final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            Cc.c<?> cVar = this.f108342b;
            io.reactivex.w<? super R> wVar = this.f108341a;
            int i11 = 1;
            while (!this.f108353m) {
                if (this.f108346f.get() != null) {
                    cVar.clear();
                    this.f108343c.dispose();
                    h(wVar);
                    return;
                }
                boolean z11 = this.f108350j.get() == 0;
                Integer num = (Integer) cVar.poll();
                boolean z12 = num == null;
                if (z11 && z12) {
                    Iterator it = this.f108344d.values().iterator();
                    while (it.hasNext()) {
                        ((Nc.f) it.next()).onComplete();
                    }
                    this.f108344d.clear();
                    this.f108345e.clear();
                    this.f108343c.dispose();
                    wVar.onComplete();
                    return;
                }
                if (z12) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    Object poll = cVar.poll();
                    if (num == 1) {
                        Nc.f d11 = Nc.f.d();
                        int i12 = this.f108351k;
                        this.f108351k = i12 + 1;
                        this.f108344d.put(Integer.valueOf(i12), d11);
                        try {
                            io.reactivex.u apply = this.f108347g.apply(poll);
                            C9656b.c(apply, "The leftEnd returned a null ObservableSource");
                            io.reactivex.u uVar = apply;
                            c cVar2 = new c(this, true, i12);
                            this.f108343c.a(cVar2);
                            uVar.subscribe(cVar2);
                            if (this.f108346f.get() != null) {
                                cVar.clear();
                                this.f108343c.dispose();
                                h(wVar);
                                return;
                            }
                            try {
                                R apply2 = this.f108349i.apply(poll, d11);
                                C9656b.c(apply2, "The resultSelector returned a null value");
                                wVar.onNext(apply2);
                                Iterator it2 = this.f108345e.values().iterator();
                                while (it2.hasNext()) {
                                    d11.onNext(it2.next());
                                }
                            } catch (Throwable th2) {
                                i(th2, wVar, cVar);
                                return;
                            }
                        } catch (Throwable th3) {
                            i(th3, wVar, cVar);
                            return;
                        }
                    } else if (num == 2) {
                        int i13 = this.f108352l;
                        this.f108352l = i13 + 1;
                        this.f108345e.put(Integer.valueOf(i13), poll);
                        try {
                            io.reactivex.u apply3 = this.f108348h.apply(poll);
                            C9656b.c(apply3, "The rightEnd returned a null ObservableSource");
                            io.reactivex.u uVar2 = apply3;
                            c cVar3 = new c(this, false, i13);
                            this.f108343c.a(cVar3);
                            uVar2.subscribe(cVar3);
                            if (this.f108346f.get() != null) {
                                cVar.clear();
                                this.f108343c.dispose();
                                h(wVar);
                                return;
                            } else {
                                Iterator it3 = this.f108344d.values().iterator();
                                while (it3.hasNext()) {
                                    ((Nc.f) it3.next()).onNext(poll);
                                }
                            }
                        } catch (Throwable th4) {
                            i(th4, wVar, cVar);
                            return;
                        }
                    } else if (num == 3) {
                        c cVar4 = (c) poll;
                        Nc.f fVar = (Nc.f) this.f108344d.remove(Integer.valueOf(cVar4.f108356c));
                        this.f108343c.c(cVar4);
                        if (fVar != null) {
                            fVar.onComplete();
                        }
                    } else if (num == 4) {
                        c cVar5 = (c) poll;
                        this.f108345e.remove(Integer.valueOf(cVar5.f108356c));
                        this.f108343c.c(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        final void h(io.reactivex.w<?> wVar) {
            Throwable b11 = Gc.i.b(this.f108346f);
            LinkedHashMap linkedHashMap = this.f108344d;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((Nc.f) it.next()).onError(b11);
            }
            linkedHashMap.clear();
            this.f108345e.clear();
            wVar.onError(b11);
        }

        final void i(Throwable th2, io.reactivex.w<?> wVar, Cc.c<?> cVar) {
            C2645f.c(th2);
            Gc.i.a(this.f108346f, th2);
            cVar.clear();
            this.f108343c.dispose();
            h(wVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108353m;
        }
    }

    /* renamed from: zc.k0$b */
    interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void d(boolean z11, c cVar);

        void e(d dVar);

        void f(Object obj, boolean z11);
    }

    /* renamed from: zc.k0$c */
    static final class c extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f108354a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f108355b;

        /* renamed from: c, reason: collision with root package name */
        final int f108356c;

        /* JADX WARN: Multi-variable type inference failed */
        c(b bVar, boolean z11, int i11) {
            this.f108354a = (AtomicInteger) bVar;
            this.f108355b = z11;
            this.f108356c = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108354a.d(this.f108355b, this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108354a.b(th2);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            if (rc.d.a(this)) {
                this.f108354a.d(this.f108355b, this);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    /* renamed from: zc.k0$d */
    static final class d extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f108357a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f108358b;

        /* JADX WARN: Multi-variable type inference failed */
        d(b bVar, boolean z11) {
            this.f108357a = (AtomicInteger) bVar;
            this.f108358b = z11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108357a.e(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108357a.a(th2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, zc.k0$b] */
        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            this.f108357a.f(obj, this.f108358b);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    public C11050k0(io.reactivex.p pVar, io.reactivex.u uVar, qc.o oVar, qc.o oVar2, InterfaceC9021c interfaceC9021c) {
        super(pVar);
        this.f108337b = uVar;
        this.f108338c = oVar;
        this.f108339d = oVar2;
        this.f108340e = interfaceC9021c;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        a aVar = new a(wVar, this.f108338c, this.f108339d, this.f108340e);
        wVar.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        C8486a c8486a = aVar.f108343c;
        c8486a.a(dVar);
        d dVar2 = new d(aVar, false);
        c8486a.a(dVar2);
        this.f108122a.subscribe(dVar);
        this.f108337b.subscribe(dVar2);
    }
}
