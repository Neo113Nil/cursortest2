package yc;

import Bl0.C2645f;
import Gc.i;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.o;
import sc.C9656b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;

/* renamed from: yc.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10881b<T> extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106462a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.f> f106463b;

    /* renamed from: c, reason: collision with root package name */
    final Gc.h f106464c;

    /* renamed from: d, reason: collision with root package name */
    final int f106465d;

    /* renamed from: yc.b$a */
    static final class a<T> extends AtomicInteger implements w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f106466a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.f> f106467b;

        /* renamed from: c, reason: collision with root package name */
        final Gc.h f106468c;

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f106469d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final C2298a f106470e = new C2298a(this);

        /* renamed from: f, reason: collision with root package name */
        final int f106471f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC9808j<T> f106472g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC8487b f106473h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f106474i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f106475j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f106476k;

        /* renamed from: yc.b$a$a, reason: collision with other inner class name */
        static final class C2298a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f106477a;

            C2298a(a<?> aVar) {
                this.f106477a = aVar;
            }

            @Override // io.reactivex.d
            public final void onComplete() {
                a<?> aVar = this.f106477a;
                aVar.f106474i = false;
                aVar.a();
            }

            @Override // io.reactivex.d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f106477a;
                Gc.c cVar = aVar.f106469d;
                cVar.getClass();
                if (!i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                if (aVar.f106468c != Gc.h.IMMEDIATE) {
                    aVar.f106474i = false;
                    aVar.a();
                    return;
                }
                aVar.f106476k = true;
                aVar.f106473h.dispose();
                Gc.c cVar2 = aVar.f106469d;
                cVar2.getClass();
                Throwable b11 = i.b(cVar2);
                if (b11 != i.f9907a) {
                    aVar.f106466a.onError(b11);
                }
                if (aVar.getAndIncrement() == 0) {
                    aVar.f106472g.clear();
                }
            }

            @Override // io.reactivex.d
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this, interfaceC8487b);
            }
        }

        a(io.reactivex.d dVar, o<? super T, ? extends io.reactivex.f> oVar, Gc.h hVar, int i11) {
            this.f106466a = dVar;
            this.f106467b = oVar;
            this.f106468c = hVar;
            this.f106471f = i11;
        }

        final void a() {
            io.reactivex.f fVar;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            Gc.c cVar = this.f106469d;
            Gc.h hVar = this.f106468c;
            while (!this.f106476k) {
                if (!this.f106474i) {
                    if (hVar == Gc.h.BOUNDARY && cVar.get() != null) {
                        this.f106476k = true;
                        this.f106472g.clear();
                        this.f106466a.onError(i.b(cVar));
                        return;
                    }
                    boolean z12 = this.f106475j;
                    try {
                        T poll = this.f106472g.poll();
                        if (poll != null) {
                            io.reactivex.f apply = this.f106467b.apply(poll);
                            C9656b.c(apply, "The mapper returned a null CompletableSource");
                            fVar = apply;
                            z11 = false;
                        } else {
                            fVar = null;
                            z11 = true;
                        }
                        if (z12 && z11) {
                            this.f106476k = true;
                            cVar.getClass();
                            Throwable b11 = i.b(cVar);
                            if (b11 != null) {
                                this.f106466a.onError(b11);
                                return;
                            } else {
                                this.f106466a.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            this.f106474i = true;
                            fVar.a(this.f106470e);
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f106476k = true;
                        this.f106472g.clear();
                        this.f106473h.dispose();
                        cVar.getClass();
                        i.a(cVar, th2);
                        this.f106466a.onError(i.b(cVar));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f106472g.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106476k = true;
            this.f106473h.dispose();
            C2298a c2298a = this.f106470e;
            c2298a.getClass();
            rc.d.a(c2298a);
            if (getAndIncrement() == 0) {
                this.f106472g.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106476k;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106475j = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106469d;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (this.f106468c != Gc.h.IMMEDIATE) {
                this.f106475j = true;
                a();
                return;
            }
            this.f106476k = true;
            C2298a c2298a = this.f106470e;
            c2298a.getClass();
            rc.d.a(c2298a);
            Gc.c cVar2 = this.f106469d;
            cVar2.getClass();
            Throwable b11 = i.b(cVar2);
            if (b11 != i.f9907a) {
                this.f106466a.onError(b11);
            }
            if (getAndIncrement() == 0) {
                this.f106472g.clear();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (t2 != null) {
                this.f106472g.offer(t2);
            }
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106473h, interfaceC8487b)) {
                this.f106473h = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(3);
                    if (a11 == 1) {
                        this.f106472g = interfaceC9803e;
                        this.f106475j = true;
                        this.f106466a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (a11 == 2) {
                        this.f106472g = interfaceC9803e;
                        this.f106466a.onSubscribe(this);
                        return;
                    }
                }
                this.f106472g = new Cc.c(this.f106471f);
                this.f106466a.onSubscribe(this);
            }
        }
    }

    public C10881b(p<T> pVar, o<? super T, ? extends io.reactivex.f> oVar, Gc.h hVar, int i11) {
        this.f106462a = pVar;
        this.f106463b = oVar;
        this.f106464c = hVar;
        this.f106465d = i11;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        p<T> pVar = this.f106462a;
        o<? super T, ? extends io.reactivex.f> oVar = this.f106463b;
        if (h.a(pVar, oVar, dVar)) {
            return;
        }
        pVar.subscribe(new a(dVar, oVar, this.f106464c, this.f106465d));
    }
}
