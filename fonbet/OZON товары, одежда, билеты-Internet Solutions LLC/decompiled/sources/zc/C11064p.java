package zc;

import Bl0.C2645f;
import Cc.C2738a;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11064p<T, U extends Collection<? super T>> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final long f108487b;

    /* renamed from: c, reason: collision with root package name */
    final long f108488c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f108489d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.x f108490e;

    /* renamed from: f, reason: collision with root package name */
    final Callable<U> f108491f;

    /* renamed from: g, reason: collision with root package name */
    final int f108492g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f108493h;

    /* renamed from: zc.p$a */
    static final class a<T, U extends Collection<? super T>> extends uc.s<T, U, U> implements Runnable, InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f108494g;

        /* renamed from: h, reason: collision with root package name */
        final long f108495h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f108496i;

        /* renamed from: j, reason: collision with root package name */
        final int f108497j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f108498k;

        /* renamed from: l, reason: collision with root package name */
        final x.c f108499l;

        /* renamed from: m, reason: collision with root package name */
        U f108500m;

        /* renamed from: n, reason: collision with root package name */
        InterfaceC8487b f108501n;

        /* renamed from: o, reason: collision with root package name */
        InterfaceC8487b f108502o;

        /* renamed from: p, reason: collision with root package name */
        long f108503p;

        /* renamed from: q, reason: collision with root package name */
        long f108504q;

        a(Ic.e eVar, Callable callable, long j11, TimeUnit timeUnit, int i11, boolean z11, x.c cVar) {
            super(eVar, new C2738a());
            this.f108494g = callable;
            this.f108495h = j11;
            this.f108496i = timeUnit;
            this.f108497j = i11;
            this.f108498k = z11;
            this.f108499l = cVar;
        }

        @Override // uc.s
        public final void a(Ic.e eVar, Object obj) {
            eVar.onNext((Collection) obj);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f100598d) {
                return;
            }
            this.f100598d = true;
            this.f108502o.dispose();
            this.f108499l.dispose();
            synchronized (this) {
                this.f108500m = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            U u11;
            this.f108499l.dispose();
            synchronized (this) {
                u11 = this.f108500m;
                this.f108500m = null;
            }
            if (u11 != null) {
                this.f100597c.offer(u11);
                this.f100599e = true;
                if (d()) {
                    Bl0.D.b(this.f100597c, this.f100596b, this, this);
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f108500m = null;
            }
            this.f100596b.onError(th2);
            this.f108499l.dispose();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x0076
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.w
        public final void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.f108500m     // Catch: java.lang.Throwable -> L71
                if (r0 != 0) goto Lc
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L74
            Lc:
                r0.add(r8)     // Catch: java.lang.Throwable -> L71
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L71
                int r1 = r7.f108497j     // Catch: java.lang.Throwable -> L71
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.f108500m = r8     // Catch: java.lang.Throwable -> L71
                long r1 = r7.f108503p     // Catch: java.lang.Throwable -> L71
                r3 = 1
                long r1 = r1 + r3
                r7.f108503p = r1     // Catch: java.lang.Throwable -> L71
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
                boolean r8 = r7.f108498k
                if (r8 == 0) goto L2d
                nc.b r8 = r7.f108501n
                r8.dispose()
            L2d:
                r7.h(r0, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.f108494g     // Catch: java.lang.Throwable -> L62
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L62
                java.lang.String r0 = "The buffer supplied is null"
                sc.C9656b.c(r8, r0)     // Catch: java.lang.Throwable -> L62
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L62
                monitor-enter(r7)
                r7.f108500m = r8     // Catch: java.lang.Throwable -> L5b
                long r0 = r7.f108504q     // Catch: java.lang.Throwable -> L5b
                long r0 = r0 + r3
                r7.f108504q = r0     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
                boolean r8 = r7.f108498k
                if (r8 == 0) goto L59
                io.reactivex.x$c r0 = r7.f108499l
                long r2 = r7.f108495h
                java.util.concurrent.TimeUnit r6 = r7.f108496i
                r4 = r2
                r1 = r7
                nc.b r8 = r0.c(r1, r2, r4, r6)
                r1.f108501n = r8
                return
            L59:
                r1 = r7
                return
            L5b:
                r0 = move-exception
                r1 = r7
            L5d:
                r8 = r0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L60
                throw r8
            L60:
                r0 = move-exception
                goto L5d
            L62:
                r0 = move-exception
                r1 = r7
                r8 = r0
                Bl0.C2645f.c(r8)
                Ic.e r0 = r1.f100596b
                r0.onError(r8)
                r7.dispose()
                return
            L71:
                r0 = move-exception
                r1 = r7
            L73:
                r8 = r0
            L74:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
                throw r8
            L76:
                r0 = move-exception
                goto L73
            */
            throw new UnsupportedOperationException("Method not decompiled: zc.C11064p.a.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            Ic.e eVar = this.f100596b;
            if (rc.d.g(this.f108502o, interfaceC8487b)) {
                this.f108502o = interfaceC8487b;
                try {
                    U call = this.f108494g.call();
                    C9656b.c(call, "The buffer supplied is null");
                    this.f108500m = call;
                    eVar.onSubscribe(this);
                    TimeUnit timeUnit = this.f108496i;
                    x.c cVar = this.f108499l;
                    long j11 = this.f108495h;
                    this.f108501n = cVar.c(this, j11, j11, timeUnit);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    interfaceC8487b.dispose();
                    rc.e.d(th2, eVar);
                    this.f108499l.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U call = this.f108494g.call();
                C9656b.c(call, "The bufferSupplier returned a null buffer");
                U u11 = call;
                synchronized (this) {
                    U u12 = this.f108500m;
                    if (u12 != null && this.f108503p == this.f108504q) {
                        this.f108500m = u11;
                        h(u12, this);
                    }
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                dispose();
                this.f100596b.onError(th2);
            }
        }
    }

    /* renamed from: zc.p$b */
    static final class b<T, U extends Collection<? super T>> extends uc.s<T, U, U> implements Runnable, InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f108505g;

        /* renamed from: h, reason: collision with root package name */
        final long f108506h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f108507i;

        /* renamed from: j, reason: collision with root package name */
        final io.reactivex.x f108508j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC8487b f108509k;

        /* renamed from: l, reason: collision with root package name */
        U f108510l;

        /* renamed from: m, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108511m;

        b(Ic.e eVar, Callable callable, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            super(eVar, new C2738a());
            this.f108511m = new AtomicReference<>();
            this.f108505g = callable;
            this.f108506h = j11;
            this.f108507i = timeUnit;
            this.f108508j = xVar;
        }

        @Override // uc.s
        public final void a(Ic.e eVar, Object obj) {
            this.f100596b.onNext((Collection) obj);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108511m);
            this.f108509k.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108511m.get() == rc.d.DISPOSED;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            U u11;
            synchronized (this) {
                u11 = this.f108510l;
                this.f108510l = null;
            }
            if (u11 != null) {
                this.f100597c.offer(u11);
                this.f100599e = true;
                if (d()) {
                    Bl0.D.b(this.f100597c, this.f100596b, null, this);
                }
            }
            rc.d.a(this.f108511m);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f108510l = null;
            }
            this.f100596b.onError(th2);
            rc.d.a(this.f108511m);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            synchronized (this) {
                try {
                    U u11 = this.f108510l;
                    if (u11 == null) {
                        return;
                    }
                    u11.add(t2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108509k, interfaceC8487b)) {
                this.f108509k = interfaceC8487b;
                try {
                    U call = this.f108505g.call();
                    C9656b.c(call, "The buffer supplied is null");
                    this.f108510l = call;
                    this.f100596b.onSubscribe(this);
                    if (!this.f100598d) {
                        io.reactivex.x xVar = this.f108508j;
                        long j11 = this.f108506h;
                        InterfaceC8487b f7 = xVar.f(this, j11, j11, this.f108507i);
                        AtomicReference<InterfaceC8487b> atomicReference = this.f108511m;
                        while (!atomicReference.compareAndSet(null, f7)) {
                            if (atomicReference.get() != null) {
                                f7.dispose();
                                return;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    dispose();
                    rc.e.d(th2, this.f100596b);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u11;
            try {
                U call = this.f108505g.call();
                C9656b.c(call, "The bufferSupplier returned a null buffer");
                U u12 = call;
                synchronized (this) {
                    try {
                        u11 = this.f108510l;
                        if (u11 != null) {
                            this.f108510l = u12;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u11 == null) {
                    rc.d.a(this.f108511m);
                } else {
                    g(u11, this);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                this.f100596b.onError(th3);
                dispose();
            }
        }
    }

    /* renamed from: zc.p$c */
    static final class c<T, U extends Collection<? super T>> extends uc.s<T, U, U> implements Runnable, InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f108512g;

        /* renamed from: h, reason: collision with root package name */
        final long f108513h;

        /* renamed from: i, reason: collision with root package name */
        final long f108514i;

        /* renamed from: j, reason: collision with root package name */
        final TimeUnit f108515j;

        /* renamed from: k, reason: collision with root package name */
        final x.c f108516k;

        /* renamed from: l, reason: collision with root package name */
        final LinkedList f108517l;

        /* renamed from: m, reason: collision with root package name */
        InterfaceC8487b f108518m;

        /* renamed from: zc.p$c$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f108519a;

            a(U u11) {
                this.f108519a = u11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f108517l.remove(this.f108519a);
                }
                c cVar = c.this;
                cVar.h(this.f108519a, cVar.f108516k);
            }
        }

        /* renamed from: zc.p$c$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f108521a;

            b(U u11) {
                this.f108521a = u11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f108517l.remove(this.f108521a);
                }
                c cVar = c.this;
                cVar.h(this.f108521a, cVar.f108516k);
            }
        }

        c(Ic.e eVar, Callable callable, long j11, long j12, TimeUnit timeUnit, x.c cVar) {
            super(eVar, new C2738a());
            this.f108512g = callable;
            this.f108513h = j11;
            this.f108514i = j12;
            this.f108515j = timeUnit;
            this.f108516k = cVar;
            this.f108517l = new LinkedList();
        }

        @Override // uc.s
        public final void a(Ic.e eVar, Object obj) {
            eVar.onNext((Collection) obj);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f100598d) {
                return;
            }
            this.f100598d = true;
            synchronized (this) {
                this.f108517l.clear();
            }
            this.f108518m.dispose();
            this.f108516k.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f108517l);
                this.f108517l.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f100597c.offer((Collection) it.next());
            }
            this.f100599e = true;
            if (d()) {
                Bl0.D.b(this.f100597c, this.f100596b, this.f108516k, this);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f100599e = true;
            synchronized (this) {
                this.f108517l.clear();
            }
            this.f100596b.onError(th2);
            this.f108516k.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            synchronized (this) {
                try {
                    Iterator it = this.f108517l.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            x.c cVar = this.f108516k;
            Ic.e eVar = this.f100596b;
            if (rc.d.g(this.f108518m, interfaceC8487b)) {
                this.f108518m = interfaceC8487b;
                try {
                    U call = this.f108512g.call();
                    C9656b.c(call, "The buffer supplied is null");
                    U u11 = call;
                    this.f108517l.add(u11);
                    eVar.onSubscribe(this);
                    TimeUnit timeUnit = this.f108515j;
                    x.c cVar2 = this.f108516k;
                    long j11 = this.f108514i;
                    cVar2.c(this, j11, j11, timeUnit);
                    cVar.b(new b(u11), this.f108513h, this.f108515j);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    interfaceC8487b.dispose();
                    rc.e.d(th2, eVar);
                    cVar.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f100598d) {
                return;
            }
            try {
                U call = this.f108512g.call();
                C9656b.c(call, "The bufferSupplier returned a null buffer");
                U u11 = call;
                synchronized (this) {
                    try {
                        if (this.f100598d) {
                            return;
                        }
                        this.f108517l.add(u11);
                        this.f108516k.b(new a(u11), this.f108513h, this.f108515j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                this.f100596b.onError(th3);
                dispose();
            }
        }
    }

    public C11064p(io.reactivex.p pVar, long j11, long j12, TimeUnit timeUnit, io.reactivex.x xVar, Callable callable, int i11, boolean z11) {
        super(pVar);
        this.f108487b = j11;
        this.f108488c = j12;
        this.f108489d = timeUnit;
        this.f108490e = xVar;
        this.f108491f = callable;
        this.f108492g = i11;
        this.f108493h = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        long j11 = this.f108487b;
        long j12 = this.f108488c;
        io.reactivex.u<T> uVar = this.f108122a;
        if (j11 == j12 && this.f108492g == Integer.MAX_VALUE) {
            uVar.subscribe(new b(new Ic.e(wVar), this.f108491f, j11, this.f108489d, this.f108490e));
            return;
        }
        x.c b11 = this.f108490e.b();
        long j13 = this.f108487b;
        long j14 = this.f108488c;
        if (j13 == j14) {
            uVar.subscribe(new a(new Ic.e(wVar), this.f108491f, j13, this.f108489d, this.f108492g, this.f108493h, b11));
        } else {
            uVar.subscribe(new c(new Ic.e(wVar), this.f108491f, j13, j14, this.f108489d, b11));
        }
    }
}
