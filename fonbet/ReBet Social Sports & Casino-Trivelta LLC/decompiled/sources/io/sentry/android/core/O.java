package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC4779m;
import io.sentry.C4860w1;
import io.sentry.C4867x3;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.T3;
import io.sentry.android.core.internal.util.E;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class O {

    /* renamed from: b, reason: collision with root package name */
    public final File f50745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50746c;

    /* renamed from: f, reason: collision with root package name */
    public String f50749f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.E f50750g;

    /* renamed from: l, reason: collision with root package name */
    public final p.a f50755l;

    /* renamed from: m, reason: collision with root package name */
    public final ILogger f50756m;

    /* renamed from: a, reason: collision with root package name */
    public long f50744a = 0;

    /* renamed from: d, reason: collision with root package name */
    public Future f50747d = null;

    /* renamed from: e, reason: collision with root package name */
    public File f50748e = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f50751h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f50752i = new ArrayDeque();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f50753j = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    public final Map f50754k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f50757n = false;

    /* renamed from: o, reason: collision with root package name */
    public final C4843a f50758o = new C4843a();

    public class a implements E.c {

        /* renamed from: a, reason: collision with root package name */
        public float f50759a = 0.0f;

        public a() {
        }

        @Override // io.sentry.android.core.internal.util.E.c
        public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
            long f11 = new C4867x3().f();
            long nanoTime = ((j11 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - O.this.f50744a;
            if (nanoTime < 0) {
                return;
            }
            if (z11) {
                O.this.f50753j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j12), f11));
            } else if (z10) {
                O.this.f50752i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j12), f11));
            }
            if (f10 != this.f50759a) {
                this.f50759a = f10;
                O.this.f50751h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Float.valueOf(f10), f11));
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f50761a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50762b;

        /* renamed from: c, reason: collision with root package name */
        public final File f50763c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f50764d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50765e;

        public b(long j10, long j11, boolean z10, File file, Map map) {
            this.f50761a = j10;
            this.f50763c = file;
            this.f50762b = j11;
            this.f50764d = map;
            this.f50765e = z10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f50766a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50767b;

        /* renamed from: c, reason: collision with root package name */
        public final Date f50768c;

        public c(long j10, long j11, Date date) {
            this.f50766a = j10;
            this.f50767b = j11;
            this.f50768c = date;
        }
    }

    public O(String str, int i10, io.sentry.android.core.internal.util.E e10, p.a aVar, ILogger iLogger) {
        this.f50745b = new File((String) io.sentry.util.w.c(str, "TracesFilesDirPath is required"));
        this.f50746c = i10;
        this.f50756m = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f50755l = aVar;
        this.f50750g = (io.sentry.android.core.internal.util.E) io.sentry.util.w.c(e10, "SentryFrameMetricsCollector is required");
    }

    public void f() {
        InterfaceC4765j0 d10 = this.f50758o.d();
        try {
            Future future = this.f50747d;
            if (future != null) {
                future.cancel(true);
                this.f50747d = null;
            }
            if (this.f50757n) {
                g(true, null);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0024, B:13:0x0032, B:15:0x0045, B:19:0x0056, B:22:0x0060, B:23:0x006e, B:25:0x0076, B:26:0x0084, B:28:0x008c, B:29:0x009c, B:31:0x00a3, B:32:0x00a9, B:43:0x00bb, B:44:0x00bd, B:11:0x0021, B:39:0x0028), top: B:2:0x0006, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0024, B:13:0x0032, B:15:0x0045, B:19:0x0056, B:22:0x0060, B:23:0x006e, B:25:0x0076, B:26:0x0084, B:28:0x008c, B:29:0x009c, B:31:0x00a3, B:32:0x00a9, B:43:0x00bb, B:44:0x00bd, B:11:0x0021, B:39:0x0028), top: B:2:0x0006, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b g(boolean z10, List list) {
        InterfaceC4765j0 d10 = this.f50758o.d();
        try {
            if (!this.f50757n) {
                this.f50756m.c(EnumC4788n3.WARNING, "Profiler not running", new Object[0]);
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                    this.f50757n = false;
                    this.f50750g.p(this.f50749f);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    if (this.f50748e != null) {
                    }
                } catch (Throwable th2) {
                }
            }
            this.f50757n = false;
            this.f50750g.p(this.f50749f);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime2 = Process.getElapsedCpuTime();
            if (this.f50748e != null) {
                this.f50756m.c(EnumC4788n3.ERROR, "Trace file does not exists", new Object[0]);
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            if (!this.f50752i.isEmpty()) {
                this.f50754k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f50752i));
            }
            if (!this.f50753j.isEmpty()) {
                this.f50754k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f50753j));
            }
            if (!this.f50751h.isEmpty()) {
                this.f50754k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f50751h));
            }
            i(list);
            Future future = this.f50747d;
            if (future != null) {
                future.cancel(true);
                this.f50747d = null;
            }
            b bVar = new b(elapsedRealtimeNanos2, elapsedCpuTime2, z10, this.f50748e, this.f50754k);
            if (d10 != null) {
                d10.close();
            }
            return bVar;
        } finally {
        }
    }

    public boolean h() {
        return this.f50757n;
    }

    public final void i(List list) {
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f50744a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C4860w1 c4860w1 = (C4860w1) it.next();
                        long b10 = c4860w1.b();
                        long j10 = b10 + elapsedRealtimeNanos;
                        Double a10 = c4860w1.a();
                        Long c10 = c4860w1.c();
                        Long d10 = c4860w1.d();
                        if (a10 != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), a10, b10));
                        }
                        if (c10 != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), c10, b10));
                        }
                        if (d10 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), d10, b10));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f50754k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f50754k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f50754k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public c j() {
        InterfaceC4765j0 d10 = this.f50758o.d();
        try {
            int i10 = this.f50746c;
            if (i10 == 0) {
                this.f50756m.c(EnumC4788n3.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            if (this.f50757n) {
                this.f50756m.c(EnumC4788n3.WARNING, "Profiling has already started...", new Object[0]);
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            this.f50748e = new File(this.f50745b, T3.a() + ".trace");
            this.f50754k.clear();
            this.f50751h.clear();
            this.f50752i.clear();
            this.f50753j.clear();
            this.f50749f = this.f50750g.o(new a());
            try {
                p.a aVar = this.f50755l;
                if (aVar != null) {
                    this.f50747d = ((InterfaceC4760i0) aVar.a()).b(new Runnable() { // from class: io.sentry.android.core.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            O.this.g(true, null);
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e10) {
                this.f50756m.b(EnumC4788n3.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f50744a = SystemClock.elapsedRealtimeNanos();
            Date c10 = AbstractC4779m.c();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f50748e.getPath(), 3000000, this.f50746c);
                this.f50757n = true;
                c cVar = new c(this.f50744a, elapsedCpuTime, c10);
                if (d10 != null) {
                    d10.close();
                }
                return cVar;
            } catch (Throwable th2) {
                g(false, null);
                this.f50756m.b(EnumC4788n3.ERROR, "Unable to start a profile: ", th2);
                this.f50757n = false;
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
        } finally {
        }
    }
}
