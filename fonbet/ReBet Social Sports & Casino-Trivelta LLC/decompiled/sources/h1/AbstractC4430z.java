package h1;

import android.text.TextUtils;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4430z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f47626a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f47627b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(String str, String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC4156x.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
            if (!TextUtils.isEmpty(str2)) {
                return parseLong;
            }
            Matcher matcher = f47626a.matcher(str2);
            if (!matcher.matches()) {
                return parseLong;
            }
            try {
                long parseLong2 = (Long.parseLong((String) AbstractC4134a.e(matcher.group(2))) - Long.parseLong((String) AbstractC4134a.e(matcher.group(1)))) + 1;
                if (parseLong < 0) {
                    return parseLong2;
                }
                if (parseLong == parseLong2) {
                    return parseLong;
                }
                AbstractC4156x.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                AbstractC4156x.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
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
        Matcher matcher = f47627b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC4134a.e(matcher.group(1)));
        }
        return -1L;
    }
}
