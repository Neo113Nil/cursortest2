package com.ironsource;

import com.ironsource.C4234o9;
import com.ironsource.M3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.km5;
import defpackage.lm5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Za {

    @NotNull
    private final Qe a;

    public Za(@NotNull Qe qe) {
        qe.getClass();
        this.a = qe;
    }

    private final C4242p a(M3.c.a aVar, M3.c.a.C0188a c0188a) {
        String str;
        String str2;
        String str3;
        Boolean l;
        Boolean B;
        Integer w;
        Boolean v;
        Boolean u;
        Integer p;
        Long q;
        Integer r;
        if (aVar == null || (str = aVar.o()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.s()) == null) {
            str2 = "";
        }
        if (aVar == null || (str3 = aVar.x()) == null) {
            str3 = "";
        }
        int i = 2;
        int intValue = (aVar == null || (r = aVar.r()) == null) ? 2 : r.intValue();
        long longValue = (aVar == null || (q = aVar.q()) == null) ? Ua.s : q.longValue();
        int intValue2 = (aVar == null || (p = aVar.p()) == null) ? 15 : p.intValue();
        boolean z = false;
        boolean booleanValue = (aVar == null || (u = aVar.u()) == null) ? false : u.booleanValue();
        if (aVar != null && (v = aVar.v()) != null) {
            z = v.booleanValue();
        }
        if (aVar != null && (w = aVar.w()) != null) {
            i = w.intValue();
        }
        int i2 = i;
        boolean z2 = true;
        boolean booleanValue2 = (aVar == null || (B = aVar.B()) == null) ? true : B.booleanValue();
        if (c0188a != null && (l = c0188a.l()) != null) {
            z2 = l.booleanValue();
        }
        return new C4242p(str, str2, str3, intValue, longValue, intValue2, booleanValue, z, i2, booleanValue2, z2);
    }

    private final C4234o9 b(C4234o9 c4234o9, Map<String, C4234o9> map) {
        String m;
        if (!Intrinsics.c(c4234o9.l(), Boolean.TRUE) || (m = c4234o9.m()) == null || m.length() == 0 || Intrinsics.c(c4234o9.m(), c4234o9.j())) {
            return null;
        }
        return map.get(c4234o9.m());
    }

    private final C4070f6 a(M3.a.g gVar, Map<String, ? extends List<String>> map) {
        M3.c g = this.a.d().g();
        M3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = lm5.a;
            map.getClass();
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
        long longValue = v != null ? v.longValue() : Ua.C;
        km5 km5Var = km5.a;
        C4242p a = a(k, k != null ? k.A() : null);
        Integer r = gVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer x = gVar.x();
        return new C4070f6(map2, intValue, z2, longValue, km5Var, a, intValue2, Integer.valueOf(x != null ? x.intValue() : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r14.intValue() == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C4070f6 a(M3.a.c cVar, Map<String, ? extends List<String>> map) {
        M3.c g = this.a.d().g();
        M3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = lm5.a;
            map.getClass();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = cVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = cVar.s();
        boolean z = s != null;
        boolean z2 = z;
        Long v = cVar.v();
        long longValue = v != null ? v.longValue() : Ua.C;
        km5 km5Var = km5.a;
        C4242p a = a(k, k != null ? k.y() : null);
        Integer r = cVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer y = cVar.y();
        return new C4070f6(map2, intValue, z2, longValue, km5Var, a, intValue2, Integer.valueOf(y != null ? y.intValue() : -1));
    }

    @NotNull
    public final Ya a() {
        M3.a.c f;
        M3.a.g h;
        M3.a e = this.a.d().e();
        return new Ya((e == null || (h = e.h()) == null) ? null : a(h, this.a.e().h()), (e == null || (f = e.f()) == null) ? null : a(f, this.a.e().f()), null, a(this.a.f()));
    }

    private final Map<String, Ad> a(Map<String, C4234o9> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4234o9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final Ad a(C4234o9 c4234o9, Map<String, C4234o9> map) {
        C4234o9.a i;
        C4234o9.a i2;
        C4234o9.a i3;
        C4234o9.a i4;
        C4234o9 b = b(c4234o9, map);
        JSONObject jSONObject = null;
        JSONObject a = a(c4234o9.k(), b != null ? b.k() : null);
        C4234o9.a i5 = c4234o9.i();
        JSONObject a2 = a(i5 != null ? i5.h() : null, (b == null || (i4 = b.i()) == null) ? null : i4.h(), a);
        C4234o9.a i6 = c4234o9.i();
        JSONObject a3 = a(i6 != null ? i6.f() : null, (b == null || (i3 = b.i()) == null) ? null : i3.f(), a);
        C4234o9.a i7 = c4234o9.i();
        JSONObject a4 = a(i7 != null ? i7.e() : null, (b == null || (i2 = b.i()) == null) ? null : i2.e(), a);
        C4234o9.a i8 = c4234o9.i();
        JSONObject g = i8 != null ? i8.g() : null;
        if (b != null && (i = b.i()) != null) {
            jSONObject = i.g();
        }
        return new Ad(a2, a3, a4, a(g, jSONObject, a));
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
