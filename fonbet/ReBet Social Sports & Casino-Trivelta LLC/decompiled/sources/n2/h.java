package n2;

import b1.C2338G;
import e1.J;
import e1.Z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f56999a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(J j10) {
        String x10;
        while (true) {
            String x11 = j10.x();
            if (x11 == null) {
                return null;
            }
            if (f56999a.matcher(x11).matches()) {
                do {
                    x10 = j10.x();
                    if (x10 != null) {
                    }
                } while (!x10.isEmpty());
            } else {
                Matcher matcher = e.f56973a.matcher(x11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(J j10) {
        String x10 = j10.x();
        return x10 != null && x10.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] B12 = Z.B1(str, "\\.");
        long j10 = 0;
        for (String str2 : Z.A1(B12[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (B12.length == 2) {
            String trim = B12[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + trim);
            }
            j11 += Long.parseLong(trim);
        }
        return j11 * 1000;
    }

    public static void e(J j10) {
        int g10 = j10.g();
        if (b(j10)) {
            return;
        }
        j10.b0(g10);
        throw C2338G.a("Expected WEBVTT. Got " + j10.x(), null);
    }
}
