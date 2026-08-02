package ke;

import java.util.ArrayList;
import java.util.Collection;
import je.A0;
import je.AbstractC7360E;
import je.C7401v;
import je.K0;
import je.W;
import je.Y;
import je.s0;
import je.y0;
import ke.InterfaceC7670b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ne.C8579a;
import ne.EnumC8580b;
import ne.InterfaceC8581c;
import org.jetbrains.annotations.NotNull;
import td.i0;

/* loaded from: classes.dex */
public final class u implements InterfaceC7670b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f71512a = new u();

    @Override // ne.m
    public final boolean A(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.C(kVar);
    }

    @Override // ne.m
    @NotNull
    public final Y B(@NotNull ne.d dVar) {
        return InterfaceC7670b.a.P(dVar);
    }

    @Override // ne.m
    @NotNull
    public final s0 C(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Y h11 = InterfaceC7670b.a.h(gVar);
        if (h11 == null) {
            h11 = I(gVar);
        }
        return InterfaceC7670b.a.V(h11);
    }

    @Override // ne.m
    @NotNull
    public final K0 D(@NotNull ne.j jVar) {
        return InterfaceC7670b.a.o(jVar);
    }

    @Override // ne.m
    public final boolean E(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.w(kVar);
    }

    @Override // ne.m
    public final boolean F(@NotNull ne.l lVar, ne.k kVar) {
        return InterfaceC7670b.a.u(lVar, kVar);
    }

    @Override // ne.m
    @NotNull
    public final Collection<ne.g> G(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.U(kVar);
    }

    @Override // ne.m
    public final K0 H(@NotNull InterfaceC8581c interfaceC8581c) {
        return InterfaceC7670b.a.N(interfaceC8581c);
    }

    @Override // ne.m
    @NotNull
    public final Y I(ne.g gVar) {
        Y M11;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC7360E g10 = InterfaceC7670b.a.g(gVar);
        if (g10 != null && (M11 = InterfaceC7670b.a.M(g10)) != null) {
            return M11;
        }
        Y h11 = InterfaceC7670b.a.h(gVar);
        Intrinsics.f(h11);
        return h11;
    }

    @Override // ne.m
    public final boolean J(@NotNull InterfaceC8581c interfaceC8581c) {
        return InterfaceC7670b.a.I(interfaceC8581c);
    }

    @Override // ne.m
    public final ne.j K(ne.h hVar, int i11) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (i11 < 0 || i11 >= InterfaceC7670b.a.b(hVar)) {
            return null;
        }
        return InterfaceC7670b.a.m(hVar, i11);
    }

    @Override // ne.m
    public final boolean L(@NotNull ne.k kVar, @NotNull ne.k kVar2) {
        return InterfaceC7670b.a.a(kVar, kVar2);
    }

    @Override // ne.m
    public final boolean M(ne.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Y h11 = InterfaceC7670b.a.h(hVar);
        return (h11 != null ? InterfaceC7670b.a.d(this, h11) : null) != null;
    }

    @Override // ne.m
    @NotNull
    public final A0 N(@NotNull ne.g gVar) {
        return InterfaceC7670b.a.i(gVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.q O(@NotNull ne.l lVar) {
        return InterfaceC7670b.a.s(lVar);
    }

    @Override // ne.m
    public final int P(ne.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof ne.h) {
            return InterfaceC7670b.a.b((ne.g) iVar);
        }
        if (iVar instanceof C8579a) {
            return ((C8579a) iVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + N.b(iVar.getClass())).toString());
    }

    @Override // ne.m
    @NotNull
    public final Y Q(@NotNull ne.e eVar) {
        return InterfaceC7670b.a.X(eVar);
    }

    @Override // ne.m
    public final Y R(@NotNull ne.h hVar, @NotNull EnumC8580b enumC8580b) {
        return InterfaceC7670b.a.j(hVar, enumC8580b);
    }

    @Override // ne.m
    public final void S(ne.h hVar, ne.k constructor) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
    }

    @Override // ne.m
    public final boolean T(@NotNull ne.j jVar) {
        return InterfaceC7670b.a.J(jVar);
    }

    @Override // ne.m
    public final boolean U(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC7360E g10 = InterfaceC7670b.a.g(gVar);
        return (g10 != null ? InterfaceC7670b.a.f(g10) : null) != null;
    }

    @Override // ne.m
    @NotNull
    public final C7671c V(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.T(this, hVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.i W(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.c(hVar);
    }

    @Override // ne.m
    @NotNull
    public final Y X(@NotNull ne.h hVar, boolean z11) {
        return InterfaceC7670b.a.Y(hVar, z11);
    }

    @Override // ke.InterfaceC7670b
    @NotNull
    public final K0 Y(@NotNull ne.h hVar, @NotNull ne.h hVar2) {
        return InterfaceC7670b.a.l(this, hVar, hVar2);
    }

    @Override // ne.m
    public final boolean Z(ne.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return InterfaceC7670b.a.C(InterfaceC7670b.a.V(hVar));
    }

    @Override // ne.m
    public final boolean a(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return !Intrinsics.d(InterfaceC7670b.a.V(I(gVar)), InterfaceC7670b.a.V(m(gVar)));
    }

    @Override // ne.m
    @NotNull
    public final Collection<ne.g> a0(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.R(this, hVar);
    }

    @Override // ne.m
    public final int b(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.Q(kVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.h b0(ne.h hVar) {
        Y P11;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        C7401v e11 = InterfaceC7670b.a.e(hVar);
        return (e11 == null || (P11 = InterfaceC7670b.a.P(e11)) == null) ? hVar : P11;
    }

    @Override // ne.m
    @NotNull
    public final EnumC8580b c(@NotNull InterfaceC8581c interfaceC8581c) {
        return InterfaceC7670b.a.k(interfaceC8581c);
    }

    @Override // ne.m
    @NotNull
    public final s0 c0(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.V(hVar);
    }

    @Override // ne.m
    public final boolean d(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.D(kVar);
    }

    @Override // ne.m
    @NotNull
    public final o d0(@NotNull InterfaceC8581c interfaceC8581c) {
        return InterfaceC7670b.a.W(interfaceC8581c);
    }

    @Override // ne.m
    @NotNull
    public final ne.g e(@NotNull ne.g gVar) {
        return InterfaceC7670b.a.Z(this, gVar);
    }

    @Override // ne.m
    public final boolean e0(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return InterfaceC7670b.a.E(I(gVar)) != InterfaceC7670b.a.E(m(gVar));
    }

    @Override // ne.m
    public final boolean f(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.K(hVar);
    }

    @Override // ne.m
    public final boolean f0(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.F(kVar);
    }

    @Override // ne.m
    @NotNull
    public final K0 g(@NotNull ArrayList types) {
        Intrinsics.checkNotNullParameter(types, "types");
        return d.a(types);
    }

    @Override // ne.m
    public final C7401v g0(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.e(hVar);
    }

    @Override // ne.m
    public final int h(@NotNull ne.g gVar) {
        return InterfaceC7670b.a.b(gVar);
    }

    @Override // ne.m
    public final boolean h0(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.z(kVar);
    }

    @Override // ne.m
    @NotNull
    public final Y i(@NotNull ne.e eVar) {
        return InterfaceC7670b.a.M(eVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.j i0(@NotNull ne.g gVar, int i11) {
        return InterfaceC7670b.a.m(gVar, i11);
    }

    @Override // ne.m
    public final boolean j(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.x(kVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.l j0(@NotNull ne.k kVar, int i11) {
        return InterfaceC7670b.a.n(kVar, i11);
    }

    @Override // ne.m
    @NotNull
    public final y0 k(@NotNull Wd.b bVar) {
        return InterfaceC7670b.a.S(bVar);
    }

    @Override // ne.m
    @NotNull
    public final ne.j k0(ne.i iVar, int i11) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof ne.h) {
            return InterfaceC7670b.a.m((ne.g) iVar, i11);
        }
        if (iVar instanceof C8579a) {
            ne.j jVar = ((C8579a) iVar).get(i11);
            Intrinsics.checkNotNullExpressionValue(jVar, "get(...)");
            return jVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + N.b(iVar.getClass())).toString());
    }

    @Override // ne.m
    public final i0 l(@NotNull ne.p pVar) {
        return InterfaceC7670b.a.p(pVar);
    }

    @Override // ne.m
    @NotNull
    public final K0 l0(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return InterfaceC7670b.a.O(gVar);
    }

    @Override // ne.m
    @NotNull
    public final Y m(ne.g gVar) {
        Y X9;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC7360E g10 = InterfaceC7670b.a.g(gVar);
        if (g10 != null && (X9 = InterfaceC7670b.a.X(g10)) != null) {
            return X9;
        }
        Y h11 = InterfaceC7670b.a.h(gVar);
        Intrinsics.f(h11);
        return h11;
    }

    @Override // ne.o
    public final boolean m0(@NotNull ne.h hVar, @NotNull ne.h hVar2) {
        return InterfaceC7670b.a.v(hVar, hVar2);
    }

    @Override // ne.m
    public final boolean n(ne.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return InterfaceC7670b.a.F(C(hVar)) && !InterfaceC7670b.a.G(hVar);
    }

    @NotNull
    public final ne.g n0(ne.g gVar) {
        Y Y11;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Y h11 = InterfaceC7670b.a.h(gVar);
        return (h11 == null || (Y11 = InterfaceC7670b.a.Y(h11, true)) == null) ? gVar : Y11;
    }

    @Override // ne.m
    public final boolean o(ne.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return InterfaceC7670b.a.x(InterfaceC7670b.a.V(hVar));
    }

    @Override // ne.m
    public final boolean p(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.L(hVar);
    }

    @Override // ne.m
    public final AbstractC7360E q(@NotNull ne.g gVar) {
        return InterfaceC7670b.a.g(gVar);
    }

    @Override // ne.m
    public final boolean r(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.A(hVar);
    }

    @Override // ne.m
    public final boolean s(ne.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Y h11 = InterfaceC7670b.a.h(gVar);
        return (h11 != null ? InterfaceC7670b.a.e(h11) : null) != null;
    }

    @Override // ne.m
    public final InterfaceC8581c t(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.d(this, hVar);
    }

    @Override // ne.m
    public final Y u(@NotNull ne.g gVar) {
        return InterfaceC7670b.a.h(gVar);
    }

    @Override // ne.m
    public final boolean v(@NotNull ne.k kVar) {
        return InterfaceC7670b.a.y(kVar);
    }

    @Override // ne.m
    public final boolean w(@NotNull InterfaceC8581c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof Wd.a;
    }

    @Override // ne.m
    public final boolean x(@NotNull ne.h hVar) {
        return InterfaceC7670b.a.E(hVar);
    }

    @Override // ne.m
    public final boolean y(@NotNull ne.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof W;
    }

    @Override // ne.m
    @NotNull
    public final ne.q z(@NotNull ne.j jVar) {
        return InterfaceC7670b.a.r(jVar);
    }
}
