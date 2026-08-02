package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gg2 {
    public final Locale a;
    public final SimpleDateFormat b;

    public gg2(String str) {
        Locale d = dla.d();
        this.a = d;
        this.b = new SimpleDateFormat(str, d);
    }

    public final String a(fg2 fg2Var) {
        fg2Var.getClass();
        Date time = fg2Var.c().getTime();
        time.getClass();
        String format = this.b.format(time);
        format.getClass();
        if (format.length() <= 0) {
            return format;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = format.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.c(charAt, this.a) : String.valueOf(charAt)));
        sb.append(format.substring(1));
        return sb.toString();
    }
}
