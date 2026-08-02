package defpackage;

import android.icu.text.DateTimePatternGenerator;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hk4 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static DateTimePatternGenerator b;

    public static DateTimeFormatter a(String str) {
        str.getClass();
        Object computeIfAbsent = a.computeIfAbsent(str, new ux3(new jp1(str, 8), 3));
        computeIfAbsent.getClass();
        return (DateTimeFormatter) computeIfAbsent;
    }

    public static DateTimePatternGenerator b() {
        DateTimePatternGenerator dateTimePatternGenerator = b;
        if (dateTimePatternGenerator == null) {
            try {
                dateTimePatternGenerator = DateTimePatternGenerator.getInstance(dla.d());
            } catch (IllegalArgumentException e) {
                s38.a().c(new Exception(dmi.q("Unknown calendar type for locale=", dla.d().getLanguage()), e));
                dateTimePatternGenerator = DateTimePatternGenerator.getInstance(Locale.US);
            }
            b = dateTimePatternGenerator;
        }
        dateTimePatternGenerator.getClass();
        return dateTimePatternGenerator;
    }
}
