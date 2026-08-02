package yc;

import Bl0.C2645f;
import Gc.i;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import qc.o;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class e<T> extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106510a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.f> f106511b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f106512c;

    static final class a<T> implements w<T>, InterfaceC8487b {

        /* renamed from: h, reason: collision with root package name */
        static final C2301a f106513h = new C2301a(null);

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f106514a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.f> f106515b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f106516c;

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f106517d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C2301a> f106518e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f106519f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f106520g;

        /* renamed from: yc.e$a$a, reason: collision with other inner class name */
        static final class C2301a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f106521a;

            C2301a(a<?> aVar) {
                this.f106521a = aVar;
            }

            @Override // io.reactivex.d
            public final void onComplete() {
                a<?> aVar = this.f106521a;
                AtomicReference<C2301a> atomicReference = aVar.f106518e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f106519f) {
                    Gc.c cVar = aVar.f106517d;
                    cVar.getClass();
                    Throwable b11 = i.b(cVar);
                    if (b11 == null) {
                        aVar.f106514a.onComplete();
                    } else {
                        aVar.f106514a.onError(b11);
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
            
                Kc.C3493a.f(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
            
                return;
             */
            @Override // io.reactivex.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onError(Throwable th2) {
                a<?> aVar = this.f106521a;
                AtomicReference<C2301a> atomicReference = aVar.f106518e;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        Gc.c cVar = aVar.f106517d;
                        cVar.getClass();
                        if (i.a(cVar, th2)) {
                            if (aVar.f106516c) {
                                if (aVar.f106519f) {
                                    Gc.c cVar2 = aVar.f106517d;
                                    cVar2.getClass();
                                    aVar.f106514a.onError(i.b(cVar2));
                                    return;
                                }
                                return;
                            }
                            aVar.dispose();
                            Gc.c cVar3 = aVar.f106517d;
                            cVar3.getClass();
                            Throwable b11 = i.b(cVar3);
                            if (b11 != i.f9907a) {
                                aVar.f106514a.onError(b11);
                                return;
                            }
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
            }

            @Override // io.reactivex.d
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.d dVar, o<? super T, ? extends io.reactivex.f> oVar, boolean z11) {
            this.f106514a = dVar;
            this.f106515b = oVar;
            this.f106516c = z11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106520g.dispose();
            AtomicReference<C2301a> atomicReference = this.f106518e;
            C2301a c2301a = f106513h;
            C2301a andSet = atomicReference.getAndSet(c2301a);
            if (andSet == null || andSet == c2301a) {
                return;
            }
            rc.d.a(andSet);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106518e.get() == f106513h;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106519f = true;
            if (this.f106518e.get() == null) {
                Gc.c cVar = this.f106517d;
                cVar.getClass();
                Throwable b11 = i.b(cVar);
                if (b11 == null) {
                    this.f106514a.onComplete();
                } else {
                    this.f106514a.onError(b11);
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106517d;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (this.f106516c) {
                onComplete();
                return;
            }
            AtomicReference<C2301a> atomicReference = this.f106518e;
            C2301a c2301a = f106513h;
            C2301a andSet = atomicReference.getAndSet(c2301a);
            if (andSet != null && andSet != c2301a) {
                rc.d.a(andSet);
            }
            Throwable b11 = i.b(cVar);
            if (b11 != i.f9907a) {
                this.f106514a.onError(b11);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            try {
                io.reactivex.f apply = this.f106515b.apply(t2);
                C9656b.c(apply, "The mapper returned a null CompletableSource");
                io.reactivex.f fVar = apply;
                C2301a c2301a = new C2301a(this);
                while (true) {
                    AtomicReference<C2301a> atomicReference = this.f106518e;
                    C2301a c2301a2 = atomicReference.get();
                    if (c2301a2 == f106513h) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c2301a2, c2301a)) {
                        if (atomicReference.get() != c2301a2) {
                            break;
                        }
                    }
                    if (c2301a2 != null) {
                        rc.d.a(c2301a2);
                    }
                    fVar.a(c2301a);
                    return;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f106520g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106520g, interfaceC8487b)) {
                this.f106520g = interfaceC8487b;
                this.f106514a.onSubscribe(this);
            }
        }
    }

    public e(p<T> pVar, o<? super T, ? extends io.reactivex.f> oVar, boolean z11) {
        this.f106510a = pVar;
        this.f106511b = oVar;
        this.f106512c = z11;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        p<T> pVar = this.f106510a;
        o<? super T, ? extends io.reactivex.f> oVar = this.f106511b;
        if (h.a(pVar, oVar, dVar)) {
            return;
        }
        pVar.subscribe(new a(dVar, oVar, this.f106512c));
    }
}
