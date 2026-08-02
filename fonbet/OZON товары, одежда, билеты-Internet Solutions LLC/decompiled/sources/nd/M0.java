package nd;

import Qd.C3856a;
import he.C6925G;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import nd.AbstractC8552n;
import nd.AbstractC8556p;
import nd.J0;
import od.i;
import od.k;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.InterfaceC9831W;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public final class M0 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final od.h a(J0.a aVar, boolean z11) {
        Regex regex;
        AbstractC8552n.e c11;
        Method c12;
        od.h aVar2;
        C3856a.b u11;
        Method q11;
        Method f7;
        regex = AbstractC8537f0.f76965a;
        if (regex.f(aVar.D().K())) {
            return od.l.f78061a;
        }
        int i11 = c1.f76958b;
        AbstractC8556p c13 = c1.c(aVar.D().t());
        if (c13 instanceof AbstractC8556p.c) {
            AbstractC8556p.c cVar = (AbstractC8556p.c) c13;
            C3856a.c e11 = cVar.e();
            if (z11) {
                if (e11.B()) {
                    u11 = e11.s();
                    q11 = u11 != null ? aVar.D().q().q(cVar.c().getString(u11.l()), cVar.c().getString(u11.j())) : null;
                    if (q11 == null) {
                        aVar2 = !Modifier.isStatic(q11.getModifiers()) ? aVar.z() ? new i.g.a(q11, d(aVar)) : new i.g.e(q11) : aVar.D().t().getAnnotations().K0(g1.h()) ? aVar.z() ? new i.g.b(q11) : new i.g.f(q11) : aVar.z() ? new i.g.c(q11, d(aVar)) : new i.g.C1320g(q11);
                    } else if (Vd.k.e(aVar.D().t()) && Intrinsics.d(aVar.D().t().getVisibility(), C9852r.f99402d)) {
                        Class<?> j11 = od.n.j(aVar.D().t().d());
                        if (j11 == null || (f7 = od.n.f(j11, aVar.D().t())) == null) {
                            throw new V0("Underlying property of inline class " + aVar.D() + " should have a field");
                        }
                        aVar2 = aVar.z() ? new k.a(f7, d(aVar)) : new k.b(f7);
                    } else {
                        Field J11 = aVar.D().J();
                        if (J11 == null) {
                            throw new V0("No accessors or field is found for property " + aVar.D());
                        }
                        aVar2 = b(aVar, z11, J11);
                    }
                }
                u11 = null;
                if (u11 != null) {
                }
                if (q11 == null) {
                }
            } else {
                if (e11.C()) {
                    u11 = e11.u();
                    if (u11 != null) {
                    }
                    if (q11 == null) {
                    }
                }
                u11 = null;
                if (u11 != null) {
                }
                if (q11 == null) {
                }
            }
        } else if (c13 instanceof AbstractC8556p.a) {
            aVar2 = b(aVar, z11, ((AbstractC8556p.a) c13).b());
        } else {
            if (!(c13 instanceof AbstractC8556p.b)) {
                if (!(c13 instanceof AbstractC8556p.d)) {
                    throw new Sc.o();
                }
                if (z11) {
                    c11 = ((AbstractC8556p.d) c13).b();
                } else {
                    c11 = ((AbstractC8556p.d) c13).c();
                    if (c11 == null) {
                        throw new V0("No setter found for property " + aVar.D());
                    }
                }
                Method q12 = aVar.D().q().q(c11.c(), c11.b());
                if (q12 != null) {
                    Modifier.isStatic(q12.getModifiers());
                    return aVar.z() ? new i.g.a(q12, d(aVar)) : new i.g.e(q12);
                }
                throw new V0("No accessor found for property " + aVar.D());
            }
            if (z11) {
                c12 = ((AbstractC8556p.b) c13).b();
            } else {
                AbstractC8556p.b bVar = (AbstractC8556p.b) c13;
                c12 = bVar.c();
                if (c12 == null) {
                    throw new V0("No source found for setter of Java method property: " + bVar.b());
                }
            }
            aVar2 = aVar.z() ? new i.g.a(c12, d(aVar)) : new i.g.e(c12);
        }
        return od.n.d(aVar2, aVar.C(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (Rd.h.e(((he.C6925G) r0).R0()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (Vd.i.p(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final od.i<Field> b(J0.a<?, ?> aVar, boolean z11, Field field) {
        InterfaceC9831W t2 = aVar.D().t();
        InterfaceC9845k d11 = t2.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        if (Vd.i.s(d11)) {
            InterfaceC9845k d12 = d11.d();
            if (!Vd.i.w(d12)) {
            }
            if (t2 instanceof C6925G) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            return aVar.D().t().getAnnotations().K0(g1.h()) ? z11 ? aVar.z() ? new i.e.b(field) : new i.e.d(field) : aVar.z() ? new i.f.b(field, c(aVar)) : new i.f.d(field, c(aVar)) : z11 ? new i.e.C1319e(field) : new i.f.e(field, c(aVar));
        }
        return z11 ? aVar.z() ? new i.e.a(field, d(aVar)) : new i.e.c(field) : aVar.z() ? new i.f.a(field, c(aVar), d(aVar)) : new i.f.c(field, c(aVar));
    }

    private static final boolean c(J0.a<?, ?> aVar) {
        return !je.H0.g(aVar.D().t().getType());
    }

    public static final Object d(@NotNull J0.a<?, ?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.D().F();
    }
}
