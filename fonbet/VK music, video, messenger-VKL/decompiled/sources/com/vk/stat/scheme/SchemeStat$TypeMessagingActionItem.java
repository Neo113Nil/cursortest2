package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMessagingActionItem implements SchemeStat$TypeAction.b {

    @pmi0("action_type")
    private final ActionType actionType;

    @pmi0("attachments")
    private final List<MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment> attachments;

    @pmi0("chat_type")
    private final ChatType chatType;

    @pmi0("conversation_id")
    private final Long conversationId;

    @pmi0("conversation_message_id")
    private final Long conversationMessageId;

    @pmi0("entry_point")
    private final String entryPoint;

    @pmi0("formatted_types")
    private final List<String> formattedTypes;

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("is_formatted")
    private final Boolean isFormatted;

    @pmi0("is_story_on")
    private final Boolean isStoryOn;

    @pmi0("label")
    private final String label;

    @pmi0("peer_id")
    private final Integer peerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @pmi0("attempt_to_react")
        public static final ActionType ATTEMPT_TO_REACT;

        @pmi0("BUTTON_CREATE_CHANNEL")
        public static final ActionType BUTTON_CREATE_CHANNEL;

        @pmi0("BUTTON_START_WRITING")
        public static final ActionType BUTTON_START_WRITING;

        @pmi0("cancel_delete_channel")
        public static final ActionType CANCEL_DELETE_CHANNEL;

        @pmi0("cancel_leave_channel")
        public static final ActionType CANCEL_LEAVE_CHANNEL;

        @pmi0("change_donut")
        public static final ActionType CHANGE_DONUT;

        @pmi0("CHANGE_STORY")
        public static final ActionType CHANGE_STORY;

        @pmi0("CHANNEL_CLICK_ON_LINK_FROM_POST")
        public static final ActionType CHANNEL_CLICK_ON_LINK_FROM_POST;

        @pmi0("CHANNEL_GO_TO_FULLSCREEN_POSTING")
        public static final ActionType CHANNEL_GO_TO_FULLSCREEN_POSTING;

        @pmi0("CHANNEL_POST_DONUT_SUB_CLICK")
        public static final ActionType CHANNEL_POST_DONUT_SUB_CLICK;

        @pmi0("CHOOSE_AVATAR_PERSONAL_CHANNEL")
        public static final ActionType CHOOSE_AVATAR_PERSONAL_CHANNEL;

        @pmi0("click_do_you_wanna_reply_chat")
        public static final ActionType CLICK_DO_YOU_WANNA_REPLY_CHAT;

        @pmi0("CLICK_ON_MAKE_CHANNEL_FROM")
        public static final ActionType CLICK_ON_MAKE_CHANNEL_FROM;

        @pmi0("CLICK_ON_SETTINGS")
        public static final ActionType CLICK_ON_SETTINGS;

        @pmi0("CLOSE_TOOLTIP")
        public static final ActionType CLOSE_TOOLTIP;

        @pmi0("counter_community_onboarding")
        public static final ActionType COUNTER_COMMUNITY_ONBOARDING;

        @pmi0("CREATE_CHAT")
        public static final ActionType CREATE_CHAT;

        @pmi0("create_draft_message")
        public static final ActionType CREATE_DRAFT_MESSAGE;

        @pmi0("delete_draft_message")
        public static final ActionType DELETE_DRAFT_MESSAGE;

        @pmi0("disable_comments_channel")
        public static final ActionType DISABLE_COMMENTS_CHANNEL;

        @pmi0("disable_notifications_channel")
        public static final ActionType DISABLE_NOTIFICATIONS_CHANNEL;

        @pmi0("enable_comments_channel")
        public static final ActionType ENABLE_COMMENTS_CHANNEL;

        @pmi0("enable_notifications_channel")
        public static final ActionType ENABLE_NOTIFICATIONS_CHANNEL;

        @pmi0("find_clip_in_response")
        public static final ActionType FIND_CLIP_IN_RESPONSE;

        @pmi0("im_channel_entry_donut_click")
        public static final ActionType IM_CHANNEL_ENTRY_DONUT_CLICK;

        @pmi0("im_channel_entry_show")
        public static final ActionType IM_CHANNEL_ENTRY_SHOW;

        @pmi0("im_profile_channel_donut_click")
        public static final ActionType IM_PROFILE_CHANNEL_DONUT_CLICK;

        @pmi0("INVITES_SENT_PERSONAL_CHANNEL")
        public static final ActionType INVITES_SENT_PERSONAL_CHANNEL;

        @pmi0("open_community_chats")
        public static final ActionType OPEN_COMMUNITY_CHATS;

        @pmi0("open_folder")
        public static final ActionType OPEN_FOLDER;

        @pmi0("send_draft_message")
        public static final ActionType SEND_DRAFT_MESSAGE;

        @pmi0("show_do_you_wanna_reply_chat")
        public static final ActionType SHOW_DO_YOU_WANNA_REPLY_CHAT;

        @pmi0("SHOW_TOOLTIP")
        public static final ActionType SHOW_TOOLTIP;

        @pmi0("sticker_menu_show_duration")
        public static final ActionType STICKER_MENU_SHOW_DURATION;

        @pmi0("tab_bar_context_menu_archive")
        public static final ActionType TAB_BAR_CONTEXT_MENU_ARCHIVE;

        @pmi0("tab_bar_context_menu_channels")
        public static final ActionType TAB_BAR_CONTEXT_MENU_CHANNELS;

        @pmi0("tab_bar_context_menu_favorites")
        public static final ActionType TAB_BAR_CONTEXT_MENU_FAVORITES;

        @pmi0("tab_bar_context_menu_folders")
        public static final ActionType TAB_BAR_CONTEXT_MENU_FOLDERS;

        @pmi0("tab_bar_context_menu_unread_messages")
        public static final ActionType TAB_BAR_CONTEXT_MENU_UNREAD_MESSAGES;

        @pmi0("watch_clip_again")
        public static final ActionType WATCH_CLIP_AGAIN;

        @pmi0("WRITE_TITLE_PERSONAL_CHANNEL")
        public static final ActionType WRITE_TITLE_PERSONAL_CHANNEL;

        static {
            ActionType actionType = new ActionType("CREATE_CHAT", 0);
            CREATE_CHAT = actionType;
            ActionType actionType2 = new ActionType("SHOW_TOOLTIP", 1);
            SHOW_TOOLTIP = actionType2;
            ActionType actionType3 = new ActionType("CLOSE_TOOLTIP", 2);
            CLOSE_TOOLTIP = actionType3;
            ActionType actionType4 = new ActionType("TAB_BAR_CONTEXT_MENU_FAVORITES", 3);
            TAB_BAR_CONTEXT_MENU_FAVORITES = actionType4;
            ActionType actionType5 = new ActionType("TAB_BAR_CONTEXT_MENU_CHANNELS", 4);
            TAB_BAR_CONTEXT_MENU_CHANNELS = actionType5;
            ActionType actionType6 = new ActionType("TAB_BAR_CONTEXT_MENU_FOLDERS", 5);
            TAB_BAR_CONTEXT_MENU_FOLDERS = actionType6;
            ActionType actionType7 = new ActionType("TAB_BAR_CONTEXT_MENU_ARCHIVE", 6);
            TAB_BAR_CONTEXT_MENU_ARCHIVE = actionType7;
            ActionType actionType8 = new ActionType("TAB_BAR_CONTEXT_MENU_UNREAD_MESSAGES", 7);
            TAB_BAR_CONTEXT_MENU_UNREAD_MESSAGES = actionType8;
            ActionType actionType9 = new ActionType("SHOW_DO_YOU_WANNA_REPLY_CHAT", 8);
            SHOW_DO_YOU_WANNA_REPLY_CHAT = actionType9;
            ActionType actionType10 = new ActionType("CLICK_DO_YOU_WANNA_REPLY_CHAT", 9);
            CLICK_DO_YOU_WANNA_REPLY_CHAT = actionType10;
            ActionType actionType11 = new ActionType("ATTEMPT_TO_REACT", 10);
            ATTEMPT_TO_REACT = actionType11;
            ActionType actionType12 = new ActionType("STICKER_MENU_SHOW_DURATION", 11);
            STICKER_MENU_SHOW_DURATION = actionType12;
            ActionType actionType13 = new ActionType("FIND_CLIP_IN_RESPONSE", 12);
            FIND_CLIP_IN_RESPONSE = actionType13;
            ActionType actionType14 = new ActionType("WATCH_CLIP_AGAIN", 13);
            WATCH_CLIP_AGAIN = actionType14;
            ActionType actionType15 = new ActionType("CREATE_DRAFT_MESSAGE", 14);
            CREATE_DRAFT_MESSAGE = actionType15;
            ActionType actionType16 = new ActionType("DELETE_DRAFT_MESSAGE", 15);
            DELETE_DRAFT_MESSAGE = actionType16;
            ActionType actionType17 = new ActionType("SEND_DRAFT_MESSAGE", 16);
            SEND_DRAFT_MESSAGE = actionType17;
            ActionType actionType18 = new ActionType("OPEN_COMMUNITY_CHATS", 17);
            OPEN_COMMUNITY_CHATS = actionType18;
            ActionType actionType19 = new ActionType("CANCEL_LEAVE_CHANNEL", 18);
            CANCEL_LEAVE_CHANNEL = actionType19;
            ActionType actionType20 = new ActionType("CANCEL_DELETE_CHANNEL", 19);
            CANCEL_DELETE_CHANNEL = actionType20;
            ActionType actionType21 = new ActionType("ENABLE_NOTIFICATIONS_CHANNEL", 20);
            ENABLE_NOTIFICATIONS_CHANNEL = actionType21;
            ActionType actionType22 = new ActionType("DISABLE_NOTIFICATIONS_CHANNEL", 21);
            DISABLE_NOTIFICATIONS_CHANNEL = actionType22;
            ActionType actionType23 = new ActionType("ENABLE_COMMENTS_CHANNEL", 22);
            ENABLE_COMMENTS_CHANNEL = actionType23;
            ActionType actionType24 = new ActionType("DISABLE_COMMENTS_CHANNEL", 23);
            DISABLE_COMMENTS_CHANNEL = actionType24;
            ActionType actionType25 = new ActionType("OPEN_FOLDER", 24);
            OPEN_FOLDER = actionType25;
            ActionType actionType26 = new ActionType("COUNTER_COMMUNITY_ONBOARDING", 25);
            COUNTER_COMMUNITY_ONBOARDING = actionType26;
            ActionType actionType27 = new ActionType("CLICK_ON_SETTINGS", 26);
            CLICK_ON_SETTINGS = actionType27;
            ActionType actionType28 = new ActionType("CLICK_ON_MAKE_CHANNEL_FROM", 27);
            CLICK_ON_MAKE_CHANNEL_FROM = actionType28;
            ActionType actionType29 = new ActionType("CHOOSE_AVATAR_PERSONAL_CHANNEL", 28);
            CHOOSE_AVATAR_PERSONAL_CHANNEL = actionType29;
            ActionType actionType30 = new ActionType("WRITE_TITLE_PERSONAL_CHANNEL", 29);
            WRITE_TITLE_PERSONAL_CHANNEL = actionType30;
            ActionType actionType31 = new ActionType("INVITES_SENT_PERSONAL_CHANNEL", 30);
            INVITES_SENT_PERSONAL_CHANNEL = actionType31;
            ActionType actionType32 = new ActionType("CHANNEL_POST_DONUT_SUB_CLICK", 31);
            CHANNEL_POST_DONUT_SUB_CLICK = actionType32;
            ActionType actionType33 = new ActionType("BUTTON_START_WRITING", 32);
            BUTTON_START_WRITING = actionType33;
            ActionType actionType34 = new ActionType("BUTTON_CREATE_CHANNEL", 33);
            BUTTON_CREATE_CHANNEL = actionType34;
            ActionType actionType35 = new ActionType("CHANGE_STORY", 34);
            CHANGE_STORY = actionType35;
            ActionType actionType36 = new ActionType("CHANNEL_CLICK_ON_LINK_FROM_POST", 35);
            CHANNEL_CLICK_ON_LINK_FROM_POST = actionType36;
            ActionType actionType37 = new ActionType("IM_CHANNEL_ENTRY_SHOW", 36);
            IM_CHANNEL_ENTRY_SHOW = actionType37;
            ActionType actionType38 = new ActionType("IM_CHANNEL_ENTRY_DONUT_CLICK", 37);
            IM_CHANNEL_ENTRY_DONUT_CLICK = actionType38;
            ActionType actionType39 = new ActionType("IM_PROFILE_CHANNEL_DONUT_CLICK", 38);
            IM_PROFILE_CHANNEL_DONUT_CLICK = actionType39;
            ActionType actionType40 = new ActionType("CHANGE_DONUT", 39);
            CHANGE_DONUT = actionType40;
            ActionType actionType41 = new ActionType("CHANNEL_GO_TO_FULLSCREEN_POSTING", 40);
            CHANNEL_GO_TO_FULLSCREEN_POSTING = actionType41;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13, actionType14, actionType15, actionType16, actionType17, actionType18, actionType19, actionType20, actionType21, actionType22, actionType23, actionType24, actionType25, actionType26, actionType27, actionType28, actionType29, actionType30, actionType31, actionType32, actionType33, actionType34, actionType35, actionType36, actionType37, actionType38, actionType39, actionType40, actionType41};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ChatType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChatType[] $VALUES;

        @pmi0("channel")
        public static final ChatType CHANNEL;

        @pmi0("community_channel")
        public static final ChatType COMMUNITY_CHANNEL;

        @pmi0("edu_channel")
        public static final ChatType EDU_CHANNEL;

        @pmi0("group")
        public static final ChatType GROUP;

        @pmi0("personal_channel")
        public static final ChatType PERSONAL_CHANNEL;

        static {
            ChatType chatType = new ChatType("CHANNEL", 0);
            CHANNEL = chatType;
            ChatType chatType2 = new ChatType("EDU_CHANNEL", 1);
            EDU_CHANNEL = chatType2;
            ChatType chatType3 = new ChatType("GROUP", 2);
            GROUP = chatType3;
            ChatType chatType4 = new ChatType("COMMUNITY_CHANNEL", 3);
            COMMUNITY_CHANNEL = chatType4;
            ChatType chatType5 = new ChatType("PERSONAL_CHANNEL", 4);
            PERSONAL_CHANNEL = chatType5;
            ChatType[] chatTypeArr = {chatType, chatType2, chatType3, chatType4, chatType5};
            $VALUES = chatTypeArr;
            $ENTRIES = new asp(chatTypeArr);
        }

        private ChatType(String str, int i) {
        }

        public static ChatType valueOf(String str) {
            return (ChatType) Enum.valueOf(ChatType.class, str);
        }

        public static ChatType[] values() {
            return (ChatType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMessagingActionItem(ActionType actionType, String str, Integer num, Long l, List<String> list, Long l2, Long l3, String str2, Boolean bool, ChatType chatType, Boolean bool2, List<MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment> list2) {
        this.actionType = actionType;
        this.entryPoint = str;
        this.peerId = num;
        this.groupId = l;
        this.formattedTypes = list;
        this.conversationId = l2;
        this.conversationMessageId = l3;
        this.label = str2;
        this.isStoryOn = bool;
        this.chatType = chatType;
        this.isFormatted = bool2;
        this.attachments = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMessagingActionItem)) {
            return false;
        }
        SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem = (SchemeStat$TypeMessagingActionItem) obj;
        return this.actionType == schemeStat$TypeMessagingActionItem.actionType && epx.f(this.entryPoint, schemeStat$TypeMessagingActionItem.entryPoint) && epx.f(this.peerId, schemeStat$TypeMessagingActionItem.peerId) && epx.f(this.groupId, schemeStat$TypeMessagingActionItem.groupId) && epx.f(this.formattedTypes, schemeStat$TypeMessagingActionItem.formattedTypes) && epx.f(this.conversationId, schemeStat$TypeMessagingActionItem.conversationId) && epx.f(this.conversationMessageId, schemeStat$TypeMessagingActionItem.conversationMessageId) && epx.f(this.label, schemeStat$TypeMessagingActionItem.label) && epx.f(this.isStoryOn, schemeStat$TypeMessagingActionItem.isStoryOn) && this.chatType == schemeStat$TypeMessagingActionItem.chatType && epx.f(this.isFormatted, schemeStat$TypeMessagingActionItem.isFormatted) && epx.f(this.attachments, schemeStat$TypeMessagingActionItem.attachments);
    }

    public final int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        String str = this.entryPoint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.peerId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.groupId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.formattedTypes;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.conversationId;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.conversationMessageId;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.label;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isStoryOn;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatType chatType = this.chatType;
        int hashCode10 = (hashCode9 + (chatType == null ? 0 : chatType.hashCode())) * 31;
        Boolean bool2 = this.isFormatted;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment> list2 = this.attachments;
        return hashCode11 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMessagingActionItem(actionType=");
        sb.append(this.actionType);
        sb.append(", entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", formattedTypes=");
        sb.append(this.formattedTypes);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationMessageId=");
        sb.append(this.conversationMessageId);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", isStoryOn=");
        sb.append(this.isStoryOn);
        sb.append(", chatType=");
        sb.append(this.chatType);
        sb.append(", isFormatted=");
        sb.append(this.isFormatted);
        sb.append(", attachments=");
        return ms9.a(')', sb, this.attachments);
    }

    public /* synthetic */ SchemeStat$TypeMessagingActionItem(ActionType actionType, String str, Integer num, Long l, List list, Long l2, Long l3, String str2, Boolean bool, ChatType chatType, Boolean bool2, List list2, int i, zcl zclVar) {
        this(actionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : chatType, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : list2);
    }
}
