package he;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.d0;
import ud.InterfaceC10030h;
import wd.Q;

/* renamed from: he.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6925G extends Q implements InterfaceC6932b {

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final Nd.m f65392B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final Pd.c f65393C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Pd.g f65394D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Pd.h f65395E;

    /* renamed from: F, reason: collision with root package name */
    private final v f65396F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6925G(@NotNull InterfaceC9845k containingDeclaration, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h annotations, @NotNull EnumC9812C modality, @NotNull AbstractC9853s visibility, boolean z11, @NotNull Sd.f name, @NotNull InterfaceC9836b.a kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull Nd.m proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Pd.h versionRequirementTable, v vVar) {
        super(containingDeclaration, interfaceC9831W, annotations, modality, visibility, z11, name, kind, d0.f99392a, z12, z13, z16, z14, z15);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f65392B = proto;
        this.f65393C = nameResolver;
        this.f65394D = typeTable;
        this.f65395E = versionRequirementTable;
        this.f65396F = vVar;
    }

    @Override // he.w
    @NotNull
    public final Pd.g A() {
        return this.f65394D;
    }

    @Override // wd.Q
    @NotNull
    protected final Q I0(@NotNull InterfaceC9845k newOwner, @NotNull EnumC9812C newModality, @NotNull AbstractC9853s newVisibility, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC9836b.a kind, @NotNull Sd.f newName) {
        d0 source = d0.f99392a;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C6925G(newOwner, interfaceC9831W, getAnnotations(), newModality, newVisibility, B(), newName, kind, z0(), J(), isExternal(), Y(), p0(), this.f65392B, this.f65393C, this.f65394D, this.f65395E, this.f65396F);
    }

    @Override // he.w
    public final Td.p L() {
        return this.f65392B;
    }

    @NotNull
    public final Nd.m R0() {
        return this.f65392B;
    }

    @Override // he.w
    @NotNull
    public final Pd.c a0() {
        return this.f65393C;
    }

    @Override // he.w
    public final v b0() {
        return this.f65396F;
    }

    @Override // wd.Q, td.InterfaceC9811B
    public final boolean isExternal() {
        Boolean d11 = Pd.b.f22218E.d(this.f65392B.U());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }
}
