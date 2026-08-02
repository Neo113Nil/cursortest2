package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts {

    @pmi0("failure_attempts")
    private final int failureAttempts;

    @pmi0("unlock_type")
    private final MobileOfficialAppsCoreSecureStat$SecureLockUnlockType unlockType;

    public MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts(int i, MobileOfficialAppsCoreSecureStat$SecureLockUnlockType mobileOfficialAppsCoreSecureStat$SecureLockUnlockType) {
        this.failureAttempts = i;
        this.unlockType = mobileOfficialAppsCoreSecureStat$SecureLockUnlockType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts)) {
            return false;
        }
        MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts mobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts = (MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts) obj;
        return this.failureAttempts == mobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts.failureAttempts && epx.f(this.unlockType, mobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts.unlockType);
    }

    public final int hashCode() {
        return this.unlockType.hashCode() + (Integer.hashCode(this.failureAttempts) * 31);
    }

    public final String toString() {
        return "SecureLockFailureAttempts(failureAttempts=" + this.failureAttempts + ", unlockType=" + this.unlockType + ')';
    }
}
