package td;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99427a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f99428b;

    protected s0(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f99427a = name;
        this.f99428b = z11;
    }

    public Integer a(@NotNull s0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return r0.a(this, visibility);
    }

    @NotNull
    public String b() {
        return this.f99427a;
    }

    public final boolean c() {
        return this.f99428b;
    }

    @NotNull
    public s0 d() {
        return this;
    }

    @NotNull
    public final String toString() {
        return b();
    }
}
