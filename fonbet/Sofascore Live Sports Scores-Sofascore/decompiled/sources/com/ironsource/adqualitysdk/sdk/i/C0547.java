package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ণ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0547 extends AbstractC0475 {
    static {
        StringFog.decrypt("eACn\n", "FWHX1UOOeEE=\n");
        StringFog.decrypt("mGaCchEawg==\n", "/gnwN3B5qtQ=\n");
        StringFog.decrypt("GOjHnlM6\n", "foGr6jZIWik=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m353(C1102 c1102, ArrayList arrayList) {
        List list = (List) AbstractC0475.m295(arrayList, 0, List.class);
        C0499 c0499 = (C0499) AbstractC0475.m295(arrayList, 1, C0499.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            if (AbstractC0475.m294(arrayList, 2, C1102.class)) {
                c1102 = (C1102) AbstractC0475.m295(arrayList, 2, C1102.class);
                if (arrayList.size() > 3) {
                    arrayList2 = AbstractC0475.m296(arrayList, 3);
                }
            } else {
                arrayList2 = AbstractC0475.m296(arrayList, 2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList2.add(0, list.get(i));
            C0950 c0950 = c1102.f3465;
            c0499.getClass();
            arrayList3.add(c0499.m325(c0950, c0950.f3165, c1102, arrayList2).f3367);
            arrayList2.remove(0);
        }
        return arrayList3;
    }
}
