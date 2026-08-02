package fe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;

/* renamed from: fe.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6537p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6535n f63244a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pd.c f63245b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9845k f63246c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Pd.g f63247d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Pd.h f63248e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Pd.a f63249f;

    /* renamed from: g, reason: collision with root package name */
    private final Ld.t f63250g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final X f63251h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final K f63252i;

    public C6537p(@NotNull C6535n components, @NotNull Pd.c nameResolver, @NotNull InterfaceC9845k containingDeclaration, @NotNull Pd.g typeTable, @NotNull Pd.h versionRequirementTable, @NotNull Pd.a metadataVersion, Ld.t tVar, X x11, @NotNull List typeParameters) {
        String f7;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f63244a = components;
        this.f63245b = nameResolver;
        this.f63246c = containingDeclaration;
        this.f63247d = typeTable;
        this.f63248e = versionRequirementTable;
        this.f63249f = metadataVersion;
        this.f63250g = tVar;
        this.f63251h = new X(this, x11, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (tVar == null || (f7 = tVar.f()) == null) ? "[container not found]" : f7);
        this.f63252i = new K(this);
    }

    @NotNull
    public final C6537p a(@NotNull InterfaceC9845k descriptor, @NotNull List<Nd.r> typeParameterProtos, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Pd.h versionRequirementTable, @NotNull Pd.a version) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(version, "metadataVersion");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(version, "version");
        if ((version.a() != 1 || version.b() < 4) && version.a() <= 1) {
            versionRequirementTable = this.f63248e;
        }
        return new C6537p(this.f63244a, nameResolver, descriptor, typeTable, versionRequirementTable, version, this.f63250g, this.f63251h, typeParameterProtos);
    }

    @NotNull
    public final C6535n c() {
        return this.f63244a;
    }

    public final he.v d() {
        return this.f63250g;
    }

    @NotNull
    public final InterfaceC9845k e() {
        return this.f63246c;
    }

    @NotNull
    public final K f() {
        return this.f63252i;
    }

    @NotNull
    public final Pd.c g() {
        return this.f63245b;
    }

    @NotNull
    public final ie.o h() {
        return this.f63244a.u();
    }

    @NotNull
    public final X i() {
        return this.f63251h;
    }

    @NotNull
    public final Pd.g j() {
        return this.f63247d;
    }

    @NotNull
    public final Pd.h k() {
        return this.f63248e;
    }
}
