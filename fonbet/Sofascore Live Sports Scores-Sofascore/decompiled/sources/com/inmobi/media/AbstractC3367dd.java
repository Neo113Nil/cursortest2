package com.inmobi.media;

import defpackage.k13;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3367dd {
    public static final List a(C3392ed c3392ed) {
        ArrayList arrayList;
        c3392ed.getClass();
        Kl kl = c3392ed.a;
        if (kl != null) {
            ArrayList arrayList2 = kl.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((Je) next).b, "click")) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList(k13.r(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Je) it2.next()).a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? km5.a : arrayList;
    }
}
