package gi;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10338a;

    public a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10338a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f10338a, ((a) obj).f10338a);
    }

    public final int hashCode() {
        return this.f10338a.hashCode();
    }

    public final String toString() {
        return this.f10338a;
    }
}
