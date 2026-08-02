package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeDialogItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("additional_action")
    private final AdditionalAction additionalAction;

    @pmi0("dialog_action")
    private final DialogAction dialogAction;

    @pmi0("dialog_item")
    private final DialogItem dialogItem;

    @pmi0("dialog_permissions")
    private final List<SchemeStat$TypeDialogPermission> dialogPermissions;

    @pmi0("is_legal_dialog_permission")
    private final Boolean isLegalDialogPermission;

    @pmi0("source_item")
    private final SchemeStat$EventItem sourceItem;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    @pmi0("type_mini_app_item")
    private final SchemeStat$TypeMiniAppItem typeMiniAppItem;

    @pmi0("type_worki_snippet_item")
    private final SchemeStat$TypeWorkiSnippetItem typeWorkiSnippetItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class AdditionalAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdditionalAction[] $VALUES;

        @pmi0("type_mini_app_item")
        public static final AdditionalAction TYPE_MINI_APP_ITEM;

        @pmi0("type_worki_snippet_item")
        public static final AdditionalAction TYPE_WORKI_SNIPPET_ITEM;

        static {
            AdditionalAction additionalAction = new AdditionalAction("TYPE_MINI_APP_ITEM", 0);
            TYPE_MINI_APP_ITEM = additionalAction;
            AdditionalAction additionalAction2 = new AdditionalAction("TYPE_WORKI_SNIPPET_ITEM", 1);
            TYPE_WORKI_SNIPPET_ITEM = additionalAction2;
            AdditionalAction[] additionalActionArr = {additionalAction, additionalAction2};
            $VALUES = additionalActionArr;
            $ENTRIES = new asp(additionalActionArr);
        }

        private AdditionalAction(String str, int i) {
        }

        public static AdditionalAction valueOf(String str) {
            return (AdditionalAction) Enum.valueOf(AdditionalAction.class, str);
        }

        public static AdditionalAction[] values() {
            return (AdditionalAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class DialogAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogAction[] $VALUES;

        @pmi0("cancel")
        public static final DialogAction CANCEL;

        @pmi0("confirm")
        public static final DialogAction CONFIRM;

        @pmi0("dismiss")
        public static final DialogAction DISMISS;

        @pmi0("show")
        public static final DialogAction SHOW;

        static {
            DialogAction dialogAction = new DialogAction("SHOW", 0);
            SHOW = dialogAction;
            DialogAction dialogAction2 = new DialogAction("DISMISS", 1);
            DISMISS = dialogAction2;
            DialogAction dialogAction3 = new DialogAction("CONFIRM", 2);
            CONFIRM = dialogAction3;
            DialogAction dialogAction4 = new DialogAction("CANCEL", 3);
            CANCEL = dialogAction4;
            DialogAction[] dialogActionArr = {dialogAction, dialogAction2, dialogAction3, dialogAction4};
            $VALUES = dialogActionArr;
            $ENTRIES = new asp(dialogActionArr);
        }

        private DialogAction(String str, int i) {
        }

        public static DialogAction valueOf(String str) {
            return (DialogAction) Enum.valueOf(DialogAction.class, str);
        }

        public static DialogAction[] values() {
            return (DialogAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class DialogItem {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogItem[] $VALUES;

        @pmi0("acceptance")
        public static final DialogItem ACCEPTANCE;

        @pmi0("add_video")
        public static final DialogItem ADD_VIDEO;

        @pmi0("agreement")
        public static final DialogItem AGREEMENT;

        @pmi0("comment_actions")
        public static final DialogItem COMMENT_ACTIONS;

        @pmi0("community_invitation_decline")
        public static final DialogItem COMMUNITY_INVITATION_DECLINE;

        @pmi0("community_leave")
        public static final DialogItem COMMUNITY_LEAVE;

        @pmi0("confirmation")
        public static final DialogItem CONFIRMATION;

        @pmi0("delete_album")
        public static final DialogItem DELETE_ALBUM;

        @pmi0("delete_playlist_confirmation")
        public static final DialogItem DELETE_PLAYLIST_CONFIRMATION;

        @pmi0("delete_profile_photo_confirmation")
        public static final DialogItem DELETE_PROFILE_PHOTO_CONFIRMATION;

        @pmi0("delete_story_confirmation")
        public static final DialogItem DELETE_STORY_CONFIRMATION;

        @pmi0("delete_stream_confirmation")
        public static final DialogItem DELETE_STREAM_CONFIRMATION;

        @pmi0("document_actions")
        public static final DialogItem DOCUMENT_ACTIONS;

        @pmi0("document_delete_confirmation")
        public static final DialogItem DOCUMENT_DELETE_CONFIRMATION;

        @pmi0("fave_create_tag")
        public static final DialogItem FAVE_CREATE_TAG;

        @pmi0("friends_lists_selection")
        public static final DialogItem FRIENDS_LISTS_SELECTION;

        @pmi0("friends_profile_actions")
        public static final DialogItem FRIENDS_PROFILE_ACTIONS;

        @pmi0("friends_requests_add_confirmation")
        public static final DialogItem FRIENDS_REQUESTS_ADD_CONFIRMATION;

        @pmi0("games_close")
        public static final DialogItem GAMES_CLOSE;

        @pmi0("gift_delete_confirmation")
        public static final DialogItem GIFT_DELETE_CONFIRMATION;

        @pmi0("im_dialog_actions")
        public static final DialogItem IM_DIALOG_ACTIONS;

        @pmi0("im_dialog_clear_history_confirmation")
        public static final DialogItem IM_DIALOG_CLEAR_HISTORY_CONFIRMATION;

        @pmi0("im_dialog_leave_confirmation")
        public static final DialogItem IM_DIALOG_LEAVE_CONFIRMATION;

        @pmi0("im_dialog_show_previous_messages")
        public static final DialogItem IM_DIALOG_SHOW_PREVIOUS_MESSAGES;

        @pmi0("im_logout_confirmation")
        public static final DialogItem IM_LOGOUT_CONFIRMATION;

        @pmi0("im_msg_actions")
        public static final DialogItem IM_MSG_ACTIONS;

        @pmi0("im_msg_delete_confirmation")
        public static final DialogItem IM_MSG_DELETE_CONFIRMATION;

        @pmi0("im_msg_mark_as_spam_confirmation")
        public static final DialogItem IM_MSG_MARK_AS_SPAM_CONFIRMATION;

        @pmi0("leave_stream_confirmation")
        public static final DialogItem LEAVE_STREAM_CONFIRMATION;

        @pmi0("logout_confirmation")
        public static final DialogItem LOGOUT_CONFIRMATION;

        @pmi0("mini_apps_action_menu")
        public static final DialogItem MINI_APPS_ACTION_MENU;

        @pmi0("nowhere")
        public static final DialogItem NOWHERE;

        @pmi0("permission")
        public static final DialogItem PERMISSION;

        @pmi0("photo_picker")
        public static final DialogItem PHOTO_PICKER;

        @pmi0("posting_time")
        public static final DialogItem POSTING_TIME;

        @pmi0("privacy_friends_categories")
        public static final DialogItem PRIVACY_FRIENDS_CATEGORIES;

        @pmi0("profile_add_friends")
        public static final DialogItem PROFILE_ADD_FRIENDS;

        @pmi0("profile_avatar_menu")
        public static final DialogItem PROFILE_AVATAR_MENU;

        @pmi0("profile_change_status")
        public static final DialogItem PROFILE_CHANGE_STATUS;

        @pmi0("profile_give_ban")
        public static final DialogItem PROFILE_GIVE_BAN;

        @pmi0("profile_photo_delete_confirmation")
        public static final DialogItem PROFILE_PHOTO_DELETE_CONFIRMATION;

        @pmi0("profile_remove_friend_confirmation")
        public static final DialogItem PROFILE_REMOVE_FRIEND_CONFIRMATION;

        @pmi0("remove_game_confirmation")
        public static final DialogItem REMOVE_GAME_CONFIRMATION;

        @pmi0("settings_account_change_password")
        public static final DialogItem SETTINGS_ACCOUNT_CHANGE_PASSWORD;

        @pmi0("settings_account_comments_order")
        public static final DialogItem SETTINGS_ACCOUNT_COMMENTS_ORDER;

        @pmi0("settings_account_community_commenting")
        public static final DialogItem SETTINGS_ACCOUNT_COMMUNITY_COMMENTING;

        @pmi0("settings_account_profile_post_types")
        public static final DialogItem SETTINGS_ACCOUNT_PROFILE_POST_TYPES;

        @pmi0("settings_account_sync_contacts")
        public static final DialogItem SETTINGS_ACCOUNT_SYNC_CONTACTS;

        @pmi0("settings_color_value")
        public static final DialogItem SETTINGS_COLOR_VALUE;

        @pmi0("settings_list_value")
        public static final DialogItem SETTINGS_LIST_VALUE;

        @pmi0("settings_notifications_community_disable")
        public static final DialogItem SETTINGS_NOTIFICATIONS_COMMUNITY_DISABLE;

        @pmi0("settings_notifications_do_not_disturb")
        public static final DialogItem SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB;

        @pmi0("settings_text_value")
        public static final DialogItem SETTINGS_TEXT_VALUE;

        @pmi0("story_actions")
        public static final DialogItem STORY_ACTIONS;

        @pmi0("superapp_widget_menu")
        public static final DialogItem SUPERAPP_WIDGET_MENU;

        @pmi0("topic_actions")
        public static final DialogItem TOPIC_ACTIONS;

        @pmi0("topic_create")
        public static final DialogItem TOPIC_CREATE;

        @pmi0("topic_delete")
        public static final DialogItem TOPIC_DELETE;

        @pmi0("topic_edit")
        public static final DialogItem TOPIC_EDIT;

        @pmi0("topic_jump_to_page")
        public static final DialogItem TOPIC_JUMP_TO_PAGE;

        @pmi0("video_background_watching_restriction")
        public static final DialogItem VIDEO_BACKGROUND_WATCHING_RESTRICTION;

        @pmi0("video_download_restriction")
        public static final DialogItem VIDEO_DOWNLOAD_RESTRICTION;

        @pmi0("video_usp_restriction")
        public static final DialogItem VIDEO_USP_RESTRICTION;

        @pmi0("voip_start_confirmation")
        public static final DialogItem VOIP_START_CONFIRMATION;

        static {
            DialogItem dialogItem = new DialogItem("NOWHERE", 0);
            NOWHERE = dialogItem;
            DialogItem dialogItem2 = new DialogItem("PERMISSION", 1);
            PERMISSION = dialogItem2;
            DialogItem dialogItem3 = new DialogItem("CONFIRMATION", 2);
            CONFIRMATION = dialogItem3;
            DialogItem dialogItem4 = new DialogItem("AGREEMENT", 3);
            AGREEMENT = dialogItem4;
            DialogItem dialogItem5 = new DialogItem("ACCEPTANCE", 4);
            ACCEPTANCE = dialogItem5;
            DialogItem dialogItem6 = new DialogItem("TOPIC_CREATE", 5);
            TOPIC_CREATE = dialogItem6;
            DialogItem dialogItem7 = new DialogItem("TOPIC_DELETE", 6);
            TOPIC_DELETE = dialogItem7;
            DialogItem dialogItem8 = new DialogItem("TOPIC_EDIT", 7);
            TOPIC_EDIT = dialogItem8;
            DialogItem dialogItem9 = new DialogItem("FRIENDS_REQUESTS_ADD_CONFIRMATION", 8);
            FRIENDS_REQUESTS_ADD_CONFIRMATION = dialogItem9;
            DialogItem dialogItem10 = new DialogItem("PHOTO_PICKER", 9);
            PHOTO_PICKER = dialogItem10;
            DialogItem dialogItem11 = new DialogItem("GAMES_CLOSE", 10);
            GAMES_CLOSE = dialogItem11;
            DialogItem dialogItem12 = new DialogItem("COMMUNITY_LEAVE", 11);
            COMMUNITY_LEAVE = dialogItem12;
            DialogItem dialogItem13 = new DialogItem("COMMUNITY_INVITATION_DECLINE", 12);
            COMMUNITY_INVITATION_DECLINE = dialogItem13;
            DialogItem dialogItem14 = new DialogItem("PROFILE_AVATAR_MENU", 13);
            PROFILE_AVATAR_MENU = dialogItem14;
            DialogItem dialogItem15 = new DialogItem("DELETE_PROFILE_PHOTO_CONFIRMATION", 14);
            DELETE_PROFILE_PHOTO_CONFIRMATION = dialogItem15;
            DialogItem dialogItem16 = new DialogItem("PROFILE_CHANGE_STATUS", 15);
            PROFILE_CHANGE_STATUS = dialogItem16;
            DialogItem dialogItem17 = new DialogItem("DELETE_ALBUM", 16);
            DELETE_ALBUM = dialogItem17;
            DialogItem dialogItem18 = new DialogItem("LEAVE_STREAM_CONFIRMATION", 17);
            LEAVE_STREAM_CONFIRMATION = dialogItem18;
            DialogItem dialogItem19 = new DialogItem("DELETE_STREAM_CONFIRMATION", 18);
            DELETE_STREAM_CONFIRMATION = dialogItem19;
            DialogItem dialogItem20 = new DialogItem("DELETE_PLAYLIST_CONFIRMATION", 19);
            DELETE_PLAYLIST_CONFIRMATION = dialogItem20;
            DialogItem dialogItem21 = new DialogItem("VOIP_START_CONFIRMATION", 20);
            VOIP_START_CONFIRMATION = dialogItem21;
            DialogItem dialogItem22 = new DialogItem("REMOVE_GAME_CONFIRMATION", 21);
            REMOVE_GAME_CONFIRMATION = dialogItem22;
            DialogItem dialogItem23 = new DialogItem("DELETE_STORY_CONFIRMATION", 22);
            DELETE_STORY_CONFIRMATION = dialogItem23;
            DialogItem dialogItem24 = new DialogItem("COMMENT_ACTIONS", 23);
            COMMENT_ACTIONS = dialogItem24;
            DialogItem dialogItem25 = new DialogItem("TOPIC_ACTIONS", 24);
            TOPIC_ACTIONS = dialogItem25;
            DialogItem dialogItem26 = new DialogItem("GIFT_DELETE_CONFIRMATION", 25);
            GIFT_DELETE_CONFIRMATION = dialogItem26;
            DialogItem dialogItem27 = new DialogItem("DOCUMENT_DELETE_CONFIRMATION", 26);
            DOCUMENT_DELETE_CONFIRMATION = dialogItem27;
            DialogItem dialogItem28 = new DialogItem("DOCUMENT_ACTIONS", 27);
            DOCUMENT_ACTIONS = dialogItem28;
            DialogItem dialogItem29 = new DialogItem("PROFILE_PHOTO_DELETE_CONFIRMATION", 28);
            PROFILE_PHOTO_DELETE_CONFIRMATION = dialogItem29;
            DialogItem dialogItem30 = new DialogItem("TOPIC_JUMP_TO_PAGE", 29);
            TOPIC_JUMP_TO_PAGE = dialogItem30;
            DialogItem dialogItem31 = new DialogItem("POSTING_TIME", 30);
            POSTING_TIME = dialogItem31;
            DialogItem dialogItem32 = new DialogItem("PRIVACY_FRIENDS_CATEGORIES", 31);
            PRIVACY_FRIENDS_CATEGORIES = dialogItem32;
            DialogItem dialogItem33 = new DialogItem("PROFILE_ADD_FRIENDS", 32);
            PROFILE_ADD_FRIENDS = dialogItem33;
            DialogItem dialogItem34 = new DialogItem("PROFILE_REMOVE_FRIEND_CONFIRMATION", 33);
            PROFILE_REMOVE_FRIEND_CONFIRMATION = dialogItem34;
            DialogItem dialogItem35 = new DialogItem("PROFILE_GIVE_BAN", 34);
            PROFILE_GIVE_BAN = dialogItem35;
            DialogItem dialogItem36 = new DialogItem("SETTINGS_ACCOUNT_CHANGE_PASSWORD", 35);
            SETTINGS_ACCOUNT_CHANGE_PASSWORD = dialogItem36;
            DialogItem dialogItem37 = new DialogItem("SETTINGS_ACCOUNT_PROFILE_POST_TYPES", 36);
            SETTINGS_ACCOUNT_PROFILE_POST_TYPES = dialogItem37;
            DialogItem dialogItem38 = new DialogItem("SETTINGS_ACCOUNT_COMMUNITY_COMMENTING", 37);
            SETTINGS_ACCOUNT_COMMUNITY_COMMENTING = dialogItem38;
            DialogItem dialogItem39 = new DialogItem("SETTINGS_ACCOUNT_COMMENTS_ORDER", 38);
            SETTINGS_ACCOUNT_COMMENTS_ORDER = dialogItem39;
            DialogItem dialogItem40 = new DialogItem("SETTINGS_ACCOUNT_SYNC_CONTACTS", 39);
            SETTINGS_ACCOUNT_SYNC_CONTACTS = dialogItem40;
            DialogItem dialogItem41 = new DialogItem("SETTINGS_NOTIFICATIONS_COMMUNITY_DISABLE", 40);
            SETTINGS_NOTIFICATIONS_COMMUNITY_DISABLE = dialogItem41;
            DialogItem dialogItem42 = new DialogItem("SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB", 41);
            SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB = dialogItem42;
            DialogItem dialogItem43 = new DialogItem("SETTINGS_TEXT_VALUE", 42);
            SETTINGS_TEXT_VALUE = dialogItem43;
            DialogItem dialogItem44 = new DialogItem("SETTINGS_LIST_VALUE", 43);
            SETTINGS_LIST_VALUE = dialogItem44;
            DialogItem dialogItem45 = new DialogItem("SETTINGS_COLOR_VALUE", 44);
            SETTINGS_COLOR_VALUE = dialogItem45;
            DialogItem dialogItem46 = new DialogItem("STORY_ACTIONS", 45);
            STORY_ACTIONS = dialogItem46;
            DialogItem dialogItem47 = new DialogItem("SUPERAPP_WIDGET_MENU", 46);
            SUPERAPP_WIDGET_MENU = dialogItem47;
            DialogItem dialogItem48 = new DialogItem("ADD_VIDEO", 47);
            ADD_VIDEO = dialogItem48;
            DialogItem dialogItem49 = new DialogItem("FAVE_CREATE_TAG", 48);
            FAVE_CREATE_TAG = dialogItem49;
            DialogItem dialogItem50 = new DialogItem("FRIENDS_LISTS_SELECTION", 49);
            FRIENDS_LISTS_SELECTION = dialogItem50;
            DialogItem dialogItem51 = new DialogItem("FRIENDS_PROFILE_ACTIONS", 50);
            FRIENDS_PROFILE_ACTIONS = dialogItem51;
            DialogItem dialogItem52 = new DialogItem("LOGOUT_CONFIRMATION", 51);
            LOGOUT_CONFIRMATION = dialogItem52;
            DialogItem dialogItem53 = new DialogItem("IM_DIALOG_ACTIONS", 52);
            IM_DIALOG_ACTIONS = dialogItem53;
            DialogItem dialogItem54 = new DialogItem("IM_MSG_ACTIONS", 53);
            IM_MSG_ACTIONS = dialogItem54;
            DialogItem dialogItem55 = new DialogItem("IM_DIALOG_LEAVE_CONFIRMATION", 54);
            IM_DIALOG_LEAVE_CONFIRMATION = dialogItem55;
            DialogItem dialogItem56 = new DialogItem("IM_DIALOG_CLEAR_HISTORY_CONFIRMATION", 55);
            IM_DIALOG_CLEAR_HISTORY_CONFIRMATION = dialogItem56;
            DialogItem dialogItem57 = new DialogItem("IM_MSG_DELETE_CONFIRMATION", 56);
            IM_MSG_DELETE_CONFIRMATION = dialogItem57;
            DialogItem dialogItem58 = new DialogItem("IM_MSG_MARK_AS_SPAM_CONFIRMATION", 57);
            IM_MSG_MARK_AS_SPAM_CONFIRMATION = dialogItem58;
            DialogItem dialogItem59 = new DialogItem("IM_DIALOG_SHOW_PREVIOUS_MESSAGES", 58);
            IM_DIALOG_SHOW_PREVIOUS_MESSAGES = dialogItem59;
            DialogItem dialogItem60 = new DialogItem("IM_LOGOUT_CONFIRMATION", 59);
            IM_LOGOUT_CONFIRMATION = dialogItem60;
            DialogItem dialogItem61 = new DialogItem("MINI_APPS_ACTION_MENU", 60);
            MINI_APPS_ACTION_MENU = dialogItem61;
            DialogItem dialogItem62 = new DialogItem("VIDEO_BACKGROUND_WATCHING_RESTRICTION", 61);
            VIDEO_BACKGROUND_WATCHING_RESTRICTION = dialogItem62;
            DialogItem dialogItem63 = new DialogItem("VIDEO_DOWNLOAD_RESTRICTION", 62);
            VIDEO_DOWNLOAD_RESTRICTION = dialogItem63;
            DialogItem dialogItem64 = new DialogItem("VIDEO_USP_RESTRICTION", 63);
            VIDEO_USP_RESTRICTION = dialogItem64;
            DialogItem[] dialogItemArr = {dialogItem, dialogItem2, dialogItem3, dialogItem4, dialogItem5, dialogItem6, dialogItem7, dialogItem8, dialogItem9, dialogItem10, dialogItem11, dialogItem12, dialogItem13, dialogItem14, dialogItem15, dialogItem16, dialogItem17, dialogItem18, dialogItem19, dialogItem20, dialogItem21, dialogItem22, dialogItem23, dialogItem24, dialogItem25, dialogItem26, dialogItem27, dialogItem28, dialogItem29, dialogItem30, dialogItem31, dialogItem32, dialogItem33, dialogItem34, dialogItem35, dialogItem36, dialogItem37, dialogItem38, dialogItem39, dialogItem40, dialogItem41, dialogItem42, dialogItem43, dialogItem44, dialogItem45, dialogItem46, dialogItem47, dialogItem48, dialogItem49, dialogItem50, dialogItem51, dialogItem52, dialogItem53, dialogItem54, dialogItem55, dialogItem56, dialogItem57, dialogItem58, dialogItem59, dialogItem60, dialogItem61, dialogItem62, dialogItem63, dialogItem64};
            $VALUES = dialogItemArr;
            $ENTRIES = new asp(dialogItemArr);
        }

        private DialogItem(String str, int i) {
        }

        public static DialogItem valueOf(String str) {
            return (DialogItem) Enum.valueOf(DialogItem.class, str);
        }

        public static DialogItem[] values() {
            return (DialogItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeDialogItem(DialogItem dialogItem, DialogAction dialogAction, List<? extends SchemeStat$TypeDialogPermission> list, Boolean bool, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem, AdditionalAction additionalAction, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeWorkiSnippetItem schemeStat$TypeWorkiSnippetItem) {
        this.dialogItem = dialogItem;
        this.dialogAction = dialogAction;
        this.dialogPermissions = list;
        this.isLegalDialogPermission = bool;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.sourceItem = schemeStat$EventItem;
        this.additionalAction = additionalAction;
        this.typeMiniAppItem = schemeStat$TypeMiniAppItem;
        this.typeWorkiSnippetItem = schemeStat$TypeWorkiSnippetItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeDialogItem)) {
            return false;
        }
        SchemeStat$TypeDialogItem schemeStat$TypeDialogItem = (SchemeStat$TypeDialogItem) obj;
        return this.dialogItem == schemeStat$TypeDialogItem.dialogItem && this.dialogAction == schemeStat$TypeDialogItem.dialogAction && epx.f(this.dialogPermissions, schemeStat$TypeDialogItem.dialogPermissions) && epx.f(this.isLegalDialogPermission, schemeStat$TypeDialogItem.isLegalDialogPermission) && this.sourceScreen == schemeStat$TypeDialogItem.sourceScreen && epx.f(this.sourceItem, schemeStat$TypeDialogItem.sourceItem) && this.additionalAction == schemeStat$TypeDialogItem.additionalAction && epx.f(this.typeMiniAppItem, schemeStat$TypeDialogItem.typeMiniAppItem) && epx.f(this.typeWorkiSnippetItem, schemeStat$TypeDialogItem.typeWorkiSnippetItem);
    }

    public final int hashCode() {
        int hashCode = this.dialogItem.hashCode() * 31;
        DialogAction dialogAction = this.dialogAction;
        int hashCode2 = (hashCode + (dialogAction == null ? 0 : dialogAction.hashCode())) * 31;
        List<SchemeStat$TypeDialogPermission> list = this.dialogPermissions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isLegalDialogPermission;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.sourceItem;
        int hashCode6 = (hashCode5 + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
        AdditionalAction additionalAction = this.additionalAction;
        int hashCode7 = (hashCode6 + (additionalAction == null ? 0 : additionalAction.hashCode())) * 31;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.typeMiniAppItem;
        int hashCode8 = (hashCode7 + (schemeStat$TypeMiniAppItem == null ? 0 : schemeStat$TypeMiniAppItem.hashCode())) * 31;
        SchemeStat$TypeWorkiSnippetItem schemeStat$TypeWorkiSnippetItem = this.typeWorkiSnippetItem;
        return hashCode8 + (schemeStat$TypeWorkiSnippetItem != null ? schemeStat$TypeWorkiSnippetItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDialogItem(dialogItem=" + this.dialogItem + ", dialogAction=" + this.dialogAction + ", dialogPermissions=" + this.dialogPermissions + ", isLegalDialogPermission=" + this.isLegalDialogPermission + ", sourceScreen=" + this.sourceScreen + ", sourceItem=" + this.sourceItem + ", additionalAction=" + this.additionalAction + ", typeMiniAppItem=" + this.typeMiniAppItem + ", typeWorkiSnippetItem=" + this.typeWorkiSnippetItem + ')';
    }

    public /* synthetic */ SchemeStat$TypeDialogItem(DialogItem dialogItem, DialogAction dialogAction, List list, Boolean bool, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem, AdditionalAction additionalAction, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, SchemeStat$TypeWorkiSnippetItem schemeStat$TypeWorkiSnippetItem, int i, zcl zclVar) {
        this(dialogItem, (i & 2) != 0 ? null : dialogAction, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 32) != 0 ? null : schemeStat$EventItem, (i & 64) != 0 ? null : additionalAction, (i & 128) != 0 ? null : schemeStat$TypeMiniAppItem, (i & 256) != 0 ? null : schemeStat$TypeWorkiSnippetItem);
    }
}
