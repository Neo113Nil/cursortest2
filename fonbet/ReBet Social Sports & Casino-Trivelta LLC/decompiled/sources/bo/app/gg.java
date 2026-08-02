package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* loaded from: classes.dex */
public abstract class gg implements v9 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f25490d = BrazeLogger.getBrazeLogTag((Class<?>) gg.class);

    /* renamed from: a, reason: collision with root package name */
    public final long f25491a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25492b;

    /* renamed from: c, reason: collision with root package name */
    public y8 f25493c;

    public gg() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f25492b = nowInMilliseconds;
        this.f25491a = nowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e10) {
            BrazeLogger.e(f25490d, "Unexpected error decoding Base64 encoded campaign Id " + str, e10);
            return null;
        }
    }
}
