package com.vk.movika.sdk.base.logic.interactor;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.movika.sdk.base.logic.dto.a;
import com.vk.movika.sdk.base.logic.dto.d;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.random.XorWowRandom;
import xsna.epx;
import xsna.g5z;
import xsna.hli0;
import xsna.i5g;
import xsna.izi0;
import xsna.j5g;
import xsna.jw5;
import xsna.rli0;
import xsna.vki0;
import xsna.y57;

/* loaded from: classes3.dex */
public final class k {
    public static final a Companion = new a();
    public final com.vk.ecomm.catalog.impl.geo.a a;
    public final com.vk.movika.sdk.base.logic.processor.i b;
    public final XorWowRandom c;
    public final r d;
    public final boolean e;

    public static final class a {
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            com.vk.movika.sdk.base.model.j b = com.vk.movika.sdk.base.model.m.b((com.vk.movika.sdk.base.model.f) t2);
            Boolean valueOf = Boolean.valueOf((b != null ? b.b : null) instanceof com.vk.movika.sdk.base.model.actions.c);
            com.vk.movika.sdk.base.model.j b2 = com.vk.movika.sdk.base.model.m.b((com.vk.movika.sdk.base.model.f) t);
            return jw5.b(valueOf, Boolean.valueOf((b2 != null ? b2.b : null) instanceof com.vk.movika.sdk.base.model.actions.c));
        }
    }

    public k(com.vk.ecomm.catalog.impl.geo.a aVar, com.vk.movika.sdk.base.logic.processor.i iVar, com.vk.movika.sdk.base.logic.c cVar, XorWowRandom xorWowRandom, r rVar, boolean z) {
        this.a = aVar;
        this.b = iVar;
        this.c = xorWowRandom;
        this.d = rVar;
        this.e = z;
    }

    public static com.vk.movika.sdk.base.logic.e d(String str, com.vk.movika.sdk.base.logic.e eVar) {
        EmptyList emptyList = EmptyList.b;
        EmptySet emptySet = EmptySet.b;
        if (str == null) {
            str = eVar.b;
        }
        return com.vk.movika.sdk.base.logic.e.a(eVar, null, str, emptyList, emptySet, emptySet, emptySet, null, 0L, false, null, false, 1537);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d.a.f a(com.vk.movika.sdk.base.logic.e eVar, a.AbstractC1294a.c cVar, com.vk.movika.sdk.base.model.s sVar, boolean z) {
        List<com.vk.movika.sdk.base.model.f> list;
        List singletonList;
        String str;
        d.a.f fVar;
        k kVar = this;
        com.vk.movika.sdk.base.model.s sVar2 = sVar;
        Chapter a2 = sVar2.a(eVar.b);
        if (a2 != null) {
            String str2 = a2.a;
            com.vk.movika.sdk.base.model.f fVar2 = cVar.b;
            com.vk.movika.sdk.utils.c.b(kVar, "GameLogic2", new c(0, fVar2, a2));
            if (epx.f(fVar2.b, str2)) {
                int i = 0;
                vki0 b2 = g5z.b(new hli0(rli0.j(rli0.j(rli0.t(new i5g(eVar.c), new d(sVar2, i)), new e(fVar2, i)), new f(0)), kVar.c, null));
                if (b2.hasNext()) {
                    Object next = b2.next();
                    if (b2.hasNext()) {
                        ArrayList b3 = y57.b(next);
                        while (b2.hasNext()) {
                            b3.add(b2.next());
                        }
                        list = b3;
                        for (com.vk.movika.sdk.base.model.f fVar3 : j5g.D0(new b(), list)) {
                            com.vk.movika.sdk.base.model.j b4 = com.vk.movika.sdk.base.model.m.b(fVar3);
                            if (b4 != null) {
                                d.a.f b5 = kVar.b(eVar, b4.b, fVar3, sVar2, true);
                                if (com.vk.movika.sdk.base.logic.dto.b.a(b5)) {
                                    return b5;
                                }
                            }
                            kVar = this;
                            sVar2 = sVar;
                        }
                        if (!z && !list.isEmpty()) {
                            com.vk.movika.sdk.base.model.h a3 = com.vk.movika.sdk.base.utils.e.a(((com.vk.movika.sdk.base.model.f) j5g.Y(list)).a, a2.c);
                            Set set = eVar.f;
                            str = a3 == null ? a3.a : null;
                            if (str != null) {
                                set = izi0.k(set, str);
                            }
                            com.vk.movika.sdk.base.logic.e a4 = com.vk.movika.sdk.base.logic.e.a(eVar, null, null, null, null, null, set, null, 0L, false, null, false, 2015);
                            EmptyList emptyList = EmptyList.b;
                            d.a.f fVar4 = new d.a.f(a4, emptyList, emptyList, true);
                            for (com.vk.movika.sdk.base.model.f fVar5 : list) {
                                com.vk.movika.sdk.base.model.j b6 = com.vk.movika.sdk.base.model.m.b(fVar5);
                                if (b6 != null) {
                                    d.a.f b7 = b(fVar4.a, b6.b, fVar5, sVar, true);
                                    fVar = new d.a.f(b7.b, b7.c, j5g.u0(fVar4.d, b7.d), b7.e);
                                } else {
                                    fVar = null;
                                }
                                if (fVar != null) {
                                    fVar4 = fVar;
                                }
                            }
                            return fVar4;
                        }
                    } else {
                        singletonList = Collections.singletonList(next);
                    }
                } else {
                    singletonList = EmptyList.b;
                }
                list = singletonList;
                while (r7.hasNext()) {
                }
                if (!z) {
                    com.vk.movika.sdk.base.model.h a32 = com.vk.movika.sdk.base.utils.e.a(((com.vk.movika.sdk.base.model.f) j5g.Y(list)).a, a2.c);
                    Set set2 = eVar.f;
                    if (a32 == null) {
                    }
                    if (str != null) {
                    }
                    com.vk.movika.sdk.base.logic.e a42 = com.vk.movika.sdk.base.logic.e.a(eVar, null, null, null, null, null, set2, null, 0L, false, null, false, 2015);
                    EmptyList emptyList2 = EmptyList.b;
                    d.a.f fVar42 = new d.a.f(a42, emptyList2, emptyList2, true);
                    while (r6.hasNext()) {
                    }
                    return fVar42;
                }
            } else if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                com.vk.movika.sdk.utils.c.a(kVar, "GameLogic2");
                return null;
            }
        } else if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
            com.vk.movika.sdk.utils.c.a(kVar, "GameLogic2");
            return null;
        }
        return null;
    }

    public final d.a.f b(com.vk.movika.sdk.base.logic.e eVar, com.vk.movika.sdk.base.model.actions.a aVar, com.vk.movika.sdk.base.model.k kVar, com.vk.movika.sdk.base.model.s sVar, boolean z) {
        List R;
        boolean z2;
        int i;
        String str;
        String str2;
        Set set;
        Set set2;
        Set set3;
        String str3;
        long j;
        boolean z3;
        List t0;
        boolean z4;
        int i2;
        String str4;
        String str5;
        List<com.vk.movika.sdk.base.logic.processor.e> a2 = this.b.a(eVar, aVar, kVar, sVar, z);
        com.vk.movika.sdk.base.logic.e eVar2 = eVar;
        for (com.vk.movika.sdk.base.logic.processor.e eVar3 : a2) {
            List<String> list = eVar2.c;
            if (eVar3 instanceof e.a) {
                R = j5g.R(j5g.u0(null, list));
                z2 = false;
                i = 2043;
                str = null;
                str2 = null;
                set = null;
                set2 = null;
                set3 = null;
                str3 = null;
                j = 0;
                z3 = false;
            } else if (eVar3 instanceof e.d) {
                continue;
            } else if (eVar3.equals(e.C1304e.a)) {
                z2 = false;
                i = 1791;
                str = null;
                str2 = null;
                R = null;
                set = null;
                set2 = null;
                set3 = null;
                str3 = null;
                j = 0;
                z3 = true;
            } else {
                if (eVar3 instanceof e.f) {
                    t0 = j5g.t0(list, ((e.f) eVar3).a);
                    z4 = false;
                    i2 = 2043;
                    str4 = null;
                    str5 = null;
                } else if (eVar3.equals(e.g.a)) {
                    z4 = false;
                    i2 = 1791;
                    str4 = null;
                    str5 = null;
                    t0 = null;
                } else if (eVar3 instanceof e.h) {
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, null, null, null, null, ((e.h) eVar3).a.c, 0L, false, null, false, 1983);
                } else if (eVar3 instanceof e.i) {
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, j5g.O0(((e.i) eVar3).a), null, null, null, null, 0L, false, null, false, 2043);
                } else if (eVar3 instanceof e.j) {
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, null, izi0.j(eVar2.d, ((e.j) eVar3).a), null, null, null, 0L, false, null, false, 2039);
                } else if (eVar3 instanceof e.k) {
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, null, null, null, null, null, 0L, false, ((e.k) eVar3).a, false, 1535);
                } else if (eVar3 instanceof e.b) {
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, null, null, izi0.j(eVar2.e, ((e.b) eVar3).a), null, null, 0L, false, null, false, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                } else {
                    if (!(eVar3 instanceof e.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, null, null, null, null, null, izi0.j(eVar2.f, ((e.c) eVar3).a), null, 0L, false, null, false, 2015);
                }
                eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, str4, str5, t0, null, null, null, null, 0L, false, null, z4, i2);
            }
            eVar2 = com.vk.movika.sdk.base.logic.e.a(eVar2, str, str2, R, set, set2, set3, str3, j, z3, null, z2, i);
        }
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(eVar, "GameLogic2");
            a2.toString();
            Objects.toString(eVar2);
        }
        return new d.a.f(eVar2, a2, Collections.singletonList(kVar), z);
    }

    public final String c(com.vk.movika.sdk.base.model.s sVar, com.vk.movika.sdk.base.logic.e eVar, Chapter chapter) {
        com.vk.movika.sdk.base.model.j a2;
        com.vk.movika.sdk.base.model.a aVar;
        Object obj;
        Object next;
        boolean isEmpty = com.vk.movika.sdk.base.utils.d.b(chapter.d).isEmpty();
        boolean z = com.vk.movika.sdk.base.model.m.a(chapter) == null;
        if (isEmpty && z) {
            ArrayList arrayList = chapter.e;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.vk.movika.sdk.base.model.a) obj).f) {
                    break;
                }
            }
            com.vk.movika.sdk.base.model.a aVar2 = (com.vk.movika.sdk.base.model.a) obj;
            if (aVar2 == null) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        double d = ((com.vk.movika.sdk.base.model.a) next).d;
                        do {
                            Object next2 = it2.next();
                            double d2 = ((com.vk.movika.sdk.base.model.a) next2).d;
                            if (Double.compare(d, d2) < 0) {
                                next = next2;
                                d = d2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                aVar2 = (com.vk.movika.sdk.base.model.a) next;
                if (aVar2 == null) {
                    aVar2 = (com.vk.movika.sdk.base.model.a) j5g.a0(arrayList);
                }
            }
            if (aVar2 != null) {
                return aVar2.c;
            }
        } else if (this.e && isEmpty && (a2 = com.vk.movika.sdk.base.model.m.a(chapter)) != null) {
            List<com.vk.movika.sdk.base.logic.processor.e> a3 = this.b.a(eVar, a2.b, chapter, sVar, true);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : a3) {
                if (obj2 instanceof e.h) {
                    arrayList2.add(obj2);
                }
            }
            e.h hVar = (e.h) j5g.a0(arrayList2);
            if (hVar != null && (aVar = hVar.a) != null) {
                return aVar.c;
            }
        }
        return null;
    }
}
