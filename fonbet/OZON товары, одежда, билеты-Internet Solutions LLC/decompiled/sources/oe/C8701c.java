package oe;

import Sc.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import je.A0;
import je.AbstractC7360E;
import je.AbstractC7376e;
import je.C7379f0;
import je.C7385i0;
import je.C7401v;
import je.D0;
import je.H0;
import je.J0;
import je.K0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.p0;
import je.s0;
import je.y0;
import ke.e;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.P;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.i;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.EnumC9840f;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.i0;
import ud.InterfaceC10030h;

/* renamed from: oe.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8701c {
    @NotNull
    public static final A0 a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return new A0(n11);
    }

    public static final boolean b(@NotNull N n11, @NotNull Function1<? super K0, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return H0.c(n11, predicate);
    }

    private static final boolean c(N n11, s0 s0Var, Set<? extends i0> set) {
        boolean c11;
        if (Intrinsics.d(n11.H0(), s0Var)) {
            return true;
        }
        InterfaceC9842h p11 = n11.H0().p();
        InterfaceC9843i interfaceC9843i = p11 instanceof InterfaceC9843i ? (InterfaceC9843i) p11 : null;
        List<i0> r11 = interfaceC9843i != null ? interfaceC9843i.r() : null;
        Iterable a12 = C7714v.a1(n11.F0());
        if (!(a12 instanceof Collection) || !((Collection) a12).isEmpty()) {
            Iterator it = a12.iterator();
            do {
                P p12 = (P) it;
                if (p12.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) p12.next();
                    int f71694a = indexedValue.getF71694a();
                    y0 y0Var = (y0) indexedValue.b();
                    i0 i0Var = r11 != null ? (i0) C7714v.Q(f71694a, r11) : null;
                    if ((i0Var == null || set == null || !set.contains(i0Var)) && !y0Var.a()) {
                        N type = y0Var.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        c11 = c(type, s0Var, set);
                    } else {
                        c11 = false;
                    }
                }
            } while (!c11);
            return true;
        }
        return false;
    }

    public static final boolean d(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return b(n11, C8699a.f78094a);
    }

    @NotNull
    public static final A0 e(@NotNull N type, @NotNull L0 projectionKind, i0 i0Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((i0Var != null ? i0Var.x() : null) == projectionKind) {
            projectionKind = L0.INVARIANT;
        }
        return new A0(type, projectionKind);
    }

    @NotNull
    public static final LinkedHashSet f(@NotNull Y y11, Set set) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g(y11, y11, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void g(N n11, Y y11, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 instanceof i0) {
            if (!Intrinsics.d(n11.H0(), y11.H0())) {
                linkedHashSet.add(p11);
                return;
            }
            for (N n12 : ((i0) p11).getUpperBounds()) {
                Intrinsics.f(n12);
                g(n12, y11, linkedHashSet, set);
            }
            return;
        }
        InterfaceC9842h p12 = n11.H0().p();
        InterfaceC9843i interfaceC9843i = p12 instanceof InterfaceC9843i ? (InterfaceC9843i) p12 : null;
        List<i0> r11 = interfaceC9843i != null ? interfaceC9843i.r() : null;
        int i11 = 0;
        for (y0 y0Var : n11.F0()) {
            int i12 = i11 + 1;
            i0 i0Var = r11 != null ? (i0) C7714v.Q(i11, r11) : null;
            if ((i0Var == null || set == null || !set.contains(i0Var)) && !y0Var.a() && !C7714v.A(linkedHashSet, y0Var.getType().H0().p()) && !Intrinsics.d(y0Var.getType().H0(), y11.H0())) {
                N type = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                g(type, y11, linkedHashSet, set);
            }
            i11 = i12;
        }
    }

    @NotNull
    public static final m h(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        m n12 = n11.H0().n();
        Intrinsics.checkNotNullExpressionValue(n12, "getBuiltIns(...)");
        return n12;
    }

    @NotNull
    public static final N i(@NotNull i0 i0Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        List<N> upperBounds = i0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<N> upperBounds2 = i0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC9842h p11 = ((N) next).H0().p();
            InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
            if (interfaceC9839e != null && interfaceC9839e.getKind() != EnumC9840f.INTERFACE && interfaceC9839e.getKind() != EnumC9840f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        N n11 = (N) obj;
        if (n11 != null) {
            return n11;
        }
        List<N> upperBounds3 = i0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object K11 = C7714v.K(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(K11, "first(...)");
        return (N) K11;
    }

    public static final boolean j(@NotNull i0 typeParameter, s0 s0Var, Set<? extends i0> set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<N> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<N> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (N n11 : list) {
            Intrinsics.f(n11);
            if (c(n11, typeParameter.q().H0(), set) && (s0Var == null || Intrinsics.d(n11.H0(), s0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean k(i0 i0Var, s0 s0Var, int i11) {
        if ((i11 & 2) != 0) {
            s0Var = null;
        }
        return j(i0Var, s0Var, null);
    }

    public static final boolean l(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        if (n11 instanceof AbstractC7376e) {
            return true;
        }
        return (n11 instanceof C7401v) && (((C7401v) n11).T0() instanceof AbstractC7376e);
    }

    public static final boolean m(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        if (n11 instanceof C7385i0) {
            return true;
        }
        return (n11 instanceof C7401v) && (((C7401v) n11).T0() instanceof C7385i0);
    }

    public static final boolean n(@NotNull N n11, @NotNull N superType) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return e.f71486a.d(n11, superType);
    }

    public static final boolean o(@NotNull Y type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (type instanceof i) && ((i) type).R0().b();
    }

    @NotNull
    public static final K0 p(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 j11 = H0.j(n11);
        Intrinsics.checkNotNullExpressionValue(j11, "makeNullable(...)");
        return j11;
    }

    @NotNull
    public static final N q(@NotNull N n11, @NotNull InterfaceC10030h newAnnotations) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (n11.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? n11 : n11.K0().N0(p0.a(n11.G0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [je.K0] */
    @NotNull
    public static final K0 r(@NotNull N n11) {
        Y y11;
        Intrinsics.checkNotNullParameter(n11, "<this>");
        K0 K02 = n11.K0();
        if (K02 instanceof AbstractC7360E) {
            AbstractC7360E abstractC7360E = (AbstractC7360E) K02;
            Y P02 = abstractC7360E.P0();
            if (!P02.H0().getParameters().isEmpty() && P02.H0().p() != null) {
                List<i0> parameters = P02.H0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                List<i0> list = parameters;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C7379f0((i0) it.next()));
                }
                P02 = D0.e(P02, arrayList, null, 2);
            }
            Y Q02 = abstractC7360E.Q0();
            if (!Q02.H0().getParameters().isEmpty() && Q02.H0().p() != null) {
                List<i0> parameters2 = Q02.H0().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                List<i0> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C7379f0((i0) it2.next()));
                }
                Q02 = D0.e(Q02, arrayList2, null, 2);
            }
            y11 = Q.c(P02, Q02);
        } else {
            if (!(K02 instanceof Y)) {
                throw new o();
            }
            Y y12 = (Y) K02;
            boolean isEmpty = y12.H0().getParameters().isEmpty();
            y11 = y12;
            if (!isEmpty) {
                InterfaceC9842h p11 = y12.H0().p();
                y11 = y12;
                if (p11 != null) {
                    List<i0> parameters3 = y12.H0().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                    List<i0> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C7714v.z(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C7379f0((i0) it3.next()));
                    }
                    y11 = D0.e(y12, arrayList3, null, 2);
                }
            }
        }
        return J0.b(y11, K02);
    }

    public static final boolean s(@NotNull Y y11) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        return b(y11, C8700b.f78095a);
    }
}
