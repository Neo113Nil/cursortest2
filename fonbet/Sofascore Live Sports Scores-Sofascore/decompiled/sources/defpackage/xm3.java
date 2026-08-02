package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xm3 extends wm3 {
    public int u0;
    public int y0;
    public int z0;
    public ArrayList r0 = new ArrayList();
    public ejg s0 = new ejg(this);
    public ux4 t0 = new ux4(this);
    public do1 v0 = null;
    public boolean w0 = false;
    public h8b x0 = new h8b();
    public int A0 = 0;
    public int B0 = 0;
    public ym2[] C0 = new ym2[4];
    public ym2[] D0 = new ym2[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference H0 = null;
    public WeakReference I0 = null;
    public WeakReference J0 = null;
    public WeakReference K0 = null;
    public HashSet L0 = new HashSet();
    public co1 M0 = new co1();

    public static void b0(wm3 wm3Var, do1 do1Var, co1 co1Var) {
        int i;
        int i2;
        if (do1Var == null) {
            return;
        }
        int i3 = wm3Var.h0;
        int[] iArr = wm3Var.u;
        if (i3 == 8 || (wm3Var instanceof s49) || (wm3Var instanceof b01)) {
            co1Var.e = 0;
            co1Var.f = 0;
            return;
        }
        int[] iArr2 = wm3Var.q0;
        co1Var.a = iArr2[0];
        co1Var.b = iArr2[1];
        co1Var.c = wm3Var.r();
        co1Var.d = wm3Var.l();
        co1Var.i = false;
        co1Var.j = 0;
        boolean z = co1Var.a == 3;
        boolean z2 = co1Var.b == 3;
        boolean z3 = z && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z && wm3Var.u(0) && wm3Var.s == 0 && !z3) {
            co1Var.a = 2;
            if (z2 && wm3Var.t == 0) {
                co1Var.a = 1;
            }
            z = false;
        }
        if (z2 && wm3Var.u(1) && wm3Var.t == 0 && !z4) {
            co1Var.b = 2;
            if (z && wm3Var.s == 0) {
                co1Var.b = 1;
            }
            z2 = false;
        }
        if (wm3Var.B()) {
            co1Var.a = 1;
            z = false;
        }
        if (wm3Var.C()) {
            co1Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                co1Var.a = 1;
            } else if (!z2) {
                if (co1Var.b == 1) {
                    i2 = co1Var.d;
                } else {
                    co1Var.a = 2;
                    do1Var.b(wm3Var, co1Var);
                    i2 = co1Var.f;
                }
                co1Var.a = 1;
                co1Var.c = (int) (wm3Var.X * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                co1Var.b = 1;
            } else if (!z) {
                if (co1Var.a == 1) {
                    i = co1Var.c;
                } else {
                    co1Var.b = 2;
                    do1Var.b(wm3Var, co1Var);
                    i = co1Var.e;
                }
                co1Var.b = 1;
                int i4 = wm3Var.Y;
                float f = wm3Var.X;
                if (i4 == -1) {
                    co1Var.d = (int) (i / f);
                } else {
                    co1Var.d = (int) (f * i);
                }
            }
        }
        do1Var.b(wm3Var, co1Var);
        wm3Var.S(co1Var.e);
        wm3Var.N(co1Var.f);
        wm3Var.F = co1Var.h;
        wm3Var.J(co1Var.g);
        co1Var.j = 0;
    }

    @Override // defpackage.wm3
    public final void D() {
        this.x0.t();
        this.y0 = 0;
        this.z0 = 0;
        this.r0.clear();
        super.D();
    }

    @Override // defpackage.wm3
    public final void G(ejg ejgVar) {
        super.G(ejgVar);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            ((wm3) this.r0.get(i)).G(ejgVar);
        }
    }

    @Override // defpackage.wm3
    public final void T(boolean z, boolean z2) {
        super.T(z, z2);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            ((wm3) this.r0.get(i)).T(z, z2);
        }
    }

    public final void V(wm3 wm3Var) {
        this.r0.add(wm3Var);
        xm3 xm3Var = wm3Var.U;
        if (xm3Var != null) {
            xm3Var.r0.remove(wm3Var);
            wm3Var.D();
        }
        wm3Var.U = this;
    }

    public final void W(wm3 wm3Var, int i) {
        if (i == 0) {
            int i2 = this.A0 + 1;
            ym2[] ym2VarArr = this.D0;
            if (i2 >= ym2VarArr.length) {
                ym2VarArr = (ym2[]) Arrays.copyOf(ym2VarArr, ym2VarArr.length * 2);
                this.D0 = ym2VarArr;
            }
            int i3 = this.A0;
            ym2VarArr[i3] = new ym2(wm3Var, 0, this.w0);
            this.A0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.B0 + 1;
            ym2[] ym2VarArr2 = this.C0;
            if (i4 >= ym2VarArr2.length) {
                ym2VarArr2 = (ym2[]) Arrays.copyOf(ym2VarArr2, ym2VarArr2.length * 2);
                this.C0 = ym2VarArr2;
            }
            int i5 = this.B0;
            ym2VarArr2[i5] = new ym2(wm3Var, 1, this.w0);
            this.B0 = i5 + 1;
        }
    }

    public final void X(h8b h8bVar) {
        xm3 xm3Var;
        h8b h8bVar2;
        HashSet hashSet = this.L0;
        boolean c0 = c0(64);
        c(h8bVar, c0);
        int size = this.r0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            wm3 wm3Var = (wm3) this.r0.get(i);
            boolean[] zArr = wm3Var.T;
            zArr[0] = false;
            zArr[1] = false;
            if (wm3Var instanceof b01) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                wm3 wm3Var2 = (wm3) this.r0.get(i2);
                if (wm3Var2 instanceof b01) {
                    b01 b01Var = (b01) wm3Var2;
                    for (int i3 = 0; i3 < b01Var.s0; i3++) {
                        wm3 wm3Var3 = b01Var.r0[i3];
                        if (b01Var.u0 || wm3Var3.d()) {
                            int i4 = b01Var.t0;
                            if (i4 == 0 || i4 == 1) {
                                wm3Var3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                wm3Var3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            wm3 wm3Var4 = (wm3) this.r0.get(i5);
            wm3Var4.getClass();
            boolean z2 = wm3Var4 instanceof yvk;
            if (z2 || (wm3Var4 instanceof s49)) {
                if (z2) {
                    hashSet.add(wm3Var4);
                } else {
                    wm3Var4.c(h8bVar, c0);
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
                yvk yvkVar = (yvk) ((wm3) it.next());
                for (int i6 = 0; i6 < yvkVar.s0; i6++) {
                    if (hashSet.contains(yvkVar.r0[i6])) {
                        yvkVar.c(h8bVar, c0);
                        hashSet.remove(yvkVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((wm3) it2.next()).c(h8bVar, c0);
                }
                hashSet.clear();
            }
        }
        if (h8b.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                wm3 wm3Var5 = (wm3) this.r0.get(i7);
                wm3Var5.getClass();
                if (!(wm3Var5 instanceof yvk) && !(wm3Var5 instanceof s49)) {
                    hashSet2.add(wm3Var5);
                }
            }
            xm3Var = this;
            h8bVar2 = h8bVar;
            xm3Var.b(this, h8bVar2, hashSet2, this.q0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                wm3 wm3Var6 = (wm3) it3.next();
                zm2.n(xm3Var, h8bVar2, wm3Var6);
                wm3Var6.c(h8bVar2, c0);
            }
        } else {
            xm3Var = this;
            h8bVar2 = h8bVar;
            for (int i8 = 0; i8 < size; i8++) {
                wm3 wm3Var7 = (wm3) xm3Var.r0.get(i8);
                if (wm3Var7 instanceof xm3) {
                    int[] iArr = wm3Var7.q0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        wm3Var7.O(1);
                    }
                    if (i10 == 2) {
                        wm3Var7.Q(1);
                    }
                    wm3Var7.c(h8bVar2, c0);
                    if (i9 == 2) {
                        wm3Var7.O(i9);
                    }
                    if (i10 == 2) {
                        wm3Var7.Q(i10);
                    }
                } else {
                    zm2.n(xm3Var, h8bVar2, wm3Var7);
                    if (!(wm3Var7 instanceof yvk) && !(wm3Var7 instanceof s49)) {
                        wm3Var7.c(h8bVar2, c0);
                    }
                }
            }
        }
        if (xm3Var.A0 > 0) {
            xw3.r(xm3Var, h8bVar2, null, 0);
        }
        if (xm3Var.B0 > 0) {
            xw3.r(xm3Var, h8bVar2, null, 1);
        }
    }

    public final boolean Y(int i, boolean z) {
        boolean z2;
        ux4 ux4Var = this.t0;
        ArrayList arrayList = (ArrayList) ux4Var.f;
        xm3 xm3Var = (xm3) ux4Var.d;
        boolean z3 = false;
        int k = xm3Var.k(0);
        int k2 = xm3Var.k(1);
        int s = xm3Var.s();
        int t = xm3Var.t();
        if (z && (k == 2 || k2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v7l v7lVar = (v7l) it.next();
                if (v7lVar.f == i && !v7lVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && k == 2) {
                    xm3Var.O(1);
                    xm3Var.S(ux4Var.e(xm3Var, 0));
                    xm3Var.d.e.d(xm3Var.r());
                }
            } else if (z && k2 == 2) {
                xm3Var.Q(1);
                xm3Var.N(ux4Var.e(xm3Var, 1));
                xm3Var.e.e.d(xm3Var.l());
            }
        }
        int[] iArr = xm3Var.q0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int r = xm3Var.r() + s;
                xm3Var.d.i.d(r);
                xm3Var.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int l = xm3Var.l() + t;
                xm3Var.e.i.d(l);
                xm3Var.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        ux4Var.u();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            v7l v7lVar2 = (v7l) it2.next();
            if (v7lVar2.f == i && (v7lVar2.b != xm3Var || v7lVar2.g)) {
                v7lVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            v7l v7lVar3 = (v7l) it3.next();
            if (v7lVar3.f == i && (z2 || v7lVar3.b != xm3Var)) {
                if (!v7lVar3.h.j) {
                    break;
                }
                if (!v7lVar3.i.j) {
                    break;
                }
                if (!(v7lVar3 instanceof bn2) && !v7lVar3.e.j) {
                    break;
                }
            }
        }
        xm3Var.O(k);
        xm3Var.Q(k2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0649 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0826 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0833 A[LOOP:33: B:541:0x0831->B:542:0x0833, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x08fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x080c  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean[] zArr;
        Object[] objArr;
        Object obj;
        int i;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        int max;
        ?? r4;
        boolean z4;
        int max2;
        boolean z5;
        int i2;
        int i3;
        int max3;
        int max4;
        k7l k7lVar;
        k7l k7lVar2;
        int b;
        int i4;
        ArrayList arrayList;
        k7l k7lVar3;
        k7l k7lVar4;
        boolean z6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        do1 do1Var;
        ArrayList arrayList4;
        int i5;
        nl3 nl3Var;
        boolean[] zArr2 = zm2.h;
        h8b h8bVar = this.x0;
        this.Z = 0;
        this.a0 = 0;
        this.F0 = false;
        this.G0 = false;
        int size = this.r0.size();
        int max5 = Math.max(0, r());
        int max6 = Math.max(0, l());
        int[] iArr = this.q0;
        int i6 = iArr[1];
        int i7 = iArr[0];
        int i8 = this.u0;
        nl3 nl3Var2 = this.K;
        nl3 nl3Var3 = this.J;
        if (i8 == 0 && zm2.u(this.E0, 1)) {
            do1 do1Var2 = this.v0;
            int i9 = iArr[0];
            int i10 = iArr[1];
            F();
            ArrayList arrayList5 = this.r0;
            int size2 = arrayList5.size();
            zArr = zArr2;
            for (int i11 = 0; i11 < size2; i11++) {
                ((wm3) arrayList5.get(i11)).F();
            }
            boolean z7 = this.w0;
            objArr = iArr;
            if (i9 == 1) {
                L(0, r());
            } else {
                nl3Var3.l(0);
                this.Z = 0;
            }
            int i12 = 0;
            boolean z8 = false;
            boolean z9 = false;
            while (i12 < size2) {
                int i13 = i12;
                wm3 wm3Var = (wm3) arrayList5.get(i12);
                boolean z10 = z8;
                if (wm3Var instanceof s49) {
                    s49 s49Var = (s49) wm3Var;
                    nl3Var = nl3Var3;
                    if (s49Var.v0 == 1) {
                        int i14 = s49Var.s0;
                        if (i14 != -1) {
                            s49Var.V(i14);
                        } else if (s49Var.t0 != -1 && B()) {
                            s49Var.V(r() - s49Var.t0);
                        } else if (B()) {
                            s49Var.V((int) ((s49Var.r0 * r()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else {
                    nl3Var = nl3Var3;
                    if ((wm3Var instanceof b01) && ((b01) wm3Var).Z() == 0) {
                        z8 = z10;
                        z9 = true;
                        i12 = i13 + 1;
                        nl3Var3 = nl3Var;
                    }
                }
                z8 = z10;
                i12 = i13 + 1;
                nl3Var3 = nl3Var;
            }
            obj = nl3Var3;
            if (z8) {
                for (int i15 = 0; i15 < size2; i15 = i5 + 1) {
                    wm3 wm3Var2 = (wm3) arrayList5.get(i15);
                    if (wm3Var2 instanceof s49) {
                        s49 s49Var2 = (s49) wm3Var2;
                        i5 = i15;
                        if (s49Var2.v0 == 1) {
                            zm2.v(0, do1Var2, s49Var2, z7);
                        }
                    } else {
                        i5 = i15;
                    }
                }
            }
            zm2.v(0, do1Var2, this, z7);
            if (z9) {
                for (int i16 = 0; i16 < size2; i16++) {
                    wm3 wm3Var3 = (wm3) arrayList5.get(i16);
                    if (wm3Var3 instanceof b01) {
                        b01 b01Var = (b01) wm3Var3;
                        if (b01Var.Z() == 0 && b01Var.Y()) {
                            zm2.v(1, do1Var2, b01Var, z7);
                        }
                    }
                }
            }
            if (i10 == 1) {
                M(0, l());
            } else {
                nl3Var2.l(0);
                this.a0 = 0;
            }
            int i17 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i17 < size2) {
                wm3 wm3Var4 = (wm3) arrayList5.get(i17);
                int i18 = i17;
                if (wm3Var4 instanceof s49) {
                    s49 s49Var3 = (s49) wm3Var4;
                    if (s49Var3.v0 == 0) {
                        int i19 = s49Var3.s0;
                        if (i19 != -1) {
                            s49Var3.V(i19);
                        } else if (s49Var3.t0 != -1 && C()) {
                            s49Var3.V(l() - s49Var3.t0);
                        } else if (C()) {
                            s49Var3.V((int) ((s49Var3.r0 * l()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((wm3Var4 instanceof b01) && ((b01) wm3Var4).Z() == 1) {
                    z12 = true;
                }
                i17 = i18 + 1;
            }
            if (z11) {
                for (int i20 = 0; i20 < size2; i20++) {
                    wm3 wm3Var5 = (wm3) arrayList5.get(i20);
                    if (wm3Var5 instanceof s49) {
                        s49 s49Var4 = (s49) wm3Var5;
                        if (s49Var4.v0 == 0) {
                            zm2.N(1, do1Var2, s49Var4);
                        }
                    }
                }
            }
            zm2.N(0, do1Var2, this);
            if (z12) {
                for (int i21 = 0; i21 < size2; i21++) {
                    wm3 wm3Var6 = (wm3) arrayList5.get(i21);
                    if (wm3Var6 instanceof b01) {
                        b01 b01Var2 = (b01) wm3Var6;
                        if (b01Var2.Z() == 1 && b01Var2.Y()) {
                            zm2.N(1, do1Var2, b01Var2);
                        }
                    }
                }
            }
            for (int i22 = 0; i22 < size2; i22++) {
                wm3 wm3Var7 = (wm3) arrayList5.get(i22);
                if (wm3Var7.A() && zm2.m(wm3Var7)) {
                    b0(wm3Var7, do1Var2, zm2.g);
                    if (!(wm3Var7 instanceof s49)) {
                        zm2.v(0, do1Var2, wm3Var7, z7);
                        zm2.N(0, do1Var2, wm3Var7);
                    } else if (((s49) wm3Var7).v0 == 0) {
                        zm2.N(0, do1Var2, wm3Var7);
                    } else {
                        zm2.v(0, do1Var2, wm3Var7, z7);
                    }
                }
            }
            for (int i23 = 0; i23 < size; i23++) {
                wm3 wm3Var8 = (wm3) this.r0.get(i23);
                if (wm3Var8.A() && !(wm3Var8 instanceof s49) && !(wm3Var8 instanceof b01) && !(wm3Var8 instanceof yvk) && !wm3Var8.G) {
                    int k = wm3Var8.k(0);
                    int k2 = wm3Var8.k(1);
                    if (k != 3 || wm3Var8.s == 1 || k2 != 3 || wm3Var8.t == 1) {
                        b0(wm3Var8, this.v0, new co1());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
            obj = nl3Var3;
        }
        if (size > 2 && ((i7 == 2 || i6 == 2) && zm2.u(this.E0, 1024))) {
            do1 do1Var3 = this.v0;
            ArrayList arrayList6 = this.r0;
            int size3 = arrayList6.size();
            int i24 = 0;
            while (true) {
                if (i24 < size3) {
                    wm3 wm3Var9 = (wm3) arrayList6.get(i24);
                    char c2 = objArr[0];
                    char c3 = objArr[1];
                    int[] iArr2 = wm3Var9.q0;
                    int i25 = i24;
                    if (!n9e.O(c2, c3, iArr2[0], iArr2[1]) || (wm3Var9 instanceof a98)) {
                        break;
                    } else {
                        i24 = i25 + 1;
                    }
                } else {
                    int i26 = 0;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    while (i26 < size3) {
                        int i27 = i26;
                        wm3 wm3Var10 = (wm3) arrayList6.get(i26);
                        ArrayList arrayList13 = arrayList7;
                        char c4 = objArr[0];
                        ArrayList arrayList14 = arrayList8;
                        char c5 = objArr[1];
                        ArrayList arrayList15 = arrayList9;
                        int[] iArr3 = wm3Var10.q0;
                        ArrayList arrayList16 = arrayList10;
                        if (!n9e.O(c4, c5, iArr3[0], iArr3[1])) {
                            b0(wm3Var10, do1Var3, this.M0);
                        }
                        boolean z13 = wm3Var10 instanceof s49;
                        if (z13) {
                            s49 s49Var5 = (s49) wm3Var10;
                            if (s49Var5.v0 == 0) {
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(s49Var5);
                            } else {
                                arrayList9 = arrayList15;
                            }
                            z6 = z13;
                            if (s49Var5.v0 == 1) {
                                arrayList2 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList2.add(s49Var5);
                            } else {
                                arrayList2 = arrayList13;
                            }
                        } else {
                            z6 = z13;
                            arrayList2 = arrayList13;
                            arrayList9 = arrayList15;
                        }
                        if (!(wm3Var10 instanceof t99)) {
                            arrayList3 = arrayList2;
                            do1Var = do1Var3;
                            arrayList8 = arrayList14;
                        } else if (wm3Var10 instanceof b01) {
                            b01 b01Var3 = (b01) wm3Var10;
                            if (b01Var3.Z() == 0) {
                                arrayList4 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList4.add(b01Var3);
                            } else {
                                arrayList4 = arrayList14;
                            }
                            arrayList3 = arrayList2;
                            do1Var = do1Var3;
                            if (b01Var3.Z() == 1) {
                                ArrayList arrayList17 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList17.add(b01Var3);
                                arrayList16 = arrayList17;
                            }
                            arrayList8 = arrayList4;
                        } else {
                            arrayList3 = arrayList2;
                            do1Var = do1Var3;
                            t99 t99Var = (t99) wm3Var10;
                            arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                            arrayList8.add(t99Var);
                            arrayList10 = arrayList16 == null ? new ArrayList() : arrayList16;
                            arrayList10.add(t99Var);
                            if (wm3Var10.J.f == null && wm3Var10.L.f == null && !z6 && !(wm3Var10 instanceof b01)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(wm3Var10);
                                arrayList11 = arrayList18;
                            }
                            if (wm3Var10.K.f == null && wm3Var10.M.f == null && wm3Var10.N.f == null && !z6 && !(wm3Var10 instanceof b01)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(wm3Var10);
                                arrayList12 = arrayList19;
                            }
                            i26 = i27 + 1;
                            arrayList7 = arrayList3;
                            do1Var3 = do1Var;
                        }
                        arrayList10 = arrayList16;
                        if (wm3Var10.J.f == null) {
                            if (arrayList11 == null) {
                            }
                            ArrayList arrayList182 = arrayList11;
                            arrayList182.add(wm3Var10);
                            arrayList11 = arrayList182;
                        }
                        if (wm3Var10.K.f == null) {
                            if (arrayList12 == null) {
                            }
                            ArrayList arrayList192 = arrayList12;
                            arrayList192.add(wm3Var10);
                            arrayList12 = arrayList192;
                        }
                        i26 = i27 + 1;
                        arrayList7 = arrayList3;
                        do1Var3 = do1Var;
                    }
                    ArrayList arrayList20 = arrayList7;
                    ArrayList arrayList21 = arrayList8;
                    ArrayList arrayList22 = arrayList9;
                    ArrayList arrayList23 = arrayList10;
                    ArrayList arrayList24 = new ArrayList();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            n9e.v((s49) it.next(), 0, arrayList24, null);
                        }
                    }
                    k7l k7lVar5 = null;
                    int i28 = 0;
                    if (arrayList21 != null) {
                        Iterator it2 = arrayList21.iterator();
                        while (it2.hasNext()) {
                            t99 t99Var2 = (t99) it2.next();
                            k7l v = n9e.v(t99Var2, i28, arrayList24, k7lVar5);
                            t99Var2.W(i28, v, arrayList24);
                            v.a(arrayList24);
                            k7lVar5 = null;
                            i28 = 0;
                        }
                    }
                    HashSet hashSet = j(2).a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            n9e.v(((nl3) it3.next()).d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet2 = j(4).a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            n9e.v(((nl3) it4.next()).d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet3 = j(7).a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            n9e.v(((nl3) it5.next()).d, 0, arrayList24, null);
                        }
                    }
                    k7l k7lVar6 = null;
                    if (arrayList11 != null) {
                        Iterator it6 = arrayList11.iterator();
                        while (it6.hasNext()) {
                            n9e.v((wm3) it6.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it7 = arrayList22.iterator();
                        while (it7.hasNext()) {
                            n9e.v((s49) it7.next(), 1, arrayList24, null);
                        }
                    }
                    int i29 = 1;
                    if (arrayList23 != null) {
                        Iterator it8 = arrayList23.iterator();
                        while (it8.hasNext()) {
                            t99 t99Var3 = (t99) it8.next();
                            k7l v2 = n9e.v(t99Var3, i29, arrayList24, k7lVar6);
                            t99Var3.W(i29, v2, arrayList24);
                            v2.a(arrayList24);
                            k7lVar6 = null;
                            i29 = 1;
                        }
                    }
                    HashSet hashSet4 = j(3).a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            n9e.v(((nl3) it9.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet5 = j(6).a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            n9e.v(((nl3) it10.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet6 = j(5).a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            n9e.v(((nl3) it11.next()).d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet7 = j(7).a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            n9e.v(((nl3) it12.next()).d, 1, arrayList24, null);
                        }
                    }
                    boolean z14 = true;
                    if (arrayList12 != null) {
                        Iterator it13 = arrayList12.iterator();
                        while (it13.hasNext()) {
                            n9e.v((wm3) it13.next(), 1, arrayList24, null);
                        }
                    }
                    int i30 = 0;
                    while (i30 < size3) {
                        wm3 wm3Var11 = (wm3) arrayList6.get(i30);
                        int[] iArr4 = wm3Var11.q0;
                        boolean z15 = z14;
                        if (iArr4[0] == 3 && iArr4[z15 ? 1 : 0] == 3) {
                            int i31 = wm3Var11.o0;
                            int size4 = arrayList24.size();
                            int i32 = 0;
                            while (true) {
                                if (i32 >= size4) {
                                    i4 = i30;
                                    arrayList = arrayList6;
                                    k7lVar3 = null;
                                    break;
                                }
                                i4 = i30;
                                k7lVar3 = (k7l) arrayList24.get(i32);
                                arrayList = arrayList6;
                                if (i31 == k7lVar3.b) {
                                    break;
                                }
                                i32++;
                                arrayList6 = arrayList;
                                i30 = i4;
                            }
                            int i33 = wm3Var11.p0;
                            int size5 = arrayList24.size();
                            int i34 = 0;
                            while (true) {
                                if (i34 >= size5) {
                                    k7lVar4 = null;
                                    break;
                                }
                                k7lVar4 = (k7l) arrayList24.get(i34);
                                if (i33 == k7lVar4.b) {
                                    break;
                                } else {
                                    i34++;
                                }
                            }
                            if (k7lVar3 != null && k7lVar4 != null) {
                                k7lVar3.c(0, k7lVar4);
                                k7lVar4.c = 2;
                                arrayList24.remove(k7lVar3);
                            }
                        } else {
                            i4 = i30;
                            arrayList = arrayList6;
                        }
                        i30 = i4 + 1;
                        arrayList6 = arrayList;
                        z14 = true;
                    }
                    if (arrayList24.size() > 1) {
                        int i35 = 0;
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList24.iterator();
                            int i36 = 0;
                            k7lVar = null;
                            while (it14.hasNext()) {
                                k7l k7lVar7 = (k7l) it14.next();
                                if (k7lVar7.c != 1) {
                                    int b2 = k7lVar7.b(h8bVar, i35);
                                    if (b2 > i36) {
                                        k7lVar = k7lVar7;
                                        i36 = b2;
                                    }
                                    i35 = 0;
                                }
                            }
                            if (k7lVar != null) {
                                O(1);
                                S(i36);
                                if (objArr[1] == 2) {
                                    Iterator it15 = arrayList24.iterator();
                                    int i37 = 0;
                                    k7lVar2 = null;
                                    while (it15.hasNext()) {
                                        k7l k7lVar8 = (k7l) it15.next();
                                        if (k7lVar8.c != 0 && (b = k7lVar8.b(h8bVar, 1)) > i37) {
                                            k7lVar2 = k7lVar8;
                                            i37 = b;
                                        }
                                    }
                                    if (k7lVar2 != null) {
                                        Q(1);
                                        N(i37);
                                        if (k7lVar == null || k7lVar2 != null) {
                                            if (i7 == 2) {
                                                if (max5 >= r() || max5 <= 0) {
                                                    max5 = r();
                                                } else {
                                                    S(max5);
                                                    this.F0 = true;
                                                }
                                            }
                                            if (i6 == 2) {
                                                if (max6 >= l() || max6 <= 0) {
                                                    max6 = l();
                                                } else {
                                                    N(max6);
                                                    this.G0 = true;
                                                }
                                            }
                                            i = max5;
                                            z = true;
                                        }
                                    }
                                }
                                k7lVar2 = null;
                                if (k7lVar == null) {
                                }
                                if (i7 == 2) {
                                }
                                if (i6 == 2) {
                                }
                                i = max5;
                                z = true;
                            }
                        }
                        k7lVar = null;
                        if (objArr[1] == 2) {
                        }
                        k7lVar2 = null;
                        if (k7lVar == null) {
                        }
                        if (i7 == 2) {
                        }
                        if (i6 == 2) {
                        }
                        i = max5;
                        z = true;
                    }
                }
            }
        }
        i = max5;
        z = false;
        boolean z16 = c0(64) || c0(128);
        h8bVar.getClass();
        h8bVar.h = false;
        if (this.E0 == 0 || !z16) {
            c = 1;
        } else {
            c = 1;
            h8bVar.h = true;
        }
        ArrayList arrayList25 = this.r0;
        boolean z17 = objArr[0] == 2 || objArr[c] == 2;
        this.A0 = 0;
        this.B0 = 0;
        for (int i38 = 0; i38 < size; i38++) {
            wm3 wm3Var12 = (wm3) this.r0.get(i38);
            if (wm3Var12 instanceof xm3) {
                ((xm3) wm3Var12).Z();
            }
        }
        boolean c0 = c0(64);
        boolean z18 = z;
        int i39 = 0;
        boolean z19 = true;
        while (z19) {
            int i40 = i39 + 1;
            try {
                h8bVar.t();
                this.A0 = 0;
                this.B0 = 0;
                h(h8bVar);
                for (int i41 = 0; i41 < size; i41++) {
                    ((wm3) this.r0.get(i41)).h(h8bVar);
                }
                X(h8bVar);
                try {
                    WeakReference weakReference = this.H0;
                    if (weakReference == null || weakReference.get() == null) {
                        z2 = z17;
                    } else {
                        z2 = z17;
                        try {
                            h8bVar.f(h8bVar.k((nl3) this.H0.get()), h8bVar.k(nl3Var2), 0, 5);
                            this.H0 = null;
                        } catch (Exception e) {
                            e = e;
                            z19 = true;
                            e.printStackTrace();
                            z3 = z18;
                            System.out.println("EXCEPTION : " + e);
                            if (z19) {
                            }
                            if (z2) {
                            }
                            max = Math.max(this.c0, r());
                            if (max > r()) {
                            }
                            max2 = Math.max(this.d0, l());
                            if (max2 > l()) {
                            }
                            if (!z5) {
                            }
                            i2 = 8;
                            if (i40 <= i2) {
                            }
                            z18 = z5;
                            i39 = i40;
                            z17 = z2;
                        }
                    }
                    WeakReference weakReference2 = this.J0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        h8bVar.f(h8bVar.k(this.M), h8bVar.k((nl3) this.J0.get()), 0, 5);
                        this.J0 = null;
                    }
                    WeakReference weakReference3 = this.I0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        Object obj2 = obj;
                        try {
                            obj = obj2;
                            h8bVar.f(h8bVar.k((nl3) this.I0.get()), h8bVar.k(obj2), 0, 5);
                            this.I0 = null;
                        } catch (Exception e2) {
                            e = e2;
                            obj = obj2;
                            z19 = true;
                            e.printStackTrace();
                            z3 = z18;
                            System.out.println("EXCEPTION : " + e);
                            if (z19) {
                            }
                            if (z2) {
                                int i42 = 0;
                                int i43 = 0;
                                while (i3 < size) {
                                }
                                max3 = Math.max(this.c0, i43);
                                max4 = Math.max(this.d0, i42);
                                if (i7 == 2) {
                                    S(max3);
                                    objArr[0] = 2;
                                    z19 = true;
                                    z3 = true;
                                }
                                if (i6 == 2) {
                                    N(max4);
                                    objArr[1] = 2;
                                    z19 = true;
                                    z3 = true;
                                }
                            }
                            max = Math.max(this.c0, r());
                            if (max > r()) {
                            }
                            max2 = Math.max(this.d0, l());
                            if (max2 > l()) {
                            }
                            if (!z5) {
                            }
                            i2 = 8;
                            if (i40 <= i2) {
                            }
                            z18 = z5;
                            i39 = i40;
                            z17 = z2;
                        }
                    }
                    WeakReference weakReference4 = this.K0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        try {
                        } catch (Exception e3) {
                            e = e3;
                        }
                        try {
                            h8bVar.f(h8bVar.k(this.L), h8bVar.k((nl3) this.K0.get()), 0, 5);
                        } catch (Exception e4) {
                            e = e4;
                            z19 = true;
                            e.printStackTrace();
                            z3 = z18;
                            System.out.println("EXCEPTION : " + e);
                            if (z19) {
                            }
                            if (z2) {
                            }
                            max = Math.max(this.c0, r());
                            if (max > r()) {
                            }
                            max2 = Math.max(this.d0, l());
                            if (max2 > l()) {
                            }
                            if (!z5) {
                            }
                            i2 = 8;
                            if (i40 <= i2) {
                            }
                            z18 = z5;
                            i39 = i40;
                            z17 = z2;
                        }
                        try {
                            this.K0 = null;
                        } catch (Exception e5) {
                            e = e5;
                            z19 = true;
                            e.printStackTrace();
                            z3 = z18;
                            System.out.println("EXCEPTION : " + e);
                            if (z19) {
                            }
                            if (z2) {
                            }
                            max = Math.max(this.c0, r());
                            if (max > r()) {
                            }
                            max2 = Math.max(this.d0, l());
                            if (max2 > l()) {
                            }
                            if (!z5) {
                            }
                            i2 = 8;
                            if (i40 <= i2) {
                            }
                            z18 = z5;
                            i39 = i40;
                            z17 = z2;
                        }
                    }
                    h8bVar.p();
                    z3 = z18;
                    z19 = true;
                } catch (Exception e6) {
                    e = e6;
                    z2 = z17;
                }
            } catch (Exception e7) {
                e = e7;
                z2 = z17;
            }
            if (z19) {
                zArr[2] = false;
                boolean c02 = c0(64);
                U(h8bVar, c02);
                int size6 = this.r0.size();
                int i44 = 0;
                z19 = false;
                while (i44 < size6) {
                    wm3 wm3Var13 = (wm3) this.r0.get(i44);
                    wm3Var13.U(h8bVar, c02);
                    boolean z20 = c02;
                    int i45 = size6;
                    if (wm3Var13.h != -1 || wm3Var13.i != -1) {
                        z19 = true;
                    }
                    i44++;
                    c02 = z20;
                    size6 = i45;
                }
            } else {
                U(h8bVar, c0);
                for (int i46 = 0; i46 < size; i46++) {
                    ((wm3) this.r0.get(i46)).U(h8bVar, c0);
                }
                z19 = false;
            }
            if (z2 && i40 < 8 && zArr[2]) {
                int i422 = 0;
                int i432 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    wm3 wm3Var14 = (wm3) this.r0.get(i3);
                    i432 = Math.max(i432, wm3Var14.r() + wm3Var14.Z);
                    i422 = Math.max(i422, wm3Var14.l() + wm3Var14.a0);
                }
                max3 = Math.max(this.c0, i432);
                max4 = Math.max(this.d0, i422);
                if (i7 == 2 && r() < max3) {
                    S(max3);
                    objArr[0] = 2;
                    z19 = true;
                    z3 = true;
                }
                if (i6 == 2 && l() < max4) {
                    N(max4);
                    objArr[1] = 2;
                    z19 = true;
                    z3 = true;
                }
            }
            max = Math.max(this.c0, r());
            if (max > r()) {
                S(max);
                r4 = 1;
                objArr[0] = 1;
                z19 = true;
                z4 = true;
            } else {
                r4 = 1;
                z4 = z3;
            }
            max2 = Math.max(this.d0, l());
            if (max2 > l()) {
                N(max2);
                objArr[r4] = r4;
                z5 = r4;
                z19 = z5;
            } else {
                z5 = z4;
            }
            if (!z5) {
                if (objArr[0] == 2 && i > 0 && r() > i) {
                    this.F0 = r4;
                    objArr[0] = r4;
                    S(i);
                    z5 = r4;
                    z19 = z5;
                }
                if (objArr[r4] == 2 && max6 > 0 && l() > max6) {
                    this.G0 = r4;
                    objArr[r4] = r4;
                    N(max6);
                    z5 = true;
                    i2 = 8;
                    z19 = true;
                    if (i40 <= i2) {
                        z19 = false;
                    }
                    z18 = z5;
                    i39 = i40;
                    z17 = z2;
                }
            }
            i2 = 8;
            if (i40 <= i2) {
            }
            z18 = z5;
            i39 = i40;
            z17 = z2;
        }
        boolean z21 = z18;
        this.r0 = arrayList25;
        if (z21) {
            objArr[0] = i7;
            objArr[1] = i6;
        }
        G(h8bVar.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public final void a0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ?? r17;
        boolean z;
        boolean z2;
        do1 do1Var;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        ArrayList arrayList;
        do1 do1Var2;
        int i12;
        int i13;
        do1 do1Var3;
        boolean z4;
        int i14;
        mf9 mf9Var;
        uok uokVar;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c;
        boolean z6;
        this.y0 = i6;
        this.z0 = i7;
        ejg ejgVar = this.s0;
        xm3 xm3Var = (xm3) ejgVar.d;
        ArrayList arrayList2 = (ArrayList) ejgVar.c;
        do1 do1Var4 = this.v0;
        ux4 ux4Var = this.t0;
        int size = this.r0.size();
        int r = r();
        int l = l();
        boolean u = zm2.u(i, 128);
        boolean z7 = u || zm2.u(i, 64);
        boolean z8 = false;
        if (z7) {
            int i20 = 0;
            while (i20 < size) {
                r17 = 1;
                wm3 wm3Var = (wm3) this.r0.get(i20);
                boolean z9 = z7;
                int[] iArr = wm3Var.q0;
                boolean z10 = (iArr[0] == 3) && (iArr[1] == 3) && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if ((wm3Var.y() && z10) || ((wm3Var.z() && z10) || (wm3Var instanceof yvk) || wm3Var.y() || wm3Var.z())) {
                    z = false;
                    break;
                } else {
                    i20++;
                    z7 = z9;
                }
            }
        }
        r17 = 1;
        z = z7;
        boolean z11 = z & (((i2 == 1073741824 && i4 == 1073741824) || u) ? r17 : false);
        if (z11) {
            int[] iArr2 = this.D;
            int min = Math.min(iArr2[0], i3);
            int min2 = Math.min(iArr2[r17], i5);
            int i21 = 1073741824;
            if (i2 == 1073741824) {
                if (r() != min) {
                    S(min);
                    z5 = r17;
                    ux4Var.b = z5;
                } else {
                    z5 = r17;
                }
                i21 = 1073741824;
            } else {
                z5 = r17;
            }
            if (i4 == i21) {
                if (l() != min2) {
                    N(min2);
                    ux4Var.b = z5;
                }
                i21 = 1073741824;
            }
            if (i2 == i21 && i4 == i21) {
                ArrayList arrayList3 = (ArrayList) ux4Var.f;
                xm3 xm3Var2 = (xm3) ux4Var.d;
                if (ux4Var.b || ux4Var.c) {
                    Iterator it = xm3Var2.r0.iterator();
                    while (it.hasNext()) {
                        boolean z12 = z11;
                        wm3 wm3Var2 = (wm3) it.next();
                        wm3Var2.i();
                        wm3Var2.a = z8;
                        wm3Var2.d.n();
                        wm3Var2.e.m();
                        size = size;
                        z11 = z12;
                        z8 = false;
                    }
                    z2 = z11;
                    i8 = size;
                    xm3Var2.i();
                    i17 = 0;
                    xm3Var2.a = false;
                    xm3Var2.d.n();
                    xm3Var2.e.m();
                    ux4Var.c = false;
                } else {
                    z2 = z11;
                    i8 = size;
                    i17 = 0;
                }
                ux4Var.b((xm3) ux4Var.e);
                xm3Var2.Z = i17;
                int[] iArr3 = xm3Var2.q0;
                xm3Var2.a0 = i17;
                int k = xm3Var2.k(i17);
                int k2 = xm3Var2.k(1);
                if (ux4Var.b) {
                    ux4Var.c();
                }
                int s = xm3Var2.s();
                int t = xm3Var2.t();
                do1Var = do1Var4;
                xm3Var2.d.h.d(s);
                xm3Var2.e.h.d(t);
                ux4Var.u();
                if (k == 2 || k2 == 2) {
                    if (u) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (!((v7l) it2.next()).k()) {
                                u = false;
                                break;
                            }
                        }
                    }
                    if (u && k == 2) {
                        xm3Var2.O(1);
                        i18 = s;
                        xm3Var2.S(ux4Var.e(xm3Var2, 0));
                        xm3Var2.d.e.d(xm3Var2.r());
                    } else {
                        i18 = s;
                    }
                    if (u && k2 == 2) {
                        i19 = 1;
                        xm3Var2.Q(1);
                        xm3Var2.N(ux4Var.e(xm3Var2, 1));
                        xm3Var2.e.e.d(xm3Var2.l());
                    } else {
                        i19 = 1;
                    }
                    c = 0;
                } else {
                    i18 = s;
                    c = 0;
                    i19 = 1;
                }
                int i22 = iArr3[c];
                if (i22 == i19 || i22 == 4) {
                    int r2 = xm3Var2.r() + i18;
                    xm3Var2.d.i.d(r2);
                    xm3Var2.d.e.d(r2 - i18);
                    ux4Var.u();
                    int i23 = iArr3[1];
                    if (i23 == 1 || i23 == 4) {
                        int l2 = xm3Var2.l() + t;
                        xm3Var2.e.i.d(l2);
                        xm3Var2.e.e.d(l2 - t);
                    }
                    ux4Var.u();
                    z6 = true;
                } else {
                    z6 = false;
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    v7l v7lVar = (v7l) it3.next();
                    if (v7lVar.b != xm3Var2 || v7lVar.g) {
                        v7lVar.e();
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    v7l v7lVar2 = (v7l) it4.next();
                    if (z6 || v7lVar2.b != xm3Var2) {
                        if (!v7lVar2.h.j || ((!v7lVar2.i.j && !(v7lVar2 instanceof t49)) || (!v7lVar2.e.j && !(v7lVar2 instanceof bn2) && !(v7lVar2 instanceof t49)))) {
                            z3 = false;
                            break;
                        }
                    }
                }
                z3 = true;
                xm3Var2.O(k);
                xm3Var2.Q(k2);
                i9 = 2;
                i16 = 1073741824;
            } else {
                z2 = z11;
                do1Var = do1Var4;
                i8 = size;
                xm3 xm3Var3 = (xm3) ux4Var.d;
                if (ux4Var.b) {
                    Iterator it5 = xm3Var3.r0.iterator();
                    while (it5.hasNext()) {
                        wm3 wm3Var3 = (wm3) it5.next();
                        wm3Var3.i();
                        wm3Var3.a = false;
                        mf9 mf9Var2 = wm3Var3.d;
                        mf9Var2.e.j = false;
                        mf9Var2.g = false;
                        mf9Var2.n();
                        uok uokVar2 = wm3Var3.e;
                        uokVar2.e.j = false;
                        uokVar2.g = false;
                        uokVar2.m();
                    }
                    i15 = 0;
                    xm3Var3.i();
                    xm3Var3.a = false;
                    mf9 mf9Var3 = xm3Var3.d;
                    mf9Var3.e.j = false;
                    mf9Var3.g = false;
                    mf9Var3.n();
                    uok uokVar3 = xm3Var3.e;
                    uokVar3.e.j = false;
                    uokVar3.g = false;
                    uokVar3.m();
                    ux4Var.c();
                } else {
                    i15 = 0;
                }
                ux4Var.b((xm3) ux4Var.e);
                xm3Var3.Z = i15;
                xm3Var3.a0 = i15;
                xm3Var3.d.h.d(i15);
                xm3Var3.e.h.d(i15);
                i16 = 1073741824;
                if (i2 == 1073741824) {
                    z3 = Y(i15, u);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (i4 == 1073741824) {
                    z3 &= Y(1, u);
                    i9++;
                }
            }
            if (z3) {
                T(i2 == i16, i4 == i16);
            }
        } else {
            z2 = z11;
            do1Var = do1Var4;
            i8 = size;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i24 = this.E0;
        if (i8 > 0) {
            int size2 = this.r0.size();
            boolean c0 = c0(64);
            do1 do1Var5 = this.v0;
            int i25 = 0;
            while (i25 < size2) {
                wm3 wm3Var4 = (wm3) this.r0.get(i25);
                if ((wm3Var4 instanceof s49) || (wm3Var4 instanceof b01) || wm3Var4.G || (c0 && (mf9Var = wm3Var4.d) != null && (uokVar = wm3Var4.e) != null && mf9Var.e.j && uokVar.e.j)) {
                    i14 = size2;
                } else {
                    int k3 = wm3Var4.k(0);
                    int k4 = wm3Var4.k(1);
                    i14 = size2;
                    boolean z13 = k3 == 3 && wm3Var4.s != 1 && k4 == 3 && wm3Var4.t != 1;
                    if (!z13 && c0(1) && !(wm3Var4 instanceof yvk)) {
                        if (k3 == 3 && wm3Var4.s == 0 && k4 != 3 && !wm3Var4.y()) {
                            z13 = true;
                        }
                        if (k4 == 3 && wm3Var4.t == 0 && k3 != 3 && !wm3Var4.y()) {
                            z13 = true;
                        }
                        if ((k3 == 3 || k4 == 3) && wm3Var4.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        ejgVar.w(0, do1Var5, wm3Var4);
                    }
                }
                i25++;
                size2 = i14;
            }
            i10 = 0;
            do1Var5.a();
        } else {
            i10 = 0;
        }
        ejgVar.H(this);
        int size3 = arrayList2.size();
        if (i8 > 0) {
            ejgVar.G(this, i10, r, l);
        }
        if (size3 > 0) {
            int[] iArr4 = this.q0;
            int i26 = iArr4[i10] == 2 ? 1 : i10;
            int i27 = iArr4[1] == 2 ? 1 : i10;
            int max = Math.max(r(), xm3Var.c0);
            int max2 = Math.max(l(), xm3Var.d0);
            int i28 = i10;
            boolean z14 = i28;
            while (i28 < size3) {
                wm3 wm3Var5 = (wm3) arrayList2.get(i28);
                if (wm3Var5 instanceof yvk) {
                    int r3 = wm3Var5.r();
                    int l3 = wm3Var5.l();
                    i12 = i27;
                    i13 = i26;
                    do1Var3 = do1Var;
                    boolean w = z14 | ejgVar.w(1, do1Var3, wm3Var5);
                    int r4 = wm3Var5.r();
                    int l4 = wm3Var5.l();
                    if (r4 != r3) {
                        wm3Var5.S(r4);
                        if (i13 != 0 && wm3Var5.s() + wm3Var5.V > max) {
                            max = Math.max(max, wm3Var5.j(4).e() + wm3Var5.s() + wm3Var5.V);
                        }
                        z4 = true;
                    } else {
                        z4 = w;
                    }
                    if (l4 != l3) {
                        wm3Var5.N(l4);
                        if (i12 != 0 && wm3Var5.t() + wm3Var5.W > max2) {
                            max2 = Math.max(max2, wm3Var5.j(5).e() + wm3Var5.t() + wm3Var5.W);
                        }
                        z4 = true;
                    }
                    z14 = ((yvk) wm3Var5).z0 | z4;
                } else {
                    i12 = i27;
                    i13 = i26;
                    do1Var3 = do1Var;
                }
                i28++;
                i26 = i13;
                do1Var = do1Var3;
                i27 = i12;
            }
            int i29 = i27;
            int i30 = i26;
            int i31 = 0;
            while (true) {
                do1 do1Var6 = do1Var;
                if (i31 >= 2) {
                    break;
                }
                boolean z15 = z14;
                int i32 = 0;
                while (i32 < size3) {
                    wm3 wm3Var6 = (wm3) arrayList2.get(i32);
                    if (((wm3Var6 instanceof t99) && !(wm3Var6 instanceof yvk)) || (wm3Var6 instanceof s49) || wm3Var6.h0 == 8 || ((z2 && wm3Var6.d.e.j && wm3Var6.e.e.j) || (wm3Var6 instanceof yvk))) {
                        i11 = size3;
                        do1Var2 = do1Var6;
                        arrayList = arrayList2;
                    } else {
                        int r5 = wm3Var6.r();
                        int l5 = wm3Var6.l();
                        i11 = size3;
                        int i33 = wm3Var6.b0;
                        arrayList = arrayList2;
                        z15 |= ejgVar.w(i31 == 1 ? 2 : 1, do1Var6, wm3Var6);
                        int r6 = wm3Var6.r();
                        do1Var2 = do1Var6;
                        int l6 = wm3Var6.l();
                        if (r6 != r5) {
                            wm3Var6.S(r6);
                            if (i30 != 0 && wm3Var6.s() + wm3Var6.V > max) {
                                max = Math.max(max, wm3Var6.j(4).e() + wm3Var6.s() + wm3Var6.V);
                            }
                            z15 = true;
                        }
                        if (l6 != l5) {
                            wm3Var6.N(l6);
                            if (i29 != 0 && wm3Var6.t() + wm3Var6.W > max2) {
                                max2 = Math.max(max2, wm3Var6.j(5).e() + wm3Var6.t() + wm3Var6.W);
                            }
                            z15 = true;
                        }
                        if (wm3Var6.F && i33 != wm3Var6.b0) {
                            z15 = true;
                        }
                    }
                    i32++;
                    size3 = i11;
                    arrayList2 = arrayList;
                    do1Var6 = do1Var2;
                }
                int i34 = size3;
                do1Var = do1Var6;
                ArrayList arrayList4 = arrayList2;
                if (!z15) {
                    break;
                }
                i31++;
                ejgVar.G(this, i31, r, l);
                size3 = i34;
                arrayList2 = arrayList4;
                z14 = false;
            }
        }
        this.E0 = i24;
        h8b.q = c0(512);
    }

    public final boolean c0(int i) {
        return (this.E0 & i) == i;
    }

    @Override // defpackage.wm3
    public final void o(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.W);
        sb.append("\n");
        Iterator it = this.r0.iterator();
        while (it.hasNext()) {
            ((wm3) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
