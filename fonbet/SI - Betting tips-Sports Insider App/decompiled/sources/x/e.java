package x;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k2.r;
import okio.Segment;
import y.m;
import y.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final y.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f25330q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final kh.g f25331r0 = new kh.g(this);

    /* renamed from: s0, reason: collision with root package name */
    public final r f25332s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f25333t0;

    /* renamed from: u0, reason: collision with root package name */
    public androidx.constraintlayout.widget.e f25334u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f25335v0;

    /* renamed from: w0, reason: collision with root package name */
    public final v.c f25336w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f25337y0;
    public int z0;

    public e() {
        r rVar = new r();
        rVar.f18747a = true;
        rVar.f18748b = true;
        rVar.f18751e = new ArrayList();
        new ArrayList();
        rVar.f18752f = null;
        rVar.f18753g = new y.b();
        rVar.f18754h = new ArrayList();
        rVar.f18749c = this;
        rVar.f18750d = this;
        this.f25332s0 = rVar;
        this.f25334u0 = null;
        this.f25335v0 = false;
        this.f25336w0 = new v.c();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new y.b();
    }

    public static void V(d dVar, androidx.constraintlayout.widget.e eVar, y.b bVar) {
        int i5;
        int i10;
        if (eVar == null) {
            return;
        }
        int i11 = dVar.f25305g0;
        int[] iArr = dVar.f25323t;
        if (i11 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f25482e = 0;
            bVar.f25483f = 0;
            return;
        }
        int[] iArr2 = dVar.f25320p0;
        bVar.f25478a = iArr2[0];
        bVar.f25479b = iArr2[1];
        bVar.f25480c = dVar.q();
        bVar.f25481d = dVar.k();
        bVar.f25486i = false;
        bVar.j = 0;
        boolean z5 = bVar.f25478a == 3;
        boolean z7 = bVar.f25479b == 3;
        boolean z10 = z5 && dVar.W > 0.0f;
        boolean z11 = z7 && dVar.W > 0.0f;
        if (z5 && dVar.t(0) && dVar.f25321r == 0 && !z10) {
            bVar.f25478a = 2;
            if (z7 && dVar.f25322s == 0) {
                bVar.f25478a = 1;
            }
            z5 = false;
        }
        if (z7 && dVar.t(1) && dVar.f25322s == 0 && !z11) {
            bVar.f25479b = 2;
            if (z5 && dVar.f25321r == 0) {
                bVar.f25479b = 1;
            }
            z7 = false;
        }
        if (dVar.A()) {
            bVar.f25478a = 1;
            z5 = false;
        }
        if (dVar.B()) {
            bVar.f25479b = 1;
            z7 = false;
        }
        if (z10) {
            if (iArr[0] == 4) {
                bVar.f25478a = 1;
            } else if (!z7) {
                if (bVar.f25479b == 1) {
                    i10 = bVar.f25481d;
                } else {
                    bVar.f25478a = 2;
                    eVar.b(dVar, bVar);
                    i10 = bVar.f25483f;
                }
                bVar.f25478a = 1;
                bVar.f25480c = (int) (dVar.W * i10);
            }
        }
        if (z11) {
            if (iArr[1] == 4) {
                bVar.f25479b = 1;
            } else if (!z5) {
                if (bVar.f25478a == 1) {
                    i5 = bVar.f25480c;
                } else {
                    bVar.f25479b = 2;
                    eVar.b(dVar, bVar);
                    i5 = bVar.f25482e;
                }
                bVar.f25479b = 1;
                if (dVar.X == -1) {
                    bVar.f25481d = (int) (i5 / dVar.W);
                } else {
                    bVar.f25481d = (int) (dVar.W * i5);
                }
            }
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f25482e);
        dVar.L(bVar.f25483f);
        dVar.E = bVar.f25485h;
        dVar.I(bVar.f25484g);
        bVar.j = 0;
    }

    @Override // x.d
    public final void C() {
        this.f25336w0.t();
        this.x0 = 0;
        this.f25337y0 = 0;
        this.f25330q0.clear();
        super.C();
    }

    @Override // x.d
    public final void F(kh.g gVar) {
        super.F(gVar);
        int size = this.f25330q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((d) this.f25330q0.get(i5)).F(gVar);
        }
    }

    @Override // x.d
    public final void P(boolean z5, boolean z7) {
        super.P(z5, z7);
        int size = this.f25330q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((d) this.f25330q0.get(i5)).P(z5, z7);
        }
    }

    public final void R(d dVar, int i5) {
        if (i5 == 0) {
            int i10 = this.z0 + 1;
            b[] bVarArr = this.C0;
            if (i10 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i11 = this.z0;
            bVarArr2[i11] = new b(dVar, 0, this.f25335v0);
            this.z0 = i11 + 1;
            return;
        }
        if (i5 == 1) {
            int i12 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.A0;
            bVarArr4[i13] = new b(dVar, 1, this.f25335v0);
            this.A0 = i13 + 1;
        }
    }

    public final void S(v.c cVar) {
        e eVar;
        v.c cVar2;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f25330q0.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) this.f25330q0.get(i5);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f25330q0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f25369r0; i11++) {
                        d dVar3 = aVar.f25368q0[i11];
                        if (aVar.f25266t0 || dVar3.c()) {
                            int i12 = aVar.f25265s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f25330q0.get(i13);
            dVar4.getClass();
            boolean z7 = dVar4 instanceof g;
            if (z7 || (dVar4 instanceof h)) {
                if (z7) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f25369r0; i14++) {
                    if (hashSet.contains(gVar.f25368q0[i14])) {
                        gVar.b(cVar, W);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (v.c.q) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f25330q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f25320p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f25330q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f25320p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    public final boolean T(int i5, boolean z5) {
        boolean z7;
        boolean z10;
        r rVar = this.f25332s0;
        ArrayList arrayList = (ArrayList) rVar.f18751e;
        e eVar = (e) rVar.f18749c;
        boolean z11 = false;
        int j = eVar.j(0);
        int[] iArr = eVar.f25320p0;
        int j6 = eVar.j(1);
        int r5 = eVar.r();
        int s8 = eVar.s();
        if (z5 && (j == 2 || j6 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = z5;
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f25518f == i5 && !nVar.k()) {
                    z10 = false;
                    break;
                }
            }
            if (i5 == 0) {
                if (z10 && j == 2) {
                    eVar.M(1);
                    eVar.O(rVar.e(eVar, 0));
                    eVar.f25299d.f25517e.d(eVar.q());
                }
            } else if (z10 && j6 == 2) {
                eVar.N(1);
                eVar.L(rVar.e(eVar, 1));
                eVar.f25301e.f25517e.d(eVar.k());
            }
        }
        if (i5 == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int q = eVar.q() + r5;
                eVar.f25299d.f25521i.d(q);
                eVar.f25299d.f25517e.d(q - r5);
                z7 = true;
            }
            z7 = false;
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int k6 = eVar.k() + s8;
                eVar.f25301e.f25521i.d(k6);
                eVar.f25301e.f25517e.d(k6 - s8);
                z7 = true;
            }
            z7 = false;
        }
        rVar.i();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            if (nVar2.f25518f == i5 && (nVar2.f25514b != eVar || nVar2.f25519g)) {
                nVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z11 = true;
                break;
            }
            n nVar3 = (n) it3.next();
            if (nVar3.f25518f == i5 && (z7 || nVar3.f25514b != eVar)) {
                if (!nVar3.f25520h.j) {
                    break;
                }
                if (!nVar3.f25521i.j) {
                    break;
                }
                if (!(nVar3 instanceof y.c) && !nVar3.f25517e.j) {
                    break;
                }
            }
        }
        eVar.M(j);
        eVar.N(j6);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x083b A[LOOP:14: B:281:0x0839->B:282:0x083b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0663  */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        Object[] objArr;
        c cVar;
        int i5;
        boolean z5;
        char c2;
        int i10;
        boolean z7;
        boolean z10;
        boolean z11;
        c cVar2;
        boolean[] zArr;
        boolean z12;
        int max;
        ?? r5;
        boolean z13;
        int max2;
        boolean z14;
        int i11;
        int i12;
        int max3;
        int max4;
        m mVar;
        m mVar2;
        int b10;
        int i13;
        m mVar3;
        m mVar4;
        boolean z15;
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.constraintlayout.widget.e eVar;
        ArrayList arrayList3;
        int i14;
        boolean z16;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.f25330q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f25320p0;
        int i15 = iArr[1];
        int i16 = iArr[0];
        int i17 = this.f25333t0;
        c cVar3 = this.J;
        c cVar4 = this.I;
        if (i17 == 0 && j.c(this.D0, 1)) {
            androidx.constraintlayout.widget.e eVar2 = this.f25334u0;
            int i18 = iArr[0];
            int i19 = iArr[1];
            E();
            ArrayList arrayList4 = this.f25330q0;
            int size2 = arrayList4.size();
            for (int i20 = 0; i20 < size2; i20++) {
                ((d) arrayList4.get(i20)).E();
            }
            boolean z17 = this.f25335v0;
            if (i18 == 1) {
                J(0, q());
            } else {
                cVar4.l(0);
                this.Y = 0;
            }
            int i21 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i21 < size2) {
                int[] iArr2 = iArr;
                d dVar = (d) arrayList4.get(i21);
                int i22 = i21;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    z16 = z18;
                    if (hVar.f25366u0 == 1) {
                        int i23 = hVar.f25363r0;
                        if (i23 != -1) {
                            hVar.R(i23);
                        } else if (hVar.f25364s0 != -1 && A()) {
                            hVar.R(q() - hVar.f25364s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f25362q0 * q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((dVar instanceof a) && ((a) dVar).U() == 0) {
                        z18 = z16;
                        z19 = true;
                        i21 = i22 + 1;
                        iArr = iArr2;
                    }
                }
                z18 = z16;
                i21 = i22 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z18) {
                for (int i24 = 0; i24 < size2; i24 = i14 + 1) {
                    d dVar2 = (d) arrayList4.get(i24);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        i14 = i24;
                        if (hVar2.f25366u0 == 1) {
                            y.g.c(0, eVar2, hVar2, z17);
                        }
                    } else {
                        i14 = i24;
                    }
                }
            }
            y.g.c(0, eVar2, this, z17);
            if (z19) {
                for (int i25 = 0; i25 < size2; i25++) {
                    d dVar3 = (d) arrayList4.get(i25);
                    if (dVar3 instanceof a) {
                        a aVar = (a) dVar3;
                        if (aVar.U() == 0 && aVar.T()) {
                            y.g.c(1, eVar2, aVar, z17);
                        }
                    }
                }
            }
            if (i19 == 1) {
                K(0, k());
            } else {
                cVar3.l(0);
                this.Z = 0;
            }
            int i26 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i26 < size2) {
                d dVar4 = (d) arrayList4.get(i26);
                int i27 = i26;
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f25366u0 == 0) {
                        int i28 = hVar3.f25363r0;
                        if (i28 != -1) {
                            hVar3.R(i28);
                        } else if (hVar3.f25364s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f25364s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f25362q0 * k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((dVar4 instanceof a) && ((a) dVar4).U() == 1) {
                    z21 = true;
                }
                i26 = i27 + 1;
            }
            if (z20) {
                for (int i29 = 0; i29 < size2; i29++) {
                    d dVar5 = (d) arrayList4.get(i29);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f25366u0 == 0) {
                            y.g.i(1, eVar2, hVar4);
                        }
                    }
                }
            }
            y.g.i(0, eVar2, this);
            if (z21) {
                for (int i30 = 0; i30 < size2; i30++) {
                    d dVar6 = (d) arrayList4.get(i30);
                    if (dVar6 instanceof a) {
                        a aVar2 = (a) dVar6;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            y.g.i(1, eVar2, aVar2);
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                d dVar7 = (d) arrayList4.get(i31);
                if (dVar7.z() && y.g.a(dVar7)) {
                    V(dVar7, eVar2, y.g.f25501a);
                    if (!(dVar7 instanceof h)) {
                        y.g.c(0, eVar2, dVar7, z17);
                        y.g.i(0, eVar2, dVar7);
                    } else if (((h) dVar7).f25366u0 == 0) {
                        y.g.i(0, eVar2, dVar7);
                    } else {
                        y.g.c(0, eVar2, dVar7, z17);
                    }
                }
            }
            for (int i32 = 0; i32 < size; i32++) {
                d dVar8 = (d) this.f25330q0.get(i32);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j = dVar8.j(0);
                    int j6 = dVar8.j(1);
                    if (j != 3 || dVar8.f25321r == 1 || j6 != 3 || dVar8.f25322s == 1) {
                        V(dVar8, this.f25334u0, new y.b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        v.c cVar5 = this.f25336w0;
        if (size > 2 && ((i16 == 2 || i15 == 2) && j.c(this.D0, Segment.SHARE_MINIMUM))) {
            androidx.constraintlayout.widget.e eVar3 = this.f25334u0;
            ArrayList arrayList5 = this.f25330q0;
            int size3 = arrayList5.size();
            int i33 = 0;
            while (true) {
                if (i33 < size3) {
                    d dVar9 = (d) arrayList5.get(i33);
                    char c8 = objArr[0];
                    char c10 = objArr[1];
                    int i34 = i33;
                    int[] iArr3 = dVar9.f25320p0;
                    cVar = cVar4;
                    if (!y.g.h(c8, c10, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                        break;
                    }
                    i33 = i34 + 1;
                    cVar4 = cVar;
                } else {
                    cVar = cVar4;
                    int i35 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i35 < size3) {
                        int i36 = i35;
                        d dVar10 = (d) arrayList5.get(i35);
                        ArrayList arrayList12 = arrayList6;
                        char c11 = objArr[0];
                        ArrayList arrayList13 = arrayList7;
                        char c12 = objArr[1];
                        ArrayList arrayList14 = arrayList8;
                        int[] iArr4 = dVar10.f25320p0;
                        ArrayList arrayList15 = arrayList9;
                        if (!y.g.h(c11, c12, iArr4[0], iArr4[1])) {
                            V(dVar10, eVar3, this.L0);
                        }
                        boolean z22 = dVar10 instanceof h;
                        if (z22) {
                            h hVar5 = (h) dVar10;
                            if (hVar5.f25366u0 == 0) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(hVar5);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            z15 = z22;
                            if (hVar5.f25366u0 == 1) {
                                arrayList = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList12;
                            }
                        } else {
                            z15 = z22;
                            arrayList = arrayList12;
                            arrayList8 = arrayList14;
                        }
                        if (!(dVar10 instanceof i)) {
                            arrayList2 = arrayList;
                            eVar = eVar3;
                            arrayList7 = arrayList13;
                        } else if (dVar10 instanceof a) {
                            a aVar3 = (a) dVar10;
                            if (aVar3.U() == 0) {
                                arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList3.add(aVar3);
                            } else {
                                arrayList3 = arrayList13;
                            }
                            arrayList2 = arrayList;
                            eVar = eVar3;
                            if (aVar3.U() == 1) {
                                ArrayList arrayList16 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList16.add(aVar3);
                                arrayList15 = arrayList16;
                            }
                            arrayList7 = arrayList3;
                        } else {
                            arrayList2 = arrayList;
                            eVar = eVar3;
                            i iVar = (i) dVar10;
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(iVar);
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(iVar);
                            if (dVar10.I.f25289f == null && dVar10.K.f25289f == null && !z15 && !(dVar10 instanceof a)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(dVar10);
                                arrayList10 = arrayList17;
                            }
                            if (dVar10.J.f25289f == null && dVar10.L.f25289f == null && dVar10.M.f25289f == null && !z15 && !(dVar10 instanceof a)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(dVar10);
                                arrayList11 = arrayList18;
                            }
                            i35 = i36 + 1;
                            arrayList6 = arrayList2;
                            eVar3 = eVar;
                        }
                        arrayList9 = arrayList15;
                        if (dVar10.I.f25289f == null) {
                            if (arrayList10 == null) {
                            }
                            ArrayList arrayList172 = arrayList10;
                            arrayList172.add(dVar10);
                            arrayList10 = arrayList172;
                        }
                        if (dVar10.J.f25289f == null) {
                            if (arrayList11 == null) {
                            }
                            ArrayList arrayList182 = arrayList11;
                            arrayList182.add(dVar10);
                            arrayList11 = arrayList182;
                        }
                        i35 = i36 + 1;
                        arrayList6 = arrayList2;
                        eVar3 = eVar;
                    }
                    ArrayList arrayList19 = arrayList6;
                    ArrayList arrayList20 = arrayList7;
                    ArrayList arrayList21 = arrayList8;
                    ArrayList arrayList22 = arrayList9;
                    ArrayList arrayList23 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            y.g.b((h) it.next(), 0, arrayList23, null);
                        }
                    }
                    m mVar5 = null;
                    int i37 = 0;
                    if (arrayList20 != null) {
                        Iterator it2 = arrayList20.iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            m b11 = y.g.b(iVar2, i37, arrayList23, mVar5);
                            iVar2.R(i37, arrayList23, b11);
                            b11.a(arrayList23);
                            mVar5 = null;
                            i37 = 0;
                        }
                    }
                    HashSet hashSet = i(2).f25284a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            y.g.b(((c) it3.next()).f25287d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f25284a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            y.g.b(((c) it4.next()).f25287d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f25284a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            y.g.b(((c) it5.next()).f25287d, 0, arrayList23, null);
                        }
                    }
                    m mVar6 = null;
                    if (arrayList10 != null) {
                        Iterator it6 = arrayList10.iterator();
                        while (it6.hasNext()) {
                            y.g.b((d) it6.next(), 0, arrayList23, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it7 = arrayList21.iterator();
                        while (it7.hasNext()) {
                            y.g.b((h) it7.next(), 1, arrayList23, null);
                        }
                    }
                    int i38 = 1;
                    if (arrayList22 != null) {
                        Iterator it8 = arrayList22.iterator();
                        while (it8.hasNext()) {
                            i iVar3 = (i) it8.next();
                            m b12 = y.g.b(iVar3, i38, arrayList23, mVar6);
                            iVar3.R(i38, arrayList23, b12);
                            b12.a(arrayList23);
                            mVar6 = null;
                            i38 = 1;
                        }
                    }
                    HashSet hashSet4 = i(3).f25284a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            y.g.b(((c) it9.next()).f25287d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f25284a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            y.g.b(((c) it10.next()).f25287d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f25284a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            y.g.b(((c) it11.next()).f25287d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f25284a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            y.g.b(((c) it12.next()).f25287d, 1, arrayList23, null);
                        }
                    }
                    boolean z23 = true;
                    if (arrayList11 != null) {
                        Iterator it13 = arrayList11.iterator();
                        while (it13.hasNext()) {
                            y.g.b((d) it13.next(), 1, arrayList23, null);
                        }
                    }
                    int i39 = 0;
                    while (i39 < size3) {
                        d dVar11 = (d) arrayList5.get(i39);
                        int[] iArr5 = dVar11.f25320p0;
                        boolean z24 = z23;
                        if (iArr5[0] == 3 && iArr5[z24 ? 1 : 0] == 3) {
                            int i40 = dVar11.f25316n0;
                            int size4 = arrayList23.size();
                            int i41 = 0;
                            while (true) {
                                if (i41 >= size4) {
                                    i13 = i39;
                                    mVar3 = null;
                                    break;
                                }
                                i13 = i39;
                                mVar3 = (m) arrayList23.get(i41);
                                int i42 = size4;
                                if (i40 == mVar3.f25509b) {
                                    break;
                                }
                                i41++;
                                size4 = i42;
                                i39 = i13;
                            }
                            int i43 = dVar11.f25318o0;
                            int size5 = arrayList23.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 >= size5) {
                                    mVar4 = null;
                                    break;
                                }
                                mVar4 = (m) arrayList23.get(i44);
                                int i45 = size5;
                                if (i43 == mVar4.f25509b) {
                                    break;
                                }
                                i44++;
                                size5 = i45;
                            }
                            if (mVar3 != null && mVar4 != null) {
                                mVar3.c(0, mVar4);
                                mVar4.f25510c = 2;
                                arrayList23.remove(mVar3);
                            }
                        } else {
                            i13 = i39;
                        }
                        i39 = i13 + 1;
                        z23 = true;
                    }
                    if (arrayList23.size() > 1) {
                        int i46 = 0;
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList23.iterator();
                            int i47 = 0;
                            mVar = null;
                            while (it14.hasNext()) {
                                m mVar7 = (m) it14.next();
                                if (mVar7.f25510c != 1) {
                                    int b13 = mVar7.b(cVar5, i46);
                                    if (b13 > i47) {
                                        mVar = mVar7;
                                        i47 = b13;
                                    }
                                    i46 = 0;
                                }
                            }
                            if (mVar != null) {
                                M(1);
                                O(i47);
                                if (objArr[1] == 2) {
                                    Iterator it15 = arrayList23.iterator();
                                    int i48 = 0;
                                    mVar2 = null;
                                    while (it15.hasNext()) {
                                        m mVar8 = (m) it15.next();
                                        if (mVar8.f25510c != 0 && (b10 = mVar8.b(cVar5, 1)) > i48) {
                                            mVar2 = mVar8;
                                            i48 = b10;
                                        }
                                    }
                                    if (mVar2 != null) {
                                        N(1);
                                        L(i48);
                                        if (mVar == null || mVar2 != null) {
                                            if (i16 == 2) {
                                                if (max5 >= q() || max5 <= 0) {
                                                    max5 = q();
                                                } else {
                                                    O(max5);
                                                    this.E0 = true;
                                                }
                                            }
                                            if (i15 == 2) {
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.F0 = true;
                                                }
                                            }
                                            i5 = max5;
                                            z5 = true;
                                        }
                                    }
                                }
                                mVar2 = null;
                                if (mVar == null) {
                                }
                                if (i16 == 2) {
                                }
                                if (i15 == 2) {
                                }
                                i5 = max5;
                                z5 = true;
                            }
                        }
                        mVar = null;
                        if (objArr[1] == 2) {
                        }
                        mVar2 = null;
                        if (mVar == null) {
                        }
                        if (i16 == 2) {
                        }
                        if (i15 == 2) {
                        }
                        i5 = max5;
                        z5 = true;
                    }
                }
            }
            boolean z25 = !W(64) || W(128);
            cVar5.getClass();
            cVar5.f24355h = false;
            if (this.D0 == 0 && z25) {
                c2 = 1;
                cVar5.f24355h = true;
            } else {
                c2 = 1;
            }
            ArrayList arrayList24 = this.f25330q0;
            boolean z26 = objArr[0] != 2 || objArr[c2] == 2;
            this.z0 = 0;
            this.A0 = 0;
            for (i10 = 0; i10 < size; i10++) {
                d dVar12 = (d) this.f25330q0.get(i10);
                if (dVar12 instanceof e) {
                    ((e) dVar12).U();
                }
            }
            boolean W = W(64);
            z7 = z5;
            int i49 = 0;
            z10 = true;
            while (z10) {
                int i50 = i49 + 1;
                try {
                    cVar5.t();
                    this.z0 = 0;
                    this.A0 = 0;
                    g(cVar5);
                    for (int i51 = 0; i51 < size; i51++) {
                        ((d) this.f25330q0.get(i51)).g(cVar5);
                    }
                    S(cVar5);
                    try {
                        WeakReference weakReference = this.G0;
                        if (weakReference == null || weakReference.get() == null) {
                            z11 = z26;
                        } else {
                            z11 = z26;
                            try {
                                cVar5.f(cVar5.k((c) this.G0.get()), cVar5.k(cVar3), 0, 5);
                                this.G0 = null;
                            } catch (Exception e7) {
                                e = e7;
                                z10 = true;
                                e.printStackTrace();
                                cVar2 = cVar3;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = j.f25370a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f25296b0, q());
                                if (max > q()) {
                                }
                                max2 = Math.max(this.f25298c0, k());
                                if (max2 > k()) {
                                }
                                if (!z14) {
                                }
                                z7 = z14;
                                i11 = 8;
                                if (i50 <= i11) {
                                }
                                i49 = i50;
                                z26 = z11;
                                cVar3 = cVar2;
                            }
                        }
                        WeakReference weakReference2 = this.I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            cVar5.f(cVar5.k(this.L), cVar5.k((c) this.I0.get()), 0, 5);
                            this.I0 = null;
                        }
                        WeakReference weakReference3 = this.H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            c cVar6 = cVar;
                            try {
                                cVar = cVar6;
                                cVar5.f(cVar5.k((c) this.H0.get()), cVar5.k(cVar6), 0, 5);
                                this.H0 = null;
                            } catch (Exception e9) {
                                e = e9;
                                cVar = cVar6;
                                z10 = true;
                                e.printStackTrace();
                                cVar2 = cVar3;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22 = j.f25370a;
                                if (z10) {
                                }
                                if (z11) {
                                    int i52 = 0;
                                    int i53 = 0;
                                    while (i12 < size) {
                                    }
                                    max3 = Math.max(this.f25296b0, i52);
                                    max4 = Math.max(this.f25298c0, i53);
                                    if (i16 == 2) {
                                        O(max3);
                                        objArr[0] = 2;
                                        z7 = true;
                                        z12 = true;
                                    }
                                    if (i15 == 2) {
                                        L(max4);
                                        objArr[1] = 2;
                                        z7 = true;
                                        z12 = true;
                                    }
                                }
                                max = Math.max(this.f25296b0, q());
                                if (max > q()) {
                                }
                                max2 = Math.max(this.f25298c0, k());
                                if (max2 > k()) {
                                }
                                if (!z14) {
                                }
                                z7 = z14;
                                i11 = 8;
                                if (i50 <= i11) {
                                }
                                i49 = i50;
                                z26 = z11;
                                cVar3 = cVar2;
                            }
                        }
                        WeakReference weakReference4 = this.J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            try {
                            } catch (Exception e10) {
                                e = e10;
                            }
                            try {
                                cVar5.f(cVar5.k(this.K), cVar5.k((c) this.J0.get()), 0, 5);
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                e.printStackTrace();
                                cVar2 = cVar3;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = j.f25370a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f25296b0, q());
                                if (max > q()) {
                                }
                                max2 = Math.max(this.f25298c0, k());
                                if (max2 > k()) {
                                }
                                if (!z14) {
                                }
                                z7 = z14;
                                i11 = 8;
                                if (i50 <= i11) {
                                }
                                i49 = i50;
                                z26 = z11;
                                cVar3 = cVar2;
                            }
                            try {
                                this.J0 = null;
                            } catch (Exception e12) {
                                e = e12;
                                z10 = true;
                                e.printStackTrace();
                                cVar2 = cVar3;
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = j.f25370a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f25296b0, q());
                                if (max > q()) {
                                }
                                max2 = Math.max(this.f25298c0, k());
                                if (max2 > k()) {
                                }
                                if (!z14) {
                                }
                                z7 = z14;
                                i11 = 8;
                                if (i50 <= i11) {
                                }
                                i49 = i50;
                                z26 = z11;
                                cVar3 = cVar2;
                            }
                        }
                        cVar5.p();
                        cVar2 = cVar3;
                        z10 = true;
                    } catch (Exception e13) {
                        e = e13;
                        z11 = z26;
                    }
                } catch (Exception e14) {
                    e = e14;
                    z11 = z26;
                }
                boolean[] zArr22222 = j.f25370a;
                if (z10) {
                    zArr22222[2] = false;
                    boolean W2 = W(64);
                    Q(cVar5, W2);
                    int size6 = this.f25330q0.size();
                    int i54 = 0;
                    z12 = false;
                    while (i54 < size6) {
                        d dVar13 = (d) this.f25330q0.get(i54);
                        dVar13.Q(cVar5, W2);
                        boolean[] zArr3 = zArr22222;
                        boolean z27 = W2;
                        if (dVar13.f25306h != -1 || dVar13.f25308i != -1) {
                            z12 = true;
                        }
                        i54++;
                        zArr22222 = zArr3;
                        W2 = z27;
                    }
                    zArr = zArr22222;
                } else {
                    zArr = zArr22222;
                    Q(cVar5, W);
                    for (int i55 = 0; i55 < size; i55++) {
                        ((d) this.f25330q0.get(i55)).Q(cVar5, W);
                    }
                    z12 = false;
                }
                if (z11 && i50 < 8 && zArr[2]) {
                    int i522 = 0;
                    int i532 = 0;
                    for (i12 = 0; i12 < size; i12++) {
                        d dVar14 = (d) this.f25330q0.get(i12);
                        i522 = Math.max(i522, dVar14.q() + dVar14.Y);
                        i532 = Math.max(i532, dVar14.k() + dVar14.Z);
                    }
                    max3 = Math.max(this.f25296b0, i522);
                    max4 = Math.max(this.f25298c0, i532);
                    if (i16 == 2 && q() < max3) {
                        O(max3);
                        objArr[0] = 2;
                        z7 = true;
                        z12 = true;
                    }
                    if (i15 == 2 && k() < max4) {
                        L(max4);
                        objArr[1] = 2;
                        z7 = true;
                        z12 = true;
                    }
                }
                max = Math.max(this.f25296b0, q());
                if (max > q()) {
                    O(max);
                    r5 = 1;
                    objArr[0] = 1;
                    z12 = true;
                    z13 = true;
                } else {
                    r5 = 1;
                    z13 = z7;
                }
                max2 = Math.max(this.f25298c0, k());
                if (max2 > k()) {
                    L(max2);
                    objArr[r5] = r5;
                    z14 = r5;
                    z12 = z14;
                } else {
                    z14 = z13;
                }
                if (!z14) {
                    if (objArr[0] == 2 && i5 > 0 && q() > i5) {
                        this.E0 = r5;
                        objArr[0] = r5;
                        O(i5);
                        z14 = r5;
                        z12 = z14;
                    }
                    if (objArr[r5] == 2 && max6 > 0 && k() > max6) {
                        this.F0 = r5;
                        objArr[r5] = r5;
                        L(max6);
                        i11 = 8;
                        z7 = true;
                        z12 = true;
                        z10 = i50 <= i11 ? false : z12;
                        i49 = i50;
                        z26 = z11;
                        cVar3 = cVar2;
                    }
                }
                z7 = z14;
                i11 = 8;
                if (i50 <= i11) {
                }
                i49 = i50;
                z26 = z11;
                cVar3 = cVar2;
            }
            this.f25330q0 = arrayList24;
            if (z7) {
                objArr[0] = i16;
                objArr[1] = i15;
            }
            F(cVar5.f24359m);
        }
        cVar = cVar4;
        i5 = max5;
        z5 = false;
        if (W(64)) {
        }
        cVar5.getClass();
        cVar5.f24355h = false;
        if (this.D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList242 = this.f25330q0;
        if (objArr[0] != 2) {
        }
        this.z0 = 0;
        this.A0 = 0;
        while (i10 < size) {
        }
        boolean W3 = W(64);
        z7 = z5;
        int i492 = 0;
        z10 = true;
        while (z10) {
        }
        this.f25330q0 = arrayList242;
        if (z7) {
        }
        F(cVar5.f24359m);
    }

    public final boolean W(int i5) {
        return (this.D0 & i5) == i5;
    }

    @Override // x.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        Iterator it = this.f25330q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
