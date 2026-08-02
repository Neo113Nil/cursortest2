package com.vk.movika.sdk.base.logic.processor.actions;

import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.fpf0;
import xsna.rfc;

/* loaded from: classes3.dex */
public final class a {
    public static final String a(k kVar) {
        if (kVar instanceof com.vk.movika.sdk.base.model.f) {
            return ((com.vk.movika.sdk.base.model.f) kVar).a;
        }
        if (kVar instanceof com.vk.movika.sdk.base.model.g) {
            return ((com.vk.movika.sdk.base.model.g) kVar).b;
        }
        return null;
    }

    public static final boolean b(k kVar, rfc rfcVar) {
        List<com.vk.movika.sdk.base.model.j> b = kVar.b();
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            if (rfcVar.c(fpf0.a(((com.vk.movika.sdk.base.model.j) it.next()).b.getClass()))) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList c(com.vk.movika.sdk.base.logic.e eVar, s sVar) {
        List<String> list = eVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.vk.movika.sdk.base.model.f b = sVar.b((String) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public static final ArrayList d(com.vk.movika.sdk.base.logic.e eVar, s sVar) {
        ArrayList c = c(eVar, sVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (com.vk.movika.sdk.base.utils.d.c((com.vk.movika.sdk.base.model.f) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
