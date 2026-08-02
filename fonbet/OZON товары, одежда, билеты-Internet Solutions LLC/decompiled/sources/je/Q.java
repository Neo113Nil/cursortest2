package je;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* loaded from: classes.dex */
public final class Q {

    /* loaded from: classes10.dex */
    private static final class a {
    }

    static Y a(List list, o0 o0Var, s0 s0Var, ke.h refiner, boolean z11) {
        Intrinsics.checkNotNullParameter(refiner, "refiner");
        d(s0Var, refiner, list);
        return null;
    }

    static Y b(s0 s0Var, List list, o0 o0Var, boolean z11, ce.l lVar, ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        d(s0Var, kotlinTypeRefiner, list);
        return null;
    }

    @NotNull
    public static final K0 c(@NotNull Y lowerBound, @NotNull Y upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.d(lowerBound, upperBound) ? lowerBound : new C7361F(lowerBound, upperBound);
    }

    private static a d(s0 s0Var, ke.h hVar, List list) {
        InterfaceC9842h p11 = s0Var.p();
        if (p11 != null) {
            hVar.d(p11);
        }
        return null;
    }

    @NotNull
    public static final Y e(@NotNull o0 attributes, @NotNull InterfaceC9839e descriptor, @NotNull List<? extends y0> arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        s0 k11 = descriptor.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        return f(arguments, attributes, k11, null, false);
    }

    @NotNull
    public static final Y f(@NotNull List arguments, @NotNull o0 attributes, @NotNull s0 constructor, ke.h hVar, boolean z11) {
        ce.l b11;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z11 && constructor.p() != null) {
            InterfaceC9842h p11 = constructor.p();
            Intrinsics.f(p11);
            Y q11 = p11.q();
            Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
            return q11;
        }
        InterfaceC9842h p12 = constructor.p();
        if (p12 instanceof td.i0) {
            b11 = ((td.i0) p12).q().p();
        } else if (p12 instanceof InterfaceC9839e) {
            if (hVar == null) {
                hVar = Zd.e.i(Zd.e.j(p12));
            }
            b11 = arguments.isEmpty() ? wd.H.b((InterfaceC9839e) p12, hVar) : wd.H.a((InterfaceC9839e) p12, u0.f69930b.a(constructor, arguments), hVar);
        } else if (p12 instanceof td.h0) {
            b11 = le.l.a(le.h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((td.h0) p12).getName().toString());
        } else {
            if (!(constructor instanceof M)) {
                throw new IllegalStateException("Unsupported classifier: " + p12 + " for constructor: " + constructor);
            }
            b11 = ((M) constructor).b();
        }
        return h(attributes, constructor, arguments, z11, b11, new O(constructor, arguments, attributes, z11));
    }

    @NotNull
    public static final Y g(@NotNull ce.l memberScope, @NotNull List arguments, @NotNull o0 attributes, @NotNull s0 constructor, boolean z11) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Z z12 = new Z(constructor, arguments, z11, memberScope, new P(memberScope, arguments, attributes, constructor, z11));
        return attributes.isEmpty() ? z12 : new C7369a0(z12, attributes);
    }

    @NotNull
    public static final Y h(@NotNull o0 attributes, @NotNull s0 constructor, @NotNull List<? extends y0> arguments, boolean z11, @NotNull ce.l memberScope, @NotNull Function1<? super ke.h, ? extends Y> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        Z z12 = new Z(constructor, arguments, z11, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? z12 : new C7369a0(z12, attributes);
    }
}
