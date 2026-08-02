package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lbo/app/j6;", "", "", "toString", "", "hashCode", "other", "", "equals", "campaignId", "Ljava/lang/String;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;", "Lbo/app/x1;", "pushClickEvent", "Lbo/app/x1;", "b", "()Lbo/app/x1;", "<init>", "(Ljava/lang/String;Lbo/app/x1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class j6 {
    private final String a;
    private final x1 b;

    public j6(String campaignId, x1 pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.a = campaignId;
        this.b = pushClickEvent;
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final x1 getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) other;
        return Intrinsics.areEqual(this.a, j6Var.a) && Intrinsics.areEqual(this.b, j6Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.a + ", pushClickEvent=" + this.b + ')';
    }
}
