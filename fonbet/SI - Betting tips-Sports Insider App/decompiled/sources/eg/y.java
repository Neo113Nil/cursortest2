package eg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y extends kotlin.coroutines.a {

    /* renamed from: c, reason: collision with root package name */
    public static final x f9241c = new x();

    /* renamed from: b, reason: collision with root package name */
    public final String f9242b;

    public y(String str) {
        super(f9241c);
        this.f9242b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f9242b, ((y) obj).f9242b);
    }

    public final int hashCode() {
        return this.f9242b.hashCode();
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("CoroutineName("), this.f9242b, ')');
    }
}
