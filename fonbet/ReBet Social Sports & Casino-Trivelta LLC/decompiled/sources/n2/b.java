package n2;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import e1.AbstractC4134a;
import e1.AbstractC4145l;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f56949c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f56950d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final J f56951a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f56952b = new StringBuilder();

    public static boolean b(J j10) {
        int g10 = j10.g();
        int j11 = j10.j();
        byte[] f10 = j10.f();
        if (g10 + 2 > j11) {
            return false;
        }
        int i10 = g10 + 1;
        if (f10[g10] != 47) {
            return false;
        }
        int i11 = g10 + 2;
        if (f10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= j11) {
                j10.c0(j11 - j10.g());
                return true;
            }
            if (((char) f10[i11]) == '*' && ((char) f10[i12]) == '/') {
                i11 += 2;
                j11 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(J j10) {
        char k10 = k(j10, j10.g());
        if (k10 != '\t' && k10 != '\n' && k10 != '\f' && k10 != '\r' && k10 != ' ') {
            return false;
        }
        j10.c0(1);
        return true;
    }

    public static void e(String str, c cVar) {
        Matcher matcher = f56950d.matcher(Ra.c.e(str));
        if (!matcher.matches()) {
            AbstractC4156x.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC4134a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) AbstractC4134a.e(matcher.group(1))));
    }

    public static String f(J j10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int g10 = j10.g();
        int j11 = j10.j();
        while (g10 < j11 && !z10) {
            char c10 = (char) j10.f()[g10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                g10++;
                sb2.append(c10);
            }
        }
        j10.c0(g10 - j10.g());
        return sb2.toString();
    }

    public static String g(J j10, StringBuilder sb2) {
        n(j10);
        if (j10.a() == 0) {
            return null;
        }
        String f10 = f(j10, sb2);
        if (!f10.isEmpty()) {
            return f10;
        }
        return "" + ((char) j10.M());
    }

    public static String h(J j10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int g10 = j10.g();
            String g11 = g(j10, sb2);
            if (g11 == null) {
                return null;
            }
            if ("}".equals(g11) || ";".equals(g11)) {
                j10.b0(g10);
                z10 = true;
            } else {
                sb3.append(g11);
            }
        }
        return sb3.toString();
    }

    public static String i(J j10, StringBuilder sb2) {
        n(j10);
        if (j10.a() < 5 || !"::cue".equals(j10.J(5))) {
            return null;
        }
        int g10 = j10.g();
        String g11 = g(j10, sb2);
        if (g11 == null) {
            return null;
        }
        if ("{".equals(g11)) {
            j10.b0(g10);
            return "";
        }
        String l10 = "(".equals(g11) ? l(j10) : null;
        if (")".equals(g(j10, sb2))) {
            return l10;
        }
        return null;
    }

    public static void j(J j10, c cVar, StringBuilder sb2) {
        n(j10);
        String f10 = f(j10, sb2);
        if (!f10.isEmpty() && ":".equals(g(j10, sb2))) {
            n(j10);
            String h10 = h(j10, sb2);
            if (h10 == null || h10.isEmpty()) {
                return;
            }
            int g10 = j10.g();
            String g11 = g(j10, sb2);
            if (!";".equals(g11)) {
                if (!"}".equals(g11)) {
                    return;
                } else {
                    j10.b0(g10);
                }
            }
            if (ViewProps.COLOR.equals(f10)) {
                cVar.q(AbstractC4145l.b(h10));
                return;
            }
            if ("background-color".equals(f10)) {
                cVar.n(AbstractC4145l.b(h10));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(f10)) {
                if ("over".equals(h10)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(h10)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f10)) {
                if (!"all".equals(h10) && !h10.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(f10)) {
                if ("underline".equals(h10)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f10)) {
                cVar.r(h10);
                return;
            }
            if ("font-weight".equals(f10)) {
                if ("bold".equals(h10)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(f10)) {
                if ("italic".equals(h10)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(f10)) {
                e(h10, cVar);
            }
        }
    }

    public static char k(J j10, int i10) {
        return (char) j10.f()[i10];
    }

    public static String l(J j10) {
        int g10 = j10.g();
        int j11 = j10.j();
        boolean z10 = false;
        while (g10 < j11 && !z10) {
            int i10 = g10 + 1;
            z10 = ((char) j10.f()[g10]) == ')';
            g10 = i10;
        }
        return j10.J((g10 - 1) - j10.g()).trim();
    }

    public static void m(J j10) {
        while (!TextUtils.isEmpty(j10.x())) {
        }
    }

    public static void n(J j10) {
        while (true) {
            for (boolean z10 = true; j10.a() > 0 && z10; z10 = false) {
                if (!c(j10) && !b(j10)) {
                }
            }
            return;
        }
    }

    public final void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f56949c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                cVar.z((String) AbstractC4134a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] A12 = Z.A1(str, "\\.");
        String str2 = A12[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            cVar.y(str2.substring(0, indexOf2));
            cVar.x(str2.substring(indexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (A12.length > 1) {
            cVar.w((String[]) Z.h1(A12, 1, A12.length));
        }
    }

    public List d(J j10) {
        this.f56952b.setLength(0);
        int g10 = j10.g();
        m(j10);
        this.f56951a.Z(j10.f(), j10.g());
        this.f56951a.b0(g10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f56951a, this.f56952b);
            if (i10 == null || !"{".equals(g(this.f56951a, this.f56952b))) {
                break;
            }
            c cVar = new c();
            a(cVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int g11 = this.f56951a.g();
                String g12 = g(this.f56951a, this.f56952b);
                boolean z11 = g12 == null || "}".equals(g12);
                if (!z11) {
                    this.f56951a.b0(g11);
                    j(this.f56951a, cVar, this.f56952b);
                }
                str = g12;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
