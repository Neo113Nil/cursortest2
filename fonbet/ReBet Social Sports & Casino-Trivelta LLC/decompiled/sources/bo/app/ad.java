package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f25252a;

    public ad(i2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25252a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad) && Intrinsics.areEqual(this.f25252a, ((ad) obj).f25252a);
    }

    public final int hashCode() {
        return this.f25252a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f25252a + ")";
    }
}
