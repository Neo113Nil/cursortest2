package wd;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.F0;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd.C9251e;
import td.AbstractC9853s;
import td.C9852r;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9857w;
import td.p0;
import td.q0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public class c0 extends d0 implements p0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f104280f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f104281g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f104282h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f104283i;

    /* renamed from: j, reason: collision with root package name */
    private final je.N f104284j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final p0 f104285k;

    /* loaded from: classes10.dex */
    public static final class a extends c0 {

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final InterfaceC4008j f104286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InterfaceC9857w containingDeclaration, p0 p0Var, int i11, @NotNull InterfaceC10030h annotations, @NotNull Sd.f name, @NotNull je.N outType, boolean z11, boolean z12, boolean z13, je.N n11, @NotNull td.d0 source, @NotNull Function0 destructuringVariables) {
            super(containingDeclaration, p0Var, i11, annotations, name, outType, z11, z12, z13, n11, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.f104286l = Sc.k.b(destructuringVariables);
        }

        @NotNull
        public final List<q0> C0() {
            return (List) this.f104286l.getValue();
        }

        @Override // wd.c0, td.p0
        @NotNull
        public final p0 o0(@NotNull C9251e newOwner, @NotNull Sd.f newName, int i11) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            InterfaceC10030h annotations = getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
            je.N type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean R11 = R();
            boolean u02 = u0();
            boolean t02 = t0();
            je.N x02 = x0();
            td.d0 NO_SOURCE = td.d0.f99392a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new a(newOwner, null, i11, annotations, newName, type, R11, u02, t02, x02, NO_SOURCE, new b0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull InterfaceC9835a containingDeclaration, p0 p0Var, int i11, @NotNull InterfaceC10030h annotations, @NotNull Sd.f name, @NotNull je.N outType, boolean z11, boolean z12, boolean z13, je.N n11, @NotNull td.d0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f104280f = i11;
        this.f104281g = z11;
        this.f104282h = z12;
        this.f104283i = z13;
        this.f104284j = n11;
        this.f104285k = p0Var == null ? this : p0Var;
    }

    @Override // td.q0
    public final boolean B() {
        return false;
    }

    @Override // td.p0
    public final boolean R() {
        if (!this.f104281g) {
            return false;
        }
        InterfaceC9836b.a kind = ((InterfaceC9836b) d()).getKind();
        kind.getClass();
        return kind != InterfaceC9836b.a.FAKE_OVERRIDE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.m(this, (StringBuilder) d11);
    }

    @Override // td.f0
    /* renamed from: b */
    public final InterfaceC9835a b2(F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.i()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // td.p0
    public final int getIndex() {
        return this.f104280f;
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s LOCAL = C9852r.f99404f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final Collection<p0> o() {
        Collection<? extends InterfaceC9835a> o11 = d().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC9835a> collection = o11;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9835a) it.next()).f().get(this.f104280f));
        }
        return arrayList;
    }

    @Override // td.p0
    @NotNull
    public p0 o0(@NotNull C9251e newOwner, @NotNull Sd.f newName, int i11) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        InterfaceC10030h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        je.N type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean R11 = R();
        td.d0 NO_SOURCE = td.d0.f99392a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new c0(newOwner, null, i11, annotations, newName, type, R11, this.f104282h, this.f104283i, this.f104284j, NO_SOURCE);
    }

    @Override // td.q0
    public final /* bridge */ /* synthetic */ Xd.g s0() {
        return null;
    }

    @Override // td.p0
    public final boolean t0() {
        return this.f104283i;
    }

    @Override // td.p0
    public final boolean u0() {
        return this.f104282h;
    }

    @Override // td.p0
    public final je.N x0() {
        return this.f104284j;
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9845k
    @NotNull
    public final InterfaceC9835a d() {
        InterfaceC9845k d11 = super.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC9835a) d11;
    }

    @Override // wd.AbstractC10532s
    @NotNull
    /* renamed from: a */
    public final p0 n0() {
        p0 p0Var = this.f104285k;
        return p0Var == this ? this : p0Var.n0();
    }
}
