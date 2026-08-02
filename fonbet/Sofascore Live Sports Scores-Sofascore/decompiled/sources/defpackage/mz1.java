package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mz1 {
    public static void A(ArrayList arrayList, String str, String str2) {
        arrayList.add(str + str2);
    }

    public static void B(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static boolean C() {
        return jca.G(ok3.p().e());
    }

    public static /* synthetic */ boolean a(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int d(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static xzc e(av8 av8Var) {
        xzc xzcVar = new xzc();
        av8Var.n0(xzcVar);
        return xzcVar;
    }

    public static Integer f(int i, int i2, String str, String str2, HashMap hashMap) {
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(str, valueOf);
        hashMap.put(str2, valueOf);
        return Integer.valueOf(i2);
    }

    public static Object g(int i, List list) {
        return list.get(list.size() - i);
    }

    public static Object h(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String i(int i, String str) {
        return i + str;
    }

    public static String j(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String k(fuf fufVar, Class cls, StringBuilder sb) {
        sb.append(fufVar.getOrCreateKotlinClass(cls));
        return sb.toString();
    }

    public static String l(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static String n(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String p(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder q(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void t(int i, av8 av8Var, int i2, f50 f50Var) {
        av8Var.n0(Integer.valueOf(i));
        av8Var.b(Integer.valueOf(i2), f50Var);
    }

    public static void u(int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i2, i3, i4);
    }

    public static void v(sx2 sx2Var, long j) {
        sx2Var.t().h();
        sx2Var.N(j);
    }

    public static void w(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, i3);
    }

    public static void x(Double d, Integer num, String str, String str2, StringBuilder sb) {
        sb.append(d);
        sb.append(str);
        sb.append(num);
        sb.append(str2);
    }

    public static void y(String str, Boolean bool, ArrayList arrayList) {
        arrayList.add(str + bool);
    }

    public static void z(String str, String str2) {
        tgj.d0(str + str2);
    }
}
