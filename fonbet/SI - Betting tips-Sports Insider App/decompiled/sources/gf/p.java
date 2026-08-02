package gf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10030a;

    public p(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f10030a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f10030a, ((p) obj).f10030a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10030a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10030a + ')';
    }
}
