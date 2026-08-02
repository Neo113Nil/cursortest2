package ni;

import com.google.android.material.shape.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: ni.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5739b implements u {
    private static final String[] EMPTY_STRINGS = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public static final Set f58565a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f58566b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f58567c;

    static {
        String[] split = net.time4j.i18n.e.h("calendar/names/generic/generic", Locale.ROOT).f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        hashSet.add("");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f58566b = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        f58567c = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("buddhist");
        hashSet3.add("chinese");
        hashSet3.add("coptic");
        hashSet3.add("dangi");
        hashSet3.add("ethiopic");
        hashSet3.add("frenchrev");
        hashSet3.add("hindu");
        hashSet3.add("generic");
        hashSet3.add("hebrew");
        hashSet3.add("indian");
        hashSet3.add("islamic");
        hashSet3.add("japanese");
        hashSet3.add("juche");
        hashSet3.add("persian");
        hashSet3.add("roc");
        hashSet3.add("vietnam");
        f58565a = Collections.unmodifiableSet(hashSet3);
    }

    public static int a(String str) {
        if (str.equals("hindu")) {
            return 6;
        }
        return (str.equals("ethiopic") || str.equals("generic") || str.equals("roc") || str.equals("buddhist") || str.equals("korean")) ? 2 : 1;
    }

    public static int e(String str) {
        return (str.equals("coptic") || str.equals("ethiopic") || str.equals("generic") || str.equals("hebrew")) ? 13 : 12;
    }

    public static net.time4j.i18n.e i(String str, Locale locale) {
        String str2 = "calendar/names/" + str + "/" + str;
        if (!f58566b.contains(net.time4j.i18n.d.a(locale))) {
            locale = Locale.ROOT;
        }
        return net.time4j.i18n.e.h(str2, locale);
    }

    public static String k(net.time4j.i18n.e eVar, String str) {
        return (eVar.b("useShortKeys") && "true".equals(eVar.f("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    public static String[] l(net.time4j.i18n.e eVar, String str, String str2, int i10, String str3, v vVar, m mVar, boolean z10, int i11) {
        String[] strArr = new String[i10];
        boolean z11 = str3.length() == 1;
        for (int i12 = 0; i12 < i10; i12++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('(');
            if (z11) {
                char charAt = vVar.name().charAt(0);
                if (mVar != m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb2.append(charAt);
            } else {
                sb2.append(vVar.name());
                if (mVar == m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(mVar.name());
                }
                if (z10) {
                    sb2.append('|');
                    sb2.append("LEAP");
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i12 + i11);
            if (z10 && i12 == 6 && str.equals("hebrew")) {
                sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            }
            String sb3 = sb2.toString();
            if (!eVar.b(sb3)) {
                return null;
            }
            String f10 = eVar.f(sb3);
            if (z10 && str.equals("chinese")) {
                f10 = m(f10, str2, vVar, mVar);
            }
            strArr[i12] = f10;
        }
        return strArr;
    }

    public static String m(String str, String str2, v vVar, m mVar) {
        if (str2.equals("en")) {
            if (vVar == v.NARROW) {
                return i.f35755A + str;
            }
            return "(leap) " + str;
        }
        if (str2.equals("de") || str2.equals("es") || str2.equals("fr") || str2.equals("it") || str2.equals("pt") || str2.equals("ro")) {
            if (vVar == v.NARROW) {
                return i.f35755A + str;
            }
            return "(i) " + str;
        }
        if (str2.equals("ja")) {
            return "閏" + str;
        }
        if (str2.equals("ko")) {
            return "윤" + str;
        }
        if (str2.equals("zh")) {
            return "閏" + str;
        }
        if (!str2.equals("vi")) {
            return "*" + str;
        }
        if (vVar == v.NARROW) {
            return str + "n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(mVar == m.STANDALONE ? " Nhuận" : " nhuận");
        return sb2.toString();
    }

    @Override // net.time4j.format.u
    public boolean b(Locale locale) {
        return true;
    }

    @Override // net.time4j.format.u
    public String[] c(String str, Locale locale, v vVar, m mVar) {
        return EMPTY_STRINGS;
    }

    @Override // net.time4j.format.u
    public String[] d(String str, Locale locale, v vVar, m mVar, boolean z10) {
        String str2 = str;
        v vVar2 = vVar;
        if (str2.equals("roc") || str2.equals("buddhist")) {
            List b10 = net.time4j.format.b.d(locale).l(vVar2, mVar).b();
            return (String[]) b10.toArray(new String[b10.size()]);
        }
        if (str2.equals("japanese")) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }
        if (str2.equals("dangi") || str2.equals("vietnam")) {
            str2 = "chinese";
        } else if (str2.equals("hindu")) {
            str2 = "indian";
        } else if (str2.equals("juche")) {
            return (String[]) net.time4j.format.b.d(locale).l(vVar2, mVar).b().toArray(new String[12]);
        }
        String str3 = str2;
        net.time4j.i18n.e i10 = i(str3, locale);
        if (vVar2 == v.SHORT) {
            vVar2 = v.ABBREVIATED;
        }
        v vVar3 = vVar2;
        String[] l10 = l(i10, str3, locale.getLanguage(), e(str3), k(i10, "MONTH_OF_YEAR"), vVar3, mVar, z10, 1);
        if (l10 == null) {
            m mVar2 = m.STANDALONE;
            if (mVar == mVar2) {
                if (vVar3 != v.NARROW) {
                    l10 = d(str3, locale, vVar3, m.FORMAT, z10);
                }
            } else if (vVar3 == v.ABBREVIATED) {
                l10 = d(str3, locale, v.WIDE, m.FORMAT, z10);
            } else if (vVar3 == v.NARROW) {
                l10 = d(str3, locale, vVar3, mVar2, z10);
            }
        }
        if (l10 != null) {
            return l10;
        }
        throw new MissingResourceException("Cannot find calendar month.", C5739b.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.u
    public String[] f(String str, Locale locale, v vVar) {
        v vVar2;
        if (str.equals("chinese") || str.equals("vietnam")) {
            return EMPTY_STRINGS;
        }
        if (str.equals("japanese")) {
            return vVar == v.NARROW ? new String[]{"M", "T", "S", "H"} : new String[]{"Meiji", "Taishō", "Shōwa", "Heisei"};
        }
        if (str.equals("dangi") || str.equals("juche")) {
            String[] f10 = f("korean", locale, vVar);
            return new String[]{str.equals("dangi") ? f10[0] : f10[1]};
        }
        net.time4j.i18n.e i10 = i(str, locale);
        if (vVar == v.SHORT) {
            vVar = v.ABBREVIATED;
        }
        v vVar3 = vVar;
        String[] l10 = l(i10, str, locale.getLanguage(), a(str), k(i10, "ERA"), vVar3, m.FORMAT, false, 0);
        if (l10 == null && vVar3 != (vVar2 = v.ABBREVIATED)) {
            l10 = f(str, locale, vVar2);
        }
        if (l10 != null) {
            return l10;
        }
        throw new MissingResourceException("Cannot find calendar resource for era.", C5739b.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.u
    public String[] g(String str, Locale locale, v vVar, m mVar) {
        return EMPTY_STRINGS;
    }

    @Override // net.time4j.format.u
    public String[] h(String str, Locale locale, v vVar, m mVar) {
        return EMPTY_STRINGS;
    }

    @Override // net.time4j.format.u
    public boolean j(String str) {
        return f58565a.contains(str);
    }

    public String toString() {
        return "GenericTextProviderSPI";
    }
}
