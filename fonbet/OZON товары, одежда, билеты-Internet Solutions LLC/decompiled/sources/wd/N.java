package wd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class N extends AbstractC10532s implements InterfaceC9820K {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Sd.c f104209e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f104210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(@NotNull InterfaceC9815F module, @NotNull Sd.c fqName) {
        super(module, InterfaceC10030h.a.b(), fqName.h(), td.d0.f99392a);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f104209e = fqName;
        this.f104210f = "package " + fqName + " of " + module;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.g(this, (StringBuilder) d11);
    }

    @Override // td.InterfaceC9820K
    @NotNull
    public final Sd.c c() {
        return this.f104209e;
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9848n
    @NotNull
    public td.d0 e() {
        td.d0 NO_SOURCE = td.d0.f99392a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // wd.r
    @NotNull
    public String toString() {
        return this.f104210f;
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9845k
    @NotNull
    public final InterfaceC9815F d() {
        InterfaceC9845k d11 = super.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC9815F) d11;
    }
}
