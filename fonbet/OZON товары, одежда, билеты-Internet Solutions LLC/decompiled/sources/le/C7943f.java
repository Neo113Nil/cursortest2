package le;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import je.F0;
import je.N;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9833Y;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.d0;
import td.i0;
import td.p0;
import ud.InterfaceC10030h;
import wd.C10536w;
import wd.Q;
import wd.S;

/* renamed from: le.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7943f implements InterfaceC9831W {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Q f73254a;

    public C7943f() {
        int i11 = l.f73271f;
        Q H02 = Q.H0(l.f(), InterfaceC10030h.a.b(), EnumC9812C.OPEN, C9852r.f99403e, true, Sd.f.i(EnumC7939b.ERROR_PROPERTY.a()), InterfaceC9836b.a.DECLARATION, d0.f99392a);
        N i12 = l.i();
        K k11 = K.f71697a;
        H02.P0(i12, k11, null, null, k11);
        this.f73254a = H02;
    }

    @Override // td.q0
    public final boolean B() {
        return this.f73254a.B();
    }

    @Override // td.InterfaceC9831W
    public final C10536w C() {
        return this.f73254a.C();
    }

    @Override // td.q0
    public final boolean J() {
        return this.f73254a.J();
    }

    @Override // td.InterfaceC9831W
    public final C10536w O() {
        return this.f73254a.O();
    }

    @Override // td.InterfaceC9835a
    public final <V> V P(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a) {
        throw null;
    }

    @Override // td.InterfaceC9836b
    public final void S(@NotNull Collection<? extends InterfaceC9836b> overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
        this.f73254a.S(overriddenDescriptors);
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        Q q11 = this.f73254a;
        q11.getClass();
        return (R) interfaceC9847m.c(q11, d11);
    }

    @Override // td.InterfaceC9831W
    public final boolean Y() {
        return this.f73254a.Y();
    }

    @Override // td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9831W n0() {
        InterfaceC9831W n02 = this.f73254a.n0();
        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
        return n02;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // td.f0
    /* renamed from: b */
    public final InterfaceC9831W b2(@NotNull F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this.f73254a.b2(substitutor);
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z c0() {
        return this.f73254a.c0();
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        InterfaceC9845k d11 = this.f73254a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        return d11;
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z d0() {
        return this.f73254a.d0();
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final d0 e() {
        d0 e11 = this.f73254a.e();
        Intrinsics.checkNotNullExpressionValue(e11, "getSource(...)");
        return e11;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        this.f73254a.f();
        List<p0> list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameters(...)");
        return list;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        this.f73254a.getClass();
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        InterfaceC10030h annotations = this.f73254a.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // td.InterfaceC9831W
    public final S getGetter() {
        return this.f73254a.K0();
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b.a getKind() {
        InterfaceC9836b.a kind = this.f73254a.getKind();
        Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
        return kind;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        Sd.f name = this.f73254a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // td.InterfaceC9835a
    public final N getReturnType() {
        return this.f73254a.getReturnType();
    }

    @Override // td.InterfaceC9831W
    public final InterfaceC9833Y getSetter() {
        return this.f73254a.getSetter();
    }

    @Override // td.o0
    @NotNull
    public final N getType() {
        N type = this.f73254a.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<i0> getTypeParameters() {
        List<i0> typeParameters = this.f73254a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s visibility = this.f73254a.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C h11 = this.f73254a.h();
        Intrinsics.checkNotNullExpressionValue(h11, "getModality(...)");
        return h11;
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        return this.f73254a.isExternal();
    }

    @Override // td.InterfaceC9835a
    public final boolean m0() {
        this.f73254a.getClass();
        return false;
    }

    @Override // td.InterfaceC9836b, td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9831W> o() {
        Collection<? extends InterfaceC9831W> o11 = this.f73254a.o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        return o11;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return this.f73254a.p0();
    }

    @Override // td.q0
    public final Xd.g<?> s0() {
        return this.f73254a.s0();
    }

    @Override // td.InterfaceC9831W
    @NotNull
    public final ArrayList t() {
        ArrayList t2 = this.f73254a.t();
        Intrinsics.checkNotNullExpressionValue(t2, "getAccessors(...)");
        return t2;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        Q u11 = this.f73254a.u(interfaceC9839e, enumC9812C, abstractC9850p, aVar);
        Intrinsics.checkNotNullExpressionValue(u11, "copy(...)");
        return u11;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<InterfaceC9834Z> y0() {
        List<InterfaceC9834Z> y02 = this.f73254a.y0();
        Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
        return y02;
    }

    @Override // td.q0
    public final boolean z0() {
        return this.f73254a.z0();
    }
}
