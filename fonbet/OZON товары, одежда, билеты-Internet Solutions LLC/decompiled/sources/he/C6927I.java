package he;

import java.util.List;
import je.D0;
import je.F0;
import je.L0;
import je.N;
import je.S;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.d0;
import td.i0;
import td.m0;
import ud.InterfaceC10030h;
import wd.AbstractC10523i;

/* renamed from: he.I, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6927I extends AbstractC10523i implements w {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Nd.q f65402j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Pd.c f65403k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Pd.g f65404l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Pd.h f65405m;

    /* renamed from: n, reason: collision with root package name */
    private final v f65406n;

    /* renamed from: o, reason: collision with root package name */
    private Y f65407o;

    /* renamed from: p, reason: collision with root package name */
    private Y f65408p;

    /* renamed from: q, reason: collision with root package name */
    private List<? extends i0> f65409q;

    /* renamed from: r, reason: collision with root package name */
    private Y f65410r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6927I(@NotNull ie.o storageManager, @NotNull InterfaceC9845k containingDeclaration, @NotNull InterfaceC10030h annotations, @NotNull Sd.f name, @NotNull AbstractC9853s visibility, @NotNull Nd.q proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Pd.h versionRequirementTable, v vVar) {
        super(storageManager, containingDeclaration, annotations, name, visibility);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        d0 NO_SOURCE = d0.f99392a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        this.f65402j = proto;
        this.f65403k = nameResolver;
        this.f65404l = typeTable;
        this.f65405m = versionRequirementTable;
        this.f65406n = vVar;
    }

    @Override // he.w
    @NotNull
    public final Pd.g A() {
        return this.f65404l;
    }

    @Override // wd.AbstractC10523i
    @NotNull
    protected final List<i0> G0() {
        List list = this.f65409q;
        if (list != null) {
            return list;
        }
        Intrinsics.n("typeConstructorParameters");
        throw null;
    }

    public final void I0(@NotNull List<? extends i0> declaredTypeParameters, @NotNull Y underlyingType, @NotNull Y expandedType) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        H0(declaredTypeParameters);
        this.f65407o = underlyingType;
        this.f65408p = expandedType;
        this.f65409q = m0.c(this);
        this.f65410r = F0();
    }

    @Override // he.w
    public final Td.p L() {
        return this.f65402j;
    }

    @Override // td.h0
    @NotNull
    public final Y Z() {
        Y y11 = this.f65408p;
        if (y11 != null) {
            return y11;
        }
        Intrinsics.n("expandedType");
        throw null;
    }

    @Override // he.w
    @NotNull
    public final Pd.c a0() {
        return this.f65403k;
    }

    @Override // td.f0
    /* renamed from: b */
    public final InterfaceC9843i b2(F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.i()) {
            return this;
        }
        ie.o storageManager = getStorageManager();
        InterfaceC9845k d11 = d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        InterfaceC10030h annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        Sd.f name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C6927I c6927i = new C6927I(storageManager, d11, annotations, name, getVisibility(), this.f65402j, this.f65403k, this.f65404l, this.f65405m, this.f65406n);
        List<i0> r11 = r();
        Y w02 = w0();
        L0 l02 = L0.INVARIANT;
        N j11 = substitutor.j(w02, l02);
        Intrinsics.checkNotNullExpressionValue(j11, "safeSubstitute(...)");
        Y a11 = D0.a(j11);
        N j12 = substitutor.j(Z(), l02);
        Intrinsics.checkNotNullExpressionValue(j12, "safeSubstitute(...)");
        c6927i.I0(r11, a11, D0.a(j12));
        return c6927i;
    }

    @Override // he.w
    public final v b0() {
        return this.f65406n;
    }

    @Override // td.h0
    public final InterfaceC9839e i() {
        if (S.a(Z())) {
            return null;
        }
        InterfaceC9842h p11 = Z().H0().p();
        if (p11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) p11;
        }
        return null;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final Y q() {
        Y y11 = this.f65410r;
        if (y11 != null) {
            return y11;
        }
        Intrinsics.n("defaultTypeImpl");
        throw null;
    }

    @Override // td.h0
    @NotNull
    public final Y w0() {
        Y y11 = this.f65407o;
        if (y11 != null) {
            return y11;
        }
        Intrinsics.n("underlyingType");
        throw null;
    }
}
