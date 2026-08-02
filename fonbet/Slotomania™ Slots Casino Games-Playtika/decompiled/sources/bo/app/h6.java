package bo.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, d2 = {"Lbo/app/h6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/a2;", "request", "<init>", "(Lbo/app/a2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class h6 {
    private final a2 a;

    public h6(a2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = request;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof h6) && Intrinsics.areEqual(this.a, ((h6) other).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.a + ')';
    }
}
