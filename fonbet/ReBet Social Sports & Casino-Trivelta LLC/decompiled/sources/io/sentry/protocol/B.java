package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4779m;
import io.sentry.AbstractC4810q2;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.S3;
import io.sentry.Z3;
import io.sentry.a4;
import io.sentry.l4;
import io.sentry.protocol.D;
import io.sentry.protocol.l;
import io.sentry.protocol.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class B extends AbstractC4810q2 implements G0 {

    /* renamed from: p, reason: collision with root package name */
    public String f52276p;

    /* renamed from: q, reason: collision with root package name */
    public Double f52277q;

    /* renamed from: r, reason: collision with root package name */
    public Double f52278r;

    /* renamed from: s, reason: collision with root package name */
    public final List f52279s;

    /* renamed from: t, reason: collision with root package name */
    public final String f52280t;

    /* renamed from: u, reason: collision with root package name */
    public final Map f52281u;

    /* renamed from: v, reason: collision with root package name */
    public D f52282v;

    /* renamed from: w, reason: collision with root package name */
    public Map f52283w;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public B a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            B b10 = new B("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new D(E.CUSTOM.apiName()));
            AbstractC4810q2.a aVar = new AbstractC4810q2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "start_timestamp":
                        try {
                            Double e02 = interfaceC4809q1.e0();
                            if (e02 == null) {
                                break;
                            } else {
                                b10.f52277q = e02;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date j02 = interfaceC4809q1.j0(iLogger);
                            if (j02 == null) {
                                break;
                            } else {
                                b10.f52277q = Double.valueOf(AbstractC4779m.a(j02));
                                break;
                            }
                        }
                    case "measurements":
                        Map e12 = interfaceC4809q1.e1(iLogger, new l.a());
                        if (e12 == null) {
                            break;
                        } else {
                            b10.f52281u.putAll(e12);
                            break;
                        }
                    case "type":
                        interfaceC4809q1.M0();
                        break;
                    case "timestamp":
                        try {
                            Double e03 = interfaceC4809q1.e0();
                            if (e03 == null) {
                                break;
                            } else {
                                b10.f52278r = e03;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date j03 = interfaceC4809q1.j0(iLogger);
                            if (j03 == null) {
                                break;
                            } else {
                                b10.f52278r = Double.valueOf(AbstractC4779m.a(j03));
                                break;
                            }
                        }
                    case "spans":
                        List P12 = interfaceC4809q1.P1(iLogger, new x.a());
                        if (P12 == null) {
                            break;
                        } else {
                            b10.f52279s.addAll(P12);
                            break;
                        }
                    case "transaction_info":
                        b10.f52282v = new D.a().a(interfaceC4809q1, iLogger);
                        break;
                    case "transaction":
                        b10.f52276p = interfaceC4809q1.a1();
                        break;
                    default:
                        if (!aVar.a(b10, f02, interfaceC4809q1, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            b10.s0(concurrentHashMap);
            interfaceC4809q1.t();
            return b10;
        }
    }

    public B(S3 s32) {
        super(s32.h());
        this.f52279s = new ArrayList();
        this.f52280t = "transaction";
        this.f52281u = new HashMap();
        io.sentry.util.w.c(s32, "sentryTracer is required");
        this.f52277q = Double.valueOf(AbstractC4779m.m(s32.u().f()));
        this.f52278r = Double.valueOf(AbstractC4779m.m(s32.u().e(s32.s())));
        this.f52276p = s32.getName();
        for (Z3 z32 : s32.I()) {
            if (Boolean.TRUE.equals(z32.b())) {
                this.f52279s.add(new x(z32));
            }
        }
        C4802d C10 = C();
        C10.m(s32.J());
        a4 a10 = s32.a();
        Map K10 = s32.K();
        a4 a4Var = new a4(a10.q(), a10.n(), a10.i(), a10.g(), a10.d(), a10.m(), a10.o(), a10.h());
        for (Map.Entry entry : a10.p().entrySet()) {
            d0((String) entry.getKey(), (String) entry.getValue());
        }
        if (K10 != null) {
            for (Map.Entry entry2 : K10.entrySet()) {
                a4Var.r((String) entry2.getKey(), entry2.getValue());
            }
        }
        C4806h l10 = a10.e().l();
        if (l10 != null) {
            for (C4805g c4805g : l10.a()) {
                a4Var.r("flag.evaluation." + c4805g.a(), c4805g.b());
            }
        }
        C10.A(a4Var);
        this.f52282v = new D(s32.P().apiName());
    }

    public Map m0() {
        return this.f52281u;
    }

    public l4 n0() {
        a4 j10 = C().j();
        if (j10 == null) {
            return null;
        }
        return j10.m();
    }

    public List o0() {
        return this.f52279s;
    }

    public String p0() {
        return this.f52276p;
    }

    public boolean q0() {
        return this.f52278r != null;
    }

    public boolean r0() {
        l4 n02 = n0();
        if (n02 == null) {
            return false;
        }
        return n02.e().booleanValue();
    }

    public void s0(Map map) {
        this.f52283w = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52276p != null) {
            interfaceC4813r1.d("transaction").e(this.f52276p);
        }
        interfaceC4813r1.d("start_timestamp").j(iLogger, AbstractC4779m.b(this.f52277q.doubleValue()));
        if (this.f52278r != null) {
            interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, AbstractC4779m.b(this.f52278r.doubleValue()));
        }
        if (!this.f52279s.isEmpty()) {
            interfaceC4813r1.d("spans").j(iLogger, this.f52279s);
        }
        interfaceC4813r1.d("type").e("transaction");
        if (!this.f52281u.isEmpty()) {
            interfaceC4813r1.d("measurements").j(iLogger, this.f52281u);
        }
        interfaceC4813r1.d("transaction_info").j(iLogger, this.f52282v);
        new AbstractC4810q2.b().a(this, interfaceC4813r1, iLogger);
        Map map = this.f52283w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52283w.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public B(String str, Double d10, Double d11, List list, Map map, D d12) {
        ArrayList arrayList = new ArrayList();
        this.f52279s = arrayList;
        this.f52280t = "transaction";
        HashMap hashMap = new HashMap();
        this.f52281u = hashMap;
        this.f52276p = str;
        this.f52277q = d10;
        this.f52278r = d11;
        arrayList.addAll(list);
        hashMap.putAll(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f52281u.putAll(((x) it.next()).b());
        }
        this.f52282v = d12;
    }
}
