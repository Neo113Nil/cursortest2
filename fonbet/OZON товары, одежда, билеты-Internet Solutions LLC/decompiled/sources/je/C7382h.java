package je;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.r0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ne.C8579a;
import ne.EnumC8580b;
import ne.InterfaceC8581c;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7382h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7382h f69890a = new C7382h();

    /* renamed from: je.h$a */
    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69891a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f69892b;

        static {
            int[] iArr = new int[ne.q.values().length];
            try {
                iArr[ne.q.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ne.q.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ne.q.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69891a = iArr;
            int[] iArr2 = new int[r0.b.values().length];
            try {
                iArr2[r0.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r0.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f69892b = iArr2;
        }
    }

    private static final boolean a(ne.m mVar, ne.h hVar) {
        if (mVar.Z(hVar)) {
            return true;
        }
        if (!(hVar instanceof InterfaceC8581c)) {
            return false;
        }
        y0 k11 = mVar.k(mVar.d0((InterfaceC8581c) hVar));
        return !mVar.T(k11) && mVar.Z(mVar.m(mVar.D(k11)));
    }

    private static final boolean b(ne.m mVar, r0 r0Var, ne.h hVar, ne.h hVar2, boolean z11) {
        Collection<ne.g> a02 = mVar.a0(hVar);
        if ((a02 instanceof Collection) && a02.isEmpty()) {
            return false;
        }
        for (ne.g gVar : a02) {
            if (Intrinsics.d(mVar.C(gVar), mVar.c0(hVar2))) {
                return true;
            }
            if (z11 && i(f69890a, r0Var, hVar2, gVar)) {
                return true;
            }
        }
        return false;
    }

    private static List c(r0 r0Var, ne.h hVar, ne.k kVar) {
        r0.c V11;
        ne.m f7 = r0Var.f();
        f7.S(hVar, kVar);
        if (!f7.j(kVar) && f7.o(hVar)) {
            return kotlin.collections.K.f71697a;
        }
        if (f7.v(kVar)) {
            if (!f7.L(f7.c0(hVar), kVar)) {
                return kotlin.collections.K.f71697a;
            }
            Y R11 = f7.R(hVar, EnumC8580b.FOR_SUBTYPING);
            if (R11 != null) {
                hVar = R11;
            }
            return C7714v.a0(hVar);
        }
        te.h hVar2 = new te.h();
        r0Var.g();
        ArrayDeque<ne.h> d11 = r0Var.d();
        Intrinsics.f(d11);
        te.i e11 = r0Var.e();
        Intrinsics.f(e11);
        d11.push(hVar);
        while (!d11.isEmpty()) {
            if (e11.getSize() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + hVar + ". Supertypes = " + C7714v.V(e11, null, null, null, null, 63)).toString());
            }
            ne.h pop = d11.pop();
            Intrinsics.f(pop);
            if (e11.add(pop)) {
                Y R12 = f7.R(pop, EnumC8580b.FOR_SUBTYPING);
                if (R12 == null) {
                    R12 = pop;
                }
                if (f7.L(f7.c0(R12), kVar)) {
                    hVar2.add(R12);
                    V11 = r0.c.C1145c.f69925a;
                } else {
                    V11 = f7.h(R12) == 0 ? r0.c.b.f69924a : r0Var.f().V(R12);
                }
                if (Intrinsics.d(V11, r0.c.C1145c.f69925a)) {
                    V11 = null;
                }
                if (V11 != null) {
                    ne.m f11 = r0Var.f();
                    Iterator<ne.g> it = f11.G(f11.c0(pop)).iterator();
                    while (it.hasNext()) {
                        d11.add(V11.a(r0Var, it.next()));
                    }
                }
            }
        }
        r0Var.c();
        return hVar2;
    }

    private static List d(r0 r0Var, ne.h hVar, ne.k kVar) {
        int i11;
        List c11 = c(r0Var, hVar, kVar);
        ne.m f7 = r0Var.f();
        if (c11.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c11) {
                ne.i W11 = f7.W((ne.h) obj);
                int P11 = f7.P(W11);
                while (true) {
                    if (i11 >= P11) {
                        arrayList.add(obj);
                        break;
                    }
                    i11 = f7.q(f7.D(f7.k0(W11, i11))) == null ? i11 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return c11;
    }

    public static boolean e(@NotNull r0 state, @NotNull ne.g a11, @NotNull ne.g b11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        ne.m f7 = state.f();
        if (a11 == b11) {
            return true;
        }
        C7382h c7382h = f69890a;
        if (g(f7, a11) && g(f7, b11)) {
            ne.g j11 = state.j(state.k(a11));
            ne.g j12 = state.j(state.k(b11));
            Y I11 = f7.I(j11);
            if (!f7.L(f7.C(j11), f7.C(j12))) {
                return false;
            }
            if (f7.h(I11) == 0) {
                return f7.e0(j11) || f7.e0(j12) || f7.x(I11) == f7.x(f7.I(j12));
            }
        }
        return i(c7382h, state, a11, b11) && i(c7382h, state, b11, a11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r6.j0(r6.C(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ne.l f(ne.m mVar, ne.g gVar, ne.h hVar) {
        K0 D11;
        int h11 = mVar.h(gVar);
        int i11 = 0;
        while (true) {
            if (i11 >= h11) {
                return null;
            }
            ne.j i02 = mVar.i0(gVar, i11);
            ne.j jVar = mVar.T(i02) ? null : i02;
            if (jVar != null && (D11 = mVar.D(jVar)) != null) {
                boolean z11 = mVar.M(mVar.b0(mVar.I(D11))) && mVar.M(mVar.b0(mVar.I(hVar)));
                if (D11.equals(hVar) || (z11 && Intrinsics.d(mVar.C(D11), mVar.C(hVar)))) {
                    break;
                }
                ne.l f7 = f(mVar, D11, hVar);
                if (f7 != null) {
                    return f7;
                }
            }
            i11++;
        }
    }

    private static boolean g(ne.m mVar, ne.g gVar) {
        return (!mVar.h0(mVar.C(gVar)) || mVar.U(gVar) || mVar.s(gVar) || mVar.y(gVar) || mVar.a(gVar)) ? false : true;
    }

    public static boolean h(@NotNull r0 r0Var, @NotNull ne.i capturedSubArguments, @NotNull ne.h superType) {
        int i11;
        int i12;
        boolean e11;
        int i13;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        ne.m f7 = r0Var.f();
        s0 c02 = f7.c0(superType);
        int P11 = f7.P(capturedSubArguments);
        int b11 = f7.b(c02);
        if (P11 == b11 && P11 == f7.h(superType)) {
            for (int i14 = 0; i14 < b11; i14++) {
                ne.j i02 = f7.i0(superType, i14);
                if (!f7.T(i02)) {
                    K0 D11 = f7.D(i02);
                    ne.j k02 = f7.k0(capturedSubArguments, i14);
                    f7.z(k02);
                    ne.q qVar = ne.q.INV;
                    K0 D12 = f7.D(k02);
                    ne.q declared = f7.O(f7.j0(c02, i14));
                    ne.q useSite = f7.z(i02);
                    Intrinsics.checkNotNullParameter(declared, "declared");
                    Intrinsics.checkNotNullParameter(useSite, "useSite");
                    if (declared == qVar) {
                        declared = useSite;
                    } else if (useSite != qVar && declared != useSite) {
                        declared = null;
                    }
                    if (declared == null) {
                        return r0Var.h();
                    }
                    C7382h c7382h = f69890a;
                    if (declared != qVar || (!j(f7, D12, D11, c02) && !j(f7, D11, D12, c02))) {
                        i11 = r0Var.f69920f;
                        if (i11 > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + D12).toString());
                        }
                        i12 = r0Var.f69920f;
                        r0Var.f69920f = i12 + 1;
                        int i15 = a.f69891a[declared.ordinal()];
                        if (i15 == 1) {
                            e11 = e(r0Var, D12, D11);
                        } else if (i15 == 2) {
                            e11 = i(c7382h, r0Var, D12, D11);
                        } else {
                            if (i15 != 3) {
                                throw new Sc.o();
                            }
                            e11 = i(c7382h, r0Var, D11, D12);
                        }
                        i13 = r0Var.f69920f;
                        r0Var.f69920f = i13 - 1;
                        if (!e11) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x028d, code lost:
    
        r9 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x028b, code lost:
    
        if (b(r11, r25, r10, r9, true) != false) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ef  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(C7382h c7382h, r0 state, ne.g subType, ne.g superType) {
        Boolean valueOf;
        Boolean bool;
        ?? r16;
        ArrayList arrayList;
        r0.c cVar;
        int size;
        int i11;
        K0 D11;
        Y y11;
        boolean z11;
        Y y12;
        Y y13;
        c7382h.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        int i12 = 1;
        if (subType != superType) {
            state.getClass();
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(superType, "superType");
            boolean z12 = false;
            ne.m f7 = state.f();
            ne.g subType2 = state.j(state.k(subType));
            ne.g superType2 = state.j(state.k(superType));
            Y subType3 = f7.I(subType2);
            Y m11 = f7.m(superType2);
            ne.m f11 = state.f();
            boolean r11 = f11.r(subType3);
            C7382h c7382h2 = f69890a;
            if (r11 || f11.r(m11)) {
                valueOf = state.h() ? Boolean.TRUE : (!f11.x(subType3) || f11.x(m11)) ? Boolean.valueOf(C7374d.b(f11, f11.X(subType3, false), f11.X(m11, false))) : Boolean.FALSE;
            } else if (f11.p(subType3) && f11.p(m11)) {
                C7401v g02 = f11.g0(subType3);
                if (g02 == null || (y12 = f11.B(g02)) == null) {
                    y12 = subType3;
                }
                C7401v g03 = f11.g0(m11);
                if (g03 == null || (y13 = f11.B(g03)) == null) {
                    y13 = m11;
                }
                valueOf = Boolean.valueOf((f11.c0(y12) == f11.c0(y13) && ((f11.s(subType3) || !f11.s(m11)) && (!f11.x(subType3) || f11.x(m11)))) || state.i());
            } else if (f11.f(subType3) || f11.f(m11)) {
                valueOf = Boolean.valueOf(state.i());
            } else {
                C7401v g04 = f11.g0(m11);
                if (g04 == null || (y11 = f11.B(g04)) == null) {
                    y11 = m11;
                }
                InterfaceC8581c superType3 = f11.t(y11);
                ne.g H11 = superType3 != null ? f11.H(superType3) : null;
                if (superType3 != null && H11 != null) {
                    if (f11.x(m11)) {
                        H11 = f11.e(H11);
                    } else if (f11.s(m11)) {
                        H11 = f11.l0(H11);
                    }
                    Intrinsics.checkNotNullParameter(subType3, "subType");
                    Intrinsics.checkNotNullParameter(superType3, "superType");
                    int i13 = a.f69892b[r0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()];
                    if (i13 == 1) {
                        valueOf = Boolean.valueOf(i(c7382h2, state, subType3, H11));
                    } else if (i13 != 2) {
                        if (i13 != 3) {
                            throw new Sc.o();
                        }
                    } else if (i(c7382h2, state, subType3, H11)) {
                        valueOf = Boolean.TRUE;
                    }
                }
                s0 c02 = f11.c0(m11);
                if (f11.d(c02)) {
                    f11.x(m11);
                    Collection<ne.g> G11 = f11.G(c02);
                    if (!(G11 instanceof Collection) || !G11.isEmpty()) {
                        Iterator it = G11.iterator();
                        while (it.hasNext()) {
                            if (!i(c7382h2, state, subType3, (ne.g) it.next())) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    valueOf = Boolean.valueOf(z11);
                } else {
                    s0 c03 = f11.c0(subType3);
                    if (!(subType3 instanceof InterfaceC8581c)) {
                        if (f11.d(c03)) {
                            Collection<ne.g> G12 = f11.G(c03);
                            if (!(G12 instanceof Collection) || !G12.isEmpty()) {
                                Iterator it2 = G12.iterator();
                                while (it2.hasNext()) {
                                    if (!(((ne.g) it2.next()) instanceof InterfaceC8581c)) {
                                        break;
                                    }
                                }
                            }
                        }
                        valueOf = null;
                    }
                    ne.l f12 = f(state.f(), m11, subType3);
                    if (f12 != null && f11.F(f12, f11.c0(m11))) {
                        valueOf = Boolean.TRUE;
                    }
                    valueOf = null;
                }
            }
            if (valueOf != null) {
                boolean booleanValue = valueOf.booleanValue();
                Intrinsics.checkNotNullParameter(subType2, "subType");
                Intrinsics.checkNotNullParameter(superType2, "superType");
                return booleanValue;
            }
            Intrinsics.checkNotNullParameter(subType2, "subType");
            Intrinsics.checkNotNullParameter(superType2, "superType");
            Y subType4 = f7.I(subType2);
            Y superType4 = f7.m(superType2);
            ne.m f13 = state.f();
            if (!C7372c.c(state, subType4, superType4)) {
                return false;
            }
            Y I11 = f13.I(subType4);
            Y m12 = f13.m(superType4);
            ne.m f14 = state.f();
            if (f14.Z(I11) || f14.Z(m12)) {
                if (a(f14, I11) && a(f14, m12)) {
                    bool = Boolean.TRUE;
                } else if (!f14.Z(I11)) {
                    if (f14.Z(m12)) {
                        s0 c04 = f14.c0(I11);
                        if (c04 instanceof ne.f) {
                            Collection<ne.g> G13 = f14.G(c04);
                            if (!(G13 instanceof Collection) || !G13.isEmpty()) {
                                Iterator it3 = G13.iterator();
                                while (it3.hasNext()) {
                                    Y u11 = f14.u((ne.g) it3.next());
                                    if (u11 != null && f14.Z(u11)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (b(f14, state, I11, m12, false)) {
                    bool = Boolean.TRUE;
                }
                if (bool == null) {
                    boolean booleanValue2 = bool.booleanValue();
                    Intrinsics.checkNotNullParameter(subType4, "subType");
                    Intrinsics.checkNotNullParameter(superType4, "superType");
                    return booleanValue2;
                }
                s0 superConstructor = f13.c0(superType4);
                if ((!f13.L(f13.c0(subType4), superConstructor) || f13.b(superConstructor) != 0) && !f13.E(f13.c0(superType4))) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(subType4, "subType");
                    Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
                    ne.m f15 = state.f();
                    if (f15.o(subType4)) {
                        arrayList = d(state, subType4, superConstructor);
                    } else {
                        if (f15.j(superConstructor) || f15.A(superConstructor)) {
                            te.h hVar = new te.h();
                            state.g();
                            ArrayDeque<ne.h> d11 = state.d();
                            Intrinsics.f(d11);
                            te.i e11 = state.e();
                            Intrinsics.f(e11);
                            d11.push(subType4);
                            while (!d11.isEmpty()) {
                                if (e11.getSize() > 1000) {
                                    throw new IllegalStateException(("Too many supertypes for type: " + subType4 + ". Supertypes = " + C7714v.V(e11, null, null, null, null, 63)).toString());
                                }
                                ne.h pop = d11.pop();
                                Intrinsics.f(pop);
                                if (e11.add(pop)) {
                                    if (f15.o(pop)) {
                                        hVar.add(pop);
                                        cVar = r0.c.C1145c.f69925a;
                                    } else {
                                        cVar = r0.c.b.f69924a;
                                    }
                                    boolean z13 = z12;
                                    if (Intrinsics.d(cVar, r0.c.C1145c.f69925a)) {
                                        cVar = null;
                                    }
                                    if (cVar != null) {
                                        ne.m f16 = state.f();
                                        Iterator<ne.g> it4 = f16.G(f16.c0(pop)).iterator();
                                        while (it4.hasNext()) {
                                            d11.add(cVar.a(state, it4.next()));
                                        }
                                    }
                                    z12 = z13;
                                }
                            }
                            r16 = z12;
                            state.c();
                            arrayList = new ArrayList();
                            Iterator it5 = hVar.iterator();
                            while (it5.hasNext()) {
                                ne.h hVar2 = (ne.h) it5.next();
                                Intrinsics.f(hVar2);
                                C7714v.p(d(state, hVar2, superConstructor), arrayList);
                            }
                            arrayList.size();
                            ArrayList<ne.h> arrayList2 = arrayList;
                            int i14 = 10;
                            ArrayList<ne.h> arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
                            for (ne.h hVar3 : arrayList2) {
                                Y u12 = f13.u(state.j(hVar3));
                                if (u12 != null) {
                                    hVar3 = u12;
                                }
                                arrayList3.add(hVar3);
                            }
                            size = arrayList3.size();
                            if (size != 0) {
                                ne.m f17 = state.f();
                                s0 c05 = f17.c0(subType4);
                                if (f17.j(c05)) {
                                    return f17.f0(c05);
                                }
                                if (f17.f0(f17.c0(subType4))) {
                                    return true;
                                }
                                state.g();
                                ArrayDeque<ne.h> d12 = state.d();
                                Intrinsics.f(d12);
                                te.i e12 = state.e();
                                Intrinsics.f(e12);
                                d12.push(subType4);
                                while (!d12.isEmpty()) {
                                    if (e12.getSize() > 1000) {
                                        throw new IllegalStateException(("Too many supertypes for type: " + subType4 + ". Supertypes = " + C7714v.V(e12, null, null, null, null, 63)).toString());
                                    }
                                    ne.h pop2 = d12.pop();
                                    Intrinsics.f(pop2);
                                    if (e12.add(pop2)) {
                                        r0.c cVar2 = f17.o(pop2) ? r0.c.C1145c.f69925a : r0.c.b.f69924a;
                                        if (Intrinsics.d(cVar2, r0.c.C1145c.f69925a)) {
                                            cVar2 = null;
                                        }
                                        if (cVar2 == null) {
                                            continue;
                                        } else {
                                            ne.m f18 = state.f();
                                            Iterator<ne.g> it6 = f18.G(f18.c0(pop2)).iterator();
                                            while (it6.hasNext()) {
                                                ne.h a11 = cVar2.a(state, it6.next());
                                                if (f17.f0(f17.c0(a11))) {
                                                    state.c();
                                                    return true;
                                                }
                                                d12.add(a11);
                                            }
                                        }
                                    }
                                }
                                state.c();
                                return r16;
                            }
                            if (size == 1) {
                                return h(state, f13.W((ne.h) C7714v.J(arrayList3)), superType4);
                            }
                            C8579a c8579a = new C8579a(f13.b(superConstructor));
                            int b11 = f13.b(superConstructor);
                            int i15 = r16;
                            int i16 = i15;
                            while (i15 < b11) {
                                i16 = (i16 == 0 && f13.O(f13.j0(superConstructor, i15)) == ne.q.OUT) ? r16 : i12;
                                if (i16 == 0) {
                                    ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, i14));
                                    for (ne.h hVar4 : arrayList3) {
                                        ne.j K11 = f13.K(hVar4, i15);
                                        if (K11 != null) {
                                            int i17 = i12;
                                            if (f13.z(K11) != ne.q.INV) {
                                                K11 = null;
                                            }
                                            if (K11 != null && (D11 = f13.D(K11)) != null) {
                                                arrayList4.add(D11);
                                                i12 = i17;
                                            }
                                        }
                                        throw new IllegalStateException(("Incorrect type: " + hVar4 + ", subType: " + subType4 + ", superType: " + superType4).toString());
                                    }
                                    i11 = i12;
                                    c8579a.add(f13.N(f13.g(arrayList4)));
                                } else {
                                    i11 = i12;
                                }
                                i15++;
                                i12 = i11;
                                i14 = 10;
                            }
                            ?? r17 = i12;
                            if (i16 == 0 && h(state, c8579a, superType4)) {
                                return r17;
                            }
                            C7378f block = new C7378f(arrayList3, state, f13, superType4);
                            Intrinsics.checkNotNullParameter(block, "block");
                            r0.a.C1144a c1144a = new r0.a.C1144a();
                            block.invoke(c1144a);
                            return c1144a.b();
                        }
                        arrayList = c(state, subType4, superConstructor);
                    }
                    r16 = 0;
                    arrayList.size();
                    ArrayList<ne.h> arrayList22 = arrayList;
                    int i142 = 10;
                    ArrayList<ne.h> arrayList32 = new ArrayList(C7714v.z(arrayList22, 10));
                    while (r3.hasNext()) {
                    }
                    size = arrayList32.size();
                    if (size != 0) {
                    }
                }
            }
            bool = null;
            if (bool == null) {
            }
        }
        return true;
    }

    private static boolean j(ne.m mVar, ne.g gVar, ne.g gVar2, ne.k kVar) {
        td.i0 l11;
        ne.i u11 = mVar.u(gVar);
        if (!(u11 instanceof InterfaceC8581c)) {
            return false;
        }
        InterfaceC8581c interfaceC8581c = (InterfaceC8581c) u11;
        if (mVar.w(interfaceC8581c) || !mVar.T(mVar.k(mVar.d0(interfaceC8581c))) || mVar.c(interfaceC8581c) != EnumC8580b.FOR_SUBTYPING) {
            return false;
        }
        s0 C11 = mVar.C(gVar2);
        ne.p pVar = C11 instanceof ne.p ? (ne.p) C11 : null;
        return (pVar == null || (l11 = mVar.l(pVar)) == null || !mVar.F(l11, kVar)) ? false : true;
    }
}
