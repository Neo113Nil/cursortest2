package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lbo/app/l6;", "", "Lbo/app/t2;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "toString", "", "hashCode", "other", "", "equals", "triggerEvent", "<init>", "(Lbo/app/t2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class l6 {
    private final t2 a;

    public l6(t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.a = triggerEvent;
    }

    /* renamed from: a, reason: from getter */
    public final t2 getA() {
        return this.a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof l6) && Intrinsics.areEqual(this.a, ((l6) other).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.a + ')';
    }
}
