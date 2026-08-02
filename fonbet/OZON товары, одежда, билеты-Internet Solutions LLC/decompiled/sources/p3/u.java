package p3;

import C.C2702w;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f80123a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f80124b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j11, long j12) {
        if (j11 == 0 && j12 == -1) {
            return null;
        }
        StringBuilder d11 = C2702w.d(j11, "bytes=", "-");
        if (j12 != -1) {
            d11.append((j11 + j12) - 1);
        }
        return d11.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(String str, String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                m3.s.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
            if (!TextUtils.isEmpty(str2)) {
                return parseLong;
            }
            Matcher matcher = f80123a.matcher(str2);
            if (!matcher.matches()) {
                return parseLong;
            }
            try {
                String group = matcher.group(2);
                group.getClass();
                long parseLong2 = Long.parseLong(group);
                String group2 = matcher.group(1);
                group2.getClass();
                long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                if (parseLong < 0) {
                    return parseLong3;
                }
                if (parseLong == parseLong3) {
                    return parseLong;
                }
                m3.s.f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                return Math.max(parseLong, parseLong3);
            } catch (NumberFormatException unused2) {
                m3.s.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                return parseLong;
            }
        }
        parseLong = -1;
        if (!TextUtils.isEmpty(str2)) {
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f80124b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
