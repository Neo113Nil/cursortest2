package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0011"}, d2 = {"Lbo/app/s6;", "", "Lbo/app/t2;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/y2;", "b", "", "toString", "", "hashCode", "other", "", "equals", "originalTriggerEvent", "failedTriggeredAction", "<init>", "(Lbo/app/t2;Lbo/app/y2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class s6 {
    private final t2 a;
    private final y2 b;

    public s6(t2 originalTriggerEvent, y2 failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.a = originalTriggerEvent;
        this.b = failedTriggeredAction;
    }

    /* renamed from: a, reason: from getter */
    public final t2 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final y2 getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) other;
        return Intrinsics.areEqual(this.a, s6Var.a) && Intrinsics.areEqual(this.b, s6Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.a + ", failedTriggeredAction=" + this.b + ')';
    }
}
