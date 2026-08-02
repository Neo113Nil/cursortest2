package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r0i {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        int i = lik.a;
        Locale locale = Locale.US;
        b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String str2;
        Matcher matcher = b.matcher(str);
        Matcher matcher2 = c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                m6k.Q();
            }
            str2 = matcher.group(1);
            group = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            String group2 = matcher2.group(1);
            group = matcher2.group(2);
            str2 = group2;
        }
        str2.getClass();
        float parseFloat = Float.parseFloat(str2.trim());
        group.getClass();
        return new PointF(parseFloat, Float.parseFloat(group.trim()));
    }
}
