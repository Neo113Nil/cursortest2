package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.tools.q0;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class me4 {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int c(Score score, int i, int i2) {
        return (score.hashCode() + i) * i2;
    }

    public static FirebaseAnalytics d(f5d f5dVar, String str, FirebaseBundle firebaseBundle, Context context) {
        f5dVar.c(str, firebaseBundle);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }

    public static Object e() {
        return ok3.p().d().get();
    }

    public static Object f(int i, Map map) {
        return map.get(new Integer(i));
    }

    public static String g(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String h(String str, String str2, String str3) {
        return new Regex(str).replace(str2, str3);
    }

    public static String i(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String j(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
        return sb.toString();
    }

    public static ArrayList k(List list) {
        list.getClass();
        return new ArrayList();
    }

    public static void l(int i, Function2 function2, av8 av8Var, boolean z) {
        function2.invoke(av8Var, Integer.valueOf(i));
        av8Var.s(z);
    }

    public static void m(nlg nlgVar, int i, int i2, int i3, int i4) {
        nlgVar.s(i);
        nlgVar.s(i2);
        nlgVar.s(i3);
        nlgVar.s(i4);
    }

    public static void n(PlayerEventStatisticsModal playerEventStatisticsModal, AppCompatActivity appCompatActivity, rq3 rq3Var, k6b k6bVar) {
        k6bVar.b(new r1(playerEventStatisticsModal, appCompatActivity, rq3Var, 3));
    }

    public static void o(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    public static void p(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void q(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void r(StringBuilder sb, String str, int i, String str2, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void s(Object[] objArr, int i, Locale locale, String str, TextView textView) {
        textView.setText(String.format(locale, str, Arrays.copyOf(objArr, i)));
    }

    public static boolean t(String str, Event event) {
        return Intrinsics.c(event.getStatus().getType(), str);
    }

    public static void u(String str, String str2, String str3) {
        q0.b(str3, str + str2);
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
