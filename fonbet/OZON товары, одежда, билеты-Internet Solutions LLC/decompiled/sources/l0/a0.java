package l0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m0.H<Float> f72063a;

    public a0(@NotNull m0.H h11) {
        this.f72063a = h11;
    }

    @NotNull
    public final m0.H<Float> a() {
        return this.f72063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && Intrinsics.d(this.f72063a, a0Var.f72063a);
    }

    public final int hashCode() {
        return this.f72063a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    @NotNull
    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f72063a + ')';
    }
}
