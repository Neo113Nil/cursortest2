package defpackage;

import android.icu.text.MessageFormat;
import android.icu.text.NumberFormat;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class yid {
    public static final Regex a = new Regex("(\\d)([\\u00ba\\u00aaoa])");

    public static final Double a(Number number, Integer num) {
        if (number != null) {
            return Double.valueOf(number.doubleValue() / (num != null ? num.doubleValue() : 1.0d));
        }
        return null;
    }

    public static final Double b(Number number, Number number2) {
        if (number != null && number2 != null) {
            if ((number2.doubleValue() > 1.0E-4d ? number2 : null) != null) {
                return Double.valueOf(number.doubleValue() / number2.doubleValue());
            }
        }
        return null;
    }

    public static final String c(String str, Double d) {
        return String.format(dla.d(), str, Arrays.copyOf(new Object[]{d}, 1));
    }

    public static final String d(String str, Float f) {
        return String.format(dla.d(), str, Arrays.copyOf(new Object[]{f}, 1));
    }

    public static String e(int i, String str, Integer num) {
        if ((i & 1) != 0) {
            str = "%d";
        }
        str.getClass();
        new Regex("^%.*d\\.$").f(str);
        return String.format(dla.d(), str, Arrays.copyOf(new Object[]{num}, 1));
    }

    public static final String f(Double d) {
        if (d != null) {
            return c("%.1f", d);
        }
        return null;
    }

    public static final String g(Double d) {
        if (d != null) {
            return c("%.2f", d);
        }
        return null;
    }

    public static final Double h(Double d) {
        if (d != null) {
            return Double.valueOf(-d.doubleValue());
        }
        return null;
    }

    public static final Integer i(Integer num) {
        if (num != null) {
            return Integer.valueOf(-num.intValue());
        }
        return null;
    }

    public static final String j(Integer num) {
        String valueOf;
        return (num == null || (valueOf = String.valueOf(num.intValue())) == null) ? "-" : valueOf;
    }

    public static final double k(Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final float l(Float f) {
        return f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final int m(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final long n(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static String o(Number number, Integer num) {
        if (number != null && num != null) {
            if ((num.doubleValue() > 1.0E-4d ? num : null) != null) {
                return rei.g((number.doubleValue() / num.doubleValue()) * 100.0d, 1);
            }
        }
        return null;
    }

    public static final String p(int i) {
        List list = dla.a;
        String format = new MessageFormat("{0,ordinal}", Intrinsics.c(Locale.getDefault().getLanguage(), new Locale("ar").getLanguage()) ? Locale.US : Intrinsics.c(Locale.getDefault().getLanguage(), "az") ? Locale.forLanguageTag("tr") : Locale.getDefault()).format(new Integer[]{Integer.valueOf(i)});
        if (dla.a().equals("pt-pt")) {
            format.getClass();
            Regex regex = a;
            regex.getClass();
            format = regex.a.matcher(format).replaceFirst("$1.$2");
            format.getClass();
        }
        return dmi.q("\u200e", format);
    }

    public static final String q(float f, int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance(dla.d());
        percentInstance.setMaximumFractionDigits(i);
        percentInstance.setMinimumFractionDigits(i);
        String format = percentInstance.format(f / 100.0d);
        format.getClass();
        return format;
    }

    public static final String r(int i) {
        String format = NumberFormat.getPercentInstance(dla.d()).format(i / 100.0d);
        format.getClass();
        return format;
    }

    public static final double s(double d, int i) {
        return wzb.c(d * r0) / Math.pow(10.0d, i);
    }
}
