package com.vk.stat.scheme;

import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$SecureLockUnlockType {

    @pmi0("unlock_type")
    private final UnlockType unlockType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSecureStat.kt */
    public static final class UnlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnlockType[] $VALUES;

        @pmi0("biometrics")
        public static final UnlockType BIOMETRICS;

        @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
        public static final UnlockType PASSWORD;

        static {
            UnlockType unlockType = new UnlockType("BIOMETRICS", 0);
            BIOMETRICS = unlockType;
            UnlockType unlockType2 = new UnlockType("PASSWORD", 1);
            PASSWORD = unlockType2;
            UnlockType[] unlockTypeArr = {unlockType, unlockType2};
            $VALUES = unlockTypeArr;
            $ENTRIES = new asp(unlockTypeArr);
        }

        private UnlockType(String str, int i) {
        }

        public static UnlockType valueOf(String str) {
            return (UnlockType) Enum.valueOf(UnlockType.class, str);
        }

        public static UnlockType[] values() {
            return (UnlockType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCoreSecureStat$SecureLockUnlockType(UnlockType unlockType) {
        this.unlockType = unlockType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsCoreSecureStat$SecureLockUnlockType) && this.unlockType == ((MobileOfficialAppsCoreSecureStat$SecureLockUnlockType) obj).unlockType;
    }

    public final int hashCode() {
        return this.unlockType.hashCode();
    }

    public final String toString() {
        return "SecureLockUnlockType(unlockType=" + this.unlockType + ')';
    }
}
