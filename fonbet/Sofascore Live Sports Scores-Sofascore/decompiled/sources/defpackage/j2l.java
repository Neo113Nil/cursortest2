package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j2l {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(j9e j9eVar) {
        String n = j9eVar.n(StandardCharsets.UTF_8);
        return n != null && n.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = nik.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                a70.p("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void d(j9e j9eVar) {
        int i = j9eVar.b;
        if (a(j9eVar)) {
            return;
        }
        j9eVar.N(i);
        throw s9e.a(null, "Expected WEBVTT. Got " + j9eVar.n(StandardCharsets.UTF_8));
    }
}
