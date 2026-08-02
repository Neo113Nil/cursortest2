package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4777l2 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52154a;

    /* renamed from: b, reason: collision with root package name */
    public Double f52155b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52156c;

    /* renamed from: d, reason: collision with root package name */
    public Double f52157d;

    /* renamed from: e, reason: collision with root package name */
    public String f52158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52160g;

    /* renamed from: h, reason: collision with root package name */
    public int f52161h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52162i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52163j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52164k;

    /* renamed from: l, reason: collision with root package name */
    public A1 f52165l;

    /* renamed from: m, reason: collision with root package name */
    public Map f52166m;

    /* renamed from: io.sentry.l2$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4777l2 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4777l2 c4777l2 = new C4777l2();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "is_enable_app_start_profiling":
                        Boolean p02 = interfaceC4809q1.p0();
                        if (p02 == null) {
                            break;
                        } else {
                            c4777l2.f52163j = p02.booleanValue();
                            break;
                        }
                    case "trace_sampled":
                        Boolean p03 = interfaceC4809q1.p0();
                        if (p03 == null) {
                            break;
                        } else {
                            c4777l2.f52156c = p03.booleanValue();
                            break;
                        }
                    case "profiling_traces_dir_path":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            break;
                        } else {
                            c4777l2.f52158e = a12;
                            break;
                        }
                    case "is_continuous_profiling_enabled":
                        Boolean p04 = interfaceC4809q1.p0();
                        if (p04 == null) {
                            break;
                        } else {
                            c4777l2.f52160g = p04.booleanValue();
                            break;
                        }
                    case "is_profiling_enabled":
                        Boolean p05 = interfaceC4809q1.p0();
                        if (p05 == null) {
                            break;
                        } else {
                            c4777l2.f52159f = p05.booleanValue();
                            break;
                        }
                    case "is_start_profiler_on_app_start":
                        Boolean p06 = interfaceC4809q1.p0();
                        if (p06 == null) {
                            break;
                        } else {
                            c4777l2.f52164k = p06.booleanValue();
                            break;
                        }
                    case "profile_sampled":
                        Boolean p07 = interfaceC4809q1.p0();
                        if (p07 == null) {
                            break;
                        } else {
                            c4777l2.f52154a = p07.booleanValue();
                            break;
                        }
                    case "profile_lifecycle":
                        String a13 = interfaceC4809q1.a1();
                        if (a13 == null) {
                            break;
                        } else {
                            try {
                                c4777l2.f52165l = A1.valueOf(a13);
                                break;
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(EnumC4788n3.ERROR, "Error when deserializing ProfileLifecycle: " + a13, new Object[0]);
                                break;
                            }
                        }
                    case "continuous_profile_sampled":
                        Boolean p08 = interfaceC4809q1.p0();
                        if (p08 == null) {
                            break;
                        } else {
                            c4777l2.f52162i = p08.booleanValue();
                            break;
                        }
                    case "profiling_traces_hz":
                        Integer Q02 = interfaceC4809q1.Q0();
                        if (Q02 == null) {
                            break;
                        } else {
                            c4777l2.f52161h = Q02.intValue();
                            break;
                        }
                    case "trace_sample_rate":
                        Double e02 = interfaceC4809q1.e0();
                        if (e02 == null) {
                            break;
                        } else {
                            c4777l2.f52157d = e02;
                            break;
                        }
                    case "profile_sample_rate":
                        Double e03 = interfaceC4809q1.e0();
                        if (e03 == null) {
                            break;
                        } else {
                            c4777l2.f52155b = e03;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            c4777l2.m(concurrentHashMap);
            interfaceC4809q1.t();
            return c4777l2;
        }
    }

    public C4777l2() {
        this.f52156c = false;
        this.f52157d = null;
        this.f52154a = false;
        this.f52155b = null;
        this.f52162i = false;
        this.f52158e = null;
        this.f52159f = false;
        this.f52160g = false;
        this.f52165l = A1.MANUAL;
        this.f52161h = 0;
        this.f52163j = true;
        this.f52164k = false;
    }

    public A1 a() {
        return this.f52165l;
    }

    public Double b() {
        return this.f52155b;
    }

    public String c() {
        return this.f52158e;
    }

    public int d() {
        return this.f52161h;
    }

    public Double e() {
        return this.f52157d;
    }

    public boolean f() {
        return this.f52162i;
    }

    public boolean g() {
        return this.f52160g;
    }

    public boolean h() {
        return this.f52163j;
    }

    public boolean i() {
        return this.f52154a;
    }

    public boolean j() {
        return this.f52159f;
    }

    public boolean k() {
        return this.f52164k;
    }

    public boolean l() {
        return this.f52156c;
    }

    public void m(Map map) {
        this.f52166m = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("profile_sampled").j(iLogger, Boolean.valueOf(this.f52154a));
        interfaceC4813r1.d("profile_sample_rate").j(iLogger, this.f52155b);
        interfaceC4813r1.d("continuous_profile_sampled").j(iLogger, Boolean.valueOf(this.f52162i));
        interfaceC4813r1.d("trace_sampled").j(iLogger, Boolean.valueOf(this.f52156c));
        interfaceC4813r1.d("trace_sample_rate").j(iLogger, this.f52157d);
        interfaceC4813r1.d("profiling_traces_dir_path").j(iLogger, this.f52158e);
        interfaceC4813r1.d("is_profiling_enabled").j(iLogger, Boolean.valueOf(this.f52159f));
        interfaceC4813r1.d("is_continuous_profiling_enabled").j(iLogger, Boolean.valueOf(this.f52160g));
        interfaceC4813r1.d("profile_lifecycle").j(iLogger, this.f52165l.name());
        interfaceC4813r1.d("profiling_traces_hz").j(iLogger, Integer.valueOf(this.f52161h));
        interfaceC4813r1.d("is_enable_app_start_profiling").j(iLogger, Boolean.valueOf(this.f52163j));
        interfaceC4813r1.d("is_start_profiler_on_app_start").j(iLogger, Boolean.valueOf(this.f52164k));
        Map map = this.f52166m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52166m.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C4777l2(F3 f32, l4 l4Var) {
        this.f52156c = l4Var.e().booleanValue();
        this.f52157d = l4Var.d();
        this.f52154a = l4Var.b().booleanValue();
        this.f52155b = l4Var.a();
        this.f52162i = f32.getInternalTracesSampler().c(io.sentry.util.B.a().c());
        this.f52158e = f32.getProfilingTracesDirPath();
        this.f52159f = f32.isProfilingEnabled();
        this.f52160g = f32.isContinuousProfilingEnabled();
        this.f52165l = f32.getProfileLifecycle();
        this.f52161h = f32.getProfilingTracesHz();
        this.f52163j = f32.isEnableAppStartProfiling();
        this.f52164k = f32.isStartProfilerOnAppStart();
    }
}
