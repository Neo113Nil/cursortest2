package io.sentry.android.core;

import io.sentry.AbstractC4779m;
import io.sentry.AbstractC4856v2;
import io.sentry.C4771k1;
import io.sentry.C4781m1;
import io.sentry.C4867x3;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4780m0;
import io.sentry.InterfaceC4790o0;
import io.sentry.android.core.internal.util.E;
import io.sentry.util.C4843a;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class r1 implements io.sentry.Z, E.c {

    /* renamed from: h, reason: collision with root package name */
    public static final long f51280h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i, reason: collision with root package name */
    public static final C4867x3 f51281i = new C4867x3(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51282a;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.E f51284c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f51285d;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f51283b = new C4843a();

    /* renamed from: e, reason: collision with root package name */
    public final SortedSet f51286e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.q1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r1.f((InterfaceC4780m0) obj, (InterfaceC4780m0) obj2);
        }
    });

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f51287f = new ConcurrentSkipListSet();

    /* renamed from: g, reason: collision with root package name */
    public long f51288g = 16666666;

    public static class a implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final long f51289a;

        /* renamed from: b, reason: collision with root package name */
        public final long f51290b;

        /* renamed from: c, reason: collision with root package name */
        public final long f51291c;

        /* renamed from: d, reason: collision with root package name */
        public final long f51292d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f51293e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f51294f;

        /* renamed from: g, reason: collision with root package name */
        public final long f51295g;

        public a(long j10) {
            this(j10, j10, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f51290b, aVar.f51290b);
        }

        public a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, long j14) {
            this.f51289a = j10;
            this.f51290b = j11;
            this.f51291c = j12;
            this.f51292d = j13;
            this.f51293e = z10;
            this.f51294f = z11;
            this.f51295g = j14;
        }
    }

    public r1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.E e10) {
        this.f51284c = e10;
        this.f51282a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(InterfaceC4780m0 interfaceC4780m0, InterfaceC4780m0 interfaceC4780m02) {
        if (interfaceC4780m0 == interfaceC4780m02) {
            return 0;
        }
        int compareTo = interfaceC4780m0.u().compareTo(interfaceC4780m02.u());
        return compareTo != 0 ? compareTo : interfaceC4780m0.a().n().toString().compareTo(interfaceC4780m02.a().n().toString());
    }

    public static int g(d1 d1Var, long j10, long j11, long j12) {
        long max = Math.max(0L, j11 - j12);
        if (!io.sentry.android.core.internal.util.E.l(max, j10)) {
            return 0;
        }
        d1Var.a(max, Math.max(0L, max - j10), true, io.sentry.android.core.internal.util.E.k(max));
        return 1;
    }

    public static int i(d1 d1Var, long j10, long j11) {
        long g10 = j11 - d1Var.g();
        if (g10 > 0) {
            return (int) Math.ceil(g10 / j10);
        }
        return 0;
    }

    public static long j(AbstractC4856v2 abstractC4856v2) {
        if (abstractC4856v2 instanceof C4867x3) {
            return abstractC4856v2.b(f51281i);
        }
        return System.nanoTime() - (AbstractC4779m.i(System.currentTimeMillis()) - abstractC4856v2.f());
    }

    @Override // io.sentry.Z
    public void a(InterfaceC4780m0 interfaceC4780m0) {
        if (!this.f51282a || (interfaceC4780m0 instanceof C4771k1) || (interfaceC4780m0 instanceof C4781m1)) {
            return;
        }
        InterfaceC4765j0 d10 = this.f51283b.d();
        try {
            if (!this.f51286e.contains(interfaceC4780m0)) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            if (d10 != null) {
                d10.close();
            }
            h(interfaceC4780m0);
            d10 = this.f51283b.d();
            try {
                if (this.f51286e.isEmpty()) {
                    clear();
                } else {
                    this.f51287f.headSet((ConcurrentSkipListSet) new a(j(((InterfaceC4780m0) this.f51286e.first()).u()))).clear();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
        }
    }

    @Override // io.sentry.Z
    public void b(InterfaceC4780m0 interfaceC4780m0) {
        if (!this.f51282a || (interfaceC4780m0 instanceof C4771k1) || (interfaceC4780m0 instanceof C4781m1)) {
            return;
        }
        InterfaceC4765j0 d10 = this.f51283b.d();
        try {
            this.f51286e.add(interfaceC4780m0);
            if (this.f51285d == null) {
                this.f51285d = this.f51284c.o(this);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Z
    public void clear() {
        InterfaceC4765j0 d10 = this.f51283b.d();
        try {
            if (this.f51285d != null) {
                this.f51284c.p(this.f51285d);
                this.f51285d = null;
            }
            this.f51287f.clear();
            this.f51286e.clear();
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.internal.util.E.c
    public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
        if (this.f51287f.size() > 3600) {
            return;
        }
        long j14 = (long) (f51280h / f10);
        this.f51288g = j14;
        if (z10 || z11) {
            this.f51287f.add(new a(j10, j11, j12, j13, z10, z11, j14));
        }
    }

    public final void h(InterfaceC4780m0 interfaceC4780m0) {
        InterfaceC4765j0 d10 = this.f51283b.d();
        try {
            if (!this.f51286e.remove(interfaceC4780m0)) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            AbstractC4856v2 s10 = interfaceC4780m0.s();
            if (s10 == null) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            long j10 = j(interfaceC4780m0.u());
            long j11 = j(s10);
            long j12 = j11 - j10;
            long j13 = 0;
            if (j12 <= 0) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            d1 d1Var = new d1();
            long j14 = this.f51288g;
            if (!this.f51287f.isEmpty()) {
                for (a aVar : this.f51287f.tailSet((ConcurrentSkipListSet) new a(j10))) {
                    if (aVar.f51289a > j11) {
                        break;
                    }
                    if (aVar.f51289a >= j10 && aVar.f51290b <= j11) {
                        d1Var.a(aVar.f51291c, aVar.f51292d, aVar.f51293e, aVar.f51294f);
                    } else if ((j10 > aVar.f51289a && j10 < aVar.f51290b) || (j11 > aVar.f51289a && j11 < aVar.f51290b)) {
                        long min = Math.min(aVar.f51292d - Math.max(j13, Math.max(j13, j10 - aVar.f51289a) - aVar.f51295g), j12);
                        long min2 = Math.min(j11, aVar.f51290b) - Math.max(j10, aVar.f51289a);
                        d1Var.a(min2, min, io.sentry.android.core.internal.util.E.l(min2, aVar.f51295g), io.sentry.android.core.internal.util.E.k(min2));
                    }
                    j14 = aVar.f51295g;
                    j13 = 0;
                }
            }
            long j15 = j14;
            int f10 = d1Var.f();
            long j16 = this.f51284c.j();
            if (j16 != -1) {
                f10 = f10 + g(d1Var, j15, j11, j16) + i(d1Var, j15, j12);
            }
            double e10 = (d1Var.e() + d1Var.c()) / 1.0E9d;
            interfaceC4780m0.k("frames.total", Integer.valueOf(f10));
            interfaceC4780m0.k("frames.slow", Integer.valueOf(d1Var.d()));
            interfaceC4780m0.k("frames.frozen", Integer.valueOf(d1Var.b()));
            interfaceC4780m0.k("frames.delay", Double.valueOf(e10));
            if (interfaceC4780m0 instanceof InterfaceC4790o0) {
                interfaceC4780m0.i("frames_total", Integer.valueOf(f10));
                interfaceC4780m0.i("frames_slow", Integer.valueOf(d1Var.d()));
                interfaceC4780m0.i("frames_frozen", Integer.valueOf(d1Var.b()));
                interfaceC4780m0.i("frames_delay", Double.valueOf(e10));
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 == null) {
                throw th2;
            }
            try {
                d10.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
