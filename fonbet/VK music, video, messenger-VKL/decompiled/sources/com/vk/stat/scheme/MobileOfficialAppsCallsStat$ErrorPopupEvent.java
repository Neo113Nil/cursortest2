package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$ErrorPopupEvent {

    @pmi0("callee_id")
    private final Long calleeId;

    @pmi0("error_popup_event_type")
    private final ErrorPopupEventType errorPopupEventType;

    @pmi0("friend_button_action_type")
    private final FriendButtonActionType friendButtonActionType;

    @pmi0("friend_status")
    private final FriendStatus friendStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class ErrorPopupEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorPopupEventType[] $VALUES;

        @pmi0("friend_button_action")
        public static final ErrorPopupEventType FRIEND_BUTTON_ACTION;

        static {
            ErrorPopupEventType errorPopupEventType = new ErrorPopupEventType("FRIEND_BUTTON_ACTION", 0);
            FRIEND_BUTTON_ACTION = errorPopupEventType;
            ErrorPopupEventType[] errorPopupEventTypeArr = {errorPopupEventType};
            $VALUES = errorPopupEventTypeArr;
            $ENTRIES = new asp(errorPopupEventTypeArr);
        }

        private ErrorPopupEventType(String str, int i) {
        }

        public static ErrorPopupEventType valueOf(String str) {
            return (ErrorPopupEventType) Enum.valueOf(ErrorPopupEventType.class, str);
        }

        public static ErrorPopupEventType[] values() {
            return (ErrorPopupEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class FriendButtonActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FriendButtonActionType[] $VALUES;

        @pmi0("accept")
        public static final FriendButtonActionType ACCEPT;

        @pmi0("decline")
        public static final FriendButtonActionType DECLINE;

        @pmi0("request")
        public static final FriendButtonActionType REQUEST;

        static {
            FriendButtonActionType friendButtonActionType = new FriendButtonActionType("REQUEST", 0);
            REQUEST = friendButtonActionType;
            FriendButtonActionType friendButtonActionType2 = new FriendButtonActionType("ACCEPT", 1);
            ACCEPT = friendButtonActionType2;
            FriendButtonActionType friendButtonActionType3 = new FriendButtonActionType("DECLINE", 2);
            DECLINE = friendButtonActionType3;
            FriendButtonActionType[] friendButtonActionTypeArr = {friendButtonActionType, friendButtonActionType2, friendButtonActionType3};
            $VALUES = friendButtonActionTypeArr;
            $ENTRIES = new asp(friendButtonActionTypeArr);
        }

        private FriendButtonActionType(String str, int i) {
        }

        public static FriendButtonActionType valueOf(String str) {
            return (FriendButtonActionType) Enum.valueOf(FriendButtonActionType.class, str);
        }

        public static FriendButtonActionType[] values() {
            return (FriendButtonActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class FriendStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FriendStatus[] $VALUES;

        @pmi0("friend")
        public static final FriendStatus FRIEND;

        @pmi0("none")
        public static final FriendStatus NONE;

        @pmi0("receive_request")
        public static final FriendStatus RECEIVE_REQUEST;

        @pmi0("send_request")
        public static final FriendStatus SEND_REQUEST;

        static {
            FriendStatus friendStatus = new FriendStatus("FRIEND", 0);
            FRIEND = friendStatus;
            FriendStatus friendStatus2 = new FriendStatus("SEND_REQUEST", 1);
            SEND_REQUEST = friendStatus2;
            FriendStatus friendStatus3 = new FriendStatus("RECEIVE_REQUEST", 2);
            RECEIVE_REQUEST = friendStatus3;
            FriendStatus friendStatus4 = new FriendStatus("NONE", 3);
            NONE = friendStatus4;
            FriendStatus[] friendStatusArr = {friendStatus, friendStatus2, friendStatus3, friendStatus4};
            $VALUES = friendStatusArr;
            $ENTRIES = new asp(friendStatusArr);
        }

        private FriendStatus(String str, int i) {
        }

        public static FriendStatus valueOf(String str) {
            return (FriendStatus) Enum.valueOf(FriendStatus.class, str);
        }

        public static FriendStatus[] values() {
            return (FriendStatus[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCallsStat$ErrorPopupEvent(ErrorPopupEventType errorPopupEventType, FriendStatus friendStatus, FriendButtonActionType friendButtonActionType, Long l) {
        this.errorPopupEventType = errorPopupEventType;
        this.friendStatus = friendStatus;
        this.friendButtonActionType = friendButtonActionType;
        this.calleeId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$ErrorPopupEvent)) {
            return false;
        }
        MobileOfficialAppsCallsStat$ErrorPopupEvent mobileOfficialAppsCallsStat$ErrorPopupEvent = (MobileOfficialAppsCallsStat$ErrorPopupEvent) obj;
        return this.errorPopupEventType == mobileOfficialAppsCallsStat$ErrorPopupEvent.errorPopupEventType && this.friendStatus == mobileOfficialAppsCallsStat$ErrorPopupEvent.friendStatus && this.friendButtonActionType == mobileOfficialAppsCallsStat$ErrorPopupEvent.friendButtonActionType && epx.f(this.calleeId, mobileOfficialAppsCallsStat$ErrorPopupEvent.calleeId);
    }

    public final int hashCode() {
        int hashCode = this.errorPopupEventType.hashCode() * 31;
        FriendStatus friendStatus = this.friendStatus;
        int hashCode2 = (hashCode + (friendStatus == null ? 0 : friendStatus.hashCode())) * 31;
        FriendButtonActionType friendButtonActionType = this.friendButtonActionType;
        int hashCode3 = (hashCode2 + (friendButtonActionType == null ? 0 : friendButtonActionType.hashCode())) * 31;
        Long l = this.calleeId;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorPopupEvent(errorPopupEventType=");
        sb.append(this.errorPopupEventType);
        sb.append(", friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", friendButtonActionType=");
        sb.append(this.friendButtonActionType);
        sb.append(", calleeId=");
        return iq.b(sb, this.calleeId, ')');
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$ErrorPopupEvent(ErrorPopupEventType errorPopupEventType, FriendStatus friendStatus, FriendButtonActionType friendButtonActionType, Long l, int i, zcl zclVar) {
        this(errorPopupEventType, (i & 2) != 0 ? null : friendStatus, (i & 4) != 0 ? null : friendButtonActionType, (i & 8) != 0 ? null : l);
    }
}
