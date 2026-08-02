package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    public final l4 f25439a;

    public eg(l4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25439a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && Intrinsics.areEqual(this.f25439a, ((eg) obj).f25439a);
    }

    public final int hashCode() {
        return this.f25439a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f25439a + ")";
    }
}
