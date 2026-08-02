package y;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: k, reason: collision with root package name */
    public e f25505k;

    /* renamed from: l, reason: collision with root package name */
    public a f25506l;

    @Override // y.d
    public final void a(d dVar) {
        float f6;
        float f10;
        float f11;
        int i5;
        if (v.f.d(this.j) == 3) {
            x.d dVar2 = this.f25514b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        f fVar = this.f25517e;
        if (fVar.f25491c && !fVar.j && this.f25516d == 3) {
            x.d dVar3 = this.f25514b;
            int i10 = dVar3.f25322s;
            if (i10 == 2) {
                x.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f25301e.f25517e.j) {
                        fVar.d((int) ((r5.f25495g * dVar3.f25329z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                f fVar2 = dVar3.f25299d.f25517e;
                if (fVar2.j) {
                    int i11 = dVar3.X;
                    if (i11 == -1) {
                        f6 = fVar2.f25495g;
                        f10 = dVar3.W;
                    } else if (i11 == 0) {
                        f11 = fVar2.f25495g * dVar3.W;
                        i5 = (int) (f11 + 0.5f);
                        fVar.d(i5);
                    } else if (i11 != 1) {
                        i5 = 0;
                        fVar.d(i5);
                    } else {
                        f6 = fVar2.f25495g;
                        f10 = dVar3.W;
                    }
                    f11 = f6 / f10;
                    i5 = (int) (f11 + 0.5f);
                    fVar.d(i5);
                }
            }
        }
        e eVar = this.f25520h;
        boolean z5 = eVar.f25491c;
        ArrayList arrayList = eVar.f25499l;
        if (z5) {
            e eVar2 = this.f25521i;
            boolean z7 = eVar2.f25491c;
            ArrayList arrayList2 = eVar2.f25499l;
            if (z7) {
                if (eVar.j && eVar2.j && fVar.j) {
                    return;
                }
                if (!fVar.j && this.f25516d == 3) {
                    x.d dVar5 = this.f25514b;
                    if (dVar5.f25321r == 0 && !dVar5.y()) {
                        e eVar3 = (e) arrayList.get(0);
                        e eVar4 = (e) arrayList2.get(0);
                        int i12 = eVar3.f25495g + eVar.f25494f;
                        int i13 = eVar4.f25495g + eVar2.f25494f;
                        eVar.d(i12);
                        eVar2.d(i13);
                        fVar.d(i13 - i12);
                        return;
                    }
                }
                if (!fVar.j && this.f25516d == 3 && this.f25513a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar5 = (e) arrayList.get(0);
                    int i14 = (((e) arrayList2.get(0)).f25495g + eVar2.f25494f) - (eVar5.f25495g + eVar.f25494f);
                    int i15 = fVar.f25500m;
                    if (i14 < i15) {
                        fVar.d(i14);
                    } else {
                        fVar.d(i15);
                    }
                }
                if (fVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar6 = (e) arrayList.get(0);
                    e eVar7 = (e) arrayList2.get(0);
                    int i16 = eVar6.f25495g;
                    int i17 = eVar.f25494f + i16;
                    int i18 = eVar7.f25495g;
                    int i19 = eVar2.f25494f + i18;
                    float f12 = this.f25514b.e0;
                    if (eVar6 == eVar7) {
                        f12 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    eVar.d((int) ((((i18 - i16) - fVar.f25495g) * f12) + i16 + 0.5f));
                    eVar2.d(eVar.f25495g + fVar.f25495g);
                }
            }
        }
    }

    @Override // y.n
    public final void d() {
        x.d dVar;
        x.d dVar2;
        x.d dVar3;
        x.d dVar4;
        e eVar = this.f25505k;
        x.d dVar5 = this.f25514b;
        boolean z5 = dVar5.f25293a;
        f fVar = this.f25517e;
        if (z5) {
            fVar.d(dVar5.k());
        }
        boolean z7 = fVar.j;
        ArrayList arrayList = fVar.f25498k;
        ArrayList arrayList2 = fVar.f25499l;
        e eVar2 = this.f25521i;
        e eVar3 = this.f25520h;
        if (!z7) {
            x.d dVar6 = this.f25514b;
            this.f25516d = dVar6.f25320p0[1];
            if (dVar6.E) {
                this.f25506l = new a(this);
            }
            int i5 = this.f25516d;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = this.f25514b.T) != null && dVar4.f25320p0[1] == 1) {
                    int k6 = (dVar4.k() - this.f25514b.J.e()) - this.f25514b.L.e();
                    n.b(eVar3, dVar4.f25301e.f25520h, this.f25514b.J.e());
                    n.b(eVar2, dVar4.f25301e.f25521i, -this.f25514b.L.e());
                    fVar.d(k6);
                    return;
                }
                if (i5 == 1) {
                    fVar.d(this.f25514b.k());
                }
            }
        } else if (this.f25516d == 4 && (dVar2 = (dVar = this.f25514b).T) != null && dVar2.f25320p0[1] == 1) {
            n.b(eVar3, dVar2.f25301e.f25520h, dVar.J.e());
            n.b(eVar2, dVar2.f25301e.f25521i, -this.f25514b.L.e());
            return;
        }
        boolean z10 = fVar.j;
        if (z10) {
            x.d dVar7 = this.f25514b;
            if (dVar7.f25293a) {
                x.c[] cVarArr = dVar7.Q;
                x.c cVar = cVarArr[2];
                x.c cVar2 = cVar.f25289f;
                if (cVar2 != null && cVarArr[3].f25289f != null) {
                    if (dVar7.y()) {
                        eVar3.f25494f = this.f25514b.Q[2].e();
                        eVar2.f25494f = -this.f25514b.Q[3].e();
                    } else {
                        e h10 = n.h(this.f25514b.Q[2]);
                        if (h10 != null) {
                            n.b(eVar3, h10, this.f25514b.Q[2].e());
                        }
                        e h11 = n.h(this.f25514b.Q[3]);
                        if (h11 != null) {
                            n.b(eVar2, h11, -this.f25514b.Q[3].e());
                        }
                        eVar3.f25490b = true;
                        eVar2.f25490b = true;
                    }
                    x.d dVar8 = this.f25514b;
                    if (dVar8.E) {
                        n.b(eVar, eVar3, dVar8.f25294a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e h12 = n.h(cVar);
                    if (h12 != null) {
                        n.b(eVar3, h12, this.f25514b.Q[2].e());
                        n.b(eVar2, eVar3, fVar.f25495g);
                        x.d dVar9 = this.f25514b;
                        if (dVar9.E) {
                            n.b(eVar, eVar3, dVar9.f25294a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                x.c cVar3 = cVarArr[3];
                if (cVar3.f25289f != null) {
                    e h13 = n.h(cVar3);
                    if (h13 != null) {
                        n.b(eVar2, h13, -this.f25514b.Q[3].e());
                        n.b(eVar3, eVar2, -fVar.f25495g);
                    }
                    x.d dVar10 = this.f25514b;
                    if (dVar10.E) {
                        n.b(eVar, eVar3, dVar10.f25294a0);
                        return;
                    }
                    return;
                }
                x.c cVar4 = cVarArr[4];
                if (cVar4.f25289f != null) {
                    e h14 = n.h(cVar4);
                    if (h14 != null) {
                        n.b(eVar, h14, 0);
                        n.b(eVar3, eVar, -this.f25514b.f25294a0);
                        n.b(eVar2, eVar3, fVar.f25495g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof x.i) || dVar7.T == null || dVar7.i(7).f25289f != null) {
                    return;
                }
                x.d dVar11 = this.f25514b;
                n.b(eVar3, dVar11.T.f25301e.f25520h, dVar11.s());
                n.b(eVar2, eVar3, fVar.f25495g);
                x.d dVar12 = this.f25514b;
                if (dVar12.E) {
                    n.b(eVar, eVar3, dVar12.f25294a0);
                    return;
                }
                return;
            }
        }
        if (z10 || this.f25516d != 3) {
            fVar.b(this);
        } else {
            x.d dVar13 = this.f25514b;
            int i10 = dVar13.f25322s;
            if (i10 == 2) {
                x.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    f fVar2 = dVar14.f25301e.f25517e;
                    arrayList2.add(fVar2);
                    fVar2.f25498k.add(fVar);
                    fVar.f25490b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                x.d dVar15 = this.f25514b;
                if (dVar15.f25321r != 3) {
                    f fVar3 = dVar15.f25299d.f25517e;
                    arrayList2.add(fVar3);
                    fVar3.f25498k.add(fVar);
                    fVar.f25490b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            }
        }
        x.d dVar16 = this.f25514b;
        x.c[] cVarArr2 = dVar16.Q;
        x.c cVar5 = cVarArr2[2];
        x.c cVar6 = cVar5.f25289f;
        if (cVar6 != null && cVarArr2[3].f25289f != null) {
            if (dVar16.y()) {
                eVar3.f25494f = this.f25514b.Q[2].e();
                eVar2.f25494f = -this.f25514b.Q[3].e();
            } else {
                e h15 = n.h(this.f25514b.Q[2]);
                e h16 = n.h(this.f25514b.Q[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.j = 4;
            }
            if (this.f25514b.E) {
                c(eVar, eVar3, 1, this.f25506l);
            }
        } else if (cVar6 != null) {
            e h17 = n.h(cVar5);
            if (h17 != null) {
                n.b(eVar3, h17, this.f25514b.Q[2].e());
                c(eVar2, eVar3, 1, fVar);
                if (this.f25514b.E) {
                    c(eVar, eVar3, 1, this.f25506l);
                }
                if (this.f25516d == 3) {
                    x.d dVar17 = this.f25514b;
                    if (dVar17.W > 0.0f) {
                        j jVar = dVar17.f25299d;
                        if (jVar.f25516d == 3) {
                            jVar.f25517e.f25498k.add(fVar);
                            arrayList2.add(this.f25514b.f25299d.f25517e);
                            fVar.f25489a = this;
                        }
                    }
                }
            }
        } else {
            x.c cVar7 = cVarArr2[3];
            if (cVar7.f25289f != null) {
                e h18 = n.h(cVar7);
                if (h18 != null) {
                    n.b(eVar2, h18, -this.f25514b.Q[3].e());
                    c(eVar3, eVar2, -1, fVar);
                    if (this.f25514b.E) {
                        c(eVar, eVar3, 1, this.f25506l);
                    }
                }
            } else {
                x.c cVar8 = cVarArr2[4];
                if (cVar8.f25289f != null) {
                    e h19 = n.h(cVar8);
                    if (h19 != null) {
                        n.b(eVar, h19, 0);
                        c(eVar3, eVar, -1, this.f25506l);
                        c(eVar2, eVar3, 1, fVar);
                    }
                } else if (!(dVar16 instanceof x.i) && (dVar3 = dVar16.T) != null) {
                    n.b(eVar3, dVar3.f25301e.f25520h, dVar16.s());
                    c(eVar2, eVar3, 1, fVar);
                    if (this.f25514b.E) {
                        c(eVar, eVar3, 1, this.f25506l);
                    }
                    if (this.f25516d == 3) {
                        x.d dVar18 = this.f25514b;
                        if (dVar18.W > 0.0f) {
                            j jVar2 = dVar18.f25299d;
                            if (jVar2.f25516d == 3) {
                                jVar2.f25517e.f25498k.add(fVar);
                                arrayList2.add(this.f25514b.f25299d.f25517e);
                                fVar.f25489a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            fVar.f25491c = true;
        }
    }

    @Override // y.n
    public final void e() {
        e eVar = this.f25520h;
        if (eVar.j) {
            this.f25514b.Z = eVar.f25495g;
        }
    }

    @Override // y.n
    public final void f() {
        this.f25515c = null;
        this.f25520h.c();
        this.f25521i.c();
        this.f25505k.c();
        this.f25517e.c();
        this.f25519g = false;
    }

    @Override // y.n
    public final boolean k() {
        return this.f25516d != 3 || this.f25514b.f25322s == 0;
    }

    public final void m() {
        this.f25519g = false;
        e eVar = this.f25520h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f25521i;
        eVar2.c();
        eVar2.j = false;
        e eVar3 = this.f25505k;
        eVar3.c();
        eVar3.j = false;
        this.f25517e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f25514b.f25307h0;
    }
}
