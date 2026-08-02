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
public final class d<T, R> extends p<R> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106494a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends C<? extends R>> f106495b;

    /* renamed from: c, reason: collision with root package name */
    final Gc.h f106496c;

    /* renamed from: d, reason: collision with root package name */
    final int f106497d;

    static final class a<T, R> extends AtomicInteger implements w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f106498a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends C<? extends R>> f106499b;

        /* renamed from: c, reason: collision with root package name */
        final Gc.c f106500c = new Gc.c();

        /* renamed from: d, reason: collision with root package name */
        final C2300a<R> f106501d = new C2300a<>(this);

        /* renamed from: e, reason: collision with root package name */
        final Cc.c f106502e;

        /* renamed from: f, reason: collision with root package name */
        final Gc.h f106503f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f106504g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f106505h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f106506i;

        /* renamed from: j, reason: collision with root package name */
        R f106507j;

        /* renamed from: k, reason: collision with root package name */
        volatile int f106508k;

        /* renamed from: yc.d$a$a, reason: collision with other inner class name */
        static final class C2300a<R> extends AtomicReference<InterfaceC8487b> implements A<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f106509a;

            C2300a(a<?, R> aVar) {
                this.f106509a = aVar;
            }

            @Override // io.reactivex.A
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f106509a;
                Gc.c cVar = aVar.f106500c;
                cVar.getClass();
                if (!i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                if (aVar.f106503f != Gc.h.END) {
                    aVar.f106504g.dispose();
                }
                aVar.f106508k = 0;
                aVar.a();
            }

            @Override // io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this, interfaceC8487b);
            }

            @Override // io.reactivex.A
            public final void onSuccess(R r11) {
                a<?, R> aVar = this.f106509a;
                aVar.f106507j = r11;
                aVar.f106508k = 2;
                aVar.a();
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends C<? extends R>> oVar, int i11, Gc.h hVar) {
            this.f106498a = wVar;
            this.f106499b = oVar;
            this.f106503f = hVar;
            this.f106502e = new Cc.c(i11);
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            w<? super R> wVar = this.f106498a;
            Gc.h hVar = this.f106503f;
            Cc.c cVar = this.f106502e;
            Gc.c cVar2 = this.f106500c;
            int i11 = 1;
            while (true) {
                if (this.f106506i) {
                    cVar.clear();
                    this.f106507j = null;
                } else {
                    int i12 = this.f106508k;
                    if (cVar2.get() == null || (hVar != Gc.h.IMMEDIATE && (hVar != Gc.h.BOUNDARY || i12 != 0))) {
                        if (i12 == 0) {
                            boolean z11 = this.f106505h;
                            Object poll = cVar.poll();
                            boolean z12 = poll == null;
                            if (z11 && z12) {
                                Throwable b11 = i.b(cVar2);
                                if (b11 == null) {
                                    wVar.onComplete();
                                    return;
                                } else {
                                    wVar.onError(b11);
                                    return;
                                }
                            }
                            if (!z12) {
                                try {
                                    C<? extends R> apply = this.f106499b.apply(poll);
                                    C9656b.c(apply, "The mapper returned a null SingleSource");
                                    C<? extends R> c11 = apply;
                                    this.f106508k = 1;
                                    c11.c(this.f106501d);
                                } catch (Throwable th2) {
                                    C2645f.c(th2);
                                    this.f106504g.dispose();
                                    cVar.clear();
                                    i.a(cVar2, th2);
                                    wVar.onError(i.b(cVar2));
                                    return;
                                }
                            }
                        } else if (i12 == 2) {
                            R r11 = this.f106507j;
                            this.f106507j = null;
                            wVar.onNext(r11);
                            this.f106508k = 0;
                        }
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            cVar.clear();
            this.f106507j = null;
            wVar.onError(i.b(cVar2));
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106506i = true;
            this.f106504g.dispose();
            C2300a<R> c2300a = this.f106501d;
            c2300a.getClass();
            rc.d.a(c2300a);
            if (getAndIncrement() == 0) {
                this.f106502e.clear();
                this.f106507j = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106506i;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106505h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106500c;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (this.f106503f == Gc.h.IMMEDIATE) {
                C2300a<R> c2300a = this.f106501d;
                c2300a.getClass();
                rc.d.a(c2300a);
            }
            this.f106505h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f106502e.offer(t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106504g, interfaceC8487b)) {
                this.f106504g = interfaceC8487b;
                this.f106498a.onSubscribe(this);
            }
        }
    }

    public d(p<T> pVar, o<? super T, ? extends C<? extends R>> oVar, Gc.h hVar, int i11) {
        this.f106494a = pVar;
        this.f106495b = oVar;
        this.f106496c = hVar;
        this.f106497d = i11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super R> wVar) {
        p<T> pVar = this.f106494a;
        o<? super T, ? extends C<? extends R>> oVar = this.f106495b;
        if (h.c(pVar, oVar, wVar)) {
            return;
        }
        pVar.subscribe(new a(wVar, oVar, this.f106497d, this.f106496c));
    }
}
