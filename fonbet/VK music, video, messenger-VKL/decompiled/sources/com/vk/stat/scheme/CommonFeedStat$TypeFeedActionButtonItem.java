package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonFeedStat.kt */
/* loaded from: classes5.dex */
public final class CommonFeedStat$TypeFeedActionButtonItem implements SchemeStat$TypeAction.b {

    @pmi0("action")
    private final Action action;

    @pmi0("action_button_type")
    private final CommonFeedStat$TypeActionButtonTypeItem actionButtonType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonFeedStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("change_action_button_color")
        public static final Action CHANGE_ACTION_BUTTON_COLOR;

        static {
            Action action = new Action("CHANGE_ACTION_BUTTON_COLOR", 0);
            CHANGE_ACTION_BUTTON_COLOR = action;
            Action[] actionArr = {action};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public CommonFeedStat$TypeFeedActionButtonItem(Action action, CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem) {
        this.action = action;
        this.actionButtonType = commonFeedStat$TypeActionButtonTypeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedStat$TypeFeedActionButtonItem)) {
            return false;
        }
        CommonFeedStat$TypeFeedActionButtonItem commonFeedStat$TypeFeedActionButtonItem = (CommonFeedStat$TypeFeedActionButtonItem) obj;
        return this.action == commonFeedStat$TypeFeedActionButtonItem.action && this.actionButtonType == commonFeedStat$TypeFeedActionButtonItem.actionButtonType;
    }

    public final int hashCode() {
        return this.actionButtonType.hashCode() + (this.action.hashCode() * 31);
    }

    public final String toString() {
        return "TypeFeedActionButtonItem(action=" + this.action + ", actionButtonType=" + this.actionButtonType + ')';
    }
}
