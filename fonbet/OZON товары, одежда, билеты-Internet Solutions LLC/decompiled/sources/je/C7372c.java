package je;

import java.util.ArrayDeque;
import java.util.Iterator;
import je.r0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceC8581c;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7372c {
    public static boolean a(@NotNull r0 r0Var, @NotNull ne.h type, @NotNull r0.c supertypesPolicy) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        ne.m f7 = r0Var.f();
        if ((f7.o(type) && !f7.x(type)) || f7.s(type)) {
            return true;
        }
        r0Var.g();
        ArrayDeque<ne.h> d11 = r0Var.d();
        Intrinsics.f(d11);
        te.i e11 = r0Var.e();
        Intrinsics.f(e11);
        d11.push(type);
        while (!d11.isEmpty()) {
            if (e11.getSize() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + C7714v.V(e11, null, null, null, null, 63)).toString());
            }
            ne.h pop = d11.pop();
            Intrinsics.f(pop);
            if (e11.add(pop)) {
                r0.c cVar = f7.x(pop) ? r0.c.C1145c.f69925a : supertypesPolicy;
                if (Intrinsics.d(cVar, r0.c.C1145c.f69925a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ne.m f11 = r0Var.f();
                    Iterator<ne.g> it = f11.G(f11.c0(pop)).iterator();
                    while (it.hasNext()) {
                        ne.h a11 = cVar.a(r0Var, it.next());
                        if ((f7.o(a11) && !f7.x(a11)) || f7.s(a11)) {
                            r0Var.c();
                            return true;
                        }
                        d11.add(a11);
                    }
                }
            }
        }
        r0Var.c();
        return false;
    }

    private static boolean b(r0 r0Var, ne.h hVar, ne.k kVar) {
        ne.m f7 = r0Var.f();
        if (f7.n(hVar)) {
            return true;
        }
        if (f7.x(hVar)) {
            return false;
        }
        if (r0Var.i() && f7.f(hVar)) {
            return true;
        }
        return f7.L(f7.c0(hVar), kVar);
    }

    public static boolean c(@NotNull r0 state, @NotNull ne.h start, @NotNull ne.h superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        ne.m f7 = state.f();
        if (!f7.x(superType) && !f7.s(start) && !f7.y(start) && ((!(start instanceof InterfaceC8581c) || !f7.J((InterfaceC8581c) start)) && !a(state, start, r0.c.b.f69924a))) {
            if (f7.s(superType) || a(state, superType, r0.c.d.f69926a) || f7.o(start)) {
                return false;
            }
            s0 end = f7.c0(superType);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            ne.m f11 = state.f();
            if (!b(state, start, end)) {
                state.g();
                ArrayDeque<ne.h> d11 = state.d();
                Intrinsics.f(d11);
                te.i e11 = state.e();
                Intrinsics.f(e11);
                d11.push(start);
                while (!d11.isEmpty()) {
                    if (e11.getSize() > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + C7714v.V(e11, null, null, null, null, 63)).toString());
                    }
                    ne.h pop = d11.pop();
                    Intrinsics.f(pop);
                    if (e11.add(pop)) {
                        r0.c cVar = f11.x(pop) ? r0.c.C1145c.f69925a : r0.c.b.f69924a;
                        if (Intrinsics.d(cVar, r0.c.C1145c.f69925a)) {
                            cVar = null;
                        }
                        if (cVar == null) {
                            continue;
                        } else {
                            ne.m f12 = state.f();
                            Iterator<ne.g> it = f12.G(f12.c0(pop)).iterator();
                            while (it.hasNext()) {
                                ne.h a11 = cVar.a(state, it.next());
                                if (b(state, a11, end)) {
                                    state.c();
                                    return true;
                                }
                                d11.add(a11);
                            }
                        }
                    }
                }
                state.c();
                return false;
            }
        }
        return true;
    }
}
