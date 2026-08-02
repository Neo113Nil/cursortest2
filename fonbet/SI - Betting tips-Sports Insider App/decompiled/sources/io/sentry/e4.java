package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e4 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16369a;

    /* renamed from: b, reason: collision with root package name */
    public Double f16370b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16371c;

    /* renamed from: d, reason: collision with root package name */
    public Double f16372d;

    /* renamed from: e, reason: collision with root package name */
    public String f16373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16374f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16375g;

    /* renamed from: h, reason: collision with root package name */
    public int f16376h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16377i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16378k;

    /* renamed from: l, reason: collision with root package name */
    public i3 f16379l;

    /* renamed from: m, reason: collision with root package name */
    public ConcurrentHashMap f16380m;

    public e4(b6 b6Var, c4.d dVar) {
        this.f16371c = ((Boolean) dVar.f3577b).booleanValue();
        this.f16372d = (Double) dVar.f3578c;
        this.f16369a = ((Boolean) dVar.f3580e).booleanValue();
        this.f16370b = (Double) dVar.f3581f;
        u6 internalTracesSampler = b6Var.getInternalTracesSampler();
        double c2 = io.sentry.util.j.a().c();
        Double profileSessionSampleRate = internalTracesSampler.f17153a.getProfileSessionSampleRate();
        this.f16377i = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= c2;
        this.f16373e = b6Var.getProfilingTracesDirPath();
        this.f16374f = b6Var.isProfilingEnabled();
        this.f16375g = b6Var.isContinuousProfilingEnabled();
        this.f16379l = b6Var.getProfileLifecycle();
        this.f16376h = b6Var.getProfilingTracesHz();
        this.j = b6Var.isEnableAppStartProfiling();
        this.f16378k = b6Var.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("profile_sampled");
        aVar.H(iLogger, Boolean.valueOf(this.f16369a));
        aVar.u("profile_sample_rate");
        aVar.H(iLogger, this.f16370b);
        aVar.u("continuous_profile_sampled");
        aVar.H(iLogger, Boolean.valueOf(this.f16377i));
        aVar.u("trace_sampled");
        aVar.H(iLogger, Boolean.valueOf(this.f16371c));
        aVar.u("trace_sample_rate");
        aVar.H(iLogger, this.f16372d);
        aVar.u("profiling_traces_dir_path");
        aVar.H(iLogger, this.f16373e);
        aVar.u("is_profiling_enabled");
        aVar.H(iLogger, Boolean.valueOf(this.f16374f));
        aVar.u("is_continuous_profiling_enabled");
        aVar.H(iLogger, Boolean.valueOf(this.f16375g));
        aVar.u("profile_lifecycle");
        aVar.H(iLogger, this.f16379l.name());
        aVar.u("profiling_traces_hz");
        aVar.H(iLogger, Integer.valueOf(this.f16376h));
        aVar.u("is_enable_app_start_profiling");
        aVar.H(iLogger, Boolean.valueOf(this.j));
        aVar.u("is_start_profiler_on_app_start");
        aVar.H(iLogger, Boolean.valueOf(this.f16378k));
        ConcurrentHashMap concurrentHashMap = this.f16380m;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16380m, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
