package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.lu.sf.pcc;
import com.inmobi.media.C3906y9;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wv8 {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static long b(av8 av8Var, int i, Integer num, av8 av8Var2, boolean z) {
        av8Var.d0(i);
        long D = lz.D(num.intValue(), av8Var2);
        av8Var.s(z);
        return D;
    }

    public static gn8 c(long j, int i, d7e d7eVar, int i2) {
        return td4.b0(d7eVar, new ay1(j, i), i2);
    }

    public static fka d(String str) {
        u3a.b(str);
        return new fka();
    }

    public static pcc e(String str) {
        pcc pccVar = new pcc();
        pccVar.sf(str);
        return pccVar;
    }

    public static l f(String str) {
        return new l.b(str).a();
    }

    public static Object g(HashMap hashMap, Uri uri, Uri uri2) {
        z1a.E(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String h(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder k(Integer num, String str, String str2, String str3, Integer num2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(num2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, gv9 gv9Var, String str2, gv9 gv9Var2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(gv9Var);
        sb.append(str2);
        sb.append(gv9Var2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, Integer num, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static ArrayList n(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    public static Map o(String str, String str2) {
        return sub.d(new Pair(str, str2));
    }

    public static Pair p(int i, int i2, Integer num) {
        return new Pair(new ikh(i, i2), num);
    }

    public static Pair q(int i, c12 c12Var) {
        return new Pair(c12Var, new kma(i));
    }

    public static Pair r(int i, eo3 eo3Var) {
        return new Pair(eo3Var, new co3(i));
    }

    public static Pair s(int i, f8g f8gVar) {
        return new Pair(f8gVar, new kma(i));
    }

    public static Pair t(Context context, String str, String str2) {
        context.getClass();
        return new Pair(str, str2);
    }

    public static void u(int i, int i2, int i3, int i4, int i5) {
        d2a.b(i);
        d2a.b(i2);
        d2a.b(i3);
        d2a.b(i4);
        d2a.b(i5);
    }

    public static void v(f4g f4gVar, float f, float f2, float f3) {
        f4gVar.getClass();
        f4gVar.b(f);
        f4gVar.k(f2);
        f4gVar.l(f3);
    }

    public static void w(String str, int i, RelativeLayout.LayoutParams layoutParams, int i2) {
        layoutParams.addRule(i2, str.substring(i).hashCode());
    }

    public static void x(String str, String str2, C3906y9 c3906y9, String str3) {
        c3906y9.b(str3, str + str2);
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }
}
