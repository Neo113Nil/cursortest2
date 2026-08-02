package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dg {

    /* renamed from: a, reason: collision with root package name */
    public final l4 f25399a;

    public dg(l4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f25399a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg) && Intrinsics.areEqual(this.f25399a, ((dg) obj).f25399a);
    }

    public final int hashCode() {
        return this.f25399a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f25399a + ")";
    }
}
