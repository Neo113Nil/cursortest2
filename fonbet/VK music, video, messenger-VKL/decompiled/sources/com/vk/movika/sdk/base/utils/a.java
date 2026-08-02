package com.vk.movika.sdk.base.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xsna.c5g;

/* loaded from: classes3.dex */
public final class a {
    public static final ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((com.vk.movika.sdk.base.model.d) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.vk.movika.sdk.base.model.d) it.next()).a);
        }
        return arrayList2;
    }
}
