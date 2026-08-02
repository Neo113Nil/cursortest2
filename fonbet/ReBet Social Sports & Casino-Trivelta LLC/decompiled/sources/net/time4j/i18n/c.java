package net.time4j.i18n;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;
import pi.InterfaceC6083c;

/* loaded from: classes5.dex */
public final class c implements u, InterfaceC6083c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f58248a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f58249b;

    static {
        String[] split = e.h("calendar/names/iso8601/iso8601", Locale.ROOT).f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f58248a = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        Iterator it = unmodifiableSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(new Locale((String) it.next()));
        }
        for (d dVar : d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        f58249b = Collections.unmodifiableSet(hashSet2);
    }

    public static String[] l(Locale locale, v vVar) {
        v vVar2;
        e m10 = m(locale);
        String[] strArr = null;
        if (m10 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar3 = vVar;
            strArr = o(m10, 5, n(m10, "ERA"), vVar3, vVar3 == v.NARROW ? v.ABBREVIATED : null, m.FORMAT, 0);
            if (strArr == null && vVar3 != (vVar2 = v.ABBREVIATED)) {
                strArr = l(locale, vVar2);
            }
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, c.class.getName(), locale.toString());
    }

    public static e m(Locale locale) {
        return e.h("calendar/names/iso8601/iso8601", locale);
    }

    private static String n(e eVar, String str) {
        return (eVar.b("useShortKeys") && "true".equals(eVar.f("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    public static String[] o(e eVar, int i10, String str, v vVar, v vVar2, m mVar, int i11) {
        String[] o10;
        m mVar2 = mVar;
        String[] strArr = new String[i10];
        boolean z10 = str.length() == 1;
        int i12 = 0;
        while (i12 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('(');
            if (z10) {
                char charAt = vVar.name().charAt(0);
                if (mVar2 != m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb2.append(charAt);
            } else {
                sb2.append(vVar.name());
                if (mVar2 == m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(mVar2.name());
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i12 + i11);
            String sb3 = sb2.toString();
            if (eVar.b(sb3)) {
                strArr[i12] = eVar.f(sb3);
            } else {
                if (vVar2 == null || (o10 = o(eVar, i10, str, vVar2, null, mVar2, i11)) == null) {
                    return null;
                }
                strArr[i12] = o10[i12];
            }
            i12++;
            mVar2 = mVar;
        }
        return strArr;
    }

    public static String p(String str, v vVar, m mVar) {
        char charAt = vVar.name().charAt(0);
        if (mVar == m.FORMAT) {
            charAt = Character.toLowerCase(charAt);
        }
        return "P(" + String.valueOf(charAt) + ")_" + str;
    }

    public static String[] q(Locale locale, v vVar, m mVar) {
        e m10 = m(locale);
        if (m10 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            String p10 = p("am", vVar, mVar);
            String p11 = p("pm", vVar, mVar);
            if (m10.b(p10) && m10.b(p11)) {
                return new String[]{m10.f(p10), m10.f(p11)};
            }
            if (mVar == m.STANDALONE) {
                v vVar2 = v.ABBREVIATED;
                return vVar == vVar2 ? q(locale, vVar, m.FORMAT) : q(locale, vVar2, mVar);
            }
            v vVar3 = v.ABBREVIATED;
            if (vVar != vVar3) {
                return q(locale, vVar3, mVar);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String[] r(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m10 = m(locale);
        if (m10 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar2 = vVar;
            strArr = o(m10, 12, n(m10, "MONTH_OF_YEAR"), vVar2, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar2 != v.NARROW) {
                        strArr = r(locale, vVar2, m.FORMAT);
                    }
                } else if (vVar2 == v.ABBREVIATED) {
                    strArr = r(locale, v.WIDE, m.FORMAT);
                } else if (vVar2 == v.NARROW) {
                    strArr = r(locale, vVar2, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, c.class.getName(), locale.toString());
    }

    public static String[] s(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m10 = m(locale);
        if (m10 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar2 = vVar;
            strArr = o(m10, 4, n(m10, "QUARTER_OF_YEAR"), vVar2, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar2 != v.NARROW) {
                        strArr = s(locale, vVar2, m.FORMAT);
                    }
                } else if (vVar2 == v.ABBREVIATED) {
                    strArr = s(locale, v.WIDE, m.FORMAT);
                } else if (vVar2 == v.NARROW) {
                    strArr = s(locale, vVar2, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, c.class.getName(), locale.toString());
    }

    public static char t(net.time4j.format.e eVar) {
        return Character.toLowerCase(eVar.name().charAt(0));
    }

    public static String[] u(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m10 = m(locale);
        if (m10 != null) {
            strArr = o(m10, 7, n(m10, "DAY_OF_WEEK"), vVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar != mVar2) {
                    v vVar2 = v.ABBREVIATED;
                    if (vVar == vVar2) {
                        strArr = u(locale, v.WIDE, m.FORMAT);
                    } else if (vVar == v.SHORT) {
                        strArr = u(locale, vVar2, m.FORMAT);
                    } else if (vVar == v.NARROW) {
                        strArr = u(locale, vVar, mVar2);
                    }
                } else if (vVar != v.NARROW) {
                    strArr = u(locale, vVar, m.FORMAT);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, c.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.f
    public String a(net.time4j.format.e eVar, Locale locale) {
        return i(eVar, locale, false);
    }

    @Override // net.time4j.format.u
    public boolean b(Locale locale) {
        return f58248a.contains(d.a(locale));
    }

    @Override // net.time4j.format.u
    public String[] c(String str, Locale locale, v vVar, m mVar) {
        return s(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public String[] d(String str, Locale locale, v vVar, m mVar, boolean z10) {
        return r(locale, vVar, mVar);
    }

    @Override // net.time4j.format.f
    public String e(net.time4j.format.e eVar, Locale locale) {
        return m(locale).f("F(" + t(eVar) + ")_d");
    }

    @Override // net.time4j.format.u
    public String[] f(String str, Locale locale, v vVar) {
        return l(locale, vVar);
    }

    @Override // net.time4j.format.u
    public String[] g(String str, Locale locale, v vVar, m mVar) {
        return u(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public String[] h(String str, Locale locale, v vVar, m mVar) {
        return q(locale, vVar, mVar);
    }

    @Override // pi.InterfaceC6083c
    public String i(net.time4j.format.e eVar, Locale locale, boolean z10) {
        String str;
        if (z10 && eVar == net.time4j.format.e.FULL) {
            str = "F(alt)";
        } else {
            str = "F(" + t(eVar) + ")_t";
        }
        return m(locale).f(str);
    }

    @Override // net.time4j.format.u
    public boolean j(String str) {
        return "iso8601".equals(str);
    }

    @Override // net.time4j.format.f
    public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        return m(locale).f("F(" + t(eVar) + ")_dt");
    }

    public String toString() {
        return "IsoTextProviderSPI";
    }
}
