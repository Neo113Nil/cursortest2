package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction implements SchemeStat$TypeAction.b {

    @pmi0("action_type")
    private final ActionType actionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @pmi0("child_mode")
        public static final ActionType CHILD_MODE;

        @pmi0("need_auth")
        public static final ActionType NEED_AUTH;

        @pmi0("need_change_account")
        public static final ActionType NEED_CHANGE_ACCOUNT;

        static {
            ActionType actionType = new ActionType("NEED_AUTH", 0);
            NEED_AUTH = actionType;
            ActionType actionType2 = new ActionType("CHILD_MODE", 1);
            CHILD_MODE = actionType2;
            ActionType actionType3 = new ActionType("NEED_CHANGE_ACCOUNT", 2);
            NEED_CHANGE_ACCOUNT = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        private ActionType(String str, int i) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction(ActionType actionType) {
        this.actionType = actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction) && this.actionType == ((MobileOfficialAppsVideoStat$TypeVideoDownloadWaitForUserAction) obj).actionType;
    }

    public final int hashCode() {
        return this.actionType.hashCode();
    }

    public final String toString() {
        return "TypeVideoDownloadWaitForUserAction(actionType=" + this.actionType + ')';
    }
}
