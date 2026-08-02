package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.j5;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.w2;
import io.sentry.y2;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 implements io.sentry.w0, io.sentry.android.core.internal.util.o {

    /* renamed from: h, reason: collision with root package name */
    public static final long f15587h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i, reason: collision with root package name */
    public static final j5 f15588i = new j5(new Date(0), 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15589a;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.p f15591c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f15592d;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f15590b = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    public final TreeSet f15593e = new TreeSet(new com.google.android.material.color.utilities.h(1));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f15594f = new ConcurrentSkipListSet();

    /* renamed from: g, reason: collision with root package name */
    public long f15595g = 16666666;

    public g1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.p pVar) {
        this.f15591c = pVar;
        this.f15589a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long g(k4 k4Var) {
        if (k4Var instanceof j5) {
            return k4Var.b(f15588i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - k4Var.d());
    }

    @Override // io.sentry.android.core.internal.util.o
    public final void b(long j, long j6, long j10, long j11, boolean z5, boolean z7, float f6) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f15594f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j12 = (long) (f15587h / f6);
        this.f15595g = j12;
        if (z5 || z7) {
            concurrentSkipListSet.add(new f1(j, j6, j10, j11, z5, z7, j12));
        }
    }

    public final void d() {
        io.sentry.r a7 = this.f15590b.a();
        try {
            if (this.f15592d != null) {
                this.f15591c.b(this.f15592d);
                this.f15592d = null;
            }
            this.f15594f.clear();
            this.f15593e.clear();
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ec A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:108:0x0150, B:110:0x015a, B:113:0x015e, B:115:0x0166, B:119:0x0173, B:123:0x0182, B:126:0x018d, B:128:0x0199, B:129:0x01a5, B:131:0x01af, B:132:0x01b9, B:133:0x019e, B:137:0x01bb, B:139:0x01ec, B:84:0x00e5, B:87:0x010b, B:90:0x0116, B:92:0x011a, B:95:0x0121), top: B:83:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021d A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:25:0x0217, B:27:0x021d, B:30:0x0224), top: B:24:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224 A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {all -> 0x0221, blocks: (B:25:0x0217, B:27:0x021d, B:30:0x0224), top: B:24:0x0217 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(io.sentry.i1 i1Var) {
        io.sentry.r rVar;
        Throwable th2;
        k4 w10;
        TreeSet treeSet;
        io.sentry.util.a aVar;
        int i5;
        int i10;
        long j;
        long j6;
        long j10;
        long j11;
        Field field;
        Long l6;
        Iterator it;
        TreeSet treeSet2 = this.f15593e;
        if (!this.f15589a || (i1Var instanceof w2) || (i1Var instanceof y2)) {
            return;
        }
        io.sentry.util.a aVar2 = this.f15590b;
        io.sentry.r a7 = aVar2.a();
        try {
            if (!treeSet2.contains(i1Var)) {
                a7.close();
                return;
            }
            a7.close();
            io.sentry.r a10 = aVar2.a();
            try {
                boolean remove = treeSet2.remove(i1Var);
                ConcurrentSkipListSet concurrentSkipListSet = this.f15594f;
                try {
                    if (remove && (w10 = i1Var.w()) != null) {
                        long g10 = g(i1Var.z());
                        long g11 = g(w10);
                        long j12 = g11 - g10;
                        if (j12 > 0) {
                            long j13 = this.f15595g;
                            int i11 = 1;
                            if (concurrentSkipListSet.isEmpty()) {
                                treeSet = treeSet2;
                                aVar = aVar2;
                                rVar = a10;
                                i5 = 0;
                                i10 = 0;
                                j = 0;
                                j6 = 0;
                                j10 = 0;
                            } else {
                                Iterator it2 = concurrentSkipListSet.tailSet((ConcurrentSkipListSet) new f1(g10)).iterator();
                                i5 = 0;
                                i10 = 0;
                                j = 0;
                                j6 = 0;
                                j10 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        treeSet = treeSet2;
                                        aVar = aVar2;
                                        break;
                                    }
                                    f1 f1Var = (f1) it2.next();
                                    treeSet = treeSet2;
                                    aVar = aVar2;
                                    long j14 = f1Var.f15576a;
                                    long j15 = f1Var.f15579d;
                                    long j16 = f1Var.f15582g;
                                    long j17 = f1Var.f15577b;
                                    if (j14 > g11) {
                                        break;
                                    }
                                    if (j14 >= g10 && j17 <= g11) {
                                        try {
                                            long j18 = f1Var.f15578c;
                                            boolean z5 = f1Var.f15580e;
                                            j += j18;
                                            if (f1Var.f15581f) {
                                                j10 += j15;
                                                i10++;
                                            } else if (z5) {
                                                j6 += j15;
                                                i5++;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            rVar = a10;
                                            rVar.close();
                                            throw th2;
                                        }
                                    } else if ((g10 > j14 && g10 < j17) || (g11 > j14 && g11 < j17)) {
                                        rVar = a10;
                                        it = it2;
                                        try {
                                            long min = Math.min(j15 - Math.max(0L, Math.max(0L, g10 - j14) - j16), j12);
                                            long min2 = Math.min(g11, j17) - Math.max(g10, f1Var.f15576a);
                                            int i12 = io.sentry.android.core.internal.util.p.f15745p;
                                            boolean z7 = min2 > j16;
                                            j += min2;
                                            if (min2 > io.sentry.android.core.internal.util.p.f15744o) {
                                                j10 += min;
                                                i10++;
                                            } else if (z7) {
                                                j6 += min;
                                                i5++;
                                            }
                                            it2 = it;
                                            treeSet2 = treeSet;
                                            aVar2 = aVar;
                                            a10 = rVar;
                                            j13 = j16;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th2 = th;
                                            try {
                                                rVar.close();
                                                throw th2;
                                            } catch (Throwable th5) {
                                                th2.addSuppressed(th5);
                                                throw th2;
                                            }
                                        }
                                    }
                                    rVar = a10;
                                    it = it2;
                                    it2 = it;
                                    treeSet2 = treeSet;
                                    aVar2 = aVar;
                                    a10 = rVar;
                                    j13 = j16;
                                }
                                rVar = a10;
                            }
                            int i13 = i5 + i10;
                            io.sentry.android.core.internal.util.p pVar = this.f15591c;
                            Choreographer choreographer = pVar.j;
                            if (choreographer != null && (field = pVar.f15755k) != null) {
                                try {
                                    l6 = (Long) field.get(choreographer);
                                } catch (IllegalAccessException unused) {
                                }
                                if (l6 != null) {
                                    j11 = l6.longValue();
                                    if (j11 != -1) {
                                        long max = Math.max(0L, g11 - j11);
                                        if (max > j13) {
                                            boolean z10 = max > io.sentry.android.core.internal.util.p.f15744o;
                                            long max2 = Math.max(0L, max - j13);
                                            j += max;
                                            if (z10) {
                                                j10 += max2;
                                                i10++;
                                            } else {
                                                j6 += max2;
                                                i5++;
                                            }
                                        } else {
                                            i11 = 0;
                                        }
                                        long j19 = j12 - j;
                                        i13 = i13 + i11 + (j19 > 0 ? (int) Math.ceil(j19 / j13) : 0);
                                    }
                                    double d10 = (j6 + j10) / 1.0E9d;
                                    i1Var.m(Integer.valueOf(i13), "frames.total");
                                    i1Var.m(Integer.valueOf(i5), "frames.slow");
                                    i1Var.m(Integer.valueOf(i10), "frames.frozen");
                                    i1Var.m(Double.valueOf(d10), "frames.delay");
                                    if (i1Var instanceof k1) {
                                        i1Var.f(Integer.valueOf(i13), "frames_total");
                                        i1Var.f(Integer.valueOf(i5), "frames_slow");
                                        i1Var.f(Integer.valueOf(i10), "frames_frozen");
                                        i1Var.f(Double.valueOf(d10), "frames_delay");
                                    }
                                    rVar.close();
                                    a7 = aVar.a();
                                    if (treeSet.isEmpty()) {
                                        d();
                                    } else {
                                        concurrentSkipListSet.headSet((ConcurrentSkipListSet) new f1(g(((io.sentry.i1) treeSet.first()).z()))).clear();
                                    }
                                    a7.close();
                                    return;
                                }
                            }
                            j11 = -1;
                            if (j11 != -1) {
                            }
                            double d102 = (j6 + j10) / 1.0E9d;
                            i1Var.m(Integer.valueOf(i13), "frames.total");
                            i1Var.m(Integer.valueOf(i5), "frames.slow");
                            i1Var.m(Integer.valueOf(i10), "frames.frozen");
                            i1Var.m(Double.valueOf(d102), "frames.delay");
                            if (i1Var instanceof k1) {
                            }
                            rVar.close();
                            a7 = aVar.a();
                            if (treeSet.isEmpty()) {
                            }
                            a7.close();
                            return;
                        }
                    }
                    if (treeSet.isEmpty()) {
                    }
                    a7.close();
                    return;
                } catch (Throwable th6) {
                }
                a10.close();
                treeSet = treeSet2;
                aVar = aVar2;
                a7 = aVar.a();
            } catch (Throwable th7) {
                th = th7;
                rVar = a10;
            }
        } finally {
            try {
                a7.close();
                throw th6;
            } catch (Throwable th8) {
                th6.addSuppressed(th8);
            }
        }
    }

    public final void f(io.sentry.i1 i1Var) {
        String str;
        if (!this.f15589a || (i1Var instanceof w2) || (i1Var instanceof y2)) {
            return;
        }
        io.sentry.r a7 = this.f15590b.a();
        try {
            this.f15593e.add(i1Var);
            if (this.f15592d == null) {
                io.sentry.android.core.internal.util.p pVar = this.f15591c;
                if (pVar.f15752g) {
                    String n9 = io.sentry.config.a.n();
                    pVar.f15751f.put(n9, this);
                    pVar.c();
                    str = n9;
                } else {
                    str = null;
                }
                this.f15592d = str;
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
