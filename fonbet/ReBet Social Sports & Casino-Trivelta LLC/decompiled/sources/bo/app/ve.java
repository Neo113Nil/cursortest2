package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ve {

    /* renamed from: a, reason: collision with root package name */
    public final t9 f26145a;

    public ve(t9 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        this.f26145a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve) && Intrinsics.areEqual(this.f26145a, ((ve) obj).f26145a);
    }

    public final int hashCode() {
        return this.f26145a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f26145a + ")";
    }
}
