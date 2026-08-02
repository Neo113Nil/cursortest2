package ic;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final y1.c0 f11114a;

    public f(y1.c0 directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        this.f11114a = directions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f11114a, ((f) obj).f11114a);
    }

    public final int hashCode() {
        return this.f11114a.hashCode();
    }

    public final String toString() {
        return "ToDirection(directions=" + this.f11114a + ')';
    }
}
