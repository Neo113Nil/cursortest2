package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {
    public static o a(androidx.constraintlayout.core.widgets.e eVar, int i10, ArrayList arrayList, o oVar) {
        int t12;
        int i11 = i10 == 0 ? eVar.f17996y0 : eVar.f17998z0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof androidx.constraintlayout.core.widgets.j) && (t12 = ((androidx.constraintlayout.core.widgets.j) eVar).t1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == t12) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                hVar.s1().c(hVar.t1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f17996y0 = oVar.c();
                eVar.f17931K.c(i10, arrayList, oVar);
                eVar.f17933M.c(i10, arrayList, oVar);
            } else {
                eVar.f17998z0 = oVar.c();
                eVar.f17932L.c(i10, arrayList, oVar);
                eVar.f17935O.c(i10, arrayList, oVar);
                eVar.f17934N.c(i10, arrayList, oVar);
            }
            eVar.f17938R.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(androidx.constraintlayout.core.widgets.f fVar, b.InterfaceC0352b interfaceC0352b) {
        o oVar;
        boolean z10;
        o oVar2;
        ArrayList s12 = fVar.s1();
        int size = s12.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) s12.get(i11);
            if (!d(fVar.A(), fVar.T(), eVar.A(), eVar.T()) || (eVar instanceof androidx.constraintlayout.core.widgets.g)) {
                return false;
            }
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            androidx.constraintlayout.core.widgets.e eVar2 = (androidx.constraintlayout.core.widgets.e) s12.get(i12);
            if (!d(fVar.A(), fVar.T(), eVar2.A(), eVar2.T())) {
                androidx.constraintlayout.core.widgets.f.U1(i10, eVar2, interfaceC0352b, fVar.f18030d1, b.a.f17794k);
            }
            boolean z11 = eVar2 instanceof androidx.constraintlayout.core.widgets.h;
            if (z11) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar2;
                if (hVar.t1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.t1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof androidx.constraintlayout.core.widgets.j) {
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar2;
                    if (aVar.y1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.y1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.j jVar = (androidx.constraintlayout.core.widgets.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.f17931K.f17907f == null && eVar2.f17933M.f17907f == null && !z11 && !(eVar2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.f17932L.f17907f == null && eVar2.f17934N.f17907f == null && eVar2.f17935O.f17907f == null && !z11 && !(eVar2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((androidx.constraintlayout.core.widgets.h) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i13 = 0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.j jVar2 = (androidx.constraintlayout.core.widgets.j) it2.next();
                o a10 = a(jVar2, i13, arrayList7, oVar3);
                jVar2.s1(arrayList7, i13, a10);
                a10.b(arrayList7);
                oVar3 = null;
                i13 = 0;
            }
        }
        androidx.constraintlayout.core.widgets.d o10 = fVar.o(d.a.LEFT);
        if (o10.d() != null) {
            Iterator it3 = o10.d().iterator();
            while (it3.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it3.next()).f17905d, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d o11 = fVar.o(d.a.RIGHT);
        if (o11.d() != null) {
            Iterator it4 = o11.d().iterator();
            while (it4.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it4.next()).f17905d, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d o12 = fVar.o(d.a.CENTER);
        if (o12.d() != null) {
            Iterator it5 = o12.d().iterator();
            while (it5.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it5.next()).f17905d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                a((androidx.constraintlayout.core.widgets.e) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                a((androidx.constraintlayout.core.widgets.h) it7.next(), 1, arrayList7, null);
            }
        }
        int i14 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                androidx.constraintlayout.core.widgets.j jVar3 = (androidx.constraintlayout.core.widgets.j) it8.next();
                o a11 = a(jVar3, i14, arrayList7, oVar4);
                jVar3.s1(arrayList7, i14, a11);
                a11.b(arrayList7);
                oVar4 = null;
                i14 = 1;
            }
        }
        androidx.constraintlayout.core.widgets.d o13 = fVar.o(d.a.TOP);
        if (o13.d() != null) {
            Iterator it9 = o13.d().iterator();
            while (it9.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it9.next()).f17905d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d o14 = fVar.o(d.a.BASELINE);
        if (o14.d() != null) {
            Iterator it10 = o14.d().iterator();
            while (it10.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it10.next()).f17905d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d o15 = fVar.o(d.a.BOTTOM);
        if (o15.d() != null) {
            Iterator it11 = o15.d().iterator();
            while (it11.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it11.next()).f17905d, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.d o16 = fVar.o(d.a.CENTER);
        if (o16.d() != null) {
            Iterator it12 = o16.d().iterator();
            while (it12.hasNext()) {
                a(((androidx.constraintlayout.core.widgets.d) it12.next()).f17905d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((androidx.constraintlayout.core.widgets.e) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            androidx.constraintlayout.core.widgets.e eVar3 = (androidx.constraintlayout.core.widgets.e) s12.get(i15);
            if (eVar3.s0()) {
                o b10 = b(arrayList7, eVar3.f17996y0);
                o b11 = b(arrayList7, eVar3.f17998z0);
                if (b10 != null && b11 != null) {
                    b10.g(0, b11);
                    b11.i(2);
                    arrayList7.remove(b10);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.A() == e.b.WRAP_CONTENT) {
            Iterator it14 = arrayList7.iterator();
            oVar = null;
            int i16 = 0;
            while (it14.hasNext()) {
                o oVar5 = (o) it14.next();
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int f10 = oVar5.f(fVar.M1(), 0);
                    if (f10 > i16) {
                        oVar = oVar5;
                        i16 = f10;
                    }
                }
            }
            if (oVar != null) {
                fVar.Q0(e.b.FIXED);
                fVar.l1(i16);
                oVar.h(true);
                if (fVar.T() != e.b.WRAP_CONTENT) {
                    Iterator it15 = arrayList7.iterator();
                    o oVar6 = null;
                    int i17 = 0;
                    while (it15.hasNext()) {
                        o oVar7 = (o) it15.next();
                        if (oVar7.d() != 0) {
                            oVar7.h(false);
                            int f11 = oVar7.f(fVar.M1(), 1);
                            if (f11 > i17) {
                                oVar6 = oVar7;
                                i17 = f11;
                            }
                        }
                    }
                    z10 = true;
                    if (oVar6 != null) {
                        fVar.h1(e.b.FIXED);
                        fVar.M0(i17);
                        oVar6.h(true);
                        oVar2 = oVar6;
                        if (oVar == null || oVar2 != null) {
                            return z10;
                        }
                        return false;
                    }
                } else {
                    z10 = true;
                }
                oVar2 = null;
                if (oVar == null) {
                }
                return z10;
            }
        }
        oVar = null;
        if (fVar.T() != e.b.WRAP_CONTENT) {
        }
        oVar2 = null;
        if (oVar == null) {
        }
        return z10;
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
