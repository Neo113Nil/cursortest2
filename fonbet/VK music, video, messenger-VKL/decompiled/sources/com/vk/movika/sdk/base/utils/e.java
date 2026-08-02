package com.vk.movika.sdk.base.utils;

import com.vk.movika.sdk.base.model.h;
import com.vk.movika.sdk.base.model.s;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e {
    public static final h a(String str, ArrayList arrayList) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((h) next).b.contains(str)) {
                obj = next;
                break;
            }
        }
        return (h) obj;
    }

    public static final h b(long j, ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h hVar = (h) obj;
            long j2 = hVar.c;
            Long l = hVar.d;
            if (j <= (l != null ? l.longValue() : Long.MAX_VALUE) && j2 <= j) {
                break;
            }
        }
        return (h) obj;
    }

    public static final ArrayList c(h hVar, s sVar) {
        ArrayList arrayList = hVar.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.vk.movika.sdk.base.model.f b = sVar.b((String) it.next());
            if (b != null) {
                arrayList2.add(b);
            }
        }
        return d.b(arrayList2);
    }
}
