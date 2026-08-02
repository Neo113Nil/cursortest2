package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public final v9 f26062a;

    /* renamed from: b, reason: collision with root package name */
    public final y9 f26063b;

    public sg(v9 originalTriggerEvent, y9 failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.f26062a = originalTriggerEvent;
        this.f26063b = failedTriggeredAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return Intrinsics.areEqual(this.f26062a, sgVar.f26062a) && Intrinsics.areEqual(this.f26063b, sgVar.f26063b);
    }

    public final int hashCode() {
        return this.f26063b.hashCode() + (this.f26062a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f26062a + ", failedTriggeredAction=" + this.f26063b + ")";
    }
}
