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
public final class f<T, R> extends p<R> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f106522a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends n<? extends R>> f106523b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f106524c;

    static final class a<T, R> extends AtomicInteger implements w<T>, InterfaceC8487b {

        /* renamed from: i, reason: collision with root package name */
        static final C2302a<Object> f106525i = new C2302a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f106526a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends n<? extends R>> f106527b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f106528c;

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f106529d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C2302a<R>> f106530e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f106531f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f106532g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f106533h;

        /* renamed from: yc.f$a$a, reason: collision with other inner class name */
        static final class C2302a<R> extends AtomicReference<InterfaceC8487b> implements m<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f106534a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f106535b;

            C2302a(a<?, R> aVar) {
                this.f106534a = aVar;
            }

            @Override // io.reactivex.m
            public final void onComplete() {
                a<?, R> aVar = this.f106534a;
                AtomicReference<C2302a<R>> atomicReference = aVar.f106530e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.m
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f106534a;
                AtomicReference<C2302a<R>> atomicReference = aVar.f106530e;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        Gc.c cVar = aVar.f106529d;
                        cVar.getClass();
                        if (i.a(cVar, th2)) {
                            if (!aVar.f106528c) {
                                aVar.f106531f.dispose();
                                aVar.a();
                            }
                            aVar.b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                C3493a.f(th2);
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSuccess(R r11) {
                this.f106535b = r11;
                this.f106534a.b();
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends n<? extends R>> oVar, boolean z11) {
            this.f106526a = wVar;
            this.f106527b = oVar;
            this.f106528c = z11;
        }

        final void a() {
            AtomicReference<C2302a<R>> atomicReference = this.f106530e;
            C2302a<Object> c2302a = f106525i;
            C2302a<Object> c2302a2 = (C2302a) atomicReference.getAndSet(c2302a);
            if (c2302a2 == null || c2302a2 == c2302a) {
                return;
            }
            rc.d.a(c2302a2);
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            w<? super R> wVar = this.f106526a;
            Gc.c cVar = this.f106529d;
            AtomicReference<C2302a<R>> atomicReference = this.f106530e;
            int i11 = 1;
            while (!this.f106533h) {
                if (cVar.get() != null && !this.f106528c) {
                    wVar.onError(i.b(cVar));
                    return;
                }
                boolean z11 = this.f106532g;
                C2302a<R> c2302a = atomicReference.get();
                boolean z12 = c2302a == null;
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
                if (z12 || c2302a.f106535b == null) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c2302a, null) && atomicReference.get() == c2302a) {
                    }
                    wVar.onNext(c2302a.f106535b);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f106533h = true;
            this.f106531f.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f106533h;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f106532g = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f106529d;
            cVar.getClass();
            if (!i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (!this.f106528c) {
                a();
            }
            this.f106532g = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            C2302a<Object> c2302a = f106525i;
            AtomicReference<C2302a<R>> atomicReference = this.f106530e;
            C2302a c2302a2 = (C2302a) atomicReference.get();
            if (c2302a2 != null) {
                rc.d.a(c2302a2);
            }
            try {
                n<? extends R> apply = this.f106527b.apply(t2);
                C9656b.c(apply, "The mapper returned a null MaybeSource");
                n<? extends R> nVar = apply;
                C2302a c2302a3 = new C2302a(this);
                while (true) {
                    C2302a<Object> c2302a4 = (C2302a) atomicReference.get();
                    if (c2302a4 == c2302a) {
                        return;
                    }
                    while (!atomicReference.compareAndSet(c2302a4, c2302a3)) {
                        if (atomicReference.get() != c2302a4) {
                            break;
                        }
                    }
                    nVar.a(c2302a3);
                    return;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f106531f.dispose();
                atomicReference.getAndSet(c2302a);
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f106531f, interfaceC8487b)) {
                this.f106531f = interfaceC8487b;
                this.f106526a.onSubscribe(this);
            }
        }
    }

    public f(p<T> pVar, o<? super T, ? extends n<? extends R>> oVar, boolean z11) {
        this.f106522a = pVar;
        this.f106523b = oVar;
        this.f106524c = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(w<? super R> wVar) {
        p<T> pVar = this.f106522a;
        o<? super T, ? extends n<? extends R>> oVar = this.f106523b;
        if (h.b(pVar, oVar, wVar)) {
            return;
        }
        pVar.subscribe(new a(wVar, oVar, this.f106524c));
    }
}
