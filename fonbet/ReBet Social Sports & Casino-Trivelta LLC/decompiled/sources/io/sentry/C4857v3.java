package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.C4811q3;
import io.sentry.d4;
import io.sentry.protocol.u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4857v3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f52827a;

    /* renamed from: b, reason: collision with root package name */
    public d4 f52828b;

    /* renamed from: c, reason: collision with root package name */
    public Double f52829c;

    /* renamed from: d, reason: collision with root package name */
    public String f52830d;

    /* renamed from: e, reason: collision with root package name */
    public String f52831e;

    /* renamed from: f, reason: collision with root package name */
    public String f52832f;

    /* renamed from: g, reason: collision with root package name */
    public Double f52833g;

    /* renamed from: h, reason: collision with root package name */
    public Map f52834h;

    /* renamed from: i, reason: collision with root package name */
    public Map f52835i;

    /* renamed from: io.sentry.v3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4857v3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            HashMap hashMap = null;
            io.sentry.protocol.u uVar = null;
            Double d10 = null;
            String str = null;
            String str2 = null;
            Double d11 = null;
            Map map = null;
            d4 d4Var = null;
            String str3 = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "span_id":
                        d4Var = (d4) interfaceC4809q1.x0(iLogger, new d4.a());
                        break;
                    case "name":
                        str = interfaceC4809q1.a1();
                        break;
                    case "type":
                        str2 = interfaceC4809q1.a1();
                        break;
                    case "unit":
                        str3 = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        d10 = interfaceC4809q1.e0();
                        break;
                    case "value":
                        d11 = interfaceC4809q1.e0();
                        break;
                    case "attributes":
                        map = interfaceC4809q1.e1(iLogger, new C4811q3.a());
                        break;
                    case "trace_id":
                        uVar = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            interfaceC4809q1.t();
            if (uVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (d10 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (str == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (d11 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            C4857v3 c4857v3 = new C4857v3(uVar, d10, str, str2, d11);
            c4857v3.a(map);
            c4857v3.b(d4Var);
            c4857v3.c(str3);
            c4857v3.d(hashMap);
            return c4857v3;
        }
    }

    public C4857v3(io.sentry.protocol.u uVar, Double d10, String str, String str2, Double d11) {
        this.f52827a = uVar;
        this.f52829c = d10;
        this.f52830d = str;
        this.f52832f = str2;
        this.f52833g = d11;
    }

    public void a(Map map) {
        this.f52834h = map;
    }

    public void b(d4 d4Var) {
        this.f52828b = d4Var;
    }

    public void c(String str) {
        this.f52831e = str;
    }

    public void d(Map map) {
        this.f52835i = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52829c.doubleValue()));
        interfaceC4813r1.d("type").e(this.f52832f);
        interfaceC4813r1.d("name").e(this.f52830d);
        interfaceC4813r1.d(EventKeys.VALUE_KEY).i(this.f52833g);
        interfaceC4813r1.d("trace_id").j(iLogger, this.f52827a);
        if (this.f52828b != null) {
            interfaceC4813r1.d("span_id").j(iLogger, this.f52828b);
        }
        if (this.f52831e != null) {
            interfaceC4813r1.d("unit").j(iLogger, this.f52831e);
        }
        if (this.f52834h != null) {
            interfaceC4813r1.d("attributes").j(iLogger, this.f52834h);
        }
        Map map = this.f52835i;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52835i.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
