package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zc {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f26356a;

    public zc(i2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f26356a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc) && Intrinsics.areEqual(this.f26356a, ((zc) obj).f26356a);
    }

    public final int hashCode() {
        return this.f26356a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f26356a + ")";
    }
}
