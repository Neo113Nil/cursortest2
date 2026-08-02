package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ode {
    public static final Pattern a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");
    public static final int[] b = wt3.D(6);

    public static void b(String str, String str2) {
        if (str == null || str.length() == 0) {
            a70.p("Attribute key must not be null or empty");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            a70.p("Attribute value must not be null or empty");
            return;
        }
        if (str.length() > 40) {
            Locale locale = Locale.US;
            a70.p("Attribute key length must not exceed 40 characters");
        } else if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            a70.p("Attribute value length must not exceed 100 characters");
        } else {
            if (a.matcher(str).matches()) {
                return;
            }
            a70.p("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String c(String str) {
        String str2;
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (str.startsWith("_")) {
            for (int i : b) {
                switch (i) {
                    case 1:
                        str2 = "_fstec";
                        break;
                    case 2:
                        str2 = "_fsntc";
                        break;
                    case 3:
                        str2 = "_tsns";
                        break;
                    case 4:
                        str2 = "_fr_tot";
                        break;
                    case 5:
                        str2 = "_fr_slo";
                        break;
                    case 6:
                        str2 = "_fr_fzn";
                        break;
                    default:
                        throw null;
                }
                if (!str2.equals(str)) {
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public abstract boolean a();
}
