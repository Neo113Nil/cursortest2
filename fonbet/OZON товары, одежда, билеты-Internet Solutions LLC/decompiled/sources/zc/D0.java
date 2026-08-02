package zc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.x;
import nc.InterfaceC8487b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;
import uc.AbstractC10018b;

/* loaded from: classes.dex */
public final class D0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f107598b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f107599c;

    /* renamed from: d, reason: collision with root package name */
    final int f107600d;

    static final class a<T> extends AbstractC10018b<T> implements io.reactivex.w<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107601a;

        /* renamed from: b, reason: collision with root package name */
        final x.c f107602b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f107603c;

        /* renamed from: d, reason: collision with root package name */
        final int f107604d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC9808j<T> f107605e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f107606f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f107607g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f107608h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f107609i;

        /* renamed from: j, reason: collision with root package name */
        int f107610j;

        /* renamed from: k, reason: collision with root package name */
        boolean f107611k;

        a(io.reactivex.w<? super T> wVar, x.c cVar, boolean z11, int i11) {
            this.f107601a = wVar;
            this.f107602b = cVar;
            this.f107603c = z11;
            this.f107604d = i11;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f107611k = true;
            return 2;
        }

        final boolean b(boolean z11, boolean z12, io.reactivex.w<? super T> wVar) {
            if (this.f107609i) {
                this.f107605e.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f107607g;
            if (this.f107603c) {
                if (!z12) {
                    return false;
                }
                this.f107609i = true;
                if (th2 != null) {
                    wVar.onError(th2);
                } else {
                    wVar.onComplete();
                }
                this.f107602b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f107609i = true;
                this.f107605e.clear();
                wVar.onError(th2);
                this.f107602b.dispose();
                return true;
            }
            if (!z12) {
                return false;
            }
            this.f107609i = true;
            wVar.onComplete();
            this.f107602b.dispose();
            return true;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f107605e.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107609i) {
                return;
            }
            this.f107609i = true;
            this.f107606f.dispose();
            this.f107602b.dispose();
            if (getAndIncrement() == 0) {
                this.f107605e.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107609i;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f107605e.isEmpty();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107608h) {
                return;
            }
            this.f107608h = true;
            if (getAndIncrement() == 0) {
                this.f107602b.a(this);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107608h) {
                C3493a.f(th2);
                return;
            }
            this.f107607g = th2;
            this.f107608h = true;
            if (getAndIncrement() == 0) {
                this.f107602b.a(this);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107608h) {
                return;
            }
            if (this.f107610j != 2) {
                this.f107605e.offer(t2);
            }
            if (getAndIncrement() == 0) {
                this.f107602b.a(this);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107606f, interfaceC8487b)) {
                this.f107606f = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(7);
                    if (a11 == 1) {
                        this.f107610j = a11;
                        this.f107605e = interfaceC9803e;
                        this.f107608h = true;
                        this.f107601a.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.f107602b.a(this);
                            return;
                        }
                        return;
                    }
                    if (a11 == 2) {
                        this.f107610j = a11;
                        this.f107605e = interfaceC9803e;
                        this.f107601a.onSubscribe(this);
                        return;
                    }
                }
                this.f107605e = new Cc.c(this.f107604d);
                this.f107601a.onSubscribe(this);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            return this.f107605e.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        
            if (r3 != 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            if (!this.f107611k) {
                InterfaceC9808j<T> interfaceC9808j = this.f107605e;
                io.reactivex.w<? super T> wVar = this.f107601a;
                int i11 = 1;
                while (!b(this.f107608h, interfaceC9808j.isEmpty(), wVar)) {
                    while (true) {
                        boolean z11 = this.f107608h;
                        try {
                            T poll = interfaceC9808j.poll();
                            boolean z12 = poll == null;
                            if (b(z11, z12, wVar)) {
                                return;
                            }
                            if (z12) {
                                break;
                            } else {
                                wVar.onNext(poll);
                            }
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            this.f107609i = true;
                            this.f107606f.dispose();
                            interfaceC9808j.clear();
                            wVar.onError(th2);
                            this.f107602b.dispose();
                            return;
                        }
                    }
                }
                return;
            }
            int i12 = 1;
            while (!this.f107609i) {
                boolean z13 = this.f107608h;
                Throwable th3 = this.f107607g;
                if (!this.f107603c && z13 && th3 != null) {
                    this.f107609i = true;
                    this.f107601a.onError(this.f107607g);
                    this.f107602b.dispose();
                    return;
                }
                this.f107601a.onNext(null);
                if (z13) {
                    this.f107609i = true;
                    Throwable th4 = this.f107607g;
                    if (th4 != null) {
                        this.f107601a.onError(th4);
                    } else {
                        this.f107601a.onComplete();
                    }
                    this.f107602b.dispose();
                    return;
                }
                i12 = addAndGet(-i12);
                if (i12 == 0) {
                    return;
                }
            }
        }
    }

    public D0(io.reactivex.p pVar, io.reactivex.x xVar, boolean z11, int i11) {
        super(pVar);
        this.f107598b = xVar;
        this.f107599c = z11;
        this.f107600d = i11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        io.reactivex.x xVar = this.f107598b;
        boolean z11 = xVar instanceof Dc.p;
        io.reactivex.u<T> uVar = this.f108122a;
        if (z11) {
            uVar.subscribe(wVar);
        } else {
            uVar.subscribe(new a(wVar, xVar.b(), this.f107599c, this.f107600d));
        }
    }
}
