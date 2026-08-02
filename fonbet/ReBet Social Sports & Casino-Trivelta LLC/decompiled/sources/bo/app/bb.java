package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bb implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f25296a;

    /* renamed from: b, reason: collision with root package name */
    public final n9 f25297b;

    public bb(d9 originalRequest, n9 connectionResult) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f25296a = originalRequest;
        this.f25297b = connectionResult;
    }

    @Override // bo.app.t9
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return Intrinsics.areEqual(this.f25296a, bbVar.f25296a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.f25297b, bbVar.f25297b);
    }

    public final int hashCode() {
        return this.f25297b.hashCode() + (((this.f25296a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f25296a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.f25297b + ")";
    }
}
