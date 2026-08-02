package pe;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.A0;
import je.C7363H;
import je.D0;
import je.F0;
import je.H0;
import je.J0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.s0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.i0;

/* renamed from: pe.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8902c {

    /* renamed from: pe.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80409a;

        static {
            int[] iArr = new int[L0.values().length];
            try {
                iArr[L0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80409a = iArr;
        }
    }

    @NotNull
    public static final C8900a<N> a(@NotNull N type) {
        Object c11;
        C8904e c8904e;
        Intrinsics.checkNotNullParameter(type, "type");
        if (C7363H.a(type)) {
            C8900a<N> a11 = a(C7363H.b(type));
            C8900a<N> a12 = a(C7363H.c(type));
            return new C8900a<>(J0.b(Q.c(C7363H.b(a11.c()), C7363H.c(a12.c())), type), J0.b(Q.c(C7363H.b(a11.d()), C7363H.c(a12.d())), type));
        }
        s0 H02 = type.H0();
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type.H0() instanceof Wd.b) {
            Intrinsics.g(H02, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            y0 projection = ((Wd.b) H02).getProjection();
            N type2 = projection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            N l11 = H0.l(type2, type.I0());
            Intrinsics.checkNotNullExpressionValue(l11, "makeNullableIfNeeded(...)");
            int i11 = a.f80409a[projection.b().ordinal()];
            if (i11 == 2) {
                return new C8900a<>(l11, C8701c.h(type).C());
            }
            if (i11 != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
            Y B11 = C8701c.h(type).B();
            Intrinsics.checkNotNullExpressionValue(B11, "getNothingType(...)");
            N l12 = H0.l(B11, type.I0());
            Intrinsics.checkNotNullExpressionValue(l12, "makeNullableIfNeeded(...)");
            return new C8900a<>(l12, l11);
        }
        if (type.F0().isEmpty() || type.F0().size() != H02.getParameters().size()) {
            return new C8900a<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<y0> F02 = type.F0();
        List<i0> parameters = H02.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator it = C7714v.b1(F02, parameters).iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!((C8904e) it2.next()).d()) {
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    c11 = C8701c.h(type).B();
                    Intrinsics.checkNotNullExpressionValue(c11, "getNothingType(...)");
                } else {
                    c11 = c(type, arrayList);
                }
                return new C8900a<>(c11, c(type, arrayList2));
            }
            Pair pair = (Pair) it.next();
            y0 y0Var = (y0) pair.a();
            i0 i0Var = (i0) pair.b();
            Intrinsics.f(i0Var);
            int i12 = a.f80409a[F0.b(i0Var.x(), y0Var).ordinal()];
            if (i12 == 1) {
                N type3 = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                N type4 = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                c8904e = new C8904e(i0Var, type3, type4);
            } else if (i12 == 2) {
                N type5 = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                Y C11 = Zd.e.e(i0Var).C();
                Intrinsics.checkNotNullExpressionValue(C11, "getNullableAnyType(...)");
                c8904e = new C8904e(i0Var, type5, C11);
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                Y B12 = Zd.e.e(i0Var).B();
                Intrinsics.checkNotNullExpressionValue(B12, "getNothingType(...)");
                N type6 = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                c8904e = new C8904e(i0Var, B12, type6);
            }
            if (y0Var.a()) {
                arrayList.add(c8904e);
                arrayList2.add(c8904e);
            } else {
                C8900a<N> a13 = a(c8904e.a());
                N a14 = a13.a();
                N b11 = a13.b();
                C8900a<N> a15 = a(c8904e.b());
                C8900a c8900a = new C8900a(new C8904e(c8904e.c(), b11, a15.a()), new C8904e(c8904e.c(), a14, a15.b()));
                C8904e c8904e2 = (C8904e) c8900a.a();
                C8904e c8904e3 = (C8904e) c8900a.b();
                arrayList.add(c8904e2);
                arrayList2.add(c8904e3);
            }
        }
    }

    public static final y0 b(y0 y0Var, boolean z11) {
        if (y0Var == null) {
            return null;
        }
        if (!y0Var.a()) {
            N type = y0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (H0.c(type, C8901b.f80408a)) {
                L0 b11 = y0Var.b();
                Intrinsics.checkNotNullExpressionValue(b11, "getProjectionKind(...)");
                if (b11 == L0.OUT_VARIANCE) {
                    return new A0(a(type).d(), b11);
                }
                if (z11) {
                    return new A0(a(type).c(), b11);
                }
                F0 f7 = F0.f(new C8903d());
                Intrinsics.checkNotNullExpressionValue(f7, "create(...)");
                return f7.m(y0Var);
            }
        }
        return y0Var;
    }

    private static final N c(N n11, ArrayList arrayList) {
        A0 a02;
        n11.F0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8904e c8904e = (C8904e) it.next();
            c8904e.d();
            if (!Intrinsics.d(c8904e.a(), c8904e.b())) {
                L0 x11 = c8904e.c().x();
                L0 l02 = L0.IN_VARIANCE;
                if (x11 != l02) {
                    if (m.c0(c8904e.a()) && c8904e.c().x() != l02) {
                        L0 l03 = L0.OUT_VARIANCE;
                        if (l03 == c8904e.c().x()) {
                            l03 = L0.INVARIANT;
                        }
                        a02 = new A0(c8904e.b(), l03);
                    } else if (m.d0(c8904e.b())) {
                        if (l02 == c8904e.c().x()) {
                            l02 = L0.INVARIANT;
                        }
                        a02 = new A0(c8904e.a(), l02);
                    } else {
                        L0 l04 = L0.OUT_VARIANCE;
                        if (l04 == c8904e.c().x()) {
                            l04 = L0.INVARIANT;
                        }
                        a02 = new A0(c8904e.b(), l04);
                    }
                    arrayList2.add(a02);
                }
            }
            a02 = new A0(c8904e.a());
            arrayList2.add(a02);
        }
        return D0.d(n11, arrayList2, null, 6);
    }
}
