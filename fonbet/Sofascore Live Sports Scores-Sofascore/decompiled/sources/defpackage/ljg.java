package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.s;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ljg {
    public static final void a(int i, View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        int C = wt3.C(i);
        if (C == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (s.O(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (C == 1) {
            if (s.O(2)) {
                Objects.toString(view);
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (s.O(2)) {
                    view.toString();
                    Objects.toString(viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (C == 2) {
            if (s.O(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (C != 3) {
                return;
            }
            if (s.O(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static /* synthetic */ long b(int i) {
        if (i == 1) {
            return 1099511627776L;
        }
        if (i == 2) {
            return 1073741824L;
        }
        if (i == 3) {
            return 1048576L;
        }
        if (i == 4) {
            return 1024L;
        }
        if (i == 5) {
            return 1L;
        }
        throw null;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(int i, int i2, gv9 gv9Var) {
        return (gv9Var.hashCode() + i) * i2;
    }

    public static int e(Attributes attributes, int i) {
        return cog.a(attributes.getLocalName(i)).ordinal();
    }

    public static long f(av8 av8Var, int i, int i2, av8 av8Var2, boolean z) {
        av8Var.d0(i);
        long D = lz.D(i2, av8Var2);
        av8Var.s(z);
        return D;
    }

    public static goa g(av8 av8Var, xtc xtcVar, f50 f50Var, float f, boolean z) {
        waa.K(av8Var, xtcVar, f50Var);
        return new goa(f, z);
    }

    public static xtc h(float f, xtc xtcVar, long j, float f2) {
        return l98.b0(n9e.q(xtcVar, j, o7g.a(f)), f2);
    }

    public static xtc i(utc utcVar, float f, av8 av8Var, utc utcVar2, float f2) {
        nq8.h(av8Var, bkh.p(utcVar, f));
        return bkh.l(utcVar2, f2);
    }

    public static String j(int i, String str) {
        return str + i;
    }

    public static String k(av8 av8Var, int i, int i2, av8 av8Var2, boolean z) {
        av8Var.d0(i);
        String v = oea.v(i2, av8Var2);
        av8Var.s(z);
        return v;
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(Integer num, Integer num2, String str) {
        return num + str + num2;
    }

    public static String n(DecimalFormat decimalFormat, RoundingMode roundingMode, double d) {
        decimalFormat.setRoundingMode(roundingMode);
        String format = decimalFormat.format(d);
        format.getClass();
        return format;
    }

    public static StringBuilder o(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static Iterator p(av8 av8Var, xtc xtcVar, f50 f50Var, int i, gv9 gv9Var) {
        waa.K(av8Var, xtcVar, f50Var);
        av8Var.d0(i);
        return gv9Var.iterator();
    }

    public static FqName q(String str, FqName fqName) {
        FqName child = fqName.child(Name.identifier(str));
        child.getClass();
        return child;
    }

    public static void r(float f, int i, av8 av8Var, av8 av8Var2, utc utcVar) {
        av8Var.d0(i);
        nq8.h(av8Var2, bkh.p(utcVar, f));
    }

    public static void s(int i, int i2, String str, String str2, HashMap hashMap) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void t(av8 av8Var, boolean z, boolean z2, boolean z3) {
        av8Var.s(z);
        av8Var.s(z2);
        av8Var.s(z3);
    }

    public static boolean u(String str, String str2) {
        return str2.equals(new Locale(str).getLanguage());
    }

    public static boolean v(Method method) {
        method.getClass();
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean w(Method method) {
        method.getClass();
        return Modifier.isPublic(method.getModifiers());
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "FILL";
        }
        if (i == 2) {
            return "FIT";
        }
        throw null;
    }

    public static /* synthetic */ int y(String str) {
        if (str == null) {
            yhk.s("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        a70.p("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}
