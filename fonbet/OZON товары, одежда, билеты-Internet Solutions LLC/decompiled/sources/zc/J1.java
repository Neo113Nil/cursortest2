package zc;

import Bl0.C2645f;
import Cc.C2738a;
import Kc.C3493a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class J1<T, B> extends AbstractC11019a<T, io.reactivex.p<T>> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.u<B>> f107755b;

    /* renamed from: c, reason: collision with root package name */
    final int f107756c;

    static final class a<T, B> extends Ic.c<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f107757b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107758c;

        a(b<T, B> bVar) {
            this.f107757b = bVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107758c) {
                return;
            }
            this.f107758c = true;
            b<T, B> bVar = this.f107757b;
            bVar.f107769i.dispose();
            bVar.f107770j = true;
            bVar.b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107758c) {
                C3493a.f(th2);
                return;
            }
            this.f107758c = true;
            b<T, B> bVar = this.f107757b;
            bVar.f107769i.dispose();
            Gc.c cVar = bVar.f107766f;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                bVar.f107770j = true;
                bVar.b();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(B b11) {
            if (this.f107758c) {
                return;
            }
            this.f107758c = true;
            dispose();
            b<T, B> bVar = this.f107757b;
            AtomicReference<a<T, B>> atomicReference = bVar.f107763c;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            bVar.f107765e.offer(b.f107760m);
            bVar.b();
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: l, reason: collision with root package name */
        static final a<Object, Object> f107759l = new a<>(null);

        /* renamed from: m, reason: collision with root package name */
        static final Object f107760m = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.p<T>> f107761a;

        /* renamed from: b, reason: collision with root package name */
        final int f107762b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<a<T, B>> f107763c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f107764d = new AtomicInteger(1);

        /* renamed from: e, reason: collision with root package name */
        final C2738a<Object> f107765e = new C2738a<>();

        /* renamed from: f, reason: collision with root package name */
        final Gc.c f107766f = new Gc.c();

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f107767g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.u<B>> f107768h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC8487b f107769i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f107770j;

        /* renamed from: k, reason: collision with root package name */
        Nc.f<T> f107771k;

        b(io.reactivex.w<? super io.reactivex.p<T>> wVar, int i11, Callable<? extends io.reactivex.u<B>> callable) {
            this.f107761a = wVar;
            this.f107762b = i11;
            this.f107768h = callable;
        }

        final void a() {
            AtomicReference<a<T, B>> atomicReference = this.f107763c;
            a<Object, Object> aVar = f107759l;
            InterfaceC8487b interfaceC8487b = (InterfaceC8487b) atomicReference.getAndSet(aVar);
            if (interfaceC8487b == null || interfaceC8487b == aVar) {
                return;
            }
            interfaceC8487b.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super io.reactivex.p<T>> wVar = this.f107761a;
            C2738a<Object> c2738a = this.f107765e;
            Gc.c cVar = this.f107766f;
            int i11 = 1;
            while (this.f107764d.get() != 0) {
                Nc.f<T> fVar = this.f107771k;
                boolean z11 = this.f107770j;
                if (z11 && cVar.get() != null) {
                    c2738a.clear();
                    Throwable b11 = Gc.i.b(cVar);
                    if (fVar != 0) {
                        this.f107771k = null;
                        fVar.onError(b11);
                    }
                    wVar.onError(b11);
                    return;
                }
                Object poll = c2738a.poll();
                boolean z12 = poll == null;
                if (z11 && z12) {
                    cVar.getClass();
                    Throwable b12 = Gc.i.b(cVar);
                    if (b12 == null) {
                        if (fVar != 0) {
                            this.f107771k = null;
                            fVar.onComplete();
                        }
                        wVar.onComplete();
                        return;
                    }
                    if (fVar != 0) {
                        this.f107771k = null;
                        fVar.onError(b12);
                    }
                    wVar.onError(b12);
                    return;
                }
                if (z12) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else if (poll != f107760m) {
                    fVar.onNext(poll);
                } else {
                    if (fVar != 0) {
                        this.f107771k = null;
                        fVar.onComplete();
                    }
                    if (!this.f107767g.get()) {
                        Nc.f<T> f7 = Nc.f.f(this, this.f107762b);
                        this.f107771k = f7;
                        this.f107764d.getAndIncrement();
                        try {
                            io.reactivex.u<B> call = this.f107768h.call();
                            C9656b.c(call, "The other Callable returned a null ObservableSource");
                            io.reactivex.u<B> uVar = call;
                            a<T, B> aVar = new a<>(this);
                            AtomicReference<a<T, B>> atomicReference = this.f107763c;
                            while (true) {
                                if (atomicReference.compareAndSet(null, aVar)) {
                                    uVar.subscribe(aVar);
                                    wVar.onNext(f7);
                                    break;
                                } else if (atomicReference.get() != null) {
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            cVar.getClass();
                            Gc.i.a(cVar, th2);
                            this.f107770j = true;
                        }
                    }
                }
            }
            c2738a.clear();
            this.f107771k = null;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107767g.compareAndSet(false, true)) {
                a();
                if (this.f107764d.decrementAndGet() == 0) {
                    this.f107769i.dispose();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107767g.get();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            a();
            this.f107770j = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            a();
            Gc.c cVar = this.f107766f;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f107770j = true;
                b();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107765e.offer(t2);
            b();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107769i, interfaceC8487b)) {
                this.f107769i = interfaceC8487b;
                this.f107761a.onSubscribe(this);
                this.f107765e.offer(f107760m);
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107764d.decrementAndGet() == 0) {
                this.f107769i.dispose();
            }
        }
    }

    public J1(io.reactivex.p pVar, Callable callable, int i11) {
        super(pVar);
        this.f107755b = callable;
        this.f107756c = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.p<T>> wVar) {
        this.f108122a.subscribe(new b(wVar, this.f107756c, this.f107755b));
    }
}
