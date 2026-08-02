package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final k8 f25613a;

    public j8(k8 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25613a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8) && Intrinsics.areEqual(this.f25613a, ((j8) obj).f25613a);
    }

    public final int hashCode() {
        return this.f25613a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f25613a + ")";
    }
}
