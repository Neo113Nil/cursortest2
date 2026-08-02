package defpackage;

import com.sofascore.results.R;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class c7g {
    public static final Regex a = new Regex("^(?:Round )?(\\d+)$");

    public static r9k a(String str, String str2) {
        if (str == null) {
            return new m9k("");
        }
        Integer a2 = d7g.a(str, str2);
        if (a2 != null) {
            return new q9k(a2.intValue());
        }
        txb e = a.e(str);
        return e != null ? new q9k(R.string.round, l6g.K((String) ((sxb) e.a()).get(1))) : new m9k(str);
    }
}
