package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem {

    @pmi0("failure_attempts")
    private final int failureAttempts;

    @pmi0("unlock_type")
    private final MobileOfficialAppsCoreSecureStat$SecureLockUnlockType unlockType;

    public MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem(int i, MobileOfficialAppsCoreSecureStat$SecureLockUnlockType mobileOfficialAppsCoreSecureStat$SecureLockUnlockType) {
        this.failureAttempts = i;
        this.unlockType = mobileOfficialAppsCoreSecureStat$SecureLockUnlockType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem)) {
            return false;
        }
        MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem = (MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem) obj;
        return this.failureAttempts == mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem.failureAttempts && epx.f(this.unlockType, mobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem.unlockType);
    }

    public final int hashCode() {
        return this.unlockType.hashCode() + (Integer.hashCode(this.failureAttempts) * 31);
    }

    public final String toString() {
        return "TypeSecureLockSuccessEntranceItem(failureAttempts=" + this.failureAttempts + ", unlockType=" + this.unlockType + ')';
    }
}
