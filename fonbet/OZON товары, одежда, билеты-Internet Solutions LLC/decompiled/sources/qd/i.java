package qd;

import Xd.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.N;
import je.Q;
import je.Y;
import je.p0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.s;
import rd.AbstractC9252f;
import rd.C9253g;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import te.C9865a;
import ud.C10034l;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class i {
    public static final int a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC10025c j11 = n11.getAnnotations().j(s.a.f81917q);
        if (j11 == null) {
            return 0;
        }
        Xd.g gVar = (Xd.g) U.e(j11.b(), s.f81858e);
        Intrinsics.g(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Xd.n) gVar).b().intValue();
    }

    @NotNull
    public static final Y b(@NotNull m builtIns, @NotNull InterfaceC10030h annotations, N n11, @NotNull List contextReceiverTypes, @NotNull ArrayList parameterTypes, @NotNull N returnType, boolean z11) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        ArrayList arrayList = new ArrayList(contextReceiverTypes.size() + parameterTypes.size() + (n11 != null ? 1 : 0) + 1);
        List list = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C8701c.a((N) it.next()));
        }
        arrayList.addAll(arrayList2);
        C9865a.a(arrayList, n11 != null ? C8701c.a(n11) : null);
        int i11 = 0;
        for (Object obj : parameterTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(C8701c.a((N) obj));
            i11 = i12;
        }
        arrayList.add(C8701c.a(returnType));
        int size = contextReceiverTypes.size() + parameterTypes.size() + (n11 == null ? 0 : 1);
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        InterfaceC9839e O11 = z11 ? builtIns.O(size) : builtIns.y(size);
        Intrinsics.f(O11);
        if (n11 != null) {
            Intrinsics.checkNotNullParameter(annotations, "<this>");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            Sd.c cVar = s.a.f81916p;
            if (!annotations.K0(cVar)) {
                annotations = InterfaceC10030h.a.a(C7714v.o0(annotations, new C10034l(builtIns, cVar, U.c())));
            }
        }
        if (!contextReceiverTypes.isEmpty()) {
            int size2 = contextReceiverTypes.size();
            Intrinsics.checkNotNullParameter(annotations, "<this>");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            Sd.c cVar2 = s.a.f81917q;
            if (!annotations.K0(cVar2)) {
                annotations = InterfaceC10030h.a.a(C7714v.o0(annotations, new C10034l(builtIns, cVar2, U.i(new Pair(s.f81858e, new Xd.n(size2))))));
            }
        }
        return Q.e(p0.b(annotations), O11, arrayList);
    }

    public static final Sd.f c(@NotNull N n11) {
        String b11;
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC10025c j11 = n11.getAnnotations().j(s.a.f81918r);
        if (j11 != null) {
            Object C02 = C7714v.C0(j11.b().values());
            x xVar = C02 instanceof x ? (x) C02 : null;
            if (xVar != null && (b11 = xVar.b()) != null) {
                if (!Sd.f.h(b11)) {
                    b11 = null;
                }
                if (b11 != null) {
                    return Sd.f.f(b11);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List<N> d(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        j(n11);
        int a11 = a(n11);
        if (a11 == 0) {
            return K.f71697a;
        }
        List<y0> subList = n11.F0().subList(0, a11);
        ArrayList arrayList = new ArrayList(C7714v.z(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).getType());
        }
        return arrayList;
    }

    public static final AbstractC9252f e(@NotNull InterfaceC9842h interfaceC9842h) {
        Intrinsics.checkNotNullParameter(interfaceC9842h, "<this>");
        if (!(interfaceC9842h instanceof InterfaceC9839e) || !m.k0(interfaceC9842h)) {
            return null;
        }
        Sd.d h11 = Zd.e.h(interfaceC9842h);
        if (!h11.f() || h11.e()) {
            return null;
        }
        C9253g c9253g = C9253g.f83309c;
        Sd.c packageFqName = h11.l().e();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "parent(...)");
        String className = h11.i().b();
        Intrinsics.checkNotNullExpressionValue(className, "asString(...)");
        c9253g.getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        C9253g.b b11 = c9253g.b(packageFqName, className);
        if (b11 != null) {
            return b11.c();
        }
        return null;
    }

    public static final N f(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        j(n11);
        if (n11.getAnnotations().j(s.a.f81916p) == null) {
            return null;
        }
        return n11.F0().get(a(n11)).getType();
    }

    @NotNull
    public static final N g(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        j(n11);
        N type = ((y0) C7714v.X(n11.F0())).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @NotNull
    public static final List<y0> h(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        j(n11);
        return n11.F0().subList((i(n11) ? 1 : 0) + a(n11), r0.size() - 1);
    }

    public static final boolean i(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return j(n11) && n11.getAnnotations().j(s.a.f81916p) != null;
    }

    public static final boolean j(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(p11, "<this>");
        AbstractC9252f e11 = e(p11);
        return Intrinsics.d(e11, AbstractC9252f.a.f83305c) || Intrinsics.d(e11, AbstractC9252f.d.f83308c);
    }

    public static final boolean k(@NotNull Y y11) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        Intrinsics.checkNotNullParameter(y11, "<this>");
        InterfaceC9842h p11 = y11.H0().p();
        return Intrinsics.d(p11 != null ? e(p11) : null, AbstractC9252f.a.f83305c);
    }

    public static final boolean l(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        return Intrinsics.d(p11 != null ? e(p11) : null, AbstractC9252f.d.f83308c);
    }
}
