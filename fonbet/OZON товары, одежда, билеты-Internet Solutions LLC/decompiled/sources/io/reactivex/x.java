package io.reactivex;

import Bl0.C2645f;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    static final long f66524a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f66525a;

        /* renamed from: b, reason: collision with root package name */
        final c f66526b;

        /* renamed from: c, reason: collision with root package name */
        Thread f66527c;

        a(Runnable runnable, c cVar) {
            this.f66525a = runnable;
            this.f66526b = cVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            Thread thread = this.f66527c;
            Thread currentThread = Thread.currentThread();
            c cVar = this.f66526b;
            if (thread == currentThread && (cVar instanceof Dc.h)) {
                ((Dc.h) cVar).g();
            } else {
                cVar.dispose();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f66526b.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f66527c = Thread.currentThread();
            try {
                this.f66525a.run();
            } finally {
                dispose();
                this.f66527c = null;
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class b implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f66528a;

        /* renamed from: b, reason: collision with root package name */
        final c f66529b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f66530c;

        b(Runnable runnable, c cVar) {
            this.f66528a = runnable;
            this.f66529b = cVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f66530c = true;
            this.f66529b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f66530c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f66530c) {
                return;
            }
            try {
                this.f66528a.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f66529b.dispose();
                throw Gc.i.d(th2);
            }
        }
    }

    public static abstract class c implements InterfaceC8487b {

        /* loaded from: classes9.dex */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f66531a;

            /* renamed from: b, reason: collision with root package name */
            final rc.h f66532b;

            /* renamed from: c, reason: collision with root package name */
            final long f66533c;

            /* renamed from: d, reason: collision with root package name */
            long f66534d;

            /* renamed from: e, reason: collision with root package name */
            long f66535e;

            /* renamed from: f, reason: collision with root package name */
            long f66536f;

            a(long j11, Runnable runnable, long j12, rc.h hVar, long j13) {
                this.f66531a = runnable;
                this.f66532b = hVar;
                this.f66533c = j13;
                this.f66535e = j12;
                this.f66536f = j11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j11;
                this.f66531a.run();
                rc.h hVar = this.f66532b;
                if (hVar.isDisposed()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                c cVar = c.this;
                cVar.getClass();
                long convert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                long j12 = x.f66524a;
                long j13 = convert + j12;
                long j14 = this.f66535e;
                long j15 = this.f66533c;
                if (j13 < j14 || convert >= j14 + j15 + j12) {
                    j11 = convert + j15;
                    long j16 = this.f66534d + 1;
                    this.f66534d = j16;
                    this.f66536f = j11 - (j15 * j16);
                } else {
                    long j17 = this.f66536f;
                    long j18 = this.f66534d + 1;
                    this.f66534d = j18;
                    j11 = (j18 * j15) + j17;
                }
                this.f66535e = convert;
                rc.d.d(hVar, cVar.b(this, j11 - convert, timeUnit));
            }
        }

        public InterfaceC8487b a(Runnable runnable) {
            return b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract InterfaceC8487b b(Runnable runnable, long j11, TimeUnit timeUnit);

        public final InterfaceC8487b c(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            rc.h hVar = new rc.h();
            rc.h hVar2 = new rc.h(hVar);
            long nanos = timeUnit.toNanos(j12);
            long convert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            InterfaceC8487b b11 = b(new a(timeUnit.toNanos(j11) + convert, runnable, convert, hVar2, nanos), j11, timeUnit);
            if (b11 == rc.e.INSTANCE) {
                return b11;
            }
            rc.d.d(hVar, b11);
            return hVar2;
        }
    }

    public static long c(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public abstract c b();

    public InterfaceC8487b d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC8487b e(Runnable runnable, long j11, TimeUnit timeUnit) {
        c b11 = b();
        a aVar = new a(runnable, b11);
        b11.b(aVar, j11, timeUnit);
        return aVar;
    }

    public InterfaceC8487b f(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        c b11 = b();
        b bVar = new b(runnable, b11);
        InterfaceC8487b c11 = b11.c(bVar, j11, j12, timeUnit);
        return c11 == rc.e.INSTANCE ? c11 : bVar;
    }
}
