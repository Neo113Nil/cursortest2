package com.vk.stat.scheme;

import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem {

    @pmi0("end_time")
    private final long endTime;

    @pmi0("failure_attempts")
    private final MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts failureAttempts;

    @pmi0("start_time")
    private final long startTime;

    public MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem(MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts mobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts, long j, long j2) {
        this.failureAttempts = mobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts;
        this.startTime = j;
        this.endTime = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem)) {
            return false;
        }
        MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem = (MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem) obj;
        return epx.f(this.failureAttempts, mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem.failureAttempts) && this.startTime == mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem.startTime && this.endTime == mobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem.endTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.endTime) + bh10.a(this.failureAttempts.hashCode() * 31, 31, this.startTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSecureLockFailureEntranceItem(failureAttempts=");
        sb.append(this.failureAttempts);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return vu5.a(')', this.endTime, sb);
    }
}
