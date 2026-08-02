package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s3h {
    public final wtc a;
    public final boolean b;
    public final wma c;
    public final l3h d;
    public s3h e;
    public final int f;

    public s3h(wtc wtcVar, boolean z, wma wmaVar, l3h l3hVar) {
        this.a = wtcVar;
        this.b = z;
        this.c = wmaVar;
        this.d = l3hVar;
        this.f = wmaVar.b;
    }

    public static /* synthetic */ List j(int i, s3h s3hVar) {
        return s3hVar.i((i & 1) != 0 ? !s3hVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final oqf a(wdd wddVar) {
        bw4 bw4Var;
        s3h l = l();
        if (l == null) {
            return oqf.e;
        }
        wtc wtcVar = (wtc) l.c.F.g;
        if ((wtcVar.d & 8) != 0) {
            loop0: while (wtcVar != null) {
                if ((wtcVar.c & 8) != 0) {
                    bw4Var = wtcVar;
                    ?? r5 = 0;
                    while (bw4Var != 0) {
                        if (bw4Var instanceof p3h) {
                            if (bw4Var.p()) {
                                break loop0;
                            }
                        } else if ((bw4Var.c & 8) != 0 && (bw4Var instanceof bw4)) {
                            wtc wtcVar2 = bw4Var.p;
                            int i = 0;
                            bw4Var = bw4Var;
                            r5 = r5;
                            while (wtcVar2 != null) {
                                if ((wtcVar2.c & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        bw4Var = wtcVar2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var != 0) {
                                            r5.b(bw4Var);
                                            bw4Var = 0;
                                        }
                                        r5.b(wtcVar2);
                                    }
                                }
                                wtcVar2 = wtcVar2.f;
                                bw4Var = bw4Var;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var = c6o.X(r5);
                    }
                }
                if ((wtcVar.d & 8) == 0) {
                    break;
                }
                wtcVar = wtcVar.f;
            }
        }
        bw4Var = 0;
        p3h p3hVar = (p3h) bw4Var;
        wdd a0 = p3hVar != null ? c6o.a0(p3hVar, 8) : null;
        return a0 == null ? l.a(wddVar) : a0.p(wddVar, true);
    }

    public final s3h b(u5g u5gVar, Function1 function1) {
        l3h l3hVar = new l3h();
        l3hVar.c = false;
        l3hVar.d = false;
        function1.invoke(l3hVar);
        s3h s3hVar = new s3h(new r3h(function1), false, new wma(true, this.f + (u5gVar != null ? 1000000000 : 2000000000)), l3hVar);
        s3hVar.e = this;
        return s3hVar;
    }

    public final void c(wma wmaVar, ArrayList arrayList) {
        i1d y = wmaVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar2 = (wma) objArr[i2];
            if (wmaVar2.H() && !wmaVar2.Q) {
                if (wmaVar2.F.n(8)) {
                    arrayList.add(ufa.e(wmaVar2, this.b));
                } else {
                    c(wmaVar2, arrayList);
                }
            }
        }
    }

    public final wdd d() {
        if (!o()) {
            p3h f = f();
            return f != null ? c6o.a0(f, 8) : (z3a) this.c.F.d;
        }
        s3h l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            s3h s3hVar = (s3h) arrayList.get(size2);
            if (s3hVar.p()) {
                arrayList2.add(s3hVar);
            } else if (!s3hVar.d.d) {
                s3hVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p3h f() {
        wtc wtcVar;
        boolean z;
        boolean z2 = this.d.c;
        Object obj = null;
        wma wmaVar = this.c;
        if (!z2) {
            wtc wtcVar2 = (wtc) wmaVar.F.g;
            if ((wtcVar2.d & 8) != 0) {
                loop3: while (wtcVar2 != null) {
                    if ((wtcVar2.c & 8) != 0) {
                        wtcVar = wtcVar2;
                        i1d i1dVar = null;
                        while (wtcVar != null) {
                            if (wtcVar instanceof p3h) {
                                if (((p3h) wtcVar).p()) {
                                    obj = wtcVar;
                                }
                            } else if ((wtcVar.c & 8) != 0 && (wtcVar instanceof bw4)) {
                                int i = 0;
                                for (wtc wtcVar3 = ((bw4) wtcVar).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                    if ((wtcVar3.c & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            wtcVar = wtcVar3;
                                        } else {
                                            if (i1dVar == null) {
                                                i1dVar = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar != null) {
                                                i1dVar.b(wtcVar);
                                                wtcVar = null;
                                            }
                                            i1dVar.b(wtcVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            wtcVar = c6o.X(i1dVar);
                        }
                    }
                    if ((wtcVar2.d & 8) == 0) {
                        break;
                    }
                    wtcVar2 = wtcVar2.f;
                }
            }
            return (p3h) obj;
        }
        wtc wtcVar4 = (wtc) wmaVar.F.g;
        if ((wtcVar4.d & 8) != 0) {
            wtcVar = null;
            while (wtcVar4 != null) {
                if ((wtcVar4.c & 8) != 0) {
                    wtc wtcVar5 = wtcVar4;
                    i1d i1dVar2 = null;
                    while (wtcVar5 != null) {
                        if (wtcVar5 instanceof p3h) {
                            p3h p3hVar = (p3h) wtcVar5;
                            if (p3hVar.p()) {
                                if (p3hVar.U0()) {
                                    return p3hVar;
                                }
                                if (wtcVar == null) {
                                    wtcVar = p3hVar;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (wtcVar5.c & 8) != 0 && (wtcVar5 instanceof bw4)) {
                            int i2 = 0;
                            for (wtc wtcVar6 = ((bw4) wtcVar5).p; wtcVar6 != null; wtcVar6 = wtcVar6.f) {
                                if ((wtcVar6.c & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        wtcVar5 = wtcVar6;
                                    } else {
                                        if (i1dVar2 == null) {
                                            i1dVar2 = new i1d(new wtc[16], 0);
                                        }
                                        if (wtcVar5 != null) {
                                            i1dVar2.b(wtcVar5);
                                            wtcVar5 = null;
                                        }
                                        i1dVar2.b(wtcVar6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        wtcVar5 = c6o.X(i1dVar2);
                    }
                }
                if ((wtcVar4.d & 8) == 0) {
                    break;
                }
                wtcVar4 = wtcVar4.f;
            }
            obj = wtcVar;
        }
        return (p3h) obj;
    }

    public final oqf g() {
        wdd d = d();
        if (d != null) {
            if (!d.e1().n) {
                d = null;
            }
            if (d != null) {
                return o6a.y(d).p(d, true);
            }
        }
        return oqf.e;
    }

    public final oqf h() {
        wdd d = d();
        if (d != null) {
            if (!d.e1().n) {
                d = null;
            }
            if (d != null) {
                return o6a.m(d, true);
            }
        }
        return oqf.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final l3h k() {
        boolean p = p();
        l3h l3hVar = this.d;
        if (!p) {
            return l3hVar;
        }
        l3h c = l3hVar.c();
        r(new ArrayList(), c);
        return c;
    }

    public final s3h l() {
        wma wmaVar;
        s3h s3hVar = this.e;
        if (s3hVar != null) {
            return s3hVar;
        }
        wma wmaVar2 = this.c;
        boolean z = this.b;
        if (z) {
            wmaVar = wmaVar2.v();
            while (wmaVar != null) {
                l3h x = wmaVar.x();
                if (x != null && x.c) {
                    break;
                }
                wmaVar = wmaVar.v();
            }
        }
        wmaVar = null;
        if (wmaVar == null) {
            wma v = wmaVar2.v();
            while (true) {
                if (v == null) {
                    wmaVar = null;
                    break;
                }
                if (v.F.n(8)) {
                    wmaVar = v;
                    break;
                }
                v = v.v();
            }
        }
        if (wmaVar == null) {
            return null;
        }
        return ufa.e(wmaVar, z);
    }

    public final List m() {
        return j(4, this);
    }

    public final oqf n() {
        xv4 f = f();
        if (f == null) {
            return ((z3a) this.c.F.d).A1();
        }
        wtc wtcVar = ((wtc) f).a;
        Object g = this.d.a.g(k3h.b);
        if (g == null) {
            g = null;
        }
        boolean z = g != null;
        if (!wtcVar.a.n) {
            return oqf.e;
        }
        if (z) {
            return c6o.a0(wtcVar, 8).A1();
        }
        wdd a0 = c6o.a0(wtcVar, 8);
        return o6a.y(a0).p(a0, true);
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.c;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        wma v = this.c.v();
        while (true) {
            if (v == null) {
                v = null;
                break;
            }
            l3h x = v.x();
            if (x != null && x.c) {
                break;
            }
            v = v.v();
        }
        return v == null;
    }

    public final void r(ArrayList arrayList, l3h l3hVar) {
        if (this.d.d) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            s3h s3hVar = (s3h) arrayList.get(size2);
            if (!s3hVar.p()) {
                l3hVar.e(s3hVar.d);
                s3hVar.r(arrayList, l3hVar);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return km5.a;
        }
        c(this.c, arrayList);
        if (z) {
            l3h l3hVar = this.d;
            x0d x0dVar = l3hVar.a;
            Object g = x0dVar.g(w3h.z);
            if (g == null) {
                g = null;
            }
            u5g u5gVar = (u5g) g;
            if (u5gVar != null && l3hVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(u5gVar, new xjd(u5gVar, 4)));
            }
            a4h a4hVar = w3h.a;
            if (x0dVar.c(a4hVar) && !arrayList.isEmpty() && l3hVar.c) {
                Object g2 = x0dVar.g(a4hVar);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new q3h(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
