package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreSecureStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem implements SchemeStat$TypeClick.b {

    @pmi0("auto_lock_time")
    private final Integer autoLockTime;

    @pmi0("biometrics_type")
    private final BiometricsType biometricsType;

    @pmi0("switched_to")
    private final Boolean switchedTo;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSecureStat.kt */
    public static final class BiometricsType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BiometricsType[] $VALUES;

        @pmi0("face_id")
        public static final BiometricsType FACE_ID;

        @pmi0("hardware_unavailable")
        public static final BiometricsType HARDWARE_UNAVAILABLE;

        @pmi0("mixed")
        public static final BiometricsType MIXED;

        @pmi0("no_enrolled")
        public static final BiometricsType NO_ENROLLED;

        @pmi0("touch_id")
        public static final BiometricsType TOUCH_ID;

        @pmi0("unknown")
        public static final BiometricsType UNKNOWN;

        static {
            BiometricsType biometricsType = new BiometricsType("TOUCH_ID", 0);
            TOUCH_ID = biometricsType;
            BiometricsType biometricsType2 = new BiometricsType("FACE_ID", 1);
            FACE_ID = biometricsType2;
            BiometricsType biometricsType3 = new BiometricsType("MIXED", 2);
            MIXED = biometricsType3;
            BiometricsType biometricsType4 = new BiometricsType("NO_ENROLLED", 3);
            NO_ENROLLED = biometricsType4;
            BiometricsType biometricsType5 = new BiometricsType("HARDWARE_UNAVAILABLE", 4);
            HARDWARE_UNAVAILABLE = biometricsType5;
            BiometricsType biometricsType6 = new BiometricsType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
            UNKNOWN = biometricsType6;
            BiometricsType[] biometricsTypeArr = {biometricsType, biometricsType2, biometricsType3, biometricsType4, biometricsType5, biometricsType6};
            $VALUES = biometricsTypeArr;
            $ENTRIES = new asp(biometricsTypeArr);
        }

        private BiometricsType(String str, int i) {
        }

        public static BiometricsType valueOf(String str) {
            return (BiometricsType) Enum.valueOf(BiometricsType.class, str);
        }

        public static BiometricsType[] values() {
            return (BiometricsType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSecureStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("auto_lock_time")
        public static final Type AUTO_LOCK_TIME;

        @pmi0("biometrics_entrance")
        public static final Type BIOMETRICS_ENTRANCE;

        @pmi0("change_pin_password")
        public static final Type CHANGE_PIN_PASSWORD;

        @pmi0("disable_secure_entrance")
        public static final Type DISABLE_SECURE_ENTRANCE;

        @pmi0("hide_app_content")
        public static final Type HIDE_APP_CONTENT;

        @pmi0("hide_push_info")
        public static final Type HIDE_PUSH_INFO;

        static {
            Type type = new Type("BIOMETRICS_ENTRANCE", 0);
            BIOMETRICS_ENTRANCE = type;
            Type type2 = new Type("AUTO_LOCK_TIME", 1);
            AUTO_LOCK_TIME = type2;
            Type type3 = new Type("HIDE_PUSH_INFO", 2);
            HIDE_PUSH_INFO = type3;
            Type type4 = new Type("HIDE_APP_CONTENT", 3);
            HIDE_APP_CONTENT = type4;
            Type type5 = new Type("CHANGE_PIN_PASSWORD", 4);
            CHANGE_PIN_PASSWORD = type5;
            Type type6 = new Type("DISABLE_SECURE_ENTRANCE", 5);
            DISABLE_SECURE_ENTRANCE = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem(Type type, BiometricsType biometricsType, Integer num, Boolean bool) {
        this.type = type;
        this.biometricsType = biometricsType;
        this.autoLockTime = num;
        this.switchedTo = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem)) {
            return false;
        }
        MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem = (MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem) obj;
        return this.type == mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.type && this.biometricsType == mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.biometricsType && epx.f(this.autoLockTime, mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.autoLockTime) && epx.f(this.switchedTo, mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.switchedTo);
    }

    public final int hashCode() {
        int hashCode = (this.biometricsType.hashCode() + (this.type.hashCode() * 31)) * 31;
        Integer num = this.autoLockTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.switchedTo;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClickSecureLockSettingsItem(type=");
        sb.append(this.type);
        sb.append(", biometricsType=");
        sb.append(this.biometricsType);
        sb.append(", autoLockTime=");
        sb.append(this.autoLockTime);
        sb.append(", switchedTo=");
        return tn.a(sb, this.switchedTo, ')');
    }

    public /* synthetic */ MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem(Type type, BiometricsType biometricsType, Integer num, Boolean bool, int i, zcl zclVar) {
        this(type, biometricsType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
