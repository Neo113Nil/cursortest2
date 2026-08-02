package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.InterfaceC5703c;
import net.time4j.a0;
import net.time4j.format.expert.C5709c;
import oi.AbstractC5916l;
import oi.AbstractC5917m;
import oi.EnumC5900A;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public enum w {
    CLDR,
    SIMPLE_DATE_FORMAT,
    CLDR_24,
    CLDR_DATE,
    DYNAMIC;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$expert$PatternType;

        static {
            int[] iArr = new int[w.values().length];
            $SwitchMap$net$time4j$format$expert$PatternType = iArr;
            try {
                iArr[w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.SIMPLE_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.CLDR_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.CLDR_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.DYNAMIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a(C5709c.d dVar, oi.p pVar, int i10) {
        dVar.u(pVar, i10, 9);
    }

    public static void b(C5709c.d dVar, oi.p pVar) {
        dVar.A(pVar);
    }

    public static void c(C5709c.d dVar, int i10) {
        if (i10 == 1) {
            dVar.j(net.time4j.F.f57540r, 1, 2);
            return;
        }
        if (i10 == 2) {
            dVar.g(net.time4j.F.f57540r, 2);
            return;
        }
        if (i10 == 3) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.ABBREVIATED);
            dVar.A(net.time4j.F.f57539q);
            dVar.L();
        } else if (i10 == 4) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            dVar.A(net.time4j.F.f57539q);
            dVar.L();
        } else if (i10 == 5) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.NARROW);
            dVar.A(net.time4j.F.f57539q);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i10);
        }
    }

    public static void d(C5709c.d dVar, int i10, net.time4j.format.t tVar) {
        if (i10 == 1 || i10 == 2) {
            if (!Enum.class.isAssignableFrom(tVar.getType())) {
                dVar.a0(InterfaceC6081a.f63225N4, i10);
                dVar.z(tVar);
                dVar.L();
                return;
            }
            oi.p pVar = (oi.p) i(tVar);
            if (i10 == 1) {
                dVar.u(pVar, 1, 2);
                return;
            } else {
                if (i10 == 2) {
                    dVar.h(pVar, 2);
                    return;
                }
                return;
            }
        }
        if (i10 == 3) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.ABBREVIATED);
            dVar.z(tVar);
            dVar.L();
        } else if (i10 == 4) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            dVar.z(tVar);
            dVar.L();
        } else if (i10 == 5) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.NARROW);
            dVar.z(tVar);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i10);
        }
    }

    public static void e(oi.p pVar, char c10, C5709c.d dVar, int i10, boolean z10) {
        if (i10 == 1) {
            dVar.j(pVar, 1, 2);
            return;
        }
        if (i10 == 2 || z10) {
            dVar.g(pVar, i10);
            return;
        }
        throw new IllegalArgumentException("Too many pattern letters (" + c10 + "): " + i10);
    }

    public static void f(C5709c.d dVar, char c10, int i10, boolean z10) {
        if (i10 == 1) {
            dVar.C(net.time4j.format.e.SHORT, false, Collections.singletonList(z10 ? "Z" : "+00"));
            return;
        }
        if (i10 == 2) {
            dVar.C(net.time4j.format.e.MEDIUM, false, Collections.singletonList(z10 ? "Z" : "+0000"));
            return;
        }
        if (i10 == 3) {
            dVar.C(net.time4j.format.e.MEDIUM, true, Collections.singletonList(z10 ? "Z" : "+00:00"));
            return;
        }
        if (i10 == 4) {
            dVar.C(net.time4j.format.e.LONG, false, Collections.singletonList(z10 ? "Z" : "+0000"));
            return;
        }
        if (i10 == 5) {
            dVar.C(net.time4j.format.e.LONG, true, Collections.singletonList(z10 ? "Z" : "+00:00"));
            return;
        }
        throw new IllegalArgumentException("Too many pattern letters (" + c10 + "): " + i10);
    }

    public static void g(C5709c.d dVar, int i10) {
        if (i10 == 1 || i10 == 2) {
            dVar.h(net.time4j.F.f57538p, i10);
            return;
        }
        if (i10 == 3) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.ABBREVIATED);
            dVar.A(net.time4j.F.f57538p);
            dVar.L();
        } else if (i10 == 4) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            dVar.A(net.time4j.F.f57538p);
            dVar.L();
        } else if (i10 == 5) {
            dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.NARROW);
            dVar.A(net.time4j.F.f57538p);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for quarter-of-year: " + i10);
        }
    }

    public static int h(int i10) {
        return (i10 < 65 || i10 > 90) ? i10 - 32 : i10;
    }

    public static Object i(Object obj) {
        return obj;
    }

    public static oi.p n(Set set, char c10, String str) {
        char c11 = c10 == 'L' ? 'M' : c10 == 'c' ? 'e' : c10;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oi.p pVar = (oi.p) it.next();
            if (pVar.Y() && pVar.a() == c11 && (c11 != 'M' || !pVar.name().equals("MONTH_AS_NUMBER"))) {
                return pVar;
            }
        }
        if (c10 == 'y' && str.equals("net.time4j.PlainDate")) {
            return net.time4j.F.f57536n;
        }
        throw new IllegalArgumentException("Cannot find any chronological date element for symbol " + c10 + " in \"" + str + "\".");
    }

    public static oi.p o(oi.x xVar, Locale locale, int i10) {
        oi.p p10 = p(xVar, locale, i10, false);
        return p10 == null ? p(xVar, locale, i10, true) : p10;
    }

    public static oi.p p(oi.x xVar, Locale locale, int i10, boolean z10) {
        if (z10) {
            i10 = h(i10);
        }
        for (oi.p pVar : xVar.v()) {
            int a10 = pVar.a();
            if (z10) {
                a10 = h(a10);
            }
            if (a10 == i10) {
                return pVar;
            }
        }
        Iterator it = xVar.t().iterator();
        while (it.hasNext()) {
            for (oi.p pVar2 : ((oi.s) it.next()).c(locale, net.time4j.format.a.f())) {
                int a11 = pVar2.a();
                if (z10) {
                    a11 = h(a11);
                }
                if (a11 == i10) {
                    return pVar2;
                }
            }
        }
        return null;
    }

    public static oi.p q(oi.x xVar) {
        Iterator it = xVar.t().iterator();
        while (it.hasNext()) {
            for (oi.p pVar : ((oi.s) it.next()).c(Locale.ROOT, net.time4j.format.a.f())) {
                if (pVar.name().equals("ETHIOPIAN_HOUR")) {
                    return (oi.p) i(pVar);
                }
            }
        }
        return null;
    }

    public static String s(oi.x xVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) xVar.r().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    public static oi.x t(C5709c.d dVar) {
        return dVar.P();
    }

    public static Set u(oi.x xVar, char c10, Locale locale) {
        if (c10 != 'w' && c10 != 'W' && c10 != 'e' && c10 != 'c') {
            return xVar.v();
        }
        Iterator it = xVar.t().iterator();
        while (it.hasNext()) {
            for (oi.p pVar : ((oi.s) it.next()).c(locale, net.time4j.format.a.f())) {
                if (((c10 == 'e' || c10 == 'c') && pVar.name().equals("LOCAL_DAY_OF_WEEK")) || ((c10 == 'w' && pVar.name().equals("WEEK_OF_YEAR")) || (c10 == 'W' && pVar.name().equals("WEEK_OF_MONTH")))) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(pVar);
                    return hashSet;
                }
            }
        }
        return Collections.EMPTY_SET;
    }

    public static net.time4j.format.v v(int i10) {
        if (i10 <= 3) {
            return net.time4j.format.v.ABBREVIATED;
        }
        if (i10 == 4) {
            return net.time4j.format.v.WIDE;
        }
        if (i10 == 5) {
            return net.time4j.format.v.NARROW;
        }
        throw new IllegalArgumentException("Too many pattern letters: " + i10);
    }

    public static boolean w(char c10) {
        if (c10 == 'L' || c10 == 'M' || c10 == 'U' || c10 == 'W' || c10 == 'g' || c10 == 'r' || c10 == 'w' || c10 == 'y') {
            return true;
        }
        switch (c10) {
            case 'D':
            case 'E':
            case 'F':
            case 'G':
                return true;
            default:
                switch (c10) {
                    case 'c':
                    case 'd':
                    case 'e':
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean x(oi.x xVar) {
        return s(xVar).equals("iso8601");
    }

    public final Map j(C5709c.d dVar, Locale locale, char c10, int i10) {
        oi.x t10 = t(dVar);
        if (w(c10) && !x(t10)) {
            return r(dVar, t10, c10, i10, locale);
        }
        if (c10 != 'h' || !s(t10).equals("ethiopic")) {
            return l(dVar, t10, locale, c10, i10, false);
        }
        oi.p q10 = q(t10);
        if (q10 == null) {
            throw new IllegalArgumentException("Ethiopian time not available.");
        }
        e(q10, c10, dVar, i10, false);
        return Collections.EMPTY_MAP;
    }

    public final Map k(C5709c.d dVar, Locale locale, char c10, int i10) {
        if (c10 != 'H') {
            return j(dVar, locale, c10, i10);
        }
        e(net.time4j.G.f57591u, c10, dVar, i10, false);
        return Collections.EMPTY_MAP;
    }

    public final Map l(C5709c.d dVar, oi.x xVar, Locale locale, char c10, int i10, boolean z10) {
        net.time4j.format.v vVar;
        net.time4j.format.v vVar2;
        switch (c10) {
            case 'A':
                dVar.j(net.time4j.G.f57563C, i10, 8);
                break;
            case 'B':
                dVar.b0(net.time4j.format.a.f57808g, v(i10));
                dVar.e();
                dVar.L();
                break;
            case 'C':
            case 'I':
            case 'J':
            case 'N':
            case 'P':
            case 'R':
            case 'T':
            case 'U':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'f':
            case 'i':
            case 'j':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 't':
            case 'v':
            default:
                throw new IllegalArgumentException("Unsupported pattern symbol: " + c10);
            case 'D':
                if (i10 < 3) {
                    dVar.j(net.time4j.F.f57543u, i10, 3);
                    break;
                } else {
                    if (i10 != 3 && !z10) {
                        throw new IllegalArgumentException("Too many pattern letters (D): " + i10);
                    }
                    dVar.g(net.time4j.F.f57543u, i10);
                    break;
                }
            case 'E':
                if (i10 <= 3) {
                    vVar = net.time4j.format.v.ABBREVIATED;
                } else if (i10 == 4 || z10) {
                    vVar = net.time4j.format.v.WIDE;
                } else if (i10 == 5) {
                    vVar = net.time4j.format.v.NARROW;
                } else {
                    if (i10 != 6) {
                        throw new IllegalArgumentException("Too many pattern letters (E): " + i10);
                    }
                    vVar = net.time4j.format.v.SHORT;
                }
                dVar.b0(net.time4j.format.a.f57808g, vVar);
                dVar.A(net.time4j.F.f57542t);
                dVar.L();
                break;
            case 'F':
                if (i10 != 1 && !z10) {
                    throw new IllegalArgumentException("Too many pattern letters (F): " + i10);
                }
                dVar.g(net.time4j.F.f57545w, i10);
                break;
            case 'G':
                if (i10 <= 3) {
                    vVar2 = net.time4j.format.v.ABBREVIATED;
                } else if (i10 == 4 || z10) {
                    vVar2 = net.time4j.format.v.WIDE;
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException("Too many pattern letters (G): " + i10);
                    }
                    vVar2 = net.time4j.format.v.NARROW;
                }
                dVar.b0(net.time4j.format.a.f57808g, vVar2);
                net.time4j.history.d C10 = net.time4j.history.d.C(locale);
                dVar.z((net.time4j.format.t) net.time4j.format.t.class.cast(C10.i()));
                dVar.L();
                HashMap hashMap = new HashMap();
                hashMap.put(net.time4j.F.f57536n, C10.K());
                hashMap.put(net.time4j.F.f57539q, C10.B());
                hashMap.put(net.time4j.F.f57540r, C10.B());
                hashMap.put(net.time4j.F.f57541s, C10.g());
                hashMap.put(net.time4j.F.f57543u, C10.h());
                return hashMap;
            case 'H':
                e(net.time4j.G.f57590t, c10, dVar, i10, z10);
                break;
            case 'K':
                e(net.time4j.G.f57589s, c10, dVar, i10, z10);
                break;
            case 'L':
                dVar.b0(net.time4j.format.a.f57809h, net.time4j.format.m.STANDALONE);
                c(dVar, Math.min(i10, z10 ? 4 : i10));
                dVar.L();
                break;
            case 'M':
                c(dVar, Math.min(i10, z10 ? 4 : i10));
                break;
            case 'O':
                if (i10 == 1) {
                    dVar.x();
                    break;
                } else {
                    if (i10 != 4) {
                        throw new IllegalArgumentException("Count of pattern letters is not 1 or 4: " + i10);
                    }
                    dVar.p();
                    break;
                }
            case 'Q':
                g(dVar, i10);
                break;
            case 'S':
                dVar.i(net.time4j.G.f57562B, i10, i10, false);
                break;
            case 'V':
                if (i10 != 2) {
                    throw new IllegalArgumentException("Count of pattern letters is not 2: " + i10);
                }
                try {
                    dVar.B();
                    break;
                } catch (IllegalStateException e10) {
                    throw new IllegalArgumentException(e10.getMessage());
                }
            case 'W':
                if (i10 != 1) {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i10);
                }
                dVar.g(a0.j(locale).m(), 1);
                break;
            case 'X':
                f(dVar, c10, i10, true);
                break;
            case 'Y':
                if (i10 != 2) {
                    dVar.E(net.time4j.F.f57537o, i10, false);
                    break;
                } else {
                    dVar.D(net.time4j.F.f57537o);
                    break;
                }
            case 'Z':
                if (i10 < 4) {
                    dVar.C(net.time4j.format.e.LONG, false, Collections.singletonList("+0000"));
                    break;
                } else if (i10 == 4) {
                    dVar.p();
                    break;
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException("Too many pattern letters (Z): " + i10);
                    }
                    dVar.C(net.time4j.format.e.LONG, true, Collections.singletonList("Z"));
                    break;
                }
            case 'a':
                dVar.b0(net.time4j.format.a.f57808g, z10 ? net.time4j.format.v.ABBREVIATED : v(i10));
                dVar.A(net.time4j.G.f57586p);
                dVar.L();
                if (s(xVar).equals("ethiopic")) {
                    oi.p q10 = q(xVar);
                    if (q10 == null) {
                        throw new IllegalArgumentException("Ethiopian time not available.");
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(q10, net.time4j.G.f57587q);
                    return hashMap2;
                }
                break;
            case 'b':
                dVar.b0(net.time4j.format.a.f57808g, v(i10));
                dVar.f();
                dVar.L();
                break;
            case 'c':
                if (i10 == 2) {
                    throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                }
                dVar.b0(net.time4j.format.a.f57809h, net.time4j.format.m.STANDALONE);
                if (i10 == 1) {
                    dVar.h(a0.j(locale).i(), 1);
                } else {
                    l(dVar, xVar, locale, 'E', i10, z10);
                }
                dVar.L();
                break;
            case 'd':
                e(net.time4j.F.f57541s, c10, dVar, i10, z10);
                break;
            case 'e':
                if (i10 > 2) {
                    l(dVar, xVar, locale, 'E', i10, z10);
                    break;
                } else {
                    dVar.h(a0.j(locale).i(), i10);
                    break;
                }
            case 'g':
                dVar.q(EnumC5900A.MODIFIED_JULIAN_DATE, i10, 18, x.SHOW_WHEN_NEGATIVE);
                break;
            case 'h':
                e(net.time4j.G.f57587q, c10, dVar, i10, z10);
                break;
            case 'k':
                e(net.time4j.G.f57588r, c10, dVar, i10, z10);
                break;
            case 'm':
                e(net.time4j.G.f57592v, c10, dVar, i10, z10);
                break;
            case 'q':
                dVar.b0(net.time4j.format.a.f57809h, net.time4j.format.m.STANDALONE);
                g(dVar, i10);
                dVar.L();
                break;
            case 'r':
                dVar.b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
                dVar.Z(net.time4j.format.a.f57814m, '0');
                dVar.E(net.time4j.F.f57536n, i10, true);
                dVar.L();
                dVar.L();
                break;
            case 's':
                e(net.time4j.G.f57594x, c10, dVar, i10, z10);
                break;
            case 'u':
                dVar.E(net.time4j.F.f57536n, i10, true);
                break;
            case 'w':
                if (i10 > 2) {
                    throw new IllegalArgumentException("Too many pattern letters (w): " + i10);
                }
                InterfaceC5703c n10 = a0.j(locale).n();
                Iterator it = xVar.v().iterator();
                while (true) {
                    if (it.hasNext()) {
                        oi.p pVar = (oi.p) it.next();
                        if (pVar.a() == c10) {
                            a0 a0Var = a0.f57689m;
                            if (pVar.equals(a0Var.n())) {
                                n10 = a0Var.n();
                            }
                        }
                    }
                }
                e(n10, c10, dVar, i10, z10);
                break;
            case 'x':
                f(dVar, c10, i10, false);
                break;
            case 'y':
                if (i10 != 2) {
                    dVar.E(net.time4j.F.f57536n, i10, false);
                    break;
                } else {
                    dVar.D(net.time4j.F.f57536n);
                    break;
                }
            case 'z':
                try {
                    if (i10 < 4) {
                        dVar.y();
                        break;
                    } else {
                        if (i10 != 4 && !z10) {
                            throw new IllegalArgumentException("Too many pattern letters (z): " + i10);
                        }
                        dVar.r();
                    }
                } catch (IllegalStateException e11) {
                    throw new IllegalArgumentException(e11.getMessage());
                }
        }
        return Collections.EMPTY_MAP;
    }

    public final Map m(C5709c.d dVar, char c10, int i10, Locale locale) {
        boolean z10;
        boolean z11 = c10 >= 'A' && c10 <= 'Z';
        oi.p o10 = o(t(dVar), locale, c10);
        if (o10 == null) {
            throw new IllegalArgumentException("Cannot resolve symbol: " + c10);
        }
        if (z11 && (((z10 = o10 instanceof net.time4j.format.t)) || Enum.class.isAssignableFrom(o10.getType()))) {
            if (i10 == 1) {
                dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.NARROW);
            } else if (i10 == 2) {
                dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.SHORT);
            } else if (i10 == 3) {
                dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.ABBREVIATED);
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("Illegal count of symbols: " + c10);
                }
                dVar.b0(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
            }
            if (z10) {
                dVar.z((net.time4j.format.t) i(o10));
            } else {
                b(dVar, (oi.p) i(o10));
            }
            dVar.L();
        } else if (o10.getType() == Integer.class) {
            dVar.j((oi.p) i(o10), i10, 9);
        } else {
            if (!Enum.class.isAssignableFrom(o10.getType())) {
                throw new IllegalArgumentException("Can only handle enum or integer elements in a numerical way: " + o10);
            }
            a(dVar, (oi.p) i(o10), i10);
        }
        return Collections.EMPTY_MAP;
    }

    public final Map r(C5709c.d dVar, oi.x xVar, char c10, int i10, Locale locale) {
        net.time4j.format.t tVar;
        oi.p pVar;
        net.time4j.format.v vVar;
        net.time4j.format.v vVar2;
        net.time4j.format.v vVar3;
        if (c10 == 'g') {
            dVar.q(EnumC5900A.MODIFIED_JULIAN_DATE, i10, 18, x.SHOW_WHEN_NEGATIVE);
            return Collections.EMPTY_MAP;
        }
        if (c10 == 'G' && xVar == net.time4j.F.l0()) {
            return l(dVar, xVar, locale, c10, i10, false);
        }
        Set u10 = u(xVar, c10, locale);
        String name = dVar.P().r().getName();
        oi.p n10 = n(u10, c10, name);
        if (Integer.class.isAssignableFrom(n10.getType())) {
            tVar = n10 instanceof InterfaceC6081a ? (net.time4j.format.t) i(n10) : null;
            pVar = (oi.p) i(n10);
        } else {
            if (!(n10 instanceof net.time4j.format.t)) {
                throw new IllegalStateException("Implementation error: " + n10 + " in \"" + name + "\"");
            }
            tVar = (net.time4j.format.t) i(n10);
            pVar = null;
        }
        if (c10 == 'L') {
            dVar.b0(net.time4j.format.a.f57809h, net.time4j.format.m.STANDALONE);
            d(dVar, i10, tVar);
            dVar.L();
        } else if (c10 == 'M') {
            d(dVar, i10, tVar);
        } else if (c10 != 'U') {
            boolean z10 = true;
            if (c10 != 'W') {
                if (c10 == 'r') {
                    dVar.b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
                    dVar.Z(net.time4j.format.a.f57814m, '0');
                    dVar.E(pVar, i10, true);
                    dVar.L();
                    dVar.L();
                } else if (c10 == 'w') {
                    e(pVar, c10, dVar, i10, false);
                } else if (c10 != 'y') {
                    switch (c10) {
                        case 'D':
                            if (i10 < 3) {
                                dVar.j(pVar, i10, 3);
                                break;
                            } else {
                                if (i10 != 3) {
                                    throw new IllegalArgumentException("Too many pattern letters (D): " + i10);
                                }
                                dVar.g(pVar, i10);
                                break;
                            }
                        case 'E':
                            if (i10 <= 3) {
                                vVar2 = net.time4j.format.v.ABBREVIATED;
                            } else if (i10 == 4) {
                                vVar2 = net.time4j.format.v.WIDE;
                            } else if (i10 == 5) {
                                vVar2 = net.time4j.format.v.NARROW;
                            } else {
                                if (i10 != 6) {
                                    throw new IllegalArgumentException("Too many pattern letters (E): " + i10);
                                }
                                vVar2 = net.time4j.format.v.SHORT;
                            }
                            dVar.b0(net.time4j.format.a.f57808g, vVar2);
                            dVar.z(tVar);
                            dVar.L();
                            break;
                        case 'F':
                            if (i10 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters (F): " + i10);
                            }
                            dVar.g(pVar, i10);
                            break;
                        case 'G':
                            if (i10 <= 3) {
                                vVar3 = net.time4j.format.v.ABBREVIATED;
                            } else if (i10 == 4) {
                                vVar3 = net.time4j.format.v.WIDE;
                            } else {
                                if (i10 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters (G): " + i10);
                                }
                                vVar3 = net.time4j.format.v.NARROW;
                            }
                            dVar.b0(net.time4j.format.a.f57808g, vVar3);
                            dVar.z(tVar);
                            dVar.L();
                            break;
                        default:
                            switch (c10) {
                                case 'c':
                                    if (i10 == 2) {
                                        throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                                    }
                                    dVar.b0(net.time4j.format.a.f57809h, net.time4j.format.m.STANDALONE);
                                    if (i10 == 1) {
                                        dVar.h((oi.p) i(n10), 1);
                                    } else {
                                        r(dVar, xVar, 'E', i10, locale);
                                    }
                                    dVar.L();
                                    break;
                                case 'd':
                                    if (pVar != null) {
                                        e(pVar, c10, dVar, i10, false);
                                        break;
                                    } else {
                                        if (i10 > 2) {
                                            throw new IllegalArgumentException("Too many pattern letters for day-of-month: " + i10);
                                        }
                                        dVar.a0(InterfaceC6081a.f63225N4, i10);
                                        dVar.z(tVar);
                                        dVar.L();
                                        break;
                                    }
                                case 'e':
                                    if (i10 > 2) {
                                        r(dVar, xVar, 'E', i10, locale);
                                        break;
                                    } else {
                                        dVar.h((oi.p) i(n10), i10);
                                        break;
                                    }
                                default:
                                    throw new IllegalArgumentException("Unsupported pattern symbol: " + c10);
                            }
                    }
                } else {
                    if (locale.getLanguage().equals("am") && s(xVar).equals("ethiopic")) {
                        dVar.b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58087g);
                    } else {
                        z10 = false;
                    }
                    if (i10 == 2) {
                        dVar.D(pVar);
                    } else {
                        dVar.E(pVar, i10, false);
                    }
                    if (z10) {
                        dVar.L();
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i10);
                }
                dVar.g(pVar, 1);
            }
        } else {
            if (tVar == null) {
                throw new IllegalStateException("Implementation error: " + n10 + " in \"" + name + "\"");
            }
            if (i10 <= 3) {
                vVar = net.time4j.format.v.ABBREVIATED;
            } else if (i10 == 4) {
                vVar = net.time4j.format.v.WIDE;
            } else {
                if (i10 != 5) {
                    throw new IllegalArgumentException("Too many pattern letters (U): " + i10);
                }
                vVar = net.time4j.format.v.NARROW;
            }
            dVar.b0(net.time4j.format.a.f57808g, vVar);
            dVar.z(tVar);
            dVar.L();
        }
        return Collections.EMPTY_MAP;
    }

    public Map y(C5709c.d dVar, Locale locale, char c10, int i10) {
        oi.x t10 = t(dVar);
        int i11 = a.$SwitchMap$net$time4j$format$expert$PatternType[ordinal()];
        if (i11 == 1) {
            return j(dVar, locale, c10, i10);
        }
        if (i11 == 2) {
            return z(dVar, t10, locale, c10, i10);
        }
        if (i11 == 3) {
            return k(dVar, locale, c10, i10);
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return m(dVar, c10, i10, locale);
            }
            throw new UnsupportedOperationException(name());
        }
        Class r10 = t10.r();
        if (AbstractC5917m.class.isAssignableFrom(r10) || AbstractC5916l.class.isAssignableFrom(r10)) {
            return r(dVar, t10, c10, i10, locale);
        }
        throw new IllegalArgumentException("No calendar chronology.");
    }

    public final Map z(C5709c.d dVar, oi.x xVar, Locale locale, char c10, int i10) {
        if (c10 != 'B' && c10 != 'O' && c10 != 'Q') {
            if (c10 == 'S') {
                dVar.g(net.time4j.G.f57596z, i10);
            } else if (c10 == 'Z') {
                f(dVar, c10, 2, false);
            } else if (c10 != 'e' && c10 != 'g') {
                if (c10 == 'u') {
                    dVar.h(net.time4j.F.f57542t, i10);
                } else if (c10 != 'x' && c10 != 'b' && c10 != 'c' && c10 != 'q' && c10 != 'r') {
                    switch (c10) {
                        case 'U':
                        case 'V':
                            break;
                        case 'W':
                            dVar.g(a0.j(locale).a(), i10);
                            break;
                        case 'X':
                            if (i10 < 4) {
                                return l(dVar, xVar, locale, 'X', i10, true);
                            }
                            throw new IllegalArgumentException("Too many pattern letters (X): " + i10);
                        default:
                            return l(dVar, xVar, locale, c10, i10, true);
                    }
                }
            }
            return Collections.EMPTY_MAP;
        }
        throw new IllegalArgumentException("CLDR pattern symbol not supported in SimpleDateFormat-style: " + c10);
    }
}
