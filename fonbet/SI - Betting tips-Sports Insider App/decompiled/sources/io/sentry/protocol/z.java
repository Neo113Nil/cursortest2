package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.c5;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public List f16943a;

    /* renamed from: b, reason: collision with root package name */
    public List f16944b;

    /* renamed from: c, reason: collision with root package name */
    public Map f16945c;

    /* renamed from: d, reason: collision with root package name */
    public String f16946d;

    /* renamed from: e, reason: collision with root package name */
    public String f16947e;

    /* renamed from: f, reason: collision with root package name */
    public String f16948f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f16949g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f16950h;

    /* renamed from: i, reason: collision with root package name */
    public String f16951i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f16952k;

    /* renamed from: l, reason: collision with root package name */
    public String f16953l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f16954m;

    /* renamed from: n, reason: collision with root package name */
    public String f16955n;

    /* renamed from: o, reason: collision with root package name */
    public String f16956o;

    /* renamed from: p, reason: collision with root package name */
    public String f16957p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f16958r;

    /* renamed from: s, reason: collision with root package name */
    public String f16959s;

    /* renamed from: t, reason: collision with root package name */
    public ConcurrentHashMap f16960t;

    /* renamed from: u, reason: collision with root package name */
    public String f16961u;

    /* renamed from: v, reason: collision with root package name */
    public c5 f16962v;

    public final boolean equals(Object obj) {
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return Objects.equals(this.f16943a, zVar.f16943a) && Objects.equals(this.f16944b, zVar.f16944b) && Objects.equals(this.f16945c, zVar.f16945c) && Objects.equals(this.f16946d, zVar.f16946d) && Objects.equals(this.f16947e, zVar.f16947e) && Objects.equals(this.f16948f, zVar.f16948f) && Objects.equals(this.f16949g, zVar.f16949g) && Objects.equals(this.f16950h, zVar.f16950h) && Objects.equals(this.f16951i, zVar.f16951i) && Objects.equals(this.j, zVar.j) && Objects.equals(this.f16952k, zVar.f16952k) && Objects.equals(this.f16953l, zVar.f16953l) && Objects.equals(this.f16954m, zVar.f16954m) && Objects.equals(this.f16955n, zVar.f16955n) && Objects.equals(this.f16956o, zVar.f16956o) && Objects.equals(this.f16957p, zVar.f16957p) && Objects.equals(this.q, zVar.q) && Objects.equals(this.f16958r, zVar.f16958r) && Objects.equals(this.f16959s, zVar.f16959s) && Objects.equals(this.f16960t, zVar.f16960t) && Objects.equals(this.f16961u, zVar.f16961u) && Objects.equals(this.f16962v, zVar.f16962v);
    }

    public final int hashCode() {
        return Objects.hash(this.f16943a, this.f16944b, this.f16945c, null, this.f16946d, this.f16947e, this.f16948f, this.f16949g, this.f16950h, this.f16951i, this.j, this.f16952k, this.f16953l, this.f16954m, this.f16955n, this.f16956o, this.f16957p, this.q, this.f16958r, this.f16959s, this.f16960t, this.f16961u, this.f16962v);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16946d != null) {
            aVar.u("filename");
            aVar.K(this.f16946d);
        }
        if (this.f16947e != null) {
            aVar.u("function");
            aVar.K(this.f16947e);
        }
        if (this.f16948f != null) {
            aVar.u("module");
            aVar.K(this.f16948f);
        }
        if (this.f16949g != null) {
            aVar.u("lineno");
            aVar.J(this.f16949g);
        }
        if (this.f16950h != null) {
            aVar.u("colno");
            aVar.J(this.f16950h);
        }
        if (this.f16951i != null) {
            aVar.u("abs_path");
            aVar.K(this.f16951i);
        }
        if (this.j != null) {
            aVar.u("context_line");
            aVar.K(this.j);
        }
        if (this.f16952k != null) {
            aVar.u("in_app");
            aVar.I(this.f16952k);
        }
        if (this.f16953l != null) {
            aVar.u("package");
            aVar.K(this.f16953l);
        }
        if (this.f16954m != null) {
            aVar.u("native");
            aVar.I(this.f16954m);
        }
        if (this.f16955n != null) {
            aVar.u("platform");
            aVar.K(this.f16955n);
        }
        if (this.f16956o != null) {
            aVar.u("image_addr");
            aVar.K(this.f16956o);
        }
        if (this.f16957p != null) {
            aVar.u("symbol_addr");
            aVar.K(this.f16957p);
        }
        if (this.q != null) {
            aVar.u("instruction_addr");
            aVar.K(this.q);
        }
        if (this.f16958r != null) {
            aVar.u("addr_mode");
            aVar.K(this.f16958r);
        }
        if (this.f16961u != null) {
            aVar.u("raw_function");
            aVar.K(this.f16961u);
        }
        if (this.f16959s != null) {
            aVar.u("symbol");
            aVar.K(this.f16959s);
        }
        if (this.f16962v != null) {
            aVar.u("lock");
            aVar.H(iLogger, this.f16962v);
        }
        List list = this.f16943a;
        if (list != null && !list.isEmpty()) {
            aVar.u("pre_context");
            aVar.H(iLogger, this.f16943a);
        }
        List list2 = this.f16944b;
        if (list2 != null && !list2.isEmpty()) {
            aVar.u("post_context");
            aVar.H(iLogger, this.f16944b);
        }
        Map map = this.f16945c;
        if (map != null && !map.isEmpty()) {
            aVar.u("vars");
            aVar.H(iLogger, this.f16945c);
        }
        ConcurrentHashMap concurrentHashMap = this.f16960t;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16960t, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
