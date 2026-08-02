package io.sentry.protocol;

import com.twilio.voice.EventKeys;
import io.sentry.C4793o3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class y implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public List f52500a;

    /* renamed from: b, reason: collision with root package name */
    public List f52501b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52502c;

    /* renamed from: d, reason: collision with root package name */
    public List f52503d;

    /* renamed from: e, reason: collision with root package name */
    public String f52504e;

    /* renamed from: f, reason: collision with root package name */
    public String f52505f;

    /* renamed from: g, reason: collision with root package name */
    public String f52506g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f52507h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f52508i;

    /* renamed from: j, reason: collision with root package name */
    public String f52509j;

    /* renamed from: k, reason: collision with root package name */
    public String f52510k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f52511l;

    /* renamed from: m, reason: collision with root package name */
    public String f52512m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f52513n;

    /* renamed from: o, reason: collision with root package name */
    public String f52514o;

    /* renamed from: p, reason: collision with root package name */
    public String f52515p;

    /* renamed from: q, reason: collision with root package name */
    public String f52516q;

    /* renamed from: r, reason: collision with root package name */
    public String f52517r;

    /* renamed from: s, reason: collision with root package name */
    public String f52518s;

    /* renamed from: t, reason: collision with root package name */
    public String f52519t;

    /* renamed from: u, reason: collision with root package name */
    public Map f52520u;

    /* renamed from: v, reason: collision with root package name */
    public String f52521v;

    /* renamed from: w, reason: collision with root package name */
    public C4793o3 f52522w;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            y yVar = new y();
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "post_context":
                        yVar.f52501b = (List) interfaceC4809q1.H1();
                        break;
                    case "image_addr":
                        yVar.f52515p = interfaceC4809q1.a1();
                        break;
                    case "in_app":
                        yVar.f52511l = interfaceC4809q1.p0();
                        break;
                    case "raw_function":
                        yVar.f52521v = interfaceC4809q1.a1();
                        break;
                    case "lineno":
                        yVar.f52507h = interfaceC4809q1.Q0();
                        break;
                    case "module":
                        yVar.f52506g = interfaceC4809q1.a1();
                        break;
                    case "native":
                        yVar.f52513n = interfaceC4809q1.p0();
                        break;
                    case "symbol":
                        yVar.f52519t = interfaceC4809q1.a1();
                        break;
                    case "package":
                        yVar.f52512m = interfaceC4809q1.a1();
                        break;
                    case "filename":
                        yVar.f52504e = interfaceC4809q1.a1();
                        break;
                    case "symbol_addr":
                        yVar.f52516q = interfaceC4809q1.a1();
                        break;
                    case "lock":
                        yVar.f52522w = (C4793o3) interfaceC4809q1.x0(iLogger, new C4793o3.a());
                        break;
                    case "vars":
                        yVar.f52502c = (Map) interfaceC4809q1.H1();
                        break;
                    case "colno":
                        yVar.f52508i = interfaceC4809q1.Q0();
                        break;
                    case "instruction_addr":
                        yVar.f52517r = interfaceC4809q1.a1();
                        break;
                    case "pre_context":
                        yVar.f52500a = (List) interfaceC4809q1.H1();
                        break;
                    case "addr_mode":
                        yVar.f52518s = interfaceC4809q1.a1();
                        break;
                    case "context_line":
                        yVar.f52510k = interfaceC4809q1.a1();
                        break;
                    case "function":
                        yVar.f52505f = interfaceC4809q1.a1();
                        break;
                    case "abs_path":
                        yVar.f52509j = interfaceC4809q1.a1();
                        break;
                    case "platform":
                        yVar.f52514o = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            yVar.I(concurrentHashMap);
            interfaceC4809q1.t();
            return yVar;
        }
    }

    public void A(Boolean bool) {
        this.f52511l = bool;
    }

    public void B(String str) {
        this.f52517r = str;
    }

    public void C(Integer num) {
        this.f52507h = num;
    }

    public void D(C4793o3 c4793o3) {
        this.f52522w = c4793o3;
    }

    public void E(String str) {
        this.f52506g = str;
    }

    public void F(Boolean bool) {
        this.f52513n = bool;
    }

    public void G(String str) {
        this.f52512m = str;
    }

    public void H(String str) {
        this.f52514o = str;
    }

    public void I(Map map) {
        this.f52520u = map;
    }

    public boolean equals(Object obj) {
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Objects.equals(this.f52500a, yVar.f52500a) && Objects.equals(this.f52501b, yVar.f52501b) && Objects.equals(this.f52502c, yVar.f52502c) && Objects.equals(this.f52503d, yVar.f52503d) && Objects.equals(this.f52504e, yVar.f52504e) && Objects.equals(this.f52505f, yVar.f52505f) && Objects.equals(this.f52506g, yVar.f52506g) && Objects.equals(this.f52507h, yVar.f52507h) && Objects.equals(this.f52508i, yVar.f52508i) && Objects.equals(this.f52509j, yVar.f52509j) && Objects.equals(this.f52510k, yVar.f52510k) && Objects.equals(this.f52511l, yVar.f52511l) && Objects.equals(this.f52512m, yVar.f52512m) && Objects.equals(this.f52513n, yVar.f52513n) && Objects.equals(this.f52514o, yVar.f52514o) && Objects.equals(this.f52515p, yVar.f52515p) && Objects.equals(this.f52516q, yVar.f52516q) && Objects.equals(this.f52517r, yVar.f52517r) && Objects.equals(this.f52518s, yVar.f52518s) && Objects.equals(this.f52519t, yVar.f52519t) && Objects.equals(this.f52520u, yVar.f52520u) && Objects.equals(this.f52521v, yVar.f52521v) && Objects.equals(this.f52522w, yVar.f52522w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f52500a, this.f52501b, this.f52502c, this.f52503d, this.f52504e, this.f52505f, this.f52506g, this.f52507h, this.f52508i, this.f52509j, this.f52510k, this.f52511l, this.f52512m, this.f52513n, this.f52514o, this.f52515p, this.f52516q, this.f52517r, this.f52518s, this.f52519t, this.f52520u, this.f52521v, this.f52522w);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52504e != null) {
            interfaceC4813r1.d("filename").e(this.f52504e);
        }
        if (this.f52505f != null) {
            interfaceC4813r1.d("function").e(this.f52505f);
        }
        if (this.f52506g != null) {
            interfaceC4813r1.d("module").e(this.f52506g);
        }
        if (this.f52507h != null) {
            interfaceC4813r1.d("lineno").i(this.f52507h);
        }
        if (this.f52508i != null) {
            interfaceC4813r1.d("colno").i(this.f52508i);
        }
        if (this.f52509j != null) {
            interfaceC4813r1.d("abs_path").e(this.f52509j);
        }
        if (this.f52510k != null) {
            interfaceC4813r1.d("context_line").e(this.f52510k);
        }
        if (this.f52511l != null) {
            interfaceC4813r1.d("in_app").k(this.f52511l);
        }
        if (this.f52512m != null) {
            interfaceC4813r1.d("package").e(this.f52512m);
        }
        if (this.f52513n != null) {
            interfaceC4813r1.d("native").k(this.f52513n);
        }
        if (this.f52514o != null) {
            interfaceC4813r1.d(EventKeys.PLATFORM).e(this.f52514o);
        }
        if (this.f52515p != null) {
            interfaceC4813r1.d("image_addr").e(this.f52515p);
        }
        if (this.f52516q != null) {
            interfaceC4813r1.d("symbol_addr").e(this.f52516q);
        }
        if (this.f52517r != null) {
            interfaceC4813r1.d("instruction_addr").e(this.f52517r);
        }
        if (this.f52518s != null) {
            interfaceC4813r1.d("addr_mode").e(this.f52518s);
        }
        if (this.f52521v != null) {
            interfaceC4813r1.d("raw_function").e(this.f52521v);
        }
        if (this.f52519t != null) {
            interfaceC4813r1.d("symbol").e(this.f52519t);
        }
        if (this.f52522w != null) {
            interfaceC4813r1.d("lock").j(iLogger, this.f52522w);
        }
        List list = this.f52500a;
        if (list != null && !list.isEmpty()) {
            interfaceC4813r1.d("pre_context").j(iLogger, this.f52500a);
        }
        List list2 = this.f52501b;
        if (list2 != null && !list2.isEmpty()) {
            interfaceC4813r1.d("post_context").j(iLogger, this.f52501b);
        }
        Map map = this.f52502c;
        if (map != null && !map.isEmpty()) {
            interfaceC4813r1.d("vars").j(iLogger, this.f52502c);
        }
        Map map2 = this.f52520u;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f52520u.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public String v() {
        return this.f52506g;
    }

    public Boolean w() {
        return this.f52511l;
    }

    public void x(String str) {
        this.f52518s = str;
    }

    public void y(String str) {
        this.f52504e = str;
    }

    public void z(String str) {
        this.f52505f = str;
    }
}
