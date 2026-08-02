package androidx.media3.common.util;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.tgw;

/* loaded from: classes12.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int stuckType;
    public final int timeoutMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StuckPlayerException(int i, int i2) {
        super(r0);
        String b;
        if (i == 0) {
            b = tgw.b(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            b = tgw.b(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            b = tgw.b(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            b = tgw.b(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            b = tgw.b(i2, "Player stuck suppressed for ", " ms");
        }
        this.stuckType = i;
        this.timeoutMs = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StuckPlayerException.class == obj.getClass()) {
            StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
            if (this.stuckType == stuckPlayerException.stuckType && this.timeoutMs == stuckPlayerException.timeoutMs) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stuckType) * 31) + this.timeoutMs;
    }
}
