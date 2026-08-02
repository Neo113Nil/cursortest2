package defpackage;

import android.graphics.Color;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ipl {
    public static final ipl a = new ipl();

    public static Integer a(Integer num, String str) {
        CharSequence charSequence;
        String concat;
        str.getClass();
        try {
            String obj = StringsKt.l0(str).toString();
            int i = 0;
            char[] cArr = {'#'};
            obj.getClass();
            int length = obj.length();
            while (true) {
                if (i >= length) {
                    charSequence = "";
                    break;
                }
                if (!ph0.u(cArr, obj.charAt(i))) {
                    charSequence = obj.subSequence(i, obj.length());
                    break;
                }
                i++;
            }
            String obj2 = charSequence.toString();
            int length2 = obj2.length();
            if (length2 == 6) {
                concat = "FF".concat(obj2);
            } else {
                if (length2 != 8) {
                    return num;
                }
                concat = iii.I(obj2) + iii.D(2, obj2);
            }
            return Integer.valueOf(Color.parseColor("#" + concat));
        } catch (IllegalArgumentException unused) {
            return num;
        }
    }

    public static /* synthetic */ Integer rgbaToColorInt$default(ipl iplVar, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        iplVar.getClass();
        return a(num, str);
    }
}
