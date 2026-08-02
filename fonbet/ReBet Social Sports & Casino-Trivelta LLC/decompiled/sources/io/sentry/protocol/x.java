package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.Z3;
import io.sentry.d4;
import io.sentry.f4;
import io.sentry.protocol.l;
import io.sentry.protocol.u;
import io.sentry.util.AbstractC4845c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class x implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f52487a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f52488b;

    /* renamed from: c, reason: collision with root package name */
    public final u f52489c;

    /* renamed from: d, reason: collision with root package name */
    public final d4 f52490d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f52491e;

    /* renamed from: f, reason: collision with root package name */
    public final String f52492f;

    /* renamed from: g, reason: collision with root package name */
    public final String f52493g;

    /* renamed from: h, reason: collision with root package name */
    public final f4 f52494h;

    /* renamed from: i, reason: collision with root package name */
    public final String f52495i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f52496j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52497k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f52498l;

    /* renamed from: m, reason: collision with root package name */
    public Map f52499m;

    public static final class a implements InterfaceC4859w0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map] */
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            HashMap hashMap;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            Double d10 = null;
            HashMap hashMap2 = null;
            u uVar = null;
            d4 d4Var = null;
            Map map = null;
            String str = null;
            Double d11 = null;
            d4 d4Var2 = null;
            String str2 = null;
            f4 f4Var = null;
            String str3 = null;
            Map map2 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d12 = d10;
                HashMap hashMap3 = hashMap2;
                u uVar2 = uVar;
                d4 d4Var3 = d4Var;
                if (interfaceC4809q1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d12 == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (uVar2 == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (d4Var3 == null) {
                        throw c("span_id", iLogger);
                    }
                    if (str == null) {
                        throw c("op", iLogger);
                    }
                    HashMap hashMap4 = hashMap3 == null ? new HashMap() : hashMap3;
                    if (map == null) {
                        map = new HashMap();
                    }
                    x xVar = new x(d12, d11, uVar2, d4Var3, d4Var2, str, str2, f4Var, str3, hashMap4, map, map2);
                    xVar.h(concurrentHashMap2);
                    interfaceC4809q1.t();
                    return xVar;
                }
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "span_id":
                        d4Var = new d4.a().a(interfaceC4809q1, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap2 = hashMap3;
                        uVar = uVar2;
                        break;
                    case "parent_span_id":
                        d4Var2 = (d4) interfaceC4809q1.x0(iLogger, new d4.a());
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "description":
                        str2 = interfaceC4809q1.a1();
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "start_timestamp":
                        try {
                            d10 = interfaceC4809q1.e0();
                        } catch (NumberFormatException unused) {
                            Date j02 = interfaceC4809q1.j0(iLogger);
                            d10 = j02 != null ? Double.valueOf(AbstractC4779m.a(j02)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "origin":
                        str3 = interfaceC4809q1.a1();
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "status":
                        f4Var = (f4) interfaceC4809q1.x0(iLogger, new f4.a());
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "measurements":
                        map = interfaceC4809q1.e1(iLogger, new l.a());
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "op":
                        str = interfaceC4809q1.a1();
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "data":
                        map2 = (Map) interfaceC4809q1.H1();
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "tags":
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = (Map) interfaceC4809q1.H1();
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "timestamp":
                        try {
                            d11 = interfaceC4809q1.e0();
                        } catch (NumberFormatException unused2) {
                            Date j03 = interfaceC4809q1.j0(iLogger);
                            d11 = j03 != null ? Double.valueOf(AbstractC4779m.a(j03)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                    case "trace_id":
                        uVar = new u.a().a(interfaceC4809q1, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        d10 = d12;
                        hashMap2 = hashMap3;
                        d4Var = d4Var3;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        d10 = d12;
                        hashMap = hashMap3;
                        uVar = uVar2;
                        hashMap2 = hashMap;
                        d4Var = d4Var3;
                        break;
                }
            }
        }
    }

    public x(Z3 z32) {
        this(z32, z32.v());
    }

    public Map a() {
        return this.f52497k;
    }

    public Map b() {
        return this.f52498l;
    }

    public String c() {
        return this.f52492f;
    }

    public d4 d() {
        return this.f52490d;
    }

    public Double e() {
        return this.f52487a;
    }

    public Double f() {
        return this.f52488b;
    }

    public void g(Map map) {
        this.f52497k = map;
    }

    public void h(Map map) {
        this.f52499m = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("start_timestamp").j(iLogger, AbstractC4779m.b(this.f52487a.doubleValue()));
        if (this.f52488b != null) {
            interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52488b.doubleValue()));
        }
        interfaceC4813r1.d("trace_id").j(iLogger, this.f52489c);
        interfaceC4813r1.d("span_id").j(iLogger, this.f52490d);
        if (this.f52491e != null) {
            interfaceC4813r1.d("parent_span_id").j(iLogger, this.f52491e);
        }
        interfaceC4813r1.d("op").e(this.f52492f);
        if (this.f52493g != null) {
            interfaceC4813r1.d("description").e(this.f52493g);
        }
        if (this.f52494h != null) {
            interfaceC4813r1.d("status").j(iLogger, this.f52494h);
        }
        if (this.f52495i != null) {
            interfaceC4813r1.d("origin").j(iLogger, this.f52495i);
        }
        if (!this.f52496j.isEmpty()) {
            interfaceC4813r1.d("tags").j(iLogger, this.f52496j);
        }
        if (this.f52497k != null) {
            interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52497k);
        }
        if (!this.f52498l.isEmpty()) {
            interfaceC4813r1.d("measurements").j(iLogger, this.f52498l);
        }
        Map map = this.f52499m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52499m.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public x(Z3 z32, Map map) {
        io.sentry.util.w.c(z32, "span is required");
        this.f52493g = z32.getDescription();
        this.f52492f = z32.y();
        this.f52490d = z32.D();
        this.f52491e = z32.A();
        this.f52489c = z32.F();
        this.f52494h = z32.getStatus();
        this.f52495i = z32.a().h();
        Map b10 = AbstractC4845c.b(z32.E());
        this.f52496j = b10 == null ? new ConcurrentHashMap() : b10;
        Map b11 = AbstractC4845c.b(z32.x());
        this.f52498l = b11 == null ? new ConcurrentHashMap() : b11;
        this.f52488b = z32.s() == null ? null : Double.valueOf(AbstractC4779m.m(z32.u().e(z32.s())));
        this.f52487a = Double.valueOf(AbstractC4779m.m(z32.u().f()));
        this.f52497k = map;
        C4806h l10 = z32.a().e().l();
        if (l10 != null) {
            if (this.f52497k == null) {
                this.f52497k = new HashMap();
            }
            for (C4805g c4805g : l10.a()) {
                this.f52497k.put("flag.evaluation." + c4805g.a(), c4805g.b());
            }
        }
    }

    public x(Double d10, Double d11, u uVar, d4 d4Var, d4 d4Var2, String str, String str2, f4 f4Var, String str3, Map map, Map map2, Map map3) {
        this.f52487a = d10;
        this.f52488b = d11;
        this.f52489c = uVar;
        this.f52490d = d4Var;
        this.f52491e = d4Var2;
        this.f52492f = str;
        this.f52493g = str2;
        this.f52494h = f4Var;
        this.f52495i = str3;
        this.f52496j = map;
        this.f52498l = map2;
        this.f52497k = map3;
    }
}
