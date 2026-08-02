package pe;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.i0;

/* renamed from: pe.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8904e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f80410a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N f80411b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final N f80412c;

    public C8904e(@NotNull i0 typeParameter, @NotNull N inProjection, @NotNull N outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f80410a = typeParameter;
        this.f80411b = inProjection;
        this.f80412c = outProjection;
    }

    @NotNull
    public final N a() {
        return this.f80411b;
    }

    @NotNull
    public final N b() {
        return this.f80412c;
    }

    @NotNull
    public final i0 c() {
        return this.f80410a;
    }

    public final boolean d() {
        return ke.e.f71486a.d(this.f80411b, this.f80412c);
    }
}
