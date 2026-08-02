package yc;

import Bl0.C2645f;
import Gc.i;
import Kc.C3493a;
import io.reactivex.A;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.o;
import sc.C9656b;

/* loaded from: classes.dex */
public final class g<T, R> extends p<R> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106536a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends C<? extends R>> f106537b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f106538c;

    static final class a<T, R> extends AtomicInteger implements w<T>, InterfaceC8487b {

        /* renamed from: i, reason: collision with root package name */
        static final C2303a<Object> f106539i = new C2303a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f106540a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends C<? extends R>> f106541b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f106542c;

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f106543d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C2303a<R>> f106544e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f106545f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f106546g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f106547h;

        /* renamed from: yc.g$a$a, reason: collision with other inner class name */
        static final class C2303a<R> extends AtomicReference<InterfaceC8487b> implements A<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f106548a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f106549b;

            C2303a(a<?, R> aVar) {
                this.f106548a = aVar;
            }

            @Override // io.reactivex.A
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f106548a;
                if (Nh.b.e(aVar.f106544e, this)) {
                    Gc.c cVar = aVar.f106543d;
                    cVar.getClass();
                    if (i.a(cVar, th2)) {
                        if (!aVar.f106542c) {
                            aVar.f106545f.dispose();
                            aVar.a();
                        }
                        aVar.b();
                        return;
                    }
                }
                C3493a.f(th2);
            }

            @Override // io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }

            @Override // io.reactivex.A
            public final void onSuccess(R r11) {
                this.f106549b = r11;
                this.f106548a.b();
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends C<? extends R>> oVar, boolean z11) {
            this.f106540a = wVar;
            this.f106541b = oVar;
            this.f106542c = z11;
        }

        final void a() {
            AtomicReference<C2303a<R>> atomicReference = this.f106544e;
            C2303a<Object> c2303a = f106539i;
            C2303a<Object> c2303a2 = (C2303a) atomicReference.getAndSet(c2303a);
            if (c2303a2 == null || c2303a2 == c2303a) {
                return;
            }
            rc.d.a(c2303a2);
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            w<? super R> wVar = this.f106540a;
            Gc.c cVar = this.f106543d;
            AtomicReference<C2303a<R>> atomicReference = this.f106544e;
            int i11 = 1;
            while (!this.f106547h) {
                if (cVar.get() != null && !this.f106542c) {
                    wVar.onError(i.b(cVar));
                    return;
                }
                boolean z11 = this.f106546g;
                C2303a<R> c2303a = atomicReference.get();
                boolean z12 = c2303a == null;
                if (z11 && z12) {
                    Throwable b11 = i.b(cVar);
                    if (b11 != null) {
                        wVar.onError(b11);
                        return;
                    } else {
                        wVar.onComplete();
                        return;
                    }
                }
                if (z12 || c2303a.f106549b == null) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c2303a, null) && atomicReference.get() == c2303a) {
                    }
                    wVar.onNext(c2303a.f106549b);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106547h = true;
            this.f106545f.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106547h;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106546g = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106543d;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (!this.f106542c) {
                a();
            }
            this.f106546g = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            C2303a<Object> c2303a = f106539i;
            AtomicReference<C2303a<R>> atomicReference = this.f106544e;
            C2303a c2303a2 = (C2303a) atomicReference.get();
            if (c2303a2 != null) {
                rc.d.a(c2303a2);
            }
            try {
                C<? extends R> apply = this.f106541b.apply(t2);
                C9656b.c(apply, "The mapper returned a null SingleSource");
                C<? extends R> c11 = apply;
                C2303a c2303a3 = new C2303a(this);
                while (true) {
                    C2303a<Object> c2303a4 = (C2303a) atomicReference.get();
                    if (c2303a4 == c2303a) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c2303a4, c2303a3)) {
                        if (atomicReference.get() != c2303a4) {
                            break;
                        }
                    }
                    c11.c(c2303a3);
                    return;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f106545f.dispose();
                atomicReference.getAndSet(c2303a);
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106545f, interfaceC8487b)) {
                this.f106545f = interfaceC8487b;
                this.f106540a.onSubscribe(this);
            }
        }
    }

    public g(p<T> pVar, o<? super T, ? extends C<? extends R>> oVar, boolean z11) {
        this.f106536a = pVar;
        this.f106537b = oVar;
        this.f106538c = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super R> wVar) {
        p<T> pVar = this.f106536a;
        o<? super T, ? extends C<? extends R>> oVar = this.f106537b;
        if (h.c(pVar, oVar, wVar)) {
            return;
        }
        pVar.subscribe(new a(wVar, oVar, this.f106538c));
    }
}
