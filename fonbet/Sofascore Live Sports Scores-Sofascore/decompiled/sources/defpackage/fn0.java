package defpackage;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.q0;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class fn0 {
    public static void A(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static boolean B(String str) {
        e58 f = e58.f();
        f.getClass();
        return f.c(str);
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static int a(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return i + i2 + i3 + i4 + i5 + i6 + i7;
    }

    public static int c(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static int d(bx7 bx7Var, int i, int i2) {
        return (bx7Var.hashCode() + i) * i2;
    }

    public static xtc e(float f, xtc xtcVar, boolean z) {
        return xtcVar.z(new goa(f, z));
    }

    public static Intent f(String str, Context context, BroadcastReceiver broadcastReceiver) {
        return context.registerReceiver(broadcastReceiver, new IntentFilter(str));
    }

    public static BasketballTeamSeasonStatistics g(c73 c73Var, Context context, c73 c73Var2) {
        c73Var.getClass();
        context.getClass();
        return z8e.F(c73Var2);
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object i(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        return animatedValue;
    }

    public static String j(int i, int i2, String str) {
        str.getClass();
        return rei.l(i2, Integer.valueOf(i));
    }

    public static String k(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(xj1 xj1Var, Number number) {
        xj1Var.getClass();
        return String.valueOf(wzb.b(number.floatValue()));
    }

    public static String n(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static HashMap o(Class cls, ql0 ql0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, ql0Var);
        return hashMap;
    }

    public static Map p(String str, String str2) {
        Map d = sub.d(new Pair(str, str2));
        d.getClass();
        return d;
    }

    public static Map q(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void r(int i, String str) {
        tgj.d0(str + i);
    }

    public static void s(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
    }

    public static void t(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void u(long j, DateTimeFormatter dateTimeFormatter, TextView textView) {
        String format = dateTimeFormatter.format(Instant.ofEpochSecond(j));
        format.getClass();
        textView.setText(format);
    }

    public static void v(Double d, Integer num, String str, String str2, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static void w(Integer num, Integer num2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(num);
        sb.append(str2);
        sb.append(num2);
    }

    public static void x(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(num);
        sb.append(str2);
        sb.append(str3);
    }

    public static void y(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
    }

    public static void z(String str, String str2, Throwable th) {
        q0.b(str2, str + th);
    }
}
