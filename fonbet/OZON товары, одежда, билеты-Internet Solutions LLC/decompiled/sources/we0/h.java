package we0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10551g f104426a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f104427b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC10550f f104428c;

    public h(@NotNull C10551g position, boolean z11, @NotNull EnumC10550f reason) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f104426a = position;
        this.f104427b = z11;
        this.f104428c = reason;
    }

    @NotNull
    public final C10551g a() {
        return this.f104426a;
    }

    @NotNull
    public final EnumC10550f b() {
        return this.f104428c;
    }

    public final boolean c() {
        return this.f104427b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f104426a, hVar.f104426a) && this.f104427b == hVar.f104427b && this.f104428c == hVar.f104428c;
    }

    public final int hashCode() {
        return this.f104428c.hashCode() + C3532b.a(this.f104426a.hashCode() * 31, 31, this.f104427b);
    }

    @NotNull
    public final String toString() {
        return "CameraPositionUpdate(position=" + this.f104426a + ", isFinishedPosition=" + this.f104427b + ", reason=" + this.f104428c + ")";
    }
}
