package com.vk.movika.sdk.base.logic.processor.actions.setbranch;

import com.vk.movika.sdk.base.logic.processor.actions.setbranch.b;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.s;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends b<e.d> {
    @Override // com.vk.movika.sdk.base.logic.processor.actions.setbranch.b
    public final b.a c(com.vk.movika.sdk.base.logic.e eVar, e.d dVar, s sVar) {
        Object next;
        e.d dVar2 = dVar;
        Chapter a = sVar.a(eVar.b);
        if (a != null) {
            Iterator it = a.e.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    double d = ((com.vk.movika.sdk.base.model.a) next).d;
                    do {
                        Object next2 = it.next();
                        double d2 = ((com.vk.movika.sdk.base.model.a) next2).d;
                        if (Double.compare(d, d2) > 0) {
                            next = next2;
                            d = d2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            com.vk.movika.sdk.base.model.a aVar = (com.vk.movika.sdk.base.model.a) next;
            if (aVar != null) {
                return new b.a(aVar, dVar2.a);
            }
        }
        return null;
    }
}
