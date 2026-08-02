package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class sub extends rub {
    public static int c(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map d(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.a, pair.b);
        singletonMap.getClass();
        return singletonMap;
    }
}
