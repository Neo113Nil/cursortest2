package bo.app;

import com.braze.Constants;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0010"}, d2 = {"Lbo/app/y;", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "b", "", "toString", "hashCode", "other", "", "equals", "timeInMs", "retryCount", "<init>", "(JI)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final /* data */ class y {
    private final long a;
    private final int b;

    public y(long j, int i) {
        this.a = j;
        this.b = i;
    }

    /* renamed from: a, reason: from getter */
    public final long getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return this.a == yVar.a && this.b == yVar.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "ContentCardRetryEvent(timeInMs=" + this.a + ", retryCount=" + this.b + ')';
    }
}
