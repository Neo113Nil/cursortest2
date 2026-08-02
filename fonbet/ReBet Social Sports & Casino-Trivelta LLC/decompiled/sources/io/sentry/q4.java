package io.sentry;

import io.sentry.protocol.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q4 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f52546a;

    /* renamed from: b, reason: collision with root package name */
    public String f52547b;

    /* renamed from: c, reason: collision with root package name */
    public String f52548c;

    /* renamed from: d, reason: collision with root package name */
    public String f52549d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52550e;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q4 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            io.sentry.protocol.u uVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "comments":
                        str3 = interfaceC4809q1.a1();
                        break;
                    case "name":
                        str = interfaceC4809q1.a1();
                        break;
                    case "email":
                        str2 = interfaceC4809q1.a1();
                        break;
                    case "event_id":
                        uVar = new u.a().a(interfaceC4809q1, iLogger);
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
            if (uVar != null) {
                q4 q4Var = new q4(uVar, str, str2, str3);
                q4Var.a(hashMap);
                return q4Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.b(EnumC4788n3.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public q4(io.sentry.protocol.u uVar, String str, String str2, String str3) {
        this.f52546a = uVar;
        this.f52547b = str;
        this.f52548c = str2;
        this.f52549d = str3;
    }

    public void a(Map map) {
        this.f52550e = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("event_id");
        this.f52546a.serialize(interfaceC4813r1, iLogger);
        if (this.f52547b != null) {
            interfaceC4813r1.d("name").e(this.f52547b);
        }
        if (this.f52548c != null) {
            interfaceC4813r1.d("email").e(this.f52548c);
        }
        if (this.f52549d != null) {
            interfaceC4813r1.d("comments").e(this.f52549d);
        }
        Map map = this.f52550e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52550e.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f52546a + ", name='" + this.f52547b + "', email='" + this.f52548c + "', comments='" + this.f52549d + "'}";
    }
}
