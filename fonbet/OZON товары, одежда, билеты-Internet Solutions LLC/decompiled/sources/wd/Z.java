package wd;

import he.C6927I;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.F0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9843i;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9848n;
import td.InterfaceC9857w;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;

/* loaded from: classes10.dex */
public final class Z extends AbstractC10539z implements X {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final ie.o f104265E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final AbstractC10523i f104266F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k f104267G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private InterfaceC9838d f104268H;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f104264J = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(Z.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    public static final a f104263I = new a();

    public static final class a {
    }

    public /* synthetic */ Z(ie.o oVar, AbstractC10523i abstractC10523i, InterfaceC9838d interfaceC9838d, InterfaceC10030h interfaceC10030h, InterfaceC9836b.a aVar, td.d0 d0Var) {
        this(oVar, abstractC10523i, interfaceC9838d, null, interfaceC10030h, aVar, d0Var);
    }

    static Z a1(Z z11, InterfaceC9838d interfaceC9838d) {
        ie.o oVar = z11.f104265E;
        InterfaceC10030h annotations = interfaceC9838d.getAnnotations();
        InterfaceC9836b.a kind = interfaceC9838d.getKind();
        Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
        AbstractC10523i abstractC10523i = z11.f104266F;
        td.d0 e11 = abstractC10523i.e();
        Intrinsics.checkNotNullExpressionValue(e11, "getSource(...)");
        Z z12 = new Z(oVar, z11.f104266F, interfaceC9838d, z11, annotations, kind, e11);
        f104263I.getClass();
        C6927I c6927i = (C6927I) abstractC10523i;
        F0 e12 = c6927i.i() == null ? null : F0.e(c6927i.Z());
        if (e12 == null) {
            return null;
        }
        InterfaceC9834Z c02 = interfaceC9838d.c0();
        AbstractC10518d b22 = c02 != null ? c02.b2(e12) : null;
        List<InterfaceC9834Z> y02 = interfaceC9838d.y0();
        Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
        List<InterfaceC9834Z> list = y02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9834Z) it.next()).b2(e12));
        }
        z12.L0(null, b22, arrayList, abstractC10523i.r(), z11.f(), z11.getReturnType(), EnumC9812C.FINAL, abstractC10523i.getVisibility());
        return z12;
    }

    @Override // wd.X
    @NotNull
    public final InterfaceC9838d E() {
        return this.f104268H;
    }

    @Override // wd.AbstractC10539z
    public final AbstractC10539z G0(Sd.f fVar, InterfaceC9836b.a kind, InterfaceC9845k newOwner, InterfaceC9857w interfaceC9857w, td.d0 source, InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        InterfaceC9836b.a aVar = InterfaceC9836b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC9836b.a aVar2 = InterfaceC9836b.a.SYNTHESIZED;
        }
        return new Z(this.f104265E, this.f104266F, this.f104268H, this, annotations, aVar, source);
    }

    @Override // td.InterfaceC9844j
    @NotNull
    public final InterfaceC9839e K() {
        InterfaceC9839e K11 = this.f104268H.K();
        Intrinsics.checkNotNullExpressionValue(K11, "getConstructedClass(...)");
        return K11;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w, td.f0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC9844j b2(F0 f02) {
        throw null;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9836b
    @NotNull
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final X u(@NotNull InterfaceC9839e newOwner, @NotNull EnumC9812C modality, @NotNull AbstractC9850p visibility, @NotNull InterfaceC9836b.a kind) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        AbstractC10539z.a M02 = M0(F0.f69829b);
        M02.q(newOwner);
        M02.l(modality);
        M02.n(visibility);
        M02.b(kind);
        M02.f104381m = false;
        InterfaceC9848n H02 = M02.f104392x.H0(M02);
        Intrinsics.g(H02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (X) H02;
    }

    @Override // wd.AbstractC10539z, wd.AbstractC10532s
    @NotNull
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final X n0() {
        InterfaceC9857w n02 = super.n0();
        Intrinsics.g(n02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (X) n02;
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9845k
    public final InterfaceC9843i d() {
        return this.f104266F;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w, td.f0
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final Z b2(@NotNull F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        InterfaceC9857w b22 = super.b2(substitutor);
        Intrinsics.g(b22, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        Z z11 = (Z) b22;
        F0 e11 = F0.e(z11.getReturnType());
        Intrinsics.checkNotNullExpressionValue(e11, "create(...)");
        InterfaceC9838d b23 = this.f104268H.n0().b2(e11);
        if (b23 == null) {
            return null;
        }
        z11.f104268H = b23;
        return z11;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9835a
    @NotNull
    public final je.N getReturnType() {
        je.N returnType = super.getReturnType();
        Intrinsics.f(returnType);
        return returnType;
    }

    @Override // td.InterfaceC9844j
    public final boolean k0() {
        return this.f104268H.k0();
    }

    private Z(ie.o oVar, AbstractC10523i abstractC10523i, InterfaceC9838d interfaceC9838d, Z z11, InterfaceC10030h interfaceC10030h, InterfaceC9836b.a aVar, td.d0 d0Var) {
        super(Sd.h.f26148e, aVar, abstractC10523i, z11, d0Var, interfaceC10030h);
        this.f104265E = oVar;
        this.f104266F = abstractC10523i;
        O0(false);
        this.f104267G = oVar.b(new Y(this, interfaceC9838d));
        this.f104268H = interfaceC9838d;
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9845k
    public final InterfaceC9845k d() {
        return this.f104266F;
    }
}
