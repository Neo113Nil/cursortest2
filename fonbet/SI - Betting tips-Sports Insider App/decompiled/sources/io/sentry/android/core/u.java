package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.d3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final File f15846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15847c;

    /* renamed from: f, reason: collision with root package name */
    public String f15850f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.p f15851g;

    /* renamed from: l, reason: collision with root package name */
    public final io.sentry.e1 f15855l;

    /* renamed from: m, reason: collision with root package name */
    public final ILogger f15856m;

    /* renamed from: a, reason: collision with root package name */
    public long f15845a = 0;

    /* renamed from: d, reason: collision with root package name */
    public Future f15848d = null;

    /* renamed from: e, reason: collision with root package name */
    public File f15849e = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f15852h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f15853i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15854k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f15857n = false;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f15858o = new io.sentry.util.a();

    public u(String str, int i5, io.sentry.android.core.internal.util.p pVar, io.sentry.e1 e1Var, ILogger iLogger) {
        y4.a.C(str, "TracesFilesDirPath is required");
        this.f15846b = new File(str);
        this.f15847c = i5;
        y4.a.C(iLogger, "Logger is required");
        this.f15856m = iLogger;
        this.f15855l = e1Var;
        y4.a.C(pVar, "SentryFrameMetricsCollector is required");
        this.f15851g = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:12:0x0030, B:14:0x0043, B:17:0x0052, B:20:0x005c, B:21:0x006a, B:23:0x0072, B:24:0x0080, B:26:0x0088, B:27:0x0098, B:29:0x009f, B:30:0x00a5, B:40:0x00b5, B:41:0x00b7, B:36:0x0026, B:10:0x001f), top: B:2:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0022, B:12:0x0030, B:14:0x0043, B:17:0x0052, B:20:0x005c, B:21:0x006a, B:23:0x0072, B:24:0x0080, B:26:0x0088, B:27:0x0098, B:29:0x009f, B:30:0x00a5, B:40:0x00b5, B:41:0x00b7, B:36:0x0026, B:10:0x001f), top: B:2:0x0006, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(List list, boolean z5) {
        io.sentry.r a7 = this.f15858o.a();
        try {
            if (!this.f15857n) {
                this.f15856m.h(b5.WARNING, "Profiler not running", new Object[0]);
                a7.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                    this.f15857n = false;
                    this.f15851g.b(this.f15850f);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    if (this.f15849e != null) {
                    }
                } catch (Throwable th2) {
                }
            }
            this.f15857n = false;
            this.f15851g.b(this.f15850f);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime2 = Process.getElapsedCpuTime();
            if (this.f15849e != null) {
                this.f15856m.h(b5.ERROR, "Trace file does not exists", new Object[0]);
                a7.close();
                return null;
            }
            if (!this.f15853i.isEmpty()) {
                this.f15854k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f15853i));
            }
            if (!this.j.isEmpty()) {
                this.f15854k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.f15852h.isEmpty()) {
                this.f15854k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f15852h));
            }
            b(list);
            Future future = this.f15848d;
            if (future != null) {
                future.cancel(true);
                this.f15848d = null;
            }
            s sVar = new s(elapsedRealtimeNanos2, elapsedCpuTime2, z5, this.f15849e, this.f15854k);
            a7.close();
            return sVar;
        } finally {
        }
    }

    public final void b(List list) {
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f15845a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        d3 d3Var = (d3) it.next();
                        long j = d3Var.f16305d;
                        long j6 = j + elapsedRealtimeNanos;
                        Double d10 = d3Var.f16302a;
                        Long l6 = d3Var.f16303b;
                        Long l10 = d3Var.f16304c;
                        if (d10 != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j6), d10, j));
                        }
                        if (l6 != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j6), l6, j));
                        }
                        if (l10 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j6), l10, j));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f15854k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f15854k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f15854k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final t c() {
        String n9;
        io.sentry.r a7 = this.f15858o.a();
        try {
            int i5 = this.f15847c;
            int i10 = 1;
            if (i5 == 0) {
                this.f15856m.h(b5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i5));
                a7.close();
                return null;
            }
            if (this.f15857n) {
                this.f15856m.h(b5.WARNING, "Profiling has already started...", new Object[0]);
                a7.close();
                return null;
            }
            this.f15849e = new File(this.f15846b, io.sentry.config.a.n().concat(".trace"));
            this.f15854k.clear();
            this.f15852h.clear();
            this.f15853i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.p pVar = this.f15851g;
            r rVar = new r(this);
            if (pVar.f15752g) {
                n9 = io.sentry.config.a.n();
                pVar.f15751f.put(n9, rVar);
                pVar.c();
            } else {
                n9 = null;
            }
            this.f15850f = n9;
            try {
                io.sentry.e1 e1Var = this.f15855l;
                if (e1Var != null) {
                    this.f15848d = e1Var.l(new f(i10, this), 30000L);
                }
            } catch (RejectedExecutionException e7) {
                this.f15856m.e(b5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e7);
            }
            this.f15845a = SystemClock.elapsedRealtimeNanos();
            Date n10 = com.google.android.play.core.appupdate.b.n();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f15849e.getPath(), 3000000, this.f15847c);
                this.f15857n = true;
                t tVar = new t(this.f15845a, elapsedCpuTime, n10);
                a7.close();
                return tVar;
            } catch (Throwable th2) {
                a(null, false);
                this.f15856m.e(b5.ERROR, "Unable to start a profile: ", th2);
                this.f15857n = false;
                a7.close();
                return null;
            }
        } finally {
        }
    }
}
