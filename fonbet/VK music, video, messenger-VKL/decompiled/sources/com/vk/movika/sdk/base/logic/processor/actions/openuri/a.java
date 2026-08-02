package com.vk.movika.sdk.base.logic.processor.actions.openuri;

import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.f;
import com.vk.movika.sdk.base.model.h;
import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.izi0;
import xsna.izs;
import xsna.j5g;
import xsna.rl3;

/* loaded from: classes3.dex */
public final class a extends j<com.vk.movika.sdk.base.model.actions.d> {

    /* renamed from: com.vk.movika.sdk.base.logic.processor.actions.openuri.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1302a extends FunctionReferenceImpl implements izs<f, com.vk.movika.sdk.base.model.d> {
        public static final C1302a b = new C1302a();

        public C1302a() {
            super(1, com.vk.movika.sdk.base.model.d.class, "<init>", "<init>(Lcom/vk/movika/sdk/base/model/Container;)V", 0);
        }

        @Override // xsna.izs
        public final com.vk.movika.sdk.base.model.d invoke(f fVar) {
            return new com.vk.movika.sdk.base.model.d(fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.vk.movika.sdk.base.logic.processor.e[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Set<com.vk.movika.sdk.base.model.d>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.base.logic.processor.actions.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<e> b(j.a<com.vk.movika.sdk.base.model.actions.d> aVar) {
        h hVar;
        ArrayList arrayList;
        List<f> list;
        ArrayList arrayList2;
        boolean z;
        Set S0;
        com.vk.movika.sdk.base.model.actions.d dVar;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z2;
        Object valueOf;
        f b2;
        List list2;
        Iterator it;
        ?? r1 = aVar.g;
        com.vk.movika.sdk.base.model.actions.a aVar2 = aVar.b;
        k kVar = aVar.c;
        s sVar = aVar.d;
        com.vk.movika.sdk.base.logic.e eVar = aVar.a;
        f fVar = (f) aVar.i.getValue();
        Chapter chapter = (Chapter) aVar.h.getValue();
        if (chapter != null) {
            hVar = com.vk.movika.sdk.base.utils.e.a(fVar != null ? fVar.a : null, chapter.c);
        } else {
            hVar = null;
        }
        if (fVar != null) {
            list = hVar != null ? com.vk.movika.sdk.base.utils.e.c(hVar, sVar) : EmptyList.b;
            if (com.vk.movika.sdk.base.logic.processor.actions.a.b(kVar, fpf0.a(com.vk.movika.sdk.base.model.actions.c.class))) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    f fVar2 = (f) obj4;
                    if (com.vk.movika.sdk.base.utils.d.a(fVar2, fpf0.a(com.vk.movika.sdk.base.model.actions.d.class)) && !com.vk.movika.sdk.base.utils.d.a(fVar2, fpf0.a(com.vk.movika.sdk.base.model.actions.e.class)) && !com.vk.movika.sdk.base.utils.d.a(fVar2, fpf0.a(com.vk.movika.sdk.base.model.actions.c.class))) {
                        arrayList3.add(obj4);
                    }
                }
                list = arrayList3;
            } else if (d.b(list)) {
                if (!list.isEmpty()) {
                    loop11: for (f fVar3 : list) {
                        if (com.vk.movika.sdk.base.utils.d.a(fVar3, fpf0.a(com.vk.movika.sdk.base.model.actions.c.class))) {
                            int i = 0;
                            for (Object obj5 : eVar.e) {
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                arrayList = null;
                                if (epx.f(fVar3.a, ((com.vk.movika.sdk.base.model.d) obj5).a)) {
                                    if (i < 0) {
                                        list = EmptyList.b;
                                        break;
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
            arrayList = null;
            if (fVar != null) {
                list = j5g.v0(fVar, list);
            }
            Set a = com.vk.movika.sdk.utils.b.a(list, C1302a.b);
            if (hVar == null) {
                Set<com.vk.movika.sdk.base.model.d> set = eVar.e;
                arrayList2 = new ArrayList();
                for (Object obj6 : set) {
                    if (hVar.b.contains(((com.vk.movika.sdk.base.model.d) obj6).a)) {
                        arrayList2.add(obj6);
                    }
                }
            } else {
                arrayList2 = arrayList;
            }
            ?? r10 = eVar.e;
            z = eVar.i;
            if (arrayList2 == null) {
                arrayList2 = r10;
            }
            ArrayList u0 = j5g.u0(a, arrayList2);
            Set a2 = com.vk.movika.sdk.utils.b.a(u0, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.openuri.a.b
                @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
                public final Object get(Object obj7) {
                    return ((com.vk.movika.sdk.base.model.d) obj7).a;
                }
            });
            S0 = j5g.S0(eVar.c);
            dVar = (com.vk.movika.sdk.base.model.actions.d) aVar2;
            if (epx.f(dVar.b, Boolean.TRUE)) {
                if ((fVar != null ? fVar.a : arrayList) != null) {
                    S0 = izi0.f(S0, fVar.a);
                }
            }
            if (z && com.vk.movika.sdk.base.logic.processor.actions.a.b(kVar, fpf0.a(com.vk.movika.sdk.base.model.actions.c.class)) && d.b(com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar, sVar))) {
                list2 = (List) r1.getValue();
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (!a2.contains(((f) it.next()).a)) {
                            break;
                        }
                    }
                }
                S0 = EmptySet.b;
            }
            e.i iVar = new e.i(S0);
            e.b bVar = new e.b(a);
            obj = z ? arrayList : e.g.a;
            if (obj == null) {
                String a3 = com.vk.movika.sdk.base.logic.processor.actions.a.a(kVar);
                if (a3 == null || (b2 = sVar.b(a3)) == null) {
                    obj2 = e.g.a;
                    e.d dVar2 = new e.d(dVar.a);
                    if (hVar != null) {
                        if (!u0.isEmpty() && !hVar.b.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it2 = u0.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (((com.vk.movika.sdk.base.model.d) next).b) {
                                    arrayList6.add(next);
                                }
                            }
                            Set a4 = com.vk.movika.sdk.utils.b.a(arrayList6, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.openuri.c
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
                                public final Object get(Object obj7) {
                                    return ((com.vk.movika.sdk.base.model.d) obj7).a;
                                }
                            });
                            Iterator it3 = com.vk.movika.sdk.base.utils.e.c(hVar, sVar).iterator();
                            while (it3.hasNext()) {
                                f fVar4 = (f) it3.next();
                                if (d.a(fVar4)) {
                                    arrayList4.add(fVar4);
                                } else {
                                    arrayList5.add(fVar4);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                Iterator it4 = arrayList5.iterator();
                                while (it4.hasNext()) {
                                    if (!a4.contains(((f) it4.next()).a)) {
                                        break;
                                    }
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                Iterator it5 = arrayList4.iterator();
                                while (it5.hasNext()) {
                                    if (com.vk.movika.sdk.base.utils.d.a((f) it5.next(), fpf0.a(com.vk.movika.sdk.base.model.actions.c.class))) {
                                        if (!arrayList4.isEmpty()) {
                                            Iterator it6 = arrayList4.iterator();
                                            while (it6.hasNext()) {
                                                if (!a4.contains(((f) it6.next()).a)) {
                                                }
                                            }
                                        }
                                        z2 = true;
                                        valueOf = Boolean.valueOf(z2);
                                        if (!z2) {
                                            valueOf = arrayList;
                                        }
                                        if (valueOf != null) {
                                            obj3 = new e.c(Collections.singleton(hVar.a));
                                            return rl3.I(new e[]{iVar, bVar, obj2, dVar2, obj3});
                                        }
                                    }
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (it7.hasNext()) {
                                    if (a4.contains(((f) it7.next()).a)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        valueOf = Boolean.valueOf(z2);
                        if (!z2) {
                        }
                        if (valueOf != null) {
                        }
                    }
                    obj3 = arrayList;
                    return rl3.I(new e[]{iVar, bVar, obj2, dVar2, obj3});
                }
                ArrayList s0 = j5g.s0((List) r1.getValue(), b2);
                ArrayList arrayList7 = new ArrayList(c5g.u(a, 10));
                Iterator it8 = a.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(((com.vk.movika.sdk.base.model.d) it8.next()).a);
                }
                if (!s0.isEmpty() && !s0.isEmpty()) {
                    Iterator it9 = s0.iterator();
                    while (it9.hasNext()) {
                        f fVar5 = (f) it9.next();
                        if (!d.a(fVar5) || !arrayList7.contains(fVar5.a)) {
                            obj = arrayList;
                            break;
                        }
                    }
                }
                obj = e.g.a;
            }
            obj2 = obj;
            e.d dVar22 = new e.d(dVar.a);
            if (hVar != null) {
            }
            obj3 = arrayList;
            return rl3.I(new e[]{iVar, bVar, obj2, dVar22, obj3});
        }
        arrayList = null;
        list = EmptyList.b;
        if (fVar != null) {
        }
        Set a5 = com.vk.movika.sdk.utils.b.a(list, C1302a.b);
        if (hVar == null) {
        }
        ?? r102 = eVar.e;
        z = eVar.i;
        if (arrayList2 == null) {
        }
        ArrayList u02 = j5g.u0(a5, arrayList2);
        Set a22 = com.vk.movika.sdk.utils.b.a(u02, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.openuri.a.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj7) {
                return ((com.vk.movika.sdk.base.model.d) obj7).a;
            }
        });
        S0 = j5g.S0(eVar.c);
        dVar = (com.vk.movika.sdk.base.model.actions.d) aVar2;
        if (epx.f(dVar.b, Boolean.TRUE)) {
        }
        if (z) {
            list2 = (List) r1.getValue();
            if (list2 instanceof Collection) {
            }
            it = list2.iterator();
            while (it.hasNext()) {
            }
            S0 = EmptySet.b;
        }
        e.i iVar2 = new e.i(S0);
        e.b bVar2 = new e.b(a5);
        if (z) {
        }
        if (obj == null) {
        }
        obj2 = obj;
        e.d dVar222 = new e.d(dVar.a);
        if (hVar != null) {
        }
        obj3 = arrayList;
        return rl3.I(new e[]{iVar2, bVar2, obj2, dVar222, obj3});
    }
}
