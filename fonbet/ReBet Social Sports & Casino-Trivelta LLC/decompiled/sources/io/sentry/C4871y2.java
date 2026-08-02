package io.sentry;

import io.sentry.j4;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4871y2 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f52910a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.s f52911b;

    /* renamed from: c, reason: collision with root package name */
    public final j4 f52912c;

    /* renamed from: d, reason: collision with root package name */
    public Date f52913d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52914e;

    /* renamed from: io.sentry.y2$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4871y2 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            io.sentry.protocol.u uVar = null;
            io.sentry.protocol.s sVar = null;
            j4 j4Var = null;
            Date date = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "sdk":
                        sVar = (io.sentry.protocol.s) interfaceC4809q1.x0(iLogger, new s.a());
                        break;
                    case "trace":
                        j4Var = (j4) interfaceC4809q1.x0(iLogger, new j4.a());
                        break;
                    case "event_id":
                        uVar = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                        break;
                    case "sent_at":
                        date = interfaceC4809q1.j0(iLogger);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            C4871y2 c4871y2 = new C4871y2(uVar, sVar, j4Var);
            c4871y2.d(date);
            c4871y2.e(hashMap);
            interfaceC4809q1.t();
            return c4871y2;
        }
    }

    public C4871y2(io.sentry.protocol.u uVar, io.sentry.protocol.s sVar) {
        this(uVar, sVar, null);
    }

    public io.sentry.protocol.u a() {
        return this.f52910a;
    }

    public io.sentry.protocol.s b() {
        return this.f52911b;
    }

    public j4 c() {
        return this.f52912c;
    }

    public void d(Date date) {
        this.f52913d = date;
    }

    public void e(Map map) {
        this.f52914e = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52910a != null) {
            interfaceC4813r1.d("event_id").j(iLogger, this.f52910a);
        }
        if (this.f52911b != null) {
            interfaceC4813r1.d("sdk").j(iLogger, this.f52911b);
        }
        if (this.f52912c != null) {
            interfaceC4813r1.d("trace").j(iLogger, this.f52912c);
        }
        if (this.f52913d != null) {
            interfaceC4813r1.d("sent_at").j(iLogger, AbstractC4779m.g(this.f52913d));
        }
        Map map = this.f52914e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52914e.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C4871y2(io.sentry.protocol.u uVar, io.sentry.protocol.s sVar, j4 j4Var) {
        this.f52910a = uVar;
        this.f52911b = sVar;
        this.f52912c = j4Var;
    }
}
