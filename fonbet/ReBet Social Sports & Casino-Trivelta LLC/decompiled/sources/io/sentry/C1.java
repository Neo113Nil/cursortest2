package io.sentry;

import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import io.sentry.D1;
import io.sentry.profilemeasurements.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class C1 implements G0 {

    /* renamed from: A, reason: collision with root package name */
    public final Map f50209A;

    /* renamed from: B, reason: collision with root package name */
    public String f50210B;

    /* renamed from: C, reason: collision with root package name */
    public Map f50211C;

    /* renamed from: a, reason: collision with root package name */
    public final File f50212a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f50213b;

    /* renamed from: c, reason: collision with root package name */
    public int f50214c;

    /* renamed from: d, reason: collision with root package name */
    public String f50215d;

    /* renamed from: e, reason: collision with root package name */
    public String f50216e;

    /* renamed from: f, reason: collision with root package name */
    public String f50217f;

    /* renamed from: g, reason: collision with root package name */
    public String f50218g;

    /* renamed from: h, reason: collision with root package name */
    public String f50219h;

    /* renamed from: i, reason: collision with root package name */
    public String f50220i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f50221j;

    /* renamed from: k, reason: collision with root package name */
    public String f50222k;

    /* renamed from: l, reason: collision with root package name */
    public List f50223l;

    /* renamed from: m, reason: collision with root package name */
    public String f50224m;

    /* renamed from: n, reason: collision with root package name */
    public String f50225n;

    /* renamed from: o, reason: collision with root package name */
    public String f50226o;

    /* renamed from: p, reason: collision with root package name */
    public List f50227p;

    /* renamed from: q, reason: collision with root package name */
    public String f50228q;

    /* renamed from: r, reason: collision with root package name */
    public String f50229r;

    /* renamed from: s, reason: collision with root package name */
    public String f50230s;

    /* renamed from: t, reason: collision with root package name */
    public String f50231t;

    /* renamed from: u, reason: collision with root package name */
    public String f50232u;

    /* renamed from: v, reason: collision with root package name */
    public String f50233v;

    /* renamed from: w, reason: collision with root package name */
    public String f50234w;

    /* renamed from: x, reason: collision with root package name */
    public String f50235x;

    /* renamed from: y, reason: collision with root package name */
    public String f50236y;

    /* renamed from: z, reason: collision with root package name */
    public Date f50237z;

    public static final class b implements InterfaceC4859w0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            C1 c12 = new C1();
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "device_manufacturer":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            break;
                        } else {
                            c12.f50216e = a12;
                            break;
                        }
                    case "android_api_level":
                        Integer Q02 = interfaceC4809q1.Q0();
                        if (Q02 == null) {
                            break;
                        } else {
                            c12.f50214c = Q02.intValue();
                            break;
                        }
                    case "build_id":
                        String a13 = interfaceC4809q1.a1();
                        if (a13 == null) {
                            break;
                        } else {
                            c12.f50226o = a13;
                            break;
                        }
                    case "device_locale":
                        String a14 = interfaceC4809q1.a1();
                        if (a14 == null) {
                            break;
                        } else {
                            c12.f50215d = a14;
                            break;
                        }
                    case "profile_id":
                        String a15 = interfaceC4809q1.a1();
                        if (a15 == null) {
                            break;
                        } else {
                            c12.f50234w = a15;
                            break;
                        }
                    case "device_os_build_number":
                        String a16 = interfaceC4809q1.a1();
                        if (a16 == null) {
                            break;
                        } else {
                            c12.f50218g = a16;
                            break;
                        }
                    case "device_model":
                        String a17 = interfaceC4809q1.a1();
                        if (a17 == null) {
                            break;
                        } else {
                            c12.f50217f = a17;
                            break;
                        }
                    case "device_is_emulator":
                        Boolean p02 = interfaceC4809q1.p0();
                        if (p02 == null) {
                            break;
                        } else {
                            c12.f50221j = p02.booleanValue();
                            break;
                        }
                    case "duration_ns":
                        String a18 = interfaceC4809q1.a1();
                        if (a18 == null) {
                            break;
                        } else {
                            c12.f50229r = a18;
                            break;
                        }
                    case "measurements":
                        Map e12 = interfaceC4809q1.e1(iLogger, new a.C0766a());
                        if (e12 == null) {
                            break;
                        } else {
                            c12.f50209A.putAll(e12);
                            break;
                        }
                    case "device_physical_memory_bytes":
                        String a19 = interfaceC4809q1.a1();
                        if (a19 == null) {
                            break;
                        } else {
                            c12.f50224m = a19;
                            break;
                        }
                    case "device_cpu_frequencies":
                        List list = (List) interfaceC4809q1.H1();
                        if (list == null) {
                            break;
                        } else {
                            c12.f50223l = list;
                            break;
                        }
                    case "version_code":
                        String a110 = interfaceC4809q1.a1();
                        if (a110 == null) {
                            break;
                        } else {
                            c12.f50230s = a110;
                            break;
                        }
                    case "version_name":
                        String a111 = interfaceC4809q1.a1();
                        if (a111 == null) {
                            break;
                        } else {
                            c12.f50231t = a111;
                            break;
                        }
                    case "environment":
                        String a112 = interfaceC4809q1.a1();
                        if (a112 == null) {
                            break;
                        } else {
                            c12.f50235x = a112;
                            break;
                        }
                    case "timestamp":
                        Date j02 = interfaceC4809q1.j0(iLogger);
                        if (j02 == null) {
                            break;
                        } else {
                            c12.f50237z = j02;
                            break;
                        }
                    case "transaction_name":
                        String a113 = interfaceC4809q1.a1();
                        if (a113 == null) {
                            break;
                        } else {
                            c12.f50228q = a113;
                            break;
                        }
                    case "device_os_name":
                        String a114 = interfaceC4809q1.a1();
                        if (a114 == null) {
                            break;
                        } else {
                            c12.f50219h = a114;
                            break;
                        }
                    case "architecture":
                        String a115 = interfaceC4809q1.a1();
                        if (a115 == null) {
                            break;
                        } else {
                            c12.f50222k = a115;
                            break;
                        }
                    case "transaction_id":
                        String a116 = interfaceC4809q1.a1();
                        if (a116 == null) {
                            break;
                        } else {
                            c12.f50232u = a116;
                            break;
                        }
                    case "device_os_version":
                        String a117 = interfaceC4809q1.a1();
                        if (a117 == null) {
                            break;
                        } else {
                            c12.f50220i = a117;
                            break;
                        }
                    case "truncation_reason":
                        String a118 = interfaceC4809q1.a1();
                        if (a118 == null) {
                            break;
                        } else {
                            c12.f50236y = a118;
                            break;
                        }
                    case "trace_id":
                        String a119 = interfaceC4809q1.a1();
                        if (a119 == null) {
                            break;
                        } else {
                            c12.f50233v = a119;
                            break;
                        }
                    case "platform":
                        String a120 = interfaceC4809q1.a1();
                        if (a120 == null) {
                            break;
                        } else {
                            c12.f50225n = a120;
                            break;
                        }
                    case "sampled_profile":
                        String a121 = interfaceC4809q1.a1();
                        if (a121 == null) {
                            break;
                        } else {
                            c12.f50210B = a121;
                            break;
                        }
                    case "transactions":
                        List P12 = interfaceC4809q1.P1(iLogger, new D1.a());
                        if (P12 == null) {
                            break;
                        } else {
                            c12.f50227p.addAll(P12);
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
            c12.G(concurrentHashMap);
            interfaceC4809q1.t();
            return c12;
        }
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f50234w;
    }

    public File C() {
        return this.f50212a;
    }

    public final boolean D() {
        return this.f50236y.equals("normal") || this.f50236y.equals("timeout") || this.f50236y.equals("backgrounded");
    }

    public void E() {
        try {
            this.f50223l = (List) this.f50213b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.f50210B = str;
    }

    public void G(Map map) {
        this.f50211C = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("android_api_level").j(iLogger, Integer.valueOf(this.f50214c));
        interfaceC4813r1.d("device_locale").j(iLogger, this.f50215d);
        interfaceC4813r1.d("device_manufacturer").e(this.f50216e);
        interfaceC4813r1.d(PublisherMetadata.DEVICE_MODEL).e(this.f50217f);
        interfaceC4813r1.d("device_os_build_number").e(this.f50218g);
        interfaceC4813r1.d("device_os_name").e(this.f50219h);
        interfaceC4813r1.d("device_os_version").e(this.f50220i);
        interfaceC4813r1.d("device_is_emulator").c(this.f50221j);
        interfaceC4813r1.d("architecture").j(iLogger, this.f50222k);
        interfaceC4813r1.d("device_cpu_frequencies").j(iLogger, this.f50223l);
        interfaceC4813r1.d("device_physical_memory_bytes").e(this.f50224m);
        interfaceC4813r1.d(EventKeys.PLATFORM).e(this.f50225n);
        interfaceC4813r1.d("build_id").e(this.f50226o);
        interfaceC4813r1.d("transaction_name").e(this.f50228q);
        interfaceC4813r1.d("duration_ns").e(this.f50229r);
        interfaceC4813r1.d("version_name").e(this.f50231t);
        interfaceC4813r1.d("version_code").e(this.f50230s);
        if (!this.f50227p.isEmpty()) {
            interfaceC4813r1.d("transactions").j(iLogger, this.f50227p);
        }
        interfaceC4813r1.d("transaction_id").e(this.f50232u);
        interfaceC4813r1.d("trace_id").e(this.f50233v);
        interfaceC4813r1.d("profile_id").e(this.f50234w);
        interfaceC4813r1.d("environment").e(this.f50235x);
        interfaceC4813r1.d("truncation_reason").e(this.f50236y);
        if (this.f50210B != null) {
            interfaceC4813r1.d("sampled_profile").e(this.f50210B);
        }
        String f10 = interfaceC4813r1.f();
        interfaceC4813r1.h("");
        interfaceC4813r1.d("measurements").j(iLogger, this.f50209A);
        interfaceC4813r1.h(f10);
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, this.f50237z);
        Map map = this.f50211C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50211C.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C1() {
        this(new File("dummy"), C4781m1.v());
    }

    public C1(File file, InterfaceC4790o0 interfaceC4790o0) {
        this(file, AbstractC4779m.c(), new ArrayList(), interfaceC4790o0.getName(), interfaceC4790o0.h().toString(), interfaceC4790o0.a().q().toString(), "0", 0, "", new Callable() { // from class: io.sentry.B1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1.a();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C1(File file, Date date, List list, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f50223l = new ArrayList();
        this.f50210B = null;
        this.f50212a = file;
        this.f50237z = date;
        this.f50222k = str5;
        this.f50213b = callable;
        this.f50214c = i10;
        this.f50215d = Locale.getDefault().toString();
        this.f50216e = str6 == null ? "" : str6;
        this.f50217f = str7 == null ? "" : str7;
        this.f50220i = str8 == null ? "" : str8;
        this.f50221j = bool != null ? bool.booleanValue() : false;
        this.f50224m = str9 != null ? str9 : "0";
        this.f50218g = "";
        this.f50219h = Constants.PLATFORM_ANDROID;
        this.f50225n = Constants.PLATFORM_ANDROID;
        this.f50226o = str10 != null ? str10 : "";
        this.f50227p = list;
        this.f50228q = str.isEmpty() ? "unknown" : str;
        this.f50229r = str4;
        this.f50230s = "";
        this.f50231t = str11 != null ? str11 : "";
        this.f50232u = str2;
        this.f50233v = str3;
        this.f50234w = T3.a();
        this.f50235x = str12 != null ? str12 : "production";
        this.f50236y = str13;
        if (!D()) {
            this.f50236y = "normal";
        }
        this.f50209A = map;
    }
}
