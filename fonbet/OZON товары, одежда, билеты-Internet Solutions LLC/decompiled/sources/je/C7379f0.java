package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7379f0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final td.i0 f69883a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f69884b;

    public C7379f0(@NotNull td.i0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f69883a = typeParameter;
        this.f69884b = Sc.k.a(Sc.n.PUBLICATION, new C7377e0(this));
    }

    static N d(C7379f0 c7379f0) {
        return C7383h0.b(c7379f0.f69883a);
    }

    @Override // je.y0
    public final boolean a() {
        return true;
    }

    @Override // je.y0
    @NotNull
    public final L0 b() {
        return L0.OUT_VARIANCE;
    }

    @Override // je.y0
    @NotNull
    public final y0 c(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // je.y0
    @NotNull
    public final N getType() {
        return (N) this.f69884b.getValue();
    }
}
