package bo.app;

import com.braze.Constants;
import com.braze.support.DateTimeUtils;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lbo/app/e6;", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "toString", "", "capacity", "refillRate", "<init>", "(II)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class e6 {
    private final double a;
    private final double b;
    private long c = DateTimeUtils.nowInMilliseconds();
    private double d;

    public e6(int i, int i2) {
        this.a = RangesKt.coerceAtLeast(i, 1);
        this.b = RangesKt.coerceAtLeast(i2, 1);
        this.d = i;
    }

    public final boolean a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        double min = Math.min(this.d + (((nowInMilliseconds - this.c) / this.b) / 1000), this.a);
        this.d = min;
        this.c = nowInMilliseconds;
        if (min < 1.0d) {
            return false;
        }
        this.d = min - 1;
        return true;
    }

    public String toString() {
        return "(capacity=" + this.a + ", refillRate=" + this.b + ", lastCallAtMs=" + this.c + ", currentTokenCount=" + this.d + ')';
    }
}
