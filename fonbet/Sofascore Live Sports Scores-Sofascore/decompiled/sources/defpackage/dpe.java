package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.network.response.EventStatisticsItem;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dpe {
    public final boolean a;
    public final boolean b;

    public dpe(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static boolean a(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Number number = (Number) pair.a;
            Number number2 = (Number) pair.b;
            if (yid.k(number != null ? Double.valueOf(number.doubleValue()) : null) > 0.0d) {
                return true;
            }
            if (yid.k(number2 != null ? Double.valueOf(number2.doubleValue()) : null) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int b(Pair pair, Pair pair2, boolean z, boolean z2) {
        Object obj = pair.b;
        Object obj2 = pair.a;
        Object obj3 = pair2.b;
        Object obj4 = pair2.a;
        return z ? ((Number) obj2).intValue() != ((Number) obj4).intValue() ? Intrinsics.d(((Number) obj2).intValue(), ((Number) obj4).intValue()) : z2 ? Intrinsics.d(((Number) obj).intValue(), ((Number) obj3).intValue()) : Intrinsics.d(((Number) obj3).intValue(), ((Number) obj).intValue()) : ((Number) obj).intValue() != ((Number) obj3).intValue() ? Intrinsics.d(((Number) obj).intValue(), ((Number) obj3).intValue()) : z2 ? Intrinsics.d(((Number) obj2).intValue(), ((Number) obj4).intValue()) : Intrinsics.d(((Number) obj4).intValue(), ((Number) obj2).intValue());
    }

    public static int c(Double d, Double d2) {
        Integer num;
        if (d != null) {
            double doubleValue = d.doubleValue();
            return d2 != null ? Double.compare(doubleValue, d2.doubleValue()) : Double.compare(doubleValue, 0.0d) > 0 ? 1 : 0;
        }
        if (d2 != null) {
            num = Integer.valueOf(Double.compare(0.0d, d2.doubleValue()) > 0 ? -1 : 0);
        } else {
            num = null;
        }
        return yid.m(num);
    }

    public static int d(Integer num, Integer num2) {
        Integer num3;
        if (num != null) {
            int intValue = num.intValue();
            return num2 != null ? Intrinsics.d(intValue, num2.intValue()) : intValue > 0 ? 1 : 0;
        }
        if (num2 != null) {
            num3 = Integer.valueOf(num2.intValue() > 0 ? -1 : 0);
        } else {
            num3 = null;
        }
        return yid.m(num3);
    }

    public static Serializable e(dpe dpeVar, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 128) != 0) {
            z2 = true;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z3 = true;
        }
        boolean z4 = false;
        boolean z5 = (i & 512) != 0;
        dpeVar.getClass();
        str.getClass();
        if (!dpeVar.b && z) {
            z4 = true;
        }
        zj7 zj7Var = new zj7(z4, 5);
        return dpeVar.n(str, z2 ? (String) zj7Var.invoke(num, num2) : null, z3 ? (String) zj7Var.invoke(num3, num4) : null, b(new Pair(Integer.valueOf(yid.m(num)), Integer.valueOf(yid.m(num2))), new Pair(Integer.valueOf(yid.m(num3)), Integer.valueOf(yid.m(num4))), true, z5), null);
    }

    public static Serializable f(dpe dpeVar, String str, Double d, Double d2, Double d3, Double d4, Function1 function1) {
        String str2;
        str.getClass();
        String str3 = null;
        if (d != null) {
            str2 = rei.w(Double.valueOf(d != null ? d.doubleValue() : 0.0d), Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d), function1);
        } else {
            str2 = null;
        }
        if (d3 != null) {
            str3 = rei.w(Double.valueOf(d3 != null ? d3.doubleValue() : 0.0d), Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d), function1);
        }
        return dpeVar.n(str, str2, str3, c(Double.valueOf(d != null ? d.doubleValue() : 0.0d), Double.valueOf(d3 != null ? d3.doubleValue() : 0.0d)), null);
    }

    public static Serializable h(dpe dpeVar, String str, Integer num, Integer num2, boolean z, boolean z2, EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType, Function1 function1, int i) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        boolean z3 = (i & 8) != 0 ? true : z;
        boolean z4 = (i & 16) == 0 ? z2 : true;
        String str2 = null;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType2 = (i & 32) != 0 ? null : specialEventStatisticType;
        Function1 jieVar = (i & 64) != 0 ? new jie(7) : function1;
        dpeVar.getClass();
        str.getClass();
        if (z3 && z4) {
            return dpeVar.n(str, (String) jieVar.invoke(Integer.valueOf(yid.m(num))), (String) jieVar.invoke(Integer.valueOf(yid.m(num2))), d(num, num2), specialEventStatisticType2);
        }
        if (z3 && !z4) {
            String str3 = (String) jieVar.invoke(Integer.valueOf(yid.m(num)));
            if (num2 != null && (intValue4 = num2.intValue()) > 0) {
                str2 = (String) jieVar.invoke(Integer.valueOf(intValue4));
            }
            return dpeVar.n(str, str3, str2, d(num, num2), specialEventStatisticType2);
        }
        if (!z3 && z4) {
            if (num != null && (intValue3 = num.intValue()) > 0) {
                str2 = (String) jieVar.invoke(Integer.valueOf(intValue3));
            }
            return dpeVar.n(str, str2, (String) jieVar.invoke(Integer.valueOf(yid.m(num2))), d(num, num2), specialEventStatisticType2);
        }
        String str4 = (num == null || (intValue2 = num.intValue()) <= 0) ? null : (String) jieVar.invoke(Integer.valueOf(intValue2));
        if (num2 != null && (intValue = num2.intValue()) > 0) {
            str2 = (String) jieVar.invoke(Integer.valueOf(intValue));
        }
        return dpeVar.n(str, str4, str2, d(num, num2), specialEventStatisticType2);
    }

    public static Serializable i(dpe dpeVar, String str, Double d, Double d2) {
        dpeVar.getClass();
        str.getClass();
        return dpeVar.n(str, rei.a(Double.valueOf(yid.k(d)), false), rei.a(Double.valueOf(yid.k(d2)), false), c(d, d2), null);
    }

    public static Serializable j(dpe dpeVar, String str, Double d, Double d2, int i, boolean z, boolean z2, EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType, Function1 function1, int i2) {
        int i3 = (i2 & 8) != 0 ? 1 : i;
        boolean z3 = (i2 & 16) == 0;
        boolean z4 = (i2 & 32) != 0 ? false : z;
        boolean z5 = (i2 & 64) == 0 ? z2 : false;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType2 = (i2 & 128) != 0 ? null : specialEventStatisticType;
        Function1 jieVar = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new jie(8) : function1;
        dpeVar.getClass();
        str.getClass();
        if ((d == null || (!z3 && d.doubleValue() <= 0.0d)) && (d2 == null || (!z3 && d2.doubleValue() <= 0.0d))) {
            return null;
        }
        return dpeVar.n(str, (z4 && d == null) ? null : (String) jieVar.invoke(rei.b(i3, d)), (z5 && d2 == null) ? null : (String) jieVar.invoke(rei.b(i3, d2)), c(d, d2), specialEventStatisticType2);
    }

    public static Serializable m(dpe dpeVar, String str, Double d, Double d2, boolean z, int i) {
        str.getClass();
        return dpeVar.n(str, rei.c(Double.valueOf(yid.k(d)), 1, z), rei.c(Double.valueOf(yid.k(d2)), 1, z), c(Double.valueOf(yid.k(d)), Double.valueOf(yid.k(d2))), null);
    }

    public static Serializable o(dpe dpeVar, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 64) != 0 ? true : z2;
        boolean z6 = (i & 128) != 0 ? true : z3;
        boolean z7 = (i & 512) != 0;
        str.getClass();
        return dpeVar.n(str, z5 ? rei.u(Integer.valueOf(yid.m(num)), Integer.valueOf(yid.m(num2)), z, false) : null, z6 ? rei.u(Integer.valueOf(yid.m(num3)), Integer.valueOf(yid.m(num4)), z, false) : null, b(new Pair(Integer.valueOf(yid.m(num)), Integer.valueOf(z ? yid.m(num2) : yid.m(num) + yid.m(num2))), new Pair(Integer.valueOf(yid.m(num3)), Integer.valueOf(z ? yid.m(num4) : yid.m(num3) + yid.m(num4))), z4, z7), null);
    }

    public final Serializable g(String str, Double d, Double d2, int i) {
        str.getClass();
        return n(str, rei.b(i, d), rei.b(i, d2), c(d, d2), null);
    }

    public final Serializable k(String str, Integer num, Integer num2, boolean z, boolean z2) {
        str.getClass();
        String str2 = null;
        if ((num == null || num.intValue() <= 0) && (num2 == null || num2.intValue() <= 0)) {
            return null;
        }
        String valueOf = (!z || num == null) ? null : String.valueOf(num.intValue());
        if (z2 && num2 != null) {
            str2 = String.valueOf(num2.intValue());
        }
        return n(str, valueOf, str2, d(num, num2), null);
    }

    public final Serializable l(Integer num, Integer num2, String str) {
        str.getClass();
        if (num == null && num2 == null) {
            return null;
        }
        return n(str, num != null ? String.valueOf(num.intValue()) : null, num2 != null ? String.valueOf(num2.intValue()) : null, d(num, num2), null);
    }

    public final Serializable n(String str, String str2, String str3, int i, EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType) {
        int i2;
        Double valueOf = Double.valueOf(0.0d);
        str.getClass();
        String str4 = (str2 == null || str2.length() == 0) ? "-" : str2;
        String str5 = (str3 == null || str3.length() == 0) ? "-" : str3;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = i < 0 ? 2 : 0;
        }
        if (!this.b || (str4.equals("-") && str5.equals("-"))) {
            if (str4.equals("-")) {
                return null;
            }
            return new jei(str, str4, specialEventStatisticType);
        }
        EventStatisticsItem eventStatisticsItem = new EventStatisticsItem(str, str4, str5, i2, this.a, "", "", 0.0d, 0.0d, valueOf, valueOf, 1, specialEventStatisticType, null, 8192, null);
        eventStatisticsItem.setHideDivider(true);
        return eventStatisticsItem;
    }
}
