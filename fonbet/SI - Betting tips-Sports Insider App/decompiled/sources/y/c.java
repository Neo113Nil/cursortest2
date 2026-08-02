package y;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f25487k;

    /* renamed from: l, reason: collision with root package name */
    public int f25488l;

    public c(x.d dVar, int i5) {
        super(dVar);
        x.d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f25487k = arrayList;
        this.f25518f = i5;
        x.d dVar3 = this.f25514b;
        x.d m6 = dVar3.m(i5);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m6;
            if (dVar3 == null) {
                break;
            } else {
                m6 = dVar3.m(this.f25518f);
            }
        }
        this.f25514b = dVar2;
        int i10 = this.f25518f;
        arrayList.add(i10 == 0 ? dVar2.f25299d : i10 == 1 ? dVar2.f25301e : null);
        x.d l6 = dVar2.l(this.f25518f);
        while (l6 != null) {
            int i11 = this.f25518f;
            arrayList.add(i11 == 0 ? l6.f25299d : i11 == 1 ? l6.f25301e : null);
            l6 = l6.l(this.f25518f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            int i12 = this.f25518f;
            if (i12 == 0) {
                nVar.f25514b.f25295b = this;
            } else if (i12 == 1) {
                nVar.f25514b.f25297c = this;
            }
        }
        if (this.f25518f == 0 && ((x.e) this.f25514b.T).f25335v0 && arrayList.size() > 1) {
            this.f25514b = ((n) arrayList.get(arrayList.size() - 1)).f25514b;
        }
        this.f25488l = this.f25518f == 0 ? this.f25514b.f25309i0 : this.f25514b.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i5;
        int i10;
        boolean z5;
        float f6;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z7;
        int i21;
        e eVar = this.f25520h;
        if (eVar.j) {
            e eVar2 = this.f25521i;
            if (eVar2.j) {
                x.d dVar2 = this.f25514b.T;
                boolean z10 = dVar2 instanceof x.e ? ((x.e) dVar2).f25335v0 : false;
                int i22 = eVar2.f25495g - eVar.f25495g;
                ArrayList arrayList = this.f25487k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i5 = -1;
                    i10 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (((n) arrayList.get(i23)).f25514b.f25305g0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                int i25 = i24;
                while (true) {
                    if (i25 < 0) {
                        break;
                    }
                    if (((n) arrayList.get(i25)).f25514b.f25305g0 != 8) {
                        i5 = i25;
                        break;
                    }
                    i25--;
                }
                int i26 = 0;
                while (i26 < 2) {
                    f6 = 0.0f;
                    int i27 = 0;
                    i13 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i27 < size) {
                        n nVar = (n) arrayList.get(i27);
                        x.d dVar3 = nVar.f25514b;
                        boolean z11 = z10;
                        if (dVar3.f25305g0 == i10) {
                            i20 = i26;
                        } else {
                            i29++;
                            if (i27 > 0 && i27 >= i23) {
                                i13 += nVar.f25520h.f25494f;
                            }
                            f fVar = nVar.f25517e;
                            int i30 = fVar.f25495g;
                            i20 = i26;
                            boolean z12 = nVar.f25516d != 3;
                            if (z12) {
                                int i31 = this.f25518f;
                                if (i31 == 0 && !dVar3.f25299d.f25517e.j) {
                                    return;
                                }
                                if (i31 == 1 && !dVar3.f25301e.f25517e.j) {
                                    return;
                                } else {
                                    z7 = z12;
                                }
                            } else {
                                z7 = z12;
                                if (nVar.f25513a == 1 && i20 == 0) {
                                    i21 = fVar.f25500m;
                                    i28++;
                                } else if (fVar.j) {
                                    i21 = i30;
                                }
                                z7 = true;
                                if (z7) {
                                    i28++;
                                    float f11 = dVar3.k0[this.f25518f];
                                    if (f11 >= 0.0f) {
                                        f6 += f11;
                                    }
                                } else {
                                    i13 += i21;
                                }
                                if (i27 < i24 && i27 < i5) {
                                    i13 += -nVar.f25521i.f25494f;
                                }
                            }
                            i21 = i30;
                            if (z7) {
                            }
                            if (i27 < i24) {
                                i13 += -nVar.f25521i.f25494f;
                            }
                        }
                        i27++;
                        z10 = z11;
                        i26 = i20;
                        i10 = 8;
                    }
                    z5 = z10;
                    int i32 = i26;
                    if (i13 < i22 || i28 == 0) {
                        i11 = i28;
                        i12 = i29;
                        break;
                    } else {
                        i26 = i32 + 1;
                        z10 = z5;
                        i10 = 8;
                    }
                }
                z5 = z10;
                f6 = 0.0f;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                int i33 = eVar.f25495g;
                if (z5) {
                    i33 = eVar2.f25495g;
                }
                float f12 = 0.5f;
                if (i13 > i22) {
                    i33 = z5 ? i33 + ((int) (((i13 - i22) / 2.0f) + 0.5f)) : i33 - ((int) (((i13 - i22) / 2.0f) + 0.5f));
                }
                if (i11 > 0) {
                    float f13 = i22 - i13;
                    int i34 = (int) ((f13 / i11) + 0.5f);
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < size) {
                        float f14 = f12;
                        n nVar2 = (n) arrayList.get(i35);
                        int i37 = i33;
                        x.d dVar4 = nVar2.f25514b;
                        int i38 = i11;
                        f fVar2 = nVar2.f25517e;
                        float f15 = f13;
                        int i39 = i34;
                        if (dVar4.f25305g0 == 8 || nVar2.f25516d != 3 || fVar2.j) {
                            i19 = i35;
                        } else {
                            int i40 = f6 > 0.0f ? (int) (((dVar4.k0[this.f25518f] * f15) / f6) + f14) : i39;
                            if (this.f25518f == 0) {
                                i17 = dVar4.f25325v;
                                i18 = dVar4.f25324u;
                            } else {
                                i17 = dVar4.f25328y;
                                i18 = dVar4.f25327x;
                            }
                            i19 = i35;
                            int max = Math.max(i18, nVar2.f25513a == 1 ? Math.min(i40, fVar2.f25500m) : i40);
                            if (i17 > 0) {
                                max = Math.min(i17, max);
                            }
                            if (max != i40) {
                                i36++;
                                i40 = max;
                            }
                            fVar2.d(i40);
                        }
                        i35 = i19 + 1;
                        i33 = i37;
                        f12 = f14;
                        i11 = i38;
                        f13 = f15;
                        i34 = i39;
                    }
                    i14 = i33;
                    f10 = f12;
                    int i41 = i11;
                    if (i36 > 0) {
                        i11 = i41 - i36;
                        i13 = 0;
                        for (int i42 = 0; i42 < size; i42++) {
                            n nVar3 = (n) arrayList.get(i42);
                            if (nVar3.f25514b.f25305g0 != 8) {
                                if (i42 > 0 && i42 >= i23) {
                                    i13 += nVar3.f25520h.f25494f;
                                }
                                i13 += nVar3.f25517e.f25495g;
                                if (i42 < i24 && i42 < i5) {
                                    i13 += -nVar3.f25521i.f25494f;
                                }
                            }
                        }
                    } else {
                        i11 = i41;
                    }
                    i16 = 2;
                    if (this.f25488l == 2 && i36 == 0) {
                        i15 = 0;
                        this.f25488l = 0;
                    } else {
                        i15 = 0;
                    }
                } else {
                    i14 = i33;
                    f10 = 0.5f;
                    i15 = 0;
                    i16 = 2;
                }
                if (i13 > i22) {
                    this.f25488l = i16;
                }
                if (i12 > 0 && i11 == 0 && i23 == i5) {
                    this.f25488l = i16;
                }
                int i43 = this.f25488l;
                if (i43 == 1) {
                    int i44 = i12 > 1 ? (i22 - i13) / (i12 - 1) : i12 == 1 ? (i22 - i13) / 2 : i15;
                    if (i11 > 0) {
                        i44 = i15;
                    }
                    int i45 = i14;
                    for (int i46 = i15; i46 < size; i46++) {
                        n nVar4 = (n) arrayList.get(z5 ? size - (i46 + 1) : i46);
                        x.d dVar5 = nVar4.f25514b;
                        e eVar3 = nVar4.f25521i;
                        e eVar4 = nVar4.f25520h;
                        if (dVar5.f25305g0 == 8) {
                            eVar4.d(i45);
                            eVar3.d(i45);
                        } else {
                            if (i46 > 0) {
                                i45 = z5 ? i45 - i44 : i45 + i44;
                            }
                            if (i46 > 0 && i46 >= i23) {
                                i45 = z5 ? i45 - eVar4.f25494f : i45 + eVar4.f25494f;
                            }
                            if (z5) {
                                eVar3.d(i45);
                            } else {
                                eVar4.d(i45);
                            }
                            f fVar3 = nVar4.f25517e;
                            int i47 = fVar3.f25495g;
                            if (nVar4.f25516d == 3 && nVar4.f25513a == 1) {
                                i47 = fVar3.f25500m;
                            }
                            i45 = z5 ? i45 - i47 : i45 + i47;
                            if (z5) {
                                eVar4.d(i45);
                            } else {
                                eVar3.d(i45);
                            }
                            nVar4.f25519g = true;
                            if (i46 < i24 && i46 < i5) {
                                i45 = z5 ? i45 - (-eVar3.f25494f) : i45 + (-eVar3.f25494f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 0) {
                    int i48 = (i22 - i13) / (i12 + 1);
                    if (i11 > 0) {
                        i48 = i15;
                    }
                    int i49 = i14;
                    for (int i50 = i15; i50 < size; i50++) {
                        n nVar5 = (n) arrayList.get(z5 ? size - (i50 + 1) : i50);
                        x.d dVar6 = nVar5.f25514b;
                        e eVar5 = nVar5.f25521i;
                        e eVar6 = nVar5.f25520h;
                        if (dVar6.f25305g0 == 8) {
                            eVar6.d(i49);
                            eVar5.d(i49);
                        } else {
                            int i51 = z5 ? i49 - i48 : i49 + i48;
                            if (i50 > 0 && i50 >= i23) {
                                i51 = z5 ? i51 - eVar6.f25494f : i51 + eVar6.f25494f;
                            }
                            if (z5) {
                                eVar5.d(i51);
                            } else {
                                eVar6.d(i51);
                            }
                            f fVar4 = nVar5.f25517e;
                            int i52 = fVar4.f25495g;
                            if (nVar5.f25516d == 3 && nVar5.f25513a == 1) {
                                i52 = Math.min(i52, fVar4.f25500m);
                            }
                            i49 = z5 ? i51 - i52 : i51 + i52;
                            if (z5) {
                                eVar6.d(i49);
                            } else {
                                eVar5.d(i49);
                            }
                            if (i50 < i24 && i50 < i5) {
                                i49 = z5 ? i49 - (-eVar5.f25494f) : i49 + (-eVar5.f25494f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 2) {
                    float f16 = this.f25518f == 0 ? this.f25514b.f25300d0 : this.f25514b.e0;
                    if (z5) {
                        f16 = 1.0f - f16;
                    }
                    int i53 = (int) (((i22 - i13) * f16) + f10);
                    if (i53 < 0 || i11 > 0) {
                        i53 = i15;
                    }
                    int i54 = z5 ? i14 - i53 : i14 + i53;
                    for (int i55 = i15; i55 < size; i55++) {
                        n nVar6 = (n) arrayList.get(z5 ? size - (i55 + 1) : i55);
                        x.d dVar7 = nVar6.f25514b;
                        e eVar7 = nVar6.f25521i;
                        e eVar8 = nVar6.f25520h;
                        if (dVar7.f25305g0 == 8) {
                            eVar8.d(i54);
                            eVar7.d(i54);
                        } else {
                            if (i55 > 0 && i55 >= i23) {
                                i54 = z5 ? i54 - eVar8.f25494f : i54 + eVar8.f25494f;
                            }
                            if (z5) {
                                eVar7.d(i54);
                            } else {
                                eVar8.d(i54);
                            }
                            f fVar5 = nVar6.f25517e;
                            int i56 = fVar5.f25495g;
                            if (nVar6.f25516d == 3 && nVar6.f25513a == 1) {
                                i56 = fVar5.f25500m;
                            }
                            i54 += i56;
                            if (z5) {
                                eVar8.d(i54);
                            } else {
                                eVar7.d(i54);
                            }
                            if (i55 < i24 && i55 < i5) {
                                i54 = z5 ? i54 - (-eVar7.f25494f) : i54 + (-eVar7.f25494f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // y.n
    public final void d() {
        ArrayList arrayList = this.f25487k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        x.d dVar = ((n) arrayList.get(0)).f25514b;
        x.d dVar2 = ((n) arrayList.get(size - 1)).f25514b;
        int i5 = this.f25518f;
        e eVar = this.f25521i;
        e eVar2 = this.f25520h;
        if (i5 == 0) {
            x.c cVar = dVar.I;
            x.c cVar2 = dVar2.K;
            e i10 = n.i(cVar, 0);
            int e7 = cVar.e();
            x.d m6 = m();
            if (m6 != null) {
                e7 = m6.I.e();
            }
            if (i10 != null) {
                n.b(eVar2, i10, e7);
            }
            e i11 = n.i(cVar2, 0);
            int e9 = cVar2.e();
            x.d n9 = n();
            if (n9 != null) {
                e9 = n9.K.e();
            }
            if (i11 != null) {
                n.b(eVar, i11, -e9);
            }
        } else {
            x.c cVar3 = dVar.J;
            x.c cVar4 = dVar2.L;
            e i12 = n.i(cVar3, 1);
            int e10 = cVar3.e();
            x.d m10 = m();
            if (m10 != null) {
                e10 = m10.J.e();
            }
            if (i12 != null) {
                n.b(eVar2, i12, e10);
            }
            e i13 = n.i(cVar4, 1);
            int e11 = cVar4.e();
            x.d n10 = n();
            if (n10 != null) {
                e11 = n10.L.e();
            }
            if (i13 != null) {
                n.b(eVar, i13, -e11);
            }
        }
        eVar2.f25489a = this;
        eVar.f25489a = this;
    }

    @Override // y.n
    public final void e() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f25487k;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i5)).e();
            i5++;
        }
    }

    @Override // y.n
    public final void f() {
        this.f25515c = null;
        Iterator it = this.f25487k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // y.n
    public final long j() {
        ArrayList arrayList = this.f25487k;
        int size = arrayList.size();
        long j = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j = r5.f25521i.f25494f + ((n) arrayList.get(i5)).j() + j + r5.f25520h.f25494f;
        }
        return j;
    }

    @Override // y.n
    public final boolean k() {
        ArrayList arrayList = this.f25487k;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!((n) arrayList.get(i5)).k()) {
                return false;
            }
        }
        return true;
    }

    public final x.d m() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f25487k;
            if (i5 >= arrayList.size()) {
                return null;
            }
            x.d dVar = ((n) arrayList.get(i5)).f25514b;
            if (dVar.f25305g0 != 8) {
                return dVar;
            }
            i5++;
        }
    }

    public final x.d n() {
        ArrayList arrayList = this.f25487k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x.d dVar = ((n) arrayList.get(size)).f25514b;
            if (dVar.f25305g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f25518f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f25487k.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            sb2.append("<");
            sb2.append(nVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
