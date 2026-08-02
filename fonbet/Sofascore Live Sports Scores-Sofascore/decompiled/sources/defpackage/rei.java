package defpackage;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rei {
    public static final rei a = new rei();

    public static String a(Double d, boolean z) {
        if (yid.k(d) < 1.0d || !z) {
            String format = new DecimalFormat(".000", new DecimalFormatSymbols(Locale.US)).format(yid.k(d));
            format.getClass();
            return format;
        }
        String format2 = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US)).format(yid.k(d));
        format2.getClass();
        return format2;
    }

    public static final String b(int i, Double d) {
        String k = lnb.k(i, "%.", InneractiveMediationDefs.GENDER_FEMALE);
        Locale locale = Locale.US;
        String format = String.format(locale, k, Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1));
        return Double.parseDouble(format) == 0.0d ? String.format(locale, lnb.k(i, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(0.0d)}, 1)) : format;
    }

    public static String c(Double d, int i, boolean z) {
        return g(d != null ? d.doubleValue() : 0.0d, i).concat(z ? "%" : "");
    }

    public static String d(int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return c(Double.valueOf(i2 == 0 ? 0.0d : 100.0d * (i / i2)), i3, (i4 & 8) != 0);
    }

    public static /* synthetic */ String e(Double d, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return c(d, i, (i2 & 4) != 0);
    }

    public static String f(int i, int i2, Integer num) {
        if (num == null) {
            return String.valueOf(i);
        }
        String g = fc6.g(i, num.intValue(), "/");
        return num.intValue() > 0 ? fc6.n(g, " (", d(i, num.intValue(), i2, 8), ")") : g;
    }

    public static String g(double d, int i) {
        if (Double.parseDouble(String.format(Locale.US, lnb.k(i, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1))) == 100.0d) {
            return StatisticData.ERROR_CODE_NOT_FOUND;
        }
        return String.format(dla.d(), lnb.k(i, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public static final String h(Integer num, Integer num2, boolean z, boolean z2) {
        if (!z || num2 == null || num2.intValue() <= 0) {
            if ((num2 == null || num2.intValue() <= 0) && (num2 == null || num2.intValue() != 0 || num == null || num.intValue() != 0)) {
                return String.valueOf(yid.m(num));
            }
            return (num != null ? num.intValue() : 0) + "/" + num2;
        }
        String t = t(Double.valueOf(((num != null ? num.intValue() : 0) / num2.intValue()) * 100.0d));
        String str = (num != null ? num.intValue() : 0) + "/" + num2 + " (" + t + ")";
        if (z2) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        StringBuilder q = mz1.q(num != null ? num.intValue() : 0, "(", t, ") ", "/");
        q.append(num2);
        return q.toString();
    }

    public static /* synthetic */ String i(int i, Integer num, Integer num2, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return h(num, num2, z, false);
    }

    public static final String j(Integer num, Integer num2) {
        return (num == null || num.intValue() <= 0 || num2 == null || num2.intValue() <= 0) ? "" : k(num.intValue() / num2.intValue(), false);
    }

    public static final String k(int i, boolean z) {
        return z ? String.format(dla.d(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)) : String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    public static String l(int i, Number number) {
        Locale locale = ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT);
        if (i == 0) {
            return "0.0";
        }
        double doubleValue = number.doubleValue() / i;
        return ljg.n((doubleValue <= 0.0d || doubleValue >= 0.1d) ? new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(locale)) : new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(locale)), RoundingMode.HALF_UP, doubleValue);
    }

    public static final String m(Number number, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return "";
        }
        Locale locale = Locale.US;
        if (number == null) {
            number = 0;
        }
        return String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(number.doubleValue() / num.intValue())}, 1));
    }

    public static final String n(int i, int i2, int i3) {
        return m(Integer.valueOf(i), Integer.valueOf(i2)).concat(i3 > 0 ? lnb.o(" (", d(i, i3, 0, 8), ")") : "");
    }

    public static final String o(Integer num, Integer num2, Double d, int i) {
        if (num2 == null || num2.intValue() <= 0) {
            return "";
        }
        return fc6.n(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf((num != null ? num.intValue() : 0) / num2.intValue())}, 1)), " (", e(d, i, 4), ")");
    }

    public static final String p(int i, int i2, double d) {
        return fc6.n(m(Integer.valueOf(i), Integer.valueOf(i2)), " (", t(Double.valueOf(d)), ")");
    }

    public static String q(int i, Number number) {
        Locale locale = ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT);
        if (i == 0) {
            return "0.0";
        }
        double doubleValue = (number.doubleValue() * 90.0d) / i;
        return ljg.n((doubleValue <= 0.0d || doubleValue >= 0.1d) ? new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(locale)) : new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(locale)), RoundingMode.HALF_UP, doubleValue);
    }

    public static String r(int i, Double d) {
        Locale locale = ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT);
        if (i == 0) {
            return "0.00";
        }
        return ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(locale)), RoundingMode.HALF_UP, (d.doubleValue() * 90.0d) / i);
    }

    public static final String s(Double d, Integer num, Integer num2) {
        if (num2 == null || num2.intValue() <= 0) {
            return "";
        }
        return fc6.n(t(d), " (", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf((num != null ? num.intValue() : 0) / num2.intValue())}, 1)), ")");
    }

    public static String t(Double d) {
        return mz1.i(wzb.a(d != null ? d.doubleValue() : 0.0d), "%");
    }

    public static final String u(Integer num, Integer num2, boolean z, boolean z2) {
        String str;
        int intValue = num2.intValue();
        if (z) {
            str = z2 ? null : intValue + " (" + num.intValue() + ")";
            return str == null ? dmi.k(num.intValue(), intValue, "(", ") ") : str;
        }
        str = z2 ? null : (num.intValue() + intValue) + " (" + num.intValue() + ")";
        return str == null ? lnb.j(num.intValue(), num.intValue() + intValue, "(", ") ", " ") : str;
    }

    public static String v(double d) {
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        int a2 = wzb.a(d);
        if (a2 == Double.parseDouble(format)) {
            format = String.valueOf(a2);
        }
        return dmi.y(format, "%");
    }

    public static final String w(Double d, Double d2, Function1 function1) {
        String str;
        if (d2.doubleValue() > 0.0d) {
            double doubleValue = d.doubleValue();
            double doubleValue2 = d2.doubleValue();
            str = lnb.o(" (", e(Double.valueOf(doubleValue2 != 0.0d ? 100.0d * (doubleValue / doubleValue2) : 0.0d), 1, 4), ")");
        } else {
            str = "";
        }
        return wv8.i((String) function1.invoke(b(2, d)), " ", str);
    }
}
