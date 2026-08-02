package cg;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3931a = {1, 10, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3932b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3933c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3934d = {1, 2, 4, 5, 7, 8};

    public static final void a(StringBuilder sb2, StringBuilder sb3, int i5) {
        if (i5 < 10) {
            sb2.append('0');
        }
        sb3.append(i5);
    }

    public static final l1.a b(String str, String str2, int i5, Function1 function1) {
        char charAt = str.charAt(i5);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return c(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i5);
    }

    public static final l1.a c(String str, String str2) {
        StringBuilder c2 = v.f.c(str2, " when parsing an Instant from \"");
        c2.append(e(64, str));
        c2.append('\"');
        return new l1.a(c2.toString(), str);
    }

    public static final int d(int i5, String str) {
        return (str.charAt(i5 + 1) - '0') + ((str.charAt(i5) - '0') * 10);
    }

    public static final String e(int i5, String str) {
        if (str.length() <= i5) {
            return str.toString();
        }
        return str.subSequence(0, i5).toString() + "...";
    }
}
