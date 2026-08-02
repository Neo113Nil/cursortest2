package defpackage;

import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class qfa {
    public static final m3a a;

    static {
        l98.h0(phi.a);
        a = o3a.a("kotlinx.serialization.json.JsonUnquotedLiteral", uhi.a);
    }

    public static final d a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new dga(bool, false, null);
    }

    public static final d b(Number number) {
        return number == null ? JsonNull.INSTANCE : new dga(number, false, null);
    }

    public static final d c(String str) {
        return str == null ? JsonNull.INSTANCE : new dga(str, true, null);
    }

    public static final void d(String str, b bVar) {
        throw new IllegalArgumentException("Element " + duf.a.getOrCreateKotlinClass(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(d dVar) {
        String c = dVar.c();
        String[] strArr = thi.a;
        c.getClass();
        if (c.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (c.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Integer f(d dVar) {
        Long l;
        try {
            l = Long.valueOf(i(dVar));
        } catch (ofa unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final c g(b bVar) {
        bVar.getClass();
        c cVar = bVar instanceof c ? (c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d("JsonObject", bVar);
        throw null;
    }

    public static final d h(b bVar) {
        bVar.getClass();
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        d("JsonPrimitive", bVar);
        throw null;
    }

    public static final long i(d dVar) {
        rhi h = kda.h(yea.d, dVar.c());
        String str = h.g;
        long k = h.k();
        if (h.h() == 10) {
            return k;
        }
        int i = h.b;
        int i2 = i > 0 ? i - 1 : i;
        n4.s(h, lnb.o("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
