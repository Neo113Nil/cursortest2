package ke;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final N f71513a;

    /* renamed from: b, reason: collision with root package name */
    private final v f71514b;

    public v(@NotNull N type, v vVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f71513a = type;
        this.f71514b = vVar;
    }

    public final v a() {
        return this.f71514b;
    }

    @NotNull
    public final N b() {
        return this.f71513a;
    }
}
