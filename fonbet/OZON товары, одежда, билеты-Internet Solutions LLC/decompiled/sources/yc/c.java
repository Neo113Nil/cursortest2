package yc;

import Bl0.C2645f;
import Gc.i;
import Kc.C3493a;
import io.reactivex.m;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.o;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class c<T, R> extends p<R> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106478a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends n<? extends R>> f106479b;

    /* renamed from: c, reason: collision with root package name */
    final Gc.h f106480c;

    /* renamed from: d, reason: collision with root package name */
    final int f106481d;

    static final class a<T, R> extends AtomicInteger implements w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f106482a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends n<? extends R>> f106483b;

        /* renamed from: c, reason: collision with root package name */
        final Gc.c f106484c = new Gc.c();

        /* renamed from: d, reason: collision with root package name */
        final C2299a<R> f106485d = new C2299a<>(this);

        /* renamed from: e, reason: collision with root package name */
        final Cc.c f106486e;

        /* renamed from: f, reason: collision with root package name */
        final Gc.h f106487f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f106488g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f106489h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f106490i;

        /* renamed from: j, reason: collision with root package name */
        R f106491j;

        /* renamed from: k, reason: collision with root package name */
        volatile int f106492k;

        /* renamed from: yc.c$a$a, reason: collision with other inner class name */
        static final class C2299a<R> extends AtomicReference<InterfaceC8487b> implements m<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f106493a;

            C2299a(a<?, R> aVar) {
                this.f106493a = aVar;
            }

            @Override // io.reactivex.m
            public final void onComplete() {
                a<?, R> aVar = this.f106493a;
                aVar.f106492k = 0;
                aVar.a();
            }

            @Override // io.reactivex.m
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f106493a;
                Gc.c cVar = aVar.f106484c;
                cVar.getClass();
                if (!i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                if (aVar.f106487f != Gc.h.END) {
                    aVar.f106488g.dispose();
                }
                aVar.f106492k = 0;
                aVar.a();
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this, interfaceC8487b);
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSuccess(R r11) {
                a<?, R> aVar = this.f106493a;
                aVar.f106491j = r11;
                aVar.f106492k = 2;
                aVar.a();
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends n<? extends R>> oVar, int i11, Gc.h hVar) {
            this.f106482a = wVar;
            this.f106483b = oVar;
            this.f106487f = hVar;
            this.f106486e = new Cc.c(i11);
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            w<? super R> wVar = this.f106482a;
            Gc.h hVar = this.f106487f;
            Cc.c cVar = this.f106486e;
            Gc.c cVar2 = this.f106484c;
            int i11 = 1;
            while (true) {
                if (this.f106490i) {
                    cVar.clear();
                    this.f106491j = null;
                } else {
                    int i12 = this.f106492k;
                    if (cVar2.get() == null || (hVar != Gc.h.IMMEDIATE && (hVar != Gc.h.BOUNDARY || i12 != 0))) {
                        if (i12 == 0) {
                            boolean z11 = this.f106489h;
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
                                    n<? extends R> apply = this.f106483b.apply(poll);
                                    C9656b.c(apply, "The mapper returned a null MaybeSource");
                                    n<? extends R> nVar = apply;
                                    this.f106492k = 1;
                                    nVar.a(this.f106485d);
                                } catch (Throwable th2) {
                                    C2645f.c(th2);
                                    this.f106488g.dispose();
                                    cVar.clear();
                                    i.a(cVar2, th2);
                                    wVar.onError(i.b(cVar2));
                                    return;
                                }
                            }
                        } else if (i12 == 2) {
                            R r11 = this.f106491j;
                            this.f106491j = null;
                            wVar.onNext(r11);
                            this.f106492k = 0;
                        }
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            cVar.clear();
            this.f106491j = null;
            wVar.onError(i.b(cVar2));
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106490i = true;
            this.f106488g.dispose();
            C2299a<R> c2299a = this.f106485d;
            c2299a.getClass();
            rc.d.a(c2299a);
            if (getAndIncrement() == 0) {
                this.f106486e.clear();
                this.f106491j = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106490i;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106489h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106484c;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (this.f106487f == Gc.h.IMMEDIATE) {
                C2299a<R> c2299a = this.f106485d;
                c2299a.getClass();
                rc.d.a(c2299a);
            }
            this.f106489h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f106486e.offer(t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106488g, interfaceC8487b)) {
                this.f106488g = interfaceC8487b;
                this.f106482a.onSubscribe(this);
            }
        }
    }

    public c(p<T> pVar, o<? super T, ? extends n<? extends R>> oVar, Gc.h hVar, int i11) {
        this.f106478a = pVar;
        this.f106479b = oVar;
        this.f106480c = hVar;
        this.f106481d = i11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super R> wVar) {
        p<T> pVar = this.f106478a;
        o<? super T, ? extends n<? extends R>> oVar = this.f106479b;
        if (h.b(pVar, oVar, wVar)) {
            return;
        }
        pVar.subscribe(new a(wVar, oVar, this.f106481d, this.f106480c));
    }
}
