package je;

import B0.C2506r1;
import Sc.InterfaceC4008j;
import ie.C7056e;
import ie.InterfaceC7059h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import je.u0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Hd.g f69936a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69937b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<a, N> f69938c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final td.i0 f69939a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Hd.a f69940b;

        public a(@NotNull td.i0 typeParameter, @NotNull Hd.a typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.f69939a = typeParameter;
            this.f69940b = typeAttr;
        }

        @NotNull
        public final Hd.a a() {
            return this.f69940b;
        }

        @NotNull
        public final td.i0 b() {
            return this.f69939a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(aVar.f69939a, this.f69939a) && Intrinsics.d(aVar.f69940b, this.f69940b);
        }

        public final int hashCode() {
            int hashCode = this.f69939a.hashCode();
            return this.f69940b.hashCode() + (hashCode * 31) + hashCode;
        }

        @NotNull
        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f69939a + ", typeAttr=" + this.f69940b + ')';
        }
    }

    public x0(Hd.g projectionComputer) {
        C2506r1 options = new C2506r1();
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f69936a = projectionComputer;
        C7056e c7056e = new C7056e("Type parameter upper bound erasure results");
        this.f69937b = Sc.k.b(new v0(this));
        InterfaceC7059h<a, N> d11 = c7056e.d(new w0(this));
        Intrinsics.checkNotNullExpressionValue(d11, "createMemoizedFunction(...)");
        this.f69938c = d11;
    }

    static N a(x0 x0Var, a aVar) {
        y0 a11;
        td.i0 b11 = aVar.b();
        Hd.a a12 = aVar.a();
        x0Var.getClass();
        Set<td.i0> e11 = a12.e();
        if (e11 != null && e11.contains(b11.n0())) {
            return x0Var.b(a12);
        }
        Y q11 = b11.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        LinkedHashSet<td.i0> f7 = C8701c.f(q11, e11);
        int h11 = kotlin.collections.U.h(C7714v.z(f7, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (td.i0 i0Var : f7) {
            if (e11 == null || !e11.contains(i0Var)) {
                a11 = x0Var.f69936a.a(i0Var, a12, x0Var, x0Var.c(i0Var, a12.k(b11)));
            } else {
                a11 = H0.o(i0Var, a12);
                Intrinsics.checkNotNullExpressionValue(a11, "makeStarProjection(...)");
            }
            Pair pair = new Pair(i0Var.k(), a11);
            linkedHashMap.put(pair.e(), pair.f());
        }
        F0 f11 = F0.f(u0.a.b(u0.f69930b, linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(f11, "create(...)");
        List<N> upperBounds = b11.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        Tc.j d11 = x0Var.d(f11, upperBounds, a12);
        if (d11.isEmpty()) {
            return x0Var.b(a12);
        }
        if (d11.getSize() == 1) {
            return (N) C7714v.A0(d11);
        }
        throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
    }

    private final K0 b(Hd.a aVar) {
        K0 r11;
        Y b11 = aVar.b();
        return (b11 == null || (r11 = C8701c.r(b11)) == null) ? (le.i) this.f69937b.getValue() : r11;
    }

    private final Tc.j d(F0 substitutor, List list, Hd.a aVar) {
        K0 k02;
        Tc.j builder = new Tc.j();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            N n11 = (N) it.next();
            InterfaceC9842h p11 = n11.H0().p();
            if (p11 instanceof InterfaceC9839e) {
                Set<td.i0> e11 = aVar.e();
                Intrinsics.checkNotNullParameter(n11, "<this>");
                Intrinsics.checkNotNullParameter(substitutor, "substitutor");
                K0 K02 = n11.K0();
                if (K02 instanceof AbstractC7360E) {
                    AbstractC7360E abstractC7360E = (AbstractC7360E) K02;
                    Y P02 = abstractC7360E.P0();
                    if (!P02.H0().getParameters().isEmpty() && P02.H0().p() != null) {
                        List<td.i0> parameters = P02.H0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        List<td.i0> list2 = parameters;
                        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                        for (td.i0 i0Var : list2) {
                            y0 y0Var = (y0) C7714v.Q(i0Var.getIndex(), n11.F0());
                            boolean z11 = e11 != null && e11.contains(i0Var);
                            if (y0Var != null && !z11) {
                                B0 h11 = substitutor.h();
                                N type = y0Var.getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                if (h11.e(type) != null) {
                                    arrayList.add(y0Var);
                                }
                            }
                            y0Var = new C7379f0(i0Var);
                            arrayList.add(y0Var);
                        }
                        P02 = D0.e(P02, arrayList, null, 2);
                    }
                    Y Q02 = abstractC7360E.Q0();
                    if (!Q02.H0().getParameters().isEmpty() && Q02.H0().p() != null) {
                        List<td.i0> parameters2 = Q02.H0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                        List<td.i0> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                        for (td.i0 i0Var2 : list3) {
                            y0 y0Var2 = (y0) C7714v.Q(i0Var2.getIndex(), n11.F0());
                            boolean z12 = e11 != null && e11.contains(i0Var2);
                            if (y0Var2 != null && !z12) {
                                B0 h12 = substitutor.h();
                                N type2 = y0Var2.getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                if (h12.e(type2) != null) {
                                    arrayList2.add(y0Var2);
                                }
                            }
                            y0Var2 = new C7379f0(i0Var2);
                            arrayList2.add(y0Var2);
                        }
                        Q02 = D0.e(Q02, arrayList2, null, 2);
                    }
                    k02 = Q.c(P02, Q02);
                } else {
                    if (!(K02 instanceof Y)) {
                        throw new Sc.o();
                    }
                    Y y11 = (Y) K02;
                    if (y11.H0().getParameters().isEmpty() || y11.H0().p() == null) {
                        k02 = y11;
                    } else {
                        List<td.i0> parameters3 = y11.H0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                        List<td.i0> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(C7714v.z(list4, 10));
                        for (td.i0 i0Var3 : list4) {
                            y0 y0Var3 = (y0) C7714v.Q(i0Var3.getIndex(), n11.F0());
                            boolean z13 = e11 != null && e11.contains(i0Var3);
                            if (y0Var3 != null && !z13) {
                                B0 h13 = substitutor.h();
                                N type3 = y0Var3.getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                if (h13.e(type3) != null) {
                                    arrayList3.add(y0Var3);
                                }
                            }
                            y0Var3 = new C7379f0(i0Var3);
                            arrayList3.add(y0Var3);
                        }
                        k02 = D0.e(y11, arrayList3, null, 2);
                    }
                }
                N j11 = substitutor.j(J0.b(k02, K02), L0.OUT_VARIANCE);
                Intrinsics.checkNotNullExpressionValue(j11, "safeSubstitute(...)");
                builder.add(j11);
            } else if (p11 instanceof td.i0) {
                Set<td.i0> e12 = aVar.e();
                if (e12 == null || !e12.contains(p11)) {
                    List<N> upperBounds = ((td.i0) p11).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    builder.addAll(d(substitutor, upperBounds, aVar));
                } else {
                    builder.add(b(aVar));
                }
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @NotNull
    public final N c(@NotNull td.i0 typeParameter, @NotNull Hd.a typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        N invoke = this.f69938c.invoke(new a(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }
}
