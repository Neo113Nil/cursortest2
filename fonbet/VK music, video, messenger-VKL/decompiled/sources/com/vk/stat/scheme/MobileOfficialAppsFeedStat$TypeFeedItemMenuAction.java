package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedItemMenuAction implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("click_to_dots")
        public static final Action CLICK_TO_DOTS;

        @pmi0("copy_erid")
        public static final Action COPY_ERID;

        @pmi0("copy_link")
        public static final Action COPY_LINK;

        @pmi0("decline_suggested_post")
        public static final Action DECLINE_SUGGESTED_POST;

        @pmi0("edit_best_friends_list")
        public static final Action EDIT_BEST_FRIENDS_LIST;

        @pmi0("edit_post")
        public static final Action EDIT_POST;

        @pmi0("make_donut_post_public")
        public static final Action MAKE_DONUT_POST_PUBLIC;

        @pmi0("message_author")
        public static final Action MESSAGE_AUTHOR;

        @pmi0("open_advertiser_info")
        public static final Action OPEN_ADVERTISER_INFO;

        @pmi0("open_original")
        public static final Action OPEN_ORIGINAL;

        @pmi0("post_stat")
        public static final Action POST_STAT;

        @pmi0("post_suggested_post")
        public static final Action POST_SUGGESTED_POST;

        @pmi0("publish_delayed_post")
        public static final Action PUBLISH_DELAYED_POST;

        @pmi0("send_donut")
        public static final Action SEND_DONUT;

        @pmi0("unsubscribe_comments")
        public static final Action UNSUBSCRIBE_COMMENTS;

        static {
            Action action = new Action("COPY_LINK", 0);
            COPY_LINK = action;
            Action action2 = new Action("CLICK_TO_DOTS", 1);
            CLICK_TO_DOTS = action2;
            Action action3 = new Action("OPEN_ADVERTISER_INFO", 2);
            OPEN_ADVERTISER_INFO = action3;
            Action action4 = new Action("COPY_ERID", 3);
            COPY_ERID = action4;
            Action action5 = new Action("OPEN_ORIGINAL", 4);
            OPEN_ORIGINAL = action5;
            Action action6 = new Action("SEND_DONUT", 5);
            SEND_DONUT = action6;
            Action action7 = new Action("MESSAGE_AUTHOR", 6);
            MESSAGE_AUTHOR = action7;
            Action action8 = new Action("EDIT_POST", 7);
            EDIT_POST = action8;
            Action action9 = new Action("EDIT_BEST_FRIENDS_LIST", 8);
            EDIT_BEST_FRIENDS_LIST = action9;
            Action action10 = new Action("POST_STAT", 9);
            POST_STAT = action10;
            Action action11 = new Action("UNSUBSCRIBE_COMMENTS", 10);
            UNSUBSCRIBE_COMMENTS = action11;
            Action action12 = new Action("DECLINE_SUGGESTED_POST", 11);
            DECLINE_SUGGESTED_POST = action12;
            Action action13 = new Action("POST_SUGGESTED_POST", 12);
            POST_SUGGESTED_POST = action13;
            Action action14 = new Action("PUBLISH_DELAYED_POST", 13);
            PUBLISH_DELAYED_POST = action14;
            Action action15 = new Action("MAKE_DONUT_POST_PUBLIC", 14);
            MAKE_DONUT_POST_PUBLIC = action15;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15};
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

    public MobileOfficialAppsFeedStat$TypeFeedItemMenuAction(Action action) {
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedItemMenuAction) && this.action == ((MobileOfficialAppsFeedStat$TypeFeedItemMenuAction) obj).action;
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final String toString() {
        return "TypeFeedItemMenuAction(action=" + this.action + ')';
    }
}
