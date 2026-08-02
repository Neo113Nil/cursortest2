package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.C4811q3;
import io.sentry.EnumC4830s3;
import io.sentry.d4;
import io.sentry.protocol.u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4798p3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f52249a;

    /* renamed from: b, reason: collision with root package name */
    public d4 f52250b;

    /* renamed from: c, reason: collision with root package name */
    public Double f52251c;

    /* renamed from: d, reason: collision with root package name */
    public String f52252d;

    /* renamed from: e, reason: collision with root package name */
    public EnumC4830s3 f52253e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f52254f;

    /* renamed from: g, reason: collision with root package name */
    public Map f52255g;

    /* renamed from: h, reason: collision with root package name */
    public Map f52256h;

    /* renamed from: io.sentry.p3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4798p3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            io.sentry.protocol.u uVar = null;
            Double d10 = null;
            String str = null;
            HashMap hashMap = null;
            EnumC4830s3 enumC4830s3 = null;
            Map map = null;
            Integer num = null;
            d4 d4Var = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "span_id":
                        d4Var = (d4) interfaceC4809q1.x0(iLogger, new d4.a());
                        break;
                    case "severity_number":
                        num = interfaceC4809q1.Q0();
                        break;
                    case "body":
                        str = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        d10 = interfaceC4809q1.e0();
                        break;
                    case "level":
                        enumC4830s3 = (EnumC4830s3) interfaceC4809q1.x0(iLogger, new EnumC4830s3.a());
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
            if (str == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (enumC4830s3 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            C4798p3 c4798p3 = new C4798p3(uVar, d10, str, enumC4830s3);
            c4798p3.a(map);
            c4798p3.b(num);
            c4798p3.c(d4Var);
            c4798p3.d(hashMap);
            return c4798p3;
        }
    }

    public C4798p3(io.sentry.protocol.u uVar, Double d10, String str, EnumC4830s3 enumC4830s3) {
        this.f52249a = uVar;
        this.f52251c = d10;
        this.f52252d = str;
        this.f52253e = enumC4830s3;
    }

    public void a(Map map) {
        this.f52255g = map;
    }

    public void b(Integer num) {
        this.f52254f = num;
    }

    public void c(d4 d4Var) {
        this.f52250b = d4Var;
    }

    public void d(Map map) {
        this.f52256h = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52251c.doubleValue()));
        interfaceC4813r1.d("trace_id").j(iLogger, this.f52249a);
        if (this.f52250b != null) {
            interfaceC4813r1.d("span_id").j(iLogger, this.f52250b);
        }
        interfaceC4813r1.d("body").e(this.f52252d);
        interfaceC4813r1.d("level").j(iLogger, this.f52253e);
        if (this.f52254f != null) {
            interfaceC4813r1.d("severity_number").j(iLogger, this.f52254f);
        }
        if (this.f52255g != null) {
            interfaceC4813r1.d("attributes").j(iLogger, this.f52255g);
        }
        Map map = this.f52256h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52256h.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
