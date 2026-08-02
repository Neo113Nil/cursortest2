package zc;

import Cc.C2738a;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class H1<T, B> extends AbstractC11019a<T, io.reactivex.p<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<B> f107711b;

    /* renamed from: c, reason: collision with root package name */
    final int f107712c;

    static final class a<T, B> extends Ic.c<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f107713b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107714c;

        a(b<T, B> bVar) {
            this.f107713b = bVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107714c) {
                return;
            }
            this.f107714c = true;
            b<T, B> bVar = this.f107713b;
            rc.d.a(bVar.f107719d);
            bVar.f107724i = true;
            bVar.a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107714c) {
                C3493a.f(th2);
                return;
            }
            this.f107714c = true;
            b<T, B> bVar = this.f107713b;
            rc.d.a(bVar.f107719d);
            Gc.c cVar = bVar.f107722g;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                bVar.f107724i = true;
                bVar.a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(B b11) {
            if (this.f107714c) {
                return;
            }
            this.f107713b.b();
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: k, reason: collision with root package name */
        static final Object f107715k = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.p<T>> f107716a;

        /* renamed from: b, reason: collision with root package name */
        final int f107717b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, B> f107718c = new a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107719d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f107720e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        final C2738a<Object> f107721f = new C2738a<>();

        /* renamed from: g, reason: collision with root package name */
        final Gc.c f107722g = new Gc.c();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f107723h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f107724i;

        /* renamed from: j, reason: collision with root package name */
        Nc.f<T> f107725j;

        b(io.reactivex.w<? super io.reactivex.p<T>> wVar, int i11) {
            this.f107716a = wVar;
            this.f107717b = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super io.reactivex.p<T>> wVar = this.f107716a;
            C2738a<Object> c2738a = this.f107721f;
            Gc.c cVar = this.f107722g;
            int i11 = 1;
            while (this.f107720e.get() != 0) {
                Nc.f<T> fVar = this.f107725j;
                boolean z11 = this.f107724i;
                if (z11 && cVar.get() != null) {
                    c2738a.clear();
                    Throwable b11 = Gc.i.b(cVar);
                    if (fVar != 0) {
                        this.f107725j = null;
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
                            this.f107725j = null;
                            fVar.onComplete();
                        }
                        wVar.onComplete();
                        return;
                    }
                    if (fVar != 0) {
                        this.f107725j = null;
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
                } else if (poll != f107715k) {
                    fVar.onNext(poll);
                } else {
                    if (fVar != 0) {
                        this.f107725j = null;
                        fVar.onComplete();
                    }
                    if (!this.f107723h.get()) {
                        Nc.f<T> f7 = Nc.f.f(this, this.f107717b);
                        this.f107725j = f7;
                        this.f107720e.getAndIncrement();
                        wVar.onNext(f7);
                    }
                }
            }
            c2738a.clear();
            this.f107725j = null;
        }

        final void b() {
            this.f107721f.offer(f107715k);
            a();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107723h.compareAndSet(false, true)) {
                this.f107718c.dispose();
                if (this.f107720e.decrementAndGet() == 0) {
                    rc.d.a(this.f107719d);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107723h.get();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107718c.dispose();
            this.f107724i = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107718c.dispose();
            Gc.c cVar = this.f107722g;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f107724i = true;
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107721f.offer(t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this.f107719d, interfaceC8487b)) {
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107720e.decrementAndGet() == 0) {
                rc.d.a(this.f107719d);
            }
        }
    }

    public H1(io.reactivex.p pVar, io.reactivex.u uVar, int i11) {
        super(pVar);
        this.f107711b = uVar;
        this.f107712c = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.p<T>> wVar) {
        b bVar = new b(wVar, this.f107712c);
        wVar.onSubscribe(bVar);
        this.f107711b.subscribe(bVar.f107718c);
        this.f108122a.subscribe(bVar);
    }
}
