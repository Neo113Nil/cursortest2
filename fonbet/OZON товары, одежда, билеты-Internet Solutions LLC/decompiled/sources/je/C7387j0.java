package je;

import ce.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import je.C7389k0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* renamed from: je.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7387j0 {
    static {
        new C7387j0();
    }

    public C7387j0() {
        C7391l0 reportStrategy = C7391l0.f69902a;
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
    }

    private final void a(InterfaceC10030h interfaceC10030h, InterfaceC10030h interfaceC10030h2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10025c> it = interfaceC10030h.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        for (InterfaceC10025c annotation : interfaceC10030h2) {
            if (hashSet.contains(annotation.c())) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
            }
        }
    }

    private final Y c(C7389k0 c7389k0, o0 o0Var, boolean z11, int i11, boolean z12) {
        y0 d11 = d(new A0(c7389k0.b().w0(), L0.INVARIANT), c7389k0, null, i11);
        N type = d11.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Y a11 = D0.a(type);
        if (S.a(a11)) {
            return a11;
        }
        d11.b();
        a(a11.getAnnotations(), C7397q.a(o0Var));
        if (!S.a(a11)) {
            a11 = D0.e(a11, null, S.a(a11) ? a11.G0() : o0Var.i(a11.G0()), 1);
        }
        Y m11 = H0.m(a11, z11);
        Intrinsics.checkNotNullExpressionValue(m11, "let(...)");
        if (!z12) {
            return m11;
        }
        s0 k11 = c7389k0.b().k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        return C7373c0.d(m11, Q.g(l.b.f57046b, c7389k0.a(), o0Var, k11, z11));
    }

    private final y0 d(y0 y0Var, C7389k0 c7389k0, td.i0 i0Var, int i11) {
        L0 l02;
        N e11;
        L0 l03;
        L0 l04;
        td.h0 b11 = c7389k0.b();
        if (i11 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + b11.getName());
        }
        if (y0Var.a()) {
            Intrinsics.f(i0Var);
            C7379f0 n11 = H0.n(i0Var);
            Intrinsics.checkNotNullExpressionValue(n11, "makeStarProjection(...)");
            return n11;
        }
        N type = y0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        y0 c11 = c7389k0.c(type.H0());
        if (c11 != null) {
            if (c11.a()) {
                Intrinsics.f(i0Var);
                C7379f0 n12 = H0.n(i0Var);
                Intrinsics.checkNotNullExpressionValue(n12, "makeStarProjection(...)");
                return n12;
            }
            K0 substitutedArgument = c11.getType().K0();
            L0 b12 = c11.b();
            Intrinsics.checkNotNullExpressionValue(b12, "getProjectionKind(...)");
            L0 b13 = y0Var.b();
            Intrinsics.checkNotNullExpressionValue(b13, "getProjectionKind(...)");
            if (b13 != b12 && b13 != (l04 = L0.INVARIANT)) {
                if (b12 == l04) {
                    b12 = b13;
                } else {
                    td.h0 typeAlias = c7389k0.b();
                    Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            if (i0Var == null || (l02 = i0Var.x()) == null) {
                l02 = L0.INVARIANT;
            }
            if (l02 != b12 && l02 != (l03 = L0.INVARIANT)) {
                if (b12 == l03) {
                    b12 = l03;
                } else {
                    td.h0 typeAlias2 = c7389k0.b();
                    Intrinsics.checkNotNullParameter(typeAlias2, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            a(type.getAnnotations(), substitutedArgument.getAnnotations());
            if (substitutedArgument instanceof C7356A) {
                C7356A c7356a = (C7356A) substitutedArgument;
                o0 newAttributes = S.a(c7356a) ? c7356a.G0() : type.G0().i(c7356a.G0());
                Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
                e11 = new C7356A(C8701c.h(c7356a.Q0()), newAttributes);
            } else {
                Y m11 = H0.m(D0.a(substitutedArgument), type.I0());
                Intrinsics.checkNotNullExpressionValue(m11, "makeNullableIfNeeded(...)");
                e11 = S.a(m11) ? m11 : D0.e(m11, null, S.a(m11) ? m11.G0() : type.G0().i(m11.G0()), 1);
            }
            return new A0(e11, b12);
        }
        K0 K02 = y0Var.getType().K0();
        if (!C7357B.a(K02)) {
            Y a11 = D0.a(K02);
            if (!S.a(a11) && C8701c.s(a11)) {
                s0 H02 = a11.H0();
                InterfaceC9842h p11 = H02.p();
                H02.getParameters().size();
                a11.F0().size();
                if (!(p11 instanceof td.i0)) {
                    int i12 = 0;
                    if (!(p11 instanceof td.h0)) {
                        Y e12 = e(a11, c7389k0, i11);
                        Intrinsics.checkNotNullExpressionValue(F0.e(e12), "create(...)");
                        for (Object obj : e12.F0()) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            y0 y0Var2 = (y0) obj;
                            if (!y0Var2.a()) {
                                N type2 = y0Var2.getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                if (!C8701c.d(type2)) {
                                    a11.F0().get(i12);
                                    a11.H0().getParameters().get(i12);
                                }
                            }
                            i12 = i13;
                        }
                        return new A0(e12, y0Var.b());
                    }
                    td.h0 typeAlias3 = (td.h0) p11;
                    if (c7389k0.d(typeAlias3)) {
                        Intrinsics.checkNotNullParameter(typeAlias3, "typeAlias");
                        return new A0(le.l.c(le.k.RECURSIVE_TYPE_ALIAS, typeAlias3.getName().toString()), L0.INVARIANT);
                    }
                    List<y0> F02 = a11.F0();
                    ArrayList arrayList = new ArrayList(C7714v.z(F02, 10));
                    for (Object obj2 : F02) {
                        int i14 = i12 + 1;
                        if (i12 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        arrayList.add(d((y0) obj2, c7389k0, H02.getParameters().get(i12), i11 + 1));
                        i12 = i14;
                    }
                    Y c12 = c(C7389k0.a.a(c7389k0, typeAlias3, arrayList), a11.G0(), a11.I0(), i11 + 1, false);
                    Y e13 = e(a11, c7389k0, i11);
                    if (!C7357B.a(c12)) {
                        c12 = C7373c0.d(c12, e13);
                    }
                    return new A0(c12, y0Var.b());
                }
            }
        }
        return y0Var;
    }

    private final Y e(Y y11, C7389k0 c7389k0, int i11) {
        s0 H02 = y11.H0();
        List<y0> F02 = y11.F0();
        ArrayList arrayList = new ArrayList(C7714v.z(F02, 10));
        int i12 = 0;
        for (Object obj : F02) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            y0 y0Var = (y0) obj;
            y0 d11 = d(y0Var, c7389k0, H02.getParameters().get(i12), i11 + 1);
            if (!d11.a()) {
                d11 = new A0(H0.l(d11.getType(), y0Var.getType().I0()), d11.b());
            }
            arrayList.add(d11);
            i12 = i13;
        }
        return D0.e(y11, arrayList, null, 2);
    }

    @NotNull
    public final Y b(@NotNull C7389k0 typeAliasExpansion, @NotNull o0 attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return c(typeAliasExpansion, attributes, false, 0, true);
    }
}
