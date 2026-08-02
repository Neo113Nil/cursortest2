package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f25974a;

    public r5(d9 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25974a = request;
        request.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5) && Intrinsics.areEqual(this.f25974a, ((r5) obj).f25974a);
    }

    public final int hashCode() {
        return this.f25974a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.f25974a + ")";
    }
}
