package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f26039a;

    public s5(d9 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f26039a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && Intrinsics.areEqual(this.f26039a, ((s5) obj).f26039a);
    }

    public final int hashCode() {
        return this.f26039a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.f26039a + ")";
    }
}
