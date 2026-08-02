package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.f f17809a;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.f f17812d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17810b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17811c = true;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f17813e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f17814f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b.InterfaceC0352b f17815g = null;

    /* renamed from: h, reason: collision with root package name */
    public b.a f17816h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f17817i = new ArrayList();

    public e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f17809a = fVar;
        this.f17812d = fVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f17821d;
        if (pVar.f17868c == null) {
            androidx.constraintlayout.core.widgets.f fVar4 = this.f17809a;
            if (pVar == fVar4.f17953d || pVar == fVar4.f17955e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f17868c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f17873h.f17828k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : pVar.f17874i.f17828k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f17850k.f17828k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f17873h.f17829l) {
                if (fVar6 == fVar5) {
                    mVar2.f17844b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f17874i.f17829l) {
                if (fVar7 == fVar5) {
                    mVar2.f17844b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f17850k.f17829l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    public final boolean b(androidx.constraintlayout.core.widgets.f fVar) {
        e.b bVar;
        int i10;
        char c10;
        e.b bVar2;
        float f10;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        Iterator it = fVar.f18092B0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
            e.b[] bVarArr = eVar.mListDimensionBehaviors;
            e.b bVar6 = bVarArr[0];
            e.b bVar7 = bVarArr[1];
            if (eVar.V() == 8) {
                eVar.f17947a = true;
            } else {
                if (eVar.f17995y < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f17987u = 2;
                }
                if (eVar.f17922B < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    eVar.f17989v = 2;
                }
                if (eVar.v() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        eVar.f17987u = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f17989v = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f17987u == 0) {
                            eVar.f17987u = 3;
                        }
                        if (eVar.f17989v == 0) {
                            eVar.f17989v = 3;
                        }
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f17987u == 1 && (eVar.f17931K.f17907f == null || eVar.f17933M.f17907f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f17989v == 1 && (eVar.f17932L.f17907f == null || eVar.f17934N.f17907f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f17953d;
                lVar.f17869d = bVar6;
                int i11 = eVar.f17987u;
                lVar.f17866a = i11;
                n nVar = eVar.f17955e;
                nVar.f17869d = bVar7;
                int i12 = eVar.f17989v;
                nVar.f17866a = i12;
                e.b bVar10 = e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == e.b.FIXED || bVar6 == e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == e.b.FIXED || bVar7 == e.b.WRAP_CONTENT)) {
                    e.b bVar11 = bVar7;
                    e.b bVar12 = bVar6;
                    int W10 = eVar.W();
                    if (bVar12 == bVar10) {
                        W10 = (fVar.W() - eVar.f17931K.f17908g) - eVar.f17933M.f17908g;
                        bVar12 = e.b.FIXED;
                    }
                    int i13 = W10;
                    int x10 = eVar.x();
                    if (bVar11 == bVar10) {
                        x10 = (fVar.x() - eVar.f17932L.f17908g) - eVar.f17934N.f17908g;
                        bVar11 = e.b.FIXED;
                    }
                    l(eVar, bVar12, i13, bVar11, x10);
                    eVar.f17953d.f17870e.d(eVar.W());
                    eVar.f17955e.f17870e.d(eVar.x());
                    eVar.f17947a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        e.b bVar13 = e.b.WRAP_CONTENT;
                        c10 = 0;
                        if (bVar7 != bVar13 && bVar7 != e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i11 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar, bVar13, 0, bVar13, 0);
                            }
                            int x11 = eVar.x();
                            int i14 = (int) ((x11 * eVar.f17943W) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            l(eVar, bVar14, i14, bVar14, x11);
                            eVar.f17953d.f17870e.d(eVar.W());
                            eVar.f17955e.f17870e.d(eVar.x());
                            eVar.f17947a = true;
                        } else if (i11 == 1) {
                            l(eVar, bVar13, 0, bVar7, 0);
                            eVar.f17953d.f17870e.f17838m = eVar.W();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i11 == 2) {
                                e.b bVar15 = fVar.mListDimensionBehaviors[0];
                                e.b bVar16 = e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar, bVar16, (int) ((eVar.f17995y * fVar.W()) + 0.5f), bVar, eVar.x());
                                    eVar.f17953d.f17870e.d(eVar.W());
                                    eVar.f17955e.f17870e.d(eVar.x());
                                    eVar.f17947a = true;
                                }
                            } else {
                                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar.mListAnchors;
                                f10 = 1.0f;
                                if (dVarArr[0].f17907f == null || dVarArr[1].f17907f == null) {
                                    l(eVar, bVar13, 0, bVar, 0);
                                    eVar.f17953d.f17870e.d(eVar.W());
                                    eVar.f17955e.f17870e.d(eVar.x());
                                    eVar.f17947a = true;
                                } else {
                                    if (bVar == bVar2 || !(bVar6 == (bVar4 = e.b.WRAP_CONTENT) || bVar6 == e.b.FIXED)) {
                                        bVar3 = bVar6;
                                    } else if (i12 == i10) {
                                        if (bVar6 == bVar4) {
                                            l(eVar, bVar4, 0, bVar4, 0);
                                        }
                                        int W11 = eVar.W();
                                        float f11 = eVar.f17943W;
                                        if (eVar.w() == -1) {
                                            f11 = f10 / f11;
                                        }
                                        e.b bVar17 = e.b.FIXED;
                                        l(eVar, bVar17, W11, bVar17, (int) ((W11 * f11) + 0.5f));
                                        eVar.f17953d.f17870e.d(eVar.W());
                                        eVar.f17955e.f17870e.d(eVar.x());
                                        eVar.f17947a = true;
                                    } else if (i12 == 1) {
                                        l(eVar, bVar6, 0, bVar4, 0);
                                        eVar.f17955e.f17870e.f17838m = eVar.x();
                                    } else {
                                        bVar3 = bVar6;
                                        if (i12 == 2) {
                                            e.b bVar18 = fVar.mListDimensionBehaviors[1];
                                            bVar5 = bVar;
                                            e.b bVar19 = e.b.FIXED;
                                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                                l(eVar, bVar3, eVar.W(), bVar19, (int) ((eVar.f17922B * fVar.x()) + 0.5f));
                                                eVar.f17953d.f17870e.d(eVar.W());
                                                eVar.f17955e.f17870e.d(eVar.x());
                                                eVar.f17947a = true;
                                            } else {
                                                bVar = bVar5;
                                            }
                                        } else {
                                            bVar5 = bVar;
                                            androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar.mListAnchors;
                                            if (dVarArr2[2].f17907f == null || dVarArr2[i10].f17907f == null) {
                                                l(eVar, bVar4, 0, bVar5, 0);
                                                eVar.f17953d.f17870e.d(eVar.W());
                                                eVar.f17955e.f17870e.d(eVar.x());
                                                eVar.f17947a = true;
                                            } else {
                                                bVar = bVar5;
                                            }
                                        }
                                    }
                                    if (bVar3 == bVar2 && bVar == bVar2) {
                                        if (i11 != 1 || i12 == 1) {
                                            e.b bVar20 = e.b.WRAP_CONTENT;
                                            l(eVar, bVar20, 0, bVar20, 0);
                                            eVar.f17953d.f17870e.f17838m = eVar.W();
                                            eVar.f17955e.f17870e.f17838m = eVar.x();
                                        } else if (i12 == 2 && i11 == 2) {
                                            e.b[] bVarArr2 = fVar.mListDimensionBehaviors;
                                            e.b bVar21 = bVarArr2[c10];
                                            e.b bVar22 = e.b.FIXED;
                                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                                l(eVar, bVar22, (int) ((eVar.f17995y * fVar.W()) + 0.5f), bVar22, (int) ((eVar.f17922B * fVar.x()) + 0.5f));
                                                eVar.f17953d.f17870e.d(eVar.W());
                                                eVar.f17955e.f17870e.d(eVar.x());
                                                eVar.f17947a = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        c10 = 0;
                        bVar2 = bVar9;
                    }
                    f10 = 1.0f;
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 == bVar2) {
                        if (i11 != 1) {
                        }
                        e.b bVar202 = e.b.WRAP_CONTENT;
                        l(eVar, bVar202, 0, bVar202, 0);
                        eVar.f17953d.f17870e.f17838m = eVar.W();
                        eVar.f17955e.f17870e.f17838m = eVar.x();
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.f17813e);
        this.f17817i.clear();
        m.f17842h = 0;
        i(this.f17809a.f17953d, 0, this.f17817i);
        i(this.f17809a.f17955e, 1, this.f17817i);
        this.f17810b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f17812d.f17953d.f();
        this.f17812d.f17955e.f();
        arrayList.add(this.f17812d.f17953d);
        arrayList.add(this.f17812d.f17955e);
        Iterator it = this.f17812d.f18092B0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.i0()) {
                    if (eVar.f17949b == null) {
                        eVar.f17949b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f17949b);
                } else {
                    arrayList.add(eVar.f17953d);
                }
                if (eVar.k0()) {
                    if (eVar.f17951c == null) {
                        eVar.f17951c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f17951c);
                } else {
                    arrayList.add(eVar.f17955e);
                }
                if (eVar instanceof androidx.constraintlayout.core.widgets.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f17867b != this.f17812d) {
                pVar.d();
            }
        }
    }

    public final int e(androidx.constraintlayout.core.widgets.f fVar, int i10) {
        int size = this.f17817i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, ((m) this.f17817i.get(i11)).b(fVar, i10));
        }
        return (int) j10;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f17810b || this.f17811c) {
            Iterator it = this.f17809a.f18092B0.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
                eVar.n();
                eVar.f17947a = false;
                eVar.f17953d.r();
                eVar.f17955e.q();
            }
            this.f17809a.n();
            androidx.constraintlayout.core.widgets.f fVar = this.f17809a;
            fVar.f17947a = false;
            fVar.f17953d.r();
            this.f17809a.f17955e.q();
            this.f17811c = false;
        }
        if (b(this.f17812d)) {
            return false;
        }
        this.f17809a.n1(0);
        this.f17809a.o1(0);
        e.b u10 = this.f17809a.u(0);
        e.b u11 = this.f17809a.u(1);
        if (this.f17810b) {
            c();
        }
        int X10 = this.f17809a.X();
        int Y10 = this.f17809a.Y();
        this.f17809a.f17953d.f17873h.d(X10);
        this.f17809a.f17955e.f17873h.d(Y10);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u10 == bVar || u11 == bVar) {
            if (z10) {
                Iterator it2 = this.f17813e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && u10 == e.b.WRAP_CONTENT) {
                this.f17809a.Q0(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar2 = this.f17809a;
                fVar2.l1(e(fVar2, 0));
                androidx.constraintlayout.core.widgets.f fVar3 = this.f17809a;
                fVar3.f17953d.f17870e.d(fVar3.W());
            }
            if (z10 && u11 == e.b.WRAP_CONTENT) {
                this.f17809a.h1(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar4 = this.f17809a;
                fVar4.M0(e(fVar4, 1));
                androidx.constraintlayout.core.widgets.f fVar5 = this.f17809a;
                fVar5.f17955e.f17870e.d(fVar5.x());
            }
        }
        androidx.constraintlayout.core.widgets.f fVar6 = this.f17809a;
        e.b bVar2 = fVar6.mListDimensionBehaviors[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W10 = fVar6.W() + X10;
            this.f17809a.f17953d.f17874i.d(W10);
            this.f17809a.f17953d.f17870e.d(W10 - X10);
            m();
            androidx.constraintlayout.core.widgets.f fVar7 = this.f17809a;
            e.b bVar4 = fVar7.mListDimensionBehaviors[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x10 = fVar7.x() + Y10;
                this.f17809a.f17955e.f17874i.d(x10);
                this.f17809a.f17955e.f17870e.d(x10 - Y10);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f17813e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f17867b != this.f17809a || pVar.f17872g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f17813e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if (z11 || pVar2.f17867b != this.f17809a) {
                if (!pVar2.f17873h.f17827j) {
                    break;
                }
                if (!pVar2.f17874i.f17827j) {
                    if (!(pVar2 instanceof j)) {
                        break;
                    }
                }
                if (!pVar2.f17870e.f17827j && !(pVar2 instanceof c) && !(pVar2 instanceof j)) {
                    break;
                }
            }
        }
        this.f17809a.Q0(u10);
        this.f17809a.h1(u11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f17810b) {
            Iterator it = this.f17809a.f18092B0.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
                eVar.n();
                eVar.f17947a = false;
                l lVar = eVar.f17953d;
                lVar.f17870e.f17827j = false;
                lVar.f17872g = false;
                lVar.r();
                n nVar = eVar.f17955e;
                nVar.f17870e.f17827j = false;
                nVar.f17872g = false;
                nVar.q();
            }
            this.f17809a.n();
            androidx.constraintlayout.core.widgets.f fVar = this.f17809a;
            fVar.f17947a = false;
            l lVar2 = fVar.f17953d;
            lVar2.f17870e.f17827j = false;
            lVar2.f17872g = false;
            lVar2.r();
            n nVar2 = this.f17809a.f17955e;
            nVar2.f17870e.f17827j = false;
            nVar2.f17872g = false;
            nVar2.q();
            c();
        }
        if (b(this.f17812d)) {
            return false;
        }
        this.f17809a.n1(0);
        this.f17809a.o1(0);
        this.f17809a.f17953d.f17873h.d(0);
        this.f17809a.f17955e.f17873h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b u10 = this.f17809a.u(0);
        e.b u11 = this.f17809a.u(1);
        int X10 = this.f17809a.X();
        int Y10 = this.f17809a.Y();
        if (z10 && (u10 == (bVar = e.b.WRAP_CONTENT) || u11 == bVar)) {
            Iterator it = this.f17813e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f17871f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && u10 == e.b.WRAP_CONTENT) {
                    this.f17809a.Q0(e.b.FIXED);
                    androidx.constraintlayout.core.widgets.f fVar = this.f17809a;
                    fVar.l1(e(fVar, 0));
                    androidx.constraintlayout.core.widgets.f fVar2 = this.f17809a;
                    fVar2.f17953d.f17870e.d(fVar2.W());
                }
            } else if (z10 && u11 == e.b.WRAP_CONTENT) {
                this.f17809a.h1(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar3 = this.f17809a;
                fVar3.M0(e(fVar3, 1));
                androidx.constraintlayout.core.widgets.f fVar4 = this.f17809a;
                fVar4.f17955e.f17870e.d(fVar4.x());
            }
        }
        if (i10 == 0) {
            androidx.constraintlayout.core.widgets.f fVar5 = this.f17809a;
            e.b bVar2 = fVar5.mListDimensionBehaviors[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int W10 = fVar5.W() + X10;
                this.f17809a.f17953d.f17874i.d(W10);
                this.f17809a.f17953d.f17870e.d(W10 - X10);
                z11 = true;
            }
            z11 = false;
        } else {
            androidx.constraintlayout.core.widgets.f fVar6 = this.f17809a;
            e.b bVar3 = fVar6.mListDimensionBehaviors[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int x10 = fVar6.x() + Y10;
                this.f17809a.f17955e.f17874i.d(x10);
                this.f17809a.f17955e.f17870e.d(x10 - Y10);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator it2 = this.f17813e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f17871f == i10 && (pVar2.f17867b != this.f17809a || pVar2.f17872g)) {
                pVar2.e();
            }
        }
        Iterator it3 = this.f17813e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.f17871f == i10 && (z11 || pVar3.f17867b != this.f17809a)) {
                if (!pVar3.f17873h.f17827j) {
                    break;
                }
                if (!pVar3.f17874i.f17827j) {
                    break;
                }
                if (!(pVar3 instanceof c) && !pVar3.f17870e.f17827j) {
                    break;
                }
            }
        }
        this.f17809a.Q0(u10);
        this.f17809a.h1(u11);
        return z12;
    }

    public final void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f17873h.f17828k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f17874i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f17873h, i10, 0, pVar.f17874i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f17874i.f17828k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f17873h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f17874i, i10, 1, pVar.f17873h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f17850k.f17828k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    public void j() {
        this.f17810b = true;
    }

    public void k() {
        this.f17811c = true;
    }

    public final void l(androidx.constraintlayout.core.widgets.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f17816h;
        aVar.f17797a = bVar;
        aVar.f17798b = bVar2;
        aVar.f17799c = i10;
        aVar.f17800d = i11;
        this.f17815g.b(eVar, aVar);
        eVar.l1(this.f17816h.f17801e);
        eVar.M0(this.f17816h.f17802f);
        eVar.L0(this.f17816h.f17804h);
        eVar.B0(this.f17816h.f17803g);
    }

    public void m() {
        g gVar;
        Iterator it = this.f17809a.f18092B0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
            if (!eVar.f17947a) {
                e.b[] bVarArr = eVar.mListDimensionBehaviors;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar.f17987u;
                int i11 = eVar.f17989v;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar.f17953d.f17870e;
                boolean z12 = gVar2.f17827j;
                g gVar3 = eVar.f17955e.f17870e;
                boolean z13 = gVar3.f17827j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f17824g, bVar4, gVar3.f17824g);
                    eVar.f17947a = true;
                } else if (z12 && z10) {
                    l(eVar, e.b.FIXED, gVar2.f17824g, bVar3, gVar3.f17824g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f17955e.f17870e.f17838m = eVar.x();
                    } else {
                        eVar.f17955e.f17870e.d(eVar.x());
                        eVar.f17947a = true;
                    }
                } else if (z13 && z11) {
                    l(eVar, bVar3, gVar2.f17824g, e.b.FIXED, gVar3.f17824g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f17953d.f17870e.f17838m = eVar.W();
                    } else {
                        eVar.f17953d.f17870e.d(eVar.W());
                        eVar.f17947a = true;
                    }
                }
                if (eVar.f17947a && (gVar = eVar.f17955e.f17851l) != null) {
                    gVar.d(eVar.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0352b interfaceC0352b) {
        this.f17815g = interfaceC0352b;
    }
}
