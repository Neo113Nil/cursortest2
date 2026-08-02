package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t1c implements do1 {
    public final xm3 a;
    public Map b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final zci e;
    public final int[] f;
    public final int[] g;

    public t1c(kx4 kx4Var) {
        xm3 xm3Var = new xm3(0, 0);
        xm3Var.r0 = new ArrayList();
        xm3Var.s0 = new ejg(xm3Var);
        ux4 ux4Var = new ux4(xm3Var);
        xm3Var.t0 = ux4Var;
        xm3Var.v0 = null;
        xm3Var.w0 = false;
        xm3Var.x0 = new h8b();
        xm3Var.A0 = 0;
        xm3Var.B0 = 0;
        xm3Var.C0 = new ym2[4];
        xm3Var.D0 = new ym2[4];
        xm3Var.E0 = 257;
        xm3Var.F0 = false;
        xm3Var.G0 = false;
        xm3Var.H0 = null;
        xm3Var.I0 = null;
        xm3Var.J0 = null;
        xm3Var.K0 = null;
        xm3Var.L0 = new HashSet();
        xm3Var.M0 = new co1();
        xm3Var.v0 = this;
        ux4Var.h = this;
        this.a = xm3Var;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new zci(kx4Var);
        this.f = new int[2];
        this.g = new int[2];
    }

    public static void d(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        int C = wt3.C(i);
        if (C == 0) {
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        if (C == 1) {
            iArr[0] = 0;
            iArr[1] = i5;
            return;
        }
        if (C != 2) {
            if (C != 3) {
                throw new IllegalStateException((i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MATCH_PARENT" : "MATCH_CONSTRAINT" : "WRAP_CONTENT" : "FIXED").concat(" is not supported").toString());
            }
            iArr[0] = i5;
            iArr[1] = i5;
            return;
        }
        boolean z3 = z2 || ((i4 == 1 || i4 == 2) && (i4 == 2 || i3 != 1 || z));
        iArr[0] = z3 ? i2 : 0;
        if (!z3) {
            i2 = i5;
        }
        iArr[1] = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // defpackage.do1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(wm3 wm3Var, co1 co1Var) {
        char c;
        boolean z;
        boolean z2;
        int i;
        Object obj;
        ?? r18;
        Object obj2;
        String str = wm3Var.k;
        LinkedHashMap linkedHashMap = this.c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        int i2 = co1Var.a;
        int i3 = co1Var.c;
        int i4 = wm3Var.s;
        int i5 = co1Var.j;
        boolean z3 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != wm3Var.l()) {
            z3 = false;
        }
        boolean B = wm3Var.B();
        zci zciVar = this.e;
        d(i2, i3, i4, i5, z3, B, an3.h(zciVar.l), this.f);
        d(co1Var.b, co1Var.d, wm3Var.t, co1Var.j, (numArr != null ? numArr[0].intValue() : 0) == wm3Var.r(), wm3Var.C(), an3.g(zciVar.l), this.g);
        int[] iArr = this.f;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int[] iArr2 = this.g;
        long a = cn3.a(i6, i7, iArr2[0], iArr2[1]);
        int i8 = co1Var.j;
        if (i8 != 1 && i8 != 2 && co1Var.a == 3 && wm3Var.s == 0 && co1Var.b == 3 && wm3Var.t == 0) {
            c = 2;
        } else {
            long c2 = c(wm3Var, a);
            wm3Var.g = false;
            int i9 = (int) (c2 >> 32);
            Integer valueOf = Integer.valueOf(i9);
            int i10 = wm3Var.v;
            Integer valueOf2 = i10 > 0 ? Integer.valueOf(i10) : null;
            c = 2;
            int i11 = wm3Var.w;
            int intValue = ((Number) llf.g(valueOf, valueOf2, i11 > 0 ? Integer.valueOf(i11) : null)).intValue();
            int i12 = (int) (c2 & 4294967295L);
            Integer valueOf3 = Integer.valueOf(i12);
            int i13 = wm3Var.y;
            Integer valueOf4 = Integer.valueOf(i13);
            if (i13 <= 0) {
                valueOf4 = null;
            }
            int i14 = wm3Var.z;
            int intValue2 = ((Number) llf.g(valueOf3, valueOf4, i14 > 0 ? Integer.valueOf(i14) : null)).intValue();
            if (intValue != i9) {
                a = cn3.a(intValue, intValue, an3.i(a), an3.g(a));
                z = true;
            } else {
                z = false;
            }
            if (intValue2 != i12) {
                a = cn3.a(an3.j(a), an3.h(a), intValue2, intValue2);
                z2 = true;
            } else {
                z2 = z;
            }
            if (z2) {
                c(wm3Var, a);
                wm3Var.g = false;
            }
        }
        qhe qheVar = (qhe) this.b.get(wm3Var.g0);
        co1Var.e = qheVar != null ? qheVar.a : wm3Var.r();
        co1Var.f = qheVar != null ? qheVar.b : wm3Var.l();
        if (qheVar != null) {
            ArrayList arrayList = zciVar.i;
            if (zciVar.j) {
                arrayList.clear();
                Iterator it = zciVar.h.iterator();
                while (it.hasNext()) {
                    wm3 a2 = ((gtf) zciVar.c.get(it.next())).a();
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                zciVar.j = false;
            }
            if (arrayList.contains(wm3Var)) {
                i = qheVar.R(mo.a);
                co1Var.h = i == Integer.MIN_VALUE;
                co1Var.g = i;
                obj = linkedHashMap.get(str);
                if (obj != null) {
                    Integer[] numArr2 = new Integer[3];
                    r18 = 0;
                    numArr2[0] = 0;
                    numArr2[1] = 0;
                    numArr2[c] = Integer.MIN_VALUE;
                    linkedHashMap.put(str, numArr2);
                    obj2 = numArr2;
                } else {
                    r18 = 0;
                    obj2 = obj;
                }
                Integer[] numArr3 = (Integer[]) obj2;
                numArr3[r18] = Integer.valueOf(co1Var.e);
                numArr3[1] = Integer.valueOf(co1Var.f);
                numArr3[c] = Integer.valueOf(co1Var.g);
                co1Var.i = (co1Var.e == co1Var.c || co1Var.f != co1Var.d) ? true : r18;
            }
        }
        i = Integer.MIN_VALUE;
        co1Var.h = i == Integer.MIN_VALUE;
        co1Var.g = i;
        obj = linkedHashMap.get(str);
        if (obj != null) {
        }
        Integer[] numArr32 = (Integer[]) obj2;
        numArr32[r18] = Integer.valueOf(co1Var.e);
        numArr32[1] = Integer.valueOf(co1Var.f);
        numArr32[c] = Integer.valueOf(co1Var.g);
        co1Var.i = (co1Var.e == co1Var.c || co1Var.f != co1Var.d) ? true : r18;
    }

    public final long c(wm3 wm3Var, long j) {
        Object obj = wm3Var.g0;
        int i = 0;
        if (!(wm3Var instanceof yvk)) {
            if (!(obj instanceof g1c)) {
                return k6a.a(0, 0);
            }
            qhe J = ((g1c) obj).J(j);
            this.b.put(obj, J);
            return k6a.a(J.a, J.b);
        }
        int i2 = an3.f(j) ? 1073741824 : an3.d(j) ? Integer.MIN_VALUE : 0;
        if (an3.e(j)) {
            i = 1073741824;
        } else if (an3.c(j)) {
            i = Integer.MIN_VALUE;
        }
        yvk yvkVar = (yvk) wm3Var;
        yvkVar.Y(i2, an3.h(j), i, an3.g(j));
        return k6a.a(yvkVar.A0, yvkVar.B0);
    }

    public final void e(phe pheVar, List list, Map map) {
        String str;
        qhe qheVar;
        phe pheVar2;
        String str2;
        this.b = map;
        LinkedHashMap linkedHashMap = this.d;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = this.a.r0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                wm3 wm3Var = (wm3) arrayList.get(i2);
                Object obj = wm3Var.g0;
                if (obj instanceof g1c) {
                    j7l j7lVar = wm3Var.j;
                    wm3 wm3Var2 = j7lVar.a;
                    if (wm3Var2 != null) {
                        j7lVar.b = wm3Var2.s();
                        j7lVar.c = wm3Var2.t();
                        j7lVar.a(wm3Var2.j);
                    }
                    j7l j7lVar2 = new j7l(j7lVar);
                    g1c g1cVar = (g1c) obj;
                    Object A = ww9.A(g1cVar);
                    if (A == null) {
                        g1cVar.h();
                        A = null;
                    }
                    if (A == null || (str2 = A.toString()) == null) {
                        str2 = "null";
                    }
                    linkedHashMap.put(str2, j7lVar2);
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            g1c g1cVar2 = (g1c) list.get(i);
            Object A2 = ww9.A(g1cVar2);
            if (A2 == null) {
                g1cVar2.h();
                A2 = null;
            }
            if (A2 == null || (str = A2.toString()) == null) {
                str = "null";
            }
            j7l j7lVar3 = (j7l) linkedHashMap.get(str);
            if (j7lVar3 != null && (qheVar = (qhe) this.b.get(g1cVar2)) != null && j7lVar3.o != 8) {
                if (Float.isNaN(j7lVar3.f) && Float.isNaN(j7lVar3.g) && Float.isNaN(j7lVar3.h) && Float.isNaN(j7lVar3.i) && Float.isNaN(j7lVar3.j) && Float.isNaN(j7lVar3.k) && Float.isNaN(j7lVar3.l) && Float.isNaN(j7lVar3.m) && Float.isNaN(j7lVar3.n)) {
                    phe.g(pheVar, qheVar, (j7lVar3.c & 4294967295L) | (j7lVar3.b << 32));
                } else {
                    pheVar2 = pheVar;
                    pheVar2.l(qheVar, j7lVar3.b, j7lVar3.c, Float.isNaN(j7lVar3.k) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : j7lVar3.k, new oo(j7lVar3, 12));
                    i++;
                    pheVar = pheVar2;
                }
            }
            pheVar2 = pheVar;
            i++;
            pheVar = pheVar2;
        }
    }

    public final long f(long j, ema emaVar, pm3 pm3Var, List list, LinkedHashMap linkedHashMap) {
        y25 y25Var;
        y25 y25Var2;
        r99 r99Var;
        t99 s;
        t99 s2;
        this.b = linkedHashMap;
        if (list.isEmpty()) {
            return d7a.f(an3.j(j), an3.i(j));
        }
        boolean f = an3.f(j);
        String str = y25.i;
        if (f) {
            y25Var = y25.d(an3.h(j));
        } else {
            y25Var = new y25(str);
            int j2 = an3.j(j);
            if (j2 >= 0) {
                y25Var.b = j2;
            }
        }
        zci zciVar = this.e;
        fm3 fm3Var = zciVar.f;
        HashMap hashMap = zciVar.d;
        HashMap hashMap2 = zciVar.c;
        fm3 fm3Var2 = zciVar.f;
        fm3Var.d0 = y25Var;
        if (an3.e(j)) {
            y25Var2 = y25.d(an3.g(j));
        } else {
            y25Var2 = new y25(str);
            int i = an3.i(j);
            if (i >= 0) {
                y25Var2.b = i;
            }
        }
        fm3Var2.e0 = y25Var2;
        y25 y25Var3 = fm3Var2.d0;
        xm3 xm3Var = this.a;
        int i2 = 0;
        y25Var3.a(xm3Var, 0);
        fm3Var2.e0.a(xm3Var, 1);
        zciVar.l = j;
        zciVar.b = !(emaVar == ema.b);
        this.b.clear();
        this.c.clear();
        this.d.clear();
        ArrayList arrayList = pm3Var.f;
        if (!pm3Var.d && list.size() == arrayList.size()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object h = ((g1c) list.get(i3)).h();
                if (Intrinsics.c(h instanceof yl3 ? (yl3) h : null, arrayList.get(i3))) {
                }
            }
            n4o.w(zciVar, list);
            xm3Var.S(an3.h(j));
            xm3Var.N(an3.g(j));
            xm3Var.s0.H(xm3Var);
            xm3Var.E0 = 257;
            h8b.q = xm3Var.c0(512);
            xm3Var.a0(xm3Var.E0, 0, 0, 0, 0, 0, 0);
            return d7a.f(xm3Var.r(), xm3Var.l());
        }
        Iterator it = hashMap2.keySet().iterator();
        while (it.hasNext()) {
            ((gtf) hashMap2.get(it.next())).a().D();
        }
        hashMap2.clear();
        hashMap2.put(0, fm3Var2);
        hashMap.clear();
        zciVar.e.clear();
        zciVar.h.clear();
        zciVar.j = true;
        pm3Var.f.clear();
        pm3Var.c.i(Unit.a, pm3Var.e, new nm3(i2, list, pm3Var, zciVar));
        pm3Var.d = false;
        n4o.w(zciVar, list);
        xm3Var.r0.clear();
        fm3Var2.d0.a(xm3Var, 0);
        fm3Var2.e0.a(xm3Var, 1);
        for (Object obj : hashMap.keySet()) {
            t99 s3 = ((r99) hashMap.get(obj)).s();
            if (s3 != null) {
                gtf gtfVar = (gtf) hashMap2.get(obj);
                if (gtfVar == null) {
                    gtfVar = zciVar.b(obj);
                }
                gtfVar.b(s3);
            }
        }
        for (Object obj2 : hashMap2.keySet()) {
            gtf gtfVar2 = (gtf) hashMap2.get(obj2);
            if (gtfVar2 != fm3Var2 && (gtfVar2.c() instanceof r99) && (s2 = ((r99) gtfVar2.c()).s()) != null) {
                gtf gtfVar3 = (gtf) hashMap2.get(obj2);
                if (gtfVar3 == null) {
                    gtfVar3 = zciVar.b(obj2);
                }
                gtfVar3.b(s2);
            }
        }
        Iterator it2 = hashMap2.keySet().iterator();
        while (it2.hasNext()) {
            gtf gtfVar4 = (gtf) hashMap2.get(it2.next());
            if (gtfVar4 != fm3Var2) {
                wm3 a = gtfVar4.a();
                a.i0 = gtfVar4.getKey().toString();
                a.U = null;
                if (gtfVar4.c() instanceof u49) {
                    gtfVar4.apply();
                }
                xm3Var.V(a);
            } else {
                gtfVar4.b(xm3Var);
            }
        }
        Iterator it3 = hashMap.keySet().iterator();
        while (it3.hasNext()) {
            r99 r99Var2 = (r99) hashMap.get(it3.next());
            if (r99Var2.s() != null) {
                Iterator it4 = r99Var2.m0.iterator();
                while (it4.hasNext()) {
                    r99Var2.s().V(((gtf) hashMap2.get(it4.next())).a());
                }
                r99Var2.apply();
            } else {
                r99Var2.apply();
            }
        }
        Iterator it5 = hashMap2.keySet().iterator();
        while (it5.hasNext()) {
            gtf gtfVar5 = (gtf) hashMap2.get(it5.next());
            if (gtfVar5 != fm3Var2 && (gtfVar5.c() instanceof r99) && (s = (r99Var = (r99) gtfVar5.c()).s()) != null) {
                Iterator it6 = r99Var.m0.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    gtf gtfVar6 = (gtf) hashMap2.get(next);
                    if (gtfVar6 != null) {
                        s.V(gtfVar6.a());
                    } else if (next instanceof gtf) {
                        s.V(((gtf) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                gtfVar5.apply();
            }
        }
        for (Object obj3 : hashMap2.keySet()) {
            gtf gtfVar7 = (gtf) hashMap2.get(obj3);
            gtfVar7.apply();
            wm3 a2 = gtfVar7.a();
            if (a2 != null && obj3 != null) {
                a2.k = obj3.toString();
            }
        }
        xm3Var.S(an3.h(j));
        xm3Var.N(an3.g(j));
        xm3Var.s0.H(xm3Var);
        xm3Var.E0 = 257;
        h8b.q = xm3Var.c0(512);
        xm3Var.a0(xm3Var.E0, 0, 0, 0, 0, 0, 0);
        return d7a.f(xm3Var.r(), xm3Var.l());
    }

    @Override // defpackage.do1
    public final void a() {
    }
}
