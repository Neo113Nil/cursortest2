package m2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f2.C6404d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m2.d;
import m2.e;
import n2.C8420b;
import n2.o;

/* loaded from: classes.dex */
public final class f extends n {

    /* renamed from: A0, reason: collision with root package name */
    private boolean f74168A0;

    /* renamed from: B0, reason: collision with root package name */
    protected C6404d f74169B0;

    /* renamed from: C0, reason: collision with root package name */
    int f74170C0;

    /* renamed from: D0, reason: collision with root package name */
    int f74171D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f74172E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f74173F0;

    /* renamed from: G0, reason: collision with root package name */
    C8045c[] f74174G0;

    /* renamed from: H0, reason: collision with root package name */
    C8045c[] f74175H0;

    /* renamed from: I0, reason: collision with root package name */
    private int f74176I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f74177J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f74178K0;

    /* renamed from: L0, reason: collision with root package name */
    private WeakReference<d> f74179L0;

    /* renamed from: M0, reason: collision with root package name */
    private WeakReference<d> f74180M0;

    /* renamed from: N0, reason: collision with root package name */
    private WeakReference<d> f74181N0;

    /* renamed from: O0, reason: collision with root package name */
    private WeakReference<d> f74182O0;

    /* renamed from: P0, reason: collision with root package name */
    HashSet<e> f74183P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C8420b.a f74184Q0;

    /* renamed from: w0, reason: collision with root package name */
    C8420b f74185w0;

    /* renamed from: x0, reason: collision with root package name */
    public n2.e f74186x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f74187y0;

    /* renamed from: z0, reason: collision with root package name */
    protected C8420b.InterfaceC1286b f74188z0;

    public f(int i11) {
        super(0, 0);
        this.f74253v0 = new ArrayList<>();
        this.f74185w0 = new C8420b(this);
        this.f74186x0 = new n2.e(this);
        this.f74188z0 = null;
        this.f74168A0 = false;
        this.f74169B0 = new C6404d();
        this.f74172E0 = 0;
        this.f74173F0 = 0;
        this.f74174G0 = new C8045c[4];
        this.f74175H0 = new C8045c[4];
        this.f74176I0 = 257;
        this.f74177J0 = false;
        this.f74178K0 = false;
        this.f74179L0 = null;
        this.f74180M0 = null;
        this.f74181N0 = null;
        this.f74182O0 = null;
        this.f74183P0 = new HashSet<>();
        this.f74184Q0 = new C8420b.a();
    }

