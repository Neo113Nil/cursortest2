package io.sentry.android.core;

import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7134d0;
import io.sentry.InterfaceC7142f0;
import io.sentry.S2;
import io.sentry.T1;
import io.sentry.W0;
import io.sentry.Y0;
import io.sentry.android.core.internal.util.v;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o0 implements io.sentry.Q, v.a {

    /* renamed from: h, reason: collision with root package name */
    private static final long f67292h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i, reason: collision with root package name */
    private static final S2 f67293i = new S2(new Date(0), 0);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67294a;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.v f67296c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f67297d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f67295b = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final TreeSet f67298e = new TreeSet(new L1.D(1));

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConcurrentSkipListSet<a> f67299f = new ConcurrentSkipListSet<>();

    /* renamed from: g, reason: collision with root package name */
    private long f67300g = 16666666;

    /* loaded from: classes10.dex */
    private static class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        private final long f67301a;

        /* renamed from: b, reason: collision with root package name */
        private final long f67302b;

        /* renamed from: c, reason: collision with root package name */
        private final long f67303c;

        /* renamed from: d, reason: collision with root package name */
        private final long f67304d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f67305e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f67306f;

        /* renamed from: g, reason: collision with root package name */
        private final long f67307g;

        a(long j11) {
            this(j11, j11, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NotNull a aVar) {
            return Long.compare(this.f67302b, aVar.f67302b);
        }

        a(long j11, long j12, long j13, long j14, boolean z11, boolean z12, long j15) {
            this.f67301a = j11;
            this.f67302b = j12;
            this.f67303c = j13;
            this.f67304d = j14;
            this.f67305e = z11;
            this.f67306f = z12;
            this.f67307g = j15;
        }
    }

    public o0(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.android.core.internal.util.v vVar) {
        this.f67296c = vVar;
        this.f67294a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    private static long f(@NotNull T1 t12) {
        if (t12 instanceof S2) {
            return t12.b(f67293i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - t12.d());
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0204 A[Catch: all -> 0x0208, TryCatch #4 {all -> 0x0208, blocks: (B:25:0x01fe, B:27:0x0204, B:30:0x020b), top: B:24:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020b A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #4 {all -> 0x0208, blocks: (B:25:0x01fe, B:27:0x0204, B:30:0x020b), top: B:24:0x01fe }] */
    @Override // io.sentry.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull InterfaceC7134d0 interfaceC7134d0) {
        InterfaceC7097a0 interfaceC7097a0;
        Throwable th2;
        T1 r11;
        io.sentry.util.a aVar;
        io.sentry.util.a aVar2;
        if (!this.f67294a || (interfaceC7134d0 instanceof W0) || (interfaceC7134d0 instanceof Y0)) {
            return;
        }
        io.sentry.util.a aVar3 = this.f67295b;
        InterfaceC7097a0 a11 = aVar3.a();
        TreeSet treeSet = this.f67298e;
        try {
            if (!treeSet.contains(interfaceC7134d0)) {
                a11.close();
                return;
            }
            a11.close();
            InterfaceC7097a0 a12 = aVar3.a();
            try {
                boolean remove = treeSet.remove(interfaceC7134d0);
                ConcurrentSkipListSet<a> concurrentSkipListSet = this.f67299f;
                try {
                    if (remove && (r11 = interfaceC7134d0.r()) != null) {
                        long f7 = f(interfaceC7134d0.s());
                        long f11 = f(r11);
                        long j11 = f11 - f7;
                        if (j11 > 0) {
                            m0 m0Var = new m0();
                            long j12 = this.f67300g;
                            int i11 = 1;
                            if (!concurrentSkipListSet.isEmpty()) {
                                for (a aVar4 : concurrentSkipListSet.tailSet((ConcurrentSkipListSet<a>) new a(f7))) {
                                    if (aVar4.f67301a > f11) {
                                        break;
                                    }
                                    if (aVar4.f67301a >= f7) {
                                        try {
                                            if (aVar4.f67302b <= f11) {
                                                m0Var.a(aVar4.f67303c, aVar4.f67304d, aVar4.f67305e, aVar4.f67306f);
                                                aVar2 = aVar3;
                                                interfaceC7097a0 = a12;
                                                j12 = aVar4.f67307g;
                                                a12 = interfaceC7097a0;
                                                aVar3 = aVar2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            interfaceC7097a0 = a12;
                                            try {
                                                interfaceC7097a0.close();
                                                throw th2;
                                            } catch (Throwable th4) {
                                                th2.addSuppressed(th4);
                                                throw th2;
                                            }
                                        }
                                    }
                                    if ((f7 > aVar4.f67301a && f7 < aVar4.f67302b) || (f11 > aVar4.f67301a && f11 < aVar4.f67302b)) {
                                        aVar2 = aVar3;
                                        interfaceC7097a0 = a12;
                                        try {
                                            long min = Math.min(aVar4.f67304d - Math.max(0L, Math.max(0L, f7 - aVar4.f67301a) - aVar4.f67307g), j11);
                                            long min2 = Math.min(f11, aVar4.f67302b) - Math.max(f7, aVar4.f67301a);
                                            long j13 = aVar4.f67307g;
                                            int i12 = io.sentry.android.core.internal.util.v.f67232p;
                                            m0Var.a(min2, min, min2 > j13, io.sentry.android.core.internal.util.v.f(min2));
                                            j12 = aVar4.f67307g;
                                            a12 = interfaceC7097a0;
                                            aVar3 = aVar2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th2 = th;
                                            interfaceC7097a0.close();
                                            throw th2;
                                        }
                                    }
                                    aVar2 = aVar3;
                                    interfaceC7097a0 = a12;
                                    j12 = aVar4.f67307g;
                                    a12 = interfaceC7097a0;
                                    aVar3 = aVar2;
                                }
                            }
                            aVar = aVar3;
                            interfaceC7097a0 = a12;
                            int f12 = m0Var.f();
                            long e11 = this.f67296c.e();
                            if (e11 != -1) {
                                long max = Math.max(0L, f11 - e11);
                                if (max > j12) {
                                    m0Var.a(max, Math.max(0L, max - j12), true, io.sentry.android.core.internal.util.v.f(max));
                                } else {
                                    i11 = 0;
                                }
                                int i13 = f12 + i11;
                                long g10 = j11 - m0Var.g();
                                f12 = i13 + (g10 > 0 ? (int) Math.ceil(g10 / j12) : 0);
                            }
                            double e12 = (m0Var.e() + m0Var.c()) / 1.0E9d;
                            interfaceC7134d0.c(Integer.valueOf(f12), "frames.total");
                            interfaceC7134d0.c(Integer.valueOf(m0Var.d()), "frames.slow");
                            interfaceC7134d0.c(Integer.valueOf(m0Var.b()), "frames.frozen");
                            interfaceC7134d0.c(Double.valueOf(e12), "frames.delay");
                            if (interfaceC7134d0 instanceof InterfaceC7142f0) {
                                interfaceC7134d0.l("frames_total", Integer.valueOf(f12));
                                interfaceC7134d0.l("frames_slow", Integer.valueOf(m0Var.d()));
                                interfaceC7134d0.l("frames_frozen", Integer.valueOf(m0Var.b()));
                                interfaceC7134d0.l("frames_delay", Double.valueOf(e12));
                            }
                            interfaceC7097a0.close();
                            a11 = aVar.a();
                            if (treeSet.isEmpty()) {
                                concurrentSkipListSet.headSet((ConcurrentSkipListSet<a>) new a(f(((InterfaceC7134d0) treeSet.first()).s()))).clear();
                            } else {
                                clear();
                            }
                            a11.close();
                            return;
                        }
                    }
                    if (treeSet.isEmpty()) {
                    }
                    a11.close();
                    return;
                } catch (Throwable th6) {
                }
                a12.close();
                aVar = aVar3;
                a11 = aVar.a();
            } catch (Throwable th7) {
                th = th7;
                interfaceC7097a0 = a12;
            }
        } finally {
            try {
                a11.close();
                throw th6;
            } catch (Throwable th8) {
                th6.addSuppressed(th8);
            }
        }
    }

    @Override // io.sentry.Q
    public final void b(@NotNull InterfaceC7134d0 interfaceC7134d0) {
        if (!this.f67294a || (interfaceC7134d0 instanceof W0) || (interfaceC7134d0 instanceof Y0)) {
            return;
        }
        InterfaceC7097a0 a11 = this.f67295b.a();
        try {
            this.f67298e.add(interfaceC7134d0);
            if (this.f67297d == null) {
                this.f67297d = this.f67296c.g(this);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.Q
    public final void clear() {
        InterfaceC7097a0 a11 = this.f67295b.a();
        try {
            if (this.f67297d != null) {
                this.f67296c.h(this.f67297d);
                this.f67297d = null;
            }
            this.f67299f.clear();
            this.f67298e.clear();
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.internal.util.v.a
    public final void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f7) {
        ConcurrentSkipListSet<a> concurrentSkipListSet = this.f67299f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j15 = (long) (f67292h / f7);
        this.f67300g = j15;
        if (z11 || z12) {
            concurrentSkipListSet.add(new a(j11, j12, j13, j14, z11, z12, j15));
        }
    }
}
