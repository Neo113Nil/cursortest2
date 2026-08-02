package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;

/* renamed from: je.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7364I extends B0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final td.i0[] f69839b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0[] f69840c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69841d;

    public C7364I() {
        throw null;
    }

    public C7364I(@NotNull td.i0[] parameters, @NotNull y0[] arguments, boolean z11) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f69839b = parameters;
        this.f69840c = arguments;
        this.f69841d = z11;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // je.B0
    public final boolean b() {
        return this.f69841d;
    }

    @Override // je.B0
    public final y0 e(@NotNull N key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC9842h p11 = key.H0().p();
        td.i0 i0Var = p11 instanceof td.i0 ? (td.i0) p11 : null;
        if (i0Var != null) {
            int index = i0Var.getIndex();
            td.i0[] i0VarArr = this.f69839b;
            if (index < i0VarArr.length && Intrinsics.d(i0VarArr[index].k(), i0Var.k())) {
                return this.f69840c[index];
            }
        }
        return null;
    }

    @Override // je.B0
    public final boolean f() {
        return this.f69840c.length == 0;
    }

    @NotNull
    public final y0[] h() {
        return this.f69840c;
    }

    @NotNull
    public final td.i0[] i() {
        return this.f69839b;
    }
}
