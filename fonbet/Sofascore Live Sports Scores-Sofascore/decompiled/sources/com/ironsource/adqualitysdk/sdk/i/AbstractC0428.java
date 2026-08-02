package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ԇ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0428 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Set f1222;

    static {
        StringFog.decrypt("0z/N1ehkqq7tOdDl4w==\n", "slu8ioEKw9o=\n");
        StringFog.decrypt("Yy16p6zAi1plJXG6rMeBQnMi\n", "Fkwe1POz7ik=\n");
        StringFog.decrypt("jqI1aFLmrUyVoARuTuqGY4SqNWFJ5A==\n", "58VbByCD8jw=\n");
        f1222 = Collections.unmodifiableSet(new HashSet(Arrays.asList(StringFog.decrypt("P0N1pUnFuTwBRWiVQg==\n", "XicE+iCr0Eg=\n"), StringFog.decrypt("rzgI04aN+kmpMAPOhorwUb83\n", "2llsoNn+nzo=\n"))));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m261(AbstractMap abstractMap, String str) {
        if (abstractMap.containsKey(str)) {
            return false;
        }
        int size = abstractMap.size();
        Iterator it = f1222.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (abstractMap.containsKey((String) it.next())) {
                i++;
            }
        }
        return size >= i + 5;
    }
}
