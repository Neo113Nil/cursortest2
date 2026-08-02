package x1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10627b implements t {

    /* renamed from: b, reason: collision with root package name */
    private final int f104866b;

    public C10627b(int i11) {
        this.f104866b = i11;
    }

    public final int a() {
        return this.f104866b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10627b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f104866b == ((C10627b) obj).f104866b;
    }

    public final int hashCode() {
        return this.f104866b;
    }

    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("AndroidPointerIcon(type="), this.f104866b, ')');
    }
}
