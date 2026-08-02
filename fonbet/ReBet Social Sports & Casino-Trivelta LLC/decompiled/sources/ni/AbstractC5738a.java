package ni;

import java.util.Locale;
import oi.y;

/* renamed from: ni.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5738a {
    public static String a(String str, y yVar, Locale locale) {
        net.time4j.format.e b10 = net.time4j.format.e.b(yVar.a());
        if (str.equals("iso8601")) {
            return net.time4j.format.b.r(b10, locale);
        }
        String str2 = "F(" + Character.toLowerCase(b10.name().charAt(0)) + ')';
        net.time4j.i18n.e i10 = C5739b.i(str, locale);
        if (!i10.b(str2)) {
            i10 = C5739b.i("generic", locale);
        }
        return i10.f(str2);
    }
}
