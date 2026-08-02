package e2;

import B1.C2533b;
import B1.U;
import B1.m0;
import android.util.Log;
import androidx.collection.C5141j;
import androidx.recyclerview.widget.LinearLayoutManager;
import j2.C7241a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m2.e;
import n2.C8420b;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6281y implements C8420b.InterfaceC1286b, InterfaceC6273q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m2.f f61859a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Map<U, m0> f61860b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f61861c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f61862d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6253A f61863e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final int[] f61864f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final int[] f61865g;

    /* renamed from: e2.y$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61866a;

        static {
            int[] iArr = new int[e.b.values().length];
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61866a = iArr;
        }
    }

    public C6281y(@NotNull Z1.d dVar) {
        m2.f fVar = new m2.f(0);
        fVar.q1(this);
        this.f61859a = fVar;
        this.f61860b = new LinkedHashMap();
        this.f61861c = new LinkedHashMap();
        this.f61862d = new LinkedHashMap();
        this.f61863e = new C6253A(dVar);
        this.f61864f = new int[2];
        this.f61865g = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long c(m2.e eVar, long j11) {
        Object r11 = eVar.r();
        String str = eVar.f74140k;
        int i11 = 0;
        if (eVar instanceof m2.m) {
            int i12 = Z1.b.i(j11) ? 1073741824 : Z1.b.g(j11) ? Integer.MIN_VALUE : 0;
            if (Z1.b.h(j11)) {
                i11 = 1073741824;
            } else if (Z1.b.f(j11)) {
                i11 = Integer.MIN_VALUE;
            }
            m2.m mVar = (m2.m) eVar;
            mVar.h1(i12, Z1.b.k(j11), i11, Z1.b.j(j11));
            return C5141j.b(mVar.c1(), mVar.b1());
        }
        if (r11 instanceof U) {
            m0 a02 = ((U) r11).a0(j11);
            this.f61860b.put(r11, a02);
            return C5141j.b(a02.u0(), a02.l0());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return C5141j.b(0, 0);
    }

    private static void d(e.b bVar, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        int i15 = a.f61866a[bVar.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
            return;
        }
        if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return;
        }
        if (i15 == 3) {
            boolean z13 = z12 || ((i13 == 1 || i13 == 2) && (i13 == 2 || i12 != 1 || z11));
            iArr[0] = z13 ? i11 : 0;
            if (!z13) {
                i11 = i14;
            }
            iArr[1] = i11;
            return;
        }
        if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
        } else {
            throw new IllegalStateException((bVar + " is not supported").toString());
        }
    }

    @Override // n2.C8420b.InterfaceC1286b
    public final void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r28.f74158t == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // n2.C8420b.InterfaceC1286b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@NotNull m2.e eVar, @NotNull C8420b.a aVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r18;
        Object obj;
        String str = eVar.f74140k;
        LinkedHashMap linkedHashMap = this.f61861c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        e.b bVar = aVar.f76296a;
        int i11 = aVar.f76298c;
        int i12 = eVar.f74156s;
        int i13 = aVar.f76305j;
        boolean z14 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) == eVar.v()) {
            z11 = true;
        } else {
            z11 = true;
            z14 = false;
        }
        boolean d02 = eVar.d0();
        C6253A c6253a = this.f61863e;
        boolean z15 = z11;
        d(bVar, i11, i12, i13, z14, d02, Z1.b.k(c6253a.q()), this.f61864f);
        d(aVar.f76297b, aVar.f76299d, eVar.f74158t, aVar.f76305j, (numArr != null ? numArr[0].intValue() : 0) == eVar.N() ? z15 ? 1 : 0 : false, eVar.e0(), Z1.b.j(c6253a.q()), this.f61865g);
        int[] iArr = this.f61864f;
        int i14 = iArr[0];
        int i15 = iArr[z15 ? 1 : 0];
        int[] iArr2 = this.f61865g;
        long a11 = Z1.c.a(i14, i15, iArr2[0], iArr2[z15 ? 1 : 0]);
        int i16 = aVar.f76305j;
        if (i16 != z15 && i16 != 2) {
            e.b bVar2 = aVar.f76296a;
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            if (bVar2 == bVar3) {
                if (eVar.f74156s == 0) {
                    if (aVar.f76297b == bVar3) {
                    }
                }
            }
        }
        long c11 = c(eVar, a11);
        eVar.K0(false);
        int i17 = (int) (c11 >> 32);
        Integer valueOf = Integer.valueOf(i17);
        int i18 = eVar.f74162v;
        Integer valueOf2 = Integer.valueOf(i18);
        if (i18 <= 0) {
            valueOf2 = null;
        }
        int i19 = eVar.f74163w;
        int intValue = ((Number) kotlin.ranges.h.h(valueOf, valueOf2, i19 > 0 ? Integer.valueOf(i19) : null)).intValue();
        int i21 = (int) (c11 & 4294967295L);
        Integer valueOf3 = Integer.valueOf(i21);
        int i22 = eVar.f74165y;
        Integer valueOf4 = Integer.valueOf(i22);
        if (i22 <= 0) {
            valueOf4 = null;
        }
        int i23 = eVar.f74166z;
        int intValue2 = ((Number) kotlin.ranges.h.h(valueOf3, valueOf4, i23 > 0 ? Integer.valueOf(i23) : null)).intValue();
        if (intValue != i17) {
            a11 = Z1.c.a(intValue, intValue, Z1.b.l(a11), Z1.b.j(a11));
            z12 = z15 ? 1 : 0;
        } else {
            z12 = false;
        }
        if (intValue2 != i21) {
            a11 = Z1.c.a(Z1.b.m(a11), Z1.b.k(a11), intValue2, intValue2);
            z13 = z15 ? 1 : 0;
        } else {
            z13 = z12;
        }
        if (z13) {
            c(eVar, a11);
            eVar.K0(false);
        }
        m0 m0Var = this.f61860b.get(eVar.r());
        aVar.f76300e = m0Var != null ? m0Var.u0() : eVar.N();
        aVar.f76301f = m0Var != null ? m0Var.l0() : eVar.v();
        int E11 = (m0Var == null || !c6253a.i(eVar)) ? Integer.MIN_VALUE : m0Var.E(C2533b.a());
        aVar.f76303h = E11 != Integer.MIN_VALUE ? z15 ? 1 : 0 : false;
        aVar.f76302g = E11;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            Integer[] numArr2 = new Integer[3];
            r18 = 0;
            numArr2[0] = 0;
            numArr2[z15 ? 1 : 0] = 0;
            numArr2[2] = Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            r18 = 0;
            obj = obj2;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[r18] = Integer.valueOf(aVar.f76300e);
        numArr3[z15 ? 1 : 0] = Integer.valueOf(aVar.f76301f);
        numArr3[2] = Integer.valueOf(aVar.f76302g);
        if (aVar.f76300e == aVar.f76298c && aVar.f76301f == aVar.f76299d) {
            z15 = r18;
        }
        aVar.f76304i = z15;
    }

    public final void e(@NotNull m0.a aVar, @NotNull List<? extends U> list, @NotNull Map<U, m0> map) {
        m2.e eVar;
        m0 m0Var;
        m0.a aVar2;
        this.f61860b = map;
        LinkedHashMap linkedHashMap = this.f61862d;
        boolean isEmpty = linkedHashMap.isEmpty();
        int i11 = 0;
        m2.f fVar = this.f61859a;
        if (isEmpty) {
            ArrayList<m2.e> arrayList = fVar.f74253v0;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                m2.e eVar2 = arrayList.get(i12);
                Object r11 = eVar2.r();
                if (r11 instanceof U) {
                    j2.g gVar = eVar2.f74138j;
                    m2.e eVar3 = gVar.f68901a;
                    if (eVar3 != null) {
                        gVar.f68902b = eVar3.O();
                        gVar.f68903c = eVar3.P();
                        gVar.f68904d = eVar3.G();
                        gVar.f68905e = eVar3.q();
                        gVar.f(eVar3.f74138j);
                    }
                    linkedHashMap.put(C6282z.a((U) r11), new j2.g(gVar));
                }
            }
        }
        int size2 = list.size();
        while (i11 < size2) {
            U u11 = list.get(i11);
            j2.g gVar2 = (j2.g) linkedHashMap.get(C6282z.a(u11));
            if (gVar2 != null && (m0Var = this.f61860b.get(u11)) != null && gVar2.f68917q != 8) {
                if (Float.isNaN(gVar2.f68908h) && Float.isNaN(gVar2.f68909i) && Float.isNaN(gVar2.f68910j) && Float.isNaN(gVar2.f68911k) && Float.isNaN(gVar2.f68912l) && Float.isNaN(gVar2.f68913m) && Float.isNaN(gVar2.f68914n) && Float.isNaN(gVar2.f68915o) && Float.isNaN(gVar2.f68916p)) {
                    int i13 = (int) 0;
                    aVar.f(m0Var, Z1.n.a(gVar2.f68902b - i13, gVar2.f68903c - i13), 0.0f);
                } else {
                    C6264h c6264h = new C6264h(gVar2);
                    int i14 = (int) 0;
                    int i15 = gVar2.f68902b - i14;
                    int i16 = gVar2.f68903c - i14;
                    aVar2 = aVar;
                    aVar2.n(m0Var, i15, i16, Float.isNaN(gVar2.f68913m) ? 0.0f : gVar2.f68913m, c6264h);
                    i11++;
                    aVar = aVar2;
                }
            }
            aVar2 = aVar;
            i11++;
            aVar = aVar2;
        }
        if (EnumC6278v.BOUNDS == null) {
            StringBuilder sb2 = new StringBuilder("{   root: {interpolated: { left:  0,  top:  0,");
            sb2.append("  right:   " + fVar.N() + " ,");
            sb2.append("  bottom:  " + fVar.v() + " ,");
            sb2.append(" } }");
            Iterator<m2.e> it = fVar.f74253v0.iterator();
            while (it.hasNext()) {
                m2.e next = it.next();
                Object r12 = next.r();
                if (r12 instanceof U) {
                    j2.g gVar3 = null;
                    if (next.f74140k == null) {
                        U u12 = (U) r12;
                        Object a11 = androidx.compose.ui.layout.a.a(u12);
                        if (a11 == null) {
                            a11 = C6268l.a(u12);
                        }
                        next.f74140k = a11 != null ? a11.toString() : null;
                    }
                    j2.g gVar4 = (j2.g) linkedHashMap.get(C6282z.a((U) r12));
                    if (gVar4 != null && (eVar = gVar4.f68901a) != null) {
                        gVar3 = eVar.f74138j;
                    }
                    if (gVar3 != null) {
                        sb2.append(" " + next.f74140k + ": {");
                        sb2.append(" interpolated : ");
                        gVar3.c(sb2);
                        sb2.append("}, ");
                    }
                } else if (next instanceof m2.h) {
                    sb2.append(" " + next.f74140k + ": {");
                    m2.h hVar = (m2.h) next;
                    if (hVar.a1() == 0) {
                        sb2.append(" type: 'hGuideline', ");
                    } else {
                        sb2.append(" type: 'vGuideline', ");
                    }
                    sb2.append(" interpolated: ");
                    sb2.append(" { left: " + hVar.O() + ", top: " + hVar.P() + ", right: " + (hVar.N() + hVar.O()) + ", bottom: " + (hVar.v() + hVar.P()) + " }");
                    sb2.append("}, ");
                }
            }
            sb2.append(" }");
        }
    }

    public final long f(long j11, @NotNull Z1.s sVar, @NotNull InterfaceC6270n interfaceC6270n, @NotNull List list, @NotNull LinkedHashMap linkedHashMap, int i11) {
        j2.c h11;
        j2.c h12;
        this.f61860b = linkedHashMap;
        if (list.isEmpty()) {
            return Z1.r.a(Z1.b.m(j11), Z1.b.l(j11));
        }
        if (Z1.b.i(j11)) {
            h11 = j2.c.c(Z1.b.k(j11));
        } else {
            h11 = j2.c.h();
            h11.i(Z1.b.m(j11));
        }
        C6253A c6253a = this.f61863e;
        c6253a.o(h11);
        if (Z1.b.h(j11)) {
            h12 = j2.c.c(Z1.b.j(j11));
        } else {
            h12 = j2.c.h();
            h12.i(Z1.b.l(j11));
        }
        c6253a.g(h12);
        C7241a c7241a = c6253a.f68896f;
        j2.c q11 = c7241a.q();
        m2.f fVar = this.f61859a;
        q11.a(fVar, 0);
        c7241a.p().a(fVar, 1);
        c6253a.r(j11);
        c6253a.m(sVar == Z1.s.Rtl);
        this.f61860b.clear();
        this.f61861c.clear();
        this.f61862d.clear();
        if (interfaceC6270n.c(list)) {
            c6253a.k();
            interfaceC6270n.a(c6253a, list);
            C6265i.a(c6253a, list);
            c6253a.a(fVar);
        } else {
            C6265i.a(c6253a, list);
        }
        fVar.T0(Z1.b.k(j11));
        fVar.z0(Z1.b.j(j11));
        fVar.u1();
        fVar.r1(i11);
        fVar.n1(fVar.i1(), 0, 0, 0, 0, 0, 0);
        return Z1.r.a(fVar.N(), fVar.v());
    }
}
