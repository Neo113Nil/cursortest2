package wd;

import ce.l;
import de.C6183b;
import de.InterfaceC6187f;
import de.InterfaceC6188g;
import he.C6927I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import je.C7363H;
import je.C7373c0;
import je.F0;
import je.H0;
import je.L0;
import je.s0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9848n;
import td.h0;
import td.i0;
import ud.InterfaceC10030h;
import wd.Z;

/* renamed from: wd.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC10523i extends AbstractC10532s implements h0 {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f104295i = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(AbstractC10523i.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ie.o f104296e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC9853s f104297f;

    /* renamed from: g, reason: collision with root package name */
    private List<? extends i0> f104298g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C10522h f104299h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10523i(@NotNull ie.o storageManager, @NotNull InterfaceC9845k containingDeclaration, @NotNull InterfaceC10030h annotations, @NotNull Sd.f name, @NotNull AbstractC9853s visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        td.d0 sourceElement = td.d0.f99392a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        this.f104296e = storageManager;
        this.f104297f = visibilityImpl;
        storageManager.a(new C10519e(this));
        this.f104299h = new C10522h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Collection C0(AbstractC10523i abstractC10523i) {
        Z z11;
        InterfaceC9838d b22;
        List list;
        AbstractC10523i typeAliasDescriptor = abstractC10523i;
        typeAliasDescriptor.getClass();
        C6927I c6927i = (C6927I) typeAliasDescriptor;
        InterfaceC9839e i11 = c6927i.i();
        if (i11 == null) {
            return kotlin.collections.K.f71697a;
        }
        Collection<InterfaceC9838d> l11 = i11.l();
        Intrinsics.checkNotNullExpressionValue(l11, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9838d constructor : l11) {
            Z.a aVar = Z.f104263I;
            Intrinsics.f(constructor);
            aVar.getClass();
            ie.o storageManager = typeAliasDescriptor.f104296e;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            F0 e11 = c6927i.i() == null ? null : F0.e(c6927i.Z());
            if (e11 != null && (b22 = constructor.b2(e11)) != null) {
                InterfaceC10030h annotations = constructor.getAnnotations();
                InterfaceC9836b.a kind = constructor.getKind();
                Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
                td.d0 e12 = typeAliasDescriptor.e();
                Intrinsics.checkNotNullExpressionValue(e12, "getSource(...)");
                Z z12 = new Z(storageManager, typeAliasDescriptor, b22, annotations, kind, e12);
                ArrayList J02 = AbstractC10539z.J0(z12, constructor.f(), e11);
                if (J02 != null) {
                    je.Y b11 = C7363H.b(b22.getReturnType().K0());
                    je.Y q11 = c6927i.q();
                    Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
                    je.Y d11 = C7373c0.d(b11, q11);
                    InterfaceC9834Z c02 = constructor.c0();
                    U h11 = c02 != null ? Vd.h.h(z12, e11.j(c02.getType(), L0.INVARIANT), InterfaceC10030h.a.b()) : null;
                    InterfaceC9839e i12 = c6927i.i();
                    if (i12 != null) {
                        List<InterfaceC9834Z> y02 = constructor.y0();
                        Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
                        List<InterfaceC9834Z> list2 = y02;
                        list = new ArrayList(C7714v.z(list2, 10));
                        int i13 = 0;
                        for (Object obj : list2) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            InterfaceC9834Z interfaceC9834Z = (InterfaceC9834Z) obj;
                            je.N j11 = e11.j(interfaceC9834Z.getType(), L0.INVARIANT);
                            InterfaceC6188g value = interfaceC9834Z.getValue();
                            Intrinsics.g(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                            list.add(new U(i12, new C6183b(i12, j11, ((InterfaceC6187f) value).a()), InterfaceC10030h.a.b(), Sd.g.a(i13)));
                            i13 = i14;
                        }
                    } else {
                        list = kotlin.collections.K.f71697a;
                    }
                    z12.L0(h11, null, list, abstractC10523i.r(), J02, d11, EnumC9812C.FINAL, abstractC10523i.getVisibility());
                    z11 = z12;
                    if (z11 == null) {
                        arrayList.add(z11);
                    }
                    typeAliasDescriptor = abstractC10523i;
                }
            }
            z11 = null;
            if (z11 == null) {
            }
            typeAliasDescriptor = abstractC10523i;
        }
        return arrayList;
    }

    @NotNull
    protected final je.Y F0() {
        ce.l lVar;
        C6927I c6927i = (C6927I) this;
        InterfaceC9839e i11 = c6927i.i();
        if (i11 == null || (lVar = i11.I()) == null) {
            lVar = l.b.f57046b;
        }
        C10521g c10521g = new C10521g(c6927i);
        le.i iVar = H0.f69834a;
        je.Y c11 = le.l.k(this) ? le.l.c(le.k.UNABLE_TO_SUBSTITUTE_TYPE, toString()) : H0.p(k(), lVar, c10521g);
        Intrinsics.checkNotNullExpressionValue(c11, "makeUnsubstitutedType(...)");
        return c11;
    }

    @NotNull
    protected abstract List<i0> G0();

    public final void H0(@NotNull List<? extends i0> declaredTypeParameters) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.f104298g = declaredTypeParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.a(this, (StringBuilder) d11);
    }

    @Override // wd.AbstractC10532s, wd.r, td.InterfaceC9845k
    /* renamed from: a */
    public final InterfaceC9842h n0() {
        return this;
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return H0.c(((C6927I) this).w0(), new C10520f(this));
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @NotNull
    protected final ie.o getStorageManager() {
        return this.f104296e;
    }

    @Override // td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        return this.f104297f;
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        return false;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        return this.f104299h;
    }

    @Override // wd.AbstractC10532s
    public final InterfaceC9848n n0() {
        return this;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        List list = this.f104298g;
        if (list != null) {
            return list;
        }
        Intrinsics.n("declaredTypeParametersImpl");
        throw null;
    }

    @Override // wd.r
    @NotNull
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // wd.AbstractC10532s, wd.r, td.InterfaceC9845k
    /* renamed from: a */
    public final InterfaceC9845k n0() {
        return this;
    }
}
