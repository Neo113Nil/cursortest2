package nd;

import Qd.C3856a;
import Rd.d;
import Td.h;
import ae.EnumC5003e;
import he.C6925G;
import he.InterfaceC6932b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC8552n;
import nd.AbstractC8556p;
import org.jetbrains.annotations.NotNull;
import qd.s;
import sd.C9659a;
import sd.C9661c;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9833Y;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import wd.AbstractC10532s;
import zd.C11093A;
import zd.C11096D;
import zd.C11104f;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Sd.b f76957a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76958b = 0;

    static {
        Sd.c topLevelFqName = new Sd.c("java.lang.Void");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        f76957a = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
    }

    @NotNull
    public static Sd.b a(@NotNull Class klass) {
        qd.p g10;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            g10 = componentType.isPrimitive() ? EnumC5003e.b(componentType.getSimpleName()).g() : null;
            if (g10 != null) {
                return new Sd.b(qd.s.f81865l, g10.e());
            }
            Sd.c topLevelFqName = s.a.f81907g.l();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            return new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
        }
        if (klass.equals(Void.TYPE)) {
            return f76957a;
        }
        g10 = klass.isPrimitive() ? EnumC5003e.b(klass.getSimpleName()).g() : null;
        if (g10 != null) {
            return new Sd.b(qd.s.f81865l, g10.g());
        }
        Sd.b a11 = C11104f.a(klass);
        if (!a11.i()) {
            int i11 = C9661c.f98575o;
            Sd.b j11 = C9661c.j(a11.a());
            if (j11 != null) {
                return j11;
            }
        }
        return a11;
    }

    private static AbstractC8552n.e b(InterfaceC9857w interfaceC9857w) {
        String b11 = Cd.P.b(interfaceC9857w);
        if (b11 == null) {
            if (interfaceC9857w instanceof InterfaceC9832X) {
                String b12 = Zd.e.l(interfaceC9857w).getName().b();
                Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
                b11 = Cd.E.b(b12);
            } else if (interfaceC9857w instanceof InterfaceC9833Y) {
                String b13 = Zd.e.l(interfaceC9857w).getName().b();
                Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
                b11 = Cd.E.c(b13);
            } else {
                b11 = interfaceC9857w.getName().b();
                Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            }
        }
        return new AbstractC8552n.e(new d.b(b11, Ld.D.a(interfaceC9857w, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static AbstractC8556p c(@NotNull InterfaceC9831W possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        InterfaceC9831W n02 = ((InterfaceC9831W) Vd.i.F(possiblyOverriddenProperty)).n0();
        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
        if (n02 instanceof C6925G) {
            C6925G c6925g = (C6925G) n02;
            Nd.m R02 = c6925g.R0();
            h.f<Nd.m, C3856a.c> propertySignature = C3856a.f23235d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            C3856a.c cVar = (C3856a.c) Pd.e.a(R02, propertySignature);
            if (cVar != null) {
                return new AbstractC8556p.c((C6925G) n02, R02, cVar, c6925g.a0(), c6925g.A());
            }
        } else if (n02 instanceof Ed.f) {
            Ed.f fVar = (Ed.f) n02;
            td.d0 e11 = fVar.e();
            Id.a aVar = e11 instanceof Id.a ? (Id.a) e11 : null;
            zd.y a11 = aVar != null ? aVar.a() : null;
            if (a11 instanceof C11093A) {
                return new AbstractC8556p.a(((C11093A) a11).K());
            }
            if (!(a11 instanceof C11096D)) {
                throw new V0("Incorrect resolution sequence for Java field " + n02 + " (source = " + a11 + ')');
            }
            Method K11 = ((C11096D) a11).K();
            InterfaceC9833Y setter = fVar.getSetter();
            td.d0 e12 = setter != null ? ((AbstractC10532s) setter).e() : null;
            Id.a aVar2 = e12 instanceof Id.a ? (Id.a) e12 : null;
            zd.y a12 = aVar2 != null ? aVar2.a() : null;
            C11096D c11096d = a12 instanceof C11096D ? (C11096D) a12 : null;
            return new AbstractC8556p.b(K11, c11096d != null ? c11096d.K() : null);
        }
        wd.S getter = n02.getGetter();
        Intrinsics.f(getter);
        AbstractC8552n.e b11 = b(getter);
        InterfaceC9833Y setter2 = n02.getSetter();
        return new AbstractC8556p.d(b11, setter2 != null ? b(setter2) : null);
    }

    @NotNull
    public static AbstractC8552n d(@NotNull InterfaceC9857w possiblySubstitutedFunction) {
        Sd.f fVar;
        Method K11;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC9857w n02 = ((InterfaceC9857w) Vd.i.F(possiblySubstitutedFunction)).n0();
        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
        if (!(n02 instanceof InterfaceC6932b)) {
            if (n02 instanceof Ed.e) {
                td.d0 e11 = ((Ed.e) n02).e();
                Id.a aVar = e11 instanceof Id.a ? (Id.a) e11 : null;
                zd.y a11 = aVar != null ? aVar.a() : null;
                C11096D c11096d = a11 instanceof C11096D ? (C11096D) a11 : null;
                if (c11096d != null && (K11 = c11096d.K()) != null) {
                    return new AbstractC8552n.c(K11);
                }
                throw new V0("Incorrect resolution sequence for Java method " + n02);
            }
            if (n02 instanceof Ed.b) {
                td.d0 e12 = ((Ed.b) n02).e();
                Id.a aVar2 = e12 instanceof Id.a ? (Id.a) e12 : null;
                zd.y a12 = aVar2 != null ? aVar2.a() : null;
                if (a12 instanceof zd.x) {
                    return new AbstractC8552n.b(((zd.x) a12).K());
                }
                if (a12 instanceof zd.u) {
                    zd.u uVar = (zd.u) a12;
                    if (uVar.p()) {
                        return new AbstractC8552n.a(uVar.J());
                    }
                }
                throw new V0("Incorrect resolution sequence for Java constructor " + n02 + " (" + a12 + ')');
            }
            if (!Vd.h.l(n02) && (!n02.getName().equals(qd.s.f81854a) || n02.getKind() != InterfaceC9836b.a.SYNTHESIZED || !Vd.i.u(n02.d()))) {
                Sd.f name = n02.getName();
                fVar = C9659a.f98558e;
                if (!Intrinsics.d(name, fVar) || !n02.f().isEmpty()) {
                    throw new V0("Unknown origin of " + n02 + " (" + n02.getClass() + ')');
                }
            }
            return b(n02);
        }
        he.w wVar = (he.w) n02;
        Td.p L11 = wVar.L();
        if (L11 instanceof Nd.h) {
            int i11 = Rd.h.f25024b;
            d.b d11 = Rd.h.d((Nd.h) L11, wVar.a0(), wVar.A());
            if (d11 != null) {
                return new AbstractC8552n.e(d11);
            }
        }
        if (L11 instanceof Nd.c) {
            int i12 = Rd.h.f25024b;
            d.b b11 = Rd.h.b((Nd.c) L11, wVar.a0(), wVar.A());
            if (b11 != null) {
                InterfaceC9845k d12 = possiblySubstitutedFunction.d();
                Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
                if (Vd.k.b(d12)) {
                    return new AbstractC8552n.e(b11);
                }
                InterfaceC9845k d13 = possiblySubstitutedFunction.d();
                Intrinsics.checkNotNullExpressionValue(d13, "getContainingDeclaration(...)");
                if (!Vd.k.d(d13)) {
                    return new AbstractC8552n.d(b11);
                }
                InterfaceC9844j interfaceC9844j = (InterfaceC9844j) possiblySubstitutedFunction;
                if (interfaceC9844j.k0()) {
                    if (!Intrinsics.d(b11.d(), "constructor-impl") || !kotlin.text.h.A(b11.c(), ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
                    }
                } else {
                    if (!Intrinsics.d(b11.d(), "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
                    }
                    InterfaceC9839e K12 = interfaceC9844j.K();
                    Intrinsics.checkNotNullExpressionValue(K12, "getConstructedClass(...)");
                    Intrinsics.checkNotNullParameter(K12, "<this>");
                    Sd.b f7 = Zd.e.f(K12);
                    Intrinsics.f(f7);
                    String b12 = Rd.b.b(f7.b());
                    if (kotlin.text.h.A(b11.c(), ")V", false)) {
                        b11 = d.b.b(b11, kotlin.text.h.U(b11.c(), "V") + b12);
                    } else if (!kotlin.text.h.A(b11.c(), b12, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + b11).toString());
                    }
                }
                return new AbstractC8552n.e(b11);
            }
        }
        return b(n02);
    }
}
