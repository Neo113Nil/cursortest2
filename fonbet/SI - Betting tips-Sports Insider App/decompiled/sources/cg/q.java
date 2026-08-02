package cg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3943b;

    public q(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f3942a = obj;
        this.f3943b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!Intrinsics.areEqual(this.f3942a, qVar.f3942a)) {
            return false;
        }
        long j = qVar.f3943b;
        a aVar = b.f3911b;
        return this.f3943b == j;
    }

    public final int hashCode() {
        Object obj = this.f3942a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        a aVar = b.f3911b;
        long j = this.f3943b;
        return ((int) (j ^ (j >>> 32))) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.f3942a + ", duration=" + ((Object) b.g(this.f3943b)) + ')';
    }
}
