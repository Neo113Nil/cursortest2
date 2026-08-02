package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d10, double d11) {
        return (Double.isInfinite(d10) || Double.isNaN(d10)) ? d11 : d10;
    }

    public static double getFiniteDoubleOrDefaultNullable(Double d10, double d11) {
        return d10 == null ? d11 : getFiniteDoubleOrDefault(d10.doubleValue(), d11);
    }

    public static long getMillisOrDefault(Long l6, @NonNull TimeUnit timeUnit, long j) {
        return l6 == null ? j : timeUnit.toMillis(l6.longValue());
    }

    @NonNull
    public static <T> T getOrDefault(T t3, @NonNull T t5) {
        return t3 == null ? t5 : t3;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(String str, @NonNull String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t3, T t5) {
        return t3 == null ? t5 : t3;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @NonNull
    public static <T> String wrapToTag(T t3) {
        return t3 == null ? "<null>" : t3.toString().isEmpty() ? "<empty>" : t3.toString();
    }
}
