package bo.app;

import com.braze.support.DateTimeUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class za extends we {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za() {
        super(sessionId, r2, null, false);
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        ye sessionId = new ye(randomUUID);
        double nowInSecondsPrecise = DateTimeUtils.nowInSecondsPrecise();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    @Override // bo.app.we
    public final Double d() {
        return this.f26207c;
    }

    @Override // bo.app.we
    public final String toString() {
        return "\nMutableSession(sessionId=" + this.f26205a + ", startTime=" + this.f26206b + ", endTime=" + this.f26207c + ", isSealed=" + this.f26208d + ", duration=" + c() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ye sessionId, double d10, Double d11, boolean z10) {
        super(sessionId, d10, d11, z10);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }
}
