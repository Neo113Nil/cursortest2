package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class vxd {
    public static /* synthetic */ boolean a(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static int b(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int d(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static r13 e(av8 av8Var, boolean z, long j) {
        av8Var.s(z);
        return new r13(j);
    }

    public static xtc f(utc utcVar, float f, av8 av8Var, utc utcVar2, float f2) {
        nq8.h(av8Var, bkh.e(utcVar, f));
        return bkh.d(utcVar2, f2);
    }

    public static ktd g(Class cls, md4 md4Var) {
        ktd A = mha.A(new ktd(cls));
        mha.y(A);
        A.f(md4Var);
        return A;
    }

    public static xbl h(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        xbl d = xbl.d(applicationContext);
        d.getClass();
        return d;
    }

    public static Boolean i(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.getClass();
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
    }

    public static String j(int i, String str, String str2, String str3) {
        return str + str2 + i + str3;
    }

    public static String k(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String m(String str, long j, String str2) {
        return str + j + str2;
    }

    public static String n(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static LocalDate o(Instant instant) {
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static void p(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void q(long j, String str, StringBuilder sb) {
        sb.append((Object) r13.i(j));
        sb.append(str);
    }

    public static void r(Integer num, Integer num2, String str, String str2, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }

    public static void s(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void t(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void u(StringBuilder sb, gv9 gv9Var, String str, gv9 gv9Var2, String str2) {
        sb.append(gv9Var);
        sb.append(str);
        sb.append(gv9Var2);
        sb.append(str2);
    }

    public static void v(StringBuilder sb, Integer num, String str, Boolean bool, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(bool);
        sb.append(str2);
    }

    public static void w(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }
}
