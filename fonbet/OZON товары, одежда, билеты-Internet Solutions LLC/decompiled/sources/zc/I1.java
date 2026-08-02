package zc;

import Bl0.C2645f;
import Cc.C2738a;
import Kc.C3493a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class I1<T, B, V> extends AbstractC11019a<T, io.reactivex.p<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<B> f107728b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super B, ? extends io.reactivex.u<V>> f107729c;

    /* renamed from: d, reason: collision with root package name */
    final int f107730d;

    static final class a<T, V> extends Ic.c<V> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f107731b;

        /* renamed from: c, reason: collision with root package name */
        final Nc.f<T> f107732c;

        /* renamed from: d, reason: collision with root package name */
        boolean f107733d;

        a(c<T, ?, V> cVar, Nc.f<T> fVar) {
            this.f107731b = cVar;
            this.f107732c = fVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107733d) {
                return;
            }
            this.f107733d = true;
            this.f107731b.j(this);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107733d) {
                C3493a.f(th2);
                return;
            }
            this.f107733d = true;
            c<T, ?, V> cVar = this.f107731b;
            cVar.f107739k.dispose();
            cVar.f107738j.dispose();
            cVar.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(V v11) {
            dispose();
            onComplete();
        }
    }

    static final class b<T, B> extends Ic.c<B> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f107734b;

        b(c<T, B, ?> cVar) {
            this.f107734b = cVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107734b.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            c<T, B, ?> cVar = this.f107734b;
            cVar.f107739k.dispose();
            cVar.f107738j.dispose();
            cVar.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(B b11) {
            this.f107734b.l(b11);
        }
    }

    static final class c<T, B, V> extends uc.s<T, Object, io.reactivex.p<T>> implements InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.u<B> f107735g;

        /* renamed from: h, reason: collision with root package name */
        final qc.o<? super B, ? extends io.reactivex.u<V>> f107736h;

        /* renamed from: i, reason: collision with root package name */
        final int f107737i;

        /* renamed from: j, reason: collision with root package name */
        final C8486a f107738j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC8487b f107739k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107740l;

        /* renamed from: m, reason: collision with root package name */
        final ArrayList f107741m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicLong f107742n;

        /* renamed from: o, reason: collision with root package name */
        final AtomicBoolean f107743o;

        c(Ic.e eVar, io.reactivex.u uVar, qc.o oVar, int i11) {
            super(eVar, new C2738a());
            this.f107740l = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f107742n = atomicLong;
            this.f107743o = new AtomicBoolean();
            this.f107735g = uVar;
            this.f107736h = oVar;
            this.f107737i = i11;
            this.f107738j = new C8486a();
            this.f107741m = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // uc.s
        public final void a(Ic.e eVar, Object obj) {
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107743o.compareAndSet(false, true)) {
                rc.d.a(this.f107740l);
                if (this.f107742n.decrementAndGet() == 0) {
                    this.f107739k.dispose();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107743o.get();
        }

        final void j(a<T, V> aVar) {
            this.f107738j.b(aVar);
            this.f100597c.offer(new d(aVar.f107732c, null));
            if (d()) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void k() {
            C2738a c2738a = this.f100597c;
            Ic.e eVar = this.f100596b;
            ArrayList arrayList = this.f107741m;
            int i11 = 1;
            while (true) {
                boolean z11 = this.f100599e;
                Object poll = c2738a.poll();
                boolean z12 = poll == null;
                if (z11 && z12) {
                    this.f107738j.dispose();
                    rc.d.a(this.f107740l);
                    Throwable th2 = this.f100600f;
                    if (th2 != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Nc.f) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Nc.f) it2.next()).onComplete();
                        }
                    }
                    arrayList.clear();
                    return;
                }
                if (z12) {
                    i11 = i(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else if (poll instanceof d) {
                    d dVar = (d) poll;
                    Nc.f<T> fVar = dVar.f107744a;
                    if (fVar != null) {
                        if (arrayList.remove(fVar)) {
                            dVar.f107744a.onComplete();
                            if (this.f107742n.decrementAndGet() == 0) {
                                this.f107738j.dispose();
                                rc.d.a(this.f107740l);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f107743o.get()) {
                        Nc.f e11 = Nc.f.e(this.f107737i);
                        arrayList.add(e11);
                        eVar.onNext(e11);
                        try {
                            io.reactivex.u<V> apply = this.f107736h.apply(dVar.f107745b);
                            C9656b.c(apply, "The ObservableSource supplied is null");
                            io.reactivex.u<V> uVar = apply;
                            a aVar = new a(this, e11);
                            if (this.f107738j.a(aVar)) {
                                this.f107742n.getAndIncrement();
                                uVar.subscribe(aVar);
                            }
                        } catch (Throwable th3) {
                            C2645f.c(th3);
                            this.f107743o.set(true);
                            eVar.onError(th3);
                        }
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((Nc.f) it3.next()).onNext(poll);
                    }
                }
            }
        }

        final void l(B b11) {
            this.f100597c.offer(new d(null, b11));
            if (d()) {
                k();
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f100599e) {
                return;
            }
            this.f100599e = true;
            if (d()) {
                k();
            }
            if (this.f107742n.decrementAndGet() == 0) {
                this.f107738j.dispose();
            }
            this.f100596b.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f100599e) {
                C3493a.f(th2);
                return;
            }
            this.f100600f = th2;
            this.f100599e = true;
            if (d()) {
                k();
            }
            if (this.f107742n.decrementAndGet() == 0) {
                this.f107738j.dispose();
            }
            this.f100596b.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (f()) {
                Iterator it = this.f107741m.iterator();
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
            if (rc.d.g(this.f107739k, interfaceC8487b)) {
                this.f107739k = interfaceC8487b;
                this.f100596b.onSubscribe(this);
                if (this.f107743o.get()) {
                    return;
                }
                b bVar = new b(this);
                AtomicReference<InterfaceC8487b> atomicReference = this.f107740l;
                while (!atomicReference.compareAndSet(null, bVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                this.f107735g.subscribe(bVar);
            }
        }
    }

    static final class d<T, B> {

        /* renamed from: a, reason: collision with root package name */
        final Nc.f<T> f107744a;

        /* renamed from: b, reason: collision with root package name */
        final B f107745b;

        d(Nc.f<T> fVar, B b11) {
            this.f107744a = fVar;
            this.f107745b = b11;
        }
    }

    public I1(io.reactivex.p pVar, io.reactivex.u uVar, qc.o oVar, int i11) {
        super(pVar);
        this.f107728b = uVar;
        this.f107729c = oVar;
        this.f107730d = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.p<T>> wVar) {
        this.f108122a.subscribe(new c(new Ic.e(wVar), this.f107728b, this.f107729c, this.f107730d));
    }
}
