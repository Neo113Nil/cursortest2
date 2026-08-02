package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$AudioDomainTapEvent {

    @pmi0("action")
    private final Action action;

    @pmi0("from_player")
    private final boolean fromPlayer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("accept_button_tap")
        public static final Action ACCEPT_BUTTON_TAP;

        @pmi0("add")
        public static final Action ADD;

        @pmi0("add_to_collection")
        public static final Action ADD_TO_COLLECTION;

        @pmi0("add_to_queue")
        public static final Action ADD_TO_QUEUE;

        @pmi0("add_to_story")
        public static final Action ADD_TO_STORY;

        @pmi0("approve")
        public static final Action APPROVE;

        @pmi0("cache")
        public static final Action CACHE;

        @pmi0("cancel")
        public static final Action CANCEL;

        @pmi0("cancel_by_cross")
        public static final Action CANCEL_BY_CROSS;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Action CLOSE;

        @pmi0("delete")
        public static final Action DELETE;

        @pmi0("delete_from_collection")
        public static final Action DELETE_FROM_COLLECTION;

        @pmi0("follow")
        public static final Action FOLLOW;

        @pmi0("magic_wand")
        public static final Action MAGIC_WAND;

        @pmi0("reject_button_tap")
        public static final Action REJECT_BUTTON_TAP;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final Action REMOVE;

        @pmi0("save")
        public static final Action SAVE;

        @pmi0("search")
        public static final Action SEARCH;

        @pmi0("share")
        public static final Action SHARE;

        @pmi0("show")
        public static final Action SHOW;

        @pmi0("status")
        public static final Action STATUS;

        @pmi0("unfollow")
        public static final Action UNFOLLOW;

        static {
            Action action = new Action("ADD_TO_COLLECTION", 0);
            ADD_TO_COLLECTION = action;
            Action action2 = new Action("DELETE_FROM_COLLECTION", 1);
            DELETE_FROM_COLLECTION = action2;
            Action action3 = new Action("ADD", 2);
            ADD = action3;
            Action action4 = new Action("DELETE", 3);
            DELETE = action4;
            Action action5 = new Action("FOLLOW", 4);
            FOLLOW = action5;
            Action action6 = new Action("UNFOLLOW", 5);
            UNFOLLOW = action6;
            Action action7 = new Action("CACHE", 6);
            CACHE = action7;
            Action action8 = new Action(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 7);
            REMOVE = action8;
            Action action9 = new Action("SHARE", 8);
            SHARE = action9;
            Action action10 = new Action("ADD_TO_STORY", 9);
            ADD_TO_STORY = action10;
            Action action11 = new Action("APPROVE", 10);
            APPROVE = action11;
            Action action12 = new Action("CANCEL", 11);
            CANCEL = action12;
            Action action13 = new Action("SAVE", 12);
            SAVE = action13;
            Action action14 = new Action("CLOSE", 13);
            CLOSE = action14;
            Action action15 = new Action("MAGIC_WAND", 14);
            MAGIC_WAND = action15;
            Action action16 = new Action("SEARCH", 15);
            SEARCH = action16;
            Action action17 = new Action("ADD_TO_QUEUE", 16);
            ADD_TO_QUEUE = action17;
            Action action18 = new Action(CommonConstant.RETKEY.STATUS, 17);
            STATUS = action18;
            Action action19 = new Action("SHOW", 18);
            SHOW = action19;
            Action action20 = new Action("REJECT_BUTTON_TAP", 19);
            REJECT_BUTTON_TAP = action20;
            Action action21 = new Action("ACCEPT_BUTTON_TAP", 20);
            ACCEPT_BUTTON_TAP = action21;
            Action action22 = new Action("CANCEL_BY_CROSS", 21);
            CANCEL_BY_CROSS = action22;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15, action16, action17, action18, action19, action20, action21, action22};
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

    public CommonAudioStat$AudioDomainTapEvent(Action action, boolean z) {
        this.action = action;
        this.fromPlayer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$AudioDomainTapEvent)) {
            return false;
        }
        CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent = (CommonAudioStat$AudioDomainTapEvent) obj;
        return this.action == commonAudioStat$AudioDomainTapEvent.action && this.fromPlayer == commonAudioStat$AudioDomainTapEvent.fromPlayer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fromPlayer) + (this.action.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioDomainTapEvent(action=");
        sb.append(this.action);
        sb.append(", fromPlayer=");
        return defpackage.q0.a(sb, this.fromPlayer, ')');
    }
}
