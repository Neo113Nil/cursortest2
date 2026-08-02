package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$UserDetailInfoEvent {

    @pmi0("user_detail_info_event_type")
    private final UserDetailInfoEventType userDetailInfoEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class UserDetailInfoEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserDetailInfoEventType[] $VALUES;

        @pmi0("click_to_more")
        public static final UserDetailInfoEventType CLICK_TO_MORE;

        static {
            UserDetailInfoEventType userDetailInfoEventType = new UserDetailInfoEventType("CLICK_TO_MORE", 0);
            CLICK_TO_MORE = userDetailInfoEventType;
            UserDetailInfoEventType[] userDetailInfoEventTypeArr = {userDetailInfoEventType};
            $VALUES = userDetailInfoEventTypeArr;
            $ENTRIES = new asp(userDetailInfoEventTypeArr);
        }

        private UserDetailInfoEventType(String str, int i) {
        }

        public static UserDetailInfoEventType valueOf(String str) {
            return (UserDetailInfoEventType) Enum.valueOf(UserDetailInfoEventType.class, str);
        }

        public static UserDetailInfoEventType[] values() {
            return (UserDetailInfoEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$UserDetailInfoEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsProfileStat$UserDetailInfoEvent) && this.userDetailInfoEventType == ((MobileOfficialAppsProfileStat$UserDetailInfoEvent) obj).userDetailInfoEventType;
    }

    public final int hashCode() {
        UserDetailInfoEventType userDetailInfoEventType = this.userDetailInfoEventType;
        if (userDetailInfoEventType == null) {
            return 0;
        }
        return userDetailInfoEventType.hashCode();
    }

    public final String toString() {
        return "UserDetailInfoEvent(userDetailInfoEventType=" + this.userDetailInfoEventType + ')';
    }

    public MobileOfficialAppsProfileStat$UserDetailInfoEvent(UserDetailInfoEventType userDetailInfoEventType) {
        this.userDetailInfoEventType = userDetailInfoEventType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$UserDetailInfoEvent(UserDetailInfoEventType userDetailInfoEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userDetailInfoEventType);
    }
}
