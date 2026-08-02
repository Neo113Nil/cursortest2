package zc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class s1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108603b;

    /* renamed from: c, reason: collision with root package name */
    final long f108604c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f108605d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.x f108606e;

    /* renamed from: f, reason: collision with root package name */
    final int f108607f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f108608g;

    static final class a<T> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108609a;

        /* renamed from: b, reason: collision with root package name */
        final long f108610b;

        /* renamed from: c, reason: collision with root package name */
        final long f108611c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f108612d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.x f108613e;

        /* renamed from: f, reason: collision with root package name */
        final Cc.c<Object> f108614f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f108615g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC8487b f108616h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108617i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f108618j;

        a(io.reactivex.w<? super T> wVar, long j11, long j12, TimeUnit timeUnit, io.reactivex.x xVar, int i11, boolean z11) {
            this.f108609a = wVar;
            this.f108610b = j11;
            this.f108611c = j12;
            this.f108612d = timeUnit;
            this.f108613e = xVar;
            this.f108614f = new Cc.c<>(i11);
            this.f108615g = z11;
        }

        final void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                io.reactivex.w<? super T> wVar = this.f108609a;
                Cc.c<Object> cVar = this.f108614f;
                boolean z11 = this.f108615g;
                while (!this.f108617i) {
                    if (!z11 && (th2 = this.f108618j) != null) {
                        cVar.clear();
                        wVar.onError(th2);
                        return;
                    }
                    Object poll = cVar.poll();
                    if (poll == null) {
                        Throwable th3 = this.f108618j;
                        if (th3 != null) {
                            wVar.onError(th3);
                            return;
                        } else {
                            wVar.onComplete();
                            return;
                        }
                    }
                    Object poll2 = cVar.poll();
                    long longValue = ((Long) poll).longValue();
                    io.reactivex.x xVar = this.f108613e;
                    TimeUnit timeUnit = this.f108612d;
                    xVar.getClass();
                    if (longValue >= io.reactivex.x.c(timeUnit) - this.f108611c) {
                        wVar.onNext(poll2);
                    }
                }
                cVar.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108617i) {
                return;
            }
            this.f108617i = true;
            this.f108616h.dispose();
            if (compareAndSet(false, true)) {
                this.f108614f.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108617i;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108618j = th2;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108613e.getClass();
            long c11 = io.reactivex.x.c(this.f108612d);
            long j11 = this.f108610b;
            boolean z11 = j11 == Long.MAX_VALUE;
            Long valueOf = Long.valueOf(c11);
            Cc.c<Object> cVar = this.f108614f;
            cVar.b(valueOf, t2);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.c()).longValue() > c11 - this.f108611c && (z11 || (cVar.d() >> 1) <= j11)) {
                    return;
                }
                cVar.poll();
                cVar.poll();
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108616h, interfaceC8487b)) {
                this.f108616h = interfaceC8487b;
                this.f108609a.onSubscribe(this);
            }
        }
    }

    public s1(io.reactivex.p pVar, long j11, long j12, TimeUnit timeUnit, io.reactivex.x xVar, int i11, boolean z11) {
        super(pVar);
        this.f108603b = j11;
        this.f108604c = j12;
        this.f108605d = timeUnit;
        this.f108606e = xVar;
        this.f108607f = i11;
        this.f108608g = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108603b, this.f108604c, this.f108605d, this.f108606e, this.f108607f, this.f108608g));
    }
}
