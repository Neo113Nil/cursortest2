package zc;

import android.content.res.Resources;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f25910a;

    /* renamed from: b, reason: collision with root package name */
    public static final Locale f25911b;

    /* renamed from: c, reason: collision with root package name */
    public static final Locale f25912c;

    /* renamed from: d, reason: collision with root package name */
    public static final Locale f25913d;

    /* renamed from: e, reason: collision with root package name */
    public static final Locale f25914e;

    /* renamed from: f, reason: collision with root package name */
    public static final Locale f25915f;

    static {
        Locale locale;
        Locale locale2;
        Locale locale3;
        Locale locale4;
        Locale locale5;
        Locale locale6;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            locale = Locale.of("en", "US");
            Intrinsics.checkNotNull(locale);
        } else {
            locale = new Locale("en", "US");
        }
        f25910a = locale;
        if (i5 >= 36) {
            locale2 = Locale.of("pt", "PT");
            Intrinsics.checkNotNull(locale2);
        } else {
            locale2 = new Locale("pt", "PT");
        }
        f25911b = locale2;
        if (i5 >= 36) {
            locale3 = Locale.of("fr", "FR");
            Intrinsics.checkNotNull(locale3);
        } else {
            locale3 = new Locale("fr", "FR");
        }
        f25912c = locale3;
        if (i5 >= 36) {
            locale4 = Locale.of("de", "DE");
            Intrinsics.checkNotNull(locale4);
        } else {
            locale4 = new Locale("de", "DE");
        }
        f25913d = locale4;
        if (i5 >= 36) {
            locale5 = Locale.of("es", "ES");
            Intrinsics.checkNotNull(locale5);
        } else {
            locale5 = new Locale("es", "ES");
        }
        f25914e = locale5;
        if (i5 >= 36) {
            locale6 = Locale.of("ru", "RU");
            Intrinsics.checkNotNull(locale6);
        } else {
            locale6 = new Locale("ru", "RU");
        }
        f25915f = locale6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (e(r2) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Locale a(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        if (!Intrinsics.areEqual(locale.getLanguage(), "ru")) {
            if (!Intrinsics.areEqual(locale.getLanguage(), "en")) {
                if (Intrinsics.areEqual(locale.getLanguage(), "pt")) {
                    return f25911b;
                }
                if (Intrinsics.areEqual(locale.getLanguage(), "es")) {
                    return f25914e;
                }
                if (Intrinsics.areEqual(locale.getLanguage(), "de")) {
                    return f25913d;
                }
                if (Intrinsics.areEqual(locale.getLanguage(), "fr")) {
                    return f25912c;
                }
                String language = locale.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            }
            return f25910a;
        }
        return f25915f;
    }

    public static final String b(String str) {
        if (str == null) {
            str = Locale.getDefault().getLanguage();
        }
        if (!Intrinsics.areEqual(str, "en")) {
            if (Intrinsics.areEqual(str, "pt")) {
                return "pt";
            }
            if (Intrinsics.areEqual(str, "fr")) {
                return "fr";
            }
            if (Intrinsics.areEqual(str, "es")) {
                return "es";
            }
            if (Intrinsics.areEqual(str, "de")) {
                return "de";
            }
            if (!Intrinsics.areEqual(str, "ru")) {
                Intrinsics.checkNotNull(str);
                if (e(str)) {
                }
            }
            return "ru";
        }
        return "en";
    }

    public static Locale c() {
        Locale locale = d().f19306a.get(0);
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        return locale2;
    }

    public static l0.g d() {
        l0.g u10 = ci.c.u(Resources.getSystem().getConfiguration());
        Intrinsics.checkNotNullExpressionValue(u10, "getLocales(...)");
        return u10;
    }

    public static boolean e(String str) {
        String str2;
        switch (str.hashCode()) {
            case 3139:
                return str.equals("be");
            case 3201:
                str2 = "de";
                break;
            case 3241:
                str2 = "en";
                break;
            case 3246:
                str2 = "es";
                break;
            case 3276:
                str2 = "fr";
                break;
            case 3424:
                return str.equals("kk");
            case 3438:
                return str.equals("ky");
            case 3588:
                str2 = "pt";
                break;
            case 3651:
                return str.equals("ru");
            case 3699:
                return str.equals("tg");
            case 3749:
                return str.equals("uz");
            default:
                return false;
        }
        str.equals(str2);
        return false;
    }
}
