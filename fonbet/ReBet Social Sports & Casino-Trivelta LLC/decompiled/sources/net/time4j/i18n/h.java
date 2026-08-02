package net.time4j.i18n;

import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.Y;
import net.time4j.format.n;
import net.time4j.format.r;
import net.time4j.format.v;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class h implements r {

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$TextWidth;

        static {
            int[] iArr = new int[v.values().length];
            $SwitchMap$net$time4j$format$TextWidth = iArr;
            try {
                iArr[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String F(char c10, v vVar, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c10);
        int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
        if (i10 == 1) {
            sb2.append('w');
        } else if (i10 == 2 || i10 == 3) {
            sb2.append('s');
        } else {
            if (i10 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            sb2.append('n');
        }
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    public static String G(char c10, boolean z10, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c10);
        sb2.append(z10 ? '+' : '-');
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    public static String H(v vVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
        int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
        if (i10 == 1) {
            sb2.append('w');
        } else if (i10 == 2 || i10 == 3) {
            sb2.append('s');
        } else {
            if (i10 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            sb2.append('n');
        }
        sb2.append('-');
        sb2.append(str);
        return sb2.toString();
    }

    public static String M(String str, char c10, int i10) {
        int length = str.length();
        int i11 = length - 2;
        for (int i12 = 0; i12 < i11; i12++) {
            if (str.charAt(i12) == '{') {
                int i13 = i12 + 1;
                if (str.charAt(i13) == c10) {
                    int i14 = i12 + 2;
                    if (str.charAt(i14) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 8);
                        sb2.append(str);
                        sb2.replace(i13, i14, String.valueOf(i10));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // net.time4j.format.r
    public String A(Y y10, Locale locale) {
        return I(locale, y10.name().substring(0, 3).toLowerCase() + "+");
    }

    @Override // net.time4j.format.x
    public String B(Locale locale, v vVar, n nVar) {
        return L(locale, '6', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String C(Locale locale, boolean z10, n nVar) {
        return K(locale, 'N', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String D(Locale locale, boolean z10, n nVar) {
        return K(locale, 'm', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String E(Locale locale, boolean z10, n nVar) {
        return K(locale, 'n', z10, nVar);
    }

    public final String I(Locale locale, String str) {
        boolean z10 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e h10 = (!z10 || eVar == null) ? e.h("i18n/reltime/relpattern", locale2) : eVar;
            if (z10) {
                if (locale2.equals(h10.e())) {
                    z10 = false;
                } else {
                    eVar = h10;
                }
            }
            if (h10.d().contains(str)) {
                return h10.f(str);
            }
        }
        return "";
    }

    public final String J(Locale locale, String str, String str2, String str3, n nVar) {
        boolean z10 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e h10 = (!z10 || eVar == null) ? e.h("i18n/" + str, locale2) : eVar;
            if (z10) {
                if (locale2.equals(h10.e())) {
                    z10 = false;
                } else {
                    eVar = h10;
                }
            }
            if (h10.d().contains(str2)) {
                return h10.f(str2);
            }
            if (nVar != n.OTHER && h10.d().contains(str3)) {
                return h10.f(str3);
            }
        }
        throw new MissingResourceException("Can't find resource for bundle " + str + ".properties, key " + str2, str + ".properties", str2);
    }

    public final String K(Locale locale, char c10, boolean z10, n nVar) {
        return J(locale, "reltime/relpattern", G(c10, z10, nVar), G(c10, z10, n.OTHER), nVar);
    }

    public final String L(Locale locale, char c10, v vVar, n nVar) {
        return J(locale, "units/upattern", F(c10, vVar, nVar), F(c10, vVar, n.OTHER), nVar);
    }

    @Override // net.time4j.format.r
    public String a(Locale locale, boolean z10, n nVar) {
        return K(locale, 'h', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String b(Locale locale) {
        return J(locale, "reltime/relpattern", "yesterday", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String c(Locale locale) {
        return J(locale, "reltime/relpattern", "now", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String d(Locale locale, boolean z10, n nVar) {
        return K(locale, 'S', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String e(Locale locale, v vVar, n nVar) {
        return L(locale, 'N', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String f(Locale locale, boolean z10, n nVar) {
        return K(locale, 'M', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String g(Locale locale, v vVar, n nVar) {
        return L(locale, 'H', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String h(Locale locale) {
        return J(locale, "reltime/relpattern", "tomorrow", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String i(Locale locale, boolean z10, n nVar) {
        return K(locale, 'W', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String j(Y y10, Locale locale) {
        return I(locale, y10.name().substring(0, 3).toLowerCase() + "-");
    }

    @Override // net.time4j.format.x
    public String k(Locale locale, v vVar, n nVar) {
        return L(locale, 'Y', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String l(Locale locale, v vVar, n nVar) {
        return L(locale, 'S', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String m(Locale locale, v vVar, n nVar) {
        return L(locale, 'M', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String n(Locale locale, v vVar, n nVar) {
        return L(locale, '9', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String o(Locale locale) {
        return J(locale, "reltime/relpattern", "today", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String p(Locale locale, v vVar, n nVar) {
        return L(locale, '3', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String q(Locale locale, boolean z10, n nVar) {
        return K(locale, 'y', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String r(Locale locale, boolean z10, n nVar) {
        return K(locale, 'H', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String s(Locale locale, v vVar, n nVar) {
        return L(locale, 'D', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String t(Locale locale, v vVar, int i10) {
        int i11;
        if (i10 < 2) {
            throw new IllegalArgumentException("Size must be greater than 1.");
        }
        e h10 = e.h("i18n/units/upattern", locale);
        String H10 = H(vVar, String.valueOf(i10));
        if (h10.b(H10)) {
            return h10.f(H10);
        }
        String f10 = h10.f(H(vVar, ViewProps.END));
        if (i10 == 2) {
            return f10;
        }
        String f11 = h10.f(H(vVar, ViewProps.START));
        String f12 = h10.f(H(vVar, "middle"));
        String M10 = M(M(f10, '1', i10 - 1), '0', i10 - 2);
        int i12 = i10 - 3;
        String str = M10;
        while (i12 >= 0) {
            String str2 = i12 == 0 ? f11 : f12;
            int length = str2.length();
            int i13 = length - 1;
            while (true) {
                if (i13 < 0) {
                    i11 = -1;
                    break;
                }
                if (i13 >= 2 && str2.charAt(i13) == '}' && str2.charAt(i13 - 1) == '1') {
                    i11 = i13 - 2;
                    if (str2.charAt(i11) == '{') {
                        break;
                    }
                }
                i13--;
            }
            if (i11 > -1) {
                M10 = str2.substring(0, i11) + str;
                if (i11 < length - 3) {
                    M10 = M10 + str2.substring(i11 + 3);
                }
            }
            if (i12 > 0) {
                str = M(M10, '0', i12);
            }
            i12--;
        }
        return M10;
    }

    @Override // net.time4j.format.x
    public String u(Locale locale, boolean z10, n nVar) {
        return K(locale, 'D', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String v(Locale locale, v vVar, n nVar) {
        return L(locale, 'W', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String w(Locale locale, boolean z10, n nVar) {
        return K(locale, 'd', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String x(Locale locale, boolean z10, n nVar) {
        return K(locale, 'w', z10, nVar);
    }

    @Override // net.time4j.format.r
    public String y(Locale locale, boolean z10, n nVar) {
        return K(locale, 's', z10, nVar);
    }

    @Override // net.time4j.format.x
    public String z(Locale locale, boolean z10, n nVar) {
        return K(locale, 'Y', z10, nVar);
    }
}
