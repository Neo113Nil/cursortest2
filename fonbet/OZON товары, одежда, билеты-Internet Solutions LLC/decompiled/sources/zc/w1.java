package zc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class w1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108716b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108717c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f108718d;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f108719a;

        /* renamed from: b, reason: collision with root package name */
        final long f108720b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f108721c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f108722d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f108723e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f108724f;

        /* renamed from: g, reason: collision with root package name */
        boolean f108725g;

        a(Ic.e eVar, long j11, TimeUnit timeUnit, x.c cVar) {
            this.f108719a = eVar;
            this.f108720b = j11;
            this.f108721c = timeUnit;
            this.f108722d = cVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108723e.dispose();
            this.f108722d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108722d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108725g) {
                return;
            }
            this.f108725g = true;
            this.f108719a.onComplete();
            this.f108722d.dispose();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108725g) {
                C3493a.f(th2);
                return;
            }
            this.f108725g = true;
            this.f108719a.onError(th2);
            this.f108722d.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108724f || this.f108725g) {
                return;
            }
            this.f108724f = true;
            this.f108719a.onNext(t2);
            InterfaceC8487b interfaceC8487b = get();
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            rc.d.d(this, this.f108722d.b(this, this.f108720b, this.f108721c));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108723e, interfaceC8487b)) {
                this.f108723e = interfaceC8487b;
                this.f108719a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f108724f = false;
        }
    }

    public w1(io.reactivex.p pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
        super(pVar);
        this.f108716b = j11;
        this.f108717c = timeUnit;
        this.f108718d = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(new Ic.e(wVar), this.f108716b, this.f108717c, this.f108718d.b()));
    }
}
