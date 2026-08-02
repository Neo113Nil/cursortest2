package l0;

import android.os.Build;
import com.google.android.gms.internal.measurement.h4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f19305b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final i f19306a;

    public g(i iVar) {
        this.f19306a = iVar;
    }

    public static g a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new g(new j(h4.c(localeArr))) : new g(new h(localeArr));
    }

    public static g b(String str) {
        if (str == null || str.isEmpty()) {
            return f19305b;
        }
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = split[i5];
            int i10 = f.f19304a;
            localeArr[i5] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f19306a.equals(((g) obj).f19306a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19306a.hashCode();
    }

    public final String toString() {
        return this.f19306a.toString();
    }
}
