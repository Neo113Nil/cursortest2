package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    boolean f66671a;

    /* renamed from: b, reason: collision with root package name */
    Double f66672b;

    /* renamed from: c, reason: collision with root package name */
    boolean f66673c;

    /* renamed from: d, reason: collision with root package name */
    Double f66674d;

    /* renamed from: e, reason: collision with root package name */
    String f66675e;

    /* renamed from: f, reason: collision with root package name */
    boolean f66676f;

    /* renamed from: g, reason: collision with root package name */
    boolean f66677g;

    /* renamed from: h, reason: collision with root package name */
    int f66678h;

    /* renamed from: i, reason: collision with root package name */
    boolean f66679i;

    /* renamed from: j, reason: collision with root package name */
    boolean f66680j;

    /* renamed from: k, reason: collision with root package name */
    boolean f66681k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    EnumC7159j1 f66682l;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap f66683m;

    public static final class a implements InterfaceC7174n0<L1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final L1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            L1 l12 = new L1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "is_enable_app_start_profiling":
                        Boolean P11 = interfaceC7131c1.P();
                        if (P11 == null) {
                            break;
                        } else {
                            l12.f66680j = P11.booleanValue();
                            break;
                        }
                    case "trace_sampled":
                        Boolean P12 = interfaceC7131c1.P();
                        if (P12 == null) {
                            break;
                        } else {
                            l12.f66673c = P12.booleanValue();
                            break;
                        }
                    case "profiling_traces_dir_path":
                        String k02 = interfaceC7131c1.k0();
                        if (k02 == null) {
                            break;
                        } else {
                            l12.f66675e = k02;
                            break;
                        }
                    case "is_continuous_profiling_enabled":
                        Boolean P13 = interfaceC7131c1.P();
                        if (P13 == null) {
                            break;
                        } else {
                            l12.f66677g = P13.booleanValue();
                            break;
                        }
                    case "is_profiling_enabled":
                        Boolean P14 = interfaceC7131c1.P();
                        if (P14 == null) {
                            break;
                        } else {
                            l12.f66676f = P14.booleanValue();
                            break;
                        }
                    case "is_start_profiler_on_app_start":
                        Boolean P15 = interfaceC7131c1.P();
                        if (P15 == null) {
                            break;
                        } else {
                            l12.f66681k = P15.booleanValue();
                            break;
                        }
                    case "profile_sampled":
                        Boolean P16 = interfaceC7131c1.P();
                        if (P16 == null) {
                            break;
                        } else {
                            l12.f66671a = P16.booleanValue();
                            break;
                        }
                    case "profile_lifecycle":
                        String k03 = interfaceC7131c1.k0();
                        if (k03 == null) {
                            break;
                        } else {
                            try {
                                l12.f66682l = EnumC7159j1.valueOf(k03);
                                break;
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(I2.ERROR, "Error when deserializing ProfileLifecycle: ".concat(k03), new Object[0]);
                                break;
                            }
                        }
                    case "continuous_profile_sampled":
                        Boolean P17 = interfaceC7131c1.P();
                        if (P17 == null) {
                            break;
                        } else {
                            l12.f66679i = P17.booleanValue();
                            break;
                        }
                    case "profiling_traces_hz":
                        Integer A12 = interfaceC7131c1.A1();
                        if (A12 == null) {
                            break;
                        } else {
                            l12.f66678h = A12.intValue();
                            break;
                        }
                    case "trace_sample_rate":
                        Double g12 = interfaceC7131c1.g1();
                        if (g12 == null) {
                            break;
                        } else {
                            l12.f66674d = g12;
                            break;
                        }
                    case "profile_sample_rate":
                        Double g13 = interfaceC7131c1.g1();
                        if (g13 == null) {
                            break;
                        } else {
                            l12.f66672b = g13;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            l12.m(concurrentHashMap);
            interfaceC7131c1.endObject();
            return l12;
        }
    }

    public L1() {
        this.f66673c = false;
        this.f66674d = null;
        this.f66671a = false;
        this.f66672b = null;
        this.f66679i = false;
        this.f66675e = null;
        this.f66676f = false;
        this.f66677g = false;
        this.f66682l = EnumC7159j1.MANUAL;
        this.f66678h = 0;
        this.f66680j = true;
        this.f66681k = false;
    }

    @NotNull
    public final EnumC7159j1 a() {
        return this.f66682l;
    }

    public final Double b() {
        return this.f66672b;
    }

    public final String c() {
        return this.f66675e;
    }

    public final int d() {
        return this.f66678h;
    }

    public final Double e() {
        return this.f66674d;
    }

    public final boolean f() {
        return this.f66679i;
    }

    public final boolean g() {
        return this.f66677g;
    }

    public final boolean h() {
        return this.f66680j;
    }

    public final boolean i() {
        return this.f66671a;
    }

    public final boolean j() {
        return this.f66676f;
    }

    public final boolean k() {
        return this.f66681k;
    }

    public final boolean l() {
        return this.f66673c;
    }

    public final void m(Map<String, Object> map) {
        this.f66683m = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("profile_sampled");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66671a));
        c7212v0.g("profile_sample_rate");
        c7212v0.m(iLogger, this.f66672b);
        c7212v0.g("continuous_profile_sampled");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66679i));
        c7212v0.g("trace_sampled");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66673c));
        c7212v0.g("trace_sample_rate");
        c7212v0.m(iLogger, this.f66674d);
        c7212v0.g("profiling_traces_dir_path");
        c7212v0.m(iLogger, this.f66675e);
        c7212v0.g("is_profiling_enabled");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66676f));
        c7212v0.g("is_continuous_profiling_enabled");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66677g));
        c7212v0.g("profile_lifecycle");
        c7212v0.m(iLogger, this.f66682l.name());
        c7212v0.g("profiling_traces_hz");
        c7212v0.m(iLogger, Integer.valueOf(this.f66678h));
        c7212v0.g("is_enable_app_start_profiling");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66680j));
        c7212v0.g("is_start_profiler_on_app_start");
        c7212v0.m(iLogger, Boolean.valueOf(this.f66681k));
        ConcurrentHashMap concurrentHashMap = this.f66683m;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f66683m, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    L1(@NotNull W2 w22, @NotNull s3 s3Var) {
        this.f66673c = s3Var.e().booleanValue();
        this.f66674d = s3Var.d();
        this.f66671a = s3Var.b().booleanValue();
        this.f66672b = s3Var.a();
        this.f66679i = w22.getInternalTracesSampler().b(io.sentry.util.u.a().d());
        this.f66675e = w22.getProfilingTracesDirPath();
        this.f66676f = w22.isProfilingEnabled();
        this.f66677g = w22.isContinuousProfilingEnabled();
        this.f66682l = w22.getProfileLifecycle();
        this.f66678h = w22.getProfilingTracesHz();
        this.f66680j = w22.isEnableAppStartProfiling();
        this.f66681k = w22.isStartProfilerOnAppStart();
    }
}
