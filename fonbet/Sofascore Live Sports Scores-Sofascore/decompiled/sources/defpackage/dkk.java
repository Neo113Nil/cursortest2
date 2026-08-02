package defpackage;

import com.ironsource.U3;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class dkk {
    public static final char[] a = {'*', '>'};

    static {
        Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    }

    public static String a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return str;
    }

    public static String b(String str, boolean z) {
        if (a(str) == null) {
            if (!z) {
                return null;
            }
            a70.p("Reply To cannot be null or empty.");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (charAt != a[i2]) {
                    }
                }
            }
            a70.p(lnb.o("Reply To must be in the printable ASCII range and cannot include '*' or '>' [", str, U3.j.e));
            return null;
        }
        return str;
    }
}
