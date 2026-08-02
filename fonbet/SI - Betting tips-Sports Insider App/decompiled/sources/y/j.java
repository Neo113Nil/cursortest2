package y;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f25502k = new int[2];

    public static void m(int[] iArr, int i5, int i10, int i11, int i12, float f6, int i13) {
        int i14 = i10 - i5;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f6) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f6) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f6) + 0.5f);
        int i17 = (int) ((i14 / f6) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f6;
        boolean z5;
        float f10;
        float f11;
        float f12;
        int i5;
        if (v.f.d(this.j) == 3) {
            x.d dVar2 = this.f25514b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        f fVar = this.f25517e;
        boolean z7 = fVar.j;
        e eVar = this.f25520h;
        e eVar2 = this.f25521i;
        if (!z7 && this.f25516d == 3) {
            x.d dVar3 = this.f25514b;
            int i10 = dVar3.f25321r;
            if (i10 == 2) {
                f6 = 0.5f;
                x.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f25299d.f25517e.j) {
                        fVar.d((int) ((r5.f25495g * dVar3.f25326w) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                int i11 = dVar3.f25322s;
                if (i11 == 0 || i11 == 3) {
                    l lVar = dVar3.f25301e;
                    e eVar3 = lVar.f25520h;
                    e eVar4 = lVar.f25521i;
                    boolean z10 = dVar3.I.f25289f != null;
                    boolean z11 = dVar3.J.f25289f != null;
                    boolean z12 = dVar3.K.f25289f != null;
                    boolean z13 = dVar3.L.f25289f != null;
                    f6 = 0.5f;
                    int i12 = dVar3.X;
                    if (z10 && z11 && z12 && z13) {
                        float f13 = dVar3.W;
                        boolean z14 = eVar3.j;
                        ArrayList arrayList = eVar3.f25499l;
                        int[] iArr = f25502k;
                        if (z14 && eVar4.j) {
                            if (eVar.f25491c && eVar2.f25491c) {
                                m(iArr, ((e) eVar.f25499l.get(0)).f25495g + eVar.f25494f, ((e) eVar2.f25499l.get(0)).f25495g - eVar2.f25494f, eVar3.f25495g + eVar3.f25494f, eVar4.f25495g - eVar4.f25494f, f13, i12);
                                fVar.d(iArr[0]);
                                this.f25514b.f25301e.f25517e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (eVar.j && eVar2.j) {
                            if (!eVar3.f25491c || !eVar4.f25491c) {
                                return;
                            }
                            m(iArr, eVar.f25495g + eVar.f25494f, eVar2.f25495g - eVar2.f25494f, ((e) arrayList.get(0)).f25495g + eVar3.f25494f, ((e) eVar4.f25499l.get(0)).f25495g - eVar4.f25494f, f13, i12);
                            fVar.d(iArr[0]);
                            this.f25514b.f25301e.f25517e.d(iArr[1]);
                        }
                        if (!eVar.f25491c || !eVar2.f25491c || !eVar3.f25491c || !eVar4.f25491c) {
                            return;
                        }
                        m(iArr, ((e) eVar.f25499l.get(0)).f25495g + eVar.f25494f, ((e) eVar2.f25499l.get(0)).f25495g - eVar2.f25494f, ((e) arrayList.get(0)).f25495g + eVar3.f25494f, ((e) eVar4.f25499l.get(0)).f25495g - eVar4.f25494f, f13, i12);
                        fVar.d(iArr[0]);
                        this.f25514b.f25301e.f25517e.d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!eVar.f25491c || !eVar2.f25491c) {
                            return;
                        }
                        float f14 = dVar3.W;
                        int i13 = ((e) eVar.f25499l.get(0)).f25495g + eVar.f25494f;
                        int i14 = ((e) eVar2.f25499l.get(0)).f25495g - eVar2.f25494f;
                        if (i12 == -1 || i12 == 0) {
                            int g10 = g(i14 - i13, 0);
                            int i15 = (int) ((g10 * f14) + 0.5f);
                            int g11 = g(i15, 1);
                            if (i15 != g11) {
                                g10 = (int) ((g11 / f14) + 0.5f);
                            }
                            fVar.d(g10);
                            this.f25514b.f25301e.f25517e.d(g11);
                        } else if (i12 == 1) {
                            int g12 = g(i14 - i13, 0);
                            int i16 = (int) ((g12 / f14) + 0.5f);
                            int g13 = g(i16, 1);
                            if (i16 != g13) {
                                g12 = (int) ((g13 * f14) + 0.5f);
                            }
                            fVar.d(g12);
                            this.f25514b.f25301e.f25517e.d(g13);
                        }
                    } else if (z11 && z13) {
                        if (!eVar3.f25491c || !eVar4.f25491c) {
                            return;
                        }
                        float f15 = dVar3.W;
                        int i17 = ((e) eVar3.f25499l.get(0)).f25495g + eVar3.f25494f;
                        int i18 = ((e) eVar4.f25499l.get(0)).f25495g - eVar4.f25494f;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                int g14 = g(i18 - i17, 1);
                                int i19 = (int) ((g14 * f15) + 0.5f);
                                int g15 = g(i19, 0);
                                if (i19 != g15) {
                                    g14 = (int) ((g15 / f15) + 0.5f);
                                }
                                fVar.d(g15);
                                this.f25514b.f25301e.f25517e.d(g14);
                            }
                        }
                        int g16 = g(i18 - i17, 1);
                        int i20 = (int) ((g16 / f15) + 0.5f);
                        int g17 = g(i20, 0);
                        if (i20 != g17) {
                            g16 = (int) ((g17 * f15) + 0.5f);
                        }
                        fVar.d(g17);
                        this.f25514b.f25301e.f25517e.d(g16);
                    }
                } else {
                    int i21 = dVar3.X;
                    if (i21 == -1) {
                        f10 = dVar3.f25301e.f25517e.f25495g;
                        f11 = dVar3.W;
                    } else if (i21 == 0) {
                        f12 = dVar3.f25301e.f25517e.f25495g / dVar3.W;
                        i5 = (int) (f12 + 0.5f);
                        fVar.d(i5);
                    } else if (i21 != 1) {
                        i5 = 0;
                        fVar.d(i5);
                    } else {
                        f10 = dVar3.f25301e.f25517e.f25495g;
                        f11 = dVar3.W;
                    }
                    f12 = f10 * f11;
                    i5 = (int) (f12 + 0.5f);
                    fVar.d(i5);
                }
            }
            z5 = eVar.f25491c;
            ArrayList arrayList2 = eVar.f25499l;
            if (z5) {
                return;
            }
            boolean z15 = eVar2.f25491c;
            ArrayList arrayList3 = eVar2.f25499l;
            if (z15) {
                if (eVar.j && eVar2.j && fVar.j) {
                    return;
                }
                if (!fVar.j && this.f25516d == 3) {
                    x.d dVar5 = this.f25514b;
                    if (dVar5.f25321r == 0 && !dVar5.x()) {
                        e eVar5 = (e) arrayList2.get(0);
                        e eVar6 = (e) arrayList3.get(0);
                        int i22 = eVar5.f25495g + eVar.f25494f;
                        int i23 = eVar6.f25495g + eVar2.f25494f;
                        eVar.d(i22);
                        eVar2.d(i23);
                        fVar.d(i23 - i22);
                        return;
                    }
                }
                if (!fVar.j && this.f25516d == 3 && this.f25513a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((e) arrayList3.get(0)).f25495g + eVar2.f25494f) - (((e) arrayList2.get(0)).f25495g + eVar.f25494f), fVar.f25500m);
                    x.d dVar6 = this.f25514b;
                    int i24 = dVar6.f25325v;
                    int max = Math.max(dVar6.f25324u, min);
                    if (i24 > 0) {
                        max = Math.min(i24, max);
                    }
                    fVar.d(max);
                }
                if (fVar.j) {
                    e eVar7 = (e) arrayList2.get(0);
                    e eVar8 = (e) arrayList3.get(0);
                    int i25 = eVar7.f25495g;
                    int i26 = eVar.f25494f + i25;
                    int i27 = eVar8.f25495g;
                    int i28 = eVar2.f25494f + i27;
                    float f16 = this.f25514b.f25300d0;
                    if (eVar7 == eVar8) {
                        f16 = f6;
                    } else {
                        i25 = i26;
                        i27 = i28;
                    }
                    eVar.d((int) ((((i27 - i25) - fVar.f25495g) * f16) + i25 + f6));
                    eVar2.d(eVar.f25495g + fVar.f25495g);
                    return;
                }
                return;
            }
            return;
        }
        f6 = 0.5f;
        z5 = eVar.f25491c;
        ArrayList arrayList22 = eVar.f25499l;
        if (z5) {
        }
    }

    @Override // y.n
    public final void d() {
        x.d dVar;
        x.d dVar2;
        int i5;
        x.d dVar3;
        x.d dVar4;
        int i10;
        x.d dVar5 = this.f25514b;
        boolean z5 = dVar5.f25293a;
        f fVar = this.f25517e;
        if (z5) {
            fVar.d(dVar5.q());
        }
        boolean z7 = fVar.j;
        ArrayList arrayList = fVar.f25498k;
        ArrayList arrayList2 = fVar.f25499l;
        e eVar = this.f25521i;
        e eVar2 = this.f25520h;
        if (!z7) {
            x.d dVar6 = this.f25514b;
            int i11 = dVar6.f25320p0[0];
            this.f25516d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.T) != null && ((i10 = dVar4.f25320p0[0]) == 1 || i10 == 4)) {
                    int q = (dVar4.q() - this.f25514b.I.e()) - this.f25514b.K.e();
                    n.b(eVar2, dVar4.f25299d.f25520h, this.f25514b.I.e());
                    n.b(eVar, dVar4.f25299d.f25521i, -this.f25514b.K.e());
                    fVar.d(q);
                    return;
                }
                if (i11 == 1) {
                    fVar.d(dVar6.q());
                }
            }
        } else if (this.f25516d == 4 && (dVar2 = (dVar = this.f25514b).T) != null && ((i5 = dVar2.f25320p0[0]) == 1 || i5 == 4)) {
            n.b(eVar2, dVar2.f25299d.f25520h, dVar.I.e());
            n.b(eVar, dVar2.f25299d.f25521i, -this.f25514b.K.e());
            return;
        }
        if (fVar.j) {
            x.d dVar7 = this.f25514b;
            if (dVar7.f25293a) {
                x.c[] cVarArr = dVar7.Q;
                x.c cVar = cVarArr[0];
                x.c cVar2 = cVar.f25289f;
                if (cVar2 != null && cVarArr[1].f25289f != null) {
                    if (dVar7.x()) {
                        eVar2.f25494f = this.f25514b.Q[0].e();
                        eVar.f25494f = -this.f25514b.Q[1].e();
                        return;
                    }
                    e h10 = n.h(this.f25514b.Q[0]);
                    if (h10 != null) {
                        n.b(eVar2, h10, this.f25514b.Q[0].e());
                    }
                    e h11 = n.h(this.f25514b.Q[1]);
                    if (h11 != null) {
                        n.b(eVar, h11, -this.f25514b.Q[1].e());
                    }
                    eVar2.f25490b = true;
                    eVar.f25490b = true;
                    return;
                }
                if (cVar2 != null) {
                    e h12 = n.h(cVar);
                    if (h12 != null) {
                        n.b(eVar2, h12, this.f25514b.Q[0].e());
                        n.b(eVar, eVar2, fVar.f25495g);
                        return;
                    }
                    return;
                }
                x.c cVar3 = cVarArr[1];
                if (cVar3.f25289f != null) {
                    e h13 = n.h(cVar3);
                    if (h13 != null) {
                        n.b(eVar, h13, -this.f25514b.Q[1].e());
                        n.b(eVar2, eVar, -fVar.f25495g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof x.i) || dVar7.T == null || dVar7.i(7).f25289f != null) {
                    return;
                }
                x.d dVar8 = this.f25514b;
                n.b(eVar2, dVar8.T.f25299d.f25520h, dVar8.r());
                n.b(eVar, eVar2, fVar.f25495g);
                return;
            }
        }
        if (this.f25516d == 3) {
            x.d dVar9 = this.f25514b;
            int i12 = dVar9.f25321r;
            if (i12 == 2) {
                x.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    f fVar2 = dVar10.f25301e.f25517e;
                    arrayList2.add(fVar2);
                    fVar2.f25498k.add(fVar);
                    fVar.f25490b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f25322s == 3) {
                    eVar2.f25489a = this;
                    eVar.f25489a = this;
                    l lVar = dVar9.f25301e;
                    lVar.f25520h.f25489a = this;
                    lVar.f25521i.f25489a = this;
                    fVar.f25489a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f25514b.f25301e.f25517e);
                        this.f25514b.f25301e.f25517e.f25498k.add(fVar);
                        l lVar2 = this.f25514b.f25301e;
                        lVar2.f25517e.f25489a = this;
                        arrayList2.add(lVar2.f25520h);
                        arrayList2.add(this.f25514b.f25301e.f25521i);
                        this.f25514b.f25301e.f25520h.f25498k.add(fVar);
                        this.f25514b.f25301e.f25521i.f25498k.add(fVar);
                    } else if (this.f25514b.x()) {
                        this.f25514b.f25301e.f25517e.f25499l.add(fVar);
                        arrayList.add(this.f25514b.f25301e.f25517e);
                    } else {
                        this.f25514b.f25301e.f25517e.f25499l.add(fVar);
                    }
                } else {
                    f fVar3 = dVar9.f25301e.f25517e;
                    arrayList2.add(fVar3);
                    fVar3.f25498k.add(fVar);
                    this.f25514b.f25301e.f25520h.f25498k.add(fVar);
                    this.f25514b.f25301e.f25521i.f25498k.add(fVar);
                    fVar.f25490b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                    eVar2.f25499l.add(fVar);
                    eVar.f25499l.add(fVar);
                }
            }
        }
        x.d dVar11 = this.f25514b;
        x.c[] cVarArr2 = dVar11.Q;
        x.c cVar4 = cVarArr2[0];
        x.c cVar5 = cVar4.f25289f;
        if (cVar5 != null && cVarArr2[1].f25289f != null) {
            if (dVar11.x()) {
                eVar2.f25494f = this.f25514b.Q[0].e();
                eVar.f25494f = -this.f25514b.Q[1].e();
                return;
            }
            e h14 = n.h(this.f25514b.Q[0]);
            e h15 = n.h(this.f25514b.Q[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            e h16 = n.h(cVar4);
            if (h16 != null) {
                n.b(eVar2, h16, this.f25514b.Q[0].e());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        x.c cVar6 = cVarArr2[1];
        if (cVar6.f25289f != null) {
            e h17 = n.h(cVar6);
            if (h17 != null) {
                n.b(eVar, h17, -this.f25514b.Q[1].e());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof x.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        n.b(eVar2, dVar3.f25299d.f25520h, dVar11.r());
        c(eVar, eVar2, 1, fVar);
    }

    @Override // y.n
    public final void e() {
        e eVar = this.f25520h;
        if (eVar.j) {
            this.f25514b.Y = eVar.f25495g;
        }
    }

    @Override // y.n
    public final void f() {
        this.f25515c = null;
        this.f25520h.c();
        this.f25521i.c();
        this.f25517e.c();
        this.f25519g = false;
    }

    @Override // y.n
    public final boolean k() {
        return this.f25516d != 3 || this.f25514b.f25321r == 0;
    }

    public final void n() {
        this.f25519g = false;
        e eVar = this.f25520h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f25521i;
        eVar2.c();
        eVar2.j = false;
        this.f25517e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f25514b.f25307h0;
    }
}
