package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C7143f1;
import io.sentry.C7165l;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.S2;
import io.sentry.Z0;
import io.sentry.android.core.internal.util.v;
import io.sentry.util.l;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7119u {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f67354b;

    /* renamed from: c, reason: collision with root package name */
    private final int f67355c;

    /* renamed from: f, reason: collision with root package name */
    private String f67358f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.v f67359g;

    /* renamed from: l, reason: collision with root package name */
    private final l.a<io.sentry.Z> f67364l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ILogger f67365m;

    /* renamed from: a, reason: collision with root package name */
    private long f67353a = 0;

    /* renamed from: d, reason: collision with root package name */
    private Future<?> f67356d = null;

    /* renamed from: e, reason: collision with root package name */
    private File f67357e = null;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f67360h = new ArrayDeque<>();

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f67361i = new ArrayDeque<>();

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<io.sentry.profilemeasurements.b> f67362j = new ArrayDeque<>();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final HashMap f67363k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f67366n = false;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f67367o = new io.sentry.util.a();

    /* renamed from: io.sentry.android.core.u$a */
    final class a implements v.a {

        /* renamed from: a, reason: collision with root package name */
        float f67368a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.v.a
        public final void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f7) {
            long d11 = new S2().d();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j12 - System.nanoTime());
            C7119u c7119u = C7119u.this;
            long j15 = elapsedRealtimeNanos - c7119u.f67353a;
            if (j15 < 0) {
                return;
            }
            if (z12) {
                c7119u.f67362j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j15), Long.valueOf(j13), d11));
            } else if (z11) {
                c7119u.f67361i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j15), Long.valueOf(j13), d11));
            }
            if (f7 != this.f67368a) {
                this.f67368a = f7;
                c7119u.f67360h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j15), Float.valueOf(f7), d11));
            }
        }
    }

    /* renamed from: io.sentry.android.core.u$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f67370a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67371b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final File f67372c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final HashMap f67373d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f67374e;

        public b(long j11, long j12, boolean z11, @NotNull File file, @NotNull HashMap hashMap) {
            this.f67370a = j11;
            this.f67372c = file;
            this.f67371b = j12;
            this.f67373d = hashMap;
            this.f67374e = z11;
        }
    }

    /* renamed from: io.sentry.android.core.u$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f67375a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67376b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final Date f67377c;

        public c(long j11, long j12, @NotNull Date date) {
            this.f67375a = j11;
            this.f67376b = j12;
            this.f67377c = date;
        }
    }

    public C7119u(@NotNull String str, int i11, @NotNull io.sentry.android.core.internal.util.v vVar, l.a<io.sentry.Z> aVar, @NotNull ILogger iLogger) {
        io.sentry.util.p.b(str, "TracesFilesDirPath is required");
        this.f67354b = new File(str);
        this.f67355c = i11;
        io.sentry.util.p.b(iLogger, "Logger is required");
        this.f67365m = iLogger;
        this.f67364l = aVar;
        io.sentry.util.p.b(vVar, "SentryFrameMetricsCollector is required");
        this.f67359g = vVar;
    }

    @SuppressLint({"NewApi"})
    private void h(List<C7143f1> list) {
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f67353a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (C7143f1 c7143f1 : list) {
                        long b11 = c7143f1.b();
                        long j11 = b11 + elapsedRealtimeNanos;
                        Double a11 = c7143f1.a();
                        Long c11 = c7143f1.c();
                        Long d11 = c7143f1.d();
                        if (a11 != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), a11, b11));
                        }
                        if (c11 != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), c11, b11));
                        }
                        if (d11 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), d11, b11));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f67363k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f67363k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f67363k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final void e() {
        InterfaceC7097a0 a11 = this.f67367o.a();
        try {
            Future<?> future = this.f67356d;
            if (future != null) {
                future.cancel(true);
                this.f67356d = null;
            }
            if (this.f67366n) {
                f(null, true);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:12:0x0030, B:14:0x0043, B:17:0x0052, B:20:0x005c, B:21:0x006a, B:23:0x0072, B:24:0x0080, B:26:0x0088, B:27:0x0098, B:29:0x009f, B:30:0x00a5, B:40:0x00b5, B:41:0x00b7, B:36:0x0026, B:10:0x001f), top: B:2:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:12:0x0030, B:14:0x0043, B:17:0x0052, B:20:0x005c, B:21:0x006a, B:23:0x0072, B:24:0x0080, B:26:0x0088, B:27:0x0098, B:29:0x009f, B:30:0x00a5, B:40:0x00b5, B:41:0x00b7, B:36:0x0026, B:10:0x001f), top: B:2:0x0006, inners: #0, #1 }] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b f(List list, boolean z11) {
        InterfaceC7097a0 a11 = this.f67367o.a();
        try {
            if (!this.f67366n) {
                this.f67365m.c(I2.WARNING, "Profiler not running", new Object[0]);
                a11.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                    this.f67366n = false;
                    this.f67359g.h(this.f67358f);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    if (this.f67357e != null) {
                    }
                } catch (Throwable th2) {
                }
            }
            this.f67366n = false;
            this.f67359g.h(this.f67358f);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime2 = Process.getElapsedCpuTime();
            if (this.f67357e != null) {
                this.f67365m.c(I2.ERROR, "Trace file does not exists", new Object[0]);
                a11.close();
                return null;
            }
            if (!this.f67361i.isEmpty()) {
                this.f67363k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f67361i));
            }
            if (!this.f67362j.isEmpty()) {
                this.f67363k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f67362j));
            }
            if (!this.f67360h.isEmpty()) {
                this.f67363k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f67360h));
            }
            h(list);
            Future<?> future = this.f67356d;
            if (future != null) {
                future.cancel(true);
                this.f67356d = null;
            }
            b bVar = new b(elapsedRealtimeNanos2, elapsedCpuTime2, z11, this.f67357e, this.f67363k);
            a11.close();
            return bVar;
        } finally {
        }
    }

    final boolean g() {
        return this.f67366n;
    }

    @SuppressLint({"NewApi"})
    public final c i() {
        InterfaceC7097a0 a11 = this.f67367o.a();
        try {
            int i11 = this.f67355c;
            if (i11 == 0) {
                this.f67365m.c(I2.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i11));
                a11.close();
                return null;
            }
            if (this.f67366n) {
                this.f67365m.c(I2.WARNING, "Profiling has already started...", new Object[0]);
                a11.close();
                return null;
            }
            this.f67357e = new File(this.f67354b, Z0.c().concat(".trace"));
            this.f67363k.clear();
            this.f67360h.clear();
            this.f67361i.clear();
            this.f67362j.clear();
            this.f67358f = this.f67359g.g(new a());
            try {
                l.a<io.sentry.Z> aVar = this.f67364l;
                if (aVar != null) {
                    this.f67356d = aVar.g().b(new B90.n0(this, 1), 30000L);
                }
            } catch (RejectedExecutionException e11) {
                this.f67365m.a(I2.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e11);
            }
            this.f67353a = SystemClock.elapsedRealtimeNanos();
            Date b11 = C7165l.b();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f67357e.getPath(), 3000000, this.f67355c);
                this.f67366n = true;
                c cVar = new c(this.f67353a, elapsedCpuTime, b11);
                a11.close();
                return cVar;
            } catch (Throwable th2) {
                f(null, false);
                this.f67365m.a(I2.ERROR, "Unable to start a profile: ", th2);
                this.f67366n = false;
                a11.close();
                return null;
            }
        } finally {
        }
    }
}
