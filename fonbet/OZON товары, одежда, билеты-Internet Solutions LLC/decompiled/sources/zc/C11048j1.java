package zc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* renamed from: zc.j1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11048j1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108318b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108319c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f108320d;

    /* renamed from: e, reason: collision with root package name */
    final int f108321e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f108322f;

    /* renamed from: zc.j1$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108323a;

        /* renamed from: b, reason: collision with root package name */
        final long f108324b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f108325c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.x f108326d;

        /* renamed from: e, reason: collision with root package name */
        final Cc.c<Object> f108327e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f108328f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f108329g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108330h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108331i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f108332j;

        a(io.reactivex.w<? super T> wVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, int i11, boolean z11) {
            this.f108323a = wVar;
            this.f108324b = j11;
            this.f108325c = timeUnit;
            this.f108326d = xVar;
            this.f108327e = new Cc.c<>(i11);
            this.f108328f = z11;
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super T> wVar = this.f108323a;
            Cc.c<Object> cVar = this.f108327e;
            boolean z11 = this.f108328f;
            TimeUnit timeUnit = this.f108325c;
            io.reactivex.x xVar = this.f108326d;
            long j11 = this.f108324b;
            int i11 = 1;
            while (!this.f108330h) {
                boolean z12 = this.f108331i;
                Long l11 = (Long) cVar.c();
                boolean z13 = l11 == null;
                xVar.getClass();
                long c11 = io.reactivex.x.c(timeUnit);
                if (!z13 && l11.longValue() > c11 - j11) {
                    z13 = true;
                }
                if (z12) {
                    if (!z11) {
                        Throwable th2 = this.f108332j;
                        if (th2 != null) {
                            this.f108327e.clear();
                            wVar.onError(th2);
                            return;
                        } else if (z13) {
                            wVar.onComplete();
                            return;
                        }
                    } else if (z13) {
                        Throwable th3 = this.f108332j;
                        if (th3 != null) {
                            wVar.onError(th3);
                            return;
                        } else {
                            wVar.onComplete();
                            return;
                        }
                    }
                }
                if (z13) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    cVar.poll();
                    wVar.onNext(cVar.poll());
                }
            }
            this.f108327e.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108330h) {
                return;
            }
            this.f108330h = true;
            this.f108329g.dispose();
            if (getAndIncrement() == 0) {
                this.f108327e.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108330h;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108331i = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108332j = th2;
            this.f108331i = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108326d.getClass();
            this.f108327e.b(Long.valueOf(io.reactivex.x.c(this.f108325c)), t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108329g, interfaceC8487b)) {
                this.f108329g = interfaceC8487b;
                this.f108323a.onSubscribe(this);
            }
        }
    }

    public C11048j1(io.reactivex.p pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, int i11, boolean z11) {
        super(pVar);
        this.f108318b = j11;
        this.f108319c = timeUnit;
        this.f108320d = xVar;
        this.f108321e = i11;
        this.f108322f = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108318b, this.f108319c, this.f108320d, this.f108321e, this.f108322f));
    }
}
