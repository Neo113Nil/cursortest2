package l0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f19294a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19295b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19296c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19297d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19298e;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f19295b = i5 >= 30 ? a.f19293a.a(30) : 0;
        f19296c = i5 >= 30 ? a.f19293a.a(31) : 0;
        f19297d = i5 >= 30 ? a.f19293a.a(33) : 0;
        f19298e = i5 >= 30 ? a.f19293a.a(1000000) : 0;
    }

    private b() {
    }

    public static final boolean a(@NotNull String codename, @NotNull String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (!Intrinsics.areEqual("REL", buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num = Intrinsics.areEqual(upperCase, "BAKLAVA") ? r1 : null;
            String upperCase2 = codename.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            r1 = Intrinsics.areEqual(upperCase2, "BAKLAVA") ? 0 : null;
            if (num == null || r1 == null) {
                if (num == null && r1 == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    String upperCase4 = codename.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= r1.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return true;
        }
        if (i5 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("Tiramisu", CODENAME);
    }
}
