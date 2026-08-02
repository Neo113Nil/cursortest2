package com.vk.movika.sdk.base.presenter;

import com.vk.movika.sdk.base.logic.dto.a;
import com.vk.movika.sdk.base.logic.dto.d;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.logic.interactor.k;
import com.vk.movika.sdk.base.logic.interactor.o;
import com.vk.movika.sdk.base.logic.interactor.s;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.f;
import com.vk.movika.sdk.base.model.i;
import com.vk.movika.sdk.base.model.l;
import com.vk.movika.sdk.base.model.m;
import com.vk.movika.sdk.base.model.u;
import com.vk.movika.sdk.base.ui.l0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c5g;
import xsna.epx;
import xsna.izi0;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class d {
    public static final a Companion = new a();
    public final s a;
    public final o b;
    public com.vk.movika.sdk.base.logic.e c = new com.vk.movika.sdk.base.logic.e(null, null, null, null, null, 0, null, false, 2047);
    public l0 d = new l0(null, null, null, false, null, 0, null, 16383);

    public static final class a {
    }

    public final class b {
        public final com.vk.movika.sdk.base.logic.e a;
        public final List<com.vk.movika.sdk.base.logic.dto.d> b;

        public b(com.vk.movika.sdk.base.logic.e eVar, List list) {
            this.a = eVar;
            this.b = list;
        }
    }

    public static final class c {
        public final com.vk.movika.sdk.base.model.s a;
        public final com.vk.movika.sdk.base.logic.dto.c b;

        public c() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            com.vk.movika.sdk.base.model.s sVar = this.a;
            int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
            com.vk.movika.sdk.base.logic.dto.c cVar = this.b;
            return hashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "NullableIntentWithManifest(manifest=" + this.a + ", intent=" + this.b + ")";
        }

        public c(com.vk.movika.sdk.base.model.s sVar, com.vk.movika.sdk.base.logic.dto.c cVar) {
            this.a = sVar;
            this.b = cVar;
        }
    }

    /* renamed from: com.vk.movika.sdk.base.presenter.d$d, reason: collision with other inner class name */
    public final class C1312d<T> {
        public final com.vk.movika.sdk.base.model.s a;
        public final T b;

        /* JADX WARN: Multi-variable type inference failed */
        public C1312d(com.vk.movika.sdk.base.model.s sVar, Object obj) {
            this.a = sVar;
            this.b = obj;
        }
    }

    public d(s sVar, o oVar, e eVar) {
        this.a = sVar;
        this.b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static com.vk.movika.sdk.base.logic.e a(l0 l0Var, Long l) {
        ?? hashSet;
        u uVar;
        com.vk.movika.sdk.base.model.s sVar = l0Var.a;
        String str = (sVar == null || (uVar = sVar.a) == null) ? null : uVar.a;
        Chapter chapter = l0Var.b;
        String str2 = chapter != null ? chapter.a : null;
        List<f> list = l0Var.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).a);
        }
        List<i> list2 = l0Var.g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((i) obj).b) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            hashSet = EmptySet.b;
        } else {
            hashSet = new HashSet(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hashSet.add(((i) it2.next()).a.a);
            }
        }
        Set set = hashSet;
        Chapter chapter2 = l0Var.c;
        return new com.vk.movika.sdk.base.logic.e(str, str2, arrayList, set, chapter2 != null ? chapter2.a : null, l != null ? l.longValue() : l0Var.h, l0Var.j, l0Var.n, 280);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02c6, code lost:
    
        if (r2 == r0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02fc, code lost:
    
        if (r1 == true) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0777  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v22, types: [kotlin.collections.EmptySet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1312d<b> b(C1312d<b> c1312d, C1312d<List<com.vk.movika.sdk.base.logic.dto.a>> c1312d2) {
        List<com.vk.movika.sdk.base.logic.dto.d> list;
        com.vk.movika.sdk.base.logic.e eVar;
        char c2;
        d.a hVar;
        String str;
        com.vk.movika.sdk.base.logic.e eVar2;
        List list2;
        com.vk.movika.sdk.base.model.c cVar;
        long j;
        boolean z;
        d.a gVar;
        Iterator it;
        boolean z2;
        com.vk.movika.sdk.base.logic.e eVar3;
        String str2;
        com.vk.movika.sdk.base.model.o oVar;
        com.vk.movika.sdk.base.logic.e eVar4;
        f b2;
        boolean z3;
        d.a.f fVar;
        com.vk.movika.sdk.base.logic.e eVar5;
        d.a.f fVar2;
        com.vk.movika.sdk.base.logic.e eVar6;
        d.a aVar;
        d.a aVar2;
        f b3;
        d.a aVar3;
        int i;
        d.a aVar4;
        com.vk.movika.sdk.base.logic.e eVar7;
        ?? hashSet;
        String str3;
        List<com.vk.movika.sdk.base.model.history.c> list3;
        com.vk.movika.sdk.base.model.history.c cVar2;
        boolean z4;
        Object c1301b;
        d dVar = this;
        List<com.vk.movika.sdk.base.logic.dto.a> list4 = c1312d2.b;
        boolean z5 = true;
        char c3 = '\n';
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(dVar, "GamePresenterImpl");
            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.vk.movika.sdk.base.logic.dto.a) it2.next()).a);
            }
            arrayList.toString();
        }
        if (list4.isEmpty()) {
            return c1312d;
        }
        com.vk.movika.sdk.base.model.s sVar = c1312d2.a;
        b bVar = new b(c1312d.b.a, EmptyList.b);
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            com.vk.movika.sdk.base.logic.dto.a aVar5 = (com.vk.movika.sdk.base.logic.dto.a) it3.next();
            boolean z6 = aVar5 instanceof a.AbstractC1294a;
            List<com.vk.movika.sdk.base.logic.dto.d> list5 = bVar.b;
            com.vk.movika.sdk.base.logic.e eVar8 = bVar.a;
            if (z6) {
                a.AbstractC1294a abstractC1294a = (a.AbstractC1294a) aVar5;
                k a2 = dVar.b.a(sVar);
                com.vk.ecomm.catalog.impl.geo.a aVar6 = a2.a;
                com.vk.movika.sdk.base.model.o oVar2 = eVar8.j;
                Set<String> set = eVar8.d;
                String str4 = eVar8.b;
                List<String> list6 = eVar8.c;
                Chapter chapter = sVar.h;
                boolean z7 = z5;
                if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                    com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                }
                Iterator it4 = it3;
                if (abstractC1294a instanceof a.AbstractC1294a.e) {
                    a.AbstractC1294a.e eVar9 = (a.AbstractC1294a.e) abstractC1294a;
                    com.vk.movika.sdk.base.logic.e eVar10 = eVar9.b;
                    String str5 = eVar9.e;
                    com.vk.movika.sdk.base.logic.e eVar11 = eVar10 == null ? new com.vk.movika.sdk.base.logic.e(chapter.a, null, null, null, null, 0L, null, false, 2046) : eVar10;
                    String str6 = eVar11.b;
                    if (str6 == null) {
                        str6 = chapter.a;
                    }
                    boolean z8 = (str5 == null || str5.equals(str6)) ? false : z7;
                    if (str5 == null) {
                        str5 = str6;
                    }
                    Chapter a3 = sVar.a(str5);
                    if (a3 == null) {
                        a3 = (Chapter) j5g.Y(sVar.b);
                    }
                    com.vk.movika.sdk.base.model.o oVar3 = eVar9.c;
                    if (oVar3 == null && (oVar3 = eVar11.j) == null) {
                        String a4 = ((com.vk.movika.sdk.base.logic.a) aVar6.b).a();
                        u uVar = sVar.a;
                        eVar7 = eVar10;
                        String str7 = uVar.a;
                        String str8 = uVar.b;
                        Integer num = uVar.c;
                        EmptySet emptySet = EmptySet.b;
                        EmptyList emptyList = EmptyList.b;
                        oVar3 = new com.vk.movika.sdk.base.model.o(a4, str7, str8, num, false, emptySet, emptyList, emptyList);
                    } else {
                        eVar7 = eVar10;
                    }
                    ArrayList arrayList2 = a3.d;
                    if (arrayList2.isEmpty()) {
                        hashSet = EmptySet.b;
                        list = list5;
                    } else {
                        list = list5;
                        hashSet = new HashSet(arrayList2.size());
                        for (Iterator it5 = arrayList2.iterator(); it5.hasNext(); it5 = it5) {
                            hashSet.add(((f) it5.next()).a);
                        }
                    }
                    String str9 = eVar11.g;
                    if (z8) {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str9 = a2.c(sVar, eVar11, a3);
                    }
                    String str10 = str9;
                    com.vk.movika.sdk.base.model.o oVar4 = eVar9.d ? oVar3 : null;
                    if (oVar4 == null || (list3 = oVar4.g) == null || (cVar2 = (com.vk.movika.sdk.base.model.history.c) j5g.k0(list3)) == null || (str3 = cVar2.a) == null) {
                        str3 = eVar9.f;
                    }
                    com.vk.movika.sdk.base.model.o d = aVar6.d(oVar3, str3);
                    com.vk.movika.sdk.base.model.c cVar3 = new com.vk.movika.sdk.base.model.c(str5);
                    List<com.vk.movika.sdk.base.model.c> list7 = d.h;
                    if (!list7.contains(cVar3)) {
                        d = com.vk.movika.sdk.base.model.o.a(d, null, null, j5g.v0(cVar3, list7), 127);
                    }
                    com.vk.movika.sdk.base.model.o h = aVar6.h(d, str5);
                    s3q0 s3q0Var = s3q0.a;
                    if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                        com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                        Objects.toString(eVar7);
                    }
                    String str11 = chapter.a;
                    String str12 = a3.a;
                    List O0 = j5g.O0(j5g.d0(eVar11.c, hashSet));
                    LinkedHashSet d0 = j5g.d0(eVar11.d, hashSet);
                    boolean z9 = (z8 || !eVar11.i) ? false : z7;
                    Long valueOf = Long.valueOf(eVar11.h);
                    if (z8) {
                        valueOf = null;
                    }
                    aVar3 = new d.a.e(com.vk.movika.sdk.base.logic.e.a(eVar11, str11, str12, O0, d0, null, null, str10, valueOf != null ? valueOf.longValue() : 0L, z9, h, false, 1072));
                } else {
                    list = list5;
                    if (abstractC1294a instanceof a.AbstractC1294a.f) {
                        l lVar = ((a.AbstractC1294a.f) abstractC1294a).b;
                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                            com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                        }
                        f fVar3 = (f) lVar.a;
                        gVar = sVar.b(fVar3.a) == null ? new d.a.c(eVar8, new j(fVar3, 0)) : a2.b(eVar8, ((com.vk.movika.sdk.base.model.j) lVar.b).b, fVar3, sVar, false);
                    } else if (abstractC1294a instanceof a.AbstractC1294a.b) {
                        f fVar4 = ((a.AbstractC1294a.b) abstractC1294a).b;
                        String str13 = fVar4.a;
                        if (set.contains(str13)) {
                            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                            }
                            eVar = eVar8;
                            aVar2 = null;
                            eVar8 = eVar;
                            aVar3 = aVar2;
                        } else {
                            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                                Objects.toString(fVar4.b());
                            }
                            eVar = eVar8;
                            aVar2 = new d.a.b(com.vk.movika.sdk.base.logic.e.a(eVar8, null, null, j5g.v0(str13, list6), null, null, null, null, 0L, false, null, false, 1787), fVar4);
                            eVar8 = eVar;
                            aVar3 = aVar2;
                        }
                    } else {
                        eVar = eVar8;
                        if (abstractC1294a instanceof a.AbstractC1294a.c) {
                            aVar2 = a2.a(eVar, (a.AbstractC1294a.c) abstractC1294a, sVar, false);
                        } else if (abstractC1294a instanceof a.AbstractC1294a.d) {
                            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                            }
                            String str14 = (String) j5g.a0(list6);
                            if (str14 == null || (b3 = sVar.b(str14)) == null) {
                                z3 = z7;
                                fVar = null;
                            } else {
                                a.AbstractC1294a.c cVar4 = new a.AbstractC1294a.c(b3);
                                z3 = z7;
                                fVar = a2.a(eVar, cVar4, sVar, z3);
                            }
                            if (fVar != null) {
                                boolean a5 = com.vk.movika.sdk.base.logic.dto.b.a(fVar);
                                aVar2 = fVar;
                            }
                            Chapter a6 = sVar.a(str4);
                            if (a6 == null) {
                                aVar = new d.a.C1300d(eVar);
                            } else {
                                com.vk.movika.sdk.base.logic.e eVar12 = (fVar == null || (eVar6 = fVar.a) == null) ? eVar : eVar6;
                                com.vk.movika.sdk.base.model.j a7 = m.a(a6);
                                if (a7 != null) {
                                    eVar5 = eVar12;
                                    fVar2 = a2.b(eVar5, a7.b, a6, sVar, true);
                                } else {
                                    eVar5 = eVar12;
                                    fVar2 = null;
                                }
                                if (fVar2 != null) {
                                    boolean a8 = com.vk.movika.sdk.base.logic.dto.b.a(fVar2);
                                    aVar = fVar2;
                                }
                                com.vk.movika.sdk.base.model.o oVar5 = eVar5.j;
                                aVar2 = new d.a.C1300d(com.vk.movika.sdk.base.logic.e.a(eVar5, null, null, null, null, null, null, null, 0L, false, oVar5 == null ? null : com.vk.movika.sdk.base.model.o.a(oVar5, null, null, null, 239), false, 1535));
                            }
                            aVar2 = aVar;
                        } else if (abstractC1294a instanceof a.AbstractC1294a.k) {
                            a.AbstractC1294a.k kVar = (a.AbstractC1294a.k) abstractC1294a;
                            Chapter chapter2 = kVar.b;
                            com.vk.movika.sdk.utils.c.b(a2, "GameLogic2", new h(kVar, 0));
                            d.a.f a9 = (list6.isEmpty() || (b2 = sVar.b((String) j5g.Y(list6))) == null) ? null : a2.a(eVar, new a.AbstractC1294a.c(b2), sVar, true);
                            if (a9 == null || (eVar3 = a9.a) == null) {
                                eVar3 = eVar;
                            }
                            if (a9 == null || (eVar4 = a9.a) == null || (str2 = eVar4.g) == null) {
                                str2 = kVar.c.a;
                            }
                            Chapter a10 = sVar.a(str2);
                            if (a10 == null) {
                                if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                                    com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                                }
                                aVar2 = null;
                            } else {
                                String str15 = chapter2.a;
                                String c4 = a2.c(sVar, eVar3, a10);
                                boolean z10 = chapter2.g == Chapter.Order.END && !eVar.k;
                                com.vk.movika.sdk.base.model.o oVar6 = eVar3.j;
                                Pair pair = z10 ? new Pair(oVar6 != null ? com.vk.movika.sdk.base.model.o.a(oVar6, null, null, EmptyList.b, 127) : null, EmptySet.b) : new Pair(oVar6, eVar3.e);
                                com.vk.movika.sdk.base.model.o oVar7 = (com.vk.movika.sdk.base.model.o) pair.d();
                                Set set2 = (Set) pair.g();
                                com.vk.movika.sdk.base.logic.interactor.i iVar = new com.vk.movika.sdk.base.logic.interactor.i(0, str2, a10);
                                if (oVar7 == null) {
                                    oVar = null;
                                } else {
                                    com.vk.movika.sdk.base.logic.processor.a aVar7 = new com.vk.movika.sdk.base.logic.processor.a(aVar6, oVar7);
                                    iVar.invoke(aVar7);
                                    oVar = aVar7.b;
                                }
                                EmptyList emptyList2 = EmptyList.b;
                                EmptySet emptySet2 = EmptySet.b;
                                aVar2 = new d.a.k(str15, com.vk.movika.sdk.base.logic.e.a(eVar3, null, str2, emptyList2, emptySet2, set2, emptySet2, c4, 0L, false, oVar, false, 257));
                            }
                        } else if (abstractC1294a instanceof a.AbstractC1294a.l) {
                            eVar8 = eVar;
                            aVar3 = new d.a.l(com.vk.movika.sdk.base.logic.e.a(eVar, null, null, null, null, null, null, null, ((a.AbstractC1294a.l) abstractC1294a).b, false, null, false, 1919));
                        } else {
                            eVar8 = eVar;
                            if (abstractC1294a instanceof a.AbstractC1294a.C1295a) {
                                ((a.AbstractC1294a.C1295a) abstractC1294a).getClass();
                                if (sVar.a(null) == null) {
                                    gVar = new d.a.c(eVar8, new g(0));
                                } else {
                                    aVar3 = new d.a.C1299a(com.vk.movika.sdk.base.logic.e.a(k.d(null, eVar8), null, null, null, null, null, null, null, 0L, false, oVar2 == null ? null : aVar6.h(oVar2, null), false, 1535));
                                }
                            } else {
                                if (abstractC1294a instanceof a.AbstractC1294a.g) {
                                    a.AbstractC1294a.g gVar2 = (a.AbstractC1294a.g) abstractC1294a;
                                    long j2 = gVar2.b;
                                    long j3 = gVar2.c;
                                    Set<com.vk.movika.sdk.base.model.d> set3 = eVar8.e;
                                    Chapter a11 = sVar.a(str4);
                                    Iterable b4 = a11 != null ? com.vk.movika.sdk.base.utils.d.b(a11.d) : EmptyList.b;
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it6 = b4.iterator();
                                    while (it6.hasNext()) {
                                        Iterable iterable = b4;
                                        Object next = it6.next();
                                        Iterator it7 = it6;
                                        if (!set.contains(((f) next).a)) {
                                            arrayList3.add(next);
                                        }
                                        b4 = iterable;
                                        it6 = it7;
                                    }
                                    Iterable iterable2 = b4;
                                    com.vk.movika.sdk.base.model.h b5 = a11 != null ? com.vk.movika.sdk.base.utils.e.b(j2, a11.c) : null;
                                    com.vk.movika.sdk.base.model.h b6 = a11 != null ? com.vk.movika.sdk.base.utils.e.b(j3, a11.c) : null;
                                    if (b5 != null) {
                                        j = j2;
                                        z = eVar8.f.contains(b5.a);
                                    } else {
                                        j = j2;
                                        z = true;
                                    }
                                    if (z) {
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it8 = iterable2.iterator();
                                        while (it8.hasNext()) {
                                            Object next2 = it8.next();
                                            Iterator it9 = it8;
                                            if (!set.contains(((f) next2).a)) {
                                                arrayList4.add(next2);
                                            }
                                            it8 = it9;
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it10 = arrayList4.iterator();
                                        while (it10.hasNext()) {
                                            Object next3 = it10.next();
                                            f fVar5 = (f) next3;
                                            if (set3 == null || set3.isEmpty() || !com.vk.movika.sdk.base.logic.processor.actions.openuri.d.a(fVar5)) {
                                                it = it10;
                                                z2 = false;
                                            } else {
                                                it = it10;
                                                z2 = com.vk.movika.sdk.utils.b.a(set3, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.openuri.b
                                                    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
                                                    public final Object get(Object obj) {
                                                        return ((com.vk.movika.sdk.base.model.d) obj).a;
                                                    }
                                                }).contains(fVar5.a);
                                            }
                                            if (!z2) {
                                                arrayList5.add(next3);
                                            }
                                            it10 = it;
                                        }
                                        if (!arrayList5.isEmpty()) {
                                            Iterator it11 = arrayList5.iterator();
                                            while (it11.hasNext()) {
                                                Iterator it12 = it11;
                                                long j4 = ((f) it11.next()).c;
                                                if (j > j4 || j4 > j3) {
                                                    it11 = it12;
                                                } else {
                                                    if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                                        com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                                                    }
                                                    gVar = new d.a.g(eVar8, false);
                                                }
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(c5g.u(set3, 10));
                                        Iterator it13 = set3.iterator();
                                        while (it13.hasNext()) {
                                            arrayList6.add(((com.vk.movika.sdk.base.model.d) it13.next()).a);
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it14 = arrayList6.iterator();
                                        while (it14.hasNext()) {
                                            f b7 = sVar.b((String) it14.next());
                                            if (b7 != null) {
                                                arrayList7.add(b7);
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it15 = arrayList7.iterator();
                                        while (it15.hasNext()) {
                                            Object next4 = it15.next();
                                            if (!com.vk.movika.sdk.base.logic.processor.actions.openuri.d.a((f) next4)) {
                                                arrayList8.add(next4);
                                            }
                                        }
                                        boolean f = epx.f(b5, b6);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it16 = arrayList3.iterator();
                                        while (it16.hasNext()) {
                                            Object next5 = it16.next();
                                            f fVar6 = (f) next5;
                                            long j5 = fVar6.c;
                                            Long l = fVar6.d;
                                            if (j3 <= (l != null ? l.longValue() : Long.MAX_VALUE) && j5 <= j3) {
                                                arrayList9.add(next5);
                                            }
                                        }
                                        List t0 = j5g.t0(arrayList9, arrayList8);
                                        ArrayList arrayList10 = new ArrayList();
                                        for (Object obj : t0) {
                                            f fVar7 = (f) obj;
                                            if (f || !com.vk.movika.sdk.base.logic.processor.actions.openuri.d.a(fVar7)) {
                                                arrayList10.add(obj);
                                            }
                                        }
                                        Set S0 = j5g.S0(arrayList10);
                                        c2 = '\n';
                                        ArrayList arrayList11 = new ArrayList(c5g.u(S0, 10));
                                        Iterator it17 = S0.iterator();
                                        while (it17.hasNext()) {
                                            arrayList11.add(((f) it17.next()).a);
                                        }
                                        hVar = new d.a.g(com.vk.movika.sdk.base.logic.e.a(eVar8, null, null, arrayList11, null, null, null, null, j3, false, null, false, 1659), true);
                                    } else {
                                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                            com.vk.movika.sdk.utils.c.a(a2, "GameLogic2");
                                        }
                                        gVar = new d.a.g(eVar8, false);
                                    }
                                } else {
                                    c2 = '\n';
                                    if (abstractC1294a instanceof a.AbstractC1294a.i) {
                                        a.AbstractC1294a.i iVar2 = (a.AbstractC1294a.i) abstractC1294a;
                                        if (oVar2 == null) {
                                            hVar = null;
                                        } else {
                                            List<com.vk.movika.sdk.base.model.c> list8 = oVar2.h;
                                            com.vk.movika.sdk.base.model.c cVar5 = (com.vk.movika.sdk.base.model.c) j5g.k0(list8);
                                            if (cVar5 != null) {
                                                ListIterator<com.vk.movika.sdk.base.model.c> listIterator = list8.listIterator(list8.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        cVar = null;
                                                        break;
                                                    }
                                                    cVar = listIterator.previous();
                                                    if (!epx.f(cVar.a, cVar5.a)) {
                                                        break;
                                                    }
                                                }
                                                com.vk.movika.sdk.base.model.c cVar6 = cVar;
                                                if (cVar6 != null) {
                                                    str = cVar6.a;
                                                    if (str == null) {
                                                        com.vk.movika.sdk.base.logic.e d2 = k.d(str, eVar8);
                                                        iVar2.getClass();
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        Set<String> set4 = oVar2.f;
                                                        if (!list8.isEmpty()) {
                                                            ListIterator<com.vk.movika.sdk.base.model.c> listIterator2 = list8.listIterator(list8.size());
                                                            while (listIterator2.hasPrevious()) {
                                                                com.vk.movika.sdk.base.model.c previous = listIterator2.previous();
                                                                if (epx.f(previous.a, str)) {
                                                                    list2 = j5g.H0(list8, listIterator2.nextIndex() + 1);
                                                                    break;
                                                                }
                                                                Chapter a12 = sVar.a(previous.a);
                                                                if (a12 != null) {
                                                                    Iterator it18 = a12.d.iterator();
                                                                    while (it18.hasNext()) {
                                                                        linkedHashSet.add(((f) it18.next()).a);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        list2 = EmptyList.b;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            set4 = izi0.g(set4, linkedHashSet);
                                                        }
                                                        eVar2 = com.vk.movika.sdk.base.logic.e.a(d2, null, null, null, null, null, null, null, 0L, false, com.vk.movika.sdk.base.model.o.a(oVar2, set4, null, list2, 95), true, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                                                    } else {
                                                        eVar2 = eVar8;
                                                    }
                                                    hVar = new d.a.i(str, eVar2);
                                                }
                                            }
                                            str = null;
                                            if (str == null) {
                                            }
                                            hVar = new d.a.i(str, eVar2);
                                        }
                                    } else if (abstractC1294a instanceof a.AbstractC1294a.h) {
                                        a.AbstractC1294a.h hVar2 = (a.AbstractC1294a.h) abstractC1294a;
                                        if (str4 == null) {
                                            hVar = new d.a.h(eVar8, false);
                                        } else {
                                            hVar2.getClass();
                                            hVar = new d.a.h(k.d(str4, eVar8), true);
                                        }
                                    } else {
                                        if (!(abstractC1294a instanceof a.AbstractC1294a.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        a.AbstractC1294a.j jVar = (a.AbstractC1294a.j) abstractC1294a;
                                        hVar = new d.a.j(com.vk.movika.sdk.base.logic.e.a(eVar8, null, null, null, null, null, null, null, 0L, false, jVar.b, false, 1535), jVar.b);
                                    }
                                }
                                if (hVar != null) {
                                    i = 0;
                                    aVar4 = new d.a.c(eVar8, new com.vk.movika.sdk.base.logic.interactor.b(abstractC1294a, i));
                                } else {
                                    i = 0;
                                    aVar4 = hVar;
                                }
                                if (aVar4 instanceof d.a.c) {
                                    d.a.c cVar7 = (d.a.c) aVar4;
                                    if (cVar7.c != null) {
                                        com.vk.movika.sdk.base.presenter.b bVar2 = new com.vk.movika.sdk.base.presenter.b(aVar4, i);
                                        if (cVar7.b) {
                                            dVar = this;
                                            com.vk.movika.sdk.utils.c.d(dVar, "GamePresenterImpl", bVar2);
                                        } else {
                                            dVar = this;
                                            com.vk.movika.sdk.utils.c.b(dVar, "GamePresenterImpl", bVar2);
                                        }
                                        b bVar3 = new b(aVar4.a, j5g.v0(aVar4, list));
                                        it3 = it4;
                                        c3 = c2;
                                        bVar = bVar3;
                                        z5 = true;
                                    }
                                }
                                dVar = this;
                                b bVar32 = new b(aVar4.a, j5g.v0(aVar4, list));
                                it3 = it4;
                                c3 = c2;
                                bVar = bVar32;
                                z5 = true;
                            }
                        }
                        eVar8 = eVar;
                        aVar3 = aVar2;
                    }
                    aVar3 = gVar;
                }
                c2 = '\n';
                hVar = aVar3;
                if (hVar != null) {
                }
                if (aVar4 instanceof d.a.c) {
                }
                dVar = this;
                b bVar322 = new b(aVar4.a, j5g.v0(aVar4, list));
                it3 = it4;
                c3 = c2;
                bVar = bVar322;
                z5 = true;
            } else {
                Iterator it19 = it3;
                char c5 = c3;
                if (!(aVar5 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar4 = (a.b) aVar5;
                if (bVar4 instanceof a.b.c) {
                    z4 = true;
                    c1301b = new d.b.a(((a.b.c) bVar4).b, true, dVar.a.a);
                } else {
                    z4 = true;
                    if (bVar4 instanceof a.b.d) {
                        c1301b = new d.b.a(((a.b.d) bVar4).b, false, false);
                    } else {
                        if (!(bVar4 instanceof a.b.e)) {
                            if (bVar4.equals(a.b.C1296a.b)) {
                                throw new NotImplementedError();
                            }
                            if (bVar4.equals(a.b.C1297b.b)) {
                                throw new NotImplementedError();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        c1301b = new d.b.C1301b(((a.b.e) bVar4).b);
                    }
                }
                c3 = c5;
                z5 = z4;
                bVar = new b(eVar8, j5g.v0(c1301b, list5));
                it3 = it19;
            }
        }
        return new C1312d<>(sVar, bVar);
    }
}
