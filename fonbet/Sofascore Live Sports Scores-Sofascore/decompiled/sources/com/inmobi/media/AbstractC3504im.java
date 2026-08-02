package com.inmobi.media;

import defpackage.k13;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.im, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3504im {
    public static final int a(String str) {
        List split$default;
        str.getClass();
        try {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{":", "."}, false, 4, 2, null);
            int parseInt = Integer.parseInt((String) split$default.get(0));
            int parseInt2 = Integer.parseInt((String) split$default.get(1));
            return (((parseInt2 * 60) + (parseInt * 3600) + Integer.parseInt((String) split$default.get(2))) * 1000) + (split$default.size() == 4 ? Integer.parseInt((String) split$default.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String str, ArrayList arrayList) {
        str.getClass();
        if (arrayList == null) {
            return km5.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.c(((Je) obj).b, str)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Je) it.next()).a);
        }
        return arrayList3;
    }
}
