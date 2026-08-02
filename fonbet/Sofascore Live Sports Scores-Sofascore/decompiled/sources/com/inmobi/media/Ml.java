package com.inmobi.media;

import defpackage.k13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ml {
    public final G a;

    public Ml(G g) {
        g.getClass();
        this.a = g;
    }

    public static void a(HashMap hashMap, List list, C3906y9 c3906y9) {
        hashMap.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.c(((Je) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((Je) it.next()).a;
            str.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                str = kotlin.text.c.r(str, (String) entry.getKey(), (String) entry.getValue(), false);
            }
            arrayList2.add(str);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            E3 e3 = E3.a;
            Rg rg = Rg.REGULAR;
            str2.getClass();
            rg.getClass();
            Ug.a(rg, new C3822v3(str2, c3906y9, null));
        }
    }
}
