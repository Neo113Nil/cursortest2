package io.sentry;

import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import io.sentry.profilemeasurements.a;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.profiling.a;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4870y1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public C4803e f52890a;

    /* renamed from: b, reason: collision with root package name */
    public io.sentry.protocol.u f52891b;

    /* renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.u f52892c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.s f52893d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f52894e;

    /* renamed from: f, reason: collision with root package name */
    public String f52895f;

    /* renamed from: g, reason: collision with root package name */
    public String f52896g;

    /* renamed from: h, reason: collision with root package name */
    public String f52897h;

    /* renamed from: i, reason: collision with root package name */
    public String f52898i;

    /* renamed from: j, reason: collision with root package name */
    public double f52899j;

    /* renamed from: k, reason: collision with root package name */
    public final File f52900k;

    /* renamed from: l, reason: collision with root package name */
    public String f52901l;

    /* renamed from: m, reason: collision with root package name */
    public io.sentry.protocol.profiling.a f52902m;

    /* renamed from: n, reason: collision with root package name */
    public Map f52903n;

    /* renamed from: io.sentry.y1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final io.sentry.protocol.u f52904a;

        /* renamed from: b, reason: collision with root package name */
        public final io.sentry.protocol.u f52905b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f52906c;

        /* renamed from: d, reason: collision with root package name */
        public final File f52907d;

        /* renamed from: e, reason: collision with root package name */
        public final double f52908e;

        /* renamed from: f, reason: collision with root package name */
        public final String f52909f;

        public a(io.sentry.protocol.u uVar, io.sentry.protocol.u uVar2, Map map, File file, AbstractC4856v2 abstractC4856v2, String str) {
            this.f52904a = uVar;
            this.f52905b = uVar2;
            this.f52906c = new ConcurrentHashMap(map);
            this.f52907d = file;
            this.f52908e = AbstractC4779m.m(abstractC4856v2.f());
            this.f52909f = str;
        }

        public C4870y1 a(F3 f32) {
            return new C4870y1(this.f52904a, this.f52905b, this.f52907d, this.f52906c, Double.valueOf(this.f52908e), this.f52909f, f32);
        }
    }

    /* renamed from: io.sentry.y1$b */
    public static final class b implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4870y1 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            C4870y1 c4870y1 = new C4870y1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "debug_meta":
                        C4803e c4803e = (C4803e) interfaceC4809q1.x0(iLogger, new C4803e.a());
                        if (c4803e == null) {
                            break;
                        } else {
                            c4870y1.f52890a = c4803e;
                            break;
                        }
                    case "measurements":
                        Map e12 = interfaceC4809q1.e1(iLogger, new a.C0766a());
                        if (e12 == null) {
                            break;
                        } else {
                            c4870y1.f52894e.putAll(e12);
                            break;
                        }
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) interfaceC4809q1.x0(iLogger, new a.b());
                        if (aVar == null) {
                            break;
                        } else {
                            c4870y1.f52902m = aVar;
                            break;
                        }
                    case "environment":
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null) {
                            break;
                        } else {
                            c4870y1.f52897h = a12;
                            break;
                        }
                    case "timestamp":
                        Double e02 = interfaceC4809q1.e0();
                        if (e02 == null) {
                            break;
                        } else {
                            c4870y1.f52899j = e02.doubleValue();
                            break;
                        }
                    case "profiler_id":
                        io.sentry.protocol.u uVar = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                        if (uVar == null) {
                            break;
                        } else {
                            c4870y1.f52891b = uVar;
                            break;
                        }
                    case "version":
                        String a13 = interfaceC4809q1.a1();
                        if (a13 == null) {
                            break;
                        } else {
                            c4870y1.f52898i = a13;
                            break;
                        }
                    case "release":
                        String a14 = interfaceC4809q1.a1();
                        if (a14 == null) {
                            break;
                        } else {
                            c4870y1.f52896g = a14;
                            break;
                        }
                    case "client_sdk":
                        io.sentry.protocol.s sVar = (io.sentry.protocol.s) interfaceC4809q1.x0(iLogger, new s.a());
                        if (sVar == null) {
                            break;
                        } else {
                            c4870y1.f52893d = sVar;
                            break;
                        }
                    case "platform":
                        String a15 = interfaceC4809q1.a1();
                        if (a15 == null) {
                            break;
                        } else {
                            c4870y1.f52895f = a15;
                            break;
                        }
                    case "sampled_profile":
                        String a16 = interfaceC4809q1.a1();
                        if (a16 == null) {
                            break;
                        } else {
                            c4870y1.f52901l = a16;
                            break;
                        }
                    case "chunk_id":
                        io.sentry.protocol.u uVar2 = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                        if (uVar2 == null) {
                            break;
                        } else {
                            c4870y1.f52892c = uVar2;
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
            c4870y1.u(concurrentHashMap);
            interfaceC4809q1.t();
            return c4870y1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4870y1() {
        this(r1, r1, null, new HashMap(), Double.valueOf(0.0d), Constants.PLATFORM_ANDROID, F3.empty());
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4870y1)) {
            return false;
        }
        C4870y1 c4870y1 = (C4870y1) obj;
        return Objects.equals(this.f52890a, c4870y1.f52890a) && Objects.equals(this.f52891b, c4870y1.f52891b) && Objects.equals(this.f52892c, c4870y1.f52892c) && Objects.equals(this.f52893d, c4870y1.f52893d) && Objects.equals(this.f52894e, c4870y1.f52894e) && Objects.equals(this.f52895f, c4870y1.f52895f) && Objects.equals(this.f52896g, c4870y1.f52896g) && Objects.equals(this.f52897h, c4870y1.f52897h) && Objects.equals(this.f52898i, c4870y1.f52898i) && Objects.equals(this.f52901l, c4870y1.f52901l) && Objects.equals(this.f52903n, c4870y1.f52903n) && Objects.equals(this.f52902m, c4870y1.f52902m);
    }

    public int hashCode() {
        return Objects.hash(this.f52890a, this.f52891b, this.f52892c, this.f52893d, this.f52894e, this.f52895f, this.f52896g, this.f52897h, this.f52898i, this.f52901l, this.f52902m, this.f52903n);
    }

    public io.sentry.protocol.u m() {
        return this.f52892c;
    }

    public C4803e n() {
        return this.f52890a;
    }

    public String o() {
        return this.f52895f;
    }

    public io.sentry.protocol.u p() {
        return this.f52891b;
    }

    public File q() {
        return this.f52900k;
    }

    public void r(C4803e c4803e) {
        this.f52890a = c4803e;
    }

    public void s(String str) {
        this.f52901l = str;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52890a != null) {
            interfaceC4813r1.d("debug_meta").j(iLogger, this.f52890a);
        }
        interfaceC4813r1.d("profiler_id").j(iLogger, this.f52891b);
        interfaceC4813r1.d("chunk_id").j(iLogger, this.f52892c);
        if (this.f52893d != null) {
            interfaceC4813r1.d("client_sdk").j(iLogger, this.f52893d);
        }
        if (!this.f52894e.isEmpty()) {
            String f10 = interfaceC4813r1.f();
            interfaceC4813r1.h("");
            interfaceC4813r1.d("measurements").j(iLogger, this.f52894e);
            interfaceC4813r1.h(f10);
        }
        interfaceC4813r1.d(EventKeys.PLATFORM).j(iLogger, this.f52895f);
        interfaceC4813r1.d("release").j(iLogger, this.f52896g);
        if (this.f52897h != null) {
            interfaceC4813r1.d("environment").j(iLogger, this.f52897h);
        }
        interfaceC4813r1.d("version").j(iLogger, this.f52898i);
        if (this.f52901l != null) {
            interfaceC4813r1.d("sampled_profile").j(iLogger, this.f52901l);
        }
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52899j));
        if (this.f52902m != null) {
            interfaceC4813r1.d("profile").j(iLogger, this.f52902m);
        }
        Map map = this.f52903n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52903n.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public void t(io.sentry.protocol.profiling.a aVar) {
        this.f52902m = aVar;
    }

    public void u(Map map) {
        this.f52903n = map;
    }

    public C4870y1(io.sentry.protocol.u uVar, io.sentry.protocol.u uVar2, File file, Map map, Double d10, String str, F3 f32) {
        this.f52901l = null;
        this.f52891b = uVar;
        this.f52892c = uVar2;
        this.f52900k = file;
        this.f52894e = map;
        this.f52890a = null;
        this.f52893d = f32.getSdkVersion();
        this.f52896g = f32.getRelease() != null ? f32.getRelease() : "";
        this.f52897h = f32.getEnvironment();
        this.f52895f = str;
        this.f52898i = "2";
        this.f52899j = d10.doubleValue();
    }
}
