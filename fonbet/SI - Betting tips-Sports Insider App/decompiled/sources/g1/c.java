package g1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9707a;

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f9707a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return Intrinsics.areEqual(this.f9707a, ((c) obj).f9707a);
    }

    public final int hashCode() {
        return this.f9707a.hashCode();
    }

    public final String toString() {
        return this.f9707a;
    }
}
