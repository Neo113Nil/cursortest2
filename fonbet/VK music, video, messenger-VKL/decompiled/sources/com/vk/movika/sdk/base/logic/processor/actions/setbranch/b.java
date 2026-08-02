package com.vk.movika.sdk.base.logic.processor.actions.setbranch;

import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.actions.a;
import com.vk.movika.sdk.base.model.g;
import com.vk.movika.sdk.base.model.h;
import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.o;
import com.vk.movika.sdk.base.model.q;
import com.vk.movika.sdk.base.model.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.rfc;
import xsna.rl3;
import xsna.s3q0;

/* loaded from: classes3.dex */
public abstract class b<T extends com.vk.movika.sdk.base.model.actions.a> extends j<T> {
    public final com.vk.ecomm.catalog.impl.geo.a b;
    public final com.vk.movika.sdk.base.logic.interactor.a c;
    public final boolean d;

    public final class a {
        public final com.vk.movika.sdk.base.model.a a;
        public final boolean b;

        public a(com.vk.movika.sdk.base.model.a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
        }
    }

    public b(rfc rfcVar, com.vk.ecomm.catalog.impl.geo.a aVar, com.vk.movika.sdk.base.logic.interactor.a aVar2, boolean z) {
        super(rfcVar);
        this.b = aVar;
        this.c = aVar2;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.vk.movika.sdk.base.logic.processor.actions.setbranch.b, com.vk.movika.sdk.base.logic.processor.actions.setbranch.b<T extends com.vk.movika.sdk.base.model.actions.a>] */
    /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Set] */
    @Override // com.vk.movika.sdk.base.logic.processor.actions.j
    public final List<com.vk.movika.sdk.base.logic.processor.e> b(j.a<T> aVar) {
        ?? r11;
        ?? hashSet;
        Collection<com.vk.movika.sdk.base.model.f> collection;
        Set set;
        ?? hashSet2;
        Set a2;
        s sVar = aVar.d;
        com.vk.movika.sdk.base.logic.e eVar = aVar.a;
        Chapter a3 = sVar.a(eVar.b);
        if (!this.d && a3 == null) {
            return EmptyList.b;
        }
        a c = c(eVar, aVar.b, sVar);
        char c2 = 2;
        if (c == null) {
            if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                com.vk.movika.sdk.utils.c.a(aVar, null);
            }
            return EmptyList.b;
        }
        com.vk.movika.sdk.base.model.a aVar2 = c.a;
        boolean z = c.b;
        q qVar = new q(aVar2.a, null, null, null, aVar.e, z);
        k kVar = aVar.c;
        if (kVar instanceof Chapter) {
            qVar = q.a(qVar, null, null, ((Chapter) kVar).a, 31);
        } else if (kVar instanceof com.vk.movika.sdk.base.model.f) {
            qVar = q.a(qVar, null, ((com.vk.movika.sdk.base.model.f) kVar).a, null, 47);
        } else if (kVar instanceof g) {
            qVar = q.a(qVar, ((g) kVar).a, null, null, 55);
        }
        com.vk.movika.sdk.base.logic.interactor.a aVar3 = this.c;
        if (a3 != null) {
            aVar3.getClass();
            ArrayList b = com.vk.movika.sdk.base.utils.d.b(a3.d);
            r11 = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!com.vk.movika.sdk.base.utils.d.a((com.vk.movika.sdk.base.model.f) next, fpf0.a(com.vk.movika.sdk.base.model.actions.d.class))) {
                    r11.add(next);
                }
            }
        } else {
            r11 = EmptyList.b;
        }
        if (r11.isEmpty()) {
            hashSet = EmptySet.b;
        } else {
            hashSet = new HashSet(r11.size());
            Iterator it2 = r11.iterator();
            while (it2.hasNext()) {
                hashSet.add(((com.vk.movika.sdk.base.model.f) it2.next()).a);
            }
        }
        if (a3 != null) {
            aVar3.getClass();
            collection = com.vk.movika.sdk.base.utils.d.b(a3.d);
        } else {
            collection = EmptyList.b;
        }
        if (collection.isEmpty()) {
            set = EmptySet.b;
        } else {
            HashSet hashSet3 = new HashSet(collection.size());
            for (com.vk.movika.sdk.base.model.f fVar : collection) {
                hashSet3.add(new com.vk.movika.sdk.base.model.d(fVar.a, com.vk.movika.sdk.base.utils.d.c(fVar)));
                c2 = c2;
            }
            set = hashSet3;
        }
        char c3 = c2;
        ArrayList c4 = com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar, sVar);
        aVar3.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it3 = c4.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            com.vk.movika.sdk.base.model.f fVar2 = (com.vk.movika.sdk.base.model.f) next2;
            if (com.vk.movika.sdk.base.utils.d.c(fVar2) && com.vk.movika.sdk.base.utils.d.a(fVar2, fpf0.a(com.vk.movika.sdk.base.model.actions.d.class))) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            hashSet2 = EmptySet.b;
        } else {
            hashSet2 = new HashSet(arrayList.size());
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                hashSet2.add(((com.vk.movika.sdk.base.model.f) it4.next()).a);
            }
        }
        o oVar = eVar.j;
        int i = 0;
        if (oVar == null) {
            oVar = null;
        } else {
            String str = qVar.a;
            if (str != null) {
                oVar = this.b.a(oVar, new com.vk.movika.sdk.base.logic.processor.d(i, (Object) str, (Object) qVar));
            }
            s3q0 s3q0Var = s3q0.a;
        }
        e.i iVar = new e.i(hashSet2);
        e.j jVar = new e.j(hashSet);
        e.b bVar = new e.b(set);
        e.c cVar = (a3 == null || (a2 = com.vk.movika.sdk.utils.b.a(a3.c, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.setbranch.b.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj) {
                return ((h) obj).a;
            }
        })) == null) ? null : new e.c(a2);
        e.k kVar2 = oVar != null ? new e.k(oVar) : null;
        e.g gVar = eVar.i ? e.g.a : null;
        e.h hVar = new e.h(aVar2, z);
        com.vk.movika.sdk.base.logic.processor.e[] eVarArr = new com.vk.movika.sdk.base.logic.processor.e[7];
        eVarArr[0] = iVar;
        eVarArr[1] = jVar;
        eVarArr[c3] = bVar;
        eVarArr[3] = cVar;
        eVarArr[4] = kVar2;
        eVarArr[5] = gVar;
        eVarArr[6] = hVar;
        return rl3.I(eVarArr);
    }

    public abstract b<T>.a c(com.vk.movika.sdk.base.logic.e eVar, T t, s sVar);
}
