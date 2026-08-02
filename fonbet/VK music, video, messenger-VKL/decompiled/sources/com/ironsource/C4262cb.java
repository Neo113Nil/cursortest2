package com.ironsource;

import com.ironsource.C4475o9;
import com.ironsource.P3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.epx;
import xsna.jgp;

/* renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4262cb {
    private final Se a;

    public C4262cb(Se se) {
        this.a = se;
    }

    private final C4475o9 b(C4475o9 c4475o9, Map<String, C4475o9> map) {
        String m;
        if (!epx.f(c4475o9.l(), Boolean.TRUE) || (m = c4475o9.m()) == null || m.length() == 0 || epx.f(c4475o9.m(), c4475o9.j())) {
            return null;
        }
        return map.get(c4475o9.m());
    }

    public final C4244bb a() {
        P3.a.c f;
        P3.a.g h;
        P3.a e = this.a.d().e();
        return new C4244bb((e == null || (h = e.h()) == null) ? null : a(h, this.a.e().h()), (e == null || (f = e.f()) == null) ? null : a(f, this.a.e().f()), null, a(this.a.f()));
    }

    private final C4365i6 a(P3.a.g gVar, Map<String, ? extends List<String>> map) {
        P3.c g = this.a.d().g();
        P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = jgp.b;
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = gVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = gVar.s();
        boolean z = true;
        if (s != null && s.intValue() != 1) {
            z = false;
        }
        boolean z2 = z;
        Long v = gVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        EmptyList emptyList = EmptyList.b;
        C4483p a = a(k, k != null ? k.A() : null);
        Integer r = gVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer x = gVar.x();
        return new C4365i6(map2, intValue, z2, longValue, emptyList, a, intValue2, Integer.valueOf(x != null ? x.intValue() : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r14.intValue() == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C4365i6 a(P3.a.c cVar, Map<String, ? extends List<String>> map) {
        P3.c g = this.a.d().g();
        P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = jgp.b;
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = cVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = cVar.s();
        boolean z = s != null;
        boolean z2 = z;
        Long v = cVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        EmptyList emptyList = EmptyList.b;
        C4483p a = a(k, k != null ? k.y() : null);
        Integer r = cVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer y = cVar.y();
        return new C4365i6(map2, intValue, z2, longValue, emptyList, a, intValue2, Integer.valueOf(y != null ? y.intValue() : -1));
    }

    private final C4483p a(P3.c.a aVar, P3.c.a.C0206a c0206a) {
        String str;
        String str2;
        Boolean l;
        Boolean B;
        Integer w;
        Boolean v;
        Boolean u;
        Integer p;
        Long q;
        Integer r;
        String x;
        String str3 = "";
        if (aVar == null || (str = aVar.o()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.s()) == null) {
            str2 = "";
        }
        if (aVar != null && (x = aVar.x()) != null) {
            str3 = x;
        }
        int i = 2;
        int intValue = (aVar == null || (r = aVar.r()) == null) ? 2 : r.intValue();
        long longValue = (aVar == null || (q = aVar.q()) == null) ? 10000L : q.longValue();
        int intValue2 = (aVar == null || (p = aVar.p()) == null) ? 15 : p.intValue();
        boolean z = false;
        boolean booleanValue = (aVar == null || (u = aVar.u()) == null) ? false : u.booleanValue();
        if (aVar != null && (v = aVar.v()) != null) {
            z = v.booleanValue();
        }
        if (aVar != null && (w = aVar.w()) != null) {
            i = w.intValue();
        }
        boolean z2 = true;
        boolean booleanValue2 = (aVar == null || (B = aVar.B()) == null) ? true : B.booleanValue();
        if (c0206a != null && (l = c0206a.l()) != null) {
            z2 = l.booleanValue();
        }
        return new C4483p(str, str2, str3, intValue, longValue, intValue2, booleanValue, z, i, booleanValue2, z2);
    }

    private final Map<String, Bd> a(Map<String, C4475o9> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4475o9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final Bd a(C4475o9 c4475o9, Map<String, C4475o9> map) {
        C4475o9.a i;
        C4475o9.a i2;
        C4475o9.a i3;
        C4475o9.a i4;
        C4475o9 b = b(c4475o9, map);
        JSONObject jSONObject = null;
        JSONObject a = a(c4475o9.k(), b != null ? b.k() : null);
        C4475o9.a i5 = c4475o9.i();
        JSONObject a2 = a(i5 != null ? i5.h() : null, (b == null || (i4 = b.i()) == null) ? null : i4.h(), a);
        C4475o9.a i6 = c4475o9.i();
        JSONObject a3 = a(i6 != null ? i6.f() : null, (b == null || (i3 = b.i()) == null) ? null : i3.f(), a);
        C4475o9.a i7 = c4475o9.i();
        JSONObject a4 = a(i7 != null ? i7.e() : null, (b == null || (i2 = b.i()) == null) ? null : i2.e(), a);
        C4475o9.a i8 = c4475o9.i();
        JSONObject g = i8 != null ? i8.g() : null;
        if (b != null && (i = b.i()) != null) {
            jSONObject = i.g();
        }
        return new Bd(a2, a3, a4, a(g, jSONObject, a));
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        IronSourceUtils.b(jSONObject3, jSONObject);
        IronSourceUtils.b(jSONObject3, jSONObject2);
        return jSONObject3;
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        IronSourceUtils.b(jSONObject4, jSONObject);
        IronSourceUtils.b(jSONObject4, jSONObject2);
        IronSourceUtils.b(jSONObject4, jSONObject3);
        return jSONObject4;
    }
}
