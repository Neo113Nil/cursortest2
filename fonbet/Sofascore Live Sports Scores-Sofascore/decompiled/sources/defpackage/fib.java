package defpackage;

import android.os.LocaleList;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fib {
    public static final fib b = d(new LocaleList(new Locale[0]));
    public final gib a;

    public fib(gib gibVar) {
        this.a = gibVar;
    }

    public static fib a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return d(new LocaleList(localeArr));
    }

    public static fib d(LocaleList localeList) {
        return new fib(new gib(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final String c() {
        return this.a.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fib) {
            return this.a.equals(((fib) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