    public static void o1(e eVar, C8420b.InterfaceC1286b interfaceC1286b, C8420b.a aVar) {
        int i11;
        int i12;
        if (interfaceC1286b == null) {
            return;
        }
        if (eVar.M() == 8 || (eVar instanceof h) || (eVar instanceof C8043a)) {
            aVar.f76300e = 0;
            aVar.f76301f = 0;
            return;
        }
        e.b[] bVarArr = eVar.f74115V;
        aVar.f76296a = bVarArr[0];
        aVar.f76297b = bVarArr[1];
        aVar.f76298c = eVar.N();
        aVar.f76299d = eVar.v();
        aVar.f76304i = false;
        aVar.f76305j = 0;
        e.b bVar = aVar.f76296a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f76297b == bVar2;
        boolean z13 = z11 && eVar.f74119Z > 0.0f;
        boolean z14 = z12 && eVar.f74119Z > 0.0f;
        if (z11 && eVar.R(0) && eVar.f74156s == 0 && !z13) {
            aVar.f76296a = e.b.WRAP_CONTENT;
            if (z12 && eVar.f74158t == 0) {
                aVar.f76296a = e.b.FIXED;
            }
            z11 = false;
        }
        if (z12 && eVar.R(1) && eVar.f74158t == 0 && !z14) {
            aVar.f76297b = e.b.WRAP_CONTENT;
            if (z11 && eVar.f74156s == 0) {
                aVar.f76297b = e.b.FIXED;
            }
            z12 = false;
        }
        if (eVar.d0()) {
            aVar.f76296a = e.b.FIXED;
            z11 = false;
        }
        if (eVar.e0()) {
            aVar.f76297b = e.b.FIXED;
            z12 = false;
        }
        int[] iArr = eVar.f74160u;
        if (z13) {
            if (iArr[0] == 4) {
                aVar.f76296a = e.b.FIXED;
            } else if (!z12) {
                e.b bVar3 = aVar.f76297b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i12 = aVar.f76299d;
                } else {
                    aVar.f76296a = e.b.WRAP_CONTENT;
                    interfaceC1286b.b(eVar, aVar);
                    i12 = aVar.f76301f;
                }
                aVar.f76296a = bVar4;
                aVar.f76298c = (int) (eVar.f74119Z * i12);
            }
        }
        if (z14) {
            if (iArr[1] == 4) {
                aVar.f76297b = e.b.FIXED;
            } else if (!z11) {
                e.b bVar5 = aVar.f76296a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i11 = aVar.f76298c;
                } else {
                    aVar.f76297b = e.b.WRAP_CONTENT;
                    interfaceC1286b.b(eVar, aVar);
                    i11 = aVar.f76300e;
                }
                aVar.f76297b = bVar6;
                if (eVar.f74121a0 == -1) {
                    aVar.f76299d = (int) (i11 / eVar.f74119Z);
                } else {
                    aVar.f76299d = (int) (eVar.f74119Z * i11);
                }
            }
        }
        interfaceC1286b.b(eVar, aVar);
        eVar.T0(aVar.f76300e);
        eVar.z0(aVar.f76301f);
        eVar.y0(aVar.f76303h);
        eVar.p0(aVar.f76302g);
        aVar.f76305j = 0;
    }

    @Override // m2.e
    public final void H(StringBuilder sb2) {
        sb2.append(this.f74140k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f74117X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f74118Y);
        sb2.append("\n");
        Iterator<e> it = this.f74253v0.iterator();
        while (it.hasNext()) {
            it.next().H(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    @Override // m2.e
    public final void X0(boolean z11, boolean z12) {
        super.X0(z11, z12);
        int size = this.f74253v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f74253v0.get(i11).X0(z11, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0680 A[LOOP:6: B:130:0x067e->B:131:0x0680, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04c5  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    @Override // m2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        char c11;
        int i11;
        boolean z11;
        char c12;
        boolean z12;
        boolean z13;
        int max;
        int max2;
        ?? r13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int max3;
        int max4;
        e.b bVar;
        e.b bVar2;
        o oVar;
        o oVar2;
        int e11;
        int e12;
        int i14;
        o oVar3;
        o oVar4;
        boolean z16;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i15 = 0;
        this.f74123b0 = 0;
        this.f74125c0 = 0;
        this.f74177J0 = false;
        this.f74178K0 = false;
        int size = this.f74253v0.size();
        int max5 = Math.max(0, N());
        int max6 = Math.max(0, v());
        e.b[] bVarArr = this.f74115V;
        int i16 = 1;
        e.b bVar3 = bVarArr[1];
        e.b bVar4 = bVarArr[0];
        if (this.f74187y0 == 0 && k.b(this.f74176I0, 1)) {
            n2.h.g(this, this.f74188z0);
            for (int i17 = 0; i17 < size; i17++) {
                e eVar = this.f74253v0.get(i17);
                if (eVar.c0() && !(eVar instanceof h) && !(eVar instanceof C8043a) && !(eVar instanceof m) && !eVar.b0()) {
                    e.b t2 = eVar.t(0);
                    e.b t11 = eVar.t(1);
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (t2 != bVar5 || eVar.f74156s == 1 || t11 != bVar5 || eVar.f74158t == 1) {
                        o1(eVar, this.f74188z0, new C8420b.a());
                    }
                }
            }
        }
        char c13 = 2;
        if (size <= 2 || !((bVar4 == (bVar2 = e.b.WRAP_CONTENT) || bVar3 == bVar2) && k.b(this.f74176I0, UserVerificationMethods.USER_VERIFY_ALL))) {
            c11 = 2;
        } else {
            C8420b.InterfaceC1286b interfaceC1286b = this.f74188z0;
            ArrayList<e> arrayList3 = this.f74253v0;
            int size2 = arrayList3.size();
            int i18 = 0;
            while (true) {
                if (i18 < size2) {
                    e eVar2 = arrayList3.get(i18);
                    c11 = c13;
                    e.b[] bVarArr2 = this.f74115V;
                    int i19 = i15;
                    e.b bVar6 = bVarArr2[i19];
                    e.b bVar7 = bVarArr2[i16];
                    e.b[] bVarArr3 = eVar2.f74115V;
                    int i21 = i16;
                    if (!n2.i.b(bVar6, bVar7, bVarArr3[i19], bVarArr3[i21]) || (eVar2 instanceof g)) {
                        break;
                    }
                    i18++;
                    c13 = c11;
                    i15 = i19;
                    i16 = i21;
                } else {
                    int i22 = i15;
                    int i23 = i16;
                    c11 = c13;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    while (i15 < size2) {
                        int i24 = i15;
                        e eVar3 = arrayList3.get(i15);
                        ArrayList arrayList10 = arrayList4;
                        e.b[] bVarArr4 = this.f74115V;
                        e.b bVar8 = bVarArr4[i22];
                        ArrayList arrayList11 = arrayList5;
                        e.b bVar9 = bVarArr4[i23];
                        ArrayList arrayList12 = arrayList6;
                        e.b[] bVarArr5 = eVar3.f74115V;
                        ArrayList arrayList13 = arrayList7;
                        if (!n2.i.b(bVar8, bVar9, bVarArr5[i22], bVarArr5[i23])) {
                            o1(eVar3, interfaceC1286b, this.f74184Q0);
                        }
                        boolean z17 = eVar3 instanceof h;
                        if (z17) {
                            h hVar = (h) eVar3;
                            if (hVar.a1() == 0) {
                                arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList6.add(hVar);
                            } else {
                                arrayList6 = arrayList12;
                            }
                            z16 = z17;
                            if (hVar.a1() == i23) {
                                arrayList = arrayList10 == null ? new ArrayList() : arrayList10;
                                arrayList.add(hVar);
                            } else {
                                arrayList = arrayList10;
                            }
                        } else {
                            z16 = z17;
                            arrayList = arrayList10;
                            arrayList6 = arrayList12;
                        }
                        if (!(eVar3 instanceof j)) {
                            arrayList2 = arrayList;
                            arrayList5 = arrayList11;
                            arrayList7 = arrayList13;
                        } else if (eVar3 instanceof C8043a) {
                            C8043a c8043a = (C8043a) eVar3;
                            if (c8043a.e1() == 0) {
                                ArrayList arrayList14 = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList14.add(c8043a);
                                arrayList11 = arrayList14;
                            }
                            arrayList2 = arrayList;
                            if (c8043a.e1() == 1) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(c8043a);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            arrayList5 = arrayList11;
                        } else {
                            arrayList2 = arrayList;
                            j jVar = (j) eVar3;
                            arrayList5 = arrayList11 == null ? new ArrayList() : arrayList11;
                            arrayList5.add(jVar);
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(jVar);
                        }
                        if (eVar3.f74104K.f74090f == null && eVar3.f74106M.f74090f == null && !z16 && !(eVar3 instanceof C8043a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(eVar3);
                        }
                        if (eVar3.f74105L.f74090f == null && eVar3.f74107N.f74090f == null && eVar3.f74108O.f74090f == null && !z16 && !(eVar3 instanceof C8043a)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList15 = arrayList9;
                            arrayList15.add(eVar3);
                            arrayList9 = arrayList15;
                        }
                        i15 = i24 + 1;
                        arrayList4 = arrayList2;
                        i23 = 1;
                    }
                    ArrayList arrayList16 = arrayList4;
                    ArrayList arrayList17 = arrayList5;
                    ArrayList arrayList18 = arrayList6;
                    ArrayList arrayList19 = arrayList7;
                    ArrayList<o> arrayList20 = new ArrayList<>();
                    if (arrayList16 != null) {
                        Iterator it = arrayList16.iterator();
                        while (it.hasNext()) {
                            n2.i.a((h) it.next(), i22, arrayList20, null);
                        }
                    }
                    int i25 = i22;
                    o oVar5 = null;
                    if (arrayList17 != null) {
                        Iterator it2 = arrayList17.iterator();
                        while (it2.hasNext()) {
                            j jVar2 = (j) it2.next();
                            o a11 = n2.i.a(jVar2, i25, arrayList20, oVar5);
                            jVar2.Z0(i25, arrayList20, a11);
                            a11.b(arrayList20);
                            i25 = 0;
                            oVar5 = null;
                        }
                    }
                    d n11 = n(d.a.LEFT);
                    if (n11.d() != null) {
                        Iterator<d> it3 = n11.d().iterator();
                        while (it3.hasNext()) {
                            n2.i.a(it3.next().f74088d, 0, arrayList20, null);
                        }
                    }
                    d n12 = n(d.a.RIGHT);
                    if (n12.d() != null) {
                        Iterator<d> it4 = n12.d().iterator();
                        while (it4.hasNext()) {
                            n2.i.a(it4.next().f74088d, 0, arrayList20, null);
                        }
                    }
                    d n13 = n(d.a.CENTER);
                    if (n13.d() != null) {
                        Iterator<d> it5 = n13.d().iterator();
                        while (it5.hasNext()) {
                            n2.i.a(it5.next().f74088d, 0, arrayList20, null);
                        }
                    }
                    o oVar6 = null;
                    if (arrayList8 != null) {
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            n2.i.a((e) it6.next(), 0, arrayList20, null);
                        }
                    }
                    if (arrayList18 != null) {
                        Iterator it7 = arrayList18.iterator();
                        while (it7.hasNext()) {
                            n2.i.a((h) it7.next(), 1, arrayList20, null);
                        }
                    }
                    int i26 = 1;
                    if (arrayList19 != null) {
                        Iterator it8 = arrayList19.iterator();
                        while (it8.hasNext()) {
                            j jVar3 = (j) it8.next();
                            o a12 = n2.i.a(jVar3, i26, arrayList20, oVar6);
                            jVar3.Z0(i26, arrayList20, a12);
                            a12.b(arrayList20);
                            i26 = 1;
                            oVar6 = null;
                        }
                    }
                    d n14 = n(d.a.TOP);
                    if (n14.d() != null) {
                        Iterator<d> it9 = n14.d().iterator();
                        while (it9.hasNext()) {
                            n2.i.a(it9.next().f74088d, 1, arrayList20, null);
                        }
                    }
                    d n15 = n(d.a.BASELINE);
                    if (n15.d() != null) {
                        Iterator<d> it10 = n15.d().iterator();
                        while (it10.hasNext()) {
                            n2.i.a(it10.next().f74088d, 1, arrayList20, null);
                        }
                    }
                    d n16 = n(d.a.BOTTOM);
                    if (n16.d() != null) {
                        Iterator<d> it11 = n16.d().iterator();
                        while (it11.hasNext()) {
                            n2.i.a(it11.next().f74088d, 1, arrayList20, null);
                        }
                    }
                    d n17 = n(d.a.CENTER);
                    if (n17.d() != null) {
                        Iterator<d> it12 = n17.d().iterator();
                        while (it12.hasNext()) {
                            n2.i.a(it12.next().f74088d, 1, arrayList20, null);
                        }
                    }
                    if (arrayList9 != null) {
                        Iterator it13 = arrayList9.iterator();
                        while (it13.hasNext()) {
                            n2.i.a((e) it13.next(), 1, arrayList20, null);
                        }
                    }
                    int i27 = 0;
                    while (i27 < size2) {
                        e eVar4 = arrayList3.get(i27);
                        e.b[] bVarArr6 = eVar4.f74115V;
                        e.b bVar10 = bVarArr6[0];
                        e.b bVar11 = e.b.MATCH_CONSTRAINT;
                        if (bVar10 == bVar11 && bVarArr6[1] == bVar11) {
                            int i28 = eVar4.f74159t0;
                            int size3 = arrayList20.size();
                            int i29 = 0;
                            while (true) {
                                if (i29 >= size3) {
                                    i14 = i27;
                                    oVar3 = null;
                                    break;
                                }
                                oVar3 = arrayList20.get(i29);
                                i14 = i27;
                                if (i28 == oVar3.c()) {
                                    break;
                                }
                                i29++;
                                i27 = i14;
                            }
                            int i31 = eVar4.f74161u0;
                            int size4 = arrayList20.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 >= size4) {
                                    oVar4 = null;
                                    break;
                                }
                                oVar4 = arrayList20.get(i32);
                                if (i31 == oVar4.c()) {
                                    break;
                                } else {
                                    i32++;
                                }
                            }
                            if (oVar3 != null && oVar4 != null) {
                                oVar3.f(0, oVar4);
                                oVar4.g();
                                arrayList20.remove(oVar3);
                            }
                        } else {
                            i14 = i27;
                        }
                        i27 = i14 + 1;
                    }
                    if (arrayList20.size() > 1) {
                        if (this.f74115V[0] == e.b.WRAP_CONTENT) {
                            Iterator<o> it14 = arrayList20.iterator();
                            int i33 = 0;
                            oVar = null;
                            while (it14.hasNext()) {
                                o next = it14.next();
                                if (next.d() != 1 && (e12 = next.e(j1(), 0)) > i33) {
                                    oVar = next;
                                    i33 = e12;
                                }
                            }
                            if (oVar != null) {
                                C0(e.b.FIXED);
                                T0(i33);
                                if (this.f74115V[1] == e.b.WRAP_CONTENT) {
                                    Iterator<o> it15 = arrayList20.iterator();
                                    int i34 = 0;
                                    oVar2 = null;
                                    while (it15.hasNext()) {
                                        o next2 = it15.next();
                                        if (next2.d() != 0 && (e11 = next2.e(j1(), 1)) > i34) {
                                            oVar2 = next2;
                                            i34 = e11;
                                        }
                                    }
                                    if (oVar2 != null) {
                                        Q0(e.b.FIXED);
                                        z0(i34);
                                        if (oVar == null || oVar2 != null) {
                                            if (bVar4 == bVar2) {
                                                if (max5 >= N() || max5 <= 0) {
                                                    max5 = N();
                                                } else {
                                                    T0(max5);
                                                    this.f74177J0 = true;
                                                }
                                            }
                                            if (bVar3 == bVar2) {
                                                if (max6 >= v() || max6 <= 0) {
                                                    max6 = v();
                                                } else {
                                                    z0(max6);
                                                    this.f74178K0 = true;
                                                }
                                            }
                                            i11 = max5;
                                            z11 = true;
                                        }
                                    }
                                }
                                oVar2 = null;
                                if (oVar == null) {
                                }
                                if (bVar4 == bVar2) {
                                }
                                if (bVar3 == bVar2) {
                                }
                                i11 = max5;
                                z11 = true;
                            }
                        }
                        oVar = null;
                        if (this.f74115V[1] == e.b.WRAP_CONTENT) {
                        }
                        oVar2 = null;
                        if (oVar == null) {
                        }
                        if (bVar4 == bVar2) {
                        }
                        if (bVar3 == bVar2) {
                        }
                        i11 = max5;
                        z11 = true;
                    }
                }
            }
        }
        i11 = max5;
        z11 = false;
        boolean z18 = p1(64) || p1(UserVerificationMethods.USER_VERIFY_PATTERN);
        C6404d c6404d = this.f74169B0;
        c6404d.getClass();
        c6404d.f62461h = false;
        if (this.f74176I0 == 0 || !z18) {
            c12 = 1;
        } else {
            c12 = 1;
            c6404d.f62461h = true;
        }
        ArrayList<e> arrayList21 = this.f74253v0;
        e.b[] bVarArr7 = this.f74115V;
        e.b bVar12 = bVarArr7[0];
        e.b bVar13 = e.b.WRAP_CONTENT;
        boolean z19 = bVar12 == bVar13 || bVarArr7[c12] == bVar13;
        this.f74172E0 = 0;
        this.f74173F0 = 0;
        for (int i35 = 0; i35 < size; i35++) {
            e eVar5 = this.f74253v0.get(i35);
            if (eVar5 instanceof n) {
                ((n) eVar5).Z0();
            }
        }
        boolean p12 = p1(64);
        boolean z21 = z11;
        int i36 = 0;
        boolean z22 = true;
        while (z22) {
            int i37 = i36 + 1;
            try {
                c6404d.u();
                this.f74172E0 = 0;
                this.f74173F0 = 0;
                l(c6404d);
                for (int i38 = 0; i38 < size; i38++) {
                    this.f74253v0.get(i38).l(c6404d);
                }
                b1(c6404d);
                try {
                    WeakReference<d> weakReference = this.f74179L0;
                    if (weakReference == null || weakReference.get() == null) {
                        z12 = z19;
                    } else {
                        d dVar = this.f74179L0.get();
                        f2.h k11 = c6404d.k(this.f74105L);
                        C6404d c6404d2 = this.f74169B0;
                        z12 = z19;
                        try {
                            c6404d2.f(c6404d2.k(dVar), k11, 0, 5);
                            this.f74179L0 = null;
                        } catch (Exception e13) {
                            e = e13;
                            z22 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            boolean[] zArr = k.f74241a;
                            if (z22) {
                            }
                            if (z12) {
                                int i39 = 0;
                                int i41 = 0;
                                while (i13 < size) {
                                }
                                max3 = Math.max(this.f74129e0, i39);
                                max4 = Math.max(this.f74131f0, i41);
                                bVar = e.b.WRAP_CONTENT;
                                if (bVar4 == bVar) {
                                    T0(max3);
                                    this.f74115V[0] = bVar;
                                    z21 = true;
                                    z13 = true;
                                }
                                if (bVar3 == bVar) {
                                    z0(max4);
                                    this.f74115V[1] = bVar;
                                    z21 = true;
                                    z13 = true;
                                }
                            }
                            max = Math.max(this.f74129e0, N());
                            if (max > N()) {
                            }
                            max2 = Math.max(this.f74131f0, v());
                            if (max2 <= v()) {
                            }
                            if (!z14) {
                            }
                            z21 = z14;
                            z15 = z13;
                            i12 = 8;
                            if (i37 > i12) {
                            }
                            i36 = i37;
                            z19 = z12;
                        }
                    }
                    WeakReference<d> weakReference2 = this.f74181N0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        d dVar2 = this.f74181N0.get();
                        f2.h k12 = c6404d.k(this.f74107N);
                        C6404d c6404d3 = this.f74169B0;
                        c6404d3.f(k12, c6404d3.k(dVar2), 0, 5);
                        this.f74181N0 = null;
                    }
                    WeakReference<d> weakReference3 = this.f74180M0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        d dVar3 = this.f74180M0.get();
                        f2.h k13 = c6404d.k(this.f74104K);
                        C6404d c6404d4 = this.f74169B0;
                        c6404d4.f(c6404d4.k(dVar3), k13, 0, 5);
                        this.f74180M0 = null;
                    }
                    WeakReference<d> weakReference4 = this.f74182O0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        d dVar4 = this.f74182O0.get();
                        f2.h k14 = c6404d.k(this.f74106M);
                        try {
                            C6404d c6404d5 = this.f74169B0;
                            c6404d5.f(k14, c6404d5.k(dVar4), 0, 5);
                        } catch (Exception e14) {
                            e = e14;
                            z22 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            boolean[] zArr2 = k.f74241a;
                            if (z22) {
                            }
                            if (z12) {
                            }
                            max = Math.max(this.f74129e0, N());
                            if (max > N()) {
                            }
                            max2 = Math.max(this.f74131f0, v());
                            if (max2 <= v()) {
                            }
                            if (!z14) {
                            }
                            z21 = z14;
                            z15 = z13;
                            i12 = 8;
                            if (i37 > i12) {
                            }
                            i36 = i37;
                            z19 = z12;
                        }
                        try {
                            this.f74182O0 = null;
                        } catch (Exception e15) {
                            e = e15;
                            z22 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            boolean[] zArr22 = k.f74241a;
                            if (z22) {
                            }
                            if (z12) {
                            }
                            max = Math.max(this.f74129e0, N());
                            if (max > N()) {
                            }
                            max2 = Math.max(this.f74131f0, v());
                            if (max2 <= v()) {
                            }
                            if (!z14) {
                            }
                            z21 = z14;
                            z15 = z13;
                            i12 = 8;
                            if (i37 > i12) {
                            }
                            i36 = i37;
                            z19 = z12;
                        }
                    }
                    c6404d.q();
                    z22 = true;
                } catch (Exception e16) {
                    e = e16;
                    z12 = z19;
                }
            } catch (Exception e17) {
                e = e17;
                z12 = z19;
            }
            boolean[] zArr222 = k.f74241a;
            if (z22) {
                Y0(c6404d, p12);
                for (int i42 = 0; i42 < size; i42++) {
                    this.f74253v0.get(i42).Y0(c6404d, p12);
                }
                z13 = false;
            } else {
                zArr222[c11] = false;
                boolean p13 = p1(64);
                Y0(c6404d, p13);
                int size5 = this.f74253v0.size();
                z13 = false;
                for (int i43 = 0; i43 < size5; i43++) {
                    e eVar6 = this.f74253v0.get(i43);
                    eVar6.Y0(c6404d, p13);
                    if (eVar6.S()) {
                        z13 = true;
                    }
                }
            }
            if (z12 && i37 < 8 && zArr222[c11]) {
                int i392 = 0;
                int i412 = 0;
                for (i13 = 0; i13 < size; i13++) {
                    e eVar7 = this.f74253v0.get(i13);
                    i392 = Math.max(i392, eVar7.N() + eVar7.f74123b0);
                    i412 = Math.max(i412, eVar7.v() + eVar7.f74125c0);
                }
                max3 = Math.max(this.f74129e0, i392);
                max4 = Math.max(this.f74131f0, i412);
                bVar = e.b.WRAP_CONTENT;
                if (bVar4 == bVar && N() < max3) {
                    T0(max3);
                    this.f74115V[0] = bVar;
                    z21 = true;
                    z13 = true;
                }
                if (bVar3 == bVar && v() < max4) {
                    z0(max4);
                    this.f74115V[1] = bVar;
                    z21 = true;
                    z13 = true;
                }
            }
            max = Math.max(this.f74129e0, N());
            if (max > N()) {
                T0(max);
                this.f74115V[0] = e.b.FIXED;
                z21 = true;
                z13 = true;
            }
            max2 = Math.max(this.f74131f0, v());
            if (max2 <= v()) {
                z0(max2);
                r13 = 1;
                this.f74115V[1] = e.b.FIXED;
                z14 = true;
                z13 = true;
            } else {
                r13 = 1;
                z14 = z21;
            }
            if (!z14) {
                e.b bVar14 = this.f74115V[0];
                e.b bVar15 = e.b.WRAP_CONTENT;
                if (bVar14 == bVar15 && i11 > 0 && N() > i11) {
                    this.f74177J0 = r13;
                    this.f74115V[0] = e.b.FIXED;
                    T0(i11);
                    z14 = r13;
                    z13 = z14;
                }
                if (this.f74115V[r13] == bVar15 && max6 > 0 && v() > max6) {
                    this.f74178K0 = r13;
                    this.f74115V[r13] = e.b.FIXED;
                    z0(max6);
                    i12 = 8;
                    z15 = true;
                    z21 = true;
                    z22 = i37 > i12 ? false : z15;
                    i36 = i37;
                    z19 = z12;
                }
            }
            z21 = z14;
            z15 = z13;
            i12 = 8;
            if (i37 > i12) {
            }
            i36 = i37;
            z19 = z12;
        }
        this.f74253v0 = arrayList21;
        if (z21) {
            e.b[] bVarArr8 = this.f74115V;
            bVarArr8[0] = bVar4;
            bVarArr8[1] = bVar3;
        }
        l0(c6404d.n());
    }

    final void a1(e eVar, int i11) {
        if (i11 == 0) {
            int i12 = this.f74172E0 + 1;
            C8045c[] c8045cArr = this.f74175H0;
            if (i12 >= c8045cArr.length) {
                this.f74175H0 = (C8045c[]) Arrays.copyOf(c8045cArr, c8045cArr.length * 2);
            }
            C8045c[] c8045cArr2 = this.f74175H0;
            int i13 = this.f74172E0;
            c8045cArr2[i13] = new C8045c(eVar, 0, this.f74168A0);
            this.f74172E0 = i13 + 1;
            return;
        }
        if (i11 == 1) {
            int i14 = this.f74173F0 + 1;
            C8045c[] c8045cArr3 = this.f74174G0;
            if (i14 >= c8045cArr3.length) {
                this.f74174G0 = (C8045c[]) Arrays.copyOf(c8045cArr3, c8045cArr3.length * 2);
            }
            C8045c[] c8045cArr4 = this.f74174G0;
            int i15 = this.f74173F0;
            c8045cArr4[i15] = new C8045c(eVar, 1, this.f74168A0);
            this.f74173F0 = i15 + 1;
        }
    }

    public final void b1(C6404d c6404d) {
        f fVar;
        C6404d c6404d2;
        boolean p12 = p1(64);
        f(c6404d, p12);
        int size = this.f74253v0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f74253v0.get(i11);
            eVar.E0(0, false);
            eVar.E0(1, false);
            if (eVar instanceof C8043a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = this.f74253v0.get(i12);
                if (eVar2 instanceof C8043a) {
                    ((C8043a) eVar2).f1();
                }
            }
        }
        HashSet<e> hashSet = this.f74183P0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar3 = this.f74253v0.get(i13);
            eVar3.getClass();
            boolean z12 = eVar3 instanceof m;
            if (z12 || (eVar3 instanceof h)) {
                if (z12) {
                    hashSet.add(eVar3);
                } else {
                    eVar3.f(c6404d, p12);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                for (int i14 = 0; i14 < mVar.f74240w0; i14++) {
                    if (hashSet.contains(mVar.f74239v0[i14])) {
                        mVar.f(c6404d, p12);
                        hashSet.remove(mVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().f(c6404d, p12);
                }
                hashSet.clear();
            }
        }
        if (C6404d.f62453q) {
            HashSet<e> hashSet2 = new HashSet<>();
            for (int i15 = 0; i15 < size; i15++) {
                e eVar4 = this.f74253v0.get(i15);
                eVar4.getClass();
                if (!(eVar4 instanceof m) && !(eVar4 instanceof h)) {
                    hashSet2.add(eVar4);
                }
            }
            fVar = this;
            c6404d2 = c6404d;
            fVar.e(this, c6404d2, hashSet2, this.f74115V[0] == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, c6404d2, next);
                next.f(c6404d2, p12);
            }
        } else {
            fVar = this;
            c6404d2 = c6404d;
            for (int i16 = 0; i16 < size; i16++) {
                e eVar5 = fVar.f74253v0.get(i16);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f74115V;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.C0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    eVar5.f(c6404d2, p12);
                    if (bVar == bVar3) {
                        eVar5.C0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(bVar2);
                    }
                } else {
                    k.a(this, c6404d2, eVar5);
                    if (!(eVar5 instanceof m) && !(eVar5 instanceof h)) {
                        eVar5.f(c6404d2, p12);
                    }
                }
            }
        }
        if (fVar.f74172E0 > 0) {
            C8044b.a(this, c6404d2, null, 0);
        }
        if (fVar.f74173F0 > 0) {
            C8044b.a(this, c6404d2, null, 1);
        }
    }

    public final void c1(d dVar) {
        WeakReference<d> weakReference = this.f74182O0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f74182O0.get().e()) {
            this.f74182O0 = new WeakReference<>(dVar);
        }
    }

    public final void d1(d dVar) {
        WeakReference<d> weakReference = this.f74180M0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f74180M0.get().e()) {
            this.f74180M0 = new WeakReference<>(dVar);
        }
    }

    final void e1(d dVar) {
        WeakReference<d> weakReference = this.f74181N0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f74181N0.get().e()) {
            this.f74181N0 = new WeakReference<>(dVar);
        }
    }

    final void f1(d dVar) {
        WeakReference<d> weakReference = this.f74179L0;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f74179L0.get().e()) {
            this.f74179L0 = new WeakReference<>(dVar);
        }
    }

    public final void g1() {
        this.f74169B0.getClass();
    }

    public final C8420b.InterfaceC1286b h1() {
        return this.f74188z0;
    }

    @Override // m2.n, m2.e
    public final void i0() {
        this.f74169B0.u();
        this.f74170C0 = 0;
        this.f74171D0 = 0;
        super.i0();
    }

    public final int i1() {
        return this.f74176I0;
    }

    public final C6404d j1() {
        return this.f74169B0;
    }

    public final boolean k1() {
        return this.f74178K0;
    }

    public final boolean l1() {
        return this.f74168A0;
    }

    public final boolean m1() {
        return this.f74177J0;
    }

    public final void n1(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f74170C0 = i16;
        this.f74171D0 = i17;
        this.f74185w0.c(this, i11, i12, i13, i14, i15);
    }

    public final boolean p1(int i11) {
        return (this.f74176I0 & i11) == i11;
    }

    public final void q1(C8420b.InterfaceC1286b interfaceC1286b) {
        this.f74188z0 = interfaceC1286b;
        this.f74186x0.m(interfaceC1286b);
    }

    public final void r1(int i11) {
        this.f74176I0 = i11;
        C6404d.f62453q = p1(UserVerificationMethods.USER_VERIFY_NONE);
    }

    public final void s1(int i11) {
        this.f74187y0 = i11;
    }

    public final void t1(boolean z11) {
        this.f74168A0 = z11;
    }

    public final void u1() {
        this.f74185w0.d(this);
    }

    public f() {
        this.f74185w0 = new C8420b(this);
        this.f74186x0 = new n2.e(this);
        this.f74188z0 = null;
        this.f74168A0 = false;
        this.f74169B0 = new C6404d();
        this.f74172E0 = 0;
        this.f74173F0 = 0;
        this.f74174G0 = new C8045c[4];
        this.f74175H0 = new C8045c[4];
        this.f74176I0 = 257;
        this.f74177J0 = false;
        this.f74178K0 = false;
        this.f74179L0 = null;
        this.f74180M0 = null;
        this.f74181N0 = null;
        this.f74182O0 = null;
        this.f74183P0 = new HashSet<>();
        this.f74184Q0 = new C8420b.a();
    }
}
