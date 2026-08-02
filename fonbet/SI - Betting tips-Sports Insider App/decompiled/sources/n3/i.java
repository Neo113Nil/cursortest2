package n3;

import android.net.NetworkRequest;
import e3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final String f20835b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f20836a;

    static {
        String g10 = x.g("NetworkRequestCompat");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f20835b = g10;
    }

    public i(NetworkRequest networkRequest) {
        this.f20836a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f20836a, ((i) obj).f20836a);
    }

    public final int hashCode() {
        Object obj = this.f20836a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f20836a + ')';
    }
}
