package qd;

import ie.C7056e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import je.s0;
import je.y0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import ud.InterfaceC10030h;
import wd.C10533t;
import wd.M;
import wd.a0;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final M f81927a;

    static {
        int i11 = le.l.f73271f;
        C10533t c10533t = new C10533t(le.l.g(), s.f81859f);
        EnumC9840f enumC9840f = EnumC9840f.INTERFACE;
        Sd.f g10 = s.f81860g.g();
        ie.o oVar = C7056e.f66260e;
        M m11 = new M(c10533t, enumC9840f, g10, oVar);
        m11.G0(EnumC9812C.ABSTRACT);
        m11.I0(C9852r.f99403e);
        m11.H0(C7714v.a0(a0.J0(m11, InterfaceC10030h.a.b(), L0.IN_VARIANCE, Sd.f.f("T"), 0, (C7056e) oVar)));
        m11.F0();
        f81927a = m11;
    }

    @NotNull
    public static final Y a(@NotNull N suspendFunType) {
        Intrinsics.checkNotNullParameter(suspendFunType, "suspendFunType");
        i.l(suspendFunType);
        m h11 = C8701c.h(suspendFunType);
        InterfaceC10030h annotations = suspendFunType.getAnnotations();
        N f7 = i.f(suspendFunType);
        List<N> d11 = i.d(suspendFunType);
        List<y0> h12 = i.h(suspendFunType);
        ArrayList arrayList = new ArrayList(C7714v.z(h12, 10));
        Iterator<T> it = h12.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).getType());
        }
        o0.f69907b.getClass();
        o0 o0Var = o0.f69908c;
        s0 k11 = f81927a.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        ArrayList q02 = C7714v.q0(Q.f(C7714v.a0(C8701c.a(i.g(suspendFunType))), o0Var, k11, null, false), arrayList);
        Y C11 = C8701c.h(suspendFunType).C();
        Intrinsics.checkNotNullExpressionValue(C11, "getNullableAnyType(...)");
        return i.b(h11, annotations, f7, d11, q02, C11, false).L0(suspendFunType.I0());
    }
}
