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
import zc.C11050k0;

/* renamed from: zc.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11069r0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC11019a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends TRight> f108574b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> f108575c;

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> f108576d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC9021c<? super TLeft, ? super TRight, ? extends R> f108577e;

    /* renamed from: zc.r0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC8487b, C11050k0.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108578a;

        /* renamed from: g, reason: collision with root package name */
        final qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> f108584g;

        /* renamed from: h, reason: collision with root package name */
        final qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> f108585h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC9021c<? super TLeft, ? super TRight, ? extends R> f108586i;

        /* renamed from: k, reason: collision with root package name */
        int f108588k;

        /* renamed from: l, reason: collision with root package name */
        int f108589l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f108590m;

        /* renamed from: c, reason: collision with root package name */
        final C8486a f108580c = new C8486a();

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<Object> f108579b = new Cc.c<>(io.reactivex.p.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final LinkedHashMap f108581d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final LinkedHashMap f108582e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f108583f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f108587j = new AtomicInteger(2);

        a(io.reactivex.w<? super R> wVar, qc.o<? super TLeft, ? extends io.reactivex.u<TLeftEnd>> oVar, qc.o<? super TRight, ? extends io.reactivex.u<TRightEnd>> oVar2, InterfaceC9021c<? super TLeft, ? super TRight, ? extends R> interfaceC9021c) {
            this.f108578a = wVar;
            this.f108584g = oVar;
            this.f108585h = oVar2;
            this.f108586i = interfaceC9021c;
        }

        @Override // zc.C11050k0.b
        public final void a(Throwable th2) {
            if (!Gc.i.a(this.f108583f, th2)) {
                C3493a.f(th2);
            } else {
                this.f108587j.decrementAndGet();
                g();
            }
        }

        @Override // zc.C11050k0.b
        public final void b(Throwable th2) {
            if (Gc.i.a(this.f108583f, th2)) {
                g();
            } else {
                C3493a.f(th2);
            }
        }

        @Override // zc.C11050k0.b
        public final void d(boolean z11, C11050k0.c cVar) {
            synchronized (this) {
                this.f108579b.b(z11 ? 3 : 4, cVar);
            }
            g();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108590m) {
                return;
            }
            this.f108590m = true;
            this.f108580c.dispose();
            if (getAndIncrement() == 0) {
                this.f108579b.clear();
            }
        }

        @Override // zc.C11050k0.b
        public final void e(C11050k0.d dVar) {
            this.f108580c.b(dVar);
            this.f108587j.decrementAndGet();
            g();
        }

        @Override // zc.C11050k0.b
        public final void f(Object obj, boolean z11) {
            synchronized (this) {
                this.f108579b.b(z11 ? 1 : 2, obj);
            }
            g();
        }

        final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            Cc.c<?> cVar = this.f108579b;
            io.reactivex.w<? super R> wVar = this.f108578a;
            int i11 = 1;
            while (!this.f108590m) {
                if (this.f108583f.get() != null) {
                    cVar.clear();
                    this.f108580c.dispose();
                    h(wVar);
                    return;
                }
                boolean z11 = this.f108587j.get() == 0;
                Integer num = (Integer) cVar.poll();
                boolean z12 = num == null;
                if (z11 && z12) {
                    this.f108581d.clear();
                    this.f108582e.clear();
                    this.f108580c.dispose();
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
                        int i12 = this.f108588k;
                        this.f108588k = i12 + 1;
                        this.f108581d.put(Integer.valueOf(i12), poll);
                        try {
                            io.reactivex.u apply = this.f108584g.apply(poll);
                            C9656b.c(apply, "The leftEnd returned a null ObservableSource");
                            io.reactivex.u uVar = apply;
                            C11050k0.c cVar2 = new C11050k0.c(this, true, i12);
                            this.f108580c.a(cVar2);
                            uVar.subscribe(cVar2);
                            if (this.f108583f.get() != null) {
                                cVar.clear();
                                this.f108580c.dispose();
                                h(wVar);
                                return;
                            }
                            Iterator it = this.f108582e.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    R apply2 = this.f108586i.apply(poll, it.next());
                                    C9656b.c(apply2, "The resultSelector returned a null value");
                                    wVar.onNext(apply2);
                                } catch (Throwable th2) {
                                    i(th2, wVar, cVar);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            i(th3, wVar, cVar);
                            return;
                        }
                    } else if (num == 2) {
                        int i13 = this.f108589l;
                        this.f108589l = i13 + 1;
                        this.f108582e.put(Integer.valueOf(i13), poll);
                        try {
                            io.reactivex.u apply3 = this.f108585h.apply(poll);
                            C9656b.c(apply3, "The rightEnd returned a null ObservableSource");
                            io.reactivex.u uVar2 = apply3;
                            C11050k0.c cVar3 = new C11050k0.c(this, false, i13);
                            this.f108580c.a(cVar3);
                            uVar2.subscribe(cVar3);
                            if (this.f108583f.get() != null) {
                                cVar.clear();
                                this.f108580c.dispose();
                                h(wVar);
                                return;
                            }
                            Iterator it2 = this.f108581d.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    R apply4 = this.f108586i.apply(it2.next(), poll);
                                    C9656b.c(apply4, "The resultSelector returned a null value");
                                    wVar.onNext(apply4);
                                } catch (Throwable th4) {
                                    i(th4, wVar, cVar);
                                    return;
                                }
                            }
                        } catch (Throwable th5) {
                            i(th5, wVar, cVar);
                            return;
                        }
                    } else if (num == 3) {
                        C11050k0.c cVar4 = (C11050k0.c) poll;
                        this.f108581d.remove(Integer.valueOf(cVar4.f108356c));
                        this.f108580c.c(cVar4);
                    } else {
                        C11050k0.c cVar5 = (C11050k0.c) poll;
                        this.f108582e.remove(Integer.valueOf(cVar5.f108356c));
                        this.f108580c.c(cVar5);
                    }
                }
            }
            cVar.clear();
        }

        final void h(io.reactivex.w<?> wVar) {
            Throwable b11 = Gc.i.b(this.f108583f);
            this.f108581d.clear();
            this.f108582e.clear();
            wVar.onError(b11);
        }

        final void i(Throwable th2, io.reactivex.w<?> wVar, Cc.c<?> cVar) {
            C2645f.c(th2);
            Gc.i.a(this.f108583f, th2);
            cVar.clear();
            this.f108580c.dispose();
            h(wVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108590m;
        }
    }

    public C11069r0(io.reactivex.p pVar, io.reactivex.u uVar, qc.o oVar, qc.o oVar2, InterfaceC9021c interfaceC9021c) {
        super(pVar);
        this.f108574b = uVar;
        this.f108575c = oVar;
        this.f108576d = oVar2;
        this.f108577e = interfaceC9021c;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        a aVar = new a(wVar, this.f108575c, this.f108576d, this.f108577e);
        wVar.onSubscribe(aVar);
        C11050k0.d dVar = new C11050k0.d(aVar, true);
        C8486a c8486a = aVar.f108580c;
        c8486a.a(dVar);
        C11050k0.d dVar2 = new C11050k0.d(aVar, false);
        c8486a.a(dVar2);
        this.f108122a.subscribe(dVar);
        this.f108574b.subscribe(dVar2);
    }
}
