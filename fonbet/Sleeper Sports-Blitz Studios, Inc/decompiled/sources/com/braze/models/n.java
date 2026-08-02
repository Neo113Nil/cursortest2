package com.braze.models;

import com.braze.support.DateTimeUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n extends p {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n() {
        super(sessionId, r2, null, false);
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        q sessionId = new q(randomUUID);
        double nowInSecondsPrecise = DateTimeUtils.nowInSecondsPrecise();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    @Override // com.braze.models.p
    public final Double e() {
        return this.c;
    }

    @Override // com.braze.models.p
    public final String toString() {
        return "\nMutableSession(sessionId=" + f() + ", startTime=" + g() + ", endTime=" + this.c + ", isSealed=" + h() + ", duration=" + d() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q sessionId, double d, Double d2, boolean z) {
        super(sessionId, d, d2, z);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }
}
