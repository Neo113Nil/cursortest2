package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f25467a;

    public g0(h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25467a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.areEqual(this.f25467a, ((g0) obj).f25467a);
    }

    public final int hashCode() {
        return this.f25467a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.f25467a + ")";
    }
}
