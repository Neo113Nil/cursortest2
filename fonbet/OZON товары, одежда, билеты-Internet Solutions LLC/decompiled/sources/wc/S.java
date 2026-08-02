package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import sc.C9656b;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;

/* loaded from: classes9.dex */
public final class S<T, R> extends AbstractC10480a<T, R> {

    /* renamed from: d, reason: collision with root package name */
    final DJ.e f103878d;

    /* renamed from: e, reason: collision with root package name */
    final int f103879e;

    static final class a<T, R> extends AtomicReference<InterfaceC6950c> implements io.reactivex.j<R> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f103880a;

        /* renamed from: b, reason: collision with root package name */
        final long f103881b;

        /* renamed from: c, reason: collision with root package name */
        final int f103882c;

        /* renamed from: d, reason: collision with root package name */
        volatile InterfaceC9808j<R> f103883d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f103884e;

        /* renamed from: f, reason: collision with root package name */
        int f103885f;

        a(b<T, R> bVar, long j11, int i11) {
            this.f103880a = bVar;
            this.f103881b = j11;
            this.f103882c = i11;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.e(this, interfaceC6950c)) {
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f103885f = a11;
                        this.f103883d = interfaceC9805g;
                        this.f103884e = true;
                        this.f103880a.b();
                        return;
                    }
                    if (a11 == 2) {
                        this.f103885f = a11;
                        this.f103883d = interfaceC9805g;
                        interfaceC6950c.n(this.f103882c);
                        return;
                    }
                }
                this.f103883d = new Cc.b(this.f103882c);
                interfaceC6950c.n(this.f103882c);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            b<T, R> bVar = this.f103880a;
            if (this.f103881b == bVar.f103896j) {
                this.f103884e = true;
                bVar.b();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f103880a;
            if (this.f103881b == bVar.f103896j) {
                Gc.c cVar = bVar.f103891e;
                cVar.getClass();
                if (Gc.i.a(cVar, th2)) {
                    bVar.f103893g.cancel();
                    this.f103884e = true;
                    bVar.b();
                    return;
                }
            }
            C3493a.f(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(R r11) {
            b<T, R> bVar = this.f103880a;
            if (this.f103881b == bVar.f103896j) {
                if (this.f103885f != 0 || this.f103883d.offer(r11)) {
                    bVar.b();
                } else {
                    onError(new oc.b("Queue full?!"));
                }
            }
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: k, reason: collision with root package name */
        static final a<Object, Object> f103886k;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103887a;

        /* renamed from: b, reason: collision with root package name */
        final DJ.e f103888b;

        /* renamed from: c, reason: collision with root package name */
        final int f103889c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f103890d;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f103892f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC6950c f103893g;

        /* renamed from: j, reason: collision with root package name */
        volatile long f103896j;

        /* renamed from: h, reason: collision with root package name */
        final AtomicReference<a<T, R>> f103894h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        final AtomicLong f103895i = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final Gc.c f103891e = new Gc.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f103886k = aVar;
            Fc.g.a(aVar);
        }

        b(io.reactivex.j jVar, DJ.e eVar, int i11) {
            this.f103887a = jVar;
            this.f103888b = eVar;
            this.f103889c = i11;
        }

        final void a() {
            a<Object, Object> aVar;
            AtomicReference<a<T, R>> atomicReference = this.f103894h;
            a<Object, Object> aVar2 = (a) atomicReference.get();
            a<Object, Object> aVar3 = f103886k;
            if (aVar2 == aVar3 || (aVar = (a) atomicReference.getAndSet(aVar3)) == aVar3 || aVar == null) {
                return;
            }
            Fc.g.a(aVar);
        }

        final void b() {
            boolean z11;
            R r11;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.j jVar = this.f103887a;
            int i11 = 1;
            while (!this.f103892f) {
                if (this.f103890d) {
                    if (this.f103891e.get() != null) {
                        a();
                        Gc.c cVar = this.f103891e;
                        cVar.getClass();
                        jVar.onError(Gc.i.b(cVar));
                        return;
                    }
                    if (this.f103894h.get() == null) {
                        jVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.f103894h.get();
                InterfaceC9808j<R> interfaceC9808j = aVar != null ? aVar.f103883d : null;
                if (interfaceC9808j != null) {
                    if (aVar.f103884e) {
                        if (this.f103891e.get() != null) {
                            a();
                            Gc.c cVar2 = this.f103891e;
                            cVar2.getClass();
                            jVar.onError(Gc.i.b(cVar2));
                            return;
                        }
                        if (interfaceC9808j.isEmpty()) {
                            AtomicReference<a<T, R>> atomicReference = this.f103894h;
                            while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                            }
                        }
                    }
                    long j11 = this.f103895i.get();
                    long j12 = 0;
                    while (true) {
                        z11 = false;
                        if (j12 != j11) {
                            if (!this.f103892f) {
                                boolean z12 = aVar.f103884e;
                                try {
                                    r11 = interfaceC9808j.poll();
                                } catch (Throwable th2) {
                                    C2645f.c(th2);
                                    Fc.g.a(aVar);
                                    Gc.c cVar3 = this.f103891e;
                                    cVar3.getClass();
                                    Gc.i.a(cVar3, th2);
                                    r11 = null;
                                    z12 = true;
                                }
                                boolean z13 = r11 == null;
                                if (aVar != this.f103894h.get()) {
                                    break;
                                }
                                if (z12) {
                                    if (this.f103891e.get() != null) {
                                        Gc.c cVar4 = this.f103891e;
                                        cVar4.getClass();
                                        jVar.onError(Gc.i.b(cVar4));
                                        return;
                                    } else if (z13) {
                                        AtomicReference<a<T, R>> atomicReference2 = this.f103894h;
                                        while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                                        }
                                    }
                                }
                                if (z13) {
                                    break;
                                }
                                jVar.onNext(r11);
                                j12++;
                            } else {
                                return;
                            }
                        } else {
                            break;
                        }
                    }
                    z11 = true;
                    if (j12 != 0 && !this.f103892f) {
                        if (j11 != Long.MAX_VALUE) {
                            this.f103895i.addAndGet(-j12);
                        }
                        aVar.get().n(j12);
                    }
                    if (z11) {
                        continue;
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            this.f103894h.lazySet(null);
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (this.f103892f) {
                return;
            }
            this.f103892f = true;
            this.f103893g.cancel();
            a();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103893g, interfaceC6950c)) {
                this.f103893g = interfaceC6950c;
                this.f103887a.d(this);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f103895i, j11);
                if (this.f103896j == 0) {
                    this.f103893g.n(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f103890d) {
                return;
            }
            this.f103890d = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (!this.f103890d) {
                Gc.c cVar = this.f103891e;
                cVar.getClass();
                if (Gc.i.a(cVar, th2)) {
                    a();
                    this.f103890d = true;
                    b();
                    return;
                }
            }
            C3493a.f(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            InterfaceC6948a sharedSubscription$lambda$0;
            if (this.f103890d) {
                return;
            }
            long j11 = this.f103896j + 1;
            this.f103896j = j11;
            a<T, R> aVar = this.f103894h.get();
            if (aVar != null) {
                Fc.g.a(aVar);
            }
            try {
                sharedSubscription$lambda$0 = OzonWebSocketImpl.sharedSubscription$lambda$0(this.f103888b.f6237b, t2);
                C9656b.c(sharedSubscription$lambda$0, "The publisher returned is null");
                a<T, R> aVar2 = new a<>(this, j11, this.f103889c);
                while (true) {
                    a<T, R> aVar3 = this.f103894h.get();
                    if (aVar3 == f103886k) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f103894h;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    sharedSubscription$lambda$0.a(aVar2);
                    return;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f103893g.cancel();
                onError(th2);
            }
        }
    }

    public S(io.reactivex.h hVar, DJ.e eVar, int i11) {
        super(hVar);
        this.f103878d = eVar;
        this.f103879e = i11;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        io.reactivex.h<T> hVar = this.f103914c;
        DJ.e eVar = this.f103878d;
        if (M.b(hVar, jVar, eVar)) {
            return;
        }
        hVar.i(new b(jVar, eVar, this.f103879e));
    }
}
