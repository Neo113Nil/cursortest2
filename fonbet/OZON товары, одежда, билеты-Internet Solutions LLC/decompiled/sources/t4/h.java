package t4;

import j3.v;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.C8050C;
import m3.N;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f99163a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(C8050C c8050c) {
        String r11;
        while (true) {
            String r12 = c8050c.r(StandardCharsets.UTF_8);
            if (r12 == null) {
                return null;
            }
            if (f99163a.matcher(r12).matches()) {
                do {
                    r11 = c8050c.r(StandardCharsets.UTF_8);
                    if (r11 != null) {
                    }
                } while (!r11.isEmpty());
            } else {
                Matcher matcher = f.f99137a.matcher(r12);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(C8050C c8050c) {
        c8050c.getClass();
        String r11 = c8050c.r(StandardCharsets.UTF_8);
        return r11 != null && r11.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        int i11 = N.f74289a;
        String[] split = str.split("\\.", 2);
        long j11 = 0;
        for (String str2 : split[0].split(ProductContainerDTO.RATIO_DELIMITER, -1)) {
            j11 = (j11 * 60) + Long.parseLong(str2);
        }
        long j12 = j11 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j12 += Long.parseLong(trim);
        }
        return j12 * 1000;
    }

    public static void e(C8050C c8050c) throws v {
        int f7 = c8050c.f();
        if (b(c8050c)) {
            return;
        }
        c8050c.R(f7);
        throw v.a(null, "Expected WEBVTT. Got " + c8050c.r(StandardCharsets.UTF_8));
    }
}
