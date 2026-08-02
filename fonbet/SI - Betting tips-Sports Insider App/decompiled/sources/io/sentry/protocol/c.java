package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import io.sentry.h3;
import io.sentry.n6;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16754a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16755b = new io.sentry.util.a();

    public c() {
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f16754a.containsKey(obj);
    }

    public Set b() {
        return this.f16754a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f16754a.get(obj);
    }

    public a d() {
        return (a) w(a.class, "app");
    }

    public f e() {
        return (f) w(f.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f16754a.equals(((c) obj).f16754a);
    }

    public h f() {
        return (h) w(h.class, "flags");
    }

    public o g() {
        return (o) w(o.class, "os");
    }

    public x h() {
        return (x) w(x.class, "runtime");
    }

    public final int hashCode() {
        return this.f16754a.hashCode();
    }

    public n6 i() {
        return (n6) w(n6.class, "trace");
    }

    public Enumeration j() {
        return this.f16754a.keys();
    }

    public Object k(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f16754a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void l(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f16754a.putAll(cVar.f16754a);
    }

    public void m(a aVar) {
        k(aVar, "app");
    }

    public void n(b bVar) {
        k(bVar, "browser");
    }

    public void o(f fVar) {
        k(fVar, "device");
    }

    public void p(h hVar) {
        k(hVar, "flags");
    }

    public void q(k kVar) {
        k(kVar, "gpu");
    }

    public void r(o oVar) {
        k(oVar, "os");
    }

    public void s(r rVar) {
        io.sentry.r a7 = this.f16755b.a();
        try {
            k(rVar, "response");
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.c2
    public void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        ArrayList<String> list = Collections.list(j());
        Collections.sort(list);
        for (String str : list) {
            Object c2 = c(str);
            if (c2 != null) {
                aVar.u(str);
                aVar.H(iLogger, c2);
            }
        }
        aVar.o();
    }

    public void t(x xVar) {
        k(xVar, "runtime");
    }

    public void u(f0 f0Var) {
        k(f0Var, "spring");
    }

    public void v(n6 n6Var) {
        y4.a.C(n6Var, "traceContext is required");
        k(n6Var, "trace");
    }

    public final Object w(Class cls, String str) {
        Object c2 = c(str);
        if (cls.isInstance(c2)) {
            return cls.cast(c2);
        }
        return null;
    }

    public c(c cVar) {
        for (Map.Entry entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.f16739g = aVar.f16739g;
                    aVar2.f16733a = aVar.f16733a;
                    aVar2.f16737e = aVar.f16737e;
                    aVar2.f16734b = aVar.f16734b;
                    aVar2.f16738f = aVar.f16738f;
                    aVar2.f16736d = aVar.f16736d;
                    aVar2.f16735c = aVar.f16735c;
                    aVar2.f16740h = com.google.android.play.core.appupdate.b.A(aVar.f16740h);
                    aVar2.f16742k = aVar.f16742k;
                    List list = aVar.f16741i;
                    aVar2.f16741i = list != null ? new ArrayList(list) : null;
                    aVar2.j = aVar.j;
                    aVar2.f16743l = aVar.f16743l;
                    aVar2.f16744m = aVar.f16744m;
                    aVar2.f16745n = com.google.android.play.core.appupdate.b.A(aVar.f16745n);
                    m(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    b bVar = (b) value;
                    b bVar2 = new b();
                    bVar2.f16746a = bVar.f16746a;
                    bVar2.f16747b = bVar.f16747b;
                    bVar2.f16748c = com.google.android.play.core.appupdate.b.A(bVar.f16748c);
                    n(bVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof f)) {
                    f fVar = (f) value;
                    f fVar2 = new f();
                    fVar2.f16776a = fVar.f16776a;
                    fVar2.f16777b = fVar.f16777b;
                    fVar2.f16778c = fVar.f16778c;
                    fVar2.f16779d = fVar.f16779d;
                    fVar2.f16780e = fVar.f16780e;
                    fVar2.f16781f = fVar.f16781f;
                    fVar2.f16784i = fVar.f16784i;
                    fVar2.j = fVar.j;
                    fVar2.f16785k = fVar.f16785k;
                    fVar2.f16786l = fVar.f16786l;
                    fVar2.f16787m = fVar.f16787m;
                    fVar2.f16788n = fVar.f16788n;
                    fVar2.f16789o = fVar.f16789o;
                    fVar2.f16790p = fVar.f16790p;
                    fVar2.q = fVar.q;
                    fVar2.f16791r = fVar.f16791r;
                    fVar2.f16792s = fVar.f16792s;
                    fVar2.f16793t = fVar.f16793t;
                    fVar2.f16794u = fVar.f16794u;
                    fVar2.f16795v = fVar.f16795v;
                    fVar2.f16796w = fVar.f16796w;
                    fVar2.f16797x = fVar.f16797x;
                    fVar2.f16798y = fVar.f16798y;
                    fVar2.A = fVar.A;
                    fVar2.C = fVar.C;
                    fVar2.D = fVar.D;
                    fVar2.f16783h = fVar.f16783h;
                    String[] strArr = fVar.f16782g;
                    fVar2.f16782g = strArr != null ? (String[]) strArr.clone() : null;
                    fVar2.B = fVar.B;
                    TimeZone timeZone = fVar.f16799z;
                    fVar2.f16799z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    fVar2.E = fVar.E;
                    fVar2.F = fVar.F;
                    fVar2.G = fVar.G;
                    fVar2.H = fVar.H;
                    fVar2.I = com.google.android.play.core.appupdate.b.A(fVar.I);
                    o(fVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof o)) {
                    o oVar = (o) value;
                    o oVar2 = new o();
                    oVar2.f16869a = oVar.f16869a;
                    oVar2.f16870b = oVar.f16870b;
                    oVar2.f16871c = oVar.f16871c;
                    oVar2.f16872d = oVar.f16872d;
                    oVar2.f16873e = oVar.f16873e;
                    oVar2.f16874f = oVar.f16874f;
                    oVar2.f16875g = com.google.android.play.core.appupdate.b.A(oVar.f16875g);
                    r(oVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof x)) {
                    x xVar = (x) value;
                    x xVar2 = new x();
                    xVar2.f16927a = xVar.f16927a;
                    xVar2.f16928b = xVar.f16928b;
                    xVar2.f16929c = xVar.f16929c;
                    xVar2.f16930d = com.google.android.play.core.appupdate.b.A(xVar.f16930d);
                    t(xVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof i)) {
                    i iVar = (i) value;
                    i iVar2 = new i();
                    iVar2.f16809a = iVar.f16809a;
                    iVar2.f16810b = iVar.f16810b;
                    iVar2.f16811c = iVar.f16811c;
                    iVar2.f16812d = iVar.f16812d;
                    iVar2.f16813e = iVar.f16813e;
                    iVar2.f16814f = iVar.f16814f;
                    iVar2.f16815g = com.google.android.play.core.appupdate.b.A(iVar.f16815g);
                    k(iVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.f16831a = kVar.f16831a;
                    kVar2.f16832b = kVar.f16832b;
                    kVar2.f16833c = kVar.f16833c;
                    kVar2.f16834d = kVar.f16834d;
                    kVar2.f16835e = kVar.f16835e;
                    kVar2.f16836f = kVar.f16836f;
                    kVar2.f16837g = kVar.f16837g;
                    kVar2.f16838h = kVar.f16838h;
                    kVar2.f16839i = kVar.f16839i;
                    kVar2.j = com.google.android.play.core.appupdate.b.A(kVar.j);
                    q(kVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof n6)) {
                    v(new n6((n6) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof h3)) {
                    h3 h3Var = (h3) value;
                    h3 h3Var2 = new h3();
                    h3Var2.f16453a = h3Var.f16453a;
                    ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A(h3Var.f16454b);
                    if (A != null) {
                        h3Var2.f16454b = A;
                    }
                    k(h3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof r)) {
                    r rVar = (r) value;
                    r rVar2 = new r();
                    rVar2.f16899a = rVar.f16899a;
                    rVar2.f16900b = com.google.android.play.core.appupdate.b.A(rVar.f16900b);
                    rVar2.f16904f = com.google.android.play.core.appupdate.b.A(rVar.f16904f);
                    rVar2.f16901c = rVar.f16901c;
                    rVar2.f16902d = rVar.f16902d;
                    rVar2.f16903e = rVar.f16903e;
                    s(rVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof f0)) {
                    f0 f0Var = (f0) value;
                    f0 f0Var2 = new f0();
                    f0Var2.f16800a = f0Var.f16800a;
                    f0Var2.f16801b = com.google.android.play.core.appupdate.b.A(f0Var.f16801b);
                    u(f0Var2);
                } else {
                    k(value, (String) entry.getKey());
                }
            }
        }
    }
}
