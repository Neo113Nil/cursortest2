package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o62 {

    @NotNull
    public static final o62 a = new o62();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? n62.a.a(30) : 0;
        c = i >= 30 ? n62.a.a(31) : 0;
        d = i >= 30 ? n62.a.a(33) : 0;
        e = i >= 30 ? n62.a.a(1000000) : 0;
    }

    private o62() {
    }

    public static final boolean a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            upperCase.getClass();
            Integer num = Intrinsics.c(upperCase, "BAKLAVA") ? r1 : null;
            String upperCase2 = str.toUpperCase(locale);
            upperCase2.getClass();
            r1 = Intrinsics.c(upperCase2, "BAKLAVA") ? 0 : null;
            if (num == null || r1 == null) {
                if (num == null && r1 == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    upperCase3.getClass();
                    String upperCase4 = str.toUpperCase(locale);
                    upperCase4.getClass();
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

    @wx4
    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return a("UpsideDownCake", str);
    }
}
