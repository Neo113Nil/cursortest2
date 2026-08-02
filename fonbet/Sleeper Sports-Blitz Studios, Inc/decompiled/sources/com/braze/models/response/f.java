package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final o f653a;
    public final com.braze.communication.d b;

    public f(o originalRequest, com.braze.communication.d connectionResult) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f653a = originalRequest;
        this.b = connectionResult;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f653a, fVar.f653a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f653a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f653a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.b + ")";
    }
}
