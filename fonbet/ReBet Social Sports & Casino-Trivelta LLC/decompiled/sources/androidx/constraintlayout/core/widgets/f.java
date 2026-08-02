package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.EnumC3631g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: E0, reason: collision with root package name */
    public int f18005E0;

    /* renamed from: I0, reason: collision with root package name */
    public int f18009I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f18010J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f18011K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f18012L0;

    /* renamed from: C0, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.b f18003C0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);

    /* renamed from: D0, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.e f18004D0 = new androidx.constraintlayout.core.widgets.analyzer.e(this);

    /* renamed from: F0, reason: collision with root package name */
    public b.InterfaceC0352b f18006F0 = null;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f18007G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    public androidx.constraintlayout.core.d f18008H0 = new androidx.constraintlayout.core.d();

    /* renamed from: M0, reason: collision with root package name */
    public int f18013M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    public int f18014N0 = 0;
    c[] mVerticalChainsArray = new c[4];
    c[] mHorizontalChainsArray = new c[4];

    /* renamed from: O0, reason: collision with root package name */
    public boolean f18015O0 = false;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f18016P0 = false;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f18017Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    public int f18018R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    public int f18019S0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    public int f18020T0 = EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f18021U0 = false;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f18022V0 = false;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f18023W0 = false;

    /* renamed from: X0, reason: collision with root package name */
    public int f18024X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    public WeakReference f18025Y0 = null;

    /* renamed from: Z0, reason: collision with root package name */
    public WeakReference f18026Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public WeakReference f18027a1 = null;

    /* renamed from: b1, reason: collision with root package name */
    public WeakReference f18028b1 = null;

    /* renamed from: c1, reason: collision with root package name */
    public HashSet f18029c1 = new HashSet();

    /* renamed from: d1, reason: collision with root package name */
    public b.a f18030d1 = new b.a();

    public static boolean U1(int i10, e eVar, b.InterfaceC0352b interfaceC0352b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0352b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f17801e = 0;
            aVar.f17802f = 0;
            return false;
        }
        aVar.f17797a = eVar.A();
        aVar.f17798b = eVar.T();
        aVar.f17799c = eVar.W();
        aVar.f17800d = eVar.x();
        aVar.f17805i = false;
        aVar.f17806j = i11;
        e.b bVar = aVar.f17797a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f17798b == bVar2;
        boolean z12 = z10 && eVar.f17943W > 0.0f;
        boolean z13 = z11 && eVar.f17943W > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f17987u == 0 && !z12) {
            aVar.f17797a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f17989v == 0) {
                aVar.f17797a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f17989v == 0 && !z13) {
            aVar.f17798b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f17987u == 0) {
                aVar.f17798b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f17797a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.f17798b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.mResolvedMatchConstraintDefault[0] == 4) {
                aVar.f17797a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f17798b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f17800d;
                } else {
                    aVar.f17797a = e.b.WRAP_CONTENT;
                    interfaceC0352b.b(eVar, aVar);
                    i13 = aVar.f17802f;
                }
                aVar.f17797a = bVar4;
                aVar.f17799c = (int) (eVar.v() * i13);
            }
        }
        if (z13) {
            if (eVar.mResolvedMatchConstraintDefault[1] == 4) {
                aVar.f17798b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f17797a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f17799c;
                } else {
                    aVar.f17798b = e.b.WRAP_CONTENT;
                    interfaceC0352b.b(eVar, aVar);
                    i12 = aVar.f17801e;
                }
                aVar.f17798b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f17800d = (int) (i12 / eVar.v());
                } else {
                    aVar.f17800d = (int) (eVar.v() * i12);
                }
            }
        }
        interfaceC0352b.b(eVar, aVar);
        eVar.l1(aVar.f17801e);
        eVar.M0(aVar.f17802f);
        eVar.L0(aVar.f17804h);
        eVar.B0(aVar.f17803g);
        aVar.f17806j = b.a.f17794k;
        return aVar.f17805i;
    }

    public void A1(d dVar) {
        WeakReference weakReference = this.f18026Z0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f18026Z0.get()).e()) {
            this.f18026Z0 = new WeakReference(dVar);
        }
    }

    public final void B1(d dVar, androidx.constraintlayout.core.i iVar) {
        this.f18008H0.h(iVar, this.f18008H0.q(dVar), 0, 5);
    }

    public final void C1(d dVar, androidx.constraintlayout.core.i iVar) {
        this.f18008H0.h(this.f18008H0.q(dVar), iVar, 0, 5);
    }

    public final void D1(e eVar) {
        int i10 = this.f18014N0 + 1;
        c[] cVarArr = this.mVerticalChainsArray;
        if (i10 >= cVarArr.length) {
            this.mVerticalChainsArray = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.mVerticalChainsArray[this.f18014N0] = new c(eVar, 1, R1());
        this.f18014N0++;
    }

    public void E1(d dVar) {
        WeakReference weakReference = this.f18027a1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f18027a1.get()).e()) {
            this.f18027a1 = new WeakReference(dVar);
        }
    }

    public void F1(d dVar) {
        WeakReference weakReference = this.f18025Y0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f18025Y0.get()).e()) {
            this.f18025Y0 = new WeakReference(dVar);
        }
    }

    public boolean G1(boolean z10) {
        return this.f18004D0.f(z10);
    }

    public boolean H1(boolean z10) {
        return this.f18004D0.g(z10);
    }

    public boolean I1(boolean z10, int i10) {
        return this.f18004D0.h(z10, i10);
    }

    public void J1(androidx.constraintlayout.core.e eVar) {
        this.f18008H0.v(eVar);
    }

    public b.InterfaceC0352b K1() {
        return this.f18006F0;
    }

    public int L1() {
        return this.f18020T0;
    }

    public androidx.constraintlayout.core.d M1() {
        return this.f18008H0;
    }

    public boolean N1() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void O(StringBuilder sb2) {
        sb2.append(this.f17971m + ":{\n");
        sb2.append("  actualWidth:" + this.f17941U);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("  actualHeight:" + this.f17942V);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Iterator it = s1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void O1() {
        this.f18004D0.j();
    }

    public void P1() {
        this.f18004D0.k();
    }

    public boolean Q1() {
        return this.f18023W0;
    }

    public boolean R1() {
        return this.f18007G0;
    }

    public boolean S1() {
        return this.f18022V0;
    }

    public long T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f18009I0 = i17;
        this.f18010J0 = i18;
        return this.f18003C0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean V1(int i10) {
        return (this.f18020T0 & i10) == i10;
    }

    public final void W1() {
        this.f18013M0 = 0;
        this.f18014N0 = 0;
    }

    public void X1(b.InterfaceC0352b interfaceC0352b) {
        this.f18006F0 = interfaceC0352b;
        this.f18004D0.n(interfaceC0352b);
    }

    public void Y1(int i10) {
        this.f18020T0 = i10;
        androidx.constraintlayout.core.d.f17728p = V1(512);
    }

    public void Z1(int i10) {
        this.f18005E0 = i10;
    }

    public void a2(boolean z10) {
        this.f18007G0 = z10;
    }

    public boolean b2(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean V12 = V1(64);
        r1(dVar, V12);
        int size = this.f18092B0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f18092B0.get(i10);
            eVar.r1(dVar, V12);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c2() {
        this.f18003C0.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void q1(boolean z10, boolean z11) {
        super.q1(z10, z11);
        int size = this.f18092B0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f18092B0.get(i10)).q1(z10, z11);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.m, androidx.constraintlayout.core.widgets.e
    public void t0() {
        this.f18008H0.E();
        this.f18009I0 = 0;
        this.f18011K0 = 0;
        this.f18010J0 = 0;
        this.f18012L0 = 0;
        this.f18021U0 = false;
        super.t0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // androidx.constraintlayout.core.widgets.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t1() {
        int i10;
        int i11;
        boolean z10;
        ?? r16;
        ?? r18;
        char c10;
        boolean z11;
        boolean z12;
        int max;
        int max2;
        int i12;
        ?? r62;
        e.b bVar;
        int i13 = 0;
        this.f17945Y = 0;
        this.f17946Z = 0;
        this.f18022V0 = false;
        this.f18023W0 = false;
        int size = this.f18092B0.size();
        int max3 = Math.max(0, W());
        int max4 = Math.max(0, x());
        e.b[] bVarArr = this.mListDimensionBehaviors;
        boolean z13 = true;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        if (this.f18005E0 == 0 && k.b(this.f18020T0, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.h.h(this, K1());
            for (int i14 = 0; i14 < size; i14++) {
                e eVar = (e) this.f18092B0.get(i14);
                if (eVar.m0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof l) && !eVar.l0()) {
                    e.b u10 = eVar.u(0);
                    e.b u11 = eVar.u(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (u10 != bVar4 || eVar.f17987u == 1 || u11 != bVar4 || eVar.f17989v == 1) {
                        U1(0, eVar, this.f18006F0, new b.a(), b.a.f17794k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && k.b(this.f18020T0, 1024) && androidx.constraintlayout.core.widgets.analyzer.i.c(this, K1()))) {
            i10 = max4;
            i11 = max3;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (max3 >= W() || max3 <= 0) {
                    max3 = W();
                } else {
                    l1(max3);
                    this.f18022V0 = true;
                }
            }
            if (bVar2 == bVar) {
                if (max4 >= x() || max4 <= 0) {
                    max4 = x();
                } else {
                    M0(max4);
                    this.f18023W0 = true;
                }
            }
            i10 = max4;
            i11 = max3;
            z10 = true;
        }
        boolean z14 = V1(64) || V1(128);
        androidx.constraintlayout.core.d dVar = this.f18008H0;
        dVar.f17742h = false;
        dVar.f17743i = false;
        if (this.f18020T0 != 0 && z14) {
            dVar.f17743i = true;
        }
        ArrayList arrayList = this.f18092B0;
        e.b A10 = A();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z15 = A10 == bVar5 || T() == bVar5;
        W1();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar2 = (e) this.f18092B0.get(i15);
            if (eVar2 instanceof m) {
                ((m) eVar2).t1();
            }
        }
        boolean V12 = V1(64);
        boolean z16 = z10;
        int i16 = 0;
        boolean z17 = true;
        while (z17) {
            int i17 = i16 + 1;
            try {
                this.f18008H0.E();
                W1();
                m(this.f18008H0);
                int i18 = i13;
                while (i18 < size) {
                    int i19 = i13;
                    try {
                        c10 = c11;
                    } catch (Exception e10) {
                        e = e10;
                        c10 = c11;
                    }
                    try {
                        ((e) this.f18092B0.get(i18)).m(this.f18008H0);
                        i18++;
                        i13 = i19 == true ? 1 : 0;
                        c11 = c10;
                    } catch (Exception e11) {
                        e = e11;
                        r18 = z13;
                        r16 = i19;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        if (z17) {
                        }
                        if (z15) {
                        }
                        z12 = z11;
                        max = Math.max(this.f17958f0, W());
                        if (max > W()) {
                        }
                        max2 = Math.max(this.f17960g0, x());
                        if (max2 > x()) {
                        }
                        if (!z16) {
                        }
                        i12 = 8;
                        if (i17 <= i12) {
                        }
                        i16 = i17;
                        i13 = r16;
                        c11 = c10;
                        z13 = true;
                    }
                }
                r16 = i13;
                c10 = c11;
                z17 = x1(this.f18008H0);
                WeakReference weakReference = this.f18025Y0;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z13;
                } else {
                    r18 = z13;
                    try {
                        C1((d) this.f18025Y0.get(), this.f18008H0.q(this.f17932L));
                        this.f18025Y0 = null;
                        r18 = r18;
                    } catch (Exception e12) {
                        e = e12;
                        r16 = r16;
                        r18 = r18;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        if (z17) {
                        }
                        if (z15) {
                        }
                        z12 = z11;
                        max = Math.max(this.f17958f0, W());
                        if (max > W()) {
                        }
                        max2 = Math.max(this.f17960g0, x());
                        if (max2 > x()) {
                        }
                        if (!z16) {
                        }
                        i12 = 8;
                        if (i17 <= i12) {
                        }
                        i16 = i17;
                        i13 = r16;
                        c11 = c10;
                        z13 = true;
                    }
                }
                WeakReference weakReference2 = this.f18027a1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    B1((d) this.f18027a1.get(), this.f18008H0.q(this.f17934N));
                    this.f18027a1 = null;
                }
                WeakReference weakReference3 = this.f18026Z0;
                if (weakReference3 != null && weakReference3.get() != null) {
                    C1((d) this.f18026Z0.get(), this.f18008H0.q(this.f17931K));
                    this.f18026Z0 = null;
                }
                WeakReference weakReference4 = this.f18028b1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    B1((d) this.f18028b1.get(), this.f18008H0.q(this.f17933M));
                    this.f18028b1 = null;
                }
                if (z17) {
                    this.f18008H0.A();
                }
            } catch (Exception e13) {
                e = e13;
                r16 = i13;
                r18 = z13;
                c10 = c11;
            }
            if (z17) {
                z11 = b2(this.f18008H0, k.sFlags);
            } else {
                r1(this.f18008H0, V12);
                for (int i20 = r16; i20 < size; i20++) {
                    ((e) this.f18092B0.get(i20)).r1(this.f18008H0, V12);
                }
                z11 = r16;
            }
            if (z15 || i17 >= 8 || !k.sFlags[c10]) {
                z12 = z11;
            } else {
                int i21 = r16;
                int i22 = i21;
                int i23 = i22;
                while (i21 < size) {
                    e eVar3 = (e) this.f18092B0.get(i21);
                    i22 = Math.max(i22, eVar3.f17945Y + eVar3.W());
                    i23 = Math.max(i23, eVar3.f17946Z + eVar3.x());
                    i21++;
                    z11 = z11;
                }
                z12 = z11;
                int max5 = Math.max(this.f17958f0, i22);
                int max6 = Math.max(this.f17960g0, i23);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 == bVar6 && W() < max5) {
                    l1(max5);
                    this.mListDimensionBehaviors[r16] = bVar6;
                    z16 = r18;
                    z12 = z16;
                }
                if (bVar2 == bVar6 && x() < max6) {
                    M0(max6);
                    this.mListDimensionBehaviors[r18] = bVar6;
                    z16 = r18;
                    z12 = z16;
                }
            }
            max = Math.max(this.f17958f0, W());
            if (max > W()) {
                l1(max);
                this.mListDimensionBehaviors[r16] = e.b.FIXED;
                z16 = r18;
                z12 = z16;
            }
            max2 = Math.max(this.f17960g0, x());
            if (max2 > x()) {
                M0(max2);
                this.mListDimensionBehaviors[r18] = e.b.FIXED;
                z16 = r18;
                z12 = z16;
            }
            if (!z16) {
                e.b bVar7 = this.mListDimensionBehaviors[r16];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 != bVar8 || i11 <= 0 || W() <= i11) {
                    r62 = r18;
                } else {
                    boolean z18 = r18;
                    this.f18022V0 = z18;
                    this.mListDimensionBehaviors[r16] = e.b.FIXED;
                    l1(i11);
                    z16 = z18 ? 1 : 0;
                    z12 = z16;
                    r62 = z18;
                }
                if (this.mListDimensionBehaviors[r62] == bVar8 && i10 > 0 && x() > i10) {
                    this.f18023W0 = r62;
                    this.mListDimensionBehaviors[r62] = e.b.FIXED;
                    M0(i10);
                    i12 = 8;
                    z16 = true;
                    z12 = true;
                    z17 = i17 <= i12 ? r16 : z12;
                    i16 = i17;
                    i13 = r16;
                    c11 = c10;
                    z13 = true;
                }
            }
            i12 = 8;
            if (i17 <= i12) {
            }
            i16 = i17;
            i13 = r16;
            c11 = c10;
            z13 = true;
        }
        int i24 = i13;
        this.f18092B0 = arrayList;
        if (z16) {
            e.b[] bVarArr2 = this.mListDimensionBehaviors;
            bVarArr2[i24] = bVar3;
            bVarArr2[1] = bVar2;
        }
        w0(this.f18008H0.w());
    }

    public void w1(e eVar, int i10) {
        if (i10 == 0) {
            y1(eVar);
        } else if (i10 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(androidx.constraintlayout.core.d dVar) {
        f fVar;
        androidx.constraintlayout.core.d dVar2;
        boolean V12 = V1(64);
        g(dVar, V12);
        int size = this.f18092B0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f18092B0.get(i10);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f18092B0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).z1();
                }
            }
        }
        this.f18029c1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.f18092B0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f18029c1.add(eVar3);
                } else {
                    eVar3.g(dVar, V12);
                }
            }
        }
        while (this.f18029c1.size() > 0) {
            int size2 = this.f18029c1.size();
            Iterator it = this.f18029c1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.w1(this.f18029c1)) {
                    lVar.g(dVar, V12);
                    this.f18029c1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f18029c1.size()) {
                Iterator it2 = this.f18029c1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, V12);
                }
                this.f18029c1.clear();
            }
        }
        if (androidx.constraintlayout.core.d.f17728p) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.f18092B0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, dVar2, eVar5);
                eVar5.g(dVar2, V12);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) fVar.f18092B0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.mListDimensionBehaviors;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, V12);
                    if (bVar == bVar3) {
                        eVar6.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, V12);
                    }
                }
            }
        }
        if (fVar.f18013M0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.f18014N0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public final void y1(e eVar) {
        int i10 = this.f18013M0 + 1;
        c[] cVarArr = this.mHorizontalChainsArray;
        if (i10 >= cVarArr.length) {
            this.mHorizontalChainsArray = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.mHorizontalChainsArray[this.f18013M0] = new c(eVar, 0, R1());
        this.f18013M0++;
    }

    public void z1(d dVar) {
        WeakReference weakReference = this.f18028b1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f18028b1.get()).e()) {
            this.f18028b1 = new WeakReference(dVar);
        }
    }
}
