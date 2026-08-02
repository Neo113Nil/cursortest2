package com.vk.movika.sdk.base.utils;

import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.hfr;
import xsna.i5g;
import xsna.izs;
import xsna.rfc;
import xsna.rli0;

/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(com.vk.movika.sdk.base.model.f fVar, rfc rfcVar) {
        com.vk.movika.sdk.base.model.actions.a aVar = fVar.h;
        if (aVar != null && rfcVar.c(aVar)) {
            return true;
        }
        List<j> b = fVar.b();
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            if (rfcVar.c(((j) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c((com.vk.movika.sdk.base.model.f) next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final boolean c(com.vk.movika.sdk.base.model.f fVar) {
        boolean z;
        ArrayList arrayList = fVar.g;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.vk.movika.sdk.base.model.g gVar = (com.vk.movika.sdk.base.model.g) it.next();
                if (!epx.f(gVar.c, "Text") || !gVar.f.isEmpty()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return !z;
    }

    public static com.vk.movika.sdk.base.model.f d(Chapter chapter, final long j) {
        Object next;
        hfr.a aVar = new hfr.a(rli0.j(rli0.j(new i5g(chapter.d), new b(0)), new izs() { // from class: com.vk.movika.sdk.base.utils.c
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) obj;
                return Boolean.valueOf(fVar.c > j && d.c(fVar));
            }
        }));
        if (aVar.hasNext()) {
            next = aVar.next();
            if (aVar.hasNext()) {
                long j2 = ((com.vk.movika.sdk.base.model.f) next).c;
                do {
                    Object next2 = aVar.next();
                    long j3 = ((com.vk.movika.sdk.base.model.f) next2).c;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (aVar.hasNext());
            }
        } else {
            next = null;
        }
        return (com.vk.movika.sdk.base.model.f) next;
    }
}
