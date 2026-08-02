package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeQuestionItem implements SchemeStat$TypeClick.b {

    @pmi0("can_ask_anonymous")
    private final Boolean canAskAnonymous;

    @pmi0("question_author_id")
    private final Long questionAuthorId;

    @pmi0("question_id")
    private final Long questionId;

    @pmi0("question_privacy")
    private final Boolean questionPrivacy;

    @pmi0("question_receiver_id")
    private final Long questionReceiverId;

    @pmi0("question_text")
    private final String questionText;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("block")
        public static final Type BLOCK;

        @pmi0("call_friends")
        public static final Type CALL_FRIENDS;

        @pmi0("cancel_delete")
        public static final Type CANCEL_DELETE;

        @pmi0("cancel_send_question")
        public static final Type CANCEL_SEND_QUESTION;

        @pmi0("click_to_question")
        public static final Type CLICK_TO_QUESTION;

        @pmi0("click_to_send")
        public static final Type CLICK_TO_SEND;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Type CLOSE;

        @pmi0("delete")
        public static final Type DELETE;

        @pmi0("delete_all_questions")
        public static final Type DELETE_ALL_QUESTIONS;

        @pmi0("go_to_chat")
        public static final Type GO_TO_CHAT;

        @pmi0("message_sent")
        public static final Type MESSAGE_SENT;

        @pmi0("message_sent_again")
        public static final Type MESSAGE_SENT_AGAIN;

        @pmi0("next")
        public static final Type NEXT;

        @pmi0("open_profile")
        public static final Type OPEN_PROFILE;

        @pmi0("open_settings")
        public static final Type OPEN_SETTINGS;

        @pmi0("open_story")
        public static final Type OPEN_STORY;

        @pmi0("reply")
        public static final Type REPLY;

        @pmi0("reply_again")
        public static final Type REPLY_AGAIN;

        @pmi0("reply_to_message")
        public static final Type REPLY_TO_MESSAGE;

        @pmi0("restore")
        public static final Type RESTORE;

        @pmi0("send_question")
        public static final Type SEND_QUESTION;

        @pmi0("share_to_im")
        public static final Type SHARE_TO_IM;

        @pmi0("share_to_im_click")
        public static final Type SHARE_TO_IM_CLICK;

        @pmi0("share_to_story")
        public static final Type SHARE_TO_STORY;

        @pmi0("share_to_story_click")
        public static final Type SHARE_TO_STORY_CLICK;

        @pmi0("share_to_wall")
        public static final Type SHARE_TO_WALL;

        @pmi0("share_to_wall_click")
        public static final Type SHARE_TO_WALL_CLICK;

        @pmi0("sharing")
        public static final Type SHARING;

        @pmi0("unblock")
        public static final Type UNBLOCK;

        static {
            Type type = new Type("CLICK_TO_QUESTION", 0);
            CLICK_TO_QUESTION = type;
            Type type2 = new Type("REPLY", 1);
            REPLY = type2;
            Type type3 = new Type("REPLY_AGAIN", 2);
            REPLY_AGAIN = type3;
            Type type4 = new Type("OPEN_STORY", 3);
            OPEN_STORY = type4;
            Type type5 = new Type("CALL_FRIENDS", 4);
            CALL_FRIENDS = type5;
            Type type6 = new Type("OPEN_SETTINGS", 5);
            OPEN_SETTINGS = type6;
            Type type7 = new Type("REPLY_TO_MESSAGE", 6);
            REPLY_TO_MESSAGE = type7;
            Type type8 = new Type("OPEN_PROFILE", 7);
            OPEN_PROFILE = type8;
            Type type9 = new Type("BLOCK", 8);
            BLOCK = type9;
            Type type10 = new Type("UNBLOCK", 9);
            UNBLOCK = type10;
            Type type11 = new Type("DELETE", 10);
            DELETE = type11;
            Type type12 = new Type("DELETE_ALL_QUESTIONS", 11);
            DELETE_ALL_QUESTIONS = type12;
            Type type13 = new Type("MESSAGE_SENT_AGAIN", 12);
            MESSAGE_SENT_AGAIN = type13;
            Type type14 = new Type("GO_TO_CHAT", 13);
            GO_TO_CHAT = type14;
            Type type15 = new Type("MESSAGE_SENT", 14);
            MESSAGE_SENT = type15;
            Type type16 = new Type("CANCEL_DELETE", 15);
            CANCEL_DELETE = type16;
            Type type17 = new Type("RESTORE", 16);
            RESTORE = type17;
            Type type18 = new Type("NEXT", 17);
            NEXT = type18;
            Type type19 = new Type("CLOSE", 18);
            CLOSE = type19;
            Type type20 = new Type("CLICK_TO_SEND", 19);
            CLICK_TO_SEND = type20;
            Type type21 = new Type("SEND_QUESTION", 20);
            SEND_QUESTION = type21;
            Type type22 = new Type("CANCEL_SEND_QUESTION", 21);
            CANCEL_SEND_QUESTION = type22;
            Type type23 = new Type("SHARING", 22);
            SHARING = type23;
            Type type24 = new Type("SHARE_TO_STORY", 23);
            SHARE_TO_STORY = type24;
            Type type25 = new Type("SHARE_TO_STORY_CLICK", 24);
            SHARE_TO_STORY_CLICK = type25;
            Type type26 = new Type("SHARE_TO_WALL", 25);
            SHARE_TO_WALL = type26;
            Type type27 = new Type("SHARE_TO_WALL_CLICK", 26);
            SHARE_TO_WALL_CLICK = type27;
            Type type28 = new Type("SHARE_TO_IM", 27);
            SHARE_TO_IM = type28;
            Type type29 = new Type("SHARE_TO_IM_CLICK", 28);
            SHARE_TO_IM_CLICK = type29;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29};
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

    public SchemeStat$TypeQuestionItem(Type type, Long l, Long l2, String str, Long l3, Boolean bool, Boolean bool2) {
        this.type = type;
        this.questionReceiverId = l;
        this.questionAuthorId = l2;
        this.questionText = str;
        this.questionId = l3;
        this.canAskAnonymous = bool;
        this.questionPrivacy = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeQuestionItem)) {
            return false;
        }
        SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem = (SchemeStat$TypeQuestionItem) obj;
        return this.type == schemeStat$TypeQuestionItem.type && epx.f(this.questionReceiverId, schemeStat$TypeQuestionItem.questionReceiverId) && epx.f(this.questionAuthorId, schemeStat$TypeQuestionItem.questionAuthorId) && epx.f(this.questionText, schemeStat$TypeQuestionItem.questionText) && epx.f(this.questionId, schemeStat$TypeQuestionItem.questionId) && epx.f(this.canAskAnonymous, schemeStat$TypeQuestionItem.canAskAnonymous) && epx.f(this.questionPrivacy, schemeStat$TypeQuestionItem.questionPrivacy);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Long l = this.questionReceiverId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.questionAuthorId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.questionText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.questionId;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.canAskAnonymous;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.questionPrivacy;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeQuestionItem(type=");
        sb.append(this.type);
        sb.append(", questionReceiverId=");
        sb.append(this.questionReceiverId);
        sb.append(", questionAuthorId=");
        sb.append(this.questionAuthorId);
        sb.append(", questionText=");
        sb.append(this.questionText);
        sb.append(", questionId=");
        sb.append(this.questionId);
        sb.append(", canAskAnonymous=");
        sb.append(this.canAskAnonymous);
        sb.append(", questionPrivacy=");
        return tn.a(sb, this.questionPrivacy, ')');
    }

    public /* synthetic */ SchemeStat$TypeQuestionItem(Type type, Long l, Long l2, String str, Long l3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }
}
