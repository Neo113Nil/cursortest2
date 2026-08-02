package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.J2;
import io.sentry.protocol.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private Long f68374a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f68375b;

    /* renamed from: c, reason: collision with root package name */
    private String f68376c;

    /* renamed from: d, reason: collision with root package name */
    private String f68377d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f68378e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f68379f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f68380g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f68381h;

    /* renamed from: i, reason: collision with root package name */
    private y f68382i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, J2> f68383j;

    /* renamed from: k, reason: collision with root package name */
    private ConcurrentHashMap f68384k;

    public static final class a implements InterfaceC7174n0<z> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final z a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            z zVar = new z();
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "daemon":
                        zVar.f68380g = interfaceC7131c1.P();
                        break;
                    case "priority":
                        zVar.f68375b = interfaceC7131c1.A1();
                        break;
                    case "held_locks":
                        HashMap G12 = interfaceC7131c1.G1(iLogger, new J2.a());
                        if (G12 == null) {
                            break;
                        } else {
                            zVar.f68383j = new HashMap(G12);
                            break;
                        }
                    case "id":
                        zVar.f68374a = interfaceC7131c1.D1();
                        break;
                    case "main":
                        zVar.f68381h = interfaceC7131c1.P();
                        break;
                    case "name":
                        zVar.f68376c = interfaceC7131c1.k0();
                        break;
                    case "state":
                        zVar.f68377d = interfaceC7131c1.k0();
                        break;
                    case "crashed":
                        zVar.f68378e = interfaceC7131c1.P();
                        break;
                    case "current":
                        zVar.f68379f = interfaceC7131c1.P();
                        break;
                    case "stacktrace":
                        zVar.f68382i = (y) interfaceC7131c1.S(iLogger, new y.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            zVar.A(concurrentHashMap);
            interfaceC7131c1.endObject();
            return zVar;
        }
    }

    public final void A(Map<String, Object> map) {
        this.f68384k = (ConcurrentHashMap) map;
    }

    public final Map<String, J2> k() {
        return this.f68383j;
    }

    public final Long l() {
        return this.f68374a;
    }

    public final String m() {
        return this.f68376c;
    }

    public final y n() {
        return this.f68382i;
    }

    public final Boolean o() {
        return this.f68379f;
    }

    public final Boolean p() {
        return this.f68381h;
    }

    public final void q(Boolean bool) {
        this.f68378e = bool;
    }

    public final void r(Boolean bool) {
        this.f68379f = bool;
    }

    public final void s(Boolean bool) {
        this.f68380g = bool;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68374a != null) {
            c7212v0.g("id");
            c7212v0.o(this.f68374a);
        }
        if (this.f68375b != null) {
            c7212v0.g("priority");
            c7212v0.o(this.f68375b);
        }
        if (this.f68376c != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68376c);
        }
        if (this.f68377d != null) {
            c7212v0.g("state");
            c7212v0.p(this.f68377d);
        }
        if (this.f68378e != null) {
            c7212v0.g("crashed");
            c7212v0.n(this.f68378e);
        }
        if (this.f68379f != null) {
            c7212v0.g("current");
            c7212v0.n(this.f68379f);
        }
        if (this.f68380g != null) {
            c7212v0.g("daemon");
            c7212v0.n(this.f68380g);
        }
        if (this.f68381h != null) {
            c7212v0.g("main");
            c7212v0.n(this.f68381h);
        }
        if (this.f68382i != null) {
            c7212v0.g("stacktrace");
            c7212v0.m(iLogger, this.f68382i);
        }
        if (this.f68383j != null) {
            c7212v0.g("held_locks");
            c7212v0.m(iLogger, this.f68383j);
        }
        ConcurrentHashMap concurrentHashMap = this.f68384k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68384k, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Map<String, J2> map) {
        this.f68383j = map;
    }

    public final void u(Long l11) {
        this.f68374a = l11;
    }

    public final void v(Boolean bool) {
        this.f68381h = bool;
    }

    public final void w(String str) {
        this.f68376c = str;
    }

    public final void x(Integer num) {
        this.f68375b = num;
    }

    public final void y(y yVar) {
        this.f68382i = yVar;
    }

    public final void z(String str) {
        this.f68377d = str;
    }
}
