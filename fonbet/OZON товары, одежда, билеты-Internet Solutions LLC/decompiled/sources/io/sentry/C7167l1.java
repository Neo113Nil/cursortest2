package io.sentry;

import io.sentry.C7171m1;
import io.sentry.profilemeasurements.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7167l1 implements InterfaceC7220x0 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final HashMap f68033A;

    /* renamed from: B, reason: collision with root package name */
    private String f68034B;

    /* renamed from: C, reason: collision with root package name */
    private ConcurrentHashMap f68035C;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f68036a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Callable<List<Integer>> f68037b;

    /* renamed from: c, reason: collision with root package name */
    private int f68038c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f68039d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f68040e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f68041f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f68042g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f68043h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private String f68044i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f68045j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private String f68046k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private List<Integer> f68047l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private String f68048m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private String f68049n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private String f68050o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private ArrayList f68051p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private String f68052q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private String f68053r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private String f68054s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private String f68055t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private String f68056u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private String f68057v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private String f68058w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private String f68059x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private String f68060y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private Date f68061z;

    /* renamed from: io.sentry.l1$a */
    public static final class a implements InterfaceC7174n0<C7167l1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7167l1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7167l1 c7167l1 = new C7167l1(0);
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "device_manufacturer":
                        String k02 = interfaceC7131c1.k0();
                        if (k02 == null) {
                            break;
                        } else {
                            c7167l1.f68040e = k02;
                            break;
                        }
                    case "android_api_level":
                        Integer A12 = interfaceC7131c1.A1();
                        if (A12 == null) {
                            break;
                        } else {
                            c7167l1.f68038c = A12.intValue();
                            break;
                        }
                    case "build_id":
                        String k03 = interfaceC7131c1.k0();
                        if (k03 == null) {
                            break;
                        } else {
                            c7167l1.f68050o = k03;
                            break;
                        }
                    case "device_locale":
                        String k04 = interfaceC7131c1.k0();
                        if (k04 == null) {
                            break;
                        } else {
                            c7167l1.f68039d = k04;
                            break;
                        }
                    case "profile_id":
                        String k05 = interfaceC7131c1.k0();
                        if (k05 == null) {
                            break;
                        } else {
                            c7167l1.f68058w = k05;
                            break;
                        }
                    case "device_os_build_number":
                        String k06 = interfaceC7131c1.k0();
                        if (k06 == null) {
                            break;
                        } else {
                            c7167l1.f68042g = k06;
                            break;
                        }
                    case "device_model":
                        String k07 = interfaceC7131c1.k0();
                        if (k07 == null) {
                            break;
                        } else {
                            c7167l1.f68041f = k07;
                            break;
                        }
                    case "device_is_emulator":
                        Boolean P11 = interfaceC7131c1.P();
                        if (P11 == null) {
                            break;
                        } else {
                            c7167l1.f68045j = P11.booleanValue();
                            break;
                        }
                    case "duration_ns":
                        String k08 = interfaceC7131c1.k0();
                        if (k08 == null) {
                            break;
                        } else {
                            c7167l1.f68053r = k08;
                            break;
                        }
                    case "measurements":
                        HashMap G12 = interfaceC7131c1.G1(iLogger, new a.C1115a());
                        if (G12 == null) {
                            break;
                        } else {
                            ((HashMap) c7167l1.f68033A).putAll(G12);
                            break;
                        }
                    case "device_physical_memory_bytes":
                        String k09 = interfaceC7131c1.k0();
                        if (k09 == null) {
                            break;
                        } else {
                            c7167l1.f68048m = k09;
                            break;
                        }
                    case "device_cpu_frequencies":
                        List list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            c7167l1.f68047l = list;
                            break;
                        }
                    case "version_code":
                        String k010 = interfaceC7131c1.k0();
                        if (k010 == null) {
                            break;
                        } else {
                            c7167l1.f68054s = k010;
                            break;
                        }
                    case "version_name":
                        String k011 = interfaceC7131c1.k0();
                        if (k011 == null) {
                            break;
                        } else {
                            c7167l1.f68055t = k011;
                            break;
                        }
                    case "environment":
                        String k012 = interfaceC7131c1.k0();
                        if (k012 == null) {
                            break;
                        } else {
                            c7167l1.f68059x = k012;
                            break;
                        }
                    case "timestamp":
                        Date M11 = interfaceC7131c1.M(iLogger);
                        if (M11 == null) {
                            break;
                        } else {
                            c7167l1.f68061z = M11;
                            break;
                        }
                    case "transaction_name":
                        String k013 = interfaceC7131c1.k0();
                        if (k013 == null) {
                            break;
                        } else {
                            c7167l1.f68052q = k013;
                            break;
                        }
                    case "device_os_name":
                        String k014 = interfaceC7131c1.k0();
                        if (k014 == null) {
                            break;
                        } else {
                            c7167l1.f68043h = k014;
                            break;
                        }
                    case "architecture":
                        String k015 = interfaceC7131c1.k0();
                        if (k015 == null) {
                            break;
                        } else {
                            c7167l1.f68046k = k015;
                            break;
                        }
                    case "transaction_id":
                        String k016 = interfaceC7131c1.k0();
                        if (k016 == null) {
                            break;
                        } else {
                            c7167l1.f68056u = k016;
                            break;
                        }
                    case "device_os_version":
                        String k017 = interfaceC7131c1.k0();
                        if (k017 == null) {
                            break;
                        } else {
                            c7167l1.f68044i = k017;
                            break;
                        }
                    case "truncation_reason":
                        String k018 = interfaceC7131c1.k0();
                        if (k018 == null) {
                            break;
                        } else {
                            c7167l1.f68060y = k018;
                            break;
                        }
                    case "trace_id":
                        String k019 = interfaceC7131c1.k0();
                        if (k019 == null) {
                            break;
                        } else {
                            c7167l1.f68057v = k019;
                            break;
                        }
                    case "platform":
                        String k020 = interfaceC7131c1.k0();
                        if (k020 == null) {
                            break;
                        } else {
                            c7167l1.f68049n = k020;
                            break;
                        }
                    case "sampled_profile":
                        String k021 = interfaceC7131c1.k0();
                        if (k021 == null) {
                            break;
                        } else {
                            c7167l1.f68034B = k021;
                            break;
                        }
                    case "transactions":
                        ArrayList J02 = interfaceC7131c1.J0(iLogger, new C7171m1.a());
                        if (J02 == null) {
                            break;
                        } else {
                            ((ArrayList) c7167l1.f68051p).addAll(J02);
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
            c7167l1.E(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7167l1;
        }
    }

    /* synthetic */ C7167l1(int i11) {
        this();
    }

    @NotNull
    public final String A() {
        return this.f68058w;
    }

    @NotNull
    public final File B() {
        return this.f68036a;
    }

    public final void C() {
        try {
            this.f68047l = this.f68037b.call();
        } catch (Throwable unused) {
        }
    }

    public final void D(String str) {
        this.f68034B = str;
    }

    public final void E(Map<String, Object> map) {
        this.f68035C = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("android_api_level");
        c7212v0.m(iLogger, Integer.valueOf(this.f68038c));
        c7212v0.g("device_locale");
        c7212v0.m(iLogger, this.f68039d);
        c7212v0.g("device_manufacturer");
        c7212v0.p(this.f68040e);
        c7212v0.g("device_model");
        c7212v0.p(this.f68041f);
        c7212v0.g("device_os_build_number");
        c7212v0.p(this.f68042g);
        c7212v0.g("device_os_name");
        c7212v0.p(this.f68043h);
        c7212v0.g("device_os_version");
        c7212v0.p(this.f68044i);
        c7212v0.g("device_is_emulator");
        c7212v0.q(this.f68045j);
        c7212v0.g("architecture");
        c7212v0.m(iLogger, this.f68046k);
        c7212v0.g("device_cpu_frequencies");
        c7212v0.m(iLogger, this.f68047l);
        c7212v0.g("device_physical_memory_bytes");
        c7212v0.p(this.f68048m);
        c7212v0.g("platform");
        c7212v0.p(this.f68049n);
        c7212v0.g("build_id");
        c7212v0.p(this.f68050o);
        c7212v0.g("transaction_name");
        c7212v0.p(this.f68052q);
        c7212v0.g("duration_ns");
        c7212v0.p(this.f68053r);
        c7212v0.g("version_name");
        c7212v0.p(this.f68055t);
        c7212v0.g("version_code");
        c7212v0.p(this.f68054s);
        ArrayList arrayList = this.f68051p;
        if (!arrayList.isEmpty()) {
            c7212v0.g("transactions");
            c7212v0.m(iLogger, arrayList);
        }
        c7212v0.g("transaction_id");
        c7212v0.p(this.f68056u);
        c7212v0.g("trace_id");
        c7212v0.p(this.f68057v);
        c7212v0.g("profile_id");
        c7212v0.p(this.f68058w);
        c7212v0.g("environment");
        c7212v0.p(this.f68059x);
        c7212v0.g("truncation_reason");
        c7212v0.p(this.f68060y);
        if (this.f68034B != null) {
            c7212v0.g("sampled_profile");
            c7212v0.p(this.f68034B);
        }
        String e11 = c7212v0.e();
        c7212v0.i("");
        c7212v0.g("measurements");
        c7212v0.m(iLogger, this.f68033A);
        c7212v0.i(e11);
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, this.f68061z);
        ConcurrentHashMap concurrentHashMap = this.f68035C;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68035C, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    private C7167l1() {
        this(new File("dummy"), C7165l.b(), new ArrayList(), "", io.sentry.protocol.t.f68325b.toString(), Y0.t().e().o().toString(), "0", 0, "", new Callable() { // from class: io.sentry.k1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ArrayList();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C7167l1(@NotNull File file, @NotNull Date date, @NotNull ArrayList arrayList, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i11, @NotNull String str5, @NotNull Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, @NotNull String str13, @NotNull HashMap hashMap) {
        this.f68047l = new ArrayList();
        this.f68034B = null;
        this.f68036a = file;
        this.f68061z = date;
        this.f68046k = str5;
        this.f68037b = callable;
        this.f68038c = i11;
        this.f68039d = Locale.getDefault().toString();
        this.f68040e = str6 == null ? "" : str6;
        this.f68041f = str7 == null ? "" : str7;
        this.f68044i = str8 != null ? str8 : "";
        this.f68045j = bool != null ? bool.booleanValue() : false;
        this.f68048m = str9 != null ? str9 : "0";
        this.f68042g = "";
        this.f68043h = "android";
        this.f68049n = "android";
        this.f68050o = str10 != null ? str10 : "";
        this.f68051p = arrayList;
        this.f68052q = str.isEmpty() ? "unknown" : str;
        this.f68053r = str4;
        this.f68054s = "";
        this.f68055t = str11 != null ? str11 : "";
        this.f68056u = str2;
        this.f68057v = str3;
        this.f68058w = Z0.c();
        this.f68059x = str12 != null ? str12 : "production";
        this.f68060y = str13;
        if (!str13.equals("normal") && !this.f68060y.equals("timeout") && !this.f68060y.equals("backgrounded")) {
            this.f68060y = "normal";
        }
        this.f68033A = hashMap;
    }
}
