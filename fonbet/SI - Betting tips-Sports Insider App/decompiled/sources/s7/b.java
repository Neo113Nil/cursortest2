package s7;

import android.util.Log;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.t7;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22650b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f22651c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f22652d;

    /* renamed from: e, reason: collision with root package name */
    public Long f22653e;

    /* renamed from: f, reason: collision with root package name */
    public Long f22654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f22656h;

    /* renamed from: i, reason: collision with root package name */
    public final g5 f22657i;

    public b(c cVar, String str, int i5, g5 g5Var, int i10) {
        this.f22655g = i10;
        this.f22656h = cVar;
        this.f22649a = str;
        this.f22650b = i5;
        this.f22657i = g5Var;
    }

    public static Boolean c(Boolean bool, boolean z5) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.v1 v1Var, n0 n0Var) {
        List u10;
        g6.v.h(v1Var);
        if (str != null && v1Var.p() && v1Var.x() != 1 && (v1Var.x() != 7 ? v1Var.q() : v1Var.v() != 0)) {
            int x10 = v1Var.x();
            boolean t3 = v1Var.t();
            String r5 = (t3 || x10 == 2 || x10 == 7) ? v1Var.r() : v1Var.r().toUpperCase(Locale.ENGLISH);
            if (v1Var.v() == 0) {
                u10 = null;
            } else {
                u10 = v1Var.u();
                if (!t3) {
                    ArrayList arrayList = new ArrayList(u10.size());
                    Iterator it = u10.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    u10 = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = x10 == 2 ? r5 : null;
            if (x10 != 7 ? r5 != null : u10 != null && !u10.isEmpty()) {
                if (!t3 && x10 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (x10 - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != t3 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (n0Var != null) {
                                    n0Var.f22906i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(r5));
                    case 3:
                        return Boolean.valueOf(str.endsWith(r5));
                    case 4:
                        return Boolean.valueOf(str.contains(r5));
                    case 5:
                        return Boolean.valueOf(str.equals(r5));
                    case 6:
                        if (u10 != null) {
                            return Boolean.valueOf(u10.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.s1 s1Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        g6.v.h(s1Var);
        if (s1Var.p()) {
            if (s1Var.z() != 1 && (s1Var.z() != 5 ? s1Var.s() : s1Var.u() && s1Var.w())) {
                int z5 = s1Var.z();
                try {
                    if (s1Var.z() == 5) {
                        if (r0.P(s1Var.v()) && r0.P(s1Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(s1Var.v());
                            bigDecimal4 = new BigDecimal(s1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (r0.P(s1Var.t())) {
                        bigDecimal2 = new BigDecimal(s1Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (z5 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i5 = z5 - 1;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d10 != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Long l6, Long l10, com.google.android.gms.internal.measurement.a3 a3Var, long j, n nVar, boolean z5) {
        boolean z7;
        n0 n0Var;
        Boolean bool;
        Boolean bool2;
        long j6;
        Boolean bool3;
        Boolean bool4;
        int i5;
        t7.a();
        c cVar = this.f22656h;
        f1 f1Var = (f1) cVar.f3328a;
        e eVar = f1Var.f22743d;
        n0 n0Var2 = f1Var.f22745f;
        i0 i0Var = f1Var.j;
        w wVar = x.G0;
        String str = this.f22649a;
        boolean t3 = eVar.t(str, wVar);
        com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) this.f22657i;
        long j10 = n1Var.A() ? nVar.f22894e : j;
        f1.m(n0Var2);
        l0 l0Var = n0Var2.f22910n;
        l0 l0Var2 = n0Var2.f22906i;
        boolean isLoggable = Log.isLoggable(n0Var2.t(), 2);
        int i10 = this.f22650b;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        Boolean bool5 = null;
        if (isLoggable) {
            f1.m(n0Var2);
            l0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i10), n1Var.p() ? Integer.valueOf(n1Var.q()) : null, i0Var.a(n1Var.r()));
            f1.m(n0Var2);
            r0 r0Var = cVar.f22859b.f22993g;
            r3.U(r0Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (n1Var.p()) {
                i5 = 0;
                r0.B(sb2, 0, "filter_id", Integer.valueOf(n1Var.q()));
            } else {
                i5 = 0;
            }
            r0.B(sb2, i5, "event_name", ((f1) r0Var.f3328a).j.a(n1Var.r()));
            String x10 = r0.x(n1Var.x(), n1Var.y(), n1Var.A());
            if (!x10.isEmpty()) {
                r0.B(sb2, 0, "filter_type", x10);
            }
            if (n1Var.v()) {
                r0.C(sb2, 1, "event_count_filter", n1Var.w());
            }
            if (n1Var.t() > 0) {
                sb2.append("  filters {\n");
                Iterator it = n1Var.s().iterator();
                while (it.hasNext()) {
                    r0Var.u(sb2, 2, (com.google.android.gms.internal.measurement.p1) it.next());
                }
            }
            r0.v(1, sb2);
            sb2.append("}\n}\n");
            l0Var.b(sb2.toString(), "Filter definition");
        }
        if (!n1Var.p() || n1Var.q() > 256) {
            f1.m(n0Var2);
            l0Var2.c(n0.r(str), String.valueOf(n1Var.p() ? Integer.valueOf(n1Var.q()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z10 = n1Var.x() || n1Var.y() || n1Var.A();
        if (z5 && !z10) {
            f1.m(n0Var2);
            l0Var.c(Integer.valueOf(i10), n1Var.p() ? Integer.valueOf(n1Var.q()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String s8 = a3Var.s();
        if (n1Var.v()) {
            try {
                bool4 = e(new BigDecimal(j10), n1Var.w(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z7 = t3;
            n0Var = n0Var2;
            f1.m(n0Var);
            l0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.f22651c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.f22652d = bool6;
            if (!z10 || !a3Var.t()) {
                return true;
            }
            Long valueOf = Long.valueOf(a3Var.u());
            if (n1Var.y()) {
                if (z7 && n1Var.v()) {
                    valueOf = l6;
                }
                this.f22654f = valueOf;
                return true;
            }
            if (z7 && n1Var.v()) {
                valueOf = l10;
            }
            this.f22653e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = n1Var.s().iterator();
        while (true) {
            if (!it2.hasNext()) {
                s.e eVar2 = new s.e(0);
                Iterator it3 = a3Var.p().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = n1Var.s().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z7 = t3;
                                n0Var = n0Var2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) it4.next();
                            boolean z11 = p1Var.t() && p1Var.u();
                            String w10 = p1Var.w();
                            if (w10.isEmpty()) {
                                f1.m(n0Var2);
                                l0Var2.b(i0Var.a(s8), "Event has empty param name. event");
                                break;
                            }
                            Object obj = eVar2.get(w10);
                            if (obj instanceof Long) {
                                if (!p1Var.r()) {
                                    f1.m(n0Var2);
                                    l0Var2.c(i0Var.a(s8), i0Var.b(w10), "No number filter for long param. event, param");
                                    break;
                                }
                                try {
                                    bool = e(new BigDecimal(((Long) obj).longValue()), p1Var.s(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z11) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!p1Var.r()) {
                                    f1.m(n0Var2);
                                    l0Var2.c(i0Var.a(s8), i0Var.b(w10), "No number filter for double param. event, param");
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = e(new BigDecimal(doubleValue), p1Var.s(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z11) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!p1Var.p()) {
                                    if (!p1Var.r()) {
                                        z7 = t3;
                                        n0Var = n0Var2;
                                        f1.m(n0Var);
                                        l0Var2.c(i0Var.a(s8), i0Var.b(w10), "No filter for String param. event, param");
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!r0.P(str2)) {
                                        z7 = t3;
                                        n0Var = n0Var2;
                                        f1.m(n0Var);
                                        l0Var2.c(i0Var.a(s8), i0Var.b(w10), "Invalid param value for number filter. event, param");
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.s1 s10 = p1Var.s();
                                    if (r0.P(str2)) {
                                        try {
                                            z7 = t3;
                                            n0Var = n0Var2;
                                            j6 = 0;
                                        } catch (NumberFormatException unused4) {
                                            z7 = t3;
                                            n0Var = n0Var2;
                                            j6 = 0;
                                        }
                                        try {
                                            bool3 = e(new BigDecimal(str2), s10, 0.0d);
                                        } catch (NumberFormatException unused5) {
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                            f1.m(n0Var);
                                            l0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
                                            if (bool5 == null) {
                                            }
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z11) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        n0Var2 = n0Var;
                                        t3 = z7;
                                    } else {
                                        z7 = t3;
                                        n0Var = n0Var2;
                                        bool3 = null;
                                    }
                                } else {
                                    com.google.android.gms.internal.measurement.v1 q = p1Var.q();
                                    f1.m(n0Var2);
                                    bool3 = d((String) obj, q, n0Var2);
                                    z7 = t3;
                                    n0Var = n0Var2;
                                }
                                j6 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z7 = t3;
                                n0Var = n0Var2;
                                if (obj == null) {
                                    f1.m(n0Var);
                                    l0Var.c(i0Var.a(s8), i0Var.b(w10), "Missing param for filter. event, param");
                                    bool5 = Boolean.FALSE;
                                } else {
                                    f1.m(n0Var);
                                    l0Var2.c(i0Var.a(s8), i0Var.b(w10), "Unknown param type. event, param");
                                }
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it3.next();
                        if (hashSet.contains(d3Var.q())) {
                            if (!d3Var.t()) {
                                if (!d3Var.x()) {
                                    if (!d3Var.r()) {
                                        f1.m(n0Var2);
                                        l0Var2.c(i0Var.a(s8), i0Var.b(d3Var.q()), "Unknown value for param. event, param");
                                        break;
                                    }
                                    eVar2.put(d3Var.q(), d3Var.s());
                                } else {
                                    eVar2.put(d3Var.q(), d3Var.x() ? Double.valueOf(d3Var.y()) : null);
                                }
                            } else {
                                eVar2.put(d3Var.q(), d3Var.t() ? Long.valueOf(d3Var.u()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.p1 p1Var2 = (com.google.android.gms.internal.measurement.p1) it2.next();
                if (p1Var2.w().isEmpty()) {
                    f1.m(n0Var2);
                    l0Var2.b(i0Var.a(s8), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(p1Var2.w());
            }
        }
        f1.m(n0Var);
        l0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
        if (bool5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(Long l6, Long l10, com.google.android.gms.internal.measurement.r3 r3Var, boolean z5) {
        boolean z7;
        Boolean c2;
        Boolean e7;
        Boolean bool;
        Boolean bool2;
        t7.a();
        f1 f1Var = (f1) this.f22656h.f3328a;
        e eVar = f1Var.f22743d;
        i0 i0Var = f1Var.j;
        n0 n0Var = f1Var.f22745f;
        boolean t3 = eVar.t(this.f22649a, x.E0);
        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) this.f22657i;
        boolean t5 = u1Var.t();
        boolean u10 = u1Var.u();
        boolean w10 = u1Var.w();
        boolean z10 = t5 || u10 || w10;
        if (z5 && !z10) {
            f1.m(n0Var);
            n0Var.f22910n.c(Integer.valueOf(this.f22650b), u1Var.p() ? Integer.valueOf(u1Var.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.p1 s8 = u1Var.s();
        boolean u11 = s8.u();
        if (!r3Var.u()) {
            z7 = w10;
            if (!r3Var.y()) {
                if (r3Var.s()) {
                    if (s8.p()) {
                        String t10 = r3Var.t();
                        com.google.android.gms.internal.measurement.v1 q = s8.q();
                        f1.m(n0Var);
                        c2 = c(d(t10, q, n0Var), u11);
                    } else if (!s8.r()) {
                        f1.m(n0Var);
                        n0Var.f22906i.b(i0Var.c(r3Var.r()), "No string or number filter defined. property");
                    } else if (r0.P(r3Var.t())) {
                        String t11 = r3Var.t();
                        com.google.android.gms.internal.measurement.s1 s10 = s8.s();
                        if (r0.P(t11)) {
                            try {
                                e7 = e(new BigDecimal(t11), s10, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            c2 = c(e7, u11);
                        }
                        e7 = null;
                        c2 = c(e7, u11);
                    } else {
                        f1.m(n0Var);
                        n0Var.f22906i.c(i0Var.c(r3Var.r()), r3Var.t(), "Invalid user property value for Numeric number filter. property, value");
                    }
                    f1.m(n0Var);
                    n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
                    if (c2 != null) {
                    }
                } else {
                    f1.m(n0Var);
                    n0Var.f22906i.b(i0Var.c(r3Var.r()), "User property has no value, property");
                }
                c2 = null;
                f1.m(n0Var);
                n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
                if (c2 != null) {
                }
            } else if (s8.r()) {
                double z11 = r3Var.z();
                try {
                    bool = e(new BigDecimal(z11), s8.s(), Math.ulp(z11));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                c2 = c(bool, u11);
                f1.m(n0Var);
                n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
                if (c2 != null) {
                }
            } else {
                f1.m(n0Var);
                n0Var.f22906i.b(i0Var.c(r3Var.r()), "No number filter for double property. property");
                c2 = null;
                f1.m(n0Var);
                n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
                if (c2 != null) {
                }
            }
        } else {
            if (!s8.r()) {
                f1.m(n0Var);
                n0Var.f22906i.b(i0Var.c(r3Var.r()), "No number filter for long property. property");
                z7 = w10;
                c2 = null;
                f1.m(n0Var);
                n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
                if (c2 != null) {
                    return false;
                }
                this.f22651c = Boolean.TRUE;
                if (!z7 || c2.booleanValue()) {
                    if (!z5 || u1Var.t()) {
                        this.f22652d = c2;
                    }
                    if (c2.booleanValue() && z10 && r3Var.p()) {
                        long q3 = r3Var.q();
                        if (l6 != null) {
                            q3 = l6.longValue();
                        }
                        if (t3 && u1Var.t() && !u1Var.u() && l10 != null) {
                            q3 = l10.longValue();
                        }
                        if (u1Var.u()) {
                            this.f22654f = Long.valueOf(q3);
                        } else {
                            this.f22653e = Long.valueOf(q3);
                        }
                    }
                }
                return true;
            }
            z7 = w10;
            try {
                bool2 = e(new BigDecimal(r3Var.v()), s8.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            c2 = c(bool2, u11);
            f1.m(n0Var);
            n0Var.f22910n.b(c2 != null ? "null" : c2, "Property filter result");
            if (c2 != null) {
            }
        }
    }
}
