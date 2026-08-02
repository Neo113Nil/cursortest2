package n2;

import C.o0;
import java.util.ArrayList;
import java.util.Iterator;
import m2.e;

/* loaded from: classes8.dex */
public final class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f76306k;

    /* renamed from: l, reason: collision with root package name */
    private int f76307l;

    public c(m2.e eVar, int i11) {
        super(eVar);
        m2.e eVar2;
        this.f76306k = new ArrayList<>();
        this.f76348f = i11;
        m2.e eVar3 = this.f76344b;
        m2.e F11 = eVar3.F(i11);
        while (true) {
            m2.e eVar4 = F11;
            eVar2 = eVar3;
            eVar3 = eVar4;
            if (eVar3 == null) {
                break;
            } else {
                F11 = eVar3.F(this.f76348f);
            }
        }
        this.f76344b = eVar2;
        int i12 = this.f76348f;
        p pVar = i12 == 0 ? eVar2.f74126d : i12 == 1 ? eVar2.f74128e : null;
        ArrayList<p> arrayList = this.f76306k;
        arrayList.add(pVar);
        m2.e E11 = eVar2.E(this.f76348f);
        while (E11 != null) {
            int i13 = this.f76348f;
            arrayList.add(i13 == 0 ? E11.f74126d : i13 == 1 ? E11.f74128e : null);
            E11 = E11.E(this.f76348f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i14 = this.f76348f;
            if (i14 == 0) {
                next.f76344b.f74122b = this;
            } else if (i14 == 1) {
                next.f76344b.f74124c = this;
            }
        }
        if (this.f76348f == 0 && ((m2.f) this.f76344b.f74116W).l1() && arrayList.size() > 1) {
            this.f76344b = ((p) o0.b(1, arrayList)).f76344b;
        }
        this.f76307l = this.f76348f == 0 ? this.f76344b.x() : this.f76344b.L();
    }

    private m2.e n() {
        int i11 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f76306k;
            if (i11 >= arrayList.size()) {
                return null;
            }
            p pVar = arrayList.get(i11);
            if (pVar.f76344b.M() != 8) {
                return pVar.f76344b;
            }
            i11++;
        }
    }

    private m2.e o() {
        ArrayList<p> arrayList = this.f76306k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar = arrayList.get(size);
            if (pVar.f76344b.M() != 8) {
                return pVar.f76344b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03c4, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d0, code lost:
    
        if (r13.f76325j != false) goto L56;
     */
    @Override // n2.p, n2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i11;
        int i12;
        boolean z11;
        float f7;
        float f11;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        int i17;
        int i18;
        int i19;
        float f13;
        int i21;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        f fVar = this.f76350h;
        if (fVar.f76325j) {
            f fVar2 = this.f76351i;
            if (fVar2.f76325j) {
                m2.e eVar = this.f76344b.f74116W;
                boolean l12 = eVar instanceof m2.f ? ((m2.f) eVar).l1() : false;
                int i24 = fVar2.f76322g - fVar.f76322g;
                ArrayList<p> arrayList = this.f76306k;
                int size = arrayList.size();
                int i25 = 0;
                while (true) {
                    i11 = -1;
                    i12 = 8;
                    if (i25 >= size) {
                        i25 = -1;
                        break;
                    } else if (arrayList.get(i25).f76344b.M() != 8) {
                        break;
                    } else {
                        i25++;
                    }
                }
                int i26 = size - 1;
                int i27 = i26;
                while (true) {
                    if (i27 < 0) {
                        break;
                    }
                    if (arrayList.get(i27).f76344b.M() != 8) {
                        i11 = i27;
                        break;
                    }
                    i27--;
                }
                int i28 = 0;
                while (i28 < 2) {
                    f7 = 0.0f;
                    i14 = 0;
                    int i29 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    f11 = 0.0f;
                    while (i29 < size) {
                        p pVar = arrayList.get(i29);
                        if (pVar.f76344b.M() == i12) {
                            z12 = l12;
                        } else {
                            i32++;
                            if (i29 > 0 && i29 >= i25) {
                                i14 += pVar.f76350h.f76321f;
                            }
                            g gVar = pVar.f76347e;
                            int i33 = gVar.f76322g;
                            z12 = l12;
                            int i34 = i14;
                            boolean z14 = pVar.f76346d != e.b.MATCH_CONSTRAINT;
                            if (z14) {
                                int i35 = this.f76348f;
                                if (i35 == 0 && !pVar.f76344b.f74126d.f76347e.f76325j) {
                                    return;
                                }
                                if (i35 == 1 && !pVar.f76344b.f74128e.f76347e.f76325j) {
                                    return;
                                } else {
                                    z13 = z14;
                                }
                            } else {
                                z13 = z14;
                                if (pVar.f76343a == 1 && i28 == 0) {
                                    i33 = gVar.f76328m;
                                    i31++;
                                }
                                z13 = true;
                            }
                            if (z13) {
                                i14 = i34 + i33;
                            } else {
                                i31++;
                                float f14 = pVar.f76344b.f74149o0[this.f76348f];
                                if (f14 >= 0.0f) {
                                    f11 += f14;
                                }
                                i14 = i34;
                            }
                            if (i29 < i26 && i29 < i11) {
                                i14 += -pVar.f76351i.f76321f;
                            }
                        }
                        i29++;
                        l12 = z12;
                        i12 = 8;
                    }
                    z11 = l12;
                    if (i14 < i24 || i31 == 0) {
                        i13 = i31;
                        i15 = i32;
                        break;
                    } else {
                        i28++;
                        l12 = z11;
                        i12 = 8;
                    }
                }
                z11 = l12;
                f7 = 0.0f;
                f11 = 0.0f;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                int i36 = fVar.f76322g;
                if (z11) {
                    i36 = fVar2.f76322g;
                }
                float f15 = 0.5f;
                if (i14 > i24) {
                    i36 = z11 ? i36 + ((int) (((i14 - i24) / 2.0f) + 0.5f)) : i36 - ((int) (((i14 - i24) / 2.0f) + 0.5f));
                }
                if (i13 > 0) {
                    float f16 = i24 - i14;
                    int i37 = (int) ((f16 / i13) + 0.5f);
                    int i38 = 0;
                    int i39 = 0;
                    while (i38 < size) {
                        float f17 = f15;
                        p pVar2 = arrayList.get(i38);
                        int i41 = i36;
                        int i42 = i13;
                        if (pVar2.f76344b.M() != 8 && pVar2.f76346d == e.b.MATCH_CONSTRAINT) {
                            g gVar2 = pVar2.f76347e;
                            if (!gVar2.f76325j) {
                                int i43 = f11 > f7 ? (int) (((pVar2.f76344b.f74149o0[this.f76348f] * f16) / f11) + f17) : i37;
                                i19 = i14;
                                if (this.f76348f == 0) {
                                    m2.e eVar2 = pVar2.f76344b;
                                    f13 = f16;
                                    i21 = eVar2.f74163w;
                                    i22 = eVar2.f74162v;
                                } else {
                                    f13 = f16;
                                    m2.e eVar3 = pVar2.f76344b;
                                    i21 = eVar3.f74166z;
                                    i22 = eVar3.f74165y;
                                }
                                i23 = i37;
                                int max = Math.max(i22, pVar2.f76343a == 1 ? Math.min(i43, gVar2.f76328m) : i43);
                                if (i21 > 0) {
                                    max = Math.min(i21, max);
                                }
                                if (max != i43) {
                                    i39++;
                                    i43 = max;
                                }
                                gVar2.d(i43);
                                i38++;
                                i36 = i41;
                                f15 = f17;
                                i13 = i42;
                                i14 = i19;
                                f16 = f13;
                                i37 = i23;
                            }
                        }
                        i19 = i14;
                        f13 = f16;
                        i23 = i37;
                        i38++;
                        i36 = i41;
                        f15 = f17;
                        i13 = i42;
                        i14 = i19;
                        f16 = f13;
                        i37 = i23;
                    }
                    i16 = i36;
                    f12 = f15;
                    int i44 = i13;
                    int i45 = i14;
                    if (i39 > 0) {
                        i13 = i44 - i39;
                        i14 = 0;
                        for (int i46 = 0; i46 < size; i46++) {
                            p pVar3 = arrayList.get(i46);
                            if (pVar3.f76344b.M() != 8) {
                                if (i46 > 0 && i46 >= i25) {
                                    i14 += pVar3.f76350h.f76321f;
                                }
                                i14 += pVar3.f76347e.f76322g;
                                if (i46 < i26 && i46 < i11) {
                                    i14 += -pVar3.f76351i.f76321f;
                                }
                            }
                        }
                    } else {
                        i13 = i44;
                        i14 = i45;
                    }
                    i18 = 2;
                    if (this.f76307l == 2 && i39 == 0) {
                        i17 = 0;
                        this.f76307l = 0;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i16 = i36;
                    f12 = 0.5f;
                    i17 = 0;
                    i18 = 2;
                }
                if (i14 > i24) {
                    this.f76307l = i18;
                }
                if (i15 > 0 && i13 == 0 && i25 == i11) {
                    this.f76307l = i18;
                }
                int i47 = this.f76307l;
                if (i47 == 1) {
                    int i48 = i15 > 1 ? (i24 - i14) / (i15 - 1) : i15 == 1 ? (i24 - i14) / 2 : i17;
                    if (i13 > 0) {
                        i48 = i17;
                    }
                    int i49 = i16;
                    for (int i51 = i17; i51 < size; i51++) {
                        p pVar4 = arrayList.get(z11 ? size - (i51 + 1) : i51);
                        int M11 = pVar4.f76344b.M();
                        f fVar3 = pVar4.f76351i;
                        f fVar4 = pVar4.f76350h;
                        if (M11 == 8) {
                            fVar4.d(i49);
                            fVar3.d(i49);
                        } else {
                            if (i51 > 0) {
                                i49 = z11 ? i49 - i48 : i49 + i48;
                            }
                            if (i51 > 0 && i51 >= i25) {
                                i49 = z11 ? i49 - fVar4.f76321f : i49 + fVar4.f76321f;
                            }
                            if (z11) {
                                fVar3.d(i49);
                            } else {
                                fVar4.d(i49);
                            }
                            g gVar3 = pVar4.f76347e;
                            int i52 = gVar3.f76322g;
                            if (pVar4.f76346d == e.b.MATCH_CONSTRAINT && pVar4.f76343a == 1) {
                                i52 = gVar3.f76328m;
                            }
                            i49 = z11 ? i49 - i52 : i49 + i52;
                            if (z11) {
                                fVar4.d(i49);
                            } else {
                                fVar3.d(i49);
                            }
                            pVar4.f76349g = true;
                            if (i51 < i26 && i51 < i11) {
                                i49 = z11 ? i49 - (-fVar3.f76321f) : i49 + (-fVar3.f76321f);
                            }
                        }
                    }
                    return;
                }
                if (i47 == 0) {
                    int i53 = (i24 - i14) / (i15 + 1);
                    if (i13 > 0) {
                        i53 = i17;
                    }
                    int i54 = i16;
                    for (int i55 = i17; i55 < size; i55++) {
                        p pVar5 = arrayList.get(z11 ? size - (i55 + 1) : i55);
                        int M12 = pVar5.f76344b.M();
                        f fVar5 = pVar5.f76351i;
                        f fVar6 = pVar5.f76350h;
                        if (M12 == 8) {
                            fVar6.d(i54);
                            fVar5.d(i54);
                        } else {
                            int i56 = z11 ? i54 - i53 : i54 + i53;
                            if (i55 > 0 && i55 >= i25) {
                                i56 = z11 ? i56 - fVar6.f76321f : i56 + fVar6.f76321f;
                            }
                            if (z11) {
                                fVar5.d(i56);
                            } else {
                                fVar6.d(i56);
                            }
                            g gVar4 = pVar5.f76347e;
                            int i57 = gVar4.f76322g;
                            if (pVar5.f76346d == e.b.MATCH_CONSTRAINT && pVar5.f76343a == 1) {
                                i57 = Math.min(i57, gVar4.f76328m);
                            }
                            i54 = z11 ? i56 - i57 : i56 + i57;
                            if (z11) {
                                fVar6.d(i54);
                            } else {
                                fVar5.d(i54);
                            }
                            if (i55 < i26 && i55 < i11) {
                                i54 = z11 ? i54 - (-fVar5.f76321f) : i54 + (-fVar5.f76321f);
                            }
                        }
                    }
                    return;
                }
                if (i47 == 2) {
                    float w11 = this.f76348f == 0 ? this.f76344b.w() : this.f76344b.K();
                    if (z11) {
                        w11 = 1.0f - w11;
                    }
                    int i58 = (int) (((i24 - i14) * w11) + f12);
                    if (i58 < 0 || i13 > 0) {
                        i58 = i17;
                    }
                    int i59 = z11 ? i16 - i58 : i16 + i58;
                    for (int i61 = i17; i61 < size; i61++) {
                        p pVar6 = arrayList.get(z11 ? size - (i61 + 1) : i61);
                        int M13 = pVar6.f76344b.M();
                        f fVar7 = pVar6.f76351i;
                        f fVar8 = pVar6.f76350h;
                        if (M13 == 8) {
                            fVar8.d(i59);
                            fVar7.d(i59);
                        } else {
                            if (i61 > 0 && i61 >= i25) {
                                i59 = z11 ? i59 - fVar8.f76321f : i59 + fVar8.f76321f;
                            }
                            if (z11) {
                                fVar7.d(i59);
                            } else {
                                fVar8.d(i59);
                            }
                            g gVar5 = pVar6.f76347e;
                            int i62 = gVar5.f76322g;
                            if (pVar6.f76346d == e.b.MATCH_CONSTRAINT && pVar6.f76343a == 1) {
                                i62 = gVar5.f76328m;
                            }
                            i59 += i62;
                            if (z11) {
                                fVar8.d(i59);
                            } else {
                                fVar7.d(i59);
                            }
                            if (i61 < i26 && i61 < i11) {
                                i59 = z11 ? i59 - (-fVar7.f76321f) : i59 + (-fVar7.f76321f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // n2.p
    final void d() {
        ArrayList<p> arrayList = this.f76306k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        m2.e eVar = arrayList.get(0).f76344b;
        m2.e eVar2 = arrayList.get(size - 1).f76344b;
        int i11 = this.f76348f;
        f fVar = this.f76351i;
        f fVar2 = this.f76350h;
        if (i11 == 0) {
            m2.d dVar = eVar.f74104K;
            m2.d dVar2 = eVar2.f74106M;
            f i12 = p.i(dVar, 0);
            int f7 = dVar.f();
            m2.e n11 = n();
            if (n11 != null) {
                f7 = n11.f74104K.f();
            }
            if (i12 != null) {
                p.b(fVar2, i12, f7);
            }
            f i13 = p.i(dVar2, 0);
            int f11 = dVar2.f();
            m2.e o11 = o();
            if (o11 != null) {
                f11 = o11.f74106M.f();
            }
            if (i13 != null) {
                p.b(fVar, i13, -f11);
            }
        } else {
            m2.d dVar3 = eVar.f74105L;
            m2.d dVar4 = eVar2.f74107N;
            f i14 = p.i(dVar3, 1);
            int f12 = dVar3.f();
            m2.e n12 = n();
            if (n12 != null) {
                f12 = n12.f74105L.f();
            }
            if (i14 != null) {
                p.b(fVar2, i14, f12);
            }
            f i15 = p.i(dVar4, 1);
            int f13 = dVar4.f();
            m2.e o12 = o();
            if (o12 != null) {
                f13 = o12.f74107N.f();
            }
            if (i15 != null) {
                p.b(fVar, i15, -f13);
            }
        }
        fVar2.f76316a = this;
        fVar.f76316a = this;
    }

    @Override // n2.p
    public final void e() {
        int i11 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f76306k;
            if (i11 >= arrayList.size()) {
                return;
            }
            arrayList.get(i11).e();
            i11++;
        }
    }

    @Override // n2.p
    final void f() {
        this.f76345c = null;
        Iterator<p> it = this.f76306k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // n2.p
    public final long j() {
        ArrayList<p> arrayList = this.f76306k;
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j11 = r5.f76351i.f76321f + arrayList.get(i11).j() + j11 + r5.f76350h.f76321f;
        }
        return j11;
    }

    @Override // n2.p
    final boolean l() {
        ArrayList<p> arrayList = this.f76306k;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!arrayList.get(i11).l()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f76348f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f76306k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
