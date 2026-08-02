package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f17807k;

    /* renamed from: l, reason: collision with root package name */
    public int f17808l;

    public c(androidx.constraintlayout.core.widgets.e eVar, int i10) {
        super(eVar);
        this.f17807k = new ArrayList();
        this.f17871f = i10;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f6, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
    
        if (r3.f17827j != false) goto L56;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i10;
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        float f13;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        if (this.f17873h.f17827j && this.f17874i.f17827j) {
            androidx.constraintlayout.core.widgets.e K10 = this.f17867b.K();
            boolean R12 = K10 instanceof androidx.constraintlayout.core.widgets.f ? ((androidx.constraintlayout.core.widgets.f) K10).R1() : false;
            int i22 = this.f17874i.f17824g - this.f17873h.f17824g;
            int size = this.f17807k.size();
            int i23 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i23 >= size) {
                    i23 = -1;
                    break;
                } else if (((p) this.f17807k.get(i23)).f17867b.V() != 8) {
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
                if (((p) this.f17807k.get(i25)).f17867b.V() != 8) {
                    i10 = i25;
                    break;
                }
                i25--;
            }
            int i26 = 0;
            while (i26 < 2) {
                int i27 = 0;
                i13 = 0;
                i14 = 0;
                int i28 = 0;
                f11 = 0.0f;
                while (i27 < size) {
                    p pVar = (p) this.f17807k.get(i27);
                    if (pVar.f17867b.V() == i11) {
                        z11 = R12;
                    } else {
                        i28++;
                        if (i27 > 0 && i27 >= i23) {
                            i13 += pVar.f17873h.f17823f;
                        }
                        g gVar = pVar.f17870e;
                        int i29 = gVar.f17824g;
                        boolean z12 = pVar.f17869d != e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i30 = this.f17871f;
                            if (i30 == 0 && !pVar.f17867b.f17953d.f17870e.f17827j) {
                                return;
                            }
                            if (i30 == 1 && !pVar.f17867b.f17955e.f17870e.f17827j) {
                                return;
                            } else {
                                z11 = R12;
                            }
                        } else {
                            z11 = R12;
                            if (pVar.f17866a == 1 && i26 == 0) {
                                i29 = gVar.f17838m;
                                i14++;
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i29;
                        } else {
                            i14++;
                            float f14 = pVar.f17867b.mWeight[this.f17871f];
                            if (f14 >= 0.0f) {
                                f11 += f14;
                            }
                        }
                        if (i27 < i24 && i27 < i10) {
                            i13 += -pVar.f17874i.f17823f;
                        }
                    }
                    i27++;
                    R12 = z11;
                    i11 = 8;
                }
                z10 = R12;
                f10 = 0.0f;
                if (i13 < i22 || i14 == 0) {
                    i12 = i28;
                    break;
                } else {
                    i26++;
                    R12 = z10;
                    i11 = 8;
                }
            }
            z10 = R12;
            f10 = 0.0f;
            f11 = 0.0f;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            int i31 = this.f17873h.f17824g;
            if (z10) {
                i31 = this.f17874i.f17824g;
            }
            float f15 = 0.5f;
            if (i13 > i22) {
                i31 = z10 ? i31 + ((int) (((i13 - i22) / 2.0f) + 0.5f)) : i31 - ((int) (((i13 - i22) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f16 = i22 - i13;
                int i32 = (int) ((f16 / i14) + 0.5f);
                int i33 = 0;
                int i34 = 0;
                while (i33 < size) {
                    p pVar2 = (p) this.f17807k.get(i33);
                    float f17 = f15;
                    int i35 = i31;
                    if (pVar2.f17867b.V() != 8 && pVar2.f17869d == e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f17870e;
                        if (!gVar2.f17827j) {
                            int i36 = f11 > f10 ? (int) (((pVar2.f17867b.mWeight[this.f17871f] * f16) / f11) + f17) : i32;
                            f13 = f16;
                            if (this.f17871f == 0) {
                                androidx.constraintlayout.core.widgets.e eVar = pVar2.f17867b;
                                i18 = i32;
                                i19 = eVar.f17993x;
                                i20 = eVar.f17991w;
                            } else {
                                i18 = i32;
                                androidx.constraintlayout.core.widgets.e eVar2 = pVar2.f17867b;
                                i19 = eVar2.f17921A;
                                i20 = eVar2.f17997z;
                            }
                            i21 = i33;
                            int i37 = i34;
                            int max = Math.max(i20, pVar2.f17866a == 1 ? Math.min(i36, gVar2.f17838m) : i36);
                            if (i19 > 0) {
                                max = Math.min(i19, max);
                            }
                            if (max != i36) {
                                i34 = i37 + 1;
                                i36 = max;
                            } else {
                                i34 = i37;
                            }
                            pVar2.f17870e.d(i36);
                            i33 = i21 + 1;
                            f15 = f17;
                            i31 = i35;
                            f16 = f13;
                            i32 = i18;
                        }
                    }
                    f13 = f16;
                    i18 = i32;
                    i21 = i33;
                    i34 = i34;
                    i33 = i21 + 1;
                    f15 = f17;
                    i31 = i35;
                    f16 = f13;
                    i32 = i18;
                }
                i15 = i31;
                f12 = f15;
                int i38 = i34;
                if (i38 > 0) {
                    i14 -= i38;
                    i13 = 0;
                    for (int i39 = 0; i39 < size; i39++) {
                        p pVar3 = (p) this.f17807k.get(i39);
                        if (pVar3.f17867b.V() != 8) {
                            if (i39 > 0 && i39 >= i23) {
                                i13 += pVar3.f17873h.f17823f;
                            }
                            i13 += pVar3.f17870e.f17824g;
                            if (i39 < i24 && i39 < i10) {
                                i13 += -pVar3.f17874i.f17823f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f17808l == 2 && i38 == 0) {
                    i16 = 0;
                    this.f17808l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                i15 = i31;
                f12 = 0.5f;
                i16 = 0;
                i17 = 2;
            }
            if (i13 > i22) {
                this.f17808l = i17;
            }
            if (i12 > 0 && i14 == 0 && i23 == i10) {
                this.f17808l = i17;
            }
            int i40 = this.f17808l;
            if (i40 == 1) {
                int i41 = i12 > 1 ? (i22 - i13) / (i12 - 1) : i12 == 1 ? (i22 - i13) / 2 : i16;
                if (i14 > 0) {
                    i41 = i16;
                }
                int i42 = i15;
                while (i16 < size) {
                    p pVar4 = (p) this.f17807k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar4.f17867b.V() == 8) {
                        pVar4.f17873h.d(i42);
                        pVar4.f17874i.d(i42);
                    } else {
                        if (i16 > 0) {
                            i42 = z10 ? i42 - i41 : i42 + i41;
                        }
                        if (i16 > 0 && i16 >= i23) {
                            i42 = z10 ? i42 - pVar4.f17873h.f17823f : i42 + pVar4.f17873h.f17823f;
                        }
                        if (z10) {
                            pVar4.f17874i.d(i42);
                        } else {
                            pVar4.f17873h.d(i42);
                        }
                        g gVar3 = pVar4.f17870e;
                        int i43 = gVar3.f17824g;
                        if (pVar4.f17869d == e.b.MATCH_CONSTRAINT && pVar4.f17866a == 1) {
                            i43 = gVar3.f17838m;
                        }
                        i42 = z10 ? i42 - i43 : i42 + i43;
                        if (z10) {
                            pVar4.f17873h.d(i42);
                        } else {
                            pVar4.f17874i.d(i42);
                        }
                        pVar4.f17872g = true;
                        if (i16 < i24 && i16 < i10) {
                            i42 = z10 ? i42 - (-pVar4.f17874i.f17823f) : i42 + (-pVar4.f17874i.f17823f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i40 == 0) {
                int i44 = (i22 - i13) / (i12 + 1);
                if (i14 > 0) {
                    i44 = i16;
                }
                int i45 = i15;
                while (i16 < size) {
                    p pVar5 = (p) this.f17807k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar5.f17867b.V() == 8) {
                        pVar5.f17873h.d(i45);
                        pVar5.f17874i.d(i45);
                    } else {
                        int i46 = z10 ? i45 - i44 : i45 + i44;
                        if (i16 > 0 && i16 >= i23) {
                            i46 = z10 ? i46 - pVar5.f17873h.f17823f : i46 + pVar5.f17873h.f17823f;
                        }
                        if (z10) {
                            pVar5.f17874i.d(i46);
                        } else {
                            pVar5.f17873h.d(i46);
                        }
                        g gVar4 = pVar5.f17870e;
                        int i47 = gVar4.f17824g;
                        if (pVar5.f17869d == e.b.MATCH_CONSTRAINT && pVar5.f17866a == 1) {
                            i47 = Math.min(i47, gVar4.f17838m);
                        }
                        i45 = z10 ? i46 - i47 : i46 + i47;
                        if (z10) {
                            pVar5.f17873h.d(i45);
                        } else {
                            pVar5.f17874i.d(i45);
                        }
                        if (i16 < i24 && i16 < i10) {
                            i45 = z10 ? i45 - (-pVar5.f17874i.f17823f) : i45 + (-pVar5.f17874i.f17823f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i40 == 2) {
                float y10 = this.f17871f == 0 ? this.f17867b.y() : this.f17867b.R();
                if (z10) {
                    y10 = 1.0f - y10;
                }
                int i48 = (int) (((i22 - i13) * y10) + f12);
                if (i48 < 0 || i14 > 0) {
                    i48 = i16;
                }
                int i49 = z10 ? i15 - i48 : i15 + i48;
                while (i16 < size) {
                    p pVar6 = (p) this.f17807k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar6.f17867b.V() == 8) {
                        pVar6.f17873h.d(i49);
                        pVar6.f17874i.d(i49);
                    } else {
                        if (i16 > 0 && i16 >= i23) {
                            i49 = z10 ? i49 - pVar6.f17873h.f17823f : i49 + pVar6.f17873h.f17823f;
                        }
                        if (z10) {
                            pVar6.f17874i.d(i49);
                        } else {
                            pVar6.f17873h.d(i49);
                        }
                        g gVar5 = pVar6.f17870e;
                        int i50 = gVar5.f17824g;
                        if (pVar6.f17869d == e.b.MATCH_CONSTRAINT && pVar6.f17866a == 1) {
                            i50 = gVar5.f17838m;
                        }
                        i49 += i50;
                        if (z10) {
                            pVar6.f17873h.d(i49);
                        } else {
                            pVar6.f17874i.d(i49);
                        }
                        if (i16 < i24 && i16 < i10) {
                            i49 = z10 ? i49 - (-pVar6.f17874i.f17823f) : i49 + (-pVar6.f17874i.f17823f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        Iterator it = this.f17807k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f17807k.size();
        if (size < 1) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar = ((p) this.f17807k.get(0)).f17867b;
        androidx.constraintlayout.core.widgets.e eVar2 = ((p) this.f17807k.get(size - 1)).f17867b;
        if (this.f17871f == 0) {
            androidx.constraintlayout.core.widgets.d dVar = eVar.f17931K;
            androidx.constraintlayout.core.widgets.d dVar2 = eVar2.f17933M;
            f i10 = i(dVar, 0);
            int f10 = dVar.f();
            androidx.constraintlayout.core.widgets.e r10 = r();
            if (r10 != null) {
                f10 = r10.f17931K.f();
            }
            if (i10 != null) {
                b(this.f17873h, i10, f10);
            }
            f i11 = i(dVar2, 0);
            int f11 = dVar2.f();
            androidx.constraintlayout.core.widgets.e s10 = s();
            if (s10 != null) {
                f11 = s10.f17933M.f();
            }
            if (i11 != null) {
                b(this.f17874i, i11, -f11);
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar3 = eVar.f17932L;
            androidx.constraintlayout.core.widgets.d dVar4 = eVar2.f17934N;
            f i12 = i(dVar3, 1);
            int f12 = dVar3.f();
            androidx.constraintlayout.core.widgets.e r11 = r();
            if (r11 != null) {
                f12 = r11.f17932L.f();
            }
            if (i12 != null) {
                b(this.f17873h, i12, f12);
            }
            f i13 = i(dVar4, 1);
            int f13 = dVar4.f();
            androidx.constraintlayout.core.widgets.e s11 = s();
            if (s11 != null) {
                f13 = s11.f17934N.f();
            }
            if (i13 != null) {
                b(this.f17874i, i13, -f13);
            }
        }
        this.f17873h.f17818a = this;
        this.f17874i.f17818a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        for (int i10 = 0; i10 < this.f17807k.size(); i10++) {
            ((p) this.f17807k.get(i10)).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f17868c = null;
        Iterator it = this.f17807k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public long j() {
        int size = this.f17807k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f17873h.f17823f + ((p) this.f17807k.get(i10)).j() + r4.f17874i.f17823f;
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean m() {
        int size = this.f17807k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f17807k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        androidx.constraintlayout.core.widgets.e eVar;
        androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
        androidx.constraintlayout.core.widgets.e L10 = eVar2.L(this.f17871f);
        while (true) {
            androidx.constraintlayout.core.widgets.e eVar3 = L10;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                L10 = eVar2.L(this.f17871f);
            }
        }
        this.f17867b = eVar;
        this.f17807k.add(eVar.N(this.f17871f));
        androidx.constraintlayout.core.widgets.e J10 = eVar.J(this.f17871f);
        while (J10 != null) {
            this.f17807k.add(J10.N(this.f17871f));
            J10 = J10.J(this.f17871f);
        }
        Iterator it = this.f17807k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i10 = this.f17871f;
            if (i10 == 0) {
                pVar.f17867b.f17949b = this;
            } else if (i10 == 1) {
                pVar.f17867b.f17951c = this;
            }
        }
        if (this.f17871f == 0 && ((androidx.constraintlayout.core.widgets.f) this.f17867b.K()).R1() && this.f17807k.size() > 1) {
            ArrayList arrayList = this.f17807k;
            this.f17867b = ((p) arrayList.get(arrayList.size() - 1)).f17867b;
        }
        this.f17808l = this.f17871f == 0 ? this.f17867b.z() : this.f17867b.S();
    }

    public final androidx.constraintlayout.core.widgets.e r() {
        for (int i10 = 0; i10 < this.f17807k.size(); i10++) {
            p pVar = (p) this.f17807k.get(i10);
            if (pVar.f17867b.V() != 8) {
                return pVar.f17867b;
            }
        }
        return null;
    }

    public final androidx.constraintlayout.core.widgets.e s() {
        for (int size = this.f17807k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f17807k.get(size);
            if (pVar.f17867b.V() != 8) {
                return pVar.f17867b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f17871f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f17807k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
